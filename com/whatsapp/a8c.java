package com.whatsapp;

class a8c implements Runnable {
    final MediaView a;

    public void run() {
        this.a.finish();
    }

    a8c(MediaView mediaView) {
        this.a = mediaView;
    }
}
