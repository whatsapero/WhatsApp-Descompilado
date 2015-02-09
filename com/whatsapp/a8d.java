package com.whatsapp;

import android.os.Handler;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a8d extends Handler {
    private static final String[] z;
    final ChangeNumber a;

    static {
        String[] strArr = new String[4];
        String str = "o>c\u0006}i8w\u0005xi$-\u000bri5iEty;`\rh#;c\u001cyd";
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
                        i3 = 12;
                        break;
                    case ay.f /*1*/:
                        i3 = 86;
                        break;
                    case ay.n /*2*/:
                        i3 = 2;
                        break;
                    case ay.p /*3*/:
                        i3 = 104;
                        break;
                    default:
                        i3 = 26;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "o>c\u0006}i8w\u0005xi$-\u000bri5iEty;`\rh#;k\u001bwm\"a\u0000";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "o>c\u0006}i8w\u0005xi$-\u001csa3m\u001dn";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "o>c\u0006}i8w\u0005xi$-\rh~9p";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a8d(ChangeNumber changeNumber) {
        this.a = changeNumber;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r8) {
        /*
        r7_this = this;
        r6 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r5 = 2;
        r4 = 4;
        r3 = 1;
        r0 = com.whatsapp.App.az;
        r1 = r8.what;
        switch(r1) {
            case 1: goto L_0x000d;
            case 2: goto L_0x003d;
            case 3: goto L_0x005c;
            case 4: goto L_0x006f;
            default: goto L_0x000c;
        };
    L_0x000c:
        return;
    L_0x000d:
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        com.whatsapp.util.Log.w(r1);
        r1 = r7.a;
        r1 = com.whatsapp.ChangeNumber.c(r1);
        r1.removeMessages(r4);
        r1 = r7.a;
        r1.removeDialog(r3);
        r1 = com.whatsapp.ChangeNumber.a();
        r2 = com.whatsapp.EnterPhoneNumber.u;
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x0036;
    L_0x002f:
        r1 = r7.a;
        r1.showDialog(r5);
        if (r0 == 0) goto L_0x000c;
    L_0x0036:
        r1 = r7.a;
        com.whatsapp.ChangeNumber.e(r1);
        if (r0 == 0) goto L_0x000c;
    L_0x003d:
        r1 = z;
        r1 = r1[r5];
        com.whatsapp.util.Log.w(r1);
        r1 = r7.a;
        r1 = com.whatsapp.ChangeNumber.c(r1);
        r1.removeMessages(r4);
        r1 = r7.a;
        r1.removeDialog(r3);
        r1 = r7.a;
        r2 = 2131624213; // 0x7f0e0115 float:1.88756E38 double:1.0531622935E-314;
        r1.a(r2);
        if (r0 == 0) goto L_0x000c;
    L_0x005c:
        r1 = z;
        r1 = r1[r3];
        com.whatsapp.util.Log.e(r1);
        r1 = r7.a;
        r1.removeDialog(r3);
        r1 = r7.a;
        r1.showDialog(r6);
        if (r0 == 0) goto L_0x000c;
    L_0x006f:
        r0 = z;
        r1 = 3;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r0 = r7.a;
        r0 = com.whatsapp.ChangeNumber.c(r0);
        r0.removeMessages(r4);
        r0 = r7.a;
        r0.removeDialog(r3);
        r0 = r7.a;
        r0.showDialog(r6);
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a8d.handleMessage(android.os.Message):void");
    }
}
