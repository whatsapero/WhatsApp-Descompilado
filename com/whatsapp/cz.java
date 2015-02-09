package com.whatsapp;

import com.whatsapp.protocol.b;
import java.util.Collection;
import java.util.HashMap;

class cz implements Runnable {
    final l7 a;
    final Collection b;

    cz(l7 l7Var, Collection collection) {
        this.a = l7Var;
        this.b = collection;
    }

    public void run() {
        int i = m3.d;
        HashMap hashMap = new HashMap();
        for (b bVar : this.b) {
            hashMap.put(bVar.e.c, Integer.valueOf(l7.a(this.a, bVar, false)));
            if (i != 0) {
                break;
            }
        }
        l7.b(this.a).post(new x6(this, hashMap));
    }
}
