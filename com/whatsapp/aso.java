package com.whatsapp;

final class aso extends ase {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(java.lang.String r4) {
        /*
        r3_this = this;
        r1 = com.whatsapp.App.az;
        r0 = 1;
        r2 = com.whatsapp.App.aJ;
        r2 = r2.z(r4);
        if (r2 == 0) goto L_0x0011;
    L_0x000b:
        r0 = com.whatsapp.v.c(r4);
        if (r1 == 0) goto L_0x0014;
    L_0x0011:
        com.whatsapp.v.f(r4);
    L_0x0014:
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        com.whatsapp.App.W();
        if (r1 == 0) goto L_0x001e;
    L_0x001b:
        com.whatsapp.App.p(r4);
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aso.c(java.lang.String):void");
    }

    public void d(String str) {
        if (App.aJ.z(str)) {
            v.c(str);
            App.W();
        }
    }

    public void a(String str) {
        v.f(str);
        App.W();
    }

    public void a(String str, boolean z) {
        App.W();
    }

    public void b(String str) {
        if (App.E(str)) {
            av4.a(App.aJ.G());
        }
    }

    aso() {
    }
}
