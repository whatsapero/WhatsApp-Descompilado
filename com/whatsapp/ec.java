package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class ec {
    private static final String[] z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    static {
        String[] strArr = new String[4];
        String str = "\u001a^\u0005\n?B+\b\u0003,U\u0016\u000f\u0014;RC";
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
                        i3 = 54;
                        break;
                    case ay.f /*1*/:
                        i3 = 126;
                        break;
                    case ay.n /*2*/:
                        i3 = 102;
                        break;
                    case ay.p /*3*/:
                        i3 = 98;
                        break;
                    default:
                        i3 = 94;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u001a^\u000f\u0011\u001aC\u000e\n\u000b=W\n\u0003_";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "w\u001a\u00020;E\u000b\n\u0016%A\u001f\u00151+U\u001d\u0003\u0011-\u000b";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u001a^\u0005\n?B?\u0002\u0006;RC";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        return z[3] + this.b + z[1] + this.c + z[2] + this.d + z[0] + this.a + '}';
    }

    public ec(boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = z;
        this.c = z2;
        this.a = z3;
        this.d = z4;
    }
}
