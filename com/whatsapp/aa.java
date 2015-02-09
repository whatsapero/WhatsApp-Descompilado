package com.whatsapp;

import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class aa extends ag {
    private static final String[] z;
    List b;
    int c;
    boolean d;
    String e;

    static {
        String[] strArr = new String[5];
        String str = "8(y\b\u0019'\"i\u0019W!gg\u000f^&";
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
                        i3 = 85;
                        break;
                    case ay.f /*1*/:
                        i3 = 71;
                        break;
                    case ay.n /*2*/:
                        i3 = 10;
                        break;
                    case ay.p /*3*/:
                        i3 = 124;
                        break;
                    default:
                        i3 = 57;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "udg\u000f^&}*";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "84m\\H \"x\u0005\u0019<#0\\";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "u3s\f\\og";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "$5U\u0011J24*";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void c() {
        App.a(this.e, this.b, this.c, false, this.d, null, null);
    }

    public aa(String str, List list, int i, boolean z) {
        this.e = str;
        this.b = list;
        this.c = i;
        this.d = z;
    }

    public String a() {
        return z[1] + (this.e == null ? z[0] : z[3] + this.e) + z[4] + this.c + z[2] + this.b.size();
    }
}
