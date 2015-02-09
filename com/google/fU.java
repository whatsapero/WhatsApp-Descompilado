package com.google;

final class fu extends fB {
    private final boolean b;
    private final String c;
    private final int d;

    String c() {
        return this.c;
    }

    int b() {
        return this.d;
    }

    fu(int i, String str) {
        super(i);
        this.c = str;
        this.b = false;
        this.d = 0;
    }

    fu(int i, String str, int i2) {
        super(i);
        this.b = true;
        this.d = i2;
        this.c = str;
    }

    boolean d() {
        return this.b;
    }
}
