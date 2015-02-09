package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.StreamBlockCipher;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class SICBlockCipher extends StreamBlockCipher implements StreamCipher {
    public static int a;
    private static final String[] z;
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] counter;
    private byte[] counterOut;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "^Mn:\u000fb`H:\u0010huXs\u0010hw\rJ\u0003\u007fe@\u007f\u0016hv^M\u000byldL".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 13;
                    break;
                case ay.f /*1*/:
                    i2 = 4;
                    break;
                case ay.n /*2*/:
                    i2 = 45;
                    break;
                case ay.p /*3*/:
                    i2 = 26;
                    break;
                default:
                    i2 = 98;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\"WdY".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 13;
                    break;
                case ay.f /*1*/:
                    i2 = 4;
                    break;
                case ay.n /*2*/:
                    i2 = 45;
                    break;
                case ay.p /*3*/:
                    i2 = 26;
                    break;
                default:
                    i2 = 98;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    protected byte calculateByte(byte b) {
        try {
            byte[] bArr;
            int i;
            if (this.byteCount == 0) {
                this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
                bArr = this.counterOut;
                i = this.byteCount;
                this.byteCount = i + 1;
                return (byte) (bArr[i] ^ b);
            }
            bArr = this.counterOut;
            i = this.byteCount;
            this.byteCount = i + 1;
            byte b2 = (byte) (bArr[i] ^ b);
            try {
                if (this.byteCount != this.counter.length) {
                    return b2;
                }
                this.byteCount = 0;
                incrementCounter();
                return b2;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + z[1];
    }

    public void reset() {
        System.arraycopy(this.IV, 0, this.counter, 0, this.counter.length);
        this.cipher.reset();
        this.byteCount = 0;
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        try {
            if (cipherParameters instanceof ParametersWithIV) {
                ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
                try {
                    System.arraycopy(parametersWithIV.getIV(), 0, this.IV, 0, this.IV.length);
                    if (parametersWithIV.getParameters() != null) {
                        this.cipher.init(true, parametersWithIV.getParameters());
                    }
                    reset();
                    if (a == 0) {
                        return;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            throw new IllegalArgumentException(z[0]);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        processBytes(bArr, i, this.blockSize, bArr2, i2);
        return this.blockSize;
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    private void incrementCounter() {
        int i = a;
        int length = this.counter.length - 1;
        while (length >= 0) {
            try {
                byte[] bArr = this.counter;
                byte b = (byte) (bArr[length] + 1);
                bArr[length] = b;
                if (b == null) {
                    length--;
                    if (i != 0) {
                        return;
                    }
                }
                return;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public SICBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.cipher = blockCipher;
        this.blockSize = this.cipher.getBlockSize();
        this.IV = new byte[this.blockSize];
        this.counter = new byte[this.blockSize];
        this.counterOut = new byte[this.blockSize];
        this.byteCount = 0;
    }
}
