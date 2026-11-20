uild starting...
Build image: default
Start: Fri Nov 20 07:20:48 UTC 2026 7ee2835ae668
Git:
1.0.6-0-g6e17901
commit 6e17901843dca8bb6288c617730f0006b4caaeca
Author: 1050104186@qq.com
Date:   Fri Nov 20 15:19:57 2026 +0800

    升级至1.0.6


Init SDKMan
Using JDK 8 (build.gradle)
Found Android manifest
Android SDK version: . Build tools:
Found gradle
Gradle build script
Gradle wrapper found
Init SDKMan
Found gradle version: 6.5.
Using gradle wrapper
Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8 -Dhttps.protocols=TLSv1.2
Downloading https://services.gradle.org/distributions/gradle-6.5-bin.zip
.
Unzipping /home/jitpack/.gradle/wrapper/dists/gradle-6.5-bin/6nifqtx7604sqp1q6g8wikw7p/gradle-6.5-bin.zip to /home/jitpack/.gradle/wrapper/dists/gradle-6.5-bin/6nifqtx7604sqp1q6g8wikw7p
Set executable permissions for: /home/jitpack/.gradle/wrapper/dists/gradle-6.5-bin/6nifqtx7604sqp1q6g8wikw7p/gradle-6.5/bin/gradle

------------------------------------------------------------
Gradle 6.5
------------------------------------------------------------

Build time:   2020-06-02 20:46:21 UTC
Revision:     a27f41e4ae5e8a41ab9b19f8dd6d86d7b384dad4

Kotlin:       1.3.72
Groovy:       2.5.11
Ant:          Apache Ant(TM) version 1.10.7 compiled on September 1 2019
JVM:          1.8.0_292 (Private Build 25.292-b10)
OS:           Linux 7.3.0-10-generic amd64

0m1.793s
Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8 -Dhttps.protocols=TLSv1.2
openjdk version "1.8.0_292"
OpenJDK Runtime Environment (build 1.8.0_292-8u292-b10-0ubuntu1~16.04.1-b10)
OpenJDK 64-Bit Server VM (build 25.292-b10, mixed mode)
Getting tasks: ./gradlew tasks --all
Found tasks
Tasks: install,

Running: ./gradlew clean -Pgroup=com.github.ycnao -Pversion=1.0.6 -xtest -xlint install --console=plain --info

Initialized native services in: /home/jitpack/.gradle/native
The client will now receive all logging from the daemon (pid: 243). The daemon log file: /home/jitpack/.gradle/daemon/6.5/daemon-243.out.log
Starting 2nd build in daemon [uptime: 26.406 secs, performance: 100%]
Using 12 worker leases.
Closing daemon's stdin at end of input.
The daemon will no longer process any standard input.
Starting Build
Settings evaluated using settings file '/home/jitpack/build/settings.gradle'.
Projects loaded. Root project using build file '/home/jitpack/build/build.gradle'.
Included projects: [root project 'xh-core-ui', project ':app', project ':library']

> Configure project :
Evaluating root project 'xh-core-ui' using build file '/home/jitpack/build/build.gradle'.

