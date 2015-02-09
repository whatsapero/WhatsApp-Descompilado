package com.google;

final class fR extends fB {
    private final int b;
    private final int c;

    fR(int i, int i2, int i3) {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw ga.a();
        }
        this.b = i2;
        this.c = i3;
    }

    boolean e() {
        return this.b == 10;
    }

    int b() {
        return this.c;
    }

    int c() {
        return this.b;
    }

    boolean d() {
        return this.c == 10;
    }
}
