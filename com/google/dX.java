package com.google;

import java.io.Serializable;
import java.util.Comparator;

final class dx implements Comparator, Serializable {
    dx(eN eNVar) {
        this();
    }

    public int a(bY bYVar, bY bYVar2) {
        boolean z = false;
        boolean z2 = gv.c;
        float c = bYVar2.c() - bYVar.c();
        int i = ((double) c) < 0.0d ? -1 : ((double) c) > 0.0d ? 1 : 0;
        if (z2) {
            if (!gC.a) {
                z = true;
            }
            gC.a = z;
        }
        return i;
    }

    private dx() {
    }

    public int compare(Object obj, Object obj2) {
        return a((bY) obj, (bY) obj2);
    }
}
