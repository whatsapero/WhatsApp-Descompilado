package com.whatsapp;

import java.util.Arrays;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class a19 {
    private static final String[] z;
    public byte[] a;
    public byte[] b;
    public String c;
    public byte[] d;
    public byte[] e;

    static {
        String[] strArr = new String[5];
        String str = "\u0004PWi\r^\u0015V_\u001eD\u0004\u0019";
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
                        i3 = 40;
                        break;
                    case ay.f /*1*/:
                        i3 = 112;
                        break;
                    case ay.n /*2*/:
                        i3 = 36;
                        break;
                    case ay.p /*3*/:
                        i3 = 12;
                        break;
                    default:
                        i3 = 127;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "j\u0011Gg\nX3M|\u0017M\u0002\u0004W\u001cA\u0000Li\r~\u0015V\u007f\u0016G\u001e\u0019";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0004PCc\u0010O\u001cAE\u001b{\u0011HxB";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0004PAb\u001cZ\tTx\u0016G\u001emzB";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\b\u001bAu)M\u0002We\u0010FM";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        return z[2] + Arrays.toString(this.a) + z[1] + this.c + z[0] + Arrays.toString(this.d) + z[3] + Arrays.toString(this.b) + z[4] + Arrays.toString(this.e) + "]";
    }

    public a19(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = bArr;
        this.c = str;
        this.d = bArr2;
        this.b = bArr3;
        this.e = bArr4;
    }
}
