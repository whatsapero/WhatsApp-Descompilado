package com.whatsapp.camera;

class v implements Runnable {
    final AutofocusOverlay a;

    v(AutofocusOverlay autofocusOverlay) {
        this.a = autofocusOverlay;
    }

    public void run() {
        this.a.setVisibility(8);
    }
}
