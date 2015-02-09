package com.whatsapp;

class l_ implements Runnable {
    private float a;
    private final PhotoView b;
    private float c;
    private long d;
    private boolean e;
    private float f;
    private boolean g;

    public void a(float f) {
        if (!this.g) {
            this.f = f;
            this.c = this.f / 300.0f;
            this.a = 0.0f;
            this.d = -1;
            this.e = false;
            this.g = true;
            this.b.post(this);
        }
    }

    public void run() {
        if (!this.e) {
            if (this.a != this.f) {
                long j;
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d != -1) {
                    j = currentTimeMillis - this.d;
                } else {
                    j = 0;
                }
                float f = ((float) j) * this.c;
                if ((this.a < this.f && this.a + f > this.f) || (this.a > this.f && this.a + f < this.f)) {
                    f = this.f - this.a;
                }
                this.b.a(f, false);
                this.a = f + this.a;
                if (this.a == this.f) {
                    a();
                }
                this.d = currentTimeMillis;
            }
            if (!this.e) {
                this.b.post(this);
            }
        }
    }

    public void a() {
        this.g = false;
        this.e = true;
        PhotoView.a(this.b, (float) Math.round(PhotoView.a(this.b)));
        PhotoView.b(this.b, true);
        this.b.requestLayout();
        this.b.invalidate();
    }

    public l_(PhotoView photoView) {
        this.b = photoView;
    }
}
