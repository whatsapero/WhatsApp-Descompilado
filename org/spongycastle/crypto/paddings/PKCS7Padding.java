package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class PKCS7Padding implements BlockCipherPadding {
    private static final String[] z;

    static {
        int i;
        int i2;
        String[] strArr = new String[3];
        char[] toCharArray = "_yJ[\u0004".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 15;
                    break;
                case ay.f /*1*/:
                    i2 = 50;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 8;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u007fSm(Qc]jc\u0013l]{zF\u007fFll".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 15;
                    break;
                case ay.f /*1*/:
                    i2 = 50;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 8;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u007fSm(Qc]jc\u0013l]{zF\u007fFll".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 15;
                    break;
                case ay.f /*1*/:
                    i2 = 50;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 8;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[2] = new String(cArr).intern();
        z = strArr;
    }

    public int addPadding(byte[] bArr, int i) {
        int i2 = PaddedBufferedBlockCipher.a;
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length) {
            bArr[i] = length;
            i++;
            if (i2 != 0) {
                break;
            }
        }
        return length;
    }

    public void init(SecureRandom secureRandom) {
    }

    public int padCount(byte[] bArr) {
        int i = PaddedBufferedBlockCipher.a;
        byte b = bArr[bArr.length - 1] & 255;
        if (b > bArr.length || b == (byte) 0) {
            throw new InvalidCipherTextException(z[2]);
        }
        byte b2 = (byte) 1;
        while (b2 <= b) {
            if (bArr[bArr.length - b2] == b) {
                b2++;
                if (i != 0) {
                    break;
                }
            }
            throw new InvalidCipherTextException(z[1]);
        }
        return b;
    }

    public String getPaddingName() {
        return z[0];
    }
}
