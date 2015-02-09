package com.whatsapp.wallpaper;

class g implements Runnable {
    final Runnable a;
    final float b;
    final long c;
    final float d;
    final float e;
    final float f;
    final float g;
    final ImageViewTouchBase h;

    g(ImageViewTouchBase imageViewTouchBase, float f, long j, float f2, float f3, float f4, float f5, Runnable runnable) {
        this.h = imageViewTouchBase;
        this.b = f;
        this.c = j;
        this.d = f2;
        this.g = f3;
        this.f = f4;
        this.e = f5;
        this.a = runnable;
    }

    public void run() {
        float min = Math.min(this.b, (float) (System.currentTimeMillis() - this.c));
        this.h.a(this.d + (this.g * min), this.f, this.e);
        if (this.a != null) {
            this.a.run();
        }
        if (min < this.b) {
            this.h.j.post(this);
        }
    }
}
