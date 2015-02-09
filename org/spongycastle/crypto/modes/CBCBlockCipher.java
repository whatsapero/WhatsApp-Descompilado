package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.spongycastle.util.Arrays;
import org.whispersystems.libaxolotl.ay;

public class CBCBlockCipher implements BlockCipher {
    private static final String[] z;
    private byte[] IV;
    private int blockSize;
    private byte[] cbcNextV;
    private byte[] cbcV;
    private BlockCipher cipher;
    private boolean encrypting;

    static {
        int i;
        int i2;
        String[] strArr = new String[6];
        char[] toCharArray = "U6M2".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 122;
                    break;
                case ay.f /*1*/:
                    i2 = 117;
                    break;
                case ay.n /*2*/:
                    i2 = 15;
                    break;
                case ay.p /*3*/:
                    i2 = 113;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0019\u0014a\u001f \u000eUl\u0019.\u0014\u0012jQ*\u0014\u0016}\b?\u000e\u001ca\u0016o\t\u0001n\u0005*Z\u0002f\u0005'\u0015\u0000{Q?\b\u001ay\u0018+\u0013\u001bhQ$\u001f\f!".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 122;
                    break;
                case ay.f /*1*/:
                    i2 = 117;
                    break;
                case ay.n /*2*/:
                    i2 = 15;
                    break;
                case ay.p /*3*/:
                    i2 = 113;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u0013\u001bf\u0005&\u001b\u0019f\u0002.\u000e\u001c`\u001fo\f\u0010l\u0005 \bUb\u0004<\u000eUm\u0014o\u000e\u001djQ<\u001b\u0018jQ#\u001f\u001bh\u0005'Z\u0014|Q-\u0016\u001al\u001ao\t\u001cu\u0014".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 122;
                    break;
                case ay.f /*1*/:
                    i2 = 117;
                    break;
                case ay.n /*2*/:
                    i2 = 15;
                    break;
                case ay.p /*3*/:
                    i2 = 113;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\u0019\u0014a\u001f \u000eUl\u0019.\u0014\u0012jQ*\u0014\u0016}\b?\u000e\u001ca\u0016o\t\u0001n\u0005*Z\u0002f\u0005'\u0015\u0000{Q?\b\u001ay\u0018+\u0013\u001bhQ$\u001f\f!".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 122;
                    break;
                case ay.f /*1*/:
                    i2 = 117;
                    break;
                case ay.n /*2*/:
                    i2 = 15;
                    break;
                case ay.p /*3*/:
                    i2 = 113;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u0013\u001b\u007f\u0004;Z\u0017z\u0017)\u001f\u0007/\u0005 \u0015U|\u0019 \b\u0001".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 122;
                    break;
                case ay.f /*1*/:
                    i2 = 117;
                    break;
                case ay.n /*2*/:
                    i2 = 15;
                    break;
                case ay.p /*3*/:
                    i2 = 113;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "\u0013\u001b\u007f\u0004;Z\u0017z\u0017)\u001f\u0007/\u0005 \u0015U|\u0019 \b\u0001".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 122;
                    break;
                case ay.f /*1*/:
                    i2 = 117;
                    break;
                case ay.n /*2*/:
                    i2 = 15;
                    break;
                case ay.p /*3*/:
                    i2 = 113;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[5] = new String(cArr).intern();
        z = strArr;
    }

    public CBCBlockCipher(BlockCipher blockCipher) {
        this.cipher = null;
        this.cipher = blockCipher;
        this.blockSize = blockCipher.getBlockSize();
        this.IV = new byte[this.blockSize];
        this.cbcV = new byte[this.blockSize];
        this.cbcNextV = new byte[this.blockSize];
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        int i4 = SICBlockCipher.a;
        try {
            if (this.blockSize + i > bArr.length) {
                throw new DataLengthException(z[4]);
            }
            System.arraycopy(bArr, i, this.cbcNextV, 0, this.blockSize);
            int processBlock = this.cipher.processBlock(bArr, i, bArr2, i2);
            while (i3 < this.blockSize) {
                int i5 = i2 + i3;
                bArr2[i5] = (byte) (bArr2[i5] ^ this.cbcV[i3]);
                i3++;
                if (i4 != 0) {
                    break;
                }
            }
            byte[] bArr3 = this.cbcV;
            this.cbcV = this.cbcNextV;
            this.cbcNextV = bArr3;
            return processBlock;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        try {
            return this.encrypting ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(boolean r9, org.spongycastle.crypto.CipherParameters r10) {
        /*
        r8_this = this;
        r1 = org.spongycastle.crypto.modes.SICBlockCipher.a;
        r2 = r8.encrypting;
        r8.encrypting = r9;
        r0 = r10 instanceof org.spongycastle.crypto.params.ParametersWithIV;
        if (r0 == 0) goto L_0x0054;
    L_0x000a:
        r0 = r10;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;
        r3 = r0.getIV();
        r4 = r3.length;	 Catch:{ IllegalArgumentException -> 0x0021 }
        r5 = r8.blockSize;	 Catch:{ IllegalArgumentException -> 0x0021 }
        if (r4 == r5) goto L_0x0023;
    L_0x0016:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0021 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0021 }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0021 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0021 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        r4 = 0;
        r5 = r8.IV;	 Catch:{ IllegalArgumentException -> 0x004e }
        r6 = 0;
        r7 = r3.length;	 Catch:{ IllegalArgumentException -> 0x004e }
        java.lang.System.arraycopy(r3, r4, r5, r6, r7);	 Catch:{ IllegalArgumentException -> 0x004e }
        r8.reset();	 Catch:{ IllegalArgumentException -> 0x004e }
        r3 = r0.getParameters();	 Catch:{ IllegalArgumentException -> 0x004e }
        if (r3 == 0) goto L_0x003f;
    L_0x0034:
        r3 = r8.cipher;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r0 = r0.getParameters();	 Catch:{ IllegalArgumentException -> 0x0050 }
        r3.init(r9, r0);	 Catch:{ IllegalArgumentException -> 0x0050 }
        if (r1 == 0) goto L_0x0052;
    L_0x003f:
        if (r2 == r9) goto L_0x0052;
    L_0x0041:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004c }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x004c }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x004c }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x004c }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x0052:
        if (r1 == 0) goto L_0x0073;
    L_0x0054:
        r8.reset();	 Catch:{ IllegalArgumentException -> 0x006f }
        if (r10 == 0) goto L_0x0060;
    L_0x0059:
        r0 = r8.cipher;	 Catch:{ IllegalArgumentException -> 0x0071 }
        r0.init(r9, r10);	 Catch:{ IllegalArgumentException -> 0x0071 }
        if (r1 == 0) goto L_0x0073;
    L_0x0060:
        if (r2 == r9) goto L_0x0073;
    L_0x0062:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x006d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x006d }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x006d }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x006d }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x0073:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.modes.CBCBlockCipher.init(boolean, org.spongycastle.crypto.CipherParameters):void");
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + z[0];
    }

    public void reset() {
        System.arraycopy(this.IV, 0, this.cbcV, 0, this.IV.length);
        Arrays.fill(this.cbcNextV, (byte) 0);
        this.cipher.reset();
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = SICBlockCipher.a;
        try {
            if (this.blockSize + i > bArr.length) {
                throw new DataLengthException(z[5]);
            }
            int i4 = 0;
            while (i4 < this.blockSize) {
                byte[] bArr3 = this.cbcV;
                bArr3[i4] = (byte) (bArr3[i4] ^ bArr[i + i4]);
                i4++;
                if (i3 != 0) {
                    break;
                }
            }
            i4 = this.cipher.processBlock(this.cbcV, 0, bArr2, i2);
            System.arraycopy(bArr2, i2, this.cbcV, 0, this.cbcV.length);
            return i4;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }
}
