package com.whatsapp;

import android.widget.AdapterView.OnItemClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a8m implements OnItemClickListener {
    private static final String z;
    final LocationPicker a;

    static {
        char[] toCharArray = "[FUb\u0003".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 43;
                    break;
                case ay.f /*1*/:
                    i2 = 42;
                    break;
                case ay.n /*2*/:
                    i2 = 52;
                    break;
                case ay.p /*3*/:
                    i2 = 1;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a8m(LocationPicker locationPicker) {
        this.a = locationPicker;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView r4, android.view.View r5, int r6, long r7) {
        /*
        r3_this = this;
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker.p(r0);
        if (r0 == 0) goto L_0x0014;
    L_0x0008:
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker.p(r0);
        r0 = r0.size();
        if (r6 < r0) goto L_0x0015;
    L_0x0014:
        return;
    L_0x0015:
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker.b(r0);
        if (r0 == 0) goto L_0x0038;
    L_0x001d:
        r1 = r3.a;
        r0 = r3.a;
        r2 = com.whatsapp.LocationPicker.b(r0);
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker.p(r0);
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
        r0 = com.whatsapp.LocationPicker.p(r0);
        r0 = r0.get(r6);
        r0 = (java.io.Serializable) r0;
        r1.putExtra(r2, r0);
        r0 = r3.a;
        r2 = -1;
        r0.setResult(r2, r1);
    L_0x0054:
        r0 = r3.a;
        r0.finish();
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a8m.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
