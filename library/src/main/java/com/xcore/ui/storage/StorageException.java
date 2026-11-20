package com.xcore.ui.storage;

/**
 * 旧接口的 IO 运行时异常，供未声明受检异常的兼容方法报告失败，并保留原始原因。
 */
public class StorageException extends RuntimeException {

    /**
     * 携带操作说明和原始异常，方便调用方定位兼容接口中的 IO 失败。
     */
    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
