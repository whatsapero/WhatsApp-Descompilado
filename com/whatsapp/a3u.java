package com.whatsapp;

import com.whatsapp.Voip.CallState;

/* synthetic */ class a3u {
    static final int[] a;

    static {
        a = new int[CallState.values().length];
        try {
            a[CallState.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[CallState.CALLING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[CallState.ACCEPT_RECEIVED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[CallState.ACCEPT_SENT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[CallState.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[CallState.RECEIVED_CALL.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
    }
}
