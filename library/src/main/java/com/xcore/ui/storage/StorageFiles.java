package com.xcore.ui.storage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/** 同步文件操作工具，仅操作调用方已获授权的路径；耗时操作应在工作线程执行。 */
public final class StorageFiles {
    /** 便捷读取的默认上限为 16 MiB，避免大文件一次性载入内存。 */
    public static final int DEFAULT_READ_LIMIT = 16 * 1024 * 1024;
    private static final String TEMP_PREFIX = ".xh-storage-";

    private StorageFiles() {}

    @FunctionalInterface
    /** 原子写入回调；异常会中止提交，并保留已有目标文件。 */
    public interface Writer {
        /** 向工具类提供的输出流写入内容；流由工具类管理，回调不得关闭。 */
        void write(OutputStream output) throws IOException;
    }

    /** 在指定根目录下解析相对路径；空路径返回根目录，拒绝越界路径和已有符号链接。 */
    public static File resolve(File root, String relativePath) throws IOException {
        File current = root.getCanonicalFile();
        if (relativePath.isEmpty()) return current;
        for (String component : relativePath.split("/", -1)) {
            requireFileName(component);
            File child = new File(current, component);
            if (isLink(child)) throw new IOException("Symbolic link in storage path: " + child);
            current = child;
        }
        return current;
    }

    /** 校验单个路径分量，拒绝空白、目录分隔符、空字符和相对目录别名。 */
    static String requireFileName(String name) {
        if (name == null || name.trim().isEmpty() || name.equals(".") || name.equals("..")
                || name.indexOf('/') >= 0 || name.indexOf('\\') >= 0 || name.indexOf('\0') >= 0) {
            throw new IllegalArgumentException("Expected a single file name");
        }
        return name;
    }

    /** 确保目录及父目录存在；创建失败或目标已是普通文件时抛出 IOException。 */
    public static File ensureDirectory(File directory) throws IOException {
        if (!directory.isDirectory() && !directory.mkdirs() && !directory.isDirectory()) {
            throw new IOException("Cannot create directory: " + directory);
        }
        return directory;
    }

    /** 读取文件字节并自动关闭内部流；文件内容超过 maxBytes 时抛出 IOException。 */
    public static byte[] readBytes(File file, int maxBytes) throws IOException {
        try (InputStream input = new FileInputStream(file)) {
            return readBytes(input, maxBytes);
        }
    }

    /** 从输入流当前位置读取，最多允许 maxBytes 字节；超限抛出 IOException，不关闭输入流。 */
    public static byte[] readBytes(InputStream input, int maxBytes) throws IOException {
        if (maxBytes < 0) throw new IllegalArgumentException("maxBytes must be non-negative");
        ByteArrayOutputStream output = new ByteArrayOutputStream(Math.min(maxBytes, 8192));
        byte[] buffer = new byte[8192];
        int count;
        int remaining = maxBytes;
        // 最多额外探测一个字节，以区分“恰好达到上限”和“文件已超限”。
        while ((count = input.read(buffer, 0, (int) Math.min(buffer.length, (long) remaining + 1))) != -1) {
            if (count > remaining) throw new IOException("File exceeds read limit of " + maxBytes + " bytes");
            output.write(buffer, 0, count);
            remaining -= count;
        }
        return output.toByteArray();
    }

    /** 按 UTF-8 读取文本；maxBytes 限制原始字节数，不是字符数。 */
    public static String readText(File file, int maxBytes) throws IOException {
        return new String(readBytes(file, maxBytes), StandardCharsets.UTF_8);
    }

    /** 将文本编码为 UTF-8 后原子写入，自动创建父目录。 */
    public static void writeText(File file, String text) throws IOException {
        writeBytes(file, text.getBytes(StandardCharsets.UTF_8));
    }

    /** 原子写入原始字节，失败时保留目标原内容。 */
    public static void writeBytes(File file, byte[] bytes) throws IOException {
        writeAtomically(file, output -> output.write(bytes));
    }

    /** 先在同目录暂存并同步数据，再替换目标；写入失败保留原文件。 */
    public static void writeAtomically(File destination, Writer writer) throws IOException {
        stagedWrite(destination, writer, true);
    }

    /** 流式复制并返回复制字节数；输入和输出流均由调用方关闭。 */
    public static long transfer(InputStream input, OutputStream output) throws IOException {
        byte[] buffer = new byte[32 * 1024];
        long total = 0;
        int count;
        while ((count = input.read(buffer)) != -1) {
            output.write(buffer, 0, count);
            total += count;
        }
        return total;
    }

    /** 复制普通文件，自动创建父目录；目标已存在时失败，拒绝覆盖。 */
    public static void copy(File source, File destination) throws IOException {
        File original = source.getAbsoluteFile();
        requireRegularFile(original);
        stagedWrite(destination, output -> {
            try (InputStream input = new FileInputStream(original)) {
                transfer(input, output);
            }
        }, false);
    }

    /** 移动普通文件；跨文件系统时先复制再删除源，目标提交前保留源文件。 */
    public static void move(File source, File destination) throws IOException {
        File original = source.getAbsoluteFile();
        File target = destination.getAbsoluteFile();
        requireRegularFile(original);
        ensureDirectory(target.getParentFile());
        if (renameWithoutOverwrite(original, target)) return;
        copy(original, target);
        if (!original.delete()) {
            throw new IOException("Copied to " + target + " but could not remove source: " + original);
        }
    }

