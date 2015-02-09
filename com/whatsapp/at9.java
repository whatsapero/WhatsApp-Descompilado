package com.whatsapp;

class at9 implements Runnable {
    final mu a;
    final int b;

    at9(mu muVar, int i) {
        this.a = muVar;
        this.b = i;
    }

    public void run() {
        GroupChatInfo.a(this.a.j, this.b);
    }
}
