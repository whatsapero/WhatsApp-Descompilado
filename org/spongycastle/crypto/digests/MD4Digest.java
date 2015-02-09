package org.spongycastle.crypto.digests;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.spongycastle.util.Memoable;
import org.whispersystems.libaxolotl.ay;

public class MD4Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 16;
    private static final int S11 = 3;
    private static final int S12 = 7;
    private static final int S13 = 11;
    private static final int S14 = 19;
    private static final int S21 = 3;
    private static final int S22 = 5;
    private static final int S23 = 9;
    private static final int S24 = 13;
    private static final int S31 = 3;
    private static final int S32 = 9;
    private static final int S33 = 11;
    private static final int S34 = 15;
    private static final String z;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int[] X;
    private int xOff;

    static {
        char[] toCharArray = "x\u000fS".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 53;
                    break;
                case ay.f /*1*/:
                    i2 = 75;
                    break;
                case ay.n /*2*/:
                    i2 = 103;
                    break;
                case S31 /*3*/:
                    i2 = 121;
                    break;
                default:
                    i2 = 62;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public int doFinal(byte[] bArr, int i) {
        finish();
        unpackWord(this.H1, bArr, i);
        unpackWord(this.H2, bArr, i + 4);
        unpackWord(this.H3, bArr, i + 8);
        unpackWord(this.H4, bArr, i + 12);
        reset();
        return DIGEST_LENGTH;
    }

    public String getAlgorithmName() {
        return z;
    }

    private int rotateLeft(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    protected void processWord(byte[] bArr, int i) {
        int[] iArr = this.X;
        int i2 = this.xOff;
        this.xOff = i2 + 1;
        iArr[i2] = (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16)) | ((bArr[i + 3] & 255) << 24);
        if (this.xOff == DIGEST_LENGTH) {
            processBlock();
        }
    }

    private int H(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    public MD4Digest(MD4Digest mD4Digest) {
        super((GeneralDigest) mD4Digest);
        this.X = new int[DIGEST_LENGTH];
        copyIn(mD4Digest);
    }

    private void unpackWord(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private int G(int i, int i2, int i3) {
        return ((i & i2) | (i & i3)) | (i2 & i3);
    }

    protected void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        this.X[14] = (int) (-1 & j);
        this.X[S34] = (int) (j >>> 32);
    }

    public void reset() {
        boolean z = GeneralDigest.a;
        super.reset();
        this.H1 = 1732584193;
        this.H2 = -271733879;
        this.H3 = -1732584194;
        this.H4 = 271733878;
        this.xOff = 0;
        int i = 0;
        while (i != this.X.length) {
            this.X[i] = 0;
            i++;
            if (z) {
                return;
            }
        }
    }

    protected void processBlock() {
        boolean z = GeneralDigest.a;
        int i = this.H1;
        int i2 = this.H2;
        int i3 = this.H3;
        int i4 = this.H4;
        i = rotateLeft((i + F(i2, i3, i4)) + this.X[0], S31);
        i4 = rotateLeft((i4 + F(i, i2, i3)) + this.X[1], S12);
        i3 = rotateLeft((i3 + F(i4, i, i2)) + this.X[2], S33);
        i2 = rotateLeft((i2 + F(i3, i4, i)) + this.X[S31], S14);
        i = rotateLeft((i + F(i2, i3, i4)) + this.X[4], S31);
        i4 = rotateLeft((i4 + F(i, i2, i3)) + this.X[S22], S12);
        i3 = rotateLeft((i3 + F(i4, i, i2)) + this.X[6], S33);
        i2 = rotateLeft((i2 + F(i3, i4, i)) + this.X[S12], S14);
        i = rotateLeft((i + F(i2, i3, i4)) + this.X[8], S31);
        i4 = rotateLeft((i4 + F(i, i2, i3)) + this.X[S32], S12);
        i3 = rotateLeft((i3 + F(i4, i, i2)) + this.X[10], S33);
        i2 = rotateLeft((i2 + F(i3, i4, i)) + this.X[S33], S14);
        i = rotateLeft((i + F(i2, i3, i4)) + this.X[12], S31);
        i4 = rotateLeft((i4 + F(i, i2, i3)) + this.X[S24], S12);
        i3 = rotateLeft((i3 + F(i4, i, i2)) + this.X[14], S33);
        i2 = rotateLeft((i2 + F(i3, i4, i)) + this.X[S34], S14);
        i = rotateLeft(((i + G(i2, i3, i4)) + this.X[0]) + 1518500249, S31);
        i4 = rotateLeft(((i4 + G(i, i2, i3)) + this.X[4]) + 1518500249, S22);
        i3 = rotateLeft(((i3 + G(i4, i, i2)) + this.X[8]) + 1518500249, S32);
        i2 = rotateLeft(((i2 + G(i3, i4, i)) + this.X[12]) + 1518500249, S24);
        i = rotateLeft(((i + G(i2, i3, i4)) + this.X[1]) + 1518500249, S31);
        i4 = rotateLeft(((i4 + G(i, i2, i3)) + this.X[S22]) + 1518500249, S22);
        i3 = rotateLeft(((i3 + G(i4, i, i2)) + this.X[S32]) + 1518500249, S32);
        i2 = rotateLeft(((i2 + G(i3, i4, i)) + this.X[S24]) + 1518500249, S24);
        i = rotateLeft(((i + G(i2, i3, i4)) + this.X[2]) + 1518500249, S31);
        i4 = rotateLeft(((i4 + G(i, i2, i3)) + this.X[6]) + 1518500249, S22);
        i3 = rotateLeft(((i3 + G(i4, i, i2)) + this.X[10]) + 1518500249, S32);
        i2 = rotateLeft(((i2 + G(i3, i4, i)) + this.X[14]) + 1518500249, S24);
        i = rotateLeft(((i + G(i2, i3, i4)) + this.X[S31]) + 1518500249, S31);
        i4 = rotateLeft(((i4 + G(i, i2, i3)) + this.X[S12]) + 1518500249, S22);
        i3 = rotateLeft(((i3 + G(i4, i, i2)) + this.X[S33]) + 1518500249, S32);
        i2 = rotateLeft(((i2 + G(i3, i4, i)) + this.X[S34]) + 1518500249, S24);
        i = rotateLeft(((i + H(i2, i3, i4)) + this.X[0]) + 1859775393, S31);
        i4 = rotateLeft(((i4 + H(i, i2, i3)) + this.X[8]) + 1859775393, S32);
        i3 = rotateLeft(((i3 + H(i4, i, i2)) + this.X[4]) + 1859775393, S33);
        i2 = rotateLeft(((i2 + H(i3, i4, i)) + this.X[12]) + 1859775393, S34);
        i = rotateLeft(((i + H(i2, i3, i4)) + this.X[2]) + 1859775393, S31);
        i4 = rotateLeft(((i4 + H(i, i2, i3)) + this.X[10]) + 1859775393, S32);
        i3 = rotateLeft(((i3 + H(i4, i, i2)) + this.X[6]) + 1859775393, S33);
        i2 = rotateLeft(((i2 + H(i3, i4, i)) + this.X[14]) + 1859775393, S34);
        i = rotateLeft(((i + H(i2, i3, i4)) + this.X[1]) + 1859775393, S31);
        i4 = rotateLeft(((i4 + H(i, i2, i3)) + this.X[S32]) + 1859775393, S32);
        i3 = rotateLeft(((i3 + H(i4, i, i2)) + this.X[S22]) + 1859775393, S33);
        i2 = rotateLeft(((i2 + H(i3, i4, i)) + this.X[S24]) + 1859775393, S34);
        i = rotateLeft(((i + H(i2, i3, i4)) + this.X[S31]) + 1859775393, S31);
        i4 = rotateLeft(((i4 + H(i, i2, i3)) + this.X[S33]) + 1859775393, S32);
        i3 = rotateLeft(((i3 + H(i4, i, i2)) + this.X[S12]) + 1859775393, S33);
        i2 = rotateLeft(((i2 + H(i3, i4, i)) + this.X[S34]) + 1859775393, S34);
        this.H1 = i + this.H1;
        this.H2 += i2;
        this.H3 += i3;
        this.H4 += i4;
        this.xOff = 0;
        i = 0;
        while (i != this.X.length) {
            this.X[i] = 0;
            i++;
            if (z) {
                break;
            }
        }
        if (BaseKeyGenerator.a) {
            GeneralDigest.a = !z;
        }
    }

    public Memoable copy() {
        return new MD4Digest(this);
    }

    public int getDigestSize() {
        return DIGEST_LENGTH;
    }

    public MD4Digest() {
        this.X = new int[DIGEST_LENGTH];
        reset();
    }

    private void copyIn(MD4Digest mD4Digest) {
        super.copyIn(mD4Digest);
        this.H1 = mD4Digest.H1;
        this.H2 = mD4Digest.H2;
        this.H3 = mD4Digest.H3;
        this.H4 = mD4Digest.H4;
        System.arraycopy(mD4Digest.X, 0, this.X, 0, mD4Digest.X.length);
        this.xOff = mD4Digest.xOff;
    }

    public void reset(Memoable memoable) {
        copyIn((MD4Digest) memoable);
    }

    private int F(int i, int i2, int i3) {
        return (i & i2) | ((i ^ -1) & i3);
    }
}
