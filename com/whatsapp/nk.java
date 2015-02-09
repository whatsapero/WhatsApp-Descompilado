package com.whatsapp;

class nk implements Runnable {
    private final PhotoView a;
    private boolean b;
    private long c;
    private boolean d;
    private float e;
    private float f;

    public nk(PhotoView photoView) {
        this.c = -1;
        this.a = photoView;
    }

    public void a() {
        this.d = false;
        this.b = true;
    }

    public boolean a(float f, float f2) {
        if (this.d) {
            return false;
        }
        this.c = -1;
        this.e = f;
        this.f = f2;
        this.b = false;
        this.d = true;
        this.a.post(this);
        return true;
    }

    static boolean a(nk nkVar) {
        return nkVar.d;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r11_this = this;
        r10 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r1 = 0;
        r2 = com.whatsapp.App.az;
        r0 = r11.b;
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        return;
    L_0x000a:
        r4 = java.lang.System.currentTimeMillis();
        r6 = r11.c;
        r8 = -1;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x0091;
    L_0x0016:
        r6 = r11.c;
        r6 = r4 - r6;
        r0 = (float) r6;
        r0 = r0 / r10;
    L_0x001c:
        r3 = r11.a;
        r6 = r11.e;
        r6 = r6 * r0;
        r7 = r11.f;
        r7 = r7 * r0;
        r3 = com.whatsapp.PhotoView.a(r3, r6, r7);
        r11.c = r4;
        r0 = r0 * r10;
        r4 = r11.e;
        r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
        if (r4 <= 0) goto L_0x0040;
    L_0x0031:
        r4 = r11.e;
        r4 = r4 - r0;
        r11.e = r4;
        r4 = r11.e;
        r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
        if (r4 >= 0) goto L_0x004d;
    L_0x003c:
        r11.e = r1;
        if (r2 == 0) goto L_0x004d;
    L_0x0040:
        r4 = r11.e;
        r4 = r4 + r0;
        r11.e = r4;
        r4 = r11.e;
        r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
        if (r4 <= 0) goto L_0x004d;
    L_0x004b:
        r11.e = r1;
    L_0x004d:
        r4 = r11.f;
        r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
        if (r4 <= 0) goto L_0x0062;
    L_0x0053:
        r4 = r11.f;
        r4 = r4 - r0;
        r11.f = r4;
        r4 = r11.f;
        r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
        if (r4 >= 0) goto L_0x006f;
    L_0x005e:
        r11.f = r1;
        if (r2 == 0) goto L_0x006f;
    L_0x0062:
        r2 = r11.f;
        r0 = r0 + r2;
        r11.f = r0;
        r0 = r11.f;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x006f;
    L_0x006d:
        r11.f = r1;
    L_0x006f:
        r0 = r11.e;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 != 0) goto L_0x007b;
    L_0x0075:
        r0 = r11.f;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 == 0) goto L_0x007d;
    L_0x007b:
        if (r3 != 0) goto L_0x0086;
    L_0x007d:
        r11.a();
        r0 = r11.a;
        r1 = 0;
        com.whatsapp.PhotoView.a(r0, r1);
    L_0x0086:
        r0 = r11.b;
        if (r0 != 0) goto L_0x0009;
    L_0x008a:
        r0 = r11.a;
        r0.post(r11);
        goto L_0x0009;
    L_0x0091:
        r0 = r1;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.nk.run():void");
    }
}
