package com.whatsapp;

/* synthetic */ class aml {
    static final int[] a;

    static {
        a = new int[ui.values().length];
        try {
            a[ui.TYPED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[ui.AUTO_DETECTED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[ui.TAPPED_LINK.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[ui.RETRIED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
