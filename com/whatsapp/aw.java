package com.whatsapp;

import com.whatsapp.protocol.c7;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class aw extends ag {
    private static final String[] z;
    c7 b;

    static {
        String[] strArr = new String[3];
        String str = "}ph\u001d0mvh\u000b(hcC\u001bx";
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
                        i3 = 12;
                        break;
                    case ay.f /*1*/:
                        i3 = 2;
                        break;
                    case ay.n /*2*/:
                        i3 = 55;
                        break;
                    case ay.p /*3*/:
                        i3 = 126;
                        break;
                    default:
                        i3 = 88;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ",mGDx";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ",vDDx";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public aw(c7 c7Var) {
        this.b = c7Var;
    }

    public String a() {
        return z[0] + this.b.b + z[2] + this.b.e + z[1] + this.b.d;
    }

    public void c() {
        App.a(this.b.e, this.b.b, this.b.d);
    }
}
