package org.spongycastle.jcajce.provider.symmetric.util;

import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import org.spongycastle.crypto.CipherParameters;
import org.whispersystems.libaxolotl.ay;

public class BCPBEKey implements PBEKey {
    private static final String z;
    String algorithm;
    int digest;
    int ivSize;
    int keySize;
    CipherParameters param;
    PBEKeySpec pbeKeySpec;
    boolean tryWrong;
    int type;

    static {
        char[] toCharArray = "uT`".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 55;
                    break;
                case ay.p /*3*/:
                    i2 = 42;
                    break;
                default:
                    i2 = 116;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public String getFormat() {
        return z;
    }

    int getDigest() {
        return this.digest;
    }

    public int getIvSize() {
        return this.ivSize;
    }

    boolean shouldTryWrongPKCS12() {
        return this.tryWrong;
    }

    int getType() {
        return this.type;
    }

    public int getIterationCount() {
        return this.pbeKeySpec.getIterationCount();
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    int getKeySize() {
        return this.keySize;
    }

    public byte[] getSalt() {
        return this.pbeKeySpec.getSalt();
    }

    public char[] getPassword() {
        return this.pbeKeySpec.getPassword();
    }

    public BCPBEKey(String str, int i, int i2, int i3, int i4, PBEKeySpec pBEKeySpec, CipherParameters cipherParameters) {
        this.tryWrong = false;
        this.algorithm = str;
        this.type = i;
        this.digest = i2;
        this.keySize = i3;
        this.ivSize = i4;
        this.pbeKeySpec = pBEKeySpec;
        this.param = cipherParameters;
    }

    public void setTryWrongPKCS12Zero(boolean z) {
        this.tryWrong = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
        r2_this = this;
        r0 = r2.param;
        if (r0 == 0) goto L_0x0021;
    L_0x0004:
        r0 = r2.param;
        r0 = r0 instanceof org.spongycastle.crypto.params.ParametersWithIV;
        if (r0 == 0) goto L_0x0018;
    L_0x000a:
        r0 = r2.param;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;
        r0 = r0.getParameters();
        r0 = (org.spongycastle.crypto.params.KeyParameter) r0;
        r1 = org.spongycastle.jcajce.provider.symmetric.util.BaseMac.a;
        if (r1 == 0) goto L_0x001c;
    L_0x0018:
        r0 = r2.param;
        r0 = (org.spongycastle.crypto.params.KeyParameter) r0;
    L_0x001c:
        r0 = r0.getKey();
    L_0x0020:
        return r0;
    L_0x0021:
        r0 = r2.type;
        r1 = 5;
        if (r0 != r1) goto L_0x0031;
    L_0x0026:
        r0 = r2.pbeKeySpec;
        r0 = r0.getPassword();
        r0 = org.spongycastle.crypto.PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(r0);
        goto L_0x0020;
    L_0x0031:
        r0 = r2.pbeKeySpec;
        r0 = r0.getPassword();
        r0 = org.spongycastle.crypto.PBEParametersGenerator.PKCS5PasswordToBytes(r0);
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey.getEncoded():byte[]");
    }

    public CipherParameters getParam() {
        return this.param;
    }
}
