package com.google.android.gms.internal;

public abstract class i extends h {
    static boolean kN;
    private static long startTime;

    class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    static {
        startTime = 0;
        kN = false;
    }
}
