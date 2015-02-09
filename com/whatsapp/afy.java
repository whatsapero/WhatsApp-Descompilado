package com.whatsapp;

class afy implements Runnable {
    final mu a;

    afy(mu muVar) {
        this.a = muVar;
    }

    public void run() {
        GroupChatInfo.i(this.a.j).setVisibility(8);
        GroupChatInfo.c(this.a.j).setVisibility(0);
    }
}
