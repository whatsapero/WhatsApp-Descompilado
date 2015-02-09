package com.whatsapp.util;

import java.io.Closeable;

public class OpusPlayer implements Closeable {
    private long a;

    private native void allocateNative(String str);

    private native void freeNative();

    public native long getCurrentPosition();

    public native long getLength();

    public native boolean isPlaying();

    public native void pause();

    public native void prepare();

    public native void resume();

    public native void seek(long j);

    public native void start();

    public native void stop();

    protected void finalize() {
        super.finalize();
        if (this.a != 0) {
            freeNative();
        }
    }

    public void close() {
        freeNative();
    }

    public OpusPlayer(String str) {
        allocateNative(str);
    }
}
