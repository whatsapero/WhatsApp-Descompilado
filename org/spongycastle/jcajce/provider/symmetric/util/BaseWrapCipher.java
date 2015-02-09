package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.spongycastle.crypto.Wrapper;
import org.whispersystems.libaxolotl.ay;

public abstract class BaseWrapCipher extends CipherSpi implements PBE {
    private static final String[] z;
    private Class[] availableSpecs;
    protected AlgorithmParameters engineParams;
    private byte[] iv;
    private int ivSize;
    protected Wrapper wrapEngine;

    static {
        int i;
        int i2;
        String[] strArr = new String[14];
        char[] toCharArray = "I5JFb".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 80;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "|\u0012j\r1I!ZD1I#\u000f}\u0001ip_L1M=JY&^#\u000fY,\f2J\r0I$\u0001".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 80;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "I>HD-Ip@C/UpYL/E4\u000fK,^pX_\"\\ FC$".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 80;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "B?[\r0Y _B1X5K\r%C\"\u000fZ1M _D-K".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 80;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "o1AC,XpX_\"\\pDH:\u0000pAX/@pJC C4FC$\u0002".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 80;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "O1A\n7\f#Z]3C\"[\r.C4J\r".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 80;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "\f%AF-C'A\u0003".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 80;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "|1KI*B7\u000f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 80;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "B?[\r0Y _B1X5K\r%C\"\u000fZ1M _D-K".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 80;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "y>DC,[>\u000fF&Up[T3Ip".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 80;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "y>DC,[>\u000fF&Up[T3Ip".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 80;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "\u007f\u0013".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 80;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "y>DC,[>\u000fF&Up[T3Ip".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 80;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "O1A\n7\f8NC'@5\u000f]\"^1BH7I\"\u000f".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 80;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[13] = new String(cArr).intern();
        z = strArr;
    }

    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec parameterSpec;
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (algorithmParameters != null) {
            int i2 = 0;
            while (i2 != this.availableSpecs.length) {
                try {
                    parameterSpec = algorithmParameters.getParameterSpec(this.availableSpecs[i2]);
                    break;
                } catch (Exception e) {
                    i2++;
                    if (BaseMac.a) {
                        break;
                    }
                }
            }
            parameterSpec = algorithmParameterSpec;
            if (parameterSpec == null) {
                try {
                    throw new InvalidAlgorithmParameterException(z[13] + algorithmParameters.toString());
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        parameterSpec = null;
        this.engineParams = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }

    protected int engineGetBlockSize() {
        return 0;
    }

    protected BaseWrapCipher(Wrapper wrapper, int i) {
        this.availableSpecs = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapEngine = wrapper;
        this.ivSize = i;
    }

    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    protected byte[] engineWrap(Key key) {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            try {
                throw new InvalidKeyException(z[4]);
            } catch (BadPaddingException e) {
                throw e;
            }
        }
        try {
            if (this.wrapEngine == null) {
                encoded = engineDoFinal(encoded, 0, encoded.length);
            } else {
                try {
                    encoded = this.wrapEngine.wrap(encoded, 0, encoded.length);
                } catch (BadPaddingException e2) {
                    throw new IllegalBlockSizeException(e2.getMessage());
                }
            }
            return encoded;
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        throw new RuntimeException(z[8]);
    }

    protected void engineSetMode(String str) {
        throw new NoSuchAlgorithmException(z[5] + str);
    }

    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    protected byte[] engineGetIV() {
        return (byte[]) this.iv.clone();
    }

    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.security.Key engineUnwrap(byte[] r6, java.lang.String r7, int r8) {
        /*
        r5_this = this;
        r0 = r5.wrapEngine;	 Catch:{ InvalidCipherTextException -> 0x0020, BadPaddingException -> 0x002b, IllegalBlockSizeException -> 0x0036 }
        if (r0 != 0) goto L_0x000e;
    L_0x0004:
        r0 = 0;
        r1 = r6.length;	 Catch:{ InvalidCipherTextException -> 0x0020, BadPaddingException -> 0x002b, IllegalBlockSizeException -> 0x0036 }
        r0 = r5.engineDoFinal(r6, r0, r1);	 Catch:{ InvalidCipherTextException -> 0x0020, BadPaddingException -> 0x002b, IllegalBlockSizeException -> 0x0036 }
        r1 = org.spongycastle.jcajce.provider.symmetric.util.BaseMac.a;	 Catch:{ InvalidCipherTextException -> 0x0020, BadPaddingException -> 0x002b, IllegalBlockSizeException -> 0x0036 }
        if (r1 == 0) goto L_0x0016;
    L_0x000e:
        r0 = r5.wrapEngine;	 Catch:{ InvalidCipherTextException -> 0x0020, BadPaddingException -> 0x002b, IllegalBlockSizeException -> 0x0036 }
        r1 = 0;
        r2 = r6.length;	 Catch:{ InvalidCipherTextException -> 0x0020, BadPaddingException -> 0x002b, IllegalBlockSizeException -> 0x0036 }
        r0 = r0.unwrap(r6, r1, r2);	 Catch:{ InvalidCipherTextException -> 0x0020, BadPaddingException -> 0x002b, IllegalBlockSizeException -> 0x0036 }
    L_0x0016:
        r1 = 3;
        if (r8 != r1) goto L_0x0043;
    L_0x0019:
        r1 = new javax.crypto.spec.SecretKeySpec;	 Catch:{ InvalidCipherTextException -> 0x0041 }
        r1.<init>(r0, r7);	 Catch:{ InvalidCipherTextException -> 0x0041 }
        r0 = r1;
    L_0x001f:
        return r0;
    L_0x0020:
        r0 = move-exception;
        r1 = new java.security.InvalidKeyException;
        r0 = r0.getMessage();
        r1.<init>(r0);
        throw r1;
    L_0x002b:
        r0 = move-exception;
        r1 = new java.security.InvalidKeyException;
        r0 = r0.getMessage();
        r1.<init>(r0);
        throw r1;
    L_0x0036:
        r0 = move-exception;
        r1 = new java.security.InvalidKeyException;
        r0 = r0.getMessage();
        r1.<init>(r0);
        throw r1;
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r1 = z;	 Catch:{ NoSuchProviderException -> 0x0069, InvalidKeySpecException -> 0x008b }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ NoSuchProviderException -> 0x0069, InvalidKeySpecException -> 0x008b }
        r1 = java.security.KeyFactory.getInstance(r7, r1);	 Catch:{ NoSuchProviderException -> 0x0069, InvalidKeySpecException -> 0x008b }
        r2 = 1;
        if (r8 != r2) goto L_0x005a;
    L_0x0050:
        r2 = new java.security.spec.X509EncodedKeySpec;	 Catch:{ NoSuchProviderException -> 0x0069, InvalidKeySpecException -> 0x008b }
        r2.<init>(r0);	 Catch:{ NoSuchProviderException -> 0x0069, InvalidKeySpecException -> 0x008b }
        r0 = r1.generatePublic(r2);	 Catch:{ NoSuchProviderException -> 0x0069, InvalidKeySpecException -> 0x008b }
        goto L_0x001f;
    L_0x005a:
        r2 = 2;
        if (r8 != r2) goto L_0x00ad;
    L_0x005d:
        r2 = new java.security.spec.PKCS8EncodedKeySpec;	 Catch:{ InvalidCipherTextException -> 0x0067 }
        r2.<init>(r0);	 Catch:{ InvalidCipherTextException -> 0x0067 }
        r0 = r1.generatePrivate(r2);	 Catch:{ InvalidCipherTextException -> 0x0067 }
        goto L_0x001f;
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r0 = move-exception;
        r1 = new java.security.InvalidKeyException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 10;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r0.getMessage();
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x008b:
        r0 = move-exception;
        r1 = new java.security.InvalidKeyException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r0.getMessage();
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x00ad:
        r0 = new java.security.InvalidKeyException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 12;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher.engineUnwrap(byte[], java.lang.String, int):java.security.Key");
    }

    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        throw new RuntimeException(z[3]);
    }

    protected BaseWrapCipher(Wrapper wrapper) {
        this(wrapper, 0);
    }

    protected int engineGetOutputSize(int i) {
        return -1;
    }

    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return 0;
    }

    protected void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    protected void engineSetPadding(String str) {
        throw new NoSuchPaddingException(z[7] + str + z[6]);
    }

    protected BaseWrapCipher() {
        this.availableSpecs = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.engineParams = null;
        this.wrapEngine = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void engineInit(int r6, java.security.Key r7, java.security.spec.AlgorithmParameterSpec r8, java.security.SecureRandom r9) {
        /*
        r5_this = this;
        r4 = 0;
        r2 = org.spongycastle.jcajce.provider.symmetric.util.BaseMac.a;
        r0 = r7 instanceof org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
        if (r0 == 0) goto L_0x0038;
    L_0x0007:
        r0 = r7;
        r0 = (org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey) r0;
        r1 = r8 instanceof javax.crypto.spec.PBEParameterSpec;
        if (r1 == 0) goto L_0x001a;
    L_0x000e:
        r1 = r5.wrapEngine;
        r1 = r1.getAlgorithmName();
        r1 = org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r0, r8, r1);
        if (r2 == 0) goto L_0x0035;
    L_0x001a:
        r1 = r0.getParam();	 Catch:{ IllegalArgumentException -> 0x0033 }
        if (r1 == 0) goto L_0x0026;
    L_0x0020:
        r0 = r0.getParam();
        if (r2 == 0) goto L_0x0036;
    L_0x0026:
        r0 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ IllegalArgumentException -> 0x0031 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0031 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0031 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0031 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0031 }
    L_0x0031:
        r0 = move-exception;
        throw r0;
    L_0x0033:
        r0 = move-exception;
        throw r0;
    L_0x0035:
        r0 = r1;
    L_0x0036:
        if (r2 == 0) goto L_0x0041;
    L_0x0038:
        r0 = new org.spongycastle.crypto.params.KeyParameter;
        r1 = r7.getEncoded();
        r0.<init>(r1);
    L_0x0041:
        r1 = r8 instanceof javax.crypto.spec.IvParameterSpec;
        if (r1 == 0) goto L_0x0051;
    L_0x0045:
        r8 = (javax.crypto.spec.IvParameterSpec) r8;
        r1 = new org.spongycastle.crypto.params.ParametersWithIV;
        r3 = r8.getIV();
        r1.<init>(r0, r3);
        r0 = r1;
    L_0x0051:
        r1 = r0 instanceof org.spongycastle.crypto.params.KeyParameter;	 Catch:{ IllegalArgumentException -> 0x007f }
        if (r1 == 0) goto L_0x00a2;
    L_0x0055:
        r1 = r5.ivSize;	 Catch:{ IllegalArgumentException -> 0x007f }
        if (r1 == 0) goto L_0x00a2;
    L_0x0059:
        r1 = r5.ivSize;
        r1 = new byte[r1];
        r5.iv = r1;
        r1 = r5.iv;
        r9.nextBytes(r1);
        r1 = new org.spongycastle.crypto.params.ParametersWithIV;
        r3 = r5.iv;
        r1.<init>(r0, r3);
    L_0x006b:
        if (r9 == 0) goto L_0x00a0;
    L_0x006d:
        r0 = new org.spongycastle.crypto.params.ParametersWithRandom;
        r0.<init>(r1, r9);
    L_0x0072:
        switch(r6) {
            case 1: goto L_0x0091;
            case 2: goto L_0x0091;
            case 3: goto L_0x0081;
            case 4: goto L_0x0089;
            default: goto L_0x0075;
        };
    L_0x0075:
        r0 = java.lang.System.out;
        r1 = z;
        r1 = r1[r4];
        r0.println(r1);
    L_0x007e:
        return;
    L_0x007f:
        r0 = move-exception;
        throw r0;
    L_0x0081:
        r1 = r5.wrapEngine;	 Catch:{ IllegalArgumentException -> 0x009e }
        r3 = 1;
        r1.init(r3, r0);	 Catch:{ IllegalArgumentException -> 0x009e }
        if (r2 == 0) goto L_0x007e;
    L_0x0089:
        r1 = r5.wrapEngine;	 Catch:{ IllegalArgumentException -> 0x009c }
        r3 = 0;
        r1.init(r3, r0);	 Catch:{ IllegalArgumentException -> 0x009c }
        if (r2 == 0) goto L_0x007e;
    L_0x0091:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x009c }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x009c }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x009c }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x009c }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x009c }
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x009c }
    L_0x00a0:
        r0 = r1;
        goto L_0x0072;
    L_0x00a2:
        r1 = r0;
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }
}
