package com.whatsapp;

class rp implements Runnable {
    final m8 a;
    final BlockList b;

    rp(BlockList blockList, m8 m8Var) {
        this.b = blockList;
        this.a = m8Var;
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.a(this.b, false, this.a.e);
        } catch (InterruptedException e) {
        }
    }
}
