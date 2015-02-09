package com.whatsapp;

class _4 implements Runnable {
    private float a;
    private float b;
    private long c;
    private float d;
    private float e;
    private final PhotoView f;
    private float g;
    private boolean h;
    private boolean i;
    private boolean j;

    public boolean a(float f, float f2, float f3, float f4) {
        if (this.i) {
            return false;
        }
        boolean z;
        this.d = f3;
        this.b = f4;
        this.g = f2;
        this.c = System.currentTimeMillis();
        this.a = f;
        if (this.g > this.a) {
            z = true;
        } else {
            z = false;
        }
        this.j = z;
        this.e = (this.g - this.a) / 200.0f;
        this.i = true;
        this.h = false;
        this.f.post(this);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r6_this = this;
        r1 = 1;
        r0 = r6.h;
        if (r0 == 0) goto L_0x0006;
    L_0x0005:
        return;
    L_0x0006:
        r2 = java.lang.System.currentTimeMillis();
        r4 = r6.c;
        r2 = r2 - r4;
        r0 = r6.a;
        r4 = r6.e;
        r2 = (float) r2;
        r2 = r2 * r4;
        r0 = r0 + r2;
        r2 = r6.f;
        r3 = r6.d;
        r4 = r6.b;
        com.whatsapp.PhotoView.a(r2, r0, r3, r4, r1);
        r2 = r6.g;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x002e;
    L_0x0023:
        r2 = r6.j;
        r3 = r6.g;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x0046;
    L_0x002b:
        r0 = r1;
    L_0x002c:
        if (r2 != r0) goto L_0x003c;
    L_0x002e:
        r0 = r6.f;
        r2 = r6.g;
        r3 = r6.d;
        r4 = r6.b;
        com.whatsapp.PhotoView.a(r0, r2, r3, r4, r1);
        r6.a();
    L_0x003c:
        r0 = r6.h;
        if (r0 != 0) goto L_0x0005;
    L_0x0040:
        r0 = r6.f;
        r0.post(r6);
        goto L_0x0005;
    L_0x0046:
        r0 = 0;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp._4.run():void");
    }

    public _4(PhotoView photoView) {
        this.f = photoView;
    }

    public void a() {
        this.i = false;
        this.h = true;
    }
}
