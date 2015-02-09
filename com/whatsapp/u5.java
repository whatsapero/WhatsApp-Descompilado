package com.whatsapp;

import java.util.Arrays;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class u5 {
    private static final String[] z;
    public byte[] a;
    public a19 b;
    public byte[] c;

    static {
        String[] strArr = new String[3];
        String str = "=< \u001bdyy,=x~{$\u001f^u!";
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
                        i3 = 28;
                        break;
                    case ay.n /*2*/:
                        i3 = 72;
                        break;
                    case ay.p /*3*/:
                        i3 = 122;
                        break;
                    default:
                        i3 = 23;
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
                    str = "=<+\u0013gyy:1rh!";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "S}+\u0011baW-\u00037J";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public u5(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.b = new a19(bArr, str, bArr2, bArr3, bArr5);
        this.a = bArr4;
        this.c = bArr6;
    }

    public String toString() {
        return z[1] + this.b.toString() + z[0] + Arrays.toString(this.a) + z[2] + Arrays.toString(this.c) + "]";
    }
}
