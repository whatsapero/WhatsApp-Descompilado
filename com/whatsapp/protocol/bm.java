package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class bm extends w {
    private static final String[] z;
    final j a;

    static {
        String[] strArr = new String[4];
        String str = "W=\u001eQ\u0017";
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
                        i3 = 52;
                        break;
                    case ay.f /*1*/:
                        i3 = 82;
                        break;
                    case ay.n /*2*/:
                        i3 = 107;
                        break;
                    case ay.p /*3*/:
                        i3 = 63;
                        break;
                    default:
                        i3 = 99;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "B3\u0007J\u0006";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0013r\u001c^\u0010\u0014<\u0004KCZ'\u0006Z\u0011]1";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "B3\u0007J\u0006\u0014u";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    bm(j jVar) {
        this.a = jVar;
    }

    public void a(int i) {
        if (i == 404) {
            try {
                j.d(this.a).a(0);
            } catch (NumberFormatException e) {
                throw e;
            }
        }
    }

    public void a(bi biVar, String str) {
        String e = bi.a(biVar.d(z[0])).e(z[2]);
        try {
            j.d(this.a).a(Integer.parseInt(e));
        } catch (NumberFormatException e2) {
            throw new l(z[1] + e + z[3]);
        }
    }
}
