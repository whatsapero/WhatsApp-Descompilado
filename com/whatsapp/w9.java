package com.whatsapp;

/* synthetic */ class w9 {
    static final int[] a;

    static {
        a = new int[rk.values().length];
        try {
            a[rk.FAILED_IO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[rk.FAILED_INSUFFICIENT_SPACE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[rk.FAILED_BAD_MEDIA.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[rk.FAILED_OOM.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[rk.FAILED_NO_PERMISSIONS.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