> Configure project :app
Evaluating project ':app' using build file '/home/jitpack/build/app/build.gradle'.
Creating configuration androidTestUtil
Warning: The 'kotlin-android-extensions' Gradle plugin is deprecated. Please use this migration guide (https://goo.gle/kotlin-android-extensions-deprecation) to start working with View Binding (https://developer.android.com/topic/libraries/view-binding) and the 'kotlin-parcelize' plugin.

> Configure project :library
Evaluating project ':library' using build file '/home/jitpack/build/library/build.gradle'.
Creating configuration androidTestUtil
WARNING: Configuration 'compile' is obsolete and has been replaced with 'implementation' and 'api'.
It will be removed in version 5.0 of the Android Gradle plugin.
For more information, see http://d.android.com/r/tools/update-dependency-configurations.html.
All projects evaluated.
Analytics other plugin to proto: Unknown plugin type org.jetbrains.kotlin.gradle.internal.AndroidSubplugin expected enum ORG_JETBRAINS_KOTLIN_GRADLE_INTERNAL_ANDROIDSUBPLUGIN
Selected primary task 'clean' from project :
Selected primary task 'install' from project :
Parsing /opt/android-sdk-linux/build-tools/28.0.0/package.xml
Parsing /opt/android-sdk-linux/extras/android/m2repository/package.xml
Parsing /opt/android-sdk-linux/extras/google/google_play_services/package.xml
Parsing /opt/android-sdk-linux/extras/google/m2repository/package.xml
Parsing /opt/android-sdk-linux/extras/m2repository/com/android/support/constraint/constraint-layout-solver/1.0.1/package.xml
Parsing /opt/android-sdk-linux/extras/m2repository/com/android/support/constraint/constraint-layout-solver/1.0.2/package.xml
Parsing /opt/android-sdk-linux/extras/m2repository/com/android/support/constraint/constraint-layout/1.0.1/package.xml
Parsing /opt/android-sdk-linux/extras/m2repository/com/android/support/constraint/constraint-layout/1.0.2/package.xml
Parsing /opt/android-sdk-linux/ndk-bundle/package.xml
Parsing /opt/android-sdk-linux/patcher/v4/package.xml
Parsing /opt/android-sdk-linux/platform-tools/package.xml
Parsing /opt/android-sdk-linux/tools/package.xml
Parsing /opt/android-sdk-linux/build-tools/28.0.0/package.xml
Parsing /opt/android-sdk-linux/extras/android/m2repository/package.xml
Parsing /opt/android-sdk-linux/extras/google/google_play_services/package.xml
Parsing /opt/android-sdk-linux/extras/google/m2repository/package.xml
Parsing /opt/android-sdk-linux/extras/m2repository/com/android/support/constraint/constraint-layout-solver/1.0.1/package.xml
Parsing /opt/android-sdk-linux/extras/m2repository/com/android/support/constraint/constraint-layout-solver/1.0.2/package.xml
Parsing /opt/android-sdk-linux/extras/m2repository/com/android/support/constraint/constraint-layout/1.0.1/package.xml
Parsing /opt/android-sdk-linux/extras/m2repository/com/android/support/constraint/constraint-layout/1.0.2/package.xml
Parsing /opt/android-sdk-linux/ndk-bundle/package.xml
Parsing /opt/android-sdk-linux/patcher/v4/package.xml
Parsing /opt/android-sdk-linux/platform-tools/package.xml
Parsing /opt/android-sdk-linux/tools/package.xml
File /opt/android-sdk-linux/.android/repositories.cfg could not be loaded.
Checking the license for package Android SDK Build-Tools 29.0.2 in /opt/android-sdk-linux/licenses
License for package Android SDK Build-Tools 29.0.2 accepted.
Preparing "Install Android SDK Build-Tools 29.0.2 (revision: 29.0.2)".
"Install Android SDK Build-Tools 29.0.2 (revision: 29.0.2)" ready.
Installing Android SDK Build-Tools 29.0.2 in /opt/android-sdk-linux/build-tools/29.0.2
"Install Android SDK Build-Tools 29.0.2 (revision: 29.0.2)" complete.
"Install Android SDK Build-Tools 29.0.2 (revision: 29.0.2)" finished.
Checking the license for package Android SDK Platform 31 in /opt/android-sdk-linux/licenses
License for package Android SDK Platform 31 accepted.
Preparing "Install Android SDK Platform 31 (revision: 1)".
"Install Android SDK Platform 31 (revision: 1)" ready.
Installing Android SDK Platform 31 in /opt/android-sdk-linux/platforms/android-31
"Install Android SDK Platform 31 (revision: 1)" complete.
"Install Android SDK Platform 31 (revision: 1)" finished.
Parsing /opt/android-sdk-linux/build-tools/28.0.0/package.xml
Parsing /opt/android-sdk-linux/build-tools/29.0.2/package.xml
Parsing /opt/android-sdk-linux/extras/android/m2repository/package.xml
Parsing /opt/android-sdk-linux/extras/google/google_play_services/package.xml
Parsing /opt/android-sdk-linux/extras/google/m2repository/package.xml
Parsing /opt/android-sdk-linux/extras/m2repository/com/android/support/constraint/constraint-layout-solver/1.0.1/package.xml
Parsing /opt/android-sdk-linux/extras/m2repository/com/android/support/constraint/constraint-layout-solver/1.0.2/package.xml
Parsing /opt/android-sdk-linux/extras/m2repository/com/android/support/constraint/constraint-layout/1.0.1/package.xml
Parsing /opt/android-sdk-linux/extras/m2repository/com/android/support/constraint/constraint-layout/1.0.2/package.xml
Parsing /opt/android-sdk-linux/ndk-bundle/package.xml
Parsing /opt/android-sdk-linux/patcher/v4/package.xml
Parsing /opt/android-sdk-linux/platform-tools/package.xml
Parsing /opt/android-sdk-linux/platforms/android-31/package.xml
Parsing /opt/android-sdk-linux/tools/package.xml
SDK initialized in 4483 ms
Configuring Java sources compilation with source level 1.8 and target level 1.8.
Configuring Java sources compilation with source level 1.8 and target level 1.8.
Tasks to be executed: [task ':clean', task ':app:clean', task ':library:clean', task ':library:preBuild', task ':library:preDebugBuild', task ':library:compileDebugAidl', task ':library:mergeDebugJniLibFolders', task ':library:mergeDebugNativeLibs', task ':library:stripDebugDebugSymbols', task ':library:copyDebugJniLibsProjectAndLocalJars', task ':library:compileDebugRenderscript', task ':library:generateDebugBuildConfig', task ':library:generateDebugResValues', task ':library:generateDebugResources', task ':library:packageDebugResources', task ':library:parseDebugLocalResources', task ':library:processDebugManifest', task ':library:generateDebugRFile', task ':library:compileDebugKotlin', task ':library:javaPreCompileDebug', task ':library:compileDebugJavaWithJavac', task ':library:extractDebugAnnotations', task ':library:mergeDebugGeneratedProguardFiles', task ':library:mergeDebugConsumerProguardFiles', task ':library:mergeDebugShaders', task ':library:compileDebugShaders', task ':library:generateDebugAssets', task ':library:packageDebugAssets', task ':library:packageDebugRenderscript', task ':library:prepareLintJarForPublish', task ':library:processDebugJavaRes', task ':library:mergeDebugJavaResource', task ':library:syncDebugLibJars', task ':library:writeDebugAarMetadata', task ':library:bundleDebugAar', task ':library:preReleaseBuild', task ':library:compileReleaseAidl', task ':library:mergeReleaseJniLibFolders', task ':library:mergeReleaseNativeLibs', task ':library:stripReleaseDebugSymbols', task ':library:copyReleaseJniLibsProjectAndLocalJars', task ':library:compileReleaseRenderscript', task ':library:generateReleaseBuildConfig', task ':library:generateReleaseResValues', task ':library:generateReleaseResources', task ':library:packageReleaseResources', task ':library:parseReleaseLocalResources', task ':library:processReleaseManifest', task ':library:generateReleaseRFile', task ':library:compileReleaseKotlin', task ':library:javaPreCompileRelease', task ':library:compileReleaseJavaWithJavac', task ':library:extractReleaseAnnotations', task ':library:mergeReleaseGeneratedProguardFiles', task ':library:mergeReleaseConsumerProguardFiles', task ':library:mergeReleaseShaders', task ':library:compileReleaseShaders', task ':library:generateReleaseAssets', task ':library:packageReleaseAssets', task ':library:packageReleaseRenderscript', task ':library:processReleaseJavaRes', task ':library:mergeReleaseJavaResource', task ':library:syncReleaseLibJars', task ':library:writeReleaseAarMetadata', task ':library:bundleReleaseAar', task ':library:install']
Tasks that were excluded: []
:clean (Thread[Execution worker for ':',5,main]) started.

> Task :clean UP-TO-DATE
Task :clean in app Starting
Caching disabled for task ':clean' because:
  Build cache is disabled
Task ':clean' is not up-to-date because:
  Task has not declared any outputs despite executing actions.
Task :clean in app Finished
:clean (Thread[Execution worker for ':',5,main]) completed. Took 0.002 secs.
:app:clean (Thread[Execution worker for ':',5,main]) started.

> Task :app:clean UP-TO-DATE
Task :app:clean in app Starting
Caching disabled for task ':app:clean' because:
  Build cache is disabled
Task ':app:clean' is not up-to-date because:
  Task has not declared any outputs despite executing actions.
Task :app:clean in app Finished
:app:clean (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:clean (Thread[Execution worker for ':',5,main]) started.

> Task :library:clean UP-TO-DATE
Task :library:clean in app Starting
Caching disabled for task ':library:clean' because:
  Build cache is disabled
Task ':library:clean' is not up-to-date because:
  Task has not declared any outputs despite executing actions.
Task :library:clean in app Finished
:library:clean (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:preBuild (Thread[Execution worker for ':',5,main]) started.

> Task :library:preBuild UP-TO-DATE
Task :library:preBuild in app Starting
Skipping task ':library:preBuild' as it has no actions.
Task :library:preBuild in app Finished
:library:preBuild (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:preDebugBuild (Thread[Execution worker for ':',5,main]) started.

> Task :library:preDebugBuild UP-TO-DATE
Task :library:preDebugBuild in app Starting
Skipping task ':library:preDebugBuild' as it has no actions.
Task :library:preDebugBuild in app Finished
:library:preDebugBuild (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:compileDebugAidl (Thread[Execution worker for ':',5,main]) started.

> Task :library:compileDebugAidl NO-SOURCE
Task :library:compileDebugAidl in app Starting
file or directory '/home/jitpack/build/library/src/main/aidl', not found
file or directory '/home/jitpack/build/library/src/debug/aidl', not found
Skipping task ':library:compileDebugAidl' as it has no source files and no previous output files.
Task :library:compileDebugAidl in app Finished
:library:compileDebugAidl (Thread[Execution worker for ':',5,main]) completed. Took 0.005 secs.
:library:mergeDebugJniLibFolders (Thread[Execution worker for ':',5,main]) started.

> Task :library:mergeDebugJniLibFolders
Task :library:mergeDebugJniLibFolders in app Starting
Caching disabled for task ':library:mergeDebugJniLibFolders' because:
  Build cache is disabled
Task ':library:mergeDebugJniLibFolders' is not up-to-date because:
  No history is available.
The input changes require a full rebuild for incremental task ':library:mergeDebugJniLibFolders'.
Unable do incremental execution: full task run
Task :library:mergeDebugJniLibFolders in app Finished
:library:mergeDebugJniLibFolders (Thread[Execution worker for ':',5,main]) completed. Took 0.014 secs.
:library:mergeDebugNativeLibs (Thread[Execution worker for ':',5,main]) started.

> Task :library:mergeDebugNativeLibs NO-SOURCE
Task :library:mergeDebugNativeLibs in app Starting
Skipping task ':library:mergeDebugNativeLibs' as it has no source files and no previous output files.
Task :library:mergeDebugNativeLibs in app Finished
:library:mergeDebugNativeLibs (Thread[Execution worker for ':',5,main]) completed. Took 0.001 secs.
:library:stripDebugDebugSymbols (Thread[Execution worker for ':',5,main]) started.

> Task :library:stripDebugDebugSymbols NO-SOURCE
Task :library:stripDebugDebugSymbols in app Starting
file or directory '/home/jitpack/build/library/build/intermediates/merged_native_libs/debug/out', not found
Skipping task ':library:stripDebugDebugSymbols' as it has no source files and no previous output files.
Task :library:stripDebugDebugSymbols in app Finished
:library:stripDebugDebugSymbols (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:copyDebugJniLibsProjectAndLocalJars (Thread[Execution worker for ':',5,main]) started.

> Task :library:copyDebugJniLibsProjectAndLocalJars
Task :library:copyDebugJniLibsProjectAndLocalJars in app Starting
Caching disabled for task ':library:copyDebugJniLibsProjectAndLocalJars' because:
  Build cache is disabled
Task ':library:copyDebugJniLibsProjectAndLocalJars' is not up-to-date because:
  No history is available.
Task :library:copyDebugJniLibsProjectAndLocalJars in app Finished
:library:copyDebugJniLibsProjectAndLocalJars (Thread[Execution worker for ':',5,main]) completed. Took 0.004 secs.
:library:compileDebugRenderscript (Thread[Execution worker for ':',5,main]) started.

> Task :library:compileDebugRenderscript NO-SOURCE
Task :library:compileDebugRenderscript in app Starting
file or directory '/home/jitpack/build/library/src/main/rs', not found
file or directory '/home/jitpack/build/library/src/debug/rs', not found
Skipping task ':library:compileDebugRenderscript' as it has no source files and no previous output files.
Task :library:compileDebugRenderscript in app Finished
:library:compileDebugRenderscript (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:generateDebugBuildConfig (Thread[Execution worker for ':',5,main]) started.

> Task :library:generateDebugBuildConfig
Task :library:generateDebugBuildConfig in app Starting
Caching disabled for task ':library:generateDebugBuildConfig' because:
  Build cache is disabled
Task ':library:generateDebugBuildConfig' is not up-to-date because:
  No history is available.
Task :library:generateDebugBuildConfig in app Finished
:library:generateDebugBuildConfig (Thread[Execution worker for ':',5,main]) completed. Took 0.005 secs.
:library:generateDebugResValues (Thread[Execution worker for ':',5,main]) started.

> Task :library:generateDebugResValues
Task :library:generateDebugResValues in app Starting
Caching disabled for task ':library:generateDebugResValues' because:
  Build cache is disabled
Task ':library:generateDebugResValues' is not up-to-date because:
  No history is available.
Task :library:generateDebugResValues in app Finished
:library:generateDebugResValues (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:generateDebugResources (Thread[Execution worker for ':',5,main]) started.

> Task :library:generateDebugResources
Task :library:generateDebugResources in app Starting
Skipping task ':library:generateDebugResources' as it has no actions.
Task :library:generateDebugResources in app Finished
:library:generateDebugResources (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:packageDebugResources (Thread[Execution worker for ':',5,main]) started.

> Task :library:packageDebugResources
Task :library:packageDebugResources in app Starting
Caching disabled for task ':library:packageDebugResources' because:
  Build cache is disabled
Task ':library:packageDebugResources' is not up-to-date because:
  No history is available.
The input changes require a full rebuild for incremental task ':library:packageDebugResources'.
Unable do incremental execution: full task run
Task :library:packageDebugResources in app Finished
:library:packageDebugResources (Thread[Execution worker for ':',5,main]) completed. Took 0.084 secs.
:library:parseDebugLocalResources (Thread[Execution worker for ':',5,main]) started.
:library:processDebugManifest (Thread[Execution worker for ':' Thread 2,5,main]) started.
:library:javaPreCompileDebug (Thread[Execution worker for ':' Thread 11,5,main]) started.

> Task :library:processDebugManifest
Task :library:processDebugManifest in app Starting
Caching disabled for task ':library:processDebugManifest' because:
  Build cache is disabled
Task ':library:processDebugManifest' is not up-to-date because:
  No history is available.
The input changes require a full rebuild for incremental task ':library:processDebugManifest'.
Unable do incremental execution: full task run
Merging main manifest /home/jitpack/build/library/src/main/AndroidManifest.xml

Merging result: SUCCESS
1<?xml version="1.0" encoding="utf-8"?>
2<manifest xmlns:android="http://schemas.android.com/apk/res/android"
3    package="com.xcore.ui"
4    android:versionCode="6"
5    android:versionName="1.0.6" >
6
7    <uses-sdk
8        android:minSdkVersion="24"
8-->/home/jitpack/build/library/src/main/AndroidManifest.xml
9        android:targetSdkVersion="31" />
9-->/home/jitpack/build/library/src/main/AndroidManifest.xml
10
11    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
11-->/home/jitpack/build/library/src/main/AndroidManifest.xml:5:5-79
11-->/home/jitpack/build/library/src/main/AndroidManifest.xml:5:22-76
12
13</manifest>

Merged manifest saved to /home/jitpack/build/library/build/intermediates/library_manifest/debug/AndroidManifest.xml
Task :library:processDebugManifest in app Finished
:library:processDebugManifest (Thread[Execution worker for ':' Thread 2,5,main]) completed. Took 0.044 secs.

> Task :library:parseDebugLocalResources
Task :library:parseDebugLocalResources in app Starting
Transforming artifact android.jar with PlatformAttrTransform
Caching disabled for PlatformAttrTransform: /opt/android-sdk-linux/platforms/android-31/android.jar because:
  Build cache is disabled
PlatformAttrTransform: /opt/android-sdk-linux/platforms/android-31/android.jar is not up-to-date because:
  No history is available.
Caching disabled for task ':library:parseDebugLocalResources' because:
  Build cache is disabled
Task ':library:parseDebugLocalResources' is not up-to-date because:
  No history is available.
The input changes require a full rebuild for incremental task ':library:parseDebugLocalResources'.
Transforming artifact android.jar with PlatformAttrTransform
Task :library:parseDebugLocalResources in app Finished
:library:parseDebugLocalResources (Thread[Execution worker for ':',5,main]) completed. Took 0.396 secs.

> Task :library:javaPreCompileDebug
Task :library:javaPreCompileDebug in app Starting
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/com/github/bumptech/glide/compiler/4.9.0/compiler-4.9.0.pom]
Downloading https://maven.aliyun.com/repository/jcenter/com/github/bumptech/glide/compiler/4.9.0/compiler-4.9.0.pom to /tmp/gradle_download8380910058289510571bin
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/com/github/bumptech/glide/annotations/4.9.0/annotations-4.9.0.pom]
Downloading https://maven.aliyun.com/repository/jcenter/com/github/bumptech/glide/annotations/4.9.0/annotations-4.9.0.pom to /tmp/gradle_download937312679131350516bin
Downloading https://maven.aliyun.com/repository/jcenter/com/github/bumptech/glide/compiler/4.9.0/compiler-4.9.0.jar to /tmp/gradle_download6407519067460571447bin
Transforming artifact compiler-4.9.0.jar (com.github.bumptech.glide:compiler:4.9.0) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.github.bumptech.glide/compiler/4.9.0/9ceccce9e8dfd4f7d532001b445184bf029fd46b/compiler-4.9.0.jar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.github.bumptech.glide/compiler/4.9.0/9ceccce9e8dfd4f7d532001b445184bf029fd46b/compiler-4.9.0.jar is not up-to-date because:
  No history is available.
Downloading https://maven.aliyun.com/repository/jcenter/com/github/bumptech/glide/annotations/4.9.0/annotations-4.9.0.jar to /tmp/gradle_download27141550693344061bin
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.github.bumptech.glide/annotations/4.9.0/ccdd6bc8b4f3c001fbddec29ecddd515a13203c4/annotations-4.9.0.jar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.github.bumptech.glide/annotations/4.9.0/ccdd6bc8b4f3c001fbddec29ecddd515a13203c4/annotations-4.9.0.jar is not up-to-date because:
  No history is available.
Caching disabled for task ':library:javaPreCompileDebug' because:
  Build cache is disabled
Task ':library:javaPreCompileDebug' is not up-to-date because:
  No history is available.
Transforming artifact compiler-4.9.0.jar (com.github.bumptech.glide:compiler:4.9.0) with JetifyTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with JetifyTransform

:library:generateDebugRFile (Thread[Execution worker for ':' Thread 4,5,main]) started.

> Task :library:javaPreCompileDebug
Task :library:javaPreCompileDebug in app Finished
:library:javaPreCompileDebug (Thread[Execution worker for ':' Thread 11,5,main]) completed. Took 2.685 secs.

> Task :library:generateDebugRFile
Task :library:generateDebugRFile in app Starting
Downloading https://dl.google.com/dl/android/maven2/androidx/annotation/annotation/1.3.0/annotation-1.3.0.pom to /tmp/gradle_download3773462117736938977bin
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/com/github/bumptech/glide/glide/4.9.0/glide-4.9.0.pom]
Downloading https://dl.google.com/dl/android/maven2/androidx/core/core-ktx/1.2.0/core-ktx-1.2.0.pom to /tmp/gradle_download3542594765003689970bin
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/org/jetbrains/kotlin/kotlin-stdlib/1.5.21/kotlin-stdlib-1.5.21.pom]
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-runtime-ktx/2.2.0/lifecycle-runtime-ktx-2.2.0.pom to /tmp/gradle_download7198786204046967735bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-livedata-ktx/2.2.0/lifecycle-livedata-ktx-2.2.0.pom to /tmp/gradle_download4171523000969736706bin
Downloading https://dl.google.com/dl/android/maven2/androidx/swiperefreshlayout/swiperefreshlayout/1.1.0/swiperefreshlayout-1.1.0.pom to /tmp/gradle_download9158963239174302556bin
Downloading https://dl.google.com/dl/android/maven2/androidx/appcompat/appcompat/1.3.0/appcompat-1.3.0.pom to /tmp/gradle_download2852601868920079015bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-viewmodel-ktx/2.2.0/lifecycle-viewmodel-ktx-2.2.0.pom to /tmp/gradle_download879116171455242402bin
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/com/github/ycnao/xh-core-libs/1.0.0/xh-core-libs-1.0.0.pom]
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/com/github/getActivity/XXPermissions/18.63/XXPermissions-18.63.pom]
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/com/wang/avi/library/2.1.3/library-2.1.3.pom]
Downloading https://dl.google.com/dl/android/maven2/androidx/annotation/annotation/1.3.0/annotation-1.3.0.module to /tmp/gradle_download1975877237803803733bin
Downloading https://dl.google.com/dl/android/maven2/androidx/appcompat/appcompat/1.3.0/appcompat-1.3.0.module to /tmp/gradle_download7168118316510136659bin
Downloading https://maven.aliyun.com/repository/jcenter/com/github/bumptech/glide/glide/4.9.0/glide-4.9.0.pom to /tmp/gradle_download5975866447063754044bin
Downloading https://dl.google.com/dl/android/maven2/com/google/android/material/material/1.3.0/material-1.3.0.pom to /tmp/gradle_download370718399870646532bin
Downloading https://maven.aliyun.com/repository/jcenter/com/wang/avi/library/2.1.3/library-2.1.3.pom to /tmp/gradle_download6641329538083858713bin
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/com/sun/mail/android-mail/1.6.0/android-mail-1.6.0.pom]
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/com/sun/mail/android-activation/1.6.0/android-activation-1.6.0.pom]
Downloading https://dl.google.com/dl/android/maven2/com/google/android/material/material/1.3.0/material-1.3.0.module to /tmp/gradle_download9012662534105872442bin
Resource missing. [HTTP GET: https://maven.aliyun.com/repository/jcenter/com/github/ycnao/xh-core-libs/1.0.0/xh-core-libs-1.0.0.pom]
Resource missing. [HTTP GET: https://maven.aliyun.com/repository/jcenter/com/github/getActivity/XXPermissions/18.63/XXPermissions-18.63.pom]
Resource missing. [HTTP GET: https://maven-central.storage.googleapis.com/maven2/com/github/getActivity/XXPermissions/18.63/XXPermissions-18.63.pom]
Resource missing. [HTTP GET: https://maven-central.storage.googleapis.com/maven2/com/github/ycnao/xh-core-libs/1.0.0/xh-core-libs-1.0.0.pom]
Downloading https://maven.aliyun.com/repository/jcenter/org/jetbrains/kotlin/kotlin-stdlib/1.5.21/kotlin-stdlib-1.5.21.pom to /tmp/gradle_download3371274341167574293bin
Downloading https://jitpack.io/com/github/ycnao/xh-core-libs/1.0.0/xh-core-libs-1.0.0.pom to /tmp/gradle_download3234636918219372253bin
Downloading https://jitpack.io/com/github/getActivity/XXPermissions/18.63/XXPermissions-18.63.pom to /tmp/gradle_download2221057185749920685bin
Downloading https://maven.aliyun.com/repository/jcenter/com/sun/mail/android-mail/1.6.0/android-mail-1.6.0.pom to /tmp/gradle_download1974564290671623018bin
Downloading https://jitpack.io/com/github/getActivity/XXPermissions/18.63/XXPermissions-18.63.module to /tmp/gradle_download1541026168104284155bin
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/com/sun/mail/android/1.6.0/android-1.6.0.pom]
Downloading https://maven.aliyun.com/repository/jcenter/com/sun/mail/android-activation/1.6.0/android-activation-1.6.0.pom to /tmp/gradle_download2319594951108966283bin
Downloading https://maven.aliyun.com/repository/jcenter/com/sun/mail/android/1.6.0/android-1.6.0.pom to /tmp/gradle_download7300210747326795708bin
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/com/sun/mail/all/1.6.0/all-1.6.0.pom]
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/com/sun/mail/all/1.6.0/all-1.6.0.pom]
Downloading https://maven.aliyun.com/repository/jcenter/com/sun/mail/all/1.6.0/all-1.6.0.pom to /tmp/gradle_download6427909101026083762bin
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/org/jetbrains/kotlinx/kotlinx-coroutines-android/1.3.0/kotlinx-coroutines-android-1.3.0.pom]
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-runtime/2.2.0/lifecycle-runtime-2.2.0.pom to /tmp/gradle_download737190335727013085bin
Downloading https://maven.aliyun.com/repository/jcenter/org/jetbrains/kotlinx/kotlinx-coroutines-android/1.3.0/kotlinx-coroutines-android-1.3.0.pom to /tmp/gradle_download8140311803164005205bin
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/org/jetbrains/kotlinx/kotlinx-coroutines-core/1.3.0/kotlinx-coroutines-core-1.3.0.pom]
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-livedata/2.2.0/lifecycle-livedata-2.2.0.pom to /tmp/gradle_download3819685020590113938bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-livedata-core-ktx/2.2.0/lifecycle-livedata-core-ktx-2.2.0.pom to /tmp/gradle_download9151952651987477899bin
Downloading https://maven.aliyun.com/repository/jcenter/org/jetbrains/kotlinx/kotlinx-coroutines-core/1.3.0/kotlinx-coroutines-core-1.3.0.pom to /tmp/gradle_download4874116739271732100bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-viewmodel/2.2.0/lifecycle-viewmodel-2.2.0.pom to /tmp/gradle_download2854856709627136112bin
Downloading https://dl.google.com/dl/android/maven2/androidx/interpolator/interpolator/1.0.0/interpolator-1.0.0.pom to /tmp/gradle_download6218376687674260693bin
Downloading https://dl.google.com/dl/android/maven2/androidx/core/core/1.1.0/core-1.1.0.pom to /tmp/gradle_download4808100773155815956bin
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/com/google/code/gson/gson/2.9.0/gson-2.9.0.pom]
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/org/greenrobot/eventbus/3.3.1/eventbus-3.3.1.pom]
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/com/blankj/utilcode/1.30.6/utilcode-1.30.6.pom]
Downloading https://maven.aliyun.com/repository/jcenter/org/greenrobot/eventbus/3.3.1/eventbus-3.3.1.pom to /tmp/gradle_download9162453846278331247bin
Downloading https://maven.aliyun.com/repository/jcenter/com/blankj/utilcode/1.30.6/utilcode-1.30.6.pom to /tmp/gradle_download2720278333687849091bin
Downloading https://maven.aliyun.com/repository/jcenter/com/google/code/gson/gson/2.9.0/gson-2.9.0.pom to /tmp/gradle_download9209997352274239272bin
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/com/google/code/gson/gson-parent/2.9.0/gson-parent-2.9.0.pom]
Downloading https://maven.aliyun.com/repository/jcenter/org/greenrobot/eventbus/3.3.1/eventbus-3.3.1.module to /tmp/gradle_download2152261208800974087bin
Downloading https://maven.aliyun.com/repository/jcenter/com/google/code/gson/gson-parent/2.9.0/gson-parent-2.9.0.pom to /tmp/gradle_download9075755563213134678bin
Downloading https://dl.google.com/dl/android/maven2/androidx/fragment/fragment/1.0.0/fragment-1.0.0.pom to /tmp/gradle_download4318813136747815759bin
Downloading https://dl.google.com/dl/android/maven2/androidx/vectordrawable/vectordrawable-animated/1.0.0/vectordrawable-animated-1.0.0.pom to /tmp/gradle_download7586952659172773619bin
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/com/github/bumptech/glide/gifdecoder/4.9.0/gifdecoder-4.9.0.pom]
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/com/github/bumptech/glide/disklrucache/4.9.0/disklrucache-4.9.0.pom]
Downloading https://maven.aliyun.com/repository/jcenter/com/github/bumptech/glide/gifdecoder/4.9.0/gifdecoder-4.9.0.pom to /tmp/gradle_download6454297951912714010bin
Downloading https://maven.aliyun.com/repository/jcenter/com/github/bumptech/glide/disklrucache/4.9.0/disklrucache-4.9.0.pom to /tmp/gradle_download7756170767292136028bin
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/org/jetbrains/kotlin/kotlin-stdlib-common/1.5.21/kotlin-stdlib-common-1.5.21.pom]
Downloading https://maven.aliyun.com/repository/jcenter/org/jetbrains/kotlin/kotlin-stdlib-common/1.5.21/kotlin-stdlib-common-1.5.21.pom to /tmp/gradle_download3607630470336664446bin
Downloading https://dl.google.com/dl/android/maven2/androidx/core/core/1.2.0/core-1.2.0.pom to /tmp/gradle_download6458954522217698860bin
Downloading https://dl.google.com/dl/android/maven2/androidx/core/core/1.5.0/core-1.5.0.pom to /tmp/gradle_download4298082078456067130bin
Downloading https://dl.google.com/dl/android/maven2/androidx/core/core/1.5.0/core-1.5.0.module to /tmp/gradle_download458575912898942147bin
Downloading https://dl.google.com/dl/android/maven2/androidx/fragment/fragment/1.3.4/fragment-1.3.4.pom to /tmp/gradle_download6611937111620552443bin
Downloading https://dl.google.com/dl/android/maven2/androidx/fragment/fragment/1.3.4/fragment-1.3.4.module to /tmp/gradle_download925304712924168110bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-runtime/2.3.1/lifecycle-runtime-2.3.1.pom to /tmp/gradle_download8405307474561466083bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-runtime/2.3.1/lifecycle-runtime-2.3.1.module to /tmp/gradle_download5245423874991742211bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-viewmodel/2.3.1/lifecycle-viewmodel-2.3.1.pom to /tmp/gradle_download7334956288437063992bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-viewmodel/2.3.1/lifecycle-viewmodel-2.3.1.module to /tmp/gradle_download927211211027116631bin
Downloading https://dl.google.com/dl/android/maven2/androidx/appcompat/appcompat-resources/1.3.0/appcompat-resources-1.3.0.pom to /tmp/gradle_download7334873410198016948bin
Downloading https://dl.google.com/dl/android/maven2/androidx/drawerlayout/drawerlayout/1.0.0/drawerlayout-1.0.0.pom to /tmp/gradle_download3792767291960474358bin
Downloading https://dl.google.com/dl/android/maven2/androidx/collection/collection/1.0.0/collection-1.0.0.pom to /tmp/gradle_download7155171956923061817bin
Downloading https://dl.google.com/dl/android/maven2/androidx/activity/activity/1.2.3/activity-1.2.3.pom to /tmp/gradle_download4237117392010792992bin
Downloading https://dl.google.com/dl/android/maven2/androidx/cursoradapter/cursoradapter/1.0.0/cursoradapter-1.0.0.pom to /tmp/gradle_download6944527917078507068bin
Downloading https://dl.google.com/dl/android/maven2/androidx/savedstate/savedstate/1.1.0/savedstate-1.1.0.pom to /tmp/gradle_download7641660523792492688bin
Downloading https://dl.google.com/dl/android/maven2/androidx/activity/activity/1.2.3/activity-1.2.3.module to /tmp/gradle_download2314326307067371942bin
Downloading https://dl.google.com/dl/android/maven2/androidx/savedstate/savedstate/1.1.0/savedstate-1.1.0.module to /tmp/gradle_download4397455236676548072bin
Downloading https://dl.google.com/dl/android/maven2/androidx/appcompat/appcompat-resources/1.3.0/appcompat-resources-1.3.0.module to /tmp/gradle_download5099127946698563207bin
Downloading https://dl.google.com/dl/android/maven2/androidx/viewpager2/viewpager2/1.0.0/viewpager2-1.0.0.pom to /tmp/gradle_download502584419093074931bin
Downloading https://dl.google.com/dl/android/maven2/androidx/cardview/cardview/1.0.0/cardview-1.0.0.pom to /tmp/gradle_download2649255827790618374bin
Downloading https://dl.google.com/dl/android/maven2/androidx/constraintlayout/constraintlayout/2.0.1/constraintlayout-2.0.1.pom to /tmp/gradle_download360920632272918375bin
Downloading https://dl.google.com/dl/android/maven2/androidx/recyclerview/recyclerview/1.0.0/recyclerview-1.0.0.pom to /tmp/gradle_download8969444806651536588bin
Downloading https://dl.google.com/dl/android/maven2/androidx/annotation/annotation-experimental/1.0.0/annotation-experimental-1.0.0.pom to /tmp/gradle_download5776401796781048581bin
Downloading https://dl.google.com/dl/android/maven2/androidx/coordinatorlayout/coordinatorlayout/1.1.0/coordinatorlayout-1.1.0.pom to /tmp/gradle_download2677402293991132024bin
Downloading https://dl.google.com/dl/android/maven2/androidx/transition/transition/1.2.0/transition-1.2.0.pom to /tmp/gradle_download3491075805870515805bin
Downloading https://dl.google.com/dl/android/maven2/androidx/vectordrawable/vectordrawable/1.1.0/vectordrawable-1.1.0.pom to /tmp/gradle_download3022130437700818267bin
Downloading https://dl.google.com/dl/android/maven2/androidx/dynamicanimation/dynamicanimation/1.0.0/dynamicanimation-1.0.0.pom to /tmp/gradle_download2526238644439522638bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-livedata-core/2.2.0/lifecycle-livedata-core-2.2.0.pom to /tmp/gradle_download2730502910971549128bin
Downloading https://dl.google.com/dl/android/maven2/androidx/arch/core/core-runtime/2.1.0/core-runtime-2.1.0.pom to /tmp/gradle_download7825375569313184826bin
Downloading https://dl.google.com/dl/android/maven2/androidx/arch/core/core-common/2.1.0/core-common-2.1.0.pom to /tmp/gradle_download3978400805054095190bin
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/org/jetbrains/kotlin/kotlin-android-extensions-runtime/1.3.72/kotlin-android-extensions-runtime-1.3.72.pom]
Downloading https://maven.aliyun.com/repository/jcenter/org/jetbrains/kotlin/kotlin-android-extensions-runtime/1.3.72/kotlin-android-extensions-runtime-1.3.72.pom to /tmp/gradle_download3945160386135554292bin
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/org/greenrobot/eventbus-java/3.3.1/eventbus-java-3.3.1.pom]
Downloading https://maven.aliyun.com/repository/jcenter/org/greenrobot/eventbus-java/3.3.1/eventbus-java-3.3.1.pom to /tmp/gradle_download3077766335816231828bin
Downloading https://maven.aliyun.com/repository/jcenter/org/greenrobot/eventbus-java/3.3.1/eventbus-java-3.3.1.module to /tmp/gradle_download7495933224329031165bin
Downloading https://dl.google.com/dl/android/maven2/androidx/legacy/legacy-support-core-ui/1.0.0/legacy-support-core-ui-1.0.0.pom to /tmp/gradle_download4642306770061558932bin
Downloading https://dl.google.com/dl/android/maven2/androidx/versionedparcelable/versionedparcelable/1.1.1/versionedparcelable-1.1.1.pom to /tmp/gradle_download4126720896611422095bin
Downloading https://dl.google.com/dl/android/maven2/androidx/collection/collection/1.1.0/collection-1.1.0.pom to /tmp/gradle_download4116700139438102833bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-livedata-core/2.3.1/lifecycle-livedata-core-2.3.1.pom to /tmp/gradle_download7897257436216578139bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-livedata-core/2.3.1/lifecycle-livedata-core-2.3.1.module to /tmp/gradle_download5002636627009587975bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-viewmodel-savedstate/2.3.1/lifecycle-viewmodel-savedstate-2.3.1.pom to /tmp/gradle_download3393471839103151181bin
Downloading https://dl.google.com/dl/android/maven2/androidx/loader/loader/1.0.0/loader-1.0.0.pom to /tmp/gradle_download1586735207052516408bin
Downloading https://dl.google.com/dl/android/maven2/androidx/viewpager/viewpager/1.0.0/viewpager-1.0.0.pom to /tmp/gradle_download4769238203926147952bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-viewmodel-savedstate/2.3.1/lifecycle-viewmodel-savedstate-2.3.1.module to /tmp/gradle_download4138007539082875133bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-common/2.3.1/lifecycle-common-2.3.1.pom to /tmp/gradle_download8430506982278806214bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-common/2.3.1/lifecycle-common-2.3.1.module to /tmp/gradle_download4083781989233788724bin
Downloading https://dl.google.com/dl/android/maven2/androidx/tracing/tracing/1.0.0/tracing-1.0.0.pom to /tmp/gradle_download4073882537983564678bin
Downloading https://dl.google.com/dl/android/maven2/androidx/tracing/tracing/1.0.0/tracing-1.0.0.module to /tmp/gradle_download8955252461310816992bin
Downloading https://dl.google.com/dl/android/maven2/androidx/vectordrawable/vectordrawable-animated/1.1.0/vectordrawable-animated-1.1.0.pom to /tmp/gradle_download2874814359896261069bin
Downloading https://dl.google.com/dl/android/maven2/androidx/customview/customview/1.0.0/customview-1.0.0.pom to /tmp/gradle_download3647450681344755927bin
Downloading https://dl.google.com/dl/android/maven2/androidx/constraintlayout/constraintlayout-solver/2.0.1/constraintlayout-solver-2.0.1.pom to /tmp/gradle_download9073920182683772660bin
Downloading https://dl.google.com/dl/android/maven2/androidx/legacy/legacy-support-core-utils/1.0.0/legacy-support-core-utils-1.0.0.pom to /tmp/gradle_download7328427881146791101bin
Downloading https://dl.google.com/dl/android/maven2/androidx/recyclerview/recyclerview/1.1.0/recyclerview-1.1.0.pom to /tmp/gradle_download505069387166029946bin
Downloading https://dl.google.com/dl/android/maven2/androidx/localbroadcastmanager/localbroadcastmanager/1.0.0/localbroadcastmanager-1.0.0.pom to /tmp/gradle_download5548231324992105264bin
Downloading https://dl.google.com/dl/android/maven2/androidx/print/print/1.0.0/print-1.0.0.pom to /tmp/gradle_download369677178794495793bin
Downloading https://dl.google.com/dl/android/maven2/androidx/documentfile/documentfile/1.0.0/documentfile-1.0.0.pom to /tmp/gradle_download1862475550190091902bin
Downloading https://jitpack.io/com/github/ycnao/xh-core-libs/1.0.0/xh-core-libs-1.0.0.aar to /tmp/gradle_download289392055574083938bin
Downloading https://maven.aliyun.com/repository/jcenter/com/github/bumptech/glide/glide/4.9.0/glide-4.9.0.aar to /tmp/gradle_download7237339606333390870bin
Downloading https://jitpack.io/com/github/getActivity/XXPermissions/18.63/XXPermissions-18.63.aar to /tmp/gradle_download8941611993298185824bin
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-livedata-ktx/2.2.0/lifecycle-livedata-ktx-2.2.0.aar to /tmp/gradle_download8102272265537610418bin
Downloading https://dl.google.com/dl/android/maven2/com/google/android/material/material/1.3.0/material-1.3.0.aar to /tmp/gradle_download8056793018249820002bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-viewmodel-ktx/2.2.0/lifecycle-viewmodel-ktx-2.2.0.aar to /tmp/gradle_download4943773430988597597bin
Downloading https://dl.google.com/dl/android/maven2/androidx/core/core-ktx/1.2.0/core-ktx-1.2.0.aar to /tmp/gradle_download4551273263346049338bin
Downloading https://dl.google.com/dl/android/maven2/androidx/swiperefreshlayout/swiperefreshlayout/1.1.0/swiperefreshlayout-1.1.0.aar to /tmp/gradle_download8281128589413156225bin
Downloading https://dl.google.com/dl/android/maven2/androidx/appcompat/appcompat/1.3.0/appcompat-1.3.0.aar to /tmp/gradle_download7356869534986917306bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-runtime-ktx/2.2.0/lifecycle-runtime-ktx-2.2.0.aar to /tmp/gradle_download3799086408022522301bin
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/constraintlayout/constraintlayout/2.0.1/constraintlayout-2.0.1.aar to /tmp/gradle_download7465801857727097808bin
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/viewpager2/viewpager2/1.0.0/viewpager2-1.0.0.aar to /tmp/gradle_download4126465928768377793bin
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with JetifyTransform
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with JetifyTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/fragment/fragment/1.3.4/fragment-1.3.4.aar to /tmp/gradle_download9055120254186159154bin
Downloading https://dl.google.com/dl/android/maven2/androidx/appcompat/appcompat-resources/1.3.0/appcompat-resources-1.3.0.aar to /tmp/gradle_download709262866292321422bin
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-livedata-core-ktx/2.2.0/lifecycle-livedata-core-ktx-2.2.0.aar to /tmp/gradle_download4592665961179936672bin
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with JetifyTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/coordinatorlayout/coordinatorlayout/1.1.0/coordinatorlayout-1.1.0.aar to /tmp/gradle_download5846073209682458358bin
Downloading https://dl.google.com/dl/android/maven2/androidx/drawerlayout/drawerlayout/1.0.0/drawerlayout-1.0.0.aar to /tmp/gradle_download9215438837552728413bin
Downloading https://dl.google.com/dl/android/maven2/androidx/activity/activity/1.2.3/activity-1.2.3.aar to /tmp/gradle_download318082638461513570bin
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with JetifyTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with JetifyTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/recyclerview/recyclerview/1.1.0/recyclerview-1.1.0.aar to /tmp/gradle_download7118419580423072860bin
Downloading https://dl.google.com/dl/android/maven2/androidx/dynamicanimation/dynamicanimation/1.0.0/dynamicanimation-1.0.0.aar to /tmp/gradle_download5709840291423409037bin
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with JetifyTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with JetifyTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/transition/transition/1.2.0/transition-1.2.0.aar to /tmp/gradle_download1301473993835835166bin
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/vectordrawable/vectordrawable-animated/1.1.0/vectordrawable-animated-1.1.0.aar to /tmp/gradle_download1716716959223110786bin
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/viewpager/viewpager/1.0.0/viewpager-1.0.0.aar to /tmp/gradle_download44099499684070797bin
Downloading https://dl.google.com/dl/android/maven2/androidx/vectordrawable/vectordrawable/1.1.0/vectordrawable-1.1.0.aar to /tmp/gradle_download9163628246004468472bin
Downloading https://dl.google.com/dl/android/maven2/androidx/legacy/legacy-support-core-utils/1.0.0/legacy-support-core-utils-1.0.0.aar to /tmp/gradle_download853455056705511940bin
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with JetifyTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with JetifyTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/loader/loader/1.0.0/loader-1.0.0.aar to /tmp/gradle_download7625417068478836907bin
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/core/core/1.5.0/core-1.5.0.aar to /tmp/gradle_download5571134821274826218bin
Downloading https://dl.google.com/dl/android/maven2/androidx/customview/customview/1.0.0/customview-1.0.0.aar to /tmp/gradle_download6053507032251662676bin
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Downloading https://maven.aliyun.com/repository/jcenter/com/github/bumptech/glide/gifdecoder/4.9.0/gifdecoder-4.9.0.aar to /tmp/gradle_download3624558112620715957bin
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/arch/core/core-runtime/2.1.0/core-runtime-2.1.0.aar to /tmp/gradle_download2076837155267707846bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-viewmodel/2.3.1/lifecycle-viewmodel-2.3.1.aar to /tmp/gradle_download5313683740709745248bin
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-livedata/2.2.0/lifecycle-livedata-2.2.0.aar to /tmp/gradle_download1775700741537642224bin
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-viewmodel-savedstate/2.3.1/lifecycle-viewmodel-savedstate-2.3.1.aar to /tmp/gradle_download849876326592796437bin
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/cursoradapter/cursoradapter/1.0.0/cursoradapter-1.0.0.aar to /tmp/gradle_download6143670105616158046bin
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/cardview/cardview/1.0.0/cardview-1.0.0.aar to /tmp/gradle_download7374801005229565543bin
Downloading https://dl.google.com/dl/android/maven2/androidx/versionedparcelable/versionedparcelable/1.1.1/versionedparcelable-1.1.1.aar to /tmp/gradle_download6137660379945401929bin
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with JetifyTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/documentfile/documentfile/1.0.0/documentfile-1.0.0.aar to /tmp/gradle_download489289524306068668bin
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with JetifyTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/localbroadcastmanager/localbroadcastmanager/1.0.0/localbroadcastmanager-1.0.0.aar to /tmp/gradle_download8102164260513611017bin
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with JetifyTransform
Downloading https://maven.aliyun.com/repository/jcenter/com/blankj/utilcode/1.30.6/utilcode-1.30.6.aar to /tmp/gradle_download5179662082391718498bin
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.github.ycnao/xh-core-libs/1.0.0/da917d59ecac6f277369287f37a7715f089d0588/xh-core-libs-1.0.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.github.ycnao/xh-core-libs/1.0.0/da917d59ecac6f277369287f37a7715f089d0588/xh-core-libs-1.0.0.aar is not up-to-date because:
  No history is available.
