package com.whatsapp;

import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class u9 implements OnInfoWindowClickListener {
    private static final String z;
    final LocationPicker2 a;

    static {
        char[] toCharArray = "@F2,'".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 48;
                    break;
                case ay.f /*1*/:
                    i2 = 42;
                    break;
                case ay.n /*2*/:
                    i2 = 83;
                    break;
                case ay.p /*3*/:
                    i2 = 79;
                    break;
                default:
                    i2 = 66;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    u9(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onInfoWindowClick(com.google.android.gms.maps.model.Marker r6) {
        /*
        r5_this = this;
        r2 = com.whatsapp.App.az;
        r1 = 0;
        r0 = r6.getId();
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        return;
    L_0x000a:
        r0 = r5.a;
        r0 = com.whatsapp.LocationPicker2.s(r0);
        r3 = r0.iterator();
    L_0x0014:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x005c;
    L_0x001a:
        r0 = r3.next();
        r0 = (com.whatsapp.PlaceInfo) r0;
        r4 = r0.tag;
        r4 = r6.equals(r4);
        if (r4 == 0) goto L_0x0014;
    L_0x0028:
        if (r0 == 0) goto L_0x0009;
    L_0x002a:
        r1 = r5.a;
        r1 = com.whatsapp.LocationPicker2.j(r1);
        if (r1 == 0) goto L_0x003f;
    L_0x0032:
        r1 = r5.a;
        r3 = r5.a;
        r3 = com.whatsapp.LocationPicker2.j(r3);
        com.whatsapp.App.a(r1, r3, r0);
        if (r2 == 0) goto L_0x004f;
    L_0x003f:
        r1 = new android.content.Intent;
        r1.<init>();
        r2 = z;
        r1.putExtra(r2, r0);
        r0 = r5.a;
        r2 = -1;
        r0.setResult(r2, r1);
    L_0x004f:
        r0 = r5.a;
        r1 = com.whatsapp.fieldstats.a6.PLACE;
        com.whatsapp.LocationPicker2.a(r0, r1);
        r0 = r5.a;
        r0.finish();
        goto L_0x0009;
    L_0x005c:
        r0 = r1;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.u9.onInfoWindowClick(com.google.android.gms.maps.model.Marker):void");
    }
}
