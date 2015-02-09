package com.whatsapp;

import android.widget.AdapterView.OnItemClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class n6 implements OnItemClickListener {
    private static final String z;
    final LocationPicker2 a;

    static {
        char[] toCharArray = "r`s\u0016\u001b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 2;
                    break;
                case ay.f /*1*/:
                    i2 = 12;
                    break;
                case ay.n /*2*/:
                    i2 = 18;
                    break;
                case ay.p /*3*/:
                    i2 = 117;
                    break;
                default:
                    i2 = 126;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    n6(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView r4, android.view.View r5, int r6, long r7) {
        /*
        r3_this = this;
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker2.s(r0);
        if (r0 == 0) goto L_0x0014;
    L_0x0008:
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker2.s(r0);
        r0 = r0.size();
        if (r6 < r0) goto L_0x0015;
    L_0x0014:
        return;
    L_0x0015:
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker2.j(r0);
        if (r0 == 0) goto L_0x0038;
    L_0x001d:
        r1 = r3.a;
        r0 = r3.a;
        r2 = com.whatsapp.LocationPicker2.j(r0);
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker2.s(r0);
        r0 = r0.get(r6);
        r0 = (com.whatsapp.PlaceInfo) r0;
        com.whatsapp.App.a(r1, r2, r0);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0054;
    L_0x0038:
        r1 = new android.content.Intent;
        r1.<init>();
        r2 = z;
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker2.s(r0);
        r0 = r0.get(r6);
        r0 = (java.io.Serializable) r0;
        r1.putExtra(r2, r0);
        r0 = r3.a;
        r2 = -1;
        r0.setResult(r2, r1);
    L_0x0054:
        r0 = r3.a;
        r1 = com.whatsapp.fieldstats.a6.PLACE;
        com.whatsapp.LocationPicker2.a(r0, r1, r6);
        r0 = r3.a;
        r0.finish();
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.n6.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
