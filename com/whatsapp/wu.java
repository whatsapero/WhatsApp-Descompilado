package com.whatsapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class wu implements Runnable {
    final boolean a;
    final String b;

    wu(String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    public void run() {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        App.P.e((ArrayList) arrayList2);
        Collection h = App.P.h();
        h.removeAll(arrayList2);
        arrayList2.addAll(h);
        App.P.c((ArrayList) arrayList2);
        App.a(this.b, App.b(arrayList2, arrayList, true), this.a ? 8 : 2, this.a);
    }
}
