package org.spongycastle.crypto;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class StreamBlockCipher implements BlockCipher, StreamCipher {
    private static final String[] z;
    private final BlockCipher cipher;

    static {
        int i;
        String[] strArr = new String[2];
        char[] toCharArray = "H+xN[S~nKHA;~\u001eZH1,MFH,x".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i2 = 0; length > i2; i2++) {
            char c = cArr[i2];
            switch (i2 % 5) {
                case PBE.MD5 /*0*/:
                    i = 39;
                    break;
                case ay.f /*1*/:
                    i = 94;
                    break;
                case ay.n /*2*/:
                    i = 12;
                    break;
                case ay.p /*3*/:
                    i = 62;
                    break;
                default:
                    i = 46;
                    break;
            }
            cArr[i2] = (char) (i ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "N0|KZ\u0007<yXHB,,JAH~\u007fSOK2".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i = 39;
                    break;
                case ay.f /*1*/:
                    i = 94;
                    break;
                case ay.n /*2*/:
                    i = 12;
                    break;
                case ay.p /*3*/:
                    i = 62;
                    break;
                default:
                    i = 46;
                    break;
            }
            cArr[length] = (char) (i ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    protected abstract byte calculateByte(byte b);

    public final byte returnByte(byte b) {
        return calculateByte(b);
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        boolean z = DataLengthException.a;
        try {
            if (i3 + i2 > bArr2.length) {
                throw new DataLengthException(z[0]);
            }
            try {
                if (i + i2 > bArr.length) {
                    throw new DataLengthException(z[1]);
                }
                int i4 = i + i2;
                while (i < i4) {
                    int i5 = i3 + 1;
                    int i6 = i + 1;
                    bArr2[i3] = calculateByte(bArr[i]);
                    if (z) {
                        break;
                    }
                    i3 = i5;
                    i = i6;
                }
                return i2;
            } catch (DataLengthException e) {
                throw e;
            }
        } catch (DataLengthException e2) {
            throw e2;
        }
    }

    protected StreamBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }
}
