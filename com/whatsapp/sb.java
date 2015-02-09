package com.whatsapp;

import java.util.Arrays;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class sb {
    private static final String[] z;
    public byte[] a;
    public int b;
    public byte[] c;

    static {
        String[] strArr = new String[3];
        String str = "H<&\u0005EY";
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
                        i3 = 100;
                        break;
                    case ay.f /*1*/:
                        i3 = 28;
                        break;
                    case ay.n /*2*/:
                        i3 = 77;
                        break;
                    case ay.p /*3*/:
                        i3 = 96;
                        break;
                    default:
                        i3 = 60;
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
                    str = "#y9#U\u0014t(\u0012w\u0001e\u001f\u0005O\u0011p9@g\u0007s)\u0005\u0001";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "H<,\u0003_\u000bi#\u0014t\u0005o%]";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        return z[2] + this.b + z[0] + Arrays.toString(this.c) + z[1] + Arrays.toString(this.a) + "]";
    }

    public sb(int i, byte[] bArr, byte[] bArr2) {
        this.b = i;
        this.c = bArr;
        this.a = bArr2;
    }
}
