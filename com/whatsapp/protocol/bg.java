package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class bg extends w {
    private static final String[] z;
    final j a;

    static {
        String[] strArr = new String[3];
        String str = "$3";
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
                        i3 = 87;
                        break;
                    case ay.n /*2*/:
                        i3 = 97;
                        break;
                    case ay.p /*3*/:
                        i3 = 122;
                        break;
                    default:
                        i3 = 24;
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
                    str = "=;\u0000\u000e~\"%\f";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ".8\u000f\u001cq*";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    bg(j jVar) {
        this.a = jVar;
    }

    public void a(int i) {
        if (i == 404) {
            j.a(this.a).l(null, null);
            if (!n) {
                return;
            }
        }
        j.a(this.a).d(i);
    }

    public void a(bi biVar, String str) {
        bi a = biVar.a(0);
        bi.b(a, z[1]);
        j.a(this.a).l(a.b(z[2]), a.b(z[0]));
    }
}