Downloading https://dl.google.com/dl/android/maven2/androidx/savedstate/savedstate/1.1.0/savedstate-1.1.0.aar to /tmp/gradle_download5775995021947413970bin
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-viewmodel-ktx/2.2.0/e04a419829c17eb00b32bce378a63edf6cf4a20d/lifecycle-viewmodel-ktx-2.2.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-viewmodel-ktx/2.2.0/e04a419829c17eb00b32bce378a63edf6cf4a20d/lifecycle-viewmodel-ktx-2.2.0.aar is not up-to-date because:
  No history is available.
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with ExtractAarTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with ExtractAarTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/interpolator/interpolator/1.0.0/interpolator-1.0.0.aar to /tmp/gradle_download8109849283520680593bin
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/a79bb8585b05c04e1475c3d16fdef16e/jetified-lifecycle-viewmodel-ktx-2.2.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/a79bb8585b05c04e1475c3d16fdef16e/jetified-lifecycle-viewmodel-ktx-2.2.0.aar is not up-to-date because:
  No history is available.
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.github.getActivity/XXPermissions/18.63/a8a4f9cab2e6e8c4299de3ad96e68efde8cbf33e/XXPermissions-18.63.aar because:
  Build cache is disabled
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.swiperefreshlayout/swiperefreshlayout/1.1.0/2aeac64056fe6cc0420afad0b699a7f9257b8ebe/swiperefreshlayout-1.1.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.github.getActivity/XXPermissions/18.63/a8a4f9cab2e6e8c4299de3ad96e68efde8cbf33e/XXPermissions-18.63.aar is not up-to-date because:
  No history is available.
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.swiperefreshlayout/swiperefreshlayout/1.1.0/2aeac64056fe6cc0420afad0b699a7f9257b8ebe/swiperefreshlayout-1.1.0.aar is not up-to-date because:
  No history is available.
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/53d121c8efefa4f5552c59a04325e338/jetified-xh-core-libs-1.0.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/53d121c8efefa4f5552c59a04325e338/jetified-xh-core-libs-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.swiperefreshlayout/swiperefreshlayout/1.1.0/2aeac64056fe6cc0420afad0b699a7f9257b8ebe/swiperefreshlayout-1.1.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.swiperefreshlayout/swiperefreshlayout/1.1.0/2aeac64056fe6cc0420afad0b699a7f9257b8ebe/swiperefreshlayout-1.1.0.aar is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/00810ca03ce0494b8629be7d1ffee716/jetified-lifecycle-viewmodel-ktx-2.2.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/00810ca03ce0494b8629be7d1ffee716/jetified-lifecycle-viewmodel-ktx-2.2.0 is not up-to-date because:
  No history is available.
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/38af2f142103369ed22597a4632fe39d/swiperefreshlayout-1.1.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/38af2f142103369ed22597a4632fe39d/swiperefreshlayout-1.1.0 is not up-to-date because:
  No history is available.
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/652b70cd2c0b2d5cacaa5273086cef97/jetified-xh-core-libs-1.0.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/652b70cd2c0b2d5cacaa5273086cef97/jetified-xh-core-libs-1.0.0 is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-runtime-ktx/2.2.0/e7ec08e0c4218b8baaf4bab036d3c9d0a3959848/lifecycle-runtime-ktx-2.2.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-runtime-ktx/2.2.0/e7ec08e0c4218b8baaf4bab036d3c9d0a3959848/lifecycle-runtime-ktx-2.2.0.aar is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-livedata-ktx/2.2.0/18c4de953aef3119e00f8b2427979add0ce64910/lifecycle-livedata-ktx-2.2.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-livedata-ktx/2.2.0/18c4de953aef3119e00f8b2427979add0ce64910/lifecycle-livedata-ktx-2.2.0.aar is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.github.bumptech.glide/glide/4.9.0/c34f3a0b710a00c62a62683f5f756e6af34183a8/glide-4.9.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.github.bumptech.glide/glide/4.9.0/c34f3a0b710a00c62a62683f5f756e6af34183a8/glide-4.9.0.aar is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with ExtractAarTransform
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/1004b1aba5e493f14c25fa39cc883ac9/jetified-lifecycle-livedata-ktx-2.2.0.aar because:
  Build cache is disabled
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/b9b54b36f67842fba0f1309c49080cbf/jetified-lifecycle-runtime-ktx-2.2.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/1004b1aba5e493f14c25fa39cc883ac9/jetified-lifecycle-livedata-ktx-2.2.0.aar is not up-to-date because:
  No history is available.
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/b9b54b36f67842fba0f1309c49080cbf/jetified-lifecycle-runtime-ktx-2.2.0.aar is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/26893b8957b9a61d0a7ed988a372f953/jetified-lifecycle-livedata-ktx-2.2.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/26893b8957b9a61d0a7ed988a372f953/jetified-lifecycle-livedata-ktx-2.2.0 is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/2408200546e1ad6104878c0e62acdc61/jetified-lifecycle-runtime-ktx-2.2.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/2408200546e1ad6104878c0e62acdc61/jetified-lifecycle-runtime-ktx-2.2.0 is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.core/core-ktx/1.2.0/6756534f262c845d4d06b55aaf8b751db0e48822/core-ktx-1.2.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.core/core-ktx/1.2.0/6756534f262c845d4d06b55aaf8b751db0e48822/core-ktx-1.2.0.aar is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-livedata-core-ktx/2.2.0/c6d3c53337157516ad571ae51534986f3d5fd029/lifecycle-livedata-core-ktx-2.2.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-livedata-core-ktx/2.2.0/c6d3c53337157516ad571ae51534986f3d5fd029/lifecycle-livedata-core-ktx-2.2.0.aar is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/de46d52f40aecf184137aa6218a714c5/jetified-lifecycle-livedata-core-ktx-2.2.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/de46d52f40aecf184137aa6218a714c5/jetified-lifecycle-livedata-core-ktx-2.2.0.aar is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/6bd2878da1c22b1210205c9bb9c9a82c/jetified-lifecycle-livedata-core-ktx-2.2.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/6bd2878da1c22b1210205c9bb9c9a82c/jetified-lifecycle-livedata-core-ktx-2.2.0 is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.viewpager2/viewpager2/1.0.0/91c378a09ddff66e1bb73e90edeac53487d2832b/viewpager2-1.0.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.viewpager2/viewpager2/1.0.0/91c378a09ddff66e1bb73e90edeac53487d2832b/viewpager2-1.0.0.aar is not up-to-date because:
  No history is available.
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-runtime/2.3.1/lifecycle-runtime-2.3.1.aar to /tmp/gradle_download1909494581658798518bin
Downloading https://dl.google.com/dl/android/maven2/androidx/annotation/annotation-experimental/1.0.0/annotation-experimental-1.0.0.aar to /tmp/gradle_download5210527138850136116bin
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with ExtractAarTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.appcompat/appcompat-resources/1.3.0/fd7a8a9933b70c5e1da5243e35682058bc355eb1/appcompat-resources-1.3.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.appcompat/appcompat-resources/1.3.0/fd7a8a9933b70c5e1da5243e35682058bc355eb1/appcompat-resources-1.3.0.aar is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/3d120b85154cd9bc6107bc32db08225c/jetified-viewpager2-1.0.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/3d120b85154cd9bc6107bc32db08225c/jetified-viewpager2-1.0.0.aar is not up-to-date because:
  No history is available.
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with ExtractAarTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with ExtractAarTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.drawerlayout/drawerlayout/1.0.0/dd02c7e207136e1272b33815cc61e57676ed13a2/drawerlayout-1.0.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.drawerlayout/drawerlayout/1.0.0/dd02c7e207136e1272b33815cc61e57676ed13a2/drawerlayout-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.constraintlayout/constraintlayout/2.0.1/fab633b1873e5c1fbe49d919fab85ed1f8cf47ca/constraintlayout-2.0.1.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.constraintlayout/constraintlayout/2.0.1/fab633b1873e5c1fbe49d919fab85ed1f8cf47ca/constraintlayout-2.0.1.aar is not up-to-date because:
  No history is available.
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/3c68826afa41d0d2c73a9f2d0e53b9af/jetified-XXPermissions-18.63.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/3c68826afa41d0d2c73a9f2d0e53b9af/jetified-XXPermissions-18.63.aar is not up-to-date because:
  No history is available.
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with LibrarySymbolTableTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with ExtractAarTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/632e3ab57e3ad0ea622293868cecc625/jetified-viewpager2-1.0.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/632e3ab57e3ad0ea622293868cecc625/jetified-viewpager2-1.0.0 is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.drawerlayout/drawerlayout/1.0.0/dd02c7e207136e1272b33815cc61e57676ed13a2/drawerlayout-1.0.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.drawerlayout/drawerlayout/1.0.0/dd02c7e207136e1272b33815cc61e57676ed13a2/drawerlayout-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/aba145152750690e2dbfacc13d63202a/jetified-core-ktx-1.2.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/aba145152750690e2dbfacc13d63202a/jetified-core-ktx-1.2.0.aar is not up-to-date because:
  No history is available.
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with ExtractAarTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.dynamicanimation/dynamicanimation/1.0.0/e980497a58fb319d471f3bb78d066b926a08ba8e/dynamicanimation-1.0.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.dynamicanimation/dynamicanimation/1.0.0/e980497a58fb319d471f3bb78d066b926a08ba8e/dynamicanimation-1.0.0.aar is not up-to-date because:
  No history is available.
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with LibrarySymbolTableTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/e2c7f4605beb3f309c0feb691a9dd743/jetified-XXPermissions-18.63 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/e2c7f4605beb3f309c0feb691a9dd743/jetified-XXPermissions-18.63 is not up-to-date because:
  No history is available.
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with ExtractAarTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/f73588bb0b29beee3ad1e09888611e0a/drawerlayout-1.0.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/f73588bb0b29beee3ad1e09888611e0a/drawerlayout-1.0.0 is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/5877aab84fdf0d036db7431e3c31ea34/jetified-appcompat-resources-1.3.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/5877aab84fdf0d036db7431e3c31ea34/jetified-appcompat-resources-1.3.0.aar is not up-to-date because:
  No history is available.
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with LibrarySymbolTableTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.coordinatorlayout/coordinatorlayout/1.1.0/8eeb7baf75b9595d017642a460df5af3bb9fa4e1/coordinatorlayout-1.1.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.coordinatorlayout/coordinatorlayout/1.1.0/8eeb7baf75b9595d017642a460df5af3bb9fa4e1/coordinatorlayout-1.1.0.aar is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.dynamicanimation/dynamicanimation/1.0.0/e980497a58fb319d471f3bb78d066b926a08ba8e/dynamicanimation-1.0.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.dynamicanimation/dynamicanimation/1.0.0/e980497a58fb319d471f3bb78d066b926a08ba8e/dynamicanimation-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/7946e49349f61c5f2801cf6ebbb27d1f/jetified-core-ktx-1.2.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/7946e49349f61c5f2801cf6ebbb27d1f/jetified-core-ktx-1.2.0 is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.activity/activity/1.2.3/31b424ed12f25c6a47fb74280054f128064c94dc/activity-1.2.3.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.activity/activity/1.2.3/31b424ed12f25c6a47fb74280054f128064c94dc/activity-1.2.3.aar is not up-to-date because:
  No history is available.
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.coordinatorlayout/coordinatorlayout/1.1.0/8eeb7baf75b9595d017642a460df5af3bb9fa4e1/coordinatorlayout-1.1.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.coordinatorlayout/coordinatorlayout/1.1.0/8eeb7baf75b9595d017642a460df5af3bb9fa4e1/coordinatorlayout-1.1.0.aar is not up-to-date because:
  No history is available.
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/3b86136c65011c7aec35f484edaf8fbe/dynamicanimation-1.0.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/3b86136c65011c7aec35f484edaf8fbe/dynamicanimation-1.0.0 is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.fragment/fragment/1.3.4/65b65aa70b61fd0fe3c57b7f603511d8231d85f6/fragment-1.3.4.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.fragment/fragment/1.3.4/65b65aa70b61fd0fe3c57b7f603511d8231d85f6/fragment-1.3.4.aar is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.constraintlayout/constraintlayout/2.0.1/fab633b1873e5c1fbe49d919fab85ed1f8cf47ca/constraintlayout-2.0.1.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.constraintlayout/constraintlayout/2.0.1/fab633b1873e5c1fbe49d919fab85ed1f8cf47ca/constraintlayout-2.0.1.aar is not up-to-date because:
  No history is available.
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with ExtractAarTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with ExtractAarTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/8619d92435ef21e91d468c8a6111fdf9/jetified-appcompat-resources-1.3.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/8619d92435ef21e91d468c8a6111fdf9/jetified-appcompat-resources-1.3.0 is not up-to-date because:
  No history is available.
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/43b09d3e4c5286e0fd8e36dbf7b1963c/coordinatorlayout-1.1.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/43b09d3e4c5286e0fd8e36dbf7b1963c/coordinatorlayout-1.1.0 is not up-to-date because:
  No history is available.
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with ExtractAarTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.appcompat/appcompat/1.3.0/beebea39b2ef5604ee50838ab1b456de9d133140/appcompat-1.3.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.appcompat/appcompat/1.3.0/beebea39b2ef5604ee50838ab1b456de9d133140/appcompat-1.3.0.aar is not up-to-date because:
  No history is available.
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with ExtractAarTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.google.android.material/material/1.3.0/eb5f05b4af91bb9dac4a1abd1143ee9341f9145f/material-1.3.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.google.android.material/material/1.3.0/eb5f05b4af91bb9dac4a1abd1143ee9341f9145f/material-1.3.0.aar is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/da55845c841a1074e11565978e11712f/jetified-activity-1.2.3.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/da55845c841a1074e11565978e11712f/jetified-activity-1.2.3.aar is not up-to-date because:
  No history is available.
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with ExtractAarTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/45af27e9001aff831fa56c50d7d43b91/constraintlayout-2.0.1 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/45af27e9001aff831fa56c50d7d43b91/constraintlayout-2.0.1 is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.fragment/fragment/1.3.4/65b65aa70b61fd0fe3c57b7f603511d8231d85f6/fragment-1.3.4.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.fragment/fragment/1.3.4/65b65aa70b61fd0fe3c57b7f603511d8231d85f6/fragment-1.3.4.aar is not up-to-date because:
  No history is available.
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/04e5a54fea421f5277bdcccdd02e953e/jetified-activity-1.2.3 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/04e5a54fea421f5277bdcccdd02e953e/jetified-activity-1.2.3 is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.legacy/legacy-support-core-utils/1.0.0/9b9570042115da8629519090dfeb71df75da59fc/legacy-support-core-utils-1.0.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.legacy/legacy-support-core-utils/1.0.0/9b9570042115da8629519090dfeb71df75da59fc/legacy-support-core-utils-1.0.0.aar is not up-to-date because:
  No history is available.
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with ExtractAarTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.vectordrawable/vectordrawable-animated/1.1.0/fcda1161354501471c30a4e077af6b5c4d4eddc6/vectordrawable-animated-1.1.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.vectordrawable/vectordrawable-animated/1.1.0/fcda1161354501471c30a4e077af6b5c4d4eddc6/vectordrawable-animated-1.1.0.aar is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.legacy/legacy-support-core-utils/1.0.0/9b9570042115da8629519090dfeb71df75da59fc/legacy-support-core-utils-1.0.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.legacy/legacy-support-core-utils/1.0.0/9b9570042115da8629519090dfeb71df75da59fc/legacy-support-core-utils-1.0.0.aar is not up-to-date because:
  No history is available.
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with ExtractAarTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with LibrarySymbolTableTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.vectordrawable/vectordrawable-animated/1.1.0/fcda1161354501471c30a4e077af6b5c4d4eddc6/vectordrawable-animated-1.1.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.vectordrawable/vectordrawable-animated/1.1.0/fcda1161354501471c30a4e077af6b5c4d4eddc6/vectordrawable-animated-1.1.0.aar is not up-to-date because:
  No history is available.
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/8dd82511b3762af2520616cdda456d24/legacy-support-core-utils-1.0.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/8dd82511b3762af2520616cdda456d24/legacy-support-core-utils-1.0.0 is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.vectordrawable/vectordrawable/1.1.0/eac7a364fff534035a2a6cb17770a1288315f69f/vectordrawable-1.1.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.vectordrawable/vectordrawable/1.1.0/eac7a364fff534035a2a6cb17770a1288315f69f/vectordrawable-1.1.0.aar is not up-to-date because:
  No history is available.
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with ExtractAarTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/475475f4fc0b1b582b8dad44b0531736/vectordrawable-animated-1.1.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/475475f4fc0b1b582b8dad44b0531736/vectordrawable-animated-1.1.0 is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.vectordrawable/vectordrawable/1.1.0/eac7a364fff534035a2a6cb17770a1288315f69f/vectordrawable-1.1.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.vectordrawable/vectordrawable/1.1.0/eac7a364fff534035a2a6cb17770a1288315f69f/vectordrawable-1.1.0.aar is not up-to-date because:
  No history is available.
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with ExtractAarTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with LibrarySymbolTableTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/63cb95aeea8976d4991eb8a04d57c6fb/fragment-1.3.4 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/63cb95aeea8976d4991eb8a04d57c6fb/fragment-1.3.4 is not up-to-date because:
  No history is available.
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with LibrarySymbolTableTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/29f0774eb2c19a57c33f324d6afe3731/vectordrawable-1.1.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/29f0774eb2c19a57c33f324d6afe3731/vectordrawable-1.1.0 is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.viewpager/viewpager/1.0.0/1f90e13820f96c2fb868f9674079a551678d68b2/viewpager-1.0.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.viewpager/viewpager/1.0.0/1f90e13820f96c2fb868f9674079a551678d68b2/viewpager-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.transition/transition/1.2.0/28003577e8b32f5417bfe899bbdc7a333dc81c9f/transition-1.2.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.transition/transition/1.2.0/28003577e8b32f5417bfe899bbdc7a333dc81c9f/transition-1.2.0.aar is not up-to-date because:
  No history is available.
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with ExtractAarTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with ExtractAarTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.loader/loader/1.0.0/8af8b6cec0da85c207d03e15840e0722cbc71e70/loader-1.0.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.loader/loader/1.0.0/8af8b6cec0da85c207d03e15840e0722cbc71e70/loader-1.0.0.aar is not up-to-date because:
  No history is available.
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with ExtractAarTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.viewpager/viewpager/1.0.0/1f90e13820f96c2fb868f9674079a551678d68b2/viewpager-1.0.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.viewpager/viewpager/1.0.0/1f90e13820f96c2fb868f9674079a551678d68b2/viewpager-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.loader/loader/1.0.0/8af8b6cec0da85c207d03e15840e0722cbc71e70/loader-1.0.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.loader/loader/1.0.0/8af8b6cec0da85c207d03e15840e0722cbc71e70/loader-1.0.0.aar is not up-to-date because:
  No history is available.
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with LibrarySymbolTableTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with LibrarySymbolTableTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/8ff4c3c9b2aaf41be38a87b1e9237edf/loader-1.0.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/8ff4c3c9b2aaf41be38a87b1e9237edf/loader-1.0.0 is not up-to-date because:
  No history is available.
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/9fa26880d45a9851c5f1a3d4f6fbbf96/viewpager-1.0.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/9fa26880d45a9851c5f1a3d4f6fbbf96/viewpager-1.0.0 is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.transition/transition/1.2.0/28003577e8b32f5417bfe899bbdc7a333dc81c9f/transition-1.2.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.transition/transition/1.2.0/28003577e8b32f5417bfe899bbdc7a333dc81c9f/transition-1.2.0.aar is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.recyclerview/recyclerview/1.1.0/8b4f97752ddcbc712af46d208aebd46585cde63b/recyclerview-1.1.0.aar because:
  Build cache is disabled
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.customview/customview/1.0.0/30f5ff6075d112f8076e733b24410e68159735b6/customview-1.0.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.recyclerview/recyclerview/1.1.0/8b4f97752ddcbc712af46d208aebd46585cde63b/recyclerview-1.1.0.aar is not up-to-date because:
  No history is available.
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.customview/customview/1.0.0/30f5ff6075d112f8076e733b24410e68159735b6/customview-1.0.0.aar is not up-to-date because:
  No history is available.
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with ExtractAarTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with ExtractAarTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.customview/customview/1.0.0/30f5ff6075d112f8076e733b24410e68159735b6/customview-1.0.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.customview/customview/1.0.0/30f5ff6075d112f8076e733b24410e68159735b6/customview-1.0.0.aar is not up-to-date because:
  No history is available.
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/2148d1a6dd6cff3e210987d8dc2f6040/transition-1.2.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/2148d1a6dd6cff3e210987d8dc2f6040/transition-1.2.0 is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.appcompat/appcompat/1.3.0/beebea39b2ef5604ee50838ab1b456de9d133140/appcompat-1.3.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.appcompat/appcompat/1.3.0/beebea39b2ef5604ee50838ab1b456de9d133140/appcompat-1.3.0.aar is not up-to-date because:
  No history is available.
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/9f3074cf36e377a119662e7aca8df4e4/customview-1.0.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/9f3074cf36e377a119662e7aca8df4e4/customview-1.0.0 is not up-to-date because:
  No history is available.
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with ExtractAarTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with LibrarySymbolTableTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with ExtractAarTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with ExtractAarTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with LibrarySymbolTableTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with LibrarySymbolTableTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.core/core/1.5.0/592da26c6f1263a51134546204033e0964e3c540/core-1.5.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.core/core/1.5.0/592da26c6f1263a51134546204033e0964e3c540/core-1.5.0.aar is not up-to-date because:
  No history is available.
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-livedata-core/2.3.1/lifecycle-livedata-core-2.3.1.aar to /tmp/gradle_download3944778789305838384bin
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.recyclerview/recyclerview/1.1.0/8b4f97752ddcbc712af46d208aebd46585cde63b/recyclerview-1.1.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.recyclerview/recyclerview/1.1.0/8b4f97752ddcbc712af46d208aebd46585cde63b/recyclerview-1.1.0.aar is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with LibrarySymbolTableTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/7c89eaa7f2dae2a7580594948e8ff9be/recyclerview-1.1.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/7c89eaa7f2dae2a7580594948e8ff9be/recyclerview-1.1.0 is not up-to-date because:
  No history is available.
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.google.android.material/material/1.3.0/eb5f05b4af91bb9dac4a1abd1143ee9341f9145f/material-1.3.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.google.android.material/material/1.3.0/eb5f05b4af91bb9dac4a1abd1143ee9341f9145f/material-1.3.0.aar is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.core/core/1.5.0/592da26c6f1263a51134546204033e0964e3c540/core-1.5.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.core/core/1.5.0/592da26c6f1263a51134546204033e0964e3c540/core-1.5.0.aar is not up-to-date because:
  No history is available.
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/7a26099e6fac51ff0a2e559d40d8d6e6/core-1.5.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/7a26099e6fac51ff0a2e559d40d8d6e6/core-1.5.0 is not up-to-date because:
  No history is available.
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.github.bumptech.glide/gifdecoder/4.9.0/d42a42c2929e2cf9051e49b0c38eeedbb3f033ff/gifdecoder-4.9.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.github.bumptech.glide/gifdecoder/4.9.0/d42a42c2929e2cf9051e49b0c38eeedbb3f033ff/gifdecoder-4.9.0.aar is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-viewmodel/2.3.1/9b96f5276783647e1436154c7ae393b2a4e9c2c4/lifecycle-viewmodel-2.3.1.aar because:
  Build cache is disabled
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-viewmodel/2.3.1/9b96f5276783647e1436154c7ae393b2a4e9c2c4/lifecycle-viewmodel-2.3.1.aar is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.arch.core/core-runtime/2.1.0/2df0e03029caae7863ccb4825addaadc8ab6780c/core-runtime-2.1.0.aar because:
  Build cache is disabled
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-livedata/2.2.0/f37b9505a9617fd0b4d176360cbb4377c78f9634/lifecycle-livedata-2.2.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.arch.core/core-runtime/2.1.0/2df0e03029caae7863ccb4825addaadc8ab6780c/core-runtime-2.1.0.aar is not up-to-date because:
  No history is available.
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-livedata/2.2.0/f37b9505a9617fd0b4d176360cbb4377c78f9634/lifecycle-livedata-2.2.0.aar is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with ExtractAarTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with ExtractAarTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with ExtractAarTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with ExtractAarTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with ExtractAarTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.arch.core/core-runtime/2.1.0/2df0e03029caae7863ccb4825addaadc8ab6780c/core-runtime-2.1.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.arch.core/core-runtime/2.1.0/2df0e03029caae7863ccb4825addaadc8ab6780c/core-runtime-2.1.0.aar is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-livedata/2.2.0/f37b9505a9617fd0b4d176360cbb4377c78f9634/lifecycle-livedata-2.2.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-livedata/2.2.0/f37b9505a9617fd0b4d176360cbb4377c78f9634/lifecycle-livedata-2.2.0.aar is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-viewmodel/2.3.1/9b96f5276783647e1436154c7ae393b2a4e9c2c4/lifecycle-viewmodel-2.3.1.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-viewmodel/2.3.1/9b96f5276783647e1436154c7ae393b2a4e9c2c4/lifecycle-viewmodel-2.3.1.aar is not up-to-date because:
  No history is available.
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/c0cfae8743025b95d3fa955e45f88030/core-runtime-2.1.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/c0cfae8743025b95d3fa955e45f88030/core-runtime-2.1.0 is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with LibrarySymbolTableTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/7ee60856e3b895ef2fa5cd4b7e18ef8d/lifecycle-livedata-2.2.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/7ee60856e3b895ef2fa5cd4b7e18ef8d/lifecycle-livedata-2.2.0 is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-viewmodel-savedstate/2.3.1/ef1df1036fc803ab3eaf0c298ee256e0b9fdad01/lifecycle-viewmodel-savedstate-2.3.1.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-viewmodel-savedstate/2.3.1/ef1df1036fc803ab3eaf0c298ee256e0b9fdad01/lifecycle-viewmodel-savedstate-2.3.1.aar is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with LibrarySymbolTableTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with LibrarySymbolTableTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/da452dcf8af436e41d44ea6e5ac99de2/lifecycle-viewmodel-2.3.1 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/da452dcf8af436e41d44ea6e5ac99de2/lifecycle-viewmodel-2.3.1 is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.cursoradapter/cursoradapter/1.0.0/74014983a86b83cbce534dec4e7aa9312f5f5d82/cursoradapter-1.0.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.cursoradapter/cursoradapter/1.0.0/74014983a86b83cbce534dec4e7aa9312f5f5d82/cursoradapter-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.versionedparcelable/versionedparcelable/1.1.1/18e18071e7715679e0593c570217edeb5ca48b9e/versionedparcelable-1.1.1.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.versionedparcelable/versionedparcelable/1.1.1/18e18071e7715679e0593c570217edeb5ca48b9e/versionedparcelable-1.1.1.aar is not up-to-date because:
  No history is available.
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with ExtractAarTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.cursoradapter/cursoradapter/1.0.0/74014983a86b83cbce534dec4e7aa9312f5f5d82/cursoradapter-1.0.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.cursoradapter/cursoradapter/1.0.0/74014983a86b83cbce534dec4e7aa9312f5f5d82/cursoradapter-1.0.0.aar is not up-to-date because:
  No history is available.
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/f9a785cf13ec1f214dac41ec695838d5/jetified-gifdecoder-4.9.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/f9a785cf13ec1f214dac41ec695838d5/jetified-gifdecoder-4.9.0.aar is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.cardview/cardview/1.0.0/158dbc2e2bc502815821191b04446b8f663c1874/cardview-1.0.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.cardview/cardview/1.0.0/158dbc2e2bc502815821191b04446b8f663c1874/cardview-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.documentfile/documentfile/1.0.0/66104345c90cd8c2fd5ad2d3aad692b280e10c32/documentfile-1.0.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.documentfile/documentfile/1.0.0/66104345c90cd8c2fd5ad2d3aad692b280e10c32/documentfile-1.0.0.aar is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with ExtractAarTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.versionedparcelable/versionedparcelable/1.1.1/18e18071e7715679e0593c570217edeb5ca48b9e/versionedparcelable-1.1.1.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.versionedparcelable/versionedparcelable/1.1.1/18e18071e7715679e0593c570217edeb5ca48b9e/versionedparcelable-1.1.1.aar is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.localbroadcastmanager/localbroadcastmanager/1.0.0/2734f31c8321e83ce6b60570d14777fc33cc2ece/localbroadcastmanager-1.0.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.localbroadcastmanager/localbroadcastmanager/1.0.0/2734f31c8321e83ce6b60570d14777fc33cc2ece/localbroadcastmanager-1.0.0.aar is not up-to-date because:
  No history is available.
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with ExtractAarTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/278a4e135729e3dea4a531527a10fb81/cursoradapter-1.0.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/278a4e135729e3dea4a531527a10fb81/cursoradapter-1.0.0 is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.cardview/cardview/1.0.0/158dbc2e2bc502815821191b04446b8f663c1874/cardview-1.0.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.cardview/cardview/1.0.0/158dbc2e2bc502815821191b04446b8f663c1874/cardview-1.0.0.aar is not up-to-date because:
  No history is available.
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with ExtractAarTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/08f54c08cba355251d93437d16a01f74/jetified-gifdecoder-4.9.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/08f54c08cba355251d93437d16a01f74/jetified-gifdecoder-4.9.0 is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.localbroadcastmanager/localbroadcastmanager/1.0.0/2734f31c8321e83ce6b60570d14777fc33cc2ece/localbroadcastmanager-1.0.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.localbroadcastmanager/localbroadcastmanager/1.0.0/2734f31c8321e83ce6b60570d14777fc33cc2ece/localbroadcastmanager-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.documentfile/documentfile/1.0.0/66104345c90cd8c2fd5ad2d3aad692b280e10c32/documentfile-1.0.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.documentfile/documentfile/1.0.0/66104345c90cd8c2fd5ad2d3aad692b280e10c32/documentfile-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.blankj/utilcode/1.30.6/9b0b5fd30e2fc15f3729a7b84ca1ade44c97fc62/utilcode-1.30.6.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.blankj/utilcode/1.30.6/9b0b5fd30e2fc15f3729a7b84ca1ade44c97fc62/utilcode-1.30.6.aar is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.savedstate/savedstate/1.1.0/8d4785f699f93e4020b185e2b7de37cb1f58753c/savedstate-1.1.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.savedstate/savedstate/1.1.0/8d4785f699f93e4020b185e2b7de37cb1f58753c/savedstate-1.1.0.aar is not up-to-date because:
  No history is available.
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/7cb54674dfd6c71742ed87ef5ebc41bc/versionedparcelable-1.1.1 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/7cb54674dfd6c71742ed87ef5ebc41bc/versionedparcelable-1.1.1 is not up-to-date because:
  No history is available.
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with LibrarySymbolTableTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with LibrarySymbolTableTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/2a079ca7ecc3b52f3f2ee575387a0f58/localbroadcastmanager-1.0.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/2a079ca7ecc3b52f3f2ee575387a0f58/localbroadcastmanager-1.0.0 is not up-to-date because:
  No history is available.
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/f9cd044f2354549ea1a17d7d40e9884a/cardview-1.0.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/f9cd044f2354549ea1a17d7d40e9884a/cardview-1.0.0 is not up-to-date because:
  No history is available.
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/8cf45b8c8793a879b35d6fd3ce25200d/documentfile-1.0.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/8cf45b8c8793a879b35d6fd3ce25200d/documentfile-1.0.0 is not up-to-date because:
  No history is available.
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with ExtractAarTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.interpolator/interpolator/1.0.0/8a01fa254a23b9388571eb6334b03707c7d122d7/interpolator-1.0.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.interpolator/interpolator/1.0.0/8a01fa254a23b9388571eb6334b03707c7d122d7/interpolator-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/ab5252ab0a6c80d5cb5f45ac1eaf488d/jetified-savedstate-1.1.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/ab5252ab0a6c80d5cb5f45ac1eaf488d/jetified-savedstate-1.1.0.aar is not up-to-date because:
  No history is available.
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with ExtractAarTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with ExtractAarTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-runtime/2.3.1/5786c819df8bcc1f050e9a752d2d0d85f87c4aed/lifecycle-runtime-2.3.1.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-runtime/2.3.1/5786c819df8bcc1f050e9a752d2d0d85f87c4aed/lifecycle-runtime-2.3.1.aar is not up-to-date because:
  No history is available.
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.interpolator/interpolator/1.0.0/8a01fa254a23b9388571eb6334b03707c7d122d7/interpolator-1.0.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.interpolator/interpolator/1.0.0/8a01fa254a23b9388571eb6334b03707c7d122d7/interpolator-1.0.0.aar is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-runtime/2.3.1/5786c819df8bcc1f050e9a752d2d0d85f87c4aed/lifecycle-runtime-2.3.1.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-runtime/2.3.1/5786c819df8bcc1f050e9a752d2d0d85f87c4aed/lifecycle-runtime-2.3.1.aar is not up-to-date because:
  No history is available.
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with LibrarySymbolTableTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/b1bf1da5cc90a847b40978a7ceaf01ed/interpolator-1.0.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/b1bf1da5cc90a847b40978a7ceaf01ed/interpolator-1.0.0 is not up-to-date because:
  No history is available.
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/c69f0639f7beb954d3fae5f685b3f230/jetified-savedstate-1.1.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/c69f0639f7beb954d3fae5f685b3f230/jetified-savedstate-1.1.0 is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with ExtractAarTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-livedata-core/2.3.1/d6d9279495dc234dc37cecf461b3b626825086ef/lifecycle-livedata-core-2.3.1.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-livedata-core/2.3.1/d6d9279495dc234dc37cecf461b3b626825086ef/lifecycle-livedata-core-2.3.1.aar is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with ExtractAarTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with ExtractAarTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with LibrarySymbolTableTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with LibrarySymbolTableTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-livedata-core/2.3.1/d6d9279495dc234dc37cecf461b3b626825086ef/lifecycle-livedata-core-2.3.1.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-livedata-core/2.3.1/d6d9279495dc234dc37cecf461b3b626825086ef/lifecycle-livedata-core-2.3.1.aar is not up-to-date because:
  No history is available.
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/3544018d77b4c99eabc02cdc68d4299c/lifecycle-runtime-2.3.1 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/3544018d77b4c99eabc02cdc68d4299c/lifecycle-runtime-2.3.1 is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with ExtractAarTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with LibrarySymbolTableTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with LibrarySymbolTableTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/b44f02105d24e5aac2b627e40783c0b7/lifecycle-livedata-core-2.3.1 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/b44f02105d24e5aac2b627e40783c0b7/lifecycle-livedata-core-2.3.1 is not up-to-date because:
  No history is available.
