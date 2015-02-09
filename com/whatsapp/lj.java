package com.whatsapp;

class lj implements Runnable {
    final VoiceService a;
    final int b;

    public void run() {
        if (App.aa == 3) {
            App.b(this.a.getApplicationContext(), this.b, 1);
        }
    }

    lj(VoiceService voiceService, int i) {
        this.a = voiceService;
        this.b = i;
    }
}
