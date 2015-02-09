package com.google;

import java.util.Map;

public final class cg extends cd {
    private final cd i;

    public cu a(int i, da daVar, int[] iArr, Map map) {
        return a(this.i.a(i, daVar, iArr, map));
    }

    protected int a(da daVar, int[] iArr, StringBuilder stringBuilder) {
        return this.i.a(daVar, iArr, stringBuilder);
    }

    public cu a(W w, Map map) {
        return a(this.i.a(w, map));
    }

    R a() {
        return R.UPC_A;
    }

    private static cu a(cu cuVar) {
        String c = cuVar.c();
        if (c.charAt(0) == '0') {
            return new cu(c.substring(1), null, cuVar.b(), R.UPC_A);
        }
        throw ga.a();
    }

    public cg() {
        this.i = new cs();
    }

    public cu a(int i, da daVar, Map map) {
        return a(this.i.a(i, daVar, map));
    }
}
