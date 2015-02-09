package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a3 extends w {
    private static final String[] z;
    final j a;

    static {
        String[] strArr = new String[5];
        String str = "!\u0006.\u001c^&\u0006\"";
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
                        i3 = 68;
                        break;
                    case ay.f /*1*/:
                        i3 = 106;
                        break;
                    case ay.n /*2*/:
                        i3 = 71;
                        break;
                    case ay.p /*3*/:
                        i3 = 123;
                        break;
                    default:
                        i3 = 55;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "0\u00182\u001e";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "!\u0006.\u001c^&\u0006\"";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ".\u0003#";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "1\u0019\"\t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a3(j jVar) {
        this.a = jVar;
    }

    public void a(bi biVar, String str) {
        String[] strArr;
        boolean z = b.n;
        bi d = biVar.d(z[0]);
        if (!(d == null || d.e == null)) {
            String[] strArr2 = new String[d.e.length];
            int i = 0;
            int i2 = 0;
            while (i < d.e.length) {
                bi biVar2 = d.e[i];
                bi.b(biVar2, z[1]);
                String b = biVar2.b(z[4]);
                if (z[2].equals(biVar2.b(z[3]))) {
                    int i3 = i2 + 1;
                    strArr2[i2] = b;
                    i2 = i3;
                }
                i++;
                if (z) {
                    break;
                }
            }
            if (!z) {
                strArr = strArr2;
                j.a(this.a).a(strArr);
            }
        }
        strArr = new String[0];
        j.a(this.a).a(strArr);
    }

    public void a(int i) {
        j.a(this.a).a(new Integer(i));
    }
}
