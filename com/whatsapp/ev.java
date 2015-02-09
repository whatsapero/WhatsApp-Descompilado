package com.whatsapp;

import android.content.Context;
import com.google.android.maps.MapView;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ev extends e5 {
    private static final String[] z;
    final LocationPicker h;
    private int i;

    static {
        String[] strArr = new String[5];
        String str = "a{1m";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 93;
                        break;
                    case ay.f /*1*/:
                        i3 = 84;
                        break;
                    case ay.n /*2*/:
                        i3 = 83;
                        break;
                    case ay.p /*3*/:
                        i3 = 83;
                        break;
                    default:
                        i3 = 77;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "a{5<#)jo|>05??s";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "a6m";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "a6m";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "a{1mq?&|mq.92?!ch5<#)t0<!2&ntnkbee{ksm";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ev(LocationPicker locationPicker, Context context, MapView mapView) {
        this.h = locationPicker;
        super(context, mapView);
        this.i = -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLocationChanged(android.location.Location r11) {
        /*
        r10_this = this;
        r9 = 2131624824; // 0x7f0e0378 float:1.8876839E38 double:1.0531625954E-314;
        r8 = 1128792064; // 0x43480000 float:200.0 double:5.5769738E-315;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.App.az;
        super.onLocationChanged(r11);
        if (r11 == 0) goto L_0x0121;
    L_0x000e:
        r0 = r11.hasAccuracy();
        if (r0 == 0) goto L_0x001f;
    L_0x0014:
        r0 = r11.getAccuracy();
        r0 = (int) r0;
        r0 = java.lang.Math.max(r1, r0);
        if (r3 == 0) goto L_0x0020;
    L_0x001f:
        r0 = -1;
    L_0x0020:
        r4 = r10.i;
        if (r0 == r4) goto L_0x00ae;
    L_0x0024:
        r10.i = r0;
        if (r0 <= 0) goto L_0x007d;
    L_0x0028:
        r4 = com.whatsapp.App.aX;
        r5 = 2131558419; // 0x7f0d0013 float:1.8742153E38 double:1.053129787E-314;
        r4 = r4.a(r5, r0);
        r5 = new java.lang.Object[r1];
        r0 = java.lang.Integer.valueOf(r0);
        r5[r2] = r0;
        r0 = java.lang.String.format(r4, r5);
        r4 = r10.h;
        r4 = com.whatsapp.LocationPicker.a(r4);
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 3;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r6 = r10.h;
        r6 = r6.getString(r9);
        r5 = r5.append(r6);
        r6 = z;
        r6 = r6[r1];
        r5 = r5.append(r6);
        r0 = r5.append(r0);
        r5 = z;
        r6 = 2;
        r5 = r5[r6];
        r0 = r0.append(r5);
        r0 = r0.toString();
        r0 = android.text.Html.fromHtml(r0);
        r4.setText(r0);
        if (r3 == 0) goto L_0x00ae;
    L_0x007d:
        r0 = r10.h;
        r0 = com.whatsapp.LocationPicker.a(r0);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 4;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r4 = r10.h;
        r4 = r4.getString(r9);
        r3 = r3.append(r4);
        r4 = z;
        r4 = r4[r2];
        r3 = r3.append(r4);
        r3 = r3.toString();
        r3 = android.text.Html.fromHtml(r3);
        r0.setText(r3);
    L_0x00ae:
        r0 = r10.h;
        r0 = com.whatsapp.LocationPicker.p(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x00b6:
        r0 = r10.h;
        r0 = com.whatsapp.LocationPicker.p(r0);
        r0 = r0.m;
        if (r0 == 0) goto L_0x0122;
    L_0x00c0:
        r0 = r10.h;
        r0 = com.whatsapp.LocationPicker.i(r0);
        if (r0 == 0) goto L_0x0122;
    L_0x00c8:
        r0 = r11.getAccuracy();
        r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r0 >= 0) goto L_0x0122;
    L_0x00d0:
        r0 = r10.h;
        r0 = com.whatsapp.LocationPicker.p(r0);
        r0 = r0.m;
        r0 = r0.distanceTo(r11);
        r3 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x0122;
    L_0x00e2:
        r0 = r10.h;
        com.whatsapp.LocationPicker.b(r0, r2);
        r0 = r1;
    L_0x00e8:
        r1 = r10.h;
        com.whatsapp.LocationPicker.a(r1, r11);
        r1 = r10.h;
        r1 = com.whatsapp.LocationPicker.p(r1);
        if (r1 == 0) goto L_0x00f7;
    L_0x00f5:
        if (r0 == 0) goto L_0x0121;
    L_0x00f7:
        r1 = r11.getAccuracy();
        r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1));
        if (r1 >= 0) goto L_0x010f;
    L_0x00ff:
        r2 = r11.getTime();
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r2 = r2 + r4;
        r4 = java.lang.System.currentTimeMillis();
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 > 0) goto L_0x0117;
    L_0x010f:
        r1 = r10.h;
        r1 = com.whatsapp.LocationPicker.f(r1);
        if (r1 == 0) goto L_0x0121;
    L_0x0117:
        r1 = r10.h;
        r2 = new com.whatsapp.asy;
        r2.<init>(r10, r0, r11);
        r1.runOnUiThread(r2);
    L_0x0121:
        return;
    L_0x0122:
        r0 = r2;
        goto L_0x00e8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ev.onLocationChanged(android.location.Location):void");
    }
}
