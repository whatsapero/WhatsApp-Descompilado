package com.whatsapp;

import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class u1 implements OnClickListener {
    private static final String z;
    final LocationPicker a;

    static {
        char[] toCharArray = "eX,9Z`X!".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 9;
                    break;
                case ay.f /*1*/:
                    i2 = 55;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 88;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r4) {
        /*
        r3_this = this;
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker.l(r0);
        r0 = r0.getLastFix();
        if (r0 == 0) goto L_0x0017;
    L_0x000c:
        r1 = r0.getAccuracy();
        r2 = 1128792064; // 0x43480000 float:200.0 double:5.5769738E-315;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 <= 0) goto L_0x0017;
    L_0x0016:
        r0 = 0;
    L_0x0017:
        r1 = r3.a;
        r1 = com.whatsapp.LocationPicker.b(r1);
        if (r1 == 0) goto L_0x002e;
    L_0x001f:
        r1 = r3.a;
        r2 = r3.a;
        r2 = com.whatsapp.LocationPicker.b(r2);
        com.whatsapp.App.a(r1, r2, r0);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x003e;
    L_0x002e:
        r1 = new android.content.Intent;
        r1.<init>();
        r2 = z;
        r1.putExtra(r2, r0);
        r0 = r3.a;
        r2 = -1;
        r0.setResult(r2, r1);
    L_0x003e:
        r0 = r3.a;
        r0.finish();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.u1.onClick(android.view.View):void");
    }

    u1(LocationPicker locationPicker) {
        this.a = locationPicker;
    }
}