Downloading https://dl.google.com/dl/android/maven2/androidx/print/print/1.0.0/print-1.0.0.aar to /tmp/gradle_download5187757554355123611bin
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/e70569f05e8a26fff609ffe6998fc2c5/jetified-glide-4.9.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/e70569f05e8a26fff609ffe6998fc2c5/jetified-glide-4.9.0.aar is not up-to-date because:
  No history is available.
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/35fd708d2cec6b4d1bed0bf930a41c96/jetified-glide-4.9.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/35fd708d2cec6b4d1bed0bf930a41c96/jetified-glide-4.9.0 is not up-to-date because:
  No history is available.
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.print/print/1.0.0/7722094652c48ebe27acc94d74a55e759e4635ff/print-1.0.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.print/print/1.0.0/7722094652c48ebe27acc94d74a55e759e4635ff/print-1.0.0.aar is not up-to-date because:
  No history is available.
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.print/print/1.0.0/7722094652c48ebe27acc94d74a55e759e4635ff/print-1.0.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.print/print/1.0.0/7722094652c48ebe27acc94d74a55e759e4635ff/print-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.annotation/annotation-experimental/1.0.0/fe9ba8247a591ebf8e16f0cf80af7a2045c981e0/annotation-experimental-1.0.0.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.annotation/annotation-experimental/1.0.0/fe9ba8247a591ebf8e16f0cf80af7a2045c981e0/annotation-experimental-1.0.0.aar is not up-to-date because:
  No history is available.
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/970cfc2edc409881989417e3e694a31a/material-1.3.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/970cfc2edc409881989417e3e694a31a/material-1.3.0 is not up-to-date because:
  No history is available.
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/1e5015581ae116eb110b8a074019a4c4/print-1.0.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/1e5015581ae116eb110b8a074019a4c4/print-1.0.0 is not up-to-date because:
  No history is available.
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/72548e0f29fdcb1219ef4138ee6477ae/jetified-annotation-experimental-1.0.0.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/72548e0f29fdcb1219ef4138ee6477ae/jetified-annotation-experimental-1.0.0.aar is not up-to-date because:
  No history is available.
WARNING: [XmlResourcesTransformer] No mapping for: android/support/FILE_PROVIDER_PATHS
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with LibrarySymbolTableTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/9627bc54960a84aa9fb130e914ac0687/jetified-annotation-experimental-1.0.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/9627bc54960a84aa9fb130e914ac0687/jetified-annotation-experimental-1.0.0 is not up-to-date because:
  No history is available.
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/da524581f52a11da8ab23a1e1968ff1a/jetified-lifecycle-viewmodel-savedstate-2.3.1.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/da524581f52a11da8ab23a1e1968ff1a/jetified-lifecycle-viewmodel-savedstate-2.3.1.aar is not up-to-date because:
  No history is available.
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/6cfdca821cb2bbe5db4151e27bdd22c0/appcompat-1.3.0 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/6cfdca821cb2bbe5db4151e27bdd22c0/appcompat-1.3.0 is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/b54a1f8a4b920dee3c32e35fc32a851f/jetified-lifecycle-viewmodel-savedstate-2.3.1 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/b54a1f8a4b920dee3c32e35fc32a851f/jetified-lifecycle-viewmodel-savedstate-2.3.1 is not up-to-date because:
  No history is available.
Downloading https://maven.aliyun.com/repository/jcenter/com/wang/avi/library/2.1.3/library-2.1.3.aar to /tmp/gradle_download9046677780133979630bin
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.wang.avi/library/2.1.3/7c76df3a028b697ed43ed348e93510879898430/library-2.1.3.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.wang.avi/library/2.1.3/7c76df3a028b697ed43ed348e93510879898430/library-2.1.3.aar is not up-to-date because:
  No history is available.
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/0386061df708bdc57377ec4e32cfdf44/jetified-library-2.1.3.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/0386061df708bdc57377ec4e32cfdf44/jetified-library-2.1.3.aar is not up-to-date because:
  No history is available.
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/08f16dd376b0dc4a4a1948bb49b582ec/jetified-library-2.1.3 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/08f16dd376b0dc4a4a1948bb49b582ec/jetified-library-2.1.3 is not up-to-date because:
  No history is available.
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/1a554f8fae0be0abed825e989230afc1/jetified-utilcode-1.30.6.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/1a554f8fae0be0abed825e989230afc1/jetified-utilcode-1.30.6.aar is not up-to-date because:
  No history is available.
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/caffcec760ffab3babf0f7ab49ba9acf/jetified-utilcode-1.30.6 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/caffcec760ffab3babf0f7ab49ba9acf/jetified-utilcode-1.30.6 is not up-to-date because:
  No history is available.
Downloading https://maven.aliyun.com/repository/jcenter/org/greenrobot/eventbus/3.3.1/eventbus-3.3.1.aar to /tmp/gradle_download1017557554875734576bin
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/org.greenrobot/eventbus/3.3.1/d1e95a73a95f2c02af363524fa7f90daccbc063/eventbus-3.3.1.aar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/org.greenrobot/eventbus/3.3.1/d1e95a73a95f2c02af363524fa7f90daccbc063/eventbus-3.3.1.aar is not up-to-date because:
  No history is available.
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with ExtractAarTransform
Caching disabled for ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/2a22e47728f97a7def699b9d3eb34621/jetified-eventbus-3.3.1.aar because:
  Build cache is disabled
ExtractAarTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/2a22e47728f97a7def699b9d3eb34621/jetified-eventbus-3.3.1.aar is not up-to-date because:
  No history is available.
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with LibrarySymbolTableTransform
Caching disabled for LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/02fcc4e44623c7143e9f65f21e10c292/jetified-eventbus-3.3.1 because:
  Build cache is disabled
LibrarySymbolTableTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/02fcc4e44623c7143e9f65f21e10c292/jetified-eventbus-3.3.1 is not up-to-date because:
  No history is available.
Transforming artifact android.jar with PlatformAttrTransform
Caching disabled for task ':library:generateDebugRFile' because:
  Build cache is disabled
Task ':library:generateDebugRFile' is not up-to-date because:
  No history is available.
The input changes require a full rebuild for incremental task ':library:generateDebugRFile'.
Unable do incremental execution: full task run
Transforming artifact android.jar with PlatformAttrTransform
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with ExtractAarTransform
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with LibrarySymbolTableTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with ExtractAarTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with LibrarySymbolTableTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with ExtractAarTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with LibrarySymbolTableTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with JetifyTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with ExtractAarTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with LibrarySymbolTableTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with JetifyTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with ExtractAarTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with LibrarySymbolTableTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with JetifyTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with ExtractAarTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with LibrarySymbolTableTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with JetifyTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with ExtractAarTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with LibrarySymbolTableTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with JetifyTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with ExtractAarTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with LibrarySymbolTableTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with JetifyTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with ExtractAarTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with LibrarySymbolTableTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with ExtractAarTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with LibrarySymbolTableTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with JetifyTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with ExtractAarTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with LibrarySymbolTableTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with JetifyTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with ExtractAarTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with LibrarySymbolTableTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with JetifyTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with ExtractAarTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with LibrarySymbolTableTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with JetifyTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with ExtractAarTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with LibrarySymbolTableTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with ExtractAarTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with LibrarySymbolTableTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with ExtractAarTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with LibrarySymbolTableTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with JetifyTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with ExtractAarTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with LibrarySymbolTableTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with JetifyTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with ExtractAarTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with LibrarySymbolTableTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with JetifyTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with ExtractAarTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with LibrarySymbolTableTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with JetifyTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with ExtractAarTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with LibrarySymbolTableTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with JetifyTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with ExtractAarTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with LibrarySymbolTableTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with ExtractAarTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with LibrarySymbolTableTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with ExtractAarTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with LibrarySymbolTableTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with JetifyTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with ExtractAarTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with LibrarySymbolTableTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with ExtractAarTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with LibrarySymbolTableTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with ExtractAarTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with LibrarySymbolTableTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with ExtractAarTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with LibrarySymbolTableTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with JetifyTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with ExtractAarTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with LibrarySymbolTableTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with JetifyTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with ExtractAarTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with LibrarySymbolTableTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with ExtractAarTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with LibrarySymbolTableTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with ExtractAarTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with LibrarySymbolTableTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with ExtractAarTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with LibrarySymbolTableTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with ExtractAarTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with LibrarySymbolTableTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with ExtractAarTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with LibrarySymbolTableTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with ExtractAarTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with ExtractAarTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with LibrarySymbolTableTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with ExtractAarTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with LibrarySymbolTableTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with ExtractAarTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with LibrarySymbolTableTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with ExtractAarTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with LibrarySymbolTableTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with ExtractAarTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with LibrarySymbolTableTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with JetifyTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with ExtractAarTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with LibrarySymbolTableTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with ExtractAarTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with LibrarySymbolTableTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with ExtractAarTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with LibrarySymbolTableTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with ExtractAarTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with LibrarySymbolTableTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with ExtractAarTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with LibrarySymbolTableTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with ExtractAarTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with LibrarySymbolTableTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with ExtractAarTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with LibrarySymbolTableTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with JetifyTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with ExtractAarTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with LibrarySymbolTableTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with JetifyTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with ExtractAarTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with LibrarySymbolTableTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with JetifyTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with ExtractAarTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with LibrarySymbolTableTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with JetifyTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with ExtractAarTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with LibrarySymbolTableTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with ExtractAarTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with LibrarySymbolTableTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with ExtractAarTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with LibrarySymbolTableTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with ExtractAarTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with LibrarySymbolTableTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with JetifyTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with ExtractAarTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with LibrarySymbolTableTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with JetifyTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with ExtractAarTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with LibrarySymbolTableTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with JetifyTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with ExtractAarTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with LibrarySymbolTableTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with JetifyTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with ExtractAarTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with LibrarySymbolTableTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with JetifyTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with ExtractAarTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with LibrarySymbolTableTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with JetifyTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with ExtractAarTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with LibrarySymbolTableTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with JetifyTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with ExtractAarTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with LibrarySymbolTableTransform

:library:mergeDebugShaders (Thread[Execution worker for ':',5,main]) started.

> Task :library:mergeDebugShaders
Task :library:mergeDebugShaders in app Starting
Caching disabled for task ':library:mergeDebugShaders' because:
  Build cache is disabled
Task ':library:mergeDebugShaders' is not up-to-date because:
  No history is available.
The input changes require a full rebuild for incremental task ':library:mergeDebugShaders'.
Unable do incremental execution: full task run
Task :library:mergeDebugShaders in app Finished
:library:mergeDebugShaders (Thread[Execution worker for ':',5,main]) completed. Took 0.002 secs.
:library:compileDebugShaders (Thread[Execution worker for ':',5,main]) started.

