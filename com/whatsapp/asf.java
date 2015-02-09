package com.whatsapp;

import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class asf implements OnClickListener {
    private static final String[] z;
    final int a;
    final SpamWarningActivity b;

    static {
        String[] strArr = new String[3];
        String str = "#:LjC+0\u0006qB61Fl\u0002#7\\qC,z~Qi\u0015";
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
                        i3 = 66;
                        break;
                    case ay.f /*1*/:
                        i3 = 84;
                        break;
                    case ay.n /*2*/:
                        i3 = 40;
                        break;
                    case ay.p /*3*/:
                        i3 = 24;
                        break;
                    default:
                        i3 = 44;
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
                    str = "m3MvI05D7";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "* \\h_x{\u0007o[5z_pM6'Ih\\l7Gu\u0003$5Y7";
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
        r2 = com.whatsapp.App.az;
        r0 = java.util.Locale.getDefault();
        r1 = r0.getLanguage();
        r3 = r0.getCountry();
        r0 = "";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x001a;
    L_0x0016:
        r0 = "";
        if (r2 == 0) goto L_0x003b;
    L_0x001a:
        r0 = "";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0024;
    L_0x0022:
        if (r2 == 0) goto L_0x0074;
    L_0x0024:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0 = r0.append(r1);
        r1 = "_";
        r0 = r0.append(r1);
        r0 = r0.append(r3);
        r0 = r0.toString();
    L_0x003b:
        r1 = r7.b;
        r2 = new android.content.Intent;
        r3 = z;
        r4 = 0;
        r3 = r3[r4];
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 1;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r4.append(r0);
        r4 = z;
        r5 = 2;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r7.a;
        r0 = r0.append(r4);
        r0 = r0.toString();
        r0 = android.net.Uri.parse(r0);
        r2.<init>(r3, r0);
        r1.startActivity(r2);
        return;
    L_0x0074:
        r0 = r1;
        goto L_0x003b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.asf.onClick(android.view.View):void");
    }

    asf(SpamWarningActivity spamWarningActivity, int i) {
        this.b = spamWarningActivity;
        this.a = i;
    }
}
