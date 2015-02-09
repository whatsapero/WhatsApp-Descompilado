package com.whatsapp;

class d4 implements Runnable {
    private boolean a;
    private final PhotoView b;
    private float c;
    private boolean d;
    private float e;
    private long f;

    public void a() {
        this.d = false;
        this.a = true;
    }

    public d4(PhotoView photoView) {
        this.f = -1;
        this.b = photoView;
    }

    public boolean a(float f, float f2) {
        if (this.d) {
            return false;
        }
        this.f = -1;
        this.e = f;
        this.c = f2;
        this.a = false;
        this.d = true;
        this.b.postDelayed(this, 250);
        return true;
    }

    public void run() {
        if (!this.a) {
            float f;
            float f2;
            float f3;
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f != -1) {
                f = (float) (currentTimeMillis - this.f);
            } else {
                f = 0.0f;
            }
            if (this.f == -1) {
                this.f = currentTimeMillis;
            }
            if (f >= 100.0f) {
                f2 = this.e;
                f3 = this.c;
                if (App.az == 0) {
                    f = f3;
                    f3 = f2;
                    PhotoView.a(this.b, f3, f);
                    this.e -= f3;
                    this.c -= f;
                    if (this.e == 0.0f && this.c == 0.0f) {
                        a();
                    }
                    if (!this.a) {
                        this.b.post(this);
                    }
                }
            }
            f3 = (this.e / (100.0f - f)) * 10.0f;
            f2 = (this.c / (100.0f - f)) * 10.0f;
            if (Math.abs(f3) > Math.abs(this.e) || f3 == Float.NaN) {
                f = this.e;
            } else {
                f = f3;
            }
            if (Math.abs(f2) > Math.abs(this.c) || f2 == Float.NaN) {
                f3 = f;
                f = this.c;
            } else {
                f3 = f;
                f = f2;
            }
            PhotoView.a(this.b, f3, f);
            this.e -= f3;
            this.c -= f;
            a();
            if (!this.a) {
                this.b.post(this);
            }
        }
    }
}