    /** 在原目录内重命名普通文件，拒绝覆盖；newName 必须为单个文件名。 */
    public static File rename(File source, String newName) throws IOException {
        File original = source.getAbsoluteFile();
        File destination = new File(original.getParentFile(), requireFileName(newName));
        if (!original.equals(destination)) move(original, destination);
        else requireRegularFile(original);
        return destination;
    }

    /** 按名称遍历文件及目录；递归模式跳过符号链接和内部暂存文件。 */
    public static List<File> list(File directory, boolean recursive) throws IOException {
        File root = directory.getAbsoluteFile();
        if (!root.isDirectory() || isLink(root)) throw new IOException("Not a directory: " + root);
        List<File> result = new ArrayList<>();
        collect(root, recursive, result);
        return result;
    }

    /** 递归按名称包含关系搜索，忽略大小写，结果包含匹配的文件和目录。 */
    public static List<File> search(File directory, String nameContains) throws IOException {
        String query = nameContains.toLowerCase(Locale.ROOT);
        List<File> matches = list(directory, true);
        matches.removeIf(file -> !file.getName().toLowerCase(Locale.ROOT).contains(query));
        return matches;
    }

    /** 统计普通文件或目录树的总字节数，跳过符号链接；无法读取目录时抛出 IOException。 */
    public static long size(File file) throws IOException {
        File target = file.getAbsoluteFile();
        if (isLink(target)) return 0;
        if (target.isFile()) return target.length();
        long total = 0;
        for (File entry : list(target, true)) {
            if (entry.isFile()) total += entry.length();
        }
        return total;
    }

    /** 删除文件或目录；递归删除只移除链接本身，不跟随链接；拒绝空路径和根目录。 */
    public static boolean delete(File file, boolean recursive) throws IOException {
        if (file.getPath().trim().isEmpty()) {
            throw new IOException("Refusing to delete an empty path");
        }
        File target = file.getAbsoluteFile();
        if (target.getParentFile() == null || target.getName().equals(".") || target.getName().equals("..")) {
            throw new IOException("Refusing to delete a filesystem root or relative directory alias");
        }
        if (target.isDirectory() && !isLink(target) && recursive) {
            for (File child : children(target)) delete(child, true);
        }
        // 悬空符号链接的 exists 为 false，但仍需调用 delete 删除链接本身。
        if (target.delete()) return true;
        if (target.exists() || isLink(target)) throw new IOException("Cannot delete: " + target);
        return false;
    }

    private static void collect(File directory, boolean recursive, List<File> result) throws IOException {
        File[] entries = children(directory);
        Arrays.sort(entries, Comparator.comparing(File::getName));
        for (File entry : entries) {
            if (isLink(entry) || entry.getName().startsWith(TEMP_PREFIX)) continue;
            result.add(entry);
            if (recursive && entry.isDirectory()) collect(entry, true, result);
        }
    }

    /** 统一处理目录读取失败，避免将无权限或 IO 故障误报为空目录。 */
    private static File[] children(File directory) throws IOException {
        File[] files = directory.listFiles();
        if (files == null) throw new IOException("Cannot list directory: " + directory);
        return files;
    }

    /** 先规范化父目录，再比较子项的规范路径，识别子项自身的符号链接。 */
    private static boolean isLink(File file) throws IOException {
        File parent = file.getParentFile();
        if (parent == null) return false;
        File child = new File(parent.getCanonicalFile(), file.getName());
        return !child.equals(child.getCanonicalFile());
    }

    /** 只允许普通文件作为复制或移动来源，拒绝目录和符号链接。 */
    private static void requireRegularFile(File file) throws IOException {
        if (!file.isFile() || isLink(file)) throw new IOException("Not a regular file: " + file);
    }

    /** 统一暂存与提交过程；replace 决定是否允许替换已有目标。 */
    private static void stagedWrite(File destination, Writer writer, boolean replace) throws IOException {
        Objects.requireNonNull(writer, "writer");
        File target = destination.getAbsoluteFile();
        if (target.getParentFile() == null || target.isDirectory() || isLink(target)) {
            throw new IOException("Invalid file destination: " + target);
        }
        File directory = ensureDirectory(target.getParentFile());
        File staging = File.createTempFile(TEMP_PREFIX, ".tmp", directory);
        try {
            try (FileOutputStream output = new FileOutputStream(staging)) {
                writer.write(output);
                output.flush();
                // 提交前同步文件数据；临时文件与目标同目录，避免替换时跨文件系统。
                output.getFD().sync();
            }
            boolean committed = replace ? staging.renameTo(target) : renameWithoutOverwrite(staging, target);
            if (!committed) throw new IOException("Cannot commit file: " + target);
        } catch (IOException | RuntimeException | Error failure) {
            if (!staging.delete() && staging.exists()) {
                failure.addSuppressed(new IOException("Cannot remove temporary file: " + staging));
            }
            throw failure;
        }
    }

    /** 先独占创建目标占位文件，再提交重命名；提交失败时清理本次占位。 */
    private static boolean renameWithoutOverwrite(File source, File destination) throws IOException {
        if (!destination.createNewFile()) throw new IOException("Destination already exists: " + destination);
        boolean renamed = false;
        try {
            renamed = source.renameTo(destination);
            return renamed;
        } finally {
            if (!renamed && !destination.delete() && destination.exists()) {
                throw new IOException("Cannot remove destination reservation: " + destination);
            }
        }
    }
}
