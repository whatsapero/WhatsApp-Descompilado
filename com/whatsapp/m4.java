package com.whatsapp;

import android.content.Context;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class m4 implements Runnable {
    private static final String[] z;
    final Context a;
    final String b;

    static {
        String[] strArr = new String[3];
        String str = "Yn\u001eh8R`\u00075.Jq,6=_g\u00164*Tb\u00165";
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
                        i3 = 58;
                        break;
                    case ay.f /*1*/:
                        i3 = 1;
                        break;
                    case ay.n /*2*/:
                        i3 = 115;
                        break;
                    case ay.p /*3*/:
                        i3 = 70;
                        break;
                    default:
                        i3 = 79;
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
                    str = "V`\u00002\u0010Oq\u00144.^d,%'_b\u0018";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "Oo\u0012$#_!\u0007)oHd\u00074&_w\u0016f=_l\u001c2*\u001aw\u00164<Sn\u001d";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r8_this = this;
        r5 = 0;
        r0 = com.whatsapp.App.az;
        r1 = com.whatsapp.st.k();
        r2 = r1.length();
        if (r2 <= 0) goto L_0x0043;
    L_0x000d:
        r2 = r8.b;
        r2 = com.whatsapp.avf.a(r2);
        if (r2 != 0) goto L_0x0016;
    L_0x0015:
        return;
    L_0x0016:
        r1 = com.whatsapp.avf.a(r1);
        if (r1 == 0) goto L_0x0015;
    L_0x001c:
        r3 = r8.a;
        r4 = z;
        r4 = r4[r5];
        r3 = r3.getSharedPreferences(r4, r5);
        r3 = r3.edit();
        r4 = z;
        r5 = 2;
        r4 = r4[r5];
        r6 = java.lang.System.currentTimeMillis();
        r3 = r3.putLong(r4, r6);
        r3.commit();
        r1 = r2.a(r1);
        switch(r1) {
            case -1: goto L_0x004c;
            case 0: goto L_0x0051;
            case 1: goto L_0x0051;
            default: goto L_0x0041;
        };
    L_0x0041:
        if (r0 == 0) goto L_0x0015;
    L_0x0043:
        r0 = z;
        r1 = 1;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        goto L_0x0015;
    L_0x004c:
        com.whatsapp.st.j();
        if (r0 == 0) goto L_0x0041;
    L_0x0051:
        com.whatsapp.st.b();
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m4.run():void");
    }

    m4(String str, Context context) {
        this.b = str;
        this.a = context;
    }
}
