package com.whatsapp;

import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class tg implements OnClickListener {
    private static final String[] z;
    final VerifySms a;

    static {
        String[] strArr = new String[3];
        String str = "b5G\"8()\u000f";
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
                        i3 = 77;
                        break;
                    case ay.f /*1*/:
                        i3 = 91;
                        break;
                    case ay.n /*2*/:
                        i3 = 50;
                        break;
                    case ay.p /*3*/:
                        i3 = 79;
                        break;
                    default:
                        i3 = 90;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = ";>@&<4-]&9(t@*+8>A;u.8\u000f";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ";>@&<4-]&9(t@*.?\"D*($=K";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
        r7_this = this;
        r6 = 1;
        r5 = 0;
        r0 = com.whatsapp.App.az;
        r1 = com.whatsapp.VerifySms.C();
        r2 = 11;
        if (r1 != r2) goto L_0x0074;
    L_0x000c:
        r1 = z;
        r1 = r1[r6];
        com.whatsapp.util.Log.i(r1);
        r1 = r7.a;
        r1 = com.whatsapp.VerifySms.e(r1);
        r1 = r1.getText();
        r1 = r1.toString();
        r2 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r2 = java.lang.Character.toString(r2);
        r3 = "";
        r1 = r1.replace(r2, r3);
        r2 = 45;
        r2 = java.lang.Character.toString(r2);
        r3 = "";
        r1 = r1.replace(r2, r3);
        r2 = r7.a;
        r2 = com.whatsapp.VerifySms.b(r2, r1);
        if (r2 == 0) goto L_0x0063;
    L_0x0041:
        r2 = r7.a;
        r2 = com.whatsapp.VerifySms.z(r2);
        r3 = r7.a;
        r4 = 2131625056; // 0x7f0e0460 float:1.887731E38 double:1.05316271E-314;
        r3 = r3.getString(r4);
        r2.setText(r3);
        r2 = new com.whatsapp.rn;
        r3 = r7.a;
        r2.<init>(r3);
        r3 = new java.lang.String[r6];
        r3[r5] = r1;
        com.whatsapp.a5w.a(r2, r3);
        if (r0 == 0) goto L_0x0072;
    L_0x0063:
        r1 = r7.a;
        r1 = r1.isFinishing();
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r7.a;
        r2 = 33;
        r1.showDialog(r2);
    L_0x0072:
        if (r0 == 0) goto L_0x00b1;
    L_0x0074:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r7.a;
        r1 = com.whatsapp.VerifySms.A(r1);
        r0 = r0.append(r1);
        r1 = z;
        r1 = r1[r5];
        r0 = r0.append(r1);
        r1 = r7.a;
        r1 = com.whatsapp.VerifySms.a(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = new com.whatsapp.ov;
        r1 = r7.a;
        r0.<init>(r1);
        r1 = new java.lang.String[r5];
        com.whatsapp.a5w.a(r0, r1);
    L_0x00b1:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.tg.onClick(android.view.View):void");
    }

    tg(VerifySms verifySms) {
        this.a = verifySms;
    }
}
