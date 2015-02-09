package com.whatsapp.util;

import java.io.Closeable;

public class OpusRecorder implements Closeable {
    private long a;

    private native void allocateNative(String str);

    private native void freeNative();

    public native void prepare();

    public native void start();

    public native void stop();

    public OpusRecorder(String str) {
        allocateNative(str);
    }

    protected void finalize() {
        super.finalize();
        if (this.a != 0) {
            freeNative();
        }
    }

    public void close() {
        freeNative();
    }
}
