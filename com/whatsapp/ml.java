package com.whatsapp;

import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ml implements OnClickListener {
    private static final String z;
    final LocationPicker2 a;

    static {
        char[] toCharArray = "\u0017~ iw\u0012~-".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 123;
                    break;
                case ay.f /*1*/:
                    i2 = 17;
                    break;
                case ay.n /*2*/:
                    i2 = 67;
                    break;
                case ay.p /*3*/:
                    i2 = 8;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ml(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r4) {
        /*
        r3_this = this;
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker2.x(r0);
        if (r0 == 0) goto L_0x001e;
    L_0x0008:
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker2.x(r0);
        r0 = r0.getAccuracy();
        r1 = 1128792064; // 0x43480000 float:200.0 double:5.5769738E-315;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x001e;
    L_0x0018:
        r0 = r3.a;
        r1 = 0;
        com.whatsapp.LocationPicker2.a(r0, r1);
    L_0x001e:
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker2.j(r0);
        if (r0 == 0) goto L_0x003b;
    L_0x0026:
        r0 = r3.a;
        r1 = r3.a;
        r1 = com.whatsapp.LocationPicker2.j(r1);
        r2 = r3.a;
        r2 = com.whatsapp.LocationPicker2.x(r2);
        com.whatsapp.App.a(r0, r1, r2);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0051;
    L_0x003b:
        r0 = new android.content.Intent;
        r0.<init>();
        r1 = z;
        r2 = r3.a;
        r2 = com.whatsapp.LocationPicker2.x(r2);
        r0.putExtra(r1, r2);
        r1 = r3.a;
        r2 = -1;
        r1.setResult(r2, r0);
    L_0x0051:
        r0 = r3.a;
        r1 = com.whatsapp.fieldstats.a6.CURRENT_LOCATION;
        com.whatsapp.LocationPicker2.a(r0, r1);
        r0 = r3.a;
        r0.finish();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ml.onClick(android.view.View):void");
    }
}