> Task :library:compileDebugShaders NO-SOURCE
Task :library:compileDebugShaders in app Starting
Skipping task ':library:compileDebugShaders' as it has no source files and no previous output files.
Task :library:compileDebugShaders in app Finished
:library:compileDebugShaders (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:generateDebugAssets (Thread[Execution worker for ':',5,main]) started.

> Task :library:generateDebugAssets UP-TO-DATE
Task :library:generateDebugAssets in app Starting
Skipping task ':library:generateDebugAssets' as it has no actions.
Task :library:generateDebugAssets in app Finished
:library:generateDebugAssets (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:packageDebugAssets (Thread[Execution worker for ':',5,main]) started.

> Task :library:packageDebugAssets
Task :library:packageDebugAssets in app Starting
Caching disabled for task ':library:packageDebugAssets' because:
  Build cache is disabled
Task ':library:packageDebugAssets' is not up-to-date because:
  No history is available.
The input changes require a full rebuild for incremental task ':library:packageDebugAssets'.
Unable do incremental execution: full task run
Task :library:packageDebugAssets in app Finished
:library:packageDebugAssets (Thread[Execution worker for ':',5,main]) completed. Took 0.001 secs.
:library:packageDebugRenderscript (Thread[Execution worker for ':',5,main]) started.

> Task :library:packageDebugRenderscript NO-SOURCE
Task :library:packageDebugRenderscript in app Starting
file or directory '/home/jitpack/build/library/src/main/rs', not found
file or directory '/home/jitpack/build/library/src/debug/rs', not found
Skipping task ':library:packageDebugRenderscript' as it has no source files and no previous output files.
Task :library:packageDebugRenderscript in app Finished
:library:packageDebugRenderscript (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:prepareLintJarForPublish (Thread[Execution worker for ':',5,main]) started.
:library:processDebugJavaRes (Thread[Execution worker for ':' Thread 2,5,main]) started.

> Task :library:prepareLintJarForPublish
Task :library:prepareLintJarForPublish in app Starting
Caching disabled for task ':library:prepareLintJarForPublish' because:
  Build cache is disabled
Task ':library:prepareLintJarForPublish' is not up-to-date because:
  No history is available.
Task :library:prepareLintJarForPublish in app Finished
:library:prepareLintJarForPublish (Thread[Execution worker for ':',5,main]) completed. Took 0.003 secs.

> Task :library:processDebugJavaRes NO-SOURCE
Task :library:processDebugJavaRes in app Starting
file or directory '/home/jitpack/build/library/src/main/resources', not found
file or directory '/home/jitpack/build/library/src/debug/resources', not found
Skipping task ':library:processDebugJavaRes' as it has no source files and no previous output files.
Task :library:processDebugJavaRes in app Finished
:library:processDebugJavaRes (Thread[Execution worker for ':' Thread 2,5,main]) completed. Took 0.0 secs.
:library:writeDebugAarMetadata (Thread[Execution worker for ':' Thread 2,5,main]) started.
:library:preReleaseBuild (Thread[Execution worker for ':',5,main]) started.

> Task :library:preReleaseBuild UP-TO-DATE
Task :library:preReleaseBuild in app Starting
Skipping task ':library:preReleaseBuild' as it has no actions.
Task :library:preReleaseBuild in app Finished
:library:preReleaseBuild (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:compileReleaseAidl (Thread[Execution worker for ':',5,main]) started.

> Task :library:compileReleaseAidl NO-SOURCE
Task :library:compileReleaseAidl in app Starting
file or directory '/home/jitpack/build/library/src/main/aidl', not found
file or directory '/home/jitpack/build/library/src/release/aidl', not found
Skipping task ':library:compileReleaseAidl' as it has no source files and no previous output files.
Task :library:compileReleaseAidl in app Finished
:library:compileReleaseAidl (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:mergeReleaseJniLibFolders (Thread[Execution worker for ':',5,main]) started.

> Task :library:writeDebugAarMetadata
Task :library:writeDebugAarMetadata in app Starting
Caching disabled for task ':library:writeDebugAarMetadata' because:
  Build cache is disabled
Task ':library:writeDebugAarMetadata' is not up-to-date because:
  No history is available.
Task :library:writeDebugAarMetadata in app Finished
:library:writeDebugAarMetadata (Thread[Execution worker for ':' Thread 2,5,main]) completed. Took 0.003 secs.

> Task :library:mergeReleaseJniLibFolders
Task :library:mergeReleaseJniLibFolders in app Starting
Caching disabled for task ':library:mergeReleaseJniLibFolders' because:
  Build cache is disabled
Task ':library:mergeReleaseJniLibFolders' is not up-to-date because:
  No history is available.
The input changes require a full rebuild for incremental task ':library:mergeReleaseJniLibFolders'.
Unable do incremental execution: full task run
Task :library:mergeReleaseJniLibFolders in app Finished
:library:mergeReleaseJniLibFolders (Thread[Execution worker for ':',5,main]) completed. Took 0.001 secs.
:library:mergeReleaseNativeLibs (Thread[Execution worker for ':',5,main]) started.

> Task :library:mergeReleaseNativeLibs NO-SOURCE
Task :library:mergeReleaseNativeLibs in app Starting
Skipping task ':library:mergeReleaseNativeLibs' as it has no source files and no previous output files.
Task :library:mergeReleaseNativeLibs in app Finished
:library:mergeReleaseNativeLibs (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:stripReleaseDebugSymbols (Thread[Execution worker for ':',5,main]) started.

> Task :library:stripReleaseDebugSymbols NO-SOURCE
Task :library:stripReleaseDebugSymbols in app Starting
file or directory '/home/jitpack/build/library/build/intermediates/merged_native_libs/release/out', not found
Skipping task ':library:stripReleaseDebugSymbols' as it has no source files and no previous output files.
Task :library:stripReleaseDebugSymbols in app Finished
:library:stripReleaseDebugSymbols (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:copyReleaseJniLibsProjectAndLocalJars (Thread[Execution worker for ':',5,main]) started.

> Task :library:copyReleaseJniLibsProjectAndLocalJars
Task :library:copyReleaseJniLibsProjectAndLocalJars in app Starting
Caching disabled for task ':library:copyReleaseJniLibsProjectAndLocalJars' because:
  Build cache is disabled
Task ':library:copyReleaseJniLibsProjectAndLocalJars' is not up-to-date because:
  No history is available.
Task :library:copyReleaseJniLibsProjectAndLocalJars in app Finished
:library:copyReleaseJniLibsProjectAndLocalJars (Thread[Execution worker for ':',5,main]) completed. Took 0.001 secs.
:library:compileReleaseRenderscript (Thread[Execution worker for ':',5,main]) started.

> Task :library:compileReleaseRenderscript NO-SOURCE
Task :library:compileReleaseRenderscript in app Starting
file or directory '/home/jitpack/build/library/src/main/rs', not found
file or directory '/home/jitpack/build/library/src/release/rs', not found
Skipping task ':library:compileReleaseRenderscript' as it has no source files and no previous output files.
Task :library:compileReleaseRenderscript in app Finished
:library:compileReleaseRenderscript (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:generateReleaseBuildConfig (Thread[Execution worker for ':',5,main]) started.

> Task :library:generateReleaseBuildConfig
Task :library:generateReleaseBuildConfig in app Starting
Caching disabled for task ':library:generateReleaseBuildConfig' because:
  Build cache is disabled
Task ':library:generateReleaseBuildConfig' is not up-to-date because:
  No history is available.
Task :library:generateReleaseBuildConfig in app Finished
:library:generateReleaseBuildConfig (Thread[Execution worker for ':',5,main]) completed. Took 0.001 secs.
:library:generateReleaseResValues (Thread[Execution worker for ':',5,main]) started.

> Task :library:generateReleaseResValues
Task :library:generateReleaseResValues in app Starting
Caching disabled for task ':library:generateReleaseResValues' because:
  Build cache is disabled
Task ':library:generateReleaseResValues' is not up-to-date because:
  No history is available.
Task :library:generateReleaseResValues in app Finished
:library:generateReleaseResValues (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:generateReleaseResources (Thread[Execution worker for ':',5,main]) started.

> Task :library:generateReleaseResources
Task :library:generateReleaseResources in app Starting
Skipping task ':library:generateReleaseResources' as it has no actions.
Task :library:generateReleaseResources in app Finished
:library:generateReleaseResources (Thread[Execution worker for ':',5,main]) completed. Took 0.0 secs.
:library:packageReleaseResources (Thread[Execution worker for ':',5,main]) started.

> Task :library:generateDebugRFile
Task :library:generateDebugRFile in app Finished
:library:generateDebugRFile (Thread[Execution worker for ':' Thread 4,5,main]) completed. Took 20.18 secs.

> Task :library:packageReleaseResources
Task :library:packageReleaseResources in app Starting
Caching disabled for task ':library:packageReleaseResources' because:
  Build cache is disabled
Task ':library:packageReleaseResources' is not up-to-date because:
  No history is available.
The input changes require a full rebuild for incremental task ':library:packageReleaseResources'.
Unable do incremental execution: full task run
Task :library:packageReleaseResources in app Finished
:library:packageReleaseResources (Thread[Execution worker for ':',5,main]) completed. Took 0.041 secs.
:library:compileDebugKotlin (Thread[Execution worker for ':',5,main]) started.

> Task :library:compileDebugKotlin
Task :library:compileDebugKotlin in app Starting
file or directory '/home/jitpack/build/library/src/debug/kotlin', not found
file or directory '/home/jitpack/build/library/src/debug/kotlin', not found
file or directory '/home/jitpack/build/library/src/debug/java', not found
file or directory '/home/jitpack/build/library/src/debug/java', not found
file or directory '/home/jitpack/build/library/src/main/kotlin', not found
file or directory '/home/jitpack/build/library/src/main/kotlin', not found
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with AarToClassTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with JetifyTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with AarToClassTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with JetifyTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with AarToClassTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with JetifyTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with AarToClassTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with JetifyTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with AarToClassTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with JetifyTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with AarToClassTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with JetifyTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with AarToClassTransform
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/a79bb8585b05c04e1475c3d16fdef16e/jetified-lifecycle-viewmodel-ktx-2.2.0.aar because:
  Build cache is disabled
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/0386061df708bdc57377ec4e32cfdf44/jetified-library-2.1.3.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/a79bb8585b05c04e1475c3d16fdef16e/jetified-lifecycle-viewmodel-ktx-2.2.0.aar is not up-to-date because:
  No history is available.
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/0386061df708bdc57377ec4e32cfdf44/jetified-library-2.1.3.aar is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with JetifyTransform
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/b9b54b36f67842fba0f1309c49080cbf/jetified-lifecycle-runtime-ktx-2.2.0.aar because:
  Build cache is disabled
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/3c68826afa41d0d2c73a9f2d0e53b9af/jetified-XXPermissions-18.63.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/3c68826afa41d0d2c73a9f2d0e53b9af/jetified-XXPermissions-18.63.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/1004b1aba5e493f14c25fa39cc883ac9/jetified-lifecycle-livedata-ktx-2.2.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/1004b1aba5e493f14c25fa39cc883ac9/jetified-lifecycle-livedata-ktx-2.2.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.swiperefreshlayout/swiperefreshlayout/1.1.0/2aeac64056fe6cc0420afad0b699a7f9257b8ebe/swiperefreshlayout-1.1.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.swiperefreshlayout/swiperefreshlayout/1.1.0/2aeac64056fe6cc0420afad0b699a7f9257b8ebe/swiperefreshlayout-1.1.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/53d121c8efefa4f5552c59a04325e338/jetified-xh-core-libs-1.0.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/53d121c8efefa4f5552c59a04325e338/jetified-xh-core-libs-1.0.0.aar is not up-to-date because:
  No history is available.
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/b9b54b36f67842fba0f1309c49080cbf/jetified-lifecycle-runtime-ktx-2.2.0.aar is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with AarToClassTransform
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/aba145152750690e2dbfacc13d63202a/jetified-core-ktx-1.2.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/aba145152750690e2dbfacc13d63202a/jetified-core-ktx-1.2.0.aar is not up-to-date because:
  No history is available.
Transforming artifact annotations-13.0.jar (org.jetbrains:annotations:13.0) with JetifyTransform
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/e70569f05e8a26fff609ffe6998fc2c5/jetified-glide-4.9.0.aar because:
  Build cache is disabled
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with JetifyTransform
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/e70569f05e8a26fff609ffe6998fc2c5/jetified-glide-4.9.0.aar is not up-to-date because:
  No history is available.
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with AarToClassTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with JetifyTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with AarToClassTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with JetifyTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with AarToClassTransform
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/de46d52f40aecf184137aa6218a714c5/jetified-lifecycle-livedata-core-ktx-2.2.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/de46d52f40aecf184137aa6218a714c5/jetified-lifecycle-livedata-core-ktx-2.2.0.aar is not up-to-date because:
  No history is available.
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with JetifyTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with AarToClassTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with AarToClassTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with AarToClassTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with JetifyTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with AarToClassTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with JetifyTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with AarToClassTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with JetifyTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with AarToClassTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with JetifyTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with AarToClassTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with JetifyTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with AarToClassTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with AarToClassTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with AarToClassTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with JetifyTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with AarToClassTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with AarToClassTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with AarToClassTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with AarToClassTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with JetifyTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with AarToClassTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with JetifyTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with AarToClassTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with AarToClassTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with AarToClassTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with JetifyTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with AarToClassTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with AarToClassTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with JetifyTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with AarToClassTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with JetifyTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with AarToClassTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with JetifyTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with AarToClassTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with JetifyTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with JetifyTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with AarToClassTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with JetifyTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with AarToClassTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with JetifyTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with AarToClassTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with JetifyTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with AarToClassTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with JetifyTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with AarToClassTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with JetifyTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with AarToClassTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with JetifyTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with IdentityTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with JetifyTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with AarToClassTransform
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.google.android.material/material/1.3.0/eb5f05b4af91bb9dac4a1abd1143ee9341f9145f/material-1.3.0.aar because:
  Build cache is disabled
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/13.0/919f0dfe192fb4e063e7dacadee7f8bb9a2672a9/annotations-13.0.jar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.google.android.material/material/1.3.0/eb5f05b4af91bb9dac4a1abd1143ee9341f9145f/material-1.3.0.aar is not up-to-date because:
  No history is available.
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/13.0/919f0dfe192fb4e063e7dacadee7f8bb9a2672a9/annotations-13.0.jar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.constraintlayout/constraintlayout/2.0.1/fab633b1873e5c1fbe49d919fab85ed1f8cf47ca/constraintlayout-2.0.1.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.constraintlayout/constraintlayout/2.0.1/fab633b1873e5c1fbe49d919fab85ed1f8cf47ca/constraintlayout-2.0.1.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.appcompat/appcompat/1.3.0/beebea39b2ef5604ee50838ab1b456de9d133140/appcompat-1.3.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.appcompat/appcompat/1.3.0/beebea39b2ef5604ee50838ab1b456de9d133140/appcompat-1.3.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.fragment/fragment/1.3.4/65b65aa70b61fd0fe3c57b7f603511d8231d85f6/fragment-1.3.4.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.fragment/fragment/1.3.4/65b65aa70b61fd0fe3c57b7f603511d8231d85f6/fragment-1.3.4.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/3d120b85154cd9bc6107bc32db08225c/jetified-viewpager2-1.0.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/3d120b85154cd9bc6107bc32db08225c/jetified-viewpager2-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/da55845c841a1074e11565978e11712f/jetified-activity-1.2.3.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/da55845c841a1074e11565978e11712f/jetified-activity-1.2.3.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/5877aab84fdf0d036db7431e3c31ea34/jetified-appcompat-resources-1.3.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/5877aab84fdf0d036db7431e3c31ea34/jetified-appcompat-resources-1.3.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.drawerlayout/drawerlayout/1.0.0/dd02c7e207136e1272b33815cc61e57676ed13a2/drawerlayout-1.0.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.drawerlayout/drawerlayout/1.0.0/dd02c7e207136e1272b33815cc61e57676ed13a2/drawerlayout-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.coordinatorlayout/coordinatorlayout/1.1.0/8eeb7baf75b9595d017642a460df5af3bb9fa4e1/coordinatorlayout-1.1.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.coordinatorlayout/coordinatorlayout/1.1.0/8eeb7baf75b9595d017642a460df5af3bb9fa4e1/coordinatorlayout-1.1.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.recyclerview/recyclerview/1.1.0/8b4f97752ddcbc712af46d208aebd46585cde63b/recyclerview-1.1.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.recyclerview/recyclerview/1.1.0/8b4f97752ddcbc712af46d208aebd46585cde63b/recyclerview-1.1.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.dynamicanimation/dynamicanimation/1.0.0/e980497a58fb319d471f3bb78d066b926a08ba8e/dynamicanimation-1.0.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.dynamicanimation/dynamicanimation/1.0.0/e980497a58fb319d471f3bb78d066b926a08ba8e/dynamicanimation-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.transition/transition/1.2.0/28003577e8b32f5417bfe899bbdc7a333dc81c9f/transition-1.2.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.transition/transition/1.2.0/28003577e8b32f5417bfe899bbdc7a333dc81c9f/transition-1.2.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.vectordrawable/vectordrawable-animated/1.1.0/fcda1161354501471c30a4e077af6b5c4d4eddc6/vectordrawable-animated-1.1.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.vectordrawable/vectordrawable-animated/1.1.0/fcda1161354501471c30a4e077af6b5c4d4eddc6/vectordrawable-animated-1.1.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.vectordrawable/vectordrawable/1.1.0/eac7a364fff534035a2a6cb17770a1288315f69f/vectordrawable-1.1.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.vectordrawable/vectordrawable/1.1.0/eac7a364fff534035a2a6cb17770a1288315f69f/vectordrawable-1.1.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.viewpager/viewpager/1.0.0/1f90e13820f96c2fb868f9674079a551678d68b2/viewpager-1.0.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.viewpager/viewpager/1.0.0/1f90e13820f96c2fb868f9674079a551678d68b2/viewpager-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.legacy/legacy-support-core-utils/1.0.0/9b9570042115da8629519090dfeb71df75da59fc/legacy-support-core-utils-1.0.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.legacy/legacy-support-core-utils/1.0.0/9b9570042115da8629519090dfeb71df75da59fc/legacy-support-core-utils-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.customview/customview/1.0.0/30f5ff6075d112f8076e733b24410e68159735b6/customview-1.0.0.aar because:
  Build cache is disabled
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.loader/loader/1.0.0/8af8b6cec0da85c207d03e15840e0722cbc71e70/loader-1.0.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.customview/customview/1.0.0/30f5ff6075d112f8076e733b24410e68159735b6/customview-1.0.0.aar is not up-to-date because:
  No history is available.
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.loader/loader/1.0.0/8af8b6cec0da85c207d03e15840e0722cbc71e70/loader-1.0.0.aar is not up-to-date because:
  No history is available.
Transforming artifact annotations-13.0.jar (org.jetbrains:annotations:13.0) with IdentityTransform
Caching disabled for IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/67c982b70dc227a547463fc1260aadde/jetified-annotations-13.0.jar because:
  Build cache is disabled
IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/67c982b70dc227a547463fc1260aadde/jetified-annotations-13.0.jar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.core/core/1.5.0/592da26c6f1263a51134546204033e0964e3c540/core-1.5.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.core/core/1.5.0/592da26c6f1263a51134546204033e0964e3c540/core-1.5.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-livedata/2.2.0/f37b9505a9617fd0b4d176360cbb4377c78f9634/lifecycle-livedata-2.2.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-livedata/2.2.0/f37b9505a9617fd0b4d176360cbb4377c78f9634/lifecycle-livedata-2.2.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-runtime/2.3.1/5786c819df8bcc1f050e9a752d2d0d85f87c4aed/lifecycle-runtime-2.3.1.aar because:
  Build cache is disabled
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/da524581f52a11da8ab23a1e1968ff1a/jetified-lifecycle-viewmodel-savedstate-2.3.1.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-runtime/2.3.1/5786c819df8bcc1f050e9a752d2d0d85f87c4aed/lifecycle-runtime-2.3.1.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.arch.core/core-runtime/2.1.0/2df0e03029caae7863ccb4825addaadc8ab6780c/core-runtime-2.1.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/da524581f52a11da8ab23a1e1968ff1a/jetified-lifecycle-viewmodel-savedstate-2.3.1.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-viewmodel/2.3.1/9b96f5276783647e1436154c7ae393b2a4e9c2c4/lifecycle-viewmodel-2.3.1.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.arch.core/core-runtime/2.1.0/2df0e03029caae7863ccb4825addaadc8ab6780c/core-runtime-2.1.0.aar is not up-to-date because:
  No history is available.
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-viewmodel/2.3.1/9b96f5276783647e1436154c7ae393b2a4e9c2c4/lifecycle-viewmodel-2.3.1.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.interpolator/interpolator/1.0.0/8a01fa254a23b9388571eb6334b03707c7d122d7/interpolator-1.0.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.interpolator/interpolator/1.0.0/8a01fa254a23b9388571eb6334b03707c7d122d7/interpolator-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/f9a785cf13ec1f214dac41ec695838d5/jetified-gifdecoder-4.9.0.aar because:
  Build cache is disabled
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/ab5252ab0a6c80d5cb5f45ac1eaf488d/jetified-savedstate-1.1.0.aar because:
  Build cache is disabled
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.cardview/cardview/1.0.0/158dbc2e2bc502815821191b04446b8f663c1874/cardview-1.0.0.aar because:
  Build cache is disabled
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.cursoradapter/cursoradapter/1.0.0/74014983a86b83cbce534dec4e7aa9312f5f5d82/cursoradapter-1.0.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.cardview/cardview/1.0.0/158dbc2e2bc502815821191b04446b8f663c1874/cardview-1.0.0.aar is not up-to-date because:
  No history is available.
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/ab5252ab0a6c80d5cb5f45ac1eaf488d/jetified-savedstate-1.1.0.aar is not up-to-date because:
  No history is available.
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/f9a785cf13ec1f214dac41ec695838d5/jetified-gifdecoder-4.9.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-livedata-core/2.3.1/d6d9279495dc234dc37cecf461b3b626825086ef/lifecycle-livedata-core-2.3.1.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.cursoradapter/cursoradapter/1.0.0/74014983a86b83cbce534dec4e7aa9312f5f5d82/cursoradapter-1.0.0.aar is not up-to-date because:
  No history is available.
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-livedata-core/2.3.1/d6d9279495dc234dc37cecf461b3b626825086ef/lifecycle-livedata-core-2.3.1.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.versionedparcelable/versionedparcelable/1.1.1/18e18071e7715679e0593c570217edeb5ca48b9e/versionedparcelable-1.1.1.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.versionedparcelable/versionedparcelable/1.1.1/18e18071e7715679e0593c570217edeb5ca48b9e/versionedparcelable-1.1.1.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.documentfile/documentfile/1.0.0/66104345c90cd8c2fd5ad2d3aad692b280e10c32/documentfile-1.0.0.aar because:
  Build cache is disabled
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.print/print/1.0.0/7722094652c48ebe27acc94d74a55e759e4635ff/print-1.0.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.documentfile/documentfile/1.0.0/66104345c90cd8c2fd5ad2d3aad692b280e10c32/documentfile-1.0.0.aar is not up-to-date because:
  No history is available.
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.print/print/1.0.0/7722094652c48ebe27acc94d74a55e759e4635ff/print-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.localbroadcastmanager/localbroadcastmanager/1.0.0/2734f31c8321e83ce6b60570d14777fc33cc2ece/localbroadcastmanager-1.0.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.localbroadcastmanager/localbroadcastmanager/1.0.0/2734f31c8321e83ce6b60570d14777fc33cc2ece/localbroadcastmanager-1.0.0.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/1a554f8fae0be0abed825e989230afc1/jetified-utilcode-1.30.6.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/1a554f8fae0be0abed825e989230afc1/jetified-utilcode-1.30.6.aar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/2a22e47728f97a7def699b9d3eb34621/jetified-eventbus-3.3.1.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/2a22e47728f97a7def699b9d3eb34621/jetified-eventbus-3.3.1.aar is not up-to-date because:
  No history is available.
Caching disabled for IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/3e55f828f651ac66ecf5b7707ad0e70e/jetified-annotations-4.9.0.jar because:
  Build cache is disabled
IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/3e55f828f651ac66ecf5b7707ad0e70e/jetified-annotations-4.9.0.jar is not up-to-date because:
  No history is available.
Caching disabled for AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/72548e0f29fdcb1219ef4138ee6477ae/jetified-annotation-experimental-1.0.0.aar because:
  Build cache is disabled
AarToClassTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/72548e0f29fdcb1219ef4138ee6477ae/jetified-annotation-experimental-1.0.0.aar is not up-to-date because:
  No history is available.
Downloading https://maven.aliyun.com/repository/jcenter/org/jetbrains/kotlinx/kotlinx-coroutines-android/1.3.0/kotlinx-coroutines-android-1.3.0.jar to /tmp/gradle_download6997840921944855696bin
Transforming artifact kotlinx-coroutines-android-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0) with JetifyTransform
Downloading https://maven.aliyun.com/repository/jcenter/org/jetbrains/kotlinx/kotlinx-coroutines-core/1.3.0/kotlinx-coroutines-core-1.3.0.jar to /tmp/gradle_download6606306784419575460bin
Downloading https://dl.google.com/dl/android/maven2/androidx/collection/collection/1.1.0/collection-1.1.0.jar to /tmp/gradle_download6739830224946381794bin
Downloading https://dl.google.com/dl/android/maven2/androidx/lifecycle/lifecycle-common/2.3.1/lifecycle-common-2.3.1.jar to /tmp/gradle_download6203590884836686563bin
Downloading https://dl.google.com/dl/android/maven2/androidx/arch/core/core-common/2.1.0/core-common-2.1.0.jar to /tmp/gradle_download1253691328830455415bin
Downloading https://dl.google.com/dl/android/maven2/androidx/constraintlayout/constraintlayout-solver/2.0.1/constraintlayout-solver-2.0.1.jar to /tmp/gradle_download3156410851315588934bin
Transforming artifact core-common-2.1.0.jar (androidx.arch.core:core-common:2.1.0) with JetifyTransform
Transforming artifact collection-1.1.0.jar (androidx.collection:collection:1.1.0) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.arch.core/core-common/2.1.0/b3152fc64428c9354344bd89848ecddc09b6f07e/core-common-2.1.0.jar because:
  Build cache is disabled
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlinx/kotlinx-coroutines-android/1.3.0/804a29e0b22cfb30e04487574ad1cb888daa716d/kotlinx-coroutines-android-1.3.0.jar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.arch.core/core-common/2.1.0/b3152fc64428c9354344bd89848ecddc09b6f07e/core-common-2.1.0.jar is not up-to-date because:
  No history is available.
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlinx/kotlinx-coroutines-android/1.3.0/804a29e0b22cfb30e04487574ad1cb888daa716d/kotlinx-coroutines-android-1.3.0.jar is not up-to-date because:
  No history is available.
Transforming artifact core-common-2.1.0.jar (androidx.arch.core:core-common:2.1.0) with IdentityTransform
Caching disabled for IdentityTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.arch.core/core-common/2.1.0/b3152fc64428c9354344bd89848ecddc09b6f07e/core-common-2.1.0.jar because:
  Build cache is disabled
IdentityTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.arch.core/core-common/2.1.0/b3152fc64428c9354344bd89848ecddc09b6f07e/core-common-2.1.0.jar is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-common-2.3.1.jar (androidx.lifecycle:lifecycle-common:2.3.1) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.collection/collection/1.1.0/1f27220b47669781457de0d600849a5de0e89909/collection-1.1.0.jar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.collection/collection/1.1.0/1f27220b47669781457de0d600849a5de0e89909/collection-1.1.0.jar is not up-to-date because:
  No history is available.
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-common/2.3.1/fc466261d52f4433863642fb40d12441ae274a98/lifecycle-common-2.3.1.jar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-common/2.3.1/fc466261d52f4433863642fb40d12441ae274a98/lifecycle-common-2.3.1.jar is not up-to-date because:
  No history is available.
Transforming artifact collection-1.1.0.jar (androidx.collection:collection:1.1.0) with IdentityTransform
Transforming artifact lifecycle-common-2.3.1.jar (androidx.lifecycle:lifecycle-common:2.3.1) with IdentityTransform
Caching disabled for IdentityTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.collection/collection/1.1.0/1f27220b47669781457de0d600849a5de0e89909/collection-1.1.0.jar because:
  Build cache is disabled
IdentityTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.collection/collection/1.1.0/1f27220b47669781457de0d600849a5de0e89909/collection-1.1.0.jar is not up-to-date because:
  No history is available.
Caching disabled for IdentityTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-common/2.3.1/fc466261d52f4433863642fb40d12441ae274a98/lifecycle-common-2.3.1.jar because:
  Build cache is disabled
IdentityTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-common/2.3.1/fc466261d52f4433863642fb40d12441ae274a98/lifecycle-common-2.3.1.jar is not up-to-date because:
  No history is available.
Transforming artifact kotlinx-coroutines-android-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0) with IdentityTransform
Caching disabled for IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/687201feaba849c080c01599303e5ff8/jetified-kotlinx-coroutines-android-1.3.0.jar because:
  Build cache is disabled
IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/687201feaba849c080c01599303e5ff8/jetified-kotlinx-coroutines-android-1.3.0.jar is not up-to-date because:
  No history is available.
Downloading https://dl.google.com/dl/android/maven2/androidx/annotation/annotation/1.3.0/annotation-1.3.0.jar to /tmp/gradle_download1068631828373867670bin
Transforming artifact annotation-1.3.0.jar (androidx.annotation:annotation:1.3.0) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.annotation/annotation/1.3.0/21f49f5f9b85fc49de712539f79123119740595/annotation-1.3.0.jar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.annotation/annotation/1.3.0/21f49f5f9b85fc49de712539f79123119740595/annotation-1.3.0.jar is not up-to-date because:
  No history is available.
Transforming artifact annotation-1.3.0.jar (androidx.annotation:annotation:1.3.0) with IdentityTransform
Caching disabled for IdentityTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.annotation/annotation/1.3.0/21f49f5f9b85fc49de712539f79123119740595/annotation-1.3.0.jar because:
  Build cache is disabled
IdentityTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.annotation/annotation/1.3.0/21f49f5f9b85fc49de712539f79123119740595/annotation-1.3.0.jar is not up-to-date because:
  No history is available.
Transforming artifact constraintlayout-solver-2.0.1.jar (androidx.constraintlayout:constraintlayout-solver:2.0.1) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.constraintlayout/constraintlayout-solver/2.0.1/30988fe2d77f3fe3bf7551bb8a8b795fad7e7226/constraintlayout-solver-2.0.1.jar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.constraintlayout/constraintlayout-solver/2.0.1/30988fe2d77f3fe3bf7551bb8a8b795fad7e7226/constraintlayout-solver-2.0.1.jar is not up-to-date because:
  No history is available.
Transforming artifact constraintlayout-solver-2.0.1.jar (androidx.constraintlayout:constraintlayout-solver:2.0.1) with IdentityTransform
Caching disabled for IdentityTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.constraintlayout/constraintlayout-solver/2.0.1/30988fe2d77f3fe3bf7551bb8a8b795fad7e7226/constraintlayout-solver-2.0.1.jar because:
  Build cache is disabled
IdentityTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/androidx.constraintlayout/constraintlayout-solver/2.0.1/30988fe2d77f3fe3bf7551bb8a8b795fad7e7226/constraintlayout-solver-2.0.1.jar is not up-to-date because:
  No history is available.
Downloading https://maven.aliyun.com/repository/jcenter/com/github/bumptech/glide/disklrucache/4.9.0/disklrucache-4.9.0.jar to /tmp/gradle_download2106907851656938124bin
Transforming artifact disklrucache-4.9.0.jar (com.github.bumptech.glide:disklrucache:4.9.0) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.github.bumptech.glide/disklrucache/4.9.0/cbb185635e8f265d6391c7d43118d3856574dc3a/disklrucache-4.9.0.jar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.github.bumptech.glide/disklrucache/4.9.0/cbb185635e8f265d6391c7d43118d3856574dc3a/disklrucache-4.9.0.jar is not up-to-date because:
  No history is available.
Transforming artifact disklrucache-4.9.0.jar (com.github.bumptech.glide:disklrucache:4.9.0) with IdentityTransform
Caching disabled for IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/3d5f668f7d6e12492989cecc7e754ab4/jetified-disklrucache-4.9.0.jar because:
  Build cache is disabled
IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/3d5f668f7d6e12492989cecc7e754ab4/jetified-disklrucache-4.9.0.jar is not up-to-date because:
  No history is available.
Transforming artifact kotlinx-coroutines-core-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlinx/kotlinx-coroutines-core/1.3.0/36fa8555d92456448ec19e64b00be830df9a7fb5/kotlinx-coroutines-core-1.3.0.jar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlinx/kotlinx-coroutines-core/1.3.0/36fa8555d92456448ec19e64b00be830df9a7fb5/kotlinx-coroutines-core-1.3.0.jar is not up-to-date because:
  No history is available.
Transforming artifact kotlinx-coroutines-core-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0) with IdentityTransform
Caching disabled for IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/a35b08c0178cc4cc9cc9f54f092162d1/jetified-kotlinx-coroutines-core-1.3.0.jar because:
  Build cache is disabled
IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/a35b08c0178cc4cc9cc9f54f092162d1/jetified-kotlinx-coroutines-core-1.3.0.jar is not up-to-date because:
  No history is available.
Downloading https://maven.aliyun.com/repository/jcenter/org/jetbrains/kotlin/kotlin-stdlib-common/1.5.21/kotlin-stdlib-common-1.5.21.jar to /tmp/gradle_download3498142735749284819bin
Transforming artifact kotlin-stdlib-common-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.21/cc8bf3586fd2ebcf234058b9440bb406e62dfacb/kotlin-stdlib-common-1.5.21.jar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.21/cc8bf3586fd2ebcf234058b9440bb406e62dfacb/kotlin-stdlib-common-1.5.21.jar is not up-to-date because:
  No history is available.
Transforming artifact kotlin-stdlib-common-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21) with IdentityTransform
Caching disabled for IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/a233c02c3fceb2aee6ee70c0371857e6/jetified-kotlin-stdlib-common-1.5.21.jar because:
  Build cache is disabled
IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/a233c02c3fceb2aee6ee70c0371857e6/jetified-kotlin-stdlib-common-1.5.21.jar is not up-to-date because:
  No history is available.
Downloading https://maven.aliyun.com/repository/jcenter/org/greenrobot/eventbus-java/3.3.1/eventbus-java-3.3.1.jar to /tmp/gradle_download1382243139932625506bin
Downloading https://maven.aliyun.com/repository/jcenter/com/sun/mail/android-mail/1.6.0/android-mail-1.6.0.jar to /tmp/gradle_download4520350157698277059bin
Downloading https://maven.aliyun.com/repository/jcenter/org/jetbrains/kotlin/kotlin-stdlib/1.5.21/kotlin-stdlib-1.5.21.jar to /tmp/gradle_download869140888916631956bin
Transforming artifact eventbus-java-3.3.1.jar (org.greenrobot:eventbus-java:3.3.1) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/org.greenrobot/eventbus-java/3.3.1/74487b0caceca6fcd1aff45d41a9cdc6910d7f5a/eventbus-java-3.3.1.jar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/org.greenrobot/eventbus-java/3.3.1/74487b0caceca6fcd1aff45d41a9cdc6910d7f5a/eventbus-java-3.3.1.jar is not up-to-date because:
  No history is available.
Transforming artifact eventbus-java-3.3.1.jar (org.greenrobot:eventbus-java:3.3.1) with IdentityTransform
Caching disabled for IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/8ae2f1fb55137265b15bbef2d9e0f3b3/jetified-eventbus-java-3.3.1.jar because:
  Build cache is disabled
IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/8ae2f1fb55137265b15bbef2d9e0f3b3/jetified-eventbus-java-3.3.1.jar is not up-to-date because:
  No history is available.
Transforming artifact kotlin-stdlib-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib:1.5.21) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/1.5.21/2f537cad7e9eeb9da73738c8812e1e4cf9b62e4e/kotlin-stdlib-1.5.21.jar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/1.5.21/2f537cad7e9eeb9da73738c8812e1e4cf9b62e4e/kotlin-stdlib-1.5.21.jar is not up-to-date because:
  No history is available.
Transforming artifact kotlin-stdlib-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib:1.5.21) with IdentityTransform
Caching disabled for IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/5f10188120e29af22f8bb8932e15cc0b/jetified-kotlin-stdlib-1.5.21.jar because:
  Build cache is disabled
IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/5f10188120e29af22f8bb8932e15cc0b/jetified-kotlin-stdlib-1.5.21.jar is not up-to-date because:
  No history is available.
Downloading https://maven.aliyun.com/repository/jcenter/com/sun/mail/android-activation/1.6.0/android-activation-1.6.0.jar to /tmp/gradle_download8492872918477511616bin
Downloading https://maven.aliyun.com/repository/jcenter/com/google/code/gson/gson/2.9.0/gson-2.9.0.jar to /tmp/gradle_download4775914782398114444bin
Transforming artifact android-activation-1.6.0.jar (com.sun.mail:android-activation:1.6.0) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.sun.mail/android-activation/1.6.0/1e6fde8f3e07a8bca56ec2afd6226bd3e28dd11c/android-activation-1.6.0.jar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.sun.mail/android-activation/1.6.0/1e6fde8f3e07a8bca56ec2afd6226bd3e28dd11c/android-activation-1.6.0.jar is not up-to-date because:
  No history is available.
Transforming artifact android-activation-1.6.0.jar (com.sun.mail:android-activation:1.6.0) with IdentityTransform
Caching disabled for IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/107f24b3cfde441467588861d0cbcdaf/jetified-android-activation-1.6.0.jar because:
  Build cache is disabled
IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/107f24b3cfde441467588861d0cbcdaf/jetified-android-activation-1.6.0.jar is not up-to-date because:
  No history is available.
Transforming artifact android-mail-1.6.0.jar (com.sun.mail:android-mail:1.6.0) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.sun.mail/android-mail/1.6.0/5cd030c77b594dac83e475923a293cd49a787594/android-mail-1.6.0.jar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.sun.mail/android-mail/1.6.0/5cd030c77b594dac83e475923a293cd49a787594/android-mail-1.6.0.jar is not up-to-date because:
  No history is available.
Transforming artifact android-mail-1.6.0.jar (com.sun.mail:android-mail:1.6.0) with IdentityTransform
Caching disabled for IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/03667cc4c2e389ecfd6896da918c35a3/jetified-android-mail-1.6.0.jar because:
  Build cache is disabled
IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/03667cc4c2e389ecfd6896da918c35a3/jetified-android-mail-1.6.0.jar is not up-to-date because:
  No history is available.
Transforming artifact gson-2.9.0.jar (com.google.code.gson:gson:2.9.0) with JetifyTransform
Caching disabled for JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson/2.9.0/8a1167e089096758b49f9b34066ef98b2f4b37aa/gson-2.9.0.jar because:
  Build cache is disabled
JetifyTransform: /home/jitpack/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson/2.9.0/8a1167e089096758b49f9b34066ef98b2f4b37aa/gson-2.9.0.jar is not up-to-date because:
  No history is available.
Transforming artifact gson-2.9.0.jar (com.google.code.gson:gson:2.9.0) with IdentityTransform
Caching disabled for IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/702ce7b949accea6ba6ee325b3ba25f6/jetified-gson-2.9.0.jar because:
  Build cache is disabled
IdentityTransform: /home/jitpack/.gradle/caches/transforms-2/files-2.1/702ce7b949accea6ba6ee325b3ba25f6/jetified-gson-2.9.0.jar is not up-to-date because:
  No history is available.
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with AarToClassTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with JetifyTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with AarToClassTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with JetifyTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with AarToClassTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with JetifyTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with AarToClassTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with JetifyTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with AarToClassTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with JetifyTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with AarToClassTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with JetifyTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with AarToClassTransform
Transforming artifact kotlinx-coroutines-android-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0) with JetifyTransform
Transforming artifact kotlinx-coroutines-android-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0) with IdentityTransform
Transforming artifact kotlinx-coroutines-core-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0) with JetifyTransform
Transforming artifact kotlinx-coroutines-core-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0) with IdentityTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with AarToClassTransform
Transforming artifact kotlin-stdlib-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib:1.5.21) with JetifyTransform
Transforming artifact kotlin-stdlib-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib:1.5.21) with IdentityTransform
Transforming artifact annotations-13.0.jar (org.jetbrains:annotations:13.0) with JetifyTransform
Transforming artifact annotations-13.0.jar (org.jetbrains:annotations:13.0) with IdentityTransform
Transforming artifact kotlin-stdlib-common-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21) with JetifyTransform
Transforming artifact kotlin-stdlib-common-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21) with IdentityTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with JetifyTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with AarToClassTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with JetifyTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with AarToClassTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with JetifyTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with AarToClassTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with JetifyTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with AarToClassTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with AarToClassTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with AarToClassTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with JetifyTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with AarToClassTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with JetifyTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with AarToClassTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with JetifyTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with AarToClassTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with JetifyTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with AarToClassTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with JetifyTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with AarToClassTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with AarToClassTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with AarToClassTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with JetifyTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with AarToClassTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with AarToClassTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with AarToClassTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with AarToClassTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with JetifyTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with AarToClassTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with JetifyTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with AarToClassTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with AarToClassTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with AarToClassTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with JetifyTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with AarToClassTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with AarToClassTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with JetifyTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with AarToClassTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with JetifyTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with AarToClassTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with JetifyTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with AarToClassTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with JetifyTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-common-2.3.1.jar (androidx.lifecycle:lifecycle-common:2.3.1) with JetifyTransform
Transforming artifact lifecycle-common-2.3.1.jar (androidx.lifecycle:lifecycle-common:2.3.1) with IdentityTransform
Transforming artifact core-common-2.1.0.jar (androidx.arch.core:core-common:2.1.0) with JetifyTransform
Transforming artifact core-common-2.1.0.jar (androidx.arch.core:core-common:2.1.0) with IdentityTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with JetifyTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with AarToClassTransform
Transforming artifact collection-1.1.0.jar (androidx.collection:collection:1.1.0) with JetifyTransform
Transforming artifact collection-1.1.0.jar (androidx.collection:collection:1.1.0) with IdentityTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with JetifyTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with AarToClassTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with JetifyTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with AarToClassTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with JetifyTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with AarToClassTransform
Transforming artifact annotation-1.3.0.jar (androidx.annotation:annotation:1.3.0) with JetifyTransform
Transforming artifact annotation-1.3.0.jar (androidx.annotation:annotation:1.3.0) with IdentityTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with JetifyTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with AarToClassTransform
Transforming artifact gson-2.9.0.jar (com.google.code.gson:gson:2.9.0) with JetifyTransform
Transforming artifact gson-2.9.0.jar (com.google.code.gson:gson:2.9.0) with IdentityTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with JetifyTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with AarToClassTransform
Transforming artifact eventbus-java-3.3.1.jar (org.greenrobot:eventbus-java:3.3.1) with JetifyTransform
Transforming artifact eventbus-java-3.3.1.jar (org.greenrobot:eventbus-java:3.3.1) with IdentityTransform
Transforming artifact disklrucache-4.9.0.jar (com.github.bumptech.glide:disklrucache:4.9.0) with JetifyTransform
Transforming artifact disklrucache-4.9.0.jar (com.github.bumptech.glide:disklrucache:4.9.0) with IdentityTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with JetifyTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with IdentityTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with JetifyTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with AarToClassTransform
Transforming artifact constraintlayout-solver-2.0.1.jar (androidx.constraintlayout:constraintlayout-solver:2.0.1) with JetifyTransform
Transforming artifact constraintlayout-solver-2.0.1.jar (androidx.constraintlayout:constraintlayout-solver:2.0.1) with IdentityTransform
Transforming artifact android-mail-1.6.0.jar (com.sun.mail:android-mail:1.6.0) with JetifyTransform
Transforming artifact android-mail-1.6.0.jar (com.sun.mail:android-mail:1.6.0) with IdentityTransform
Transforming artifact android-activation-1.6.0.jar (com.sun.mail:android-activation:1.6.0) with JetifyTransform
Transforming artifact android-activation-1.6.0.jar (com.sun.mail:android-activation:1.6.0) with IdentityTransform
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with AarToClassTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with JetifyTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with AarToClassTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with JetifyTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with AarToClassTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with JetifyTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with AarToClassTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with JetifyTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with AarToClassTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with JetifyTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with AarToClassTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with JetifyTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with AarToClassTransform
Transforming artifact kotlinx-coroutines-android-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0) with JetifyTransform
Transforming artifact kotlinx-coroutines-android-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0) with IdentityTransform
Transforming artifact kotlinx-coroutines-core-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0) with JetifyTransform
Transforming artifact kotlinx-coroutines-core-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0) with IdentityTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with AarToClassTransform
Transforming artifact kotlin-stdlib-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib:1.5.21) with JetifyTransform
Transforming artifact kotlin-stdlib-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib:1.5.21) with IdentityTransform
Transforming artifact annotations-13.0.jar (org.jetbrains:annotations:13.0) with JetifyTransform
Transforming artifact annotations-13.0.jar (org.jetbrains:annotations:13.0) with IdentityTransform
Transforming artifact kotlin-stdlib-common-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21) with JetifyTransform
Transforming artifact kotlin-stdlib-common-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21) with IdentityTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with JetifyTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with AarToClassTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with JetifyTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with AarToClassTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with JetifyTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with AarToClassTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with JetifyTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with AarToClassTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with AarToClassTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with AarToClassTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with JetifyTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with AarToClassTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with JetifyTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with AarToClassTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with JetifyTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with AarToClassTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with JetifyTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with AarToClassTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with JetifyTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with AarToClassTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with AarToClassTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with AarToClassTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with JetifyTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with AarToClassTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with AarToClassTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with AarToClassTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with AarToClassTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with JetifyTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with AarToClassTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with JetifyTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with AarToClassTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with AarToClassTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with AarToClassTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with JetifyTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with AarToClassTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with AarToClassTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with JetifyTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with AarToClassTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with JetifyTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with AarToClassTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with JetifyTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with AarToClassTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with JetifyTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-common-2.3.1.jar (androidx.lifecycle:lifecycle-common:2.3.1) with JetifyTransform
Transforming artifact lifecycle-common-2.3.1.jar (androidx.lifecycle:lifecycle-common:2.3.1) with IdentityTransform
Transforming artifact core-common-2.1.0.jar (androidx.arch.core:core-common:2.1.0) with JetifyTransform
Transforming artifact core-common-2.1.0.jar (androidx.arch.core:core-common:2.1.0) with IdentityTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with JetifyTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with AarToClassTransform
Transforming artifact collection-1.1.0.jar (androidx.collection:collection:1.1.0) with JetifyTransform
Transforming artifact collection-1.1.0.jar (androidx.collection:collection:1.1.0) with IdentityTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with JetifyTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with AarToClassTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with JetifyTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with AarToClassTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with JetifyTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with AarToClassTransform
Transforming artifact annotation-1.3.0.jar (androidx.annotation:annotation:1.3.0) with JetifyTransform
Transforming artifact annotation-1.3.0.jar (androidx.annotation:annotation:1.3.0) with IdentityTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with JetifyTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with AarToClassTransform
Transforming artifact gson-2.9.0.jar (com.google.code.gson:gson:2.9.0) with JetifyTransform
Transforming artifact gson-2.9.0.jar (com.google.code.gson:gson:2.9.0) with IdentityTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with JetifyTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with AarToClassTransform
Transforming artifact eventbus-java-3.3.1.jar (org.greenrobot:eventbus-java:3.3.1) with JetifyTransform
Transforming artifact eventbus-java-3.3.1.jar (org.greenrobot:eventbus-java:3.3.1) with IdentityTransform
Transforming artifact disklrucache-4.9.0.jar (com.github.bumptech.glide:disklrucache:4.9.0) with JetifyTransform
Transforming artifact disklrucache-4.9.0.jar (com.github.bumptech.glide:disklrucache:4.9.0) with IdentityTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with JetifyTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with IdentityTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with JetifyTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with AarToClassTransform
Transforming artifact constraintlayout-solver-2.0.1.jar (androidx.constraintlayout:constraintlayout-solver:2.0.1) with JetifyTransform
Transforming artifact constraintlayout-solver-2.0.1.jar (androidx.constraintlayout:constraintlayout-solver:2.0.1) with IdentityTransform
Transforming artifact android-mail-1.6.0.jar (com.sun.mail:android-mail:1.6.0) with JetifyTransform
Transforming artifact android-mail-1.6.0.jar (com.sun.mail:android-mail:1.6.0) with IdentityTransform
Transforming artifact android-activation-1.6.0.jar (com.sun.mail:android-activation:1.6.0) with JetifyTransform
Transforming artifact android-activation-1.6.0.jar (com.sun.mail:android-activation:1.6.0) with IdentityTransform
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with AarToClassTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with JetifyTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with AarToClassTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with JetifyTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with AarToClassTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with JetifyTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with AarToClassTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with JetifyTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with AarToClassTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with JetifyTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with AarToClassTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with JetifyTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with AarToClassTransform
Transforming artifact kotlinx-coroutines-android-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0) with JetifyTransform
Transforming artifact kotlinx-coroutines-android-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0) with IdentityTransform
Transforming artifact kotlinx-coroutines-core-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0) with JetifyTransform
Transforming artifact kotlinx-coroutines-core-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0) with IdentityTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with AarToClassTransform
Transforming artifact kotlin-stdlib-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib:1.5.21) with JetifyTransform
Transforming artifact kotlin-stdlib-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib:1.5.21) with IdentityTransform
Transforming artifact annotations-13.0.jar (org.jetbrains:annotations:13.0) with JetifyTransform
Transforming artifact annotations-13.0.jar (org.jetbrains:annotations:13.0) with IdentityTransform
Transforming artifact kotlin-stdlib-common-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21) with JetifyTransform
Transforming artifact kotlin-stdlib-common-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21) with IdentityTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with JetifyTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with AarToClassTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with JetifyTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with AarToClassTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with JetifyTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with AarToClassTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with JetifyTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with AarToClassTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with AarToClassTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with AarToClassTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with JetifyTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with AarToClassTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with JetifyTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with AarToClassTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with JetifyTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with AarToClassTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with JetifyTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with AarToClassTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with JetifyTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with AarToClassTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with AarToClassTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with AarToClassTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with JetifyTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with AarToClassTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with AarToClassTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with AarToClassTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with AarToClassTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with JetifyTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with AarToClassTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with JetifyTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with AarToClassTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with AarToClassTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with AarToClassTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with JetifyTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with AarToClassTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with AarToClassTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with JetifyTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with AarToClassTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with JetifyTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with AarToClassTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with JetifyTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with AarToClassTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with JetifyTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-common-2.3.1.jar (androidx.lifecycle:lifecycle-common:2.3.1) with JetifyTransform
Transforming artifact lifecycle-common-2.3.1.jar (androidx.lifecycle:lifecycle-common:2.3.1) with IdentityTransform
Transforming artifact core-common-2.1.0.jar (androidx.arch.core:core-common:2.1.0) with JetifyTransform
Transforming artifact core-common-2.1.0.jar (androidx.arch.core:core-common:2.1.0) with IdentityTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with JetifyTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with AarToClassTransform
Transforming artifact collection-1.1.0.jar (androidx.collection:collection:1.1.0) with JetifyTransform
Transforming artifact collection-1.1.0.jar (androidx.collection:collection:1.1.0) with IdentityTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with JetifyTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with AarToClassTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with JetifyTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with AarToClassTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with JetifyTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with AarToClassTransform
Transforming artifact annotation-1.3.0.jar (androidx.annotation:annotation:1.3.0) with JetifyTransform
Transforming artifact annotation-1.3.0.jar (androidx.annotation:annotation:1.3.0) with IdentityTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with JetifyTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with AarToClassTransform
Transforming artifact gson-2.9.0.jar (com.google.code.gson:gson:2.9.0) with JetifyTransform
Transforming artifact gson-2.9.0.jar (com.google.code.gson:gson:2.9.0) with IdentityTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with JetifyTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with AarToClassTransform
Transforming artifact eventbus-java-3.3.1.jar (org.greenrobot:eventbus-java:3.3.1) with JetifyTransform
Transforming artifact eventbus-java-3.3.1.jar (org.greenrobot:eventbus-java:3.3.1) with IdentityTransform
Transforming artifact disklrucache-4.9.0.jar (com.github.bumptech.glide:disklrucache:4.9.0) with JetifyTransform
Transforming artifact disklrucache-4.9.0.jar (com.github.bumptech.glide:disklrucache:4.9.0) with IdentityTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with JetifyTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with IdentityTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with JetifyTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with AarToClassTransform
Transforming artifact constraintlayout-solver-2.0.1.jar (androidx.constraintlayout:constraintlayout-solver:2.0.1) with JetifyTransform
Transforming artifact constraintlayout-solver-2.0.1.jar (androidx.constraintlayout:constraintlayout-solver:2.0.1) with IdentityTransform
Transforming artifact android-mail-1.6.0.jar (com.sun.mail:android-mail:1.6.0) with JetifyTransform
Transforming artifact android-mail-1.6.0.jar (com.sun.mail:android-mail:1.6.0) with IdentityTransform
Transforming artifact android-activation-1.6.0.jar (com.sun.mail:android-activation:1.6.0) with JetifyTransform
Transforming artifact android-activation-1.6.0.jar (com.sun.mail:android-activation:1.6.0) with IdentityTransform
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/org/jetbrains/kotlin/kotlin-reflect/1.5.21/kotlin-reflect-1.5.21.pom]
Resource missing. [HTTP GET: https://dl.google.com/dl/android/maven2/org/jetbrains/kotlin/kotlin-script-runtime/1.5.21/kotlin-script-runtime-1.5.21.pom]
Downloading https://maven.aliyun.com/repository/jcenter/org/jetbrains/kotlin/kotlin-script-runtime/1.5.21/kotlin-script-runtime-1.5.21.pom to /tmp/gradle_download4525656876129190614bin
Downloading https://maven.aliyun.com/repository/jcenter/org/jetbrains/kotlin/kotlin-reflect/1.5.21/kotlin-reflect-1.5.21.pom to /tmp/gradle_download5808490182031066140bin
Downloading https://maven.aliyun.com/repository/jcenter/org/jetbrains/kotlin/kotlin-reflect/1.5.21/kotlin-reflect-1.5.21.jar to /tmp/gradle_download3799866169723774150bin
Downloading https://maven.aliyun.com/repository/jcenter/org/jetbrains/kotlin/kotlin-script-runtime/1.5.21/kotlin-script-runtime-1.5.21.jar to /tmp/gradle_download3396081691877829969bin
Caching disabled for task ':library:compileDebugKotlin' because:
  Build cache is disabled
Task ':library:compileDebugKotlin' is not up-to-date because:
  No history is available.
The input changes require a full rebuild for incremental task ':library:compileDebugKotlin'.
file or directory '/home/jitpack/build/library/src/debug/kotlin', not found
file or directory '/home/jitpack/build/library/src/debug/kotlin', not found
file or directory '/home/jitpack/build/library/src/debug/java', not found
file or directory '/home/jitpack/build/library/src/debug/java', not found
file or directory '/home/jitpack/build/library/src/main/kotlin', not found
file or directory '/home/jitpack/build/library/src/main/kotlin', not found
file or directory '/home/jitpack/build/library/src/debug/java', not found
file or directory '/home/jitpack/build/library/build/generated/aidl_source_output_dir/debug/out', not found
file or directory '/home/jitpack/build/library/build/generated/renderscript_source_output_dir/debug/out', not found
file or directory '/home/jitpack/build/library/src/debug/kotlin', not found
file or directory '/home/jitpack/build/library/src/debug/kotlin', not found
file or directory '/home/jitpack/build/library/src/debug/java', not found
file or directory '/home/jitpack/build/library/src/debug/java', not found
file or directory '/home/jitpack/build/library/src/main/kotlin', not found
file or directory '/home/jitpack/build/library/src/main/kotlin', not found
file or directory '/home/jitpack/build/library/src/debug/java', not found
file or directory '/home/jitpack/build/library/build/generated/aidl_source_output_dir/debug/out', not found
file or directory '/home/jitpack/build/library/build/generated/renderscript_source_output_dir/debug/out', not found
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with AarToClassTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with JetifyTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with AarToClassTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with JetifyTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with AarToClassTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with JetifyTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with AarToClassTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with JetifyTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with AarToClassTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with JetifyTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with AarToClassTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with JetifyTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with AarToClassTransform
Transforming artifact kotlinx-coroutines-android-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0) with JetifyTransform
Transforming artifact kotlinx-coroutines-android-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0) with IdentityTransform
Transforming artifact kotlinx-coroutines-core-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0) with JetifyTransform
Transforming artifact kotlinx-coroutines-core-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0) with IdentityTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with AarToClassTransform
Transforming artifact kotlin-stdlib-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib:1.5.21) with JetifyTransform
Transforming artifact kotlin-stdlib-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib:1.5.21) with IdentityTransform
Transforming artifact annotations-13.0.jar (org.jetbrains:annotations:13.0) with JetifyTransform
Transforming artifact annotations-13.0.jar (org.jetbrains:annotations:13.0) with IdentityTransform
Transforming artifact kotlin-stdlib-common-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21) with JetifyTransform
Transforming artifact kotlin-stdlib-common-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21) with IdentityTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with JetifyTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with AarToClassTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with JetifyTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with AarToClassTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with JetifyTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with AarToClassTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with JetifyTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with AarToClassTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with AarToClassTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with AarToClassTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with JetifyTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with AarToClassTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with JetifyTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with AarToClassTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with JetifyTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with AarToClassTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with JetifyTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with AarToClassTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with JetifyTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with AarToClassTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with AarToClassTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with AarToClassTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with JetifyTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with AarToClassTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with AarToClassTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with AarToClassTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with AarToClassTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with JetifyTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with AarToClassTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with JetifyTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with AarToClassTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with AarToClassTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with AarToClassTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with JetifyTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with AarToClassTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with AarToClassTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with JetifyTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with AarToClassTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with JetifyTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with AarToClassTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with JetifyTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with AarToClassTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with JetifyTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-common-2.3.1.jar (androidx.lifecycle:lifecycle-common:2.3.1) with JetifyTransform
Transforming artifact lifecycle-common-2.3.1.jar (androidx.lifecycle:lifecycle-common:2.3.1) with IdentityTransform
Transforming artifact core-common-2.1.0.jar (androidx.arch.core:core-common:2.1.0) with JetifyTransform
Transforming artifact core-common-2.1.0.jar (androidx.arch.core:core-common:2.1.0) with IdentityTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with JetifyTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with AarToClassTransform
Transforming artifact collection-1.1.0.jar (androidx.collection:collection:1.1.0) with JetifyTransform
Transforming artifact collection-1.1.0.jar (androidx.collection:collection:1.1.0) with IdentityTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with JetifyTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with AarToClassTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with JetifyTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with AarToClassTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with JetifyTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with AarToClassTransform
Transforming artifact annotation-1.3.0.jar (androidx.annotation:annotation:1.3.0) with JetifyTransform
Transforming artifact annotation-1.3.0.jar (androidx.annotation:annotation:1.3.0) with IdentityTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with JetifyTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with AarToClassTransform
Transforming artifact gson-2.9.0.jar (com.google.code.gson:gson:2.9.0) with JetifyTransform
Transforming artifact gson-2.9.0.jar (com.google.code.gson:gson:2.9.0) with IdentityTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with JetifyTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with AarToClassTransform
Transforming artifact eventbus-java-3.3.1.jar (org.greenrobot:eventbus-java:3.3.1) with JetifyTransform
Transforming artifact eventbus-java-3.3.1.jar (org.greenrobot:eventbus-java:3.3.1) with IdentityTransform
Transforming artifact disklrucache-4.9.0.jar (com.github.bumptech.glide:disklrucache:4.9.0) with JetifyTransform
Transforming artifact disklrucache-4.9.0.jar (com.github.bumptech.glide:disklrucache:4.9.0) with IdentityTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with JetifyTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with IdentityTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with JetifyTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with AarToClassTransform
Transforming artifact constraintlayout-solver-2.0.1.jar (androidx.constraintlayout:constraintlayout-solver:2.0.1) with JetifyTransform
Transforming artifact constraintlayout-solver-2.0.1.jar (androidx.constraintlayout:constraintlayout-solver:2.0.1) with IdentityTransform
Transforming artifact android-mail-1.6.0.jar (com.sun.mail:android-mail:1.6.0) with JetifyTransform
Transforming artifact android-mail-1.6.0.jar (com.sun.mail:android-mail:1.6.0) with IdentityTransform
Transforming artifact android-activation-1.6.0.jar (com.sun.mail:android-activation:1.6.0) with JetifyTransform
Transforming artifact android-activation-1.6.0.jar (com.sun.mail:android-activation:1.6.0) with IdentityTransform
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with AarToClassTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with JetifyTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with AarToClassTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with JetifyTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with AarToClassTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with JetifyTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with AarToClassTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with JetifyTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with AarToClassTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with JetifyTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with AarToClassTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with JetifyTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with AarToClassTransform
Transforming artifact kotlinx-coroutines-android-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0) with JetifyTransform
Transforming artifact kotlinx-coroutines-android-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0) with IdentityTransform
Transforming artifact kotlinx-coroutines-core-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0) with JetifyTransform
Transforming artifact kotlinx-coroutines-core-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0) with IdentityTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with AarToClassTransform
Transforming artifact kotlin-stdlib-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib:1.5.21) with JetifyTransform
Transforming artifact kotlin-stdlib-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib:1.5.21) with IdentityTransform
Transforming artifact annotations-13.0.jar (org.jetbrains:annotations:13.0) with JetifyTransform
Transforming artifact annotations-13.0.jar (org.jetbrains:annotations:13.0) with IdentityTransform
Transforming artifact kotlin-stdlib-common-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21) with JetifyTransform
Transforming artifact kotlin-stdlib-common-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21) with IdentityTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with JetifyTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with AarToClassTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with JetifyTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with AarToClassTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with JetifyTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with AarToClassTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with JetifyTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with AarToClassTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with AarToClassTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with AarToClassTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with JetifyTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with AarToClassTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with JetifyTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with AarToClassTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with JetifyTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with AarToClassTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with JetifyTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with AarToClassTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with JetifyTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with AarToClassTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with AarToClassTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with AarToClassTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with JetifyTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with AarToClassTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with AarToClassTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with AarToClassTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with AarToClassTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with JetifyTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with AarToClassTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with JetifyTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with AarToClassTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with AarToClassTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with AarToClassTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with JetifyTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with AarToClassTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with AarToClassTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with JetifyTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with AarToClassTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with JetifyTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with AarToClassTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with JetifyTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with AarToClassTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with JetifyTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-common-2.3.1.jar (androidx.lifecycle:lifecycle-common:2.3.1) with JetifyTransform
Transforming artifact lifecycle-common-2.3.1.jar (androidx.lifecycle:lifecycle-common:2.3.1) with IdentityTransform
Transforming artifact core-common-2.1.0.jar (androidx.arch.core:core-common:2.1.0) with JetifyTransform
Transforming artifact core-common-2.1.0.jar (androidx.arch.core:core-common:2.1.0) with IdentityTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with JetifyTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with AarToClassTransform
Transforming artifact collection-1.1.0.jar (androidx.collection:collection:1.1.0) with JetifyTransform
Transforming artifact collection-1.1.0.jar (androidx.collection:collection:1.1.0) with IdentityTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with JetifyTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with AarToClassTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with JetifyTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with AarToClassTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with JetifyTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with AarToClassTransform
Transforming artifact annotation-1.3.0.jar (androidx.annotation:annotation:1.3.0) with JetifyTransform
Transforming artifact annotation-1.3.0.jar (androidx.annotation:annotation:1.3.0) with IdentityTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with JetifyTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with AarToClassTransform
Transforming artifact gson-2.9.0.jar (com.google.code.gson:gson:2.9.0) with JetifyTransform
Transforming artifact gson-2.9.0.jar (com.google.code.gson:gson:2.9.0) with IdentityTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with JetifyTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with AarToClassTransform
Transforming artifact eventbus-java-3.3.1.jar (org.greenrobot:eventbus-java:3.3.1) with JetifyTransform
Transforming artifact eventbus-java-3.3.1.jar (org.greenrobot:eventbus-java:3.3.1) with IdentityTransform
Transforming artifact disklrucache-4.9.0.jar (com.github.bumptech.glide:disklrucache:4.9.0) with JetifyTransform
Transforming artifact disklrucache-4.9.0.jar (com.github.bumptech.glide:disklrucache:4.9.0) with IdentityTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with JetifyTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with IdentityTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with JetifyTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with AarToClassTransform
Transforming artifact constraintlayout-solver-2.0.1.jar (androidx.constraintlayout:constraintlayout-solver:2.0.1) with JetifyTransform
Transforming artifact constraintlayout-solver-2.0.1.jar (androidx.constraintlayout:constraintlayout-solver:2.0.1) with IdentityTransform
Transforming artifact android-mail-1.6.0.jar (com.sun.mail:android-mail:1.6.0) with JetifyTransform
Transforming artifact android-mail-1.6.0.jar (com.sun.mail:android-mail:1.6.0) with IdentityTransform
Transforming artifact android-activation-1.6.0.jar (com.sun.mail:android-activation:1.6.0) with JetifyTransform
Transforming artifact android-activation-1.6.0.jar (com.sun.mail:android-activation:1.6.0) with IdentityTransform
Using Kotlin/JVM incremental compilation
file or directory '/home/jitpack/build/library/src/main/kotlin', not found
file or directory '/home/jitpack/build/library/src/main/kotlin', not found
file or directory '/home/jitpack/build/library/src/debug/kotlin', not found
file or directory '/home/jitpack/build/library/src/debug/kotlin', not found
file or directory '/home/jitpack/build/library/src/debug/java', not found
file or directory '/home/jitpack/build/library/src/debug/java', not found
file or directory '/home/jitpack/build/library/src/main/kotlin', not found
file or directory '/home/jitpack/build/library/src/main/kotlin', not found
file or directory '/home/jitpack/build/library/src/debug/java', not found
file or directory '/home/jitpack/build/library/build/generated/aidl_source_output_dir/debug/out', not found
file or directory '/home/jitpack/build/library/build/generated/renderscript_source_output_dir/debug/out', not found
i: starting the daemon as: /usr/lib/jvm/java-8-openjdk-amd64/bin/java -cp /home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-compiler-embeddable/1.5.21/40ddbcae9ff100473f95370c2d589ba3fc48eed5/kotlin-compiler-embeddable-1.5.21.jar:/home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-reflect/1.5.21/802f1f39735ae1eb2b75714a40fa19bb2e687e96/kotlin-reflect-1.5.21.jar:/home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/1.5.21/2f537cad7e9eeb9da73738c8812e1e4cf9b62e4e/kotlin-stdlib-1.5.21.jar:/home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-script-runtime/1.5.21/96d49e89873fde985750af354b6eabb60cfa999b/kotlin-script-runtime-1.5.21.jar:/home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-daemon-embeddable/1.5.21/17255809e66a940dfdf6289bccbdfb5a09f3145/kotlin-daemon-embeddable-1.5.21.jar:/home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.intellij.deps/trove4j/1.0.20181211/216c2e14b070f334479d800987affe4054cd563f/trove4j-1.0.20181211.jar:/home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/13.0/919f0dfe192fb4e063e7dacadee7f8bb9a2672a9/annotations-13.0.jar:/home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.21/cc8bf3586fd2ebcf234058b9440bb406e62dfacb/kotlin-stdlib-common-1.5.21.jar:/usr/lib/jvm/java-8-openjdk-amd64/lib/tools.jar -Djava.awt.headless=true -D$java.rmi.server.hostname=127.0.0.1 -Xmx2048m -Dkotlin.environment.keepalive -ea org.jetbrains.kotlin.daemon.KotlinCompileDaemon --daemon-runFilesPath /home/jitpack/.kotlin/daemon --daemon-autoshutdownIdleSeconds=7200 --daemon-compilerClasspath /home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-compiler-embeddable/1.5.21/40ddbcae9ff100473f95370c2d589ba3fc48eed5/kotlin-compiler-embeddable-1.5.21.jar:/home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-reflect/1.5.21/802f1f39735ae1eb2b75714a40fa19bb2e687e96/kotlin-reflect-1.5.21.jar:/home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/1.5.21/2f537cad7e9eeb9da73738c8812e1e4cf9b62e4e/kotlin-stdlib-1.5.21.jar:/home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-script-runtime/1.5.21/96d49e89873fde985750af354b6eabb60cfa999b/kotlin-script-runtime-1.5.21.jar:/home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-daemon-embeddable/1.5.21/17255809e66a940dfdf6289bccbdfb5a09f3145/kotlin-daemon-embeddable-1.5.21.jar:/home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.intellij.deps/trove4j/1.0.20181211/216c2e14b070f334479d800987affe4054cd563f/trove4j-1.0.20181211.jar:/home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/13.0/919f0dfe192fb4e063e7dacadee7f8bb9a2672a9/annotations-13.0.jar:/home/jitpack/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.5.21/cc8bf3586fd2ebcf234058b9440bb406e62dfacb/kotlin-stdlib-common-1.5.21.jar:/usr/lib/jvm/java-8-openjdk-amd64/lib/tools.jar --daemon-javaExecutable /usr/lib/jvm/java-8-openjdk-amd64/bin/java
i: [daemon] Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8 -Dhttps.protocols=TLSv1.2
i: Received the message signalling that the daemon is ready
i: new daemon started, trying to find it
i: found daemon on port 17871 (0 ms old), trying to connect
i: connected to the daemon. Daemon is using following 'java' executable to run itself: /usr/lib/jvm/java-8-openjdk-amd64/bin/java
Options for KOTLIN DAEMON: IncrementalCompilationOptions(super=CompilationOptions(compilerMode=INCREMENTAL_COMPILER, targetPlatform=JVM, reportCategories=[0], reportSeverity=2, requestedCompilationResults=[0]kotlinScriptExtensions=[kt, kts, java, java]), areFileChangesKnown=false, modifiedFiles=null, deletedFiles=null, workingDir=/home/jitpack/build/library/build/kotlin/compileDebugKotlin, multiModuleICSettings=MultiModuleICSettings(buildHistoryFile=/home/jitpack/build/library/build/kotlin/compileDebugKotlin/build-history.bin, useModuleDetection=true), usePreciseJavaTracking=trueoutputFiles=[/home/jitpack/build/library/build/tmp/kotlin-classes/debug, /home/jitpack/build/library/build/kotlin/compileDebugKotlin])
w: /home/jitpack/build/library/src/main/java/com/xcore/ui/base/BaseActivity.kt: (83, 30): 'setter for systemUiVisibility: Int' is deprecated. Deprecated in Java
w: /home/jitpack/build/library/src/main/java/com/xcore/ui/base/BaseActivity.kt: (83, 57): 'SYSTEM_UI_FLAG_LAYOUT_STABLE: Int' is deprecated. Deprecated in Java
w: /home/jitpack/build/library/src/main/java/com/xcore/ui/base/BaseActivity.kt: (84, 29): 'SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION: Int' is deprecated. Deprecated in Java
w: /home/jitpack/build/library/src/main/java/com/xcore/ui/base/BaseActivity.kt: (85, 29): 'SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN: Int' is deprecated. Deprecated in Java
w: /home/jitpack/build/library/src/main/java/com/xcore/ui/base/BaseActivity.kt: (86, 29): 'SYSTEM_UI_FLAG_HIDE_NAVIGATION: Int' is deprecated. Deprecated in Java
w: /home/jitpack/build/library/src/main/java/com/xcore/ui/base/BaseActivity.kt: (87, 29): 'SYSTEM_UI_FLAG_FULLSCREEN: Int' is deprecated. Deprecated in Java
w: /home/jitpack/build/library/src/main/java/com/xcore/ui/base/BaseActivity.kt: (88, 29): 'SYSTEM_UI_FLAG_IMMERSIVE_STICKY: Int' is deprecated. Deprecated in Java
w: /home/jitpack/build/library/src/main/java/com/xcore/ui/base/BaseActivity.kt: (96, 26): 'setter for systemUiVisibility: Int' is deprecated. Deprecated in Java
w: /home/jitpack/build/library/src/main/java/com/xcore/ui/base/BaseActivity.kt: (96, 63): 'SYSTEM_UI_FLAG_LIGHT_STATUS_BAR: Int' is deprecated. Deprecated in Java
w: /home/jitpack/build/library/src/main/java/com/xcore/ui/base/BaseActivity.kt: (169, 15): This declaration is experimental and its usage should be marked with '@kotlinx.coroutines.ExperimentalCoroutinesApi' or '@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)'
w: /home/jitpack/build/library/src/main/java/com/xcore/ui/base/BaseActivity.kt: (174, 22): This declaration is experimental and its usage should be marked with '@kotlinx.coroutines.ExperimentalCoroutinesApi' or '@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)'
Task :library:compileDebugKotlin in app Finished
:library:compileDebugKotlin (Thread[Execution worker for ':',5,main]) completed. Took 11.516 secs.
:library:compileDebugJavaWithJavac (Thread[Execution worker for ':',5,main]) started.

