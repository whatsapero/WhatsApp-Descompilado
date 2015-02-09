package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class at extends w {
    private static final String[] z;
    final j a;
    final byte[] b;
    final byte[] c;

    static {
        String[] strArr = new String[4];
        String str = "u\u001eoM";
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
                        i3 = 22;
                        break;
                    case ay.f /*1*/:
                        i3 = 113;
                        break;
                    case ay.n /*2*/:
                        i3 = 11;
                        break;
                    case ay.p /*3*/:
                        i3 = 40;
                        break;
                    default:
                        i3 = 22;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "u\u0003rXby";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "`\u0014y[\u007fy\u001f";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "f\u0010x[ay\u0003o";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(bi biVar, String str) {
        bi a = biVar.a(0);
        bi.b(a, z[2]);
        j.a(this.a).a(a.b(z[3]), a.d(z[0]).b, a.d(z[1]).b, this.b, this.c);
    }

    at(j jVar, byte[] bArr, byte[] bArr2) {
        this.a = jVar;
        this.b = bArr;
        this.c = bArr2;
    }
}
