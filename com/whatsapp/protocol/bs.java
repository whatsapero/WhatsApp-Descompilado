package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class bs extends w {
    private static final String[] z;
    final String a;
    final j b;
    final String c;
    final String d;
    final String e;

    static {
        String[] strArr = new String[5];
        String str = "\b+\u001b{";
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
                        i3 = 123;
                        break;
                    case ay.f /*1*/:
                        i3 = 82;
                        break;
                    case ay.n /*2*/:
                        i3 = 117;
                        break;
                    case ay.p /*3*/:
                        i3 = 24;
                        break;
                    default:
                        i3 = 123;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0014!";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0019 \u001ao\b\u001e ";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u000f;\u0018}\u0014\u000e&";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u000b>\u0014l\u001d\u0014 \u0018";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(int i) {
        this.b.n.c(this.a, i);
    }

    public void a(bi biVar, String str) {
        boolean z;
        String str2;
        String str3;
        String str4 = null;
        boolean z2 = true;
        if (biVar != null) {
            bi d = biVar.d(z[0]);
            if (d != null) {
                String b;
                bi d2 = d.d(z[1]);
                if (d2 != null) {
                    b = d2.b(z[2]);
                    str4 = d2.b(z[3]);
                } else {
                    b = null;
                }
                if (d.d(z[4]) == null) {
                    z2 = false;
                }
                z = z2;
                str2 = str4;
                str3 = b;
                this.b.n.a(this.a, this.d, this.e, this.c, str3, str2, z);
            }
        }
        z = false;
        str2 = null;
        str3 = null;
        this.b.n.a(this.a, this.d, this.e, this.c, str3, str2, z);
    }

    bs(j jVar, String str, String str2, String str3, String str4) {
        this.b = jVar;
        this.a = str;
        this.d = str2;
        this.e = str3;
        this.c = str4;
    }
}
