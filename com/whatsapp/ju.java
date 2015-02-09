package com.whatsapp;

import android.net.NetworkInfo;

public final class ju {
    private final boolean a;
    private final boolean b;
    private final int c;

    public ju(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    public int a() {
        return this.c;
    }

    public static ju a(NetworkInfo networkInfo) {
        return networkInfo != null ? new ju(networkInfo.isConnected(), networkInfo.isRoaming(), networkInfo.getType()) : new ju(false, false, -1);
    }
}
