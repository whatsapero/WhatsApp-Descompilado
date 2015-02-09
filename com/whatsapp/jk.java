package com.whatsapp;

import java.util.ArrayList;

class jk implements Runnable {
    final ArrayList a;
    final ji b;

    public void run() {
        if (!this.b.isCancelled()) {
            GroupChatInfo.b(this.b.a, this.a);
        }
    }

    jk(ji jiVar, ArrayList arrayList) {
        this.b = jiVar;
        this.a = arrayList;
    }
}
