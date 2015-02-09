package com.whatsapp;

public class h7 {
    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
