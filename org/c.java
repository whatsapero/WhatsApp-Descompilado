package org;

import java.io.ByteArrayOutputStream;
import java.util.BitSet;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class c implements d, b, l, a {
    public static int a;
    private static final BitSet b;
    private static final String z;

    static {
        int i;
        char[] toCharArray = "\u0011eZ]\u00041o\fM\u001d7\u007fIXE(yER\u001c9i@YH=eOS\f1eK".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i2 = 0; length > i2; i2++) {
            char c = cArr[i2];
            switch (i2 % 5) {
                case PBE.MD5 /*0*/:
                    i = 88;
                    break;
                case ay.f /*1*/:
                    i = 11;
                    break;
                case ay.n /*2*/:
                    i = 44;
                    break;
                case ay.p /*3*/:
                    i = 60;
                    break;
                default:
                    i = 104;
                    break;
            }
            cArr[i2] = (char) (i ^ c);
        }
        z = new String(cArr).intern();
        b = new BitSet(256);
        i = 33;
        while (i <= 60) {
            try {
                b.set(i);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        i = 62;
        while (i <= 126) {
            try {
                b.set(i);
                i++;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            }
        }
        b.set(9);
        b.set(32);
    }

    public static final byte[] a(byte[] bArr) {
        int i = a;
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        while (i2 < bArr.length) {
            byte b = bArr[i2];
            if (b == 61) {
                i2++;
                try {
                    int a = k.a(bArr[i2]);
                    i2++;
                    byteArrayOutputStream.write((char) ((a << 4) + k.a(bArr[i2])));
                } catch (Throwable e) {
                    throw new h(z, e);
                }
            }
            byteArrayOutputStream.write(b);
            i2++;
            if (i != 0) {
                break;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
