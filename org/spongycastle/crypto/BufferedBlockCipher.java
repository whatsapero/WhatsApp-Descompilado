package org.spongycastle.crypto;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class BufferedBlockCipher {
    private static final String[] z;
    protected byte[] buf;
    protected int bufOff;
    protected BlockCipher cipher;
    protected boolean forEncryption;
    protected boolean partialBlockOkay;
    protected boolean pgpCFB;

    static {
        int i;
        int i2;
        String[] strArr = new String[6];
        char[] toCharArray = "&\b\\\u0004Y=]J\u0001J/\u0018ZTX&\u0012\b\u0007D&\u000f\\TJ&\u000f\b\u0010C\u000f\u0014F\u0015@aT".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 73;
                    break;
                case ay.f /*1*/:
                    i2 = 125;
                    break;
                case ay.n /*2*/:
                    i2 = 40;
                    break;
                case ay.p /*3*/:
                    i2 = 116;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "-\u001c\\\u0015\f'\u0012\\TN%\u0012K\u001f\f:\u0014R\u0011\f(\u0011A\u0013B,\u0019".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 73;
                    break;
                case ay.f /*1*/:
                    i2 = 125;
                    break;
                case ay.n /*2*/:
                    i2 = 40;
                    break;
                case ay.p /*3*/:
                    i2 = 116;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\n\u001cFSXi\u0015I\u0002Ii\u001c\b\u001aI.\u001c\\\u001dZ,]A\u001a\\<\t\b\u0018I'\u001a\\\u001c\r".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 73;
                    break;
                case ay.f /*1*/:
                    i2 = 125;
                    break;
                case ay.n /*2*/:
                    i2 = 40;
                    break;
                case ay.p /*3*/:
                    i2 = 116;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "&\b\\\u0004Y=]J\u0001J/\u0018ZTX&\u0012\b\u0007D&\u000f\\".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 73;
                    break;
                case ay.f /*1*/:
                    i2 = 125;
                    break;
                case ay.n /*2*/:
                    i2 = 40;
                    break;
                case ay.p /*3*/:
                    i2 = 116;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u0019:x".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 73;
                    break;
                case ay.f /*1*/:
                    i2 = 125;
                    break;
                case ay.n /*2*/:
                    i2 = 40;
                    break;
                case ay.p /*3*/:
                    i2 = 116;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "\u0006\rM\u001a|\u000e-".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 73;
                    break;
                case ay.f /*1*/:
                    i2 = 125;
                    break;
                case ay.n /*2*/:
                    i2 = 40;
                    break;
                case ay.p /*3*/:
                    i2 = 116;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[5] = new String(cArr).intern();
        z = strArr;
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public void reset() {
        boolean z = DataLengthException.a;
        int i = 0;
        while (i < this.buf.length) {
            this.buf[i] = (byte) 0;
            i++;
            if (z) {
                break;
            }
        }
        this.bufOff = 0;
        this.cipher.reset();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getUpdateOutputSize(int r4) {
        /*
        r3_this = this;
        r0 = r3.bufOff;
        r1 = r4 + r0;
        r0 = r3.pgpCFB;
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r3.buf;
        r0 = r0.length;
        r0 = r1 % r0;
        r2 = r3.cipher;
        r2 = r2.getBlockSize();
        r2 = r2 + 2;
        r0 = r0 - r2;
        r2 = org.spongycastle.crypto.DataLengthException.a;
        if (r2 == 0) goto L_0x001f;
    L_0x001a:
        r0 = r3.buf;
        r0 = r0.length;
        r0 = r1 % r0;
    L_0x001f:
        r0 = r1 - r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.BufferedBlockCipher.getUpdateOutputSize(int):int");
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        this.forEncryption = z;
        reset();
        this.cipher.init(z, cipherParameters);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BufferedBlockCipher(org.spongycastle.crypto.BlockCipher r8) {
        /*
        r7_this = this;
        r1 = 1;
        r2 = 0;
        r3 = org.spongycastle.crypto.DataLengthException.a;
        r7.<init>();
        r7.cipher = r8;
        r0 = r8.getBlockSize();
        r0 = new byte[r0];
        r7.buf = r0;
        r7.bufOff = r2;
        r4 = r8.getAlgorithmName();
        r0 = 47;
        r0 = r4.indexOf(r0);
        r5 = r0 + 1;
        if (r5 <= 0) goto L_0x0057;
    L_0x0021:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r6 = 4;
        r0 = r0[r6];	 Catch:{ IllegalArgumentException -> 0x0055 }
        r0 = r4.startsWith(r0, r5);	 Catch:{ IllegalArgumentException -> 0x0055 }
        if (r0 == 0) goto L_0x0057;
    L_0x002c:
        r0 = r1;
    L_0x002d:
        r7.pgpCFB = r0;	 Catch:{ IllegalArgumentException -> 0x0059 }
        r0 = r7.pgpCFB;	 Catch:{ IllegalArgumentException -> 0x0059 }
        if (r0 != 0) goto L_0x0037;
    L_0x0033:
        r0 = r8 instanceof org.spongycastle.crypto.StreamCipher;	 Catch:{ IllegalArgumentException -> 0x005b }
        if (r0 == 0) goto L_0x003c;
    L_0x0037:
        r0 = 1;
        r7.partialBlockOkay = r0;	 Catch:{ IllegalArgumentException -> 0x005d }
        if (r3 == 0) goto L_0x004c;
    L_0x003c:
        if (r5 <= 0) goto L_0x0063;
    L_0x003e:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r6 = 5;
        r0 = r0[r6];	 Catch:{ IllegalArgumentException -> 0x0061 }
        r0 = r4.startsWith(r0, r5);	 Catch:{ IllegalArgumentException -> 0x0061 }
        if (r0 == 0) goto L_0x0063;
    L_0x0049:
        r0 = r1;
    L_0x004a:
        r7.partialBlockOkay = r0;
    L_0x004c:
        r0 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;	 Catch:{ IllegalArgumentException -> 0x0065 }
        if (r0 == 0) goto L_0x0054;
    L_0x0050:
        if (r3 == 0) goto L_0x0069;
    L_0x0052:
        org.spongycastle.crypto.DataLengthException.a = r2;
    L_0x0054:
        return;
    L_0x0055:
        r0 = move-exception;
        throw r0;
    L_0x0057:
        r0 = r2;
        goto L_0x002d;
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r0 = r2;
        goto L_0x004a;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r2 = r1;
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.BufferedBlockCipher.<init>(org.spongycastle.crypto.BlockCipher):void");
    }

    protected BufferedBlockCipher() {
    }

    public int doFinal(byte[] bArr, int i) {
        int i2 = 0;
        try {
            if (this.bufOff + i > bArr.length) {
                throw new OutputLengthException(z[0]);
            }
            if (this.bufOff != 0) {
                if (this.partialBlockOkay) {
                    this.cipher.processBlock(this.buf, 0, this.buf, 0);
                    i2 = this.bufOff;
                    this.bufOff = 0;
                    System.arraycopy(this.buf, 0, bArr, i, i2);
                } else {
                    throw new DataLengthException(z[1]);
                }
            }
            reset();
            return i2;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (Throwable th) {
            reset();
        }
    }

    public int processByte(byte b, byte[] bArr, int i) {
        byte[] bArr2 = this.buf;
        int i2 = this.bufOff;
        this.bufOff = i2 + 1;
        bArr2[i2] = b;
        if (this.bufOff != this.buf.length) {
            return 0;
        }
        int processBlock = this.cipher.processBlock(this.buf, 0, bArr, i);
        this.bufOff = 0;
        return processBlock;
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        boolean z = DataLengthException.a;
        if (i2 < 0) {
            try {
                throw new IllegalArgumentException(z[2]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int i4;
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
            i4 = i2 - length;
            length += i;
            while (i4 > this.buf.length) {
                updateOutputSize += this.cipher.processBlock(bArr, length, bArr2, i3 + updateOutputSize);
                i4 -= blockSize;
                length += blockSize;
                if (z) {
                    try {
                        if (BaseKeyGenerator.a) {
                            z = false;
                        } else {
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
        i4 = i2;
        length = i;
        System.arraycopy(bArr, length, this.buf, this.bufOff, i4);
        this.bufOff = i4 + this.bufOff;
        if (this.bufOff != this.buf.length) {
            return updateOutputSize;
        }
        updateOutputSize += this.cipher.processBlock(this.buf, 0, bArr2, i3 + updateOutputSize);
        this.bufOff = 0;
        return updateOutputSize;
    }

    public int getOutputSize(int i) {
        return this.bufOff + i;
    }
}
