package com.whatsapp.gallerypicker;

import java.util.Comparator;

class ad implements Comparator {
    public int compare(Object obj, Object obj2) {
        return a((b5) obj, (b5) obj2);
    }

    private ad() {
    }

    public int a(b5 b5Var, b5 b5Var2) {
        if (b5Var.e != b5Var2.e) {
            return b5Var.e < b5Var2.e ? 1 : -1;
        } else {
            return b5Var.d - b5Var2.d;
        }
    }

    ad(ai aiVar) {
        this();
    }
}
