package com.google;

public final class ga extends gC {
    private static final ga b;

    private ga() {
    }

    public static ga a() {
        return b;
    }

    static {
        b = new ga();
    }
}
