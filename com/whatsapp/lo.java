package com.whatsapp;

import java.util.ArrayList;

class lo implements Runnable {
    final a5 a;
    final ArrayList b;

    public void run() {
        if (!this.a.isCancelled()) {
            ContactInfo.a(this.a.a, this.b);
        }
    }

    lo(a5 a5Var, ArrayList arrayList) {
        this.a = a5Var;
        this.b = arrayList;
    }
}
