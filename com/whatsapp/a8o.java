package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class a8o {
    private static final String[] z;
    public int a;
    public int b;
    public String c;
    public byte[] d;
    public byte[] e;

    static {
        String[] strArr = new String[3];
        String str = "q*b9zd/";
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
                        i3 = 1;
                        break;
                    case ay.f /*1*/:
                        i3 = 88;
                        break;
                    case ay.n /*2*/:
                        i3 = 7;
                        break;
                    case ay.p /*3*/:
                        i3 = 79;
                        break;
                    default:
                        i3 = 19;
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
                    str = "h5f(v";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "h5f(v";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public a8o(String str, int i, int i2) {
        this.c = str;
        this.b = i;
        this.a = i2;
    }

    public String a() {
        if (this.a == 1) {
            return z[2];
        }
        return this.a == 2 ? z[0] : z[1];
    }

    public a8o(String str, byte[] bArr, byte[] bArr2, int i) {
        this.c = str;
        this.e = bArr;
        this.d = bArr2;
        this.b = i;
    }
}
