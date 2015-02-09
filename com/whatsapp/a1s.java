package com.whatsapp;

import java.util.ArrayList;

class a1s implements Runnable {
    final ArrayList a;
    final jo b;

    public void run() {
        if (!this.b.a.isCancelled()) {
            ListChatInfo.a(this.b.a.a, this.a);
        }
    }

    a1s(jo joVar, ArrayList arrayList) {
        this.b = joVar;
        this.a = arrayList;
    }
}
