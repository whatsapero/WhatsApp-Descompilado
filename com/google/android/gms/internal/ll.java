package com.google.android.gms.internal;

import android.os.Build.VERSION;

public final class ll {
    private static boolean aW(int i) {
        return VERSION.SDK_INT >= i;
    }

    public static boolean ig() {
        return aW(11);
    }

    public static boolean ii() {
        return aW(13);
    }

    public static boolean ij() {
        return aW(14);
    }
}
