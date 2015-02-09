package com.whatsapp;

import android.content.DialogInterface.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class kw implements OnClickListener {
    private static final String[] z;
    final RegisterPhone a;

    static {
        String[] strArr = new String[8];
        String str = "mg\rhIfi\u00145_~x?6Lkn\u00054[`k\u00055";
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
                        i3 = 14;
                        break;
                    case ay.f /*1*/:
                        i3 = 8;
                        break;
                    case ay.n /*2*/:
                        i3 = 96;
                        break;
                    case ay.p /*3*/:
                        i3 = 70;
                        break;
                    default:
                        i3 = 62;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "~`";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "mg\rhIfi\u00145_~xN\u0010[|a\u0006?mc{N4Qoe\t(Y";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "|m\u0007/Mzm\u00126Vaf\u0005i]af\u0006/Lc'\u0016)Wmm";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "mg\rhIfi\u00145_~xN\u0010[|a\u0006?mc{N4Qoe\t(Y";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "mk";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "mg\rhIfi\u00145_~xN\u0010[|a\u0006?mc{N5[|~\u00054Mkf\u0004";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "|m\u0007/Mzm\u00126Vaf\u0005iMk|\u0003%Nfg\u000e#P{eO _gd\u0005\"";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    kw(RegisterPhone registerPhone) {
        this.a = registerPhone;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r7, int r8) {
        /*
        r6_this = this;
        r5 = 4;
        r4 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r6.a;
        r2 = 21;
        r0.removeDialog(r2);
        r0 = r6.a;
        r2 = z;
        r2 = r2[r4];
        r0 = r0.getSharedPreferences(r2, r4);
        r0 = r0.edit();
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r3 = com.whatsapp.EnterPhoneNumber.u;
        r0.putString(r2, r3);
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r3 = com.whatsapp.EnterPhoneNumber.x;
        r0.putString(r2, r3);
        r0 = r0.commit();
        if (r0 != 0) goto L_0x003b;
    L_0x0033:
        r0 = z;
        r2 = 1;
        r0 = r0[r2];
        com.whatsapp.util.Log.e(r0);
    L_0x003b:
        r0 = r6.a;
        r0 = r0.f();
        if (r0 == 0) goto L_0x0080;
    L_0x0043:
        r0 = r6.a;
        r0 = r0.b();
        if (r0 == 0) goto L_0x0051;
    L_0x004b:
        r0 = 14;
        com.whatsapp.EnterPhoneNumber.w = r0;
        if (r1 == 0) goto L_0x0053;
    L_0x0051:
        com.whatsapp.EnterPhoneNumber.w = r4;
    L_0x0053:
        r0 = r6.a;
        r0.b();
        r0 = r6.a;
        com.whatsapp.App.d(r0, r5);
        r0 = new android.content.Intent;
        r2 = r6.a;
        r3 = com.whatsapp.VerifySms.class;
        r0.<init>(r2, r3);
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r3 = r6.a;
        r3 = r3.v;
        r0.putExtra(r2, r3);
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r3 = r6.a;
        r3 = r3.n;
        r0.putExtra(r2, r3);
        if (r1 == 0) goto L_0x00a8;
    L_0x0080:
        com.whatsapp.EnterPhoneNumber.w = r4;
        r0 = r6.a;
        r0.b();
        r0 = z;
        r0 = r0[r5];
        com.whatsapp.util.Log.i(r0);
        r0 = r6.a;
        com.whatsapp.App.d(r0, r5);
        r0 = new android.content.Intent;
        r1 = r6.a;
        r2 = com.whatsapp.VerifySms.class;
        r0.<init>(r1, r2);
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r2 = r6.a;
        r2 = r2.n;
        r0.putExtra(r1, r2);
    L_0x00a8:
        r1 = r6.a;
        r1.startActivity(r0);
        r0 = r6.a;
        r0.finish();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kw.onClick(android.content.DialogInterface, int):void");
    }
}
