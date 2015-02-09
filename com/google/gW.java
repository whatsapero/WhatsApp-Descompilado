package com.google;

abstract class gW extends fG {
    gW(da daVar) {
        super(daVar);
    }

    public String c() {
        if (b().d() != 60) {
            throw gv.a();
        }
        StringBuilder stringBuilder = new StringBuilder();
        b(stringBuilder, 5);
        b(stringBuilder, 45, 15);
        return stringBuilder.toString();
    }
}
