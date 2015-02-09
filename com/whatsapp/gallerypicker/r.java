package com.whatsapp.gallerypicker;

import android.graphics.BitmapFactory.Options;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class r {
    private static final String[] z;
    public b a;
    public boolean b;
    public Options c;

    static {
        String[] strArr = new String[4];
        String str = "\u001b_\u0004=64";
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
                        i3 = 88;
                        break;
                    case ay.f /*1*/:
                        i3 = 62;
                        break;
                    case ay.n /*2*/:
                        i3 = 106;
                        break;
                    case ay.p /*3*/:
                        i3 = 94;
                        break;
                    default:
                        i3 = 83;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "t\u001e\u0005.'1Q\u0004-se\u001e";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = ",V\u0018;2<\u001e\u0019*2,[Jcs";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0019R\u00061$";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r4_this = this;
        r1 = com.whatsapp.gallerypicker.ImagePreview.y;
        r0 = r4.a;
        r2 = com.whatsapp.gallerypicker.b.CANCEL;
        if (r0 != r2) goto L_0x000f;
    L_0x0008:
        r0 = z;
        r2 = 0;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x001e;
    L_0x000f:
        r0 = r4.a;
        r2 = com.whatsapp.gallerypicker.b.ALLOW;
        if (r0 != r2) goto L_0x001c;
    L_0x0015:
        r0 = z;
        r2 = 1;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x001e;
    L_0x001c:
        r0 = "?";
    L_0x001e:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r4.c;
        r0 = r0.append(r1);
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.r.toString():java.lang.String");
    }

    private r() {
        this.a = b.ALLOW;
    }

    r(k kVar) {
        this();
    }
}
