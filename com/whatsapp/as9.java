package com.whatsapp;

class as9 implements Runnable {
    final MediaView a;

    as9(MediaView mediaView) {
        this.a = mediaView;
    }

    public void run() {
        this.a.finish();
    }
}
