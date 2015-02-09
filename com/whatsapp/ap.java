package com.whatsapp;

import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ap extends ag {
    private static final String[] z;
    List b;
    String c;
    boolean d;
    int e;

    static {
        String[] strArr = new String[3];
        String str = "6`cW94bSK/\"2H\\,\"(\u001c";
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
                        i3 = 71;
                        break;
                    case ay.f /*1*/:
                        i3 = 18;
                        break;
                    case ay.n /*2*/:
                        i3 = 60;
                        break;
                    case ay.p /*3*/:
                        i3 = 37;
                        break;
                    default:
                        i3 = 92;
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
                    str = "g{X\u001f|";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "g1X@(&{PVfg";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void c() {
        App.a(this.c, this.b, this.e, this.d);
    }

    public String a() {
        return z[0] + this.e + z[2] + this.c + z[1] + (this.b != null ? Integer.valueOf(this.b.size()) : "-");
    }

    public ap(String str, List list, int i, boolean z) {
        this.c = str;
        this.b = list;
        this.e = i;
        this.d = z;
    }
}
