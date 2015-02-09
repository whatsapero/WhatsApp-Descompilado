package com.whatsapp;

import java.util.ArrayList;

final class e9 implements Runnable {
    final m8 a;

    e9(m8 m8Var) {
        this.a = m8Var;
    }

    public void run() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.a);
        App.P.a(arrayList);
    }
}
