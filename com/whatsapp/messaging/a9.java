package com.whatsapp.messaging;

import com.whatsapp.protocol.cd;
import com.whatsapp.protocol.t;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class a9 {
    private static final String[] z;
    public final Runnable a;
    public final cd b;
    public final byte[] c;
    public final t d;

    static {
        String[] strArr = new String[5];
        String str = "I\r;87s\r98\"n\t!/\n|\u000100\u0015I\u001c4(\u0002X\u0004:>L";
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
                        i3 = 26;
                        break;
                    case ay.f /*1*/:
                        i3 = 104;
                        break;
                    case ay.n /*2*/:
                        i3 = 85;
                        break;
                    case ay.p /*3*/:
                        i3 = 92;
                        break;
                    default:
                        i3 = 113;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "6H0.\u0003u\u001a\u0016=\u001dv\n4?\u001a'";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "6H'9\u0010~-'.\u001eh+40\u001dx\t67L";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "6H&)\u0012y\r&/2{\u00049>\u0010y\u0003h";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ":\n,(\u0014i";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        int i = 0;
        StringBuilder append = new StringBuilder().append(z[0]);
        if (this.c != null) {
            i = this.c.length;
        }
        return append.append(i).append(z[1]).append(z[4]).append(this.a).append(z[2]).append(this.b).append(z[3]).append(this.d).append('}').toString();
    }

    public a9(byte[] bArr, Runnable runnable, cd cdVar, t tVar) {
        this.c = bArr;
        this.a = runnable;
        this.b = cdVar;
        this.d = tVar;
    }
}
