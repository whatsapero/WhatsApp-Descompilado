package com.whatsapp;

/* synthetic */ class fd {
    static final int[] a;

    static {
        a = new int[atf.values().length];
        try {
            a[atf.PAYMENT_COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[atf.WHATSAPP_INITIATED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[atf.EXTENSION_REQUESTED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
