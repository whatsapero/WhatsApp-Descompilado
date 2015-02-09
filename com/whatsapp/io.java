package com.whatsapp;

import java.util.ArrayList;

class io implements Runnable {
    final ArrayList a;
    final ji b;

    public void run() {
        if (!this.b.isCancelled()) {
            GroupChatInfo.a(this.b.a, this.a);
        }
    }

    io(ji jiVar, ArrayList arrayList) {
        this.b = jiVar;
        this.a = arrayList;
    }
}