> Task :library:compileDebugJavaWithJavac FAILED
Task :library:compileDebugJavaWithJavac in app Starting
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with AarToClassTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with JetifyTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with AarToClassTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with JetifyTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with AarToClassTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with JetifyTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with AarToClassTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with JetifyTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with AarToClassTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with JetifyTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with AarToClassTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with JetifyTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with AarToClassTransform
Transforming artifact kotlinx-coroutines-android-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0) with JetifyTransform
Transforming artifact kotlinx-coroutines-android-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0) with IdentityTransform
Transforming artifact kotlinx-coroutines-core-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0) with JetifyTransform
Transforming artifact kotlinx-coroutines-core-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0) with IdentityTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with AarToClassTransform
Transforming artifact kotlin-stdlib-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib:1.5.21) with JetifyTransform
Transforming artifact kotlin-stdlib-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib:1.5.21) with IdentityTransform
Transforming artifact annotations-13.0.jar (org.jetbrains:annotations:13.0) with JetifyTransform
Transforming artifact annotations-13.0.jar (org.jetbrains:annotations:13.0) with IdentityTransform
Transforming artifact kotlin-stdlib-common-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21) with JetifyTransform
Transforming artifact kotlin-stdlib-common-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21) with IdentityTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with JetifyTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with AarToClassTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with JetifyTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with AarToClassTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with JetifyTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with AarToClassTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with JetifyTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with AarToClassTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with AarToClassTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with AarToClassTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with JetifyTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with AarToClassTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with JetifyTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with AarToClassTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with JetifyTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with AarToClassTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with JetifyTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with AarToClassTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with JetifyTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with AarToClassTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with AarToClassTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with AarToClassTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with JetifyTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with AarToClassTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with AarToClassTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with AarToClassTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with AarToClassTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with JetifyTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with AarToClassTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with JetifyTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with AarToClassTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with AarToClassTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with AarToClassTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with JetifyTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with AarToClassTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with AarToClassTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with JetifyTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with AarToClassTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with JetifyTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with AarToClassTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with JetifyTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with AarToClassTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with JetifyTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-common-2.3.1.jar (androidx.lifecycle:lifecycle-common:2.3.1) with JetifyTransform
Transforming artifact lifecycle-common-2.3.1.jar (androidx.lifecycle:lifecycle-common:2.3.1) with IdentityTransform
Transforming artifact core-common-2.1.0.jar (androidx.arch.core:core-common:2.1.0) with JetifyTransform
Transforming artifact core-common-2.1.0.jar (androidx.arch.core:core-common:2.1.0) with IdentityTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with JetifyTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with AarToClassTransform
Transforming artifact collection-1.1.0.jar (androidx.collection:collection:1.1.0) with JetifyTransform
Transforming artifact collection-1.1.0.jar (androidx.collection:collection:1.1.0) with IdentityTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with JetifyTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with AarToClassTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with JetifyTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with AarToClassTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with JetifyTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with AarToClassTransform
Transforming artifact annotation-1.3.0.jar (androidx.annotation:annotation:1.3.0) with JetifyTransform
Transforming artifact annotation-1.3.0.jar (androidx.annotation:annotation:1.3.0) with IdentityTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with JetifyTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with AarToClassTransform
Transforming artifact gson-2.9.0.jar (com.google.code.gson:gson:2.9.0) with JetifyTransform
Transforming artifact gson-2.9.0.jar (com.google.code.gson:gson:2.9.0) with IdentityTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with JetifyTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with AarToClassTransform
Transforming artifact eventbus-java-3.3.1.jar (org.greenrobot:eventbus-java:3.3.1) with JetifyTransform
Transforming artifact eventbus-java-3.3.1.jar (org.greenrobot:eventbus-java:3.3.1) with IdentityTransform
Transforming artifact disklrucache-4.9.0.jar (com.github.bumptech.glide:disklrucache:4.9.0) with JetifyTransform
Transforming artifact disklrucache-4.9.0.jar (com.github.bumptech.glide:disklrucache:4.9.0) with IdentityTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with JetifyTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with IdentityTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with JetifyTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with AarToClassTransform
Transforming artifact constraintlayout-solver-2.0.1.jar (androidx.constraintlayout:constraintlayout-solver:2.0.1) with JetifyTransform
Transforming artifact constraintlayout-solver-2.0.1.jar (androidx.constraintlayout:constraintlayout-solver:2.0.1) with IdentityTransform
Transforming artifact android-mail-1.6.0.jar (com.sun.mail:android-mail:1.6.0) with JetifyTransform
Transforming artifact android-mail-1.6.0.jar (com.sun.mail:android-mail:1.6.0) with IdentityTransform
Transforming artifact android-activation-1.6.0.jar (com.sun.mail:android-activation:1.6.0) with JetifyTransform
Transforming artifact android-activation-1.6.0.jar (com.sun.mail:android-activation:1.6.0) with IdentityTransform
Transforming artifact compiler-4.9.0.jar (com.github.bumptech.glide:compiler:4.9.0) with JetifyTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with JetifyTransform
Caching disabled for task ':library:compileDebugJavaWithJavac' because:
  Build cache is disabled
