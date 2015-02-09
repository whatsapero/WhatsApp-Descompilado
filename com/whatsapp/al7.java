package com.whatsapp;

import com.whatsapp.protocol.b;
import java.util.Collection;
import java.util.HashMap;

class al7 implements Runnable {
    final Collection a;
    final boolean b;
    final l7 c;

    al7(l7 l7Var, Collection collection, boolean z) {
        this.c = l7Var;
        this.a = collection;
        this.b = z;
    }

    public void run() {
        int i = m3.d;
        HashMap hashMap = new HashMap();
        for (b bVar : this.a) {
            hashMap.put(bVar.e.c, Integer.valueOf(l7.a(this.c, bVar, this.b)));
            if (i != 0) {
                break;
            }
        }
        l7.b(this.c).post(new nz(this, hashMap));
    }
}
