package com.whatsapp.camera;

class a8 implements Runnable {
    final ShutterOverlay a;

    a8(ShutterOverlay shutterOverlay) {
        this.a = shutterOverlay;
    }

    public void run() {
        ShutterOverlay.a(this.a, false);
        this.a.invalidate();
    }
}
