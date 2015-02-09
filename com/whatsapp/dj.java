package com.whatsapp;

class dj implements Runnable {
    final am a;

    dj(am amVar) {
        this.a = amVar;
    }

    public void run() {
        alq com_whatsapp_al6 = new al6(this, am.g(this.a), false);
        am.e(this.a).removeCallbacks(am.d(this.a));
        am.e(this.a).postDelayed(am.d(this.a), am.c(this.a));
        App.a(com_whatsapp_al6);
        am.i(this.a);
    }
}
