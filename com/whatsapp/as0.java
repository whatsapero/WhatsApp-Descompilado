package com.whatsapp;

import android.os.Handler.Callback;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class as0 implements Callback {
    private static final String[] z;
    final GroupChatInfo a;

    static {
        String[] strArr = new String[3];
        String str = "BMZ/\u0006z\\];\u0002zV[<\u0019\nXP.)VKT.\u0003V`S;\u001fIZQz\u001cL[\b\u007f\u0005\u0005\\Z>\u0013\u0018\u001aQ";
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
                        i3 = 37;
                        break;
                    case ay.f /*1*/:
                        i3 = 63;
                        break;
                    case ay.n /*2*/:
                        i3 = 53;
                        break;
                    case ay.p /*3*/:
                        i3 = 90;
                        break;
                    default:
                        i3 = 118;
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
                    str = "VKT.\u0003V";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "OVQ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    as0(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r9) {
        /*
        r8_this = this;
        r7 = 2;
        r6 = 0;
        r5 = 1;
        r0 = r9.obj;
        r0 = (android.os.Bundle) r0;
        r1 = r9.what;
        if (r1 != 0) goto L_0x002b;
    L_0x000b:
        r1 = z;
        r1 = r1[r6];
        r2 = 0;
        r3 = new java.lang.Object[r7];
        r4 = z;
        r4 = r4[r5];
        r4 = r0.getString(r4);
        r3[r6] = r4;
        r4 = r9.arg1;
        r4 = java.lang.Integer.valueOf(r4);
        r3[r5] = r4;
        com.whatsapp.util.Log.c(r1, r2, r3);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0036;
    L_0x002b:
        r1 = z;
        r1 = r1[r7];
        r0 = r0.getString(r1);
        com.whatsapp.App.s(r0);
    L_0x0036:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.as0.handleMessage(android.os.Message):boolean");
    }
}