Task ':library:compileDebugJavaWithJavac' is not up-to-date because:
  No history is available.
The input changes require a full rebuild for incremental task ':library:compileDebugJavaWithJavac'.
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-runtime-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-runtime-ktx:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-ktx:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-viewmodel-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0) with AarToClassTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with JetifyTransform
Transforming artifact swiperefreshlayout-1.1.0.aar (androidx.swiperefreshlayout:swiperefreshlayout:1.1.0) with AarToClassTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with JetifyTransform
Transforming artifact library-2.1.3.aar (com.wang.avi:library:2.1.3) with AarToClassTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with JetifyTransform
Transforming artifact xh-core-libs-1.0.0.aar (com.github.ycnao:xh-core-libs:1.0.0) with AarToClassTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with JetifyTransform
Transforming artifact XXPermissions-18.63.aar (com.github.getActivity:XXPermissions:18.63) with AarToClassTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with JetifyTransform
Transforming artifact glide-4.9.0.aar (com.github.bumptech.glide:glide:4.9.0) with AarToClassTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with JetifyTransform
Transforming artifact core-ktx-1.2.0.aar (androidx.core:core-ktx:1.2.0) with AarToClassTransform
Transforming artifact kotlinx-coroutines-android-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0) with JetifyTransform
Transforming artifact kotlinx-coroutines-android-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.0) with IdentityTransform
Transforming artifact kotlinx-coroutines-core-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0) with JetifyTransform
Transforming artifact kotlinx-coroutines-core-1.3.0.jar (org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.0) with IdentityTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-core-ktx-2.2.0.aar (androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0) with AarToClassTransform
Transforming artifact kotlin-stdlib-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib:1.5.21) with JetifyTransform
Transforming artifact kotlin-stdlib-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib:1.5.21) with IdentityTransform
Transforming artifact annotations-13.0.jar (org.jetbrains:annotations:13.0) with JetifyTransform
Transforming artifact annotations-13.0.jar (org.jetbrains:annotations:13.0) with IdentityTransform
Transforming artifact kotlin-stdlib-common-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21) with JetifyTransform
Transforming artifact kotlin-stdlib-common-1.5.21.jar (org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21) with IdentityTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with JetifyTransform
Transforming artifact material-1.3.0.aar (com.google.android.material:material:1.3.0) with AarToClassTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with JetifyTransform
Transforming artifact constraintlayout-2.0.1.aar (androidx.constraintlayout:constraintlayout:2.0.1) with AarToClassTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with JetifyTransform
Transforming artifact appcompat-1.3.0.aar (androidx.appcompat:appcompat:1.3.0) with AarToClassTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with JetifyTransform
Transforming artifact viewpager2-1.0.0.aar (androidx.viewpager2:viewpager2:1.0.0) with AarToClassTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with AarToClassTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with JetifyTransform
Transforming artifact fragment-1.3.4.aar (androidx.fragment:fragment:1.3.4) with AarToClassTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with JetifyTransform
Transforming artifact activity-1.2.3.aar (androidx.activity:activity:1.2.3) with AarToClassTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with JetifyTransform
Transforming artifact appcompat-resources-1.3.0.aar (androidx.appcompat:appcompat-resources:1.3.0) with AarToClassTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with JetifyTransform
Transforming artifact drawerlayout-1.0.0.aar (androidx.drawerlayout:drawerlayout:1.0.0) with AarToClassTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with JetifyTransform
Transforming artifact coordinatorlayout-1.1.0.aar (androidx.coordinatorlayout:coordinatorlayout:1.1.0) with AarToClassTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with JetifyTransform
Transforming artifact dynamicanimation-1.0.0.aar (androidx.dynamicanimation:dynamicanimation:1.0.0) with AarToClassTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with AarToClassTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with JetifyTransform
Transforming artifact recyclerview-1.1.0.aar (androidx.recyclerview:recyclerview:1.1.0) with AarToClassTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with JetifyTransform
Transforming artifact transition-1.2.0.aar (androidx.transition:transition:1.2.0) with AarToClassTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-animated-1.1.0.aar (androidx.vectordrawable:vectordrawable-animated:1.1.0) with AarToClassTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with AarToClassTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with JetifyTransform
Transforming artifact vectordrawable-1.1.0.aar (androidx.vectordrawable:vectordrawable:1.1.0) with AarToClassTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with JetifyTransform
Transforming artifact viewpager-1.0.0.aar (androidx.viewpager:viewpager:1.0.0) with AarToClassTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with JetifyTransform
Transforming artifact legacy-support-core-utils-1.0.0.aar (androidx.legacy:legacy-support-core-utils:1.0.0) with AarToClassTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with AarToClassTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with JetifyTransform
Transforming artifact loader-1.0.0.aar (androidx.loader:loader:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with JetifyTransform
Transforming artifact customview-1.0.0.aar (androidx.customview:customview:1.0.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with JetifyTransform
Transforming artifact core-1.5.0.aar (androidx.core:core:1.5.0) with AarToClassTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with JetifyTransform
Transforming artifact lifecycle-runtime-2.3.1.aar (androidx.lifecycle:lifecycle-runtime:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with JetifyTransform
Transforming artifact lifecycle-livedata-2.2.0.aar (androidx.lifecycle:lifecycle-livedata:2.2.0) with AarToClassTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with JetifyTransform
Transforming artifact core-runtime-2.1.0.aar (androidx.arch.core:core-runtime:2.1.0) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-savedstate-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with JetifyTransform
Transforming artifact lifecycle-viewmodel-2.3.1.aar (androidx.lifecycle:lifecycle-viewmodel:2.3.1) with AarToClassTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with AarToClassTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with JetifyTransform
Transforming artifact interpolator-1.0.0.aar (androidx.interpolator:interpolator:1.0.0) with AarToClassTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with JetifyTransform
Transforming artifact gifdecoder-4.9.0.aar (com.github.bumptech.glide:gifdecoder:4.9.0) with AarToClassTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with JetifyTransform
Transforming artifact cursoradapter-1.0.0.aar (androidx.cursoradapter:cursoradapter:1.0.0) with AarToClassTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with JetifyTransform
Transforming artifact savedstate-1.1.0.aar (androidx.savedstate:savedstate:1.1.0) with AarToClassTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with JetifyTransform
Transforming artifact cardview-1.0.0.aar (androidx.cardview:cardview:1.0.0) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with JetifyTransform
Transforming artifact lifecycle-livedata-core-2.3.1.aar (androidx.lifecycle:lifecycle-livedata-core:2.3.1) with AarToClassTransform
Transforming artifact lifecycle-common-2.3.1.jar (androidx.lifecycle:lifecycle-common:2.3.1) with JetifyTransform
Transforming artifact lifecycle-common-2.3.1.jar (androidx.lifecycle:lifecycle-common:2.3.1) with IdentityTransform
Transforming artifact core-common-2.1.0.jar (androidx.arch.core:core-common:2.1.0) with JetifyTransform
Transforming artifact core-common-2.1.0.jar (androidx.arch.core:core-common:2.1.0) with IdentityTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with JetifyTransform
Transforming artifact versionedparcelable-1.1.1.aar (androidx.versionedparcelable:versionedparcelable:1.1.1) with AarToClassTransform
Transforming artifact collection-1.1.0.jar (androidx.collection:collection:1.1.0) with JetifyTransform
Transforming artifact collection-1.1.0.jar (androidx.collection:collection:1.1.0) with IdentityTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with JetifyTransform
Transforming artifact documentfile-1.0.0.aar (androidx.documentfile:documentfile:1.0.0) with AarToClassTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with JetifyTransform
Transforming artifact localbroadcastmanager-1.0.0.aar (androidx.localbroadcastmanager:localbroadcastmanager:1.0.0) with AarToClassTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with JetifyTransform
Transforming artifact print-1.0.0.aar (androidx.print:print:1.0.0) with AarToClassTransform
Transforming artifact annotation-1.3.0.jar (androidx.annotation:annotation:1.3.0) with JetifyTransform
Transforming artifact annotation-1.3.0.jar (androidx.annotation:annotation:1.3.0) with IdentityTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with JetifyTransform
Transforming artifact utilcode-1.30.6.aar (com.blankj:utilcode:1.30.6) with AarToClassTransform
Transforming artifact gson-2.9.0.jar (com.google.code.gson:gson:2.9.0) with JetifyTransform
Transforming artifact gson-2.9.0.jar (com.google.code.gson:gson:2.9.0) with IdentityTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with JetifyTransform
Transforming artifact eventbus-3.3.1.aar (org.greenrobot:eventbus:3.3.1) with AarToClassTransform
Transforming artifact eventbus-java-3.3.1.jar (org.greenrobot:eventbus-java:3.3.1) with JetifyTransform
Transforming artifact eventbus-java-3.3.1.jar (org.greenrobot:eventbus-java:3.3.1) with IdentityTransform
Transforming artifact disklrucache-4.9.0.jar (com.github.bumptech.glide:disklrucache:4.9.0) with JetifyTransform
Transforming artifact disklrucache-4.9.0.jar (com.github.bumptech.glide:disklrucache:4.9.0) with IdentityTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with JetifyTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with IdentityTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with JetifyTransform
Transforming artifact annotation-experimental-1.0.0.aar (androidx.annotation:annotation-experimental:1.0.0) with AarToClassTransform
Transforming artifact constraintlayout-solver-2.0.1.jar (androidx.constraintlayout:constraintlayout-solver:2.0.1) with JetifyTransform
Transforming artifact constraintlayout-solver-2.0.1.jar (androidx.constraintlayout:constraintlayout-solver:2.0.1) with IdentityTransform
Transforming artifact android-mail-1.6.0.jar (com.sun.mail:android-mail:1.6.0) with JetifyTransform
Transforming artifact android-mail-1.6.0.jar (com.sun.mail:android-mail:1.6.0) with IdentityTransform
Transforming artifact android-activation-1.6.0.jar (com.sun.mail:android-activation:1.6.0) with JetifyTransform
Transforming artifact android-activation-1.6.0.jar (com.sun.mail:android-activation:1.6.0) with IdentityTransform
Transforming artifact compiler-4.9.0.jar (com.github.bumptech.glide:compiler:4.9.0) with JetifyTransform
Transforming artifact annotations-4.9.0.jar (com.github.bumptech.glide:annotations:4.9.0) with JetifyTransform
Full recompilation is required because no incremental change information is available. This is usually caused by clean builds or changing compiler arguments.
file or directory '/home/jitpack/build/library/src/debug/java', not found
file or directory '/home/jitpack/build/library/build/generated/aidl_source_output_dir/debug/out', not found
file or directory '/home/jitpack/build/library/build/generated/renderscript_source_output_dir/debug/out', not found
Compiling with JDK Java compiler API.
Task :library:compileDebugJavaWithJavac in app Finished
:library:compileDebugJavaWithJavac (Thread[Execution worker for ':',5,main]) completed. Took 0.769 secs.
23 actionable tasks: 20 executed, 3 up-to-date
Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8 -Dhttps.protocols=TLSv1.2
An exception has occurred in the compiler (1.8.0_292). Please file a bug against the Java compiler via the Java bug reporting page (http://bugreport.java.com) after checking the Bug Database (http://bugs.java.com) for duplicates. Include your program and the following diagnostic in your report. Thank you.
java.lang.AssertionError: annotationType(): unrecognized Attribute name MODULE (class com.sun.tools.javac.util.UnsharedNameTable$NameImpl)
	at com.sun.tools.javac.util.Assert.error(Assert.java:133)
	at com.sun.tools.javac.code.TypeAnnotations.annotationType(TypeAnnotations.java:231)
	at com.sun.tools.javac.code.TypeAnnotations$TypeAnnotationPositions.separateAnnotationsKinds(TypeAnnotations.java:294)
	at com.sun.tools.javac.code.TypeAnnotations$TypeAnnotationPositions.visitMethodDef(TypeAnnotations.java:1066)
	at com.sun.tools.javac.tree.JCTree$JCMethodDecl.accept(JCTree.java:778)
	at com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:49)
	at com.sun.tools.javac.code.TypeAnnotations$TypeAnnotationPositions.scan(TypeAnnotations.java:275)
	at com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:57)
	at com.sun.tools.javac.code.TypeAnnotations$TypeAnnotationPositions.visitClassDef(TypeAnnotations.java:1042)
	at com.sun.tools.javac.tree.JCTree$JCClassDecl.accept(JCTree.java:693)
	at com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:49)
	at com.sun.tools.javac.code.TypeAnnotations$TypeAnnotationPositions.scan(TypeAnnotations.java:275)
	at com.sun.tools.javac.code.TypeAnnotations$1.run(TypeAnnotations.java:127)
	at com.sun.tools.javac.comp.Annotate.flush(Annotate.java:152)
	at com.sun.tools.javac.comp.Annotate.enterDone(Annotate.java:129)
	at com.sun.tools.javac.comp.Enter.complete(Enter.java:512)
	at com.sun.tools.javac.comp.Enter.main(Enter.java:471)
	at com.sun.tools.javac.main.JavaCompiler.enterTrees(JavaCompiler.java:982)
	at com.sun.tools.javac.main.JavaCompiler.compile(JavaCompiler.java:857)
	at com.sun.tools.javac.main.Main.compile(Main.java:523)
	at com.sun.tools.javac.api.JavacTaskImpl.doCall(JavacTaskImpl.java:129)
	at com.sun.tools.javac.api.JavacTaskImpl.call(JavacTaskImpl.java:138)
	at org.gradle.internal.compiler.java.IncrementalCompileTask.call(IncrementalCompileTask.java:74)
	at org.gradle.api.internal.tasks.compile.AnnotationProcessingCompileTask.call(AnnotationProcessingCompileTask.java:93)
	at org.gradle.api.internal.tasks.compile.ResourceCleaningCompilationTask.call(ResourceCleaningCompilationTask.java:57)
	at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:55)
	at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:40)
	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.delegateAndHandleErrors(NormalizingJavaCompiler.java:97)
	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:51)
	at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:37)
	at org.gradle.api.internal.tasks.compile.AnnotationProcessorDiscoveringCompiler.execute(AnnotationProcessorDiscoveringCompiler.java:51)
	at org.gradle.api.internal.tasks.compile.AnnotationProcessorDiscoveringCompiler.execute(AnnotationProcessorDiscoveringCompiler.java:37)
	at org.gradle.api.internal.tasks.compile.ModuleApplicationNameWritingCompiler.execute(ModuleApplicationNameWritingCompiler.java:46)
	at org.gradle.api.internal.tasks.compile.ModuleApplicationNameWritingCompiler.execute(ModuleApplicationNameWritingCompiler.java:36)
	at org.gradle.api.internal.tasks.compile.CleaningJavaCompiler.execute(CleaningJavaCompiler.java:53)
	at org.gradle.api.internal.tasks.compile.incremental.IncrementalCompilerFactory.lambda$createRebuildAllCompiler$0(IncrementalCompilerFactory.java:98)
	at org.gradle.api.internal.tasks.compile.incremental.IncrementalResultStoringCompiler.execute(IncrementalResultStoringCompiler.java:60)
	at org.gradle.api.internal.tasks.compile.incremental.IncrementalResultStoringCompiler.execute(IncrementalResultStoringCompiler.java:44)
	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler$2.call(CompileJavaBuildOperationReportingCompiler.java:59)
	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler$2.call(CompileJavaBuildOperationReportingCompiler.java:51)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor$CallableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:409)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor$CallableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:399)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor$1.execute(DefaultBuildOperationExecutor.java:157)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:242)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:150)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:94)
	at org.gradle.internal.operations.DelegatingBuildOperationExecutor.call(DelegatingBuildOperationExecutor.java:36)
	at org.gradle.api.internal.tasks.compile.CompileJavaBuildOperationReportingCompiler.execute(CompileJavaBuildOperationReportingCompiler.java:51)
	at org.gradle.api.tasks.compile.JavaCompile.performCompilation(JavaCompile.java:293)
	at org.gradle.api.tasks.compile.JavaCompile.performIncrementalCompilation(JavaCompile.java:203)
	at org.gradle.api.tasks.compile.JavaCompile.compile(JavaCompile.java:183)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:104)
	at org.gradle.api.internal.project.taskfactory.IncrementalInputsTaskAction.doExecute(IncrementalInputsTaskAction.java:32)
	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:42)
	at org.gradle.api.internal.project.taskfactory.AbstractIncrementalTaskAction.execute(AbstractIncrementalTaskAction.java:25)
	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:28)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter$3.run(ExecuteActionsTaskExecuter.java:569)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:395)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:387)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor$1.execute(DefaultBuildOperationExecutor.java:157)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:242)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:150)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:84)
	at org.gradle.internal.operations.DelegatingBuildOperationExecutor.run(DelegatingBuildOperationExecutor.java:31)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeAction(ExecuteActionsTaskExecuter.java:554)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeActions(ExecuteActionsTaskExecuter.java:537)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.access$300(ExecuteActionsTaskExecuter.java:108)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter$TaskExecution.executeWithPreviousOutputFiles(ExecuteActionsTaskExecuter.java:278)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter$TaskExecution.execute(ExecuteActionsTaskExecuter.java:267)
	at org.gradle.internal.execution.steps.ExecuteStep.lambda$execute$0(ExecuteStep.java:32)
	at java.util.Optional.map(Optional.java:215)
	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:32)
	at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:26)
	at org.gradle.internal.execution.steps.CleanupOutputsStep.execute(CleanupOutputsStep.java:67)
	at org.gradle.internal.execution.steps.CleanupOutputsStep.execute(CleanupOutputsStep.java:36)
	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:49)
	at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:34)
	at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:43)
	at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:73)
	at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:54)
	at org.gradle.internal.execution.steps.CatchExceptionStep.execute(CatchExceptionStep.java:34)
	at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:44)
	at org.gradle.internal.execution.steps.SnapshotOutputsStep.execute(SnapshotOutputsStep.java:54)
	at org.gradle.internal.execution.steps.SnapshotOutputsStep.execute(SnapshotOutputsStep.java:38)
	at org.gradle.internal.execution.steps.BroadcastChangingOutputsStep.execute(BroadcastChangingOutputsStep.java:49)
	at org.gradle.internal.execution.steps.CacheStep.executeWithoutCache(CacheStep.java:159)
	at org.gradle.internal.execution.steps.CacheStep.execute(CacheStep.java:72)
	at org.gradle.internal.execution.steps.CacheStep.execute(CacheStep.java:43)
	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:44)
	at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:33)
	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:38)
	at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:24)
	at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:92)
	at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$0(SkipUpToDateStep.java:85)
	at java.util.Optional.map(Optional.java:215)
	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
	at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:39)
	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:76)
	at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:37)
	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:36)
	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:26)
	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:94)
	at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:49)
	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:79)
	at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:53)
	at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:74)
	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.lambda$execute$2(SkipEmptyWorkStep.java:78)
	at java.util.Optional.orElseGet(Optional.java:267)
	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:78)
	at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:34)
	at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:39)
	at org.gradle.internal.execution.steps.LoadExecutionStateStep.execute(LoadExecutionStateStep.java:40)
	at org.gradle.internal.execution.steps.LoadExecutionStateStep.execute(LoadExecutionStateStep.java:28)
	at org.gradle.internal.execution.impl.DefaultWorkExecutor.execute(DefaultWorkExecutor.java:33)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:194)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:186)
	at org.gradle.api.internal.tasks.execution.CleanupStaleOutputsExecuter.execute(CleanupStaleOutputsExecuter.java:114)
	at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
	at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:62)
	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:56)
	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor$CallableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:409)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor$CallableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:399)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor$1.execute(DefaultBuildOperationExecutor.java:157)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:242)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:150)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:94)
	at org.gradle.internal.operations.DelegatingBuildOperationExecutor.call(DelegatingBuildOperationExecutor.java:36)
	at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
	at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:41)
	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:356)
	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:343)
	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:336)
	at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:322)
	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.lambda$run$0(DefaultPlanExecutor.java:127)
	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:191)
	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.executeNextNode(DefaultPlanExecutor.java:182)
	at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:124)
	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:48)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:56)
	at java.lang.Thread.run(Thread.java:748)

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':library:compileDebugJavaWithJavac'.
> Compilation failed; see the compiler error output for details.

* Try:
Run with --stacktrace option to get the stack trace. Run with --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 40s
Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8 -Dhttps.protocols=TLSv1.2
Archive: com.github.ycnao:library:unspecified
Build tool exit code: 1
⚠️ Build failed. See errors above.
2026-11-20T07:22:01.830740462Z
Exit code: 1
