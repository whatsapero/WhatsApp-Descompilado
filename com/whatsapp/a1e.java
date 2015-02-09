package com.whatsapp;

class a1e implements Runnable {
    final amq a;

    a1e(amq com_whatsapp_amq) {
        this.a = com_whatsapp_amq;
    }

    public void run() {
        AccountInfoActivity.c(this.a.a);
    }
}
