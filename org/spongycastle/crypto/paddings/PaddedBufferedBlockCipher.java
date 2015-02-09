package org.spongycastle.crypto.paddings;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class PaddedBufferedBlockCipher extends BufferedBlockCipher {
    public static int a;
    private static final String[] z;
    BlockCipherPadding padding;

    static {
        int i;
        int i2;
        String[] strArr = new String[4];
        char[] toCharArray = "C\u0010z\u0013\u0000XEl\u0016\u0013J\u0000|C\u0001C\n.\u0010\u001dC\u0017z".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 14;
                    break;
                case ay.p /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 117;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "@\u0004}\u0017UN\ta\u0000\u001e\f\f`\u0000\u001aA\u0015b\u0006\u0001IEg\rUH\u0000m\u0011\f\\\u0011g\f\u001b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 14;
                    break;
                case ay.p /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 117;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "o\u0004`D\u0001\f\ro\u0015\u0010\f\u0004.\r\u0010K\u0004z\n\u0003IEg\r\u0005Y\u0011.\u000f\u0010B\u0002z\u000bT".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 14;
                    break;
                case ay.p /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 117;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "C\u0010z\u0013\u0000XEl\u0016\u0013J\u0000|C\u0001C\n.\u0010\u001dC\u0017z".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 14;
                    break;
                case ay.p /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 117;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[3] = new String(cArr).intern();
        z = strArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doFinal(byte[] r8, int r9) {
        /*
        r7_this = this;
        r1 = 0;
        r2 = a;
        r0 = r7.cipher;
        r3 = r0.getBlockSize();
        r0 = r7.forEncryption;	 Catch:{ IllegalArgumentException -> 0x0027 }
        if (r0 == 0) goto L_0x004e;
    L_0x000d:
        r0 = r7.bufOff;	 Catch:{ IllegalArgumentException -> 0x0027 }
        if (r0 != r3) goto L_0x0095;
    L_0x0011:
        r0 = r3 * 2;
        r0 = r0 + r9;
        r4 = r8.length;	 Catch:{ IllegalArgumentException -> 0x0029 }
        if (r0 <= r4) goto L_0x002b;
    L_0x0017:
        r7.reset();	 Catch:{ IllegalArgumentException -> 0x0025 }
        r0 = new org.spongycastle.crypto.OutputLengthException;	 Catch:{ IllegalArgumentException -> 0x0025 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0025 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0025 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0025 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        throw r0;
    L_0x0027:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0025 }
    L_0x002b:
        r0 = r7.cipher;
        r4 = r7.buf;
        r0 = r0.processBlock(r4, r1, r8, r9);
        r7.bufOff = r1;
    L_0x0035:
        r4 = r7.padding;
        r5 = r7.buf;
        r6 = r7.bufOff;
        r4.addPadding(r5, r6);
        r4 = r7.cipher;
        r5 = r7.buf;
        r6 = r9 + r0;
        r4 = r4.processBlock(r5, r1, r8, r6);
        r0 = r0 + r4;
        r7.reset();	 Catch:{ IllegalArgumentException -> 0x0071 }
        if (r2 == 0) goto L_0x0085;
    L_0x004e:
        r0 = r7.bufOff;	 Catch:{ IllegalArgumentException -> 0x0071 }
        if (r0 != r3) goto L_0x0061;
    L_0x0052:
        r0 = r7.cipher;
        r3 = r7.buf;
        r4 = r7.buf;
        r0 = r0.processBlock(r3, r1, r4, r1);
        r1 = 0;
        r7.bufOff = r1;	 Catch:{ IllegalArgumentException -> 0x006f }
        if (r2 == 0) goto L_0x0073;
    L_0x0061:
        r7.reset();	 Catch:{ IllegalArgumentException -> 0x006f }
        r0 = new org.spongycastle.crypto.DataLengthException;	 Catch:{ IllegalArgumentException -> 0x006f }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x006f }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x006f }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x006f }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r1 = r7.padding;	 Catch:{ all -> 0x008e }
        r3 = r7.buf;	 Catch:{ all -> 0x008e }
        r1 = r1.padCount(r3);	 Catch:{ all -> 0x008e }
        r0 = r0 - r1;
        r1 = r7.buf;	 Catch:{ all -> 0x008e }
        r3 = 0;
        java.lang.System.arraycopy(r1, r3, r8, r9, r0);	 Catch:{ all -> 0x008e }
        r7.reset();
    L_0x0085:
        r1 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;	 Catch:{ IllegalArgumentException -> 0x0093 }
        if (r1 == 0) goto L_0x008d;
    L_0x0089:
        r1 = r2 + 1;
        a = r1;	 Catch:{ IllegalArgumentException -> 0x0093 }
    L_0x008d:
        return r0;
    L_0x008e:
        r0 = move-exception;
        r7.reset();
        throw r0;
    L_0x0093:
        r0 = move-exception;
        throw r0;
    L_0x0095:
        r0 = r1;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher.doFinal(byte[], int):int");
    }

    public PaddedBufferedBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, new PKCS7Padding());
    }

    public PaddedBufferedBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
        this.cipher = blockCipher;
        this.padding = blockCipherPadding;
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    public int getOutputSize(int i) {
        int i2 = this.bufOff + i;
        int length = i2 % this.buf.length;
        if (length != 0) {
            return (i2 - length) + this.buf.length;
        }
        try {
            return this.forEncryption ? i2 + this.buf.length : i2;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public int processByte(byte b, byte[] bArr, int i) {
        int processBlock;
        if (this.bufOff == this.buf.length) {
            processBlock = this.cipher.processBlock(this.buf, 0, bArr, i);
            this.bufOff = 0;
        } else {
            processBlock = 0;
        }
        byte[] bArr2 = this.buf;
        int i2 = this.bufOff;
        this.bufOff = i2 + 1;
        bArr2[i2] = b;
        return processBlock;
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        this.forEncryption = z;
        reset();
        try {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.padding.init(parametersWithRandom.getRandom());
                this.cipher.init(z, parametersWithRandom.getParameters());
                if (a == 0) {
                    return;
                }
            }
            this.padding.init(null);
            this.cipher.init(z, cipherParameters);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        boolean z = false;
        int i4 = a;
        if (i2 < 0) {
            try {
                throw new IllegalArgumentException(z[2]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int i5;
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i2);
        if (updateOutputSize > 0) {
            try {
                if (updateOutputSize + i3 > bArr2.length) {
                    throw new OutputLengthException(z[3]);
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        int length = this.buf.length - this.bufOff;
        if (i2 > length) {
            System.arraycopy(bArr, i, this.buf, this.bufOff, length);
            updateOutputSize = this.cipher.processBlock(this.buf, 0, bArr2, i3) + 0;
            this.bufOff = 0;
            i5 = i2 - length;
            length += i;
            while (i5 > this.buf.length) {
                updateOutputSize += this.cipher.processBlock(bArr, length, bArr2, i3 + updateOutputSize);
                i5 -= blockSize;
                length += blockSize;
                if (i4 != 0) {
                    try {
                        if (!BaseKeyGenerator.a) {
                            z = true;
                        }
                        BaseKeyGenerator.a = z;
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
            }
        }
        updateOutputSize = 0;
        i5 = i2;
        length = i;
        System.arraycopy(bArr, length, this.buf, this.bufOff, i5);
        this.bufOff = i5 + this.bufOff;
        return updateOutputSize;
    }

    public int getUpdateOutputSize(int i) {
        int i2 = this.bufOff + i;
        int length = i2 % this.buf.length;
        if (length != 0) {
            return i2 - length;
        }
        try {
            return Math.max(0, i2 - this.buf.length);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
