package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class az extends w {
    private static final String[] z;
    final j a;

    static {
        String[] strArr = new String[6];
        String str = "[3Ep+";
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
                        i3 = 42;
                        break;
                    case ay.f /*1*/:
                        i3 = 70;
                        break;
                    case ay.n /*2*/:
                        i3 = 32;
                        break;
                    case ay.p /*3*/:
                        i3 = 2;
                        break;
                    default:
                        i3 = 82;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\\'Lw7";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "C2Eo";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "F/Sv";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "@/D";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "^?Pg";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    az(j jVar) {
        this.a = jVar;
    }

    public void a(int i) {
        if (i == 404) {
            j.a(this.a).d();
        }
    }

    public void a(bi biVar, String str) {
        int i = 0;
        boolean z = b.n;
        bi a = biVar.a(0);
        bi.b(a, z[0]);
        a = a.a(0);
        bi.b(a, z[4]);
        j.a(this.a).d();
        if (a.e != null) {
            while (i < a.e.length) {
                bi biVar2 = a.e[i];
                bi.b(biVar2, z[3]);
                if (z[5].equals(biVar2.b(z[1]))) {
                    String b = biVar2.b(z[2]);
                    if (b != null) {
                        j.a(this.a).b(b);
                    }
                }
                i++;
                if (z) {
                    break;
                }
            }
        }
        j.a(this.a).c();
    }
}
