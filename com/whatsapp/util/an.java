package com.whatsapp.util;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class an extends am {
    private static final String[] z;
    protected am[] d;

    static {
        String[] strArr = new String[4];
        String str = "1T&\u0016BuE+\u0011";
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
                        i3 = 17;
                        break;
                    case ay.f /*1*/:
                        i3 = 55;
                        break;
                    case ay.n /*2*/:
                        i3 = 78;
                        break;
                    case ay.p /*3*/:
                        i3 = 127;
                        break;
                    default:
                        i3 = 46;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "1T&\u0016Bu";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "1U7\u000bKb\u001enR\u000e";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "1\u001f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public am[] a() {
        return this.d;
    }

    public String toString() {
        return this.c + z[1] + this.a + z[3] + this.d.length + (this.d.length == 1 ? z[2] : z[0]);
    }

    protected an(long j, String str, am[] amVarArr) {
        super(j, str);
        this.d = amVarArr;
    }
}
