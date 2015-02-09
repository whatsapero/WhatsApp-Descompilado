package com.whatsapp;

import com.whatsapp.protocol.cn;
import java.util.Comparator;

class alz implements Comparator {
    final double a;
    final double b;
    final po c;

    public int a(cn cnVar, cn cnVar2) {
        return Double.compare(((cnVar.b - this.a) * (cnVar.b - this.a)) + ((cnVar.e - this.b) * (cnVar.e - this.b)), ((cnVar2.b - this.a) * (cnVar2.b - this.a)) + ((cnVar2.e - this.b) * (cnVar2.e - this.b)));
    }

    alz(po poVar, double d, double d2) {
        this.c = poVar;
        this.a = d;
        this.b = d2;
    }

    public int compare(Object obj, Object obj2) {
        return a((cn) obj, (cn) obj2);
    }
}
