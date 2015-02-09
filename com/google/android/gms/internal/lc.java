package com.google.android.gms.internal;

import android.content.Context;
import java.util.regex.Pattern;

public final class lc {
    private static Pattern Oe;

    static {
        Oe = null;
    }

    public static boolean K(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static int aS(int i) {
        return i / 1000;
    }

    public static int aT(int i) {
        return (i % 1000) / 100;
    }

    public static boolean aU(int i) {
        return aT(i) == 3;
    }
}
