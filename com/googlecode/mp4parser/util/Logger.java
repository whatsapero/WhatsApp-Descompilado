package com.googlecode.mp4parser.util;

public abstract class Logger {
    public abstract void logDebug(String str);

    public abstract void logError(String str);

    public abstract void logWarn(String str);

    public static Logger getLogger(Class clz) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new AndroidLogger(clz.getSimpleName()) : new JuliLogger(clz.getSimpleName());
    }
}
