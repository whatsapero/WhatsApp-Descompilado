package com.whatsapp;

import android.os.Handler;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class atv extends Handler {
    private static final String[] z;
    final DeleteAccount a;

    static {
        String[] strArr = new String[4];
        String str = "\u0010\u001b]\t^\u0011SP\u000fI\u001b\u000b_\u0018\u0005\u0000\u0017\\\tE\u0001\n";
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
                        i3 = 116;
                        break;
                    case ay.f /*1*/:
                        i3 = 126;
                        break;
                    case ay.n /*2*/:
                        i3 = 49;
                        break;
                    case ay.p /*3*/:
                        i3 = 108;
                        break;
                    default:
                        i3 = 42;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0010\u001b]\t^\u0011SP\u000fI\u001b\u000b_\u0018\u0005\u0011\fC\u0003X";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0010\u001b]\t^\u0011SP\u000fI\u001b\u000b_\u0018\u0005\u0017\u0016T\u000fAY\u0010D\u0001H\u0011\f\u001e\u0001C\u0007\u0013P\u0018I\u001c";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0010\u001b]\t^\u0011SP\u000fI\u001b\u000b_\u0018\u0005\u0017\u0016T\u000fAY\u0010D\u0001H\u0011\f\u001e\u0001K\u0000\u001dY";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r9) {
        /*
        r8_this = this;
        r7 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r6 = 4;
        r5 = 1;
        r0 = com.whatsapp.App.az;
        r1 = r9.what;
        switch(r1) {
            case 1: goto L_0x000c;
            case 2: goto L_0x0036;
            case 3: goto L_0x0056;
            case 4: goto L_0x006a;
            default: goto L_0x000b;
        };
    L_0x000b:
        return;
    L_0x000c:
        r1 = z;
        r1 = r1[r5];
        com.whatsapp.util.Log.w(r1);
        r1 = r8.a;
        r1 = com.whatsapp.DeleteAccount.e(r1);
        r1.removeMessages(r6);
        r1 = r8.a;
        r1.removeDialog(r5);
        r1 = r8.a;
        r2 = new android.content.Intent;
        r3 = r8.a;
        r4 = com.whatsapp.DeleteAccountConfirmation.class;
        r2.<init>(r3, r4);
        r1.startActivity(r2);
        r1 = r8.a;
        r1.finish();
        if (r0 == 0) goto L_0x000b;
    L_0x0036:
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        com.whatsapp.util.Log.w(r1);
        r1 = r8.a;
        r1 = com.whatsapp.DeleteAccount.e(r1);
        r1.removeMessages(r6);
        r1 = r8.a;
        r1.removeDialog(r5);
        r1 = r8.a;
        r2 = 2131624213; // 0x7f0e0115 float:1.88756E38 double:1.0531622935E-314;
        r1.a(r2);
        if (r0 == 0) goto L_0x000b;
    L_0x0056:
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        com.whatsapp.util.Log.e(r1);
        r1 = r8.a;
        r1.removeDialog(r5);
        r1 = r8.a;
        r1.showDialog(r7);
        if (r0 == 0) goto L_0x000b;
    L_0x006a:
        r0 = z;
        r1 = 0;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r0 = r8.a;
        r0 = com.whatsapp.DeleteAccount.e(r0);
        r0.removeMessages(r6);
        r0 = r8.a;
        r0.removeDialog(r5);
        r0 = r8.a;
        r0.showDialog(r7);
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.atv.handleMessage(android.os.Message):void");
    }

    atv(DeleteAccount deleteAccount) {
        this.a = deleteAccount;
    }
}
