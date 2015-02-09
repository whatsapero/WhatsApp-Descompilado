package com.whatsapp;

import java.util.ArrayList;

class sc implements Runnable {
    final a5 a;
    final ArrayList b;

    sc(a5 a5Var, ArrayList arrayList) {
        this.a = a5Var;
        this.b = arrayList;
    }

    public void run() {
        if (!this.a.isCancelled()) {
            ContactInfo.b(this.a.a, this.b);
        }
    }
}
