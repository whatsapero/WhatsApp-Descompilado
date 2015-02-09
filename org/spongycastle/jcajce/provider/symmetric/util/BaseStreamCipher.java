package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.whispersystems.libaxolotl.ay;

public class BaseStreamCipher extends BaseWrapCipher implements PBE {
    private static final String[] z;
    private Class[] availableSpecs;
    private StreamCipher cipher;
    private int ivLength;
    private ParametersWithIV ivParam;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;

    static {
        int i;
        int i2;
        String[] strArr = new String[14];
        char[] toCharArray = "2s".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 83;
                    break;
                case ay.p /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0002Q=WSAX2\u001eC\rUs\u0000F\u0013Q>\u0015S\u0004Bs".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 83;
                    break;
                case ay.p /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "1Q7\u0014N\u000fWs".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 83;
                    break;
                case ay.p /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "/_\u0003\u0011C\u0005Y=\u0017".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 83;
                    break;
                case ay.p /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "AE=\u001bI\u000eG=^".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 83;
                    break;
                case ay.p /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "A@2\u0003T\u0004T".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 83;
                    break;
                case ay.p /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "A^<\u0004\u0007\u0012E:\u0004F\u0003\\6PA\u000eBs\u0003^\f]6\u0004U\bSs\u0015I\u0013I#\u0004N\u000e^}".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 83;
                    break;
                case ay.p /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "*U*PA\u000eBs\u0011K\u0006_!\u0019S\t]s".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 83;
                    break;
                case ay.p /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "\u000f_s9qAC6\u0004\u0007\u0016X6\u001e\u0007\u000e^6PB\u0019@6\u0013S\u0004T".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 83;
                    break;
                case ay.p /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "\u0014^8\u001eH\u0016^s\u0000F\u0013Q>\u0015S\u0004Bs\u0004^\u0011U}".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 83;
                    break;
                case ay.p /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "\u0014^8\u001eH\u0016^s\u001fW\f_7\u0015\u0007".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 83;
                    break;
                case ay.p /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "1r\u0016PU\u0004A&\u0019U\u0004Cs e$\u0010#\u0011U\u0000]6\u0004B\u0013Cs\u0004HAR6PT\u0004D}".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 83;
                    break;
                case ay.p /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "\u0002Q=WSAC&\u0000W\u000eB'PJ\u000eT6P".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 83;
                    break;
                case ay.p /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "$s\u0011".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 83;
                    break;
                case ay.p /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[13] = new String(cArr).intern();
        z = strArr;
    }

    protected void engineSetMode(String str) {
        try {
            if (!str.equalsIgnoreCase(z[13])) {
                throw new IllegalArgumentException(z[12] + str);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected byte[] engineGetIV() {
        try {
            return this.ivParam != null ? this.ivParam.getIV() : null;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected void engineSetPadding(String str) {
        try {
            if (!str.equalsIgnoreCase(z[3])) {
                throw new NoSuchPaddingException(z[2] + str + z[4]);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.cipher.processBytes(bArr, i, i2, bArr2, 0);
        return bArr2;
    }

    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            byte[] engineUpdate = engineUpdate(bArr, i, i2);
            this.cipher.reset();
            return engineUpdate;
        }
        this.cipher.reset();
        return new byte[0];
    }

    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        try {
            this.cipher.processBytes(bArr, i, i2, bArr2, i3);
            return i2;
        } catch (DataLengthException e) {
            throw new ShortBufferException(e.getMessage());
        }
    }

    protected BaseStreamCipher(StreamCipher streamCipher, int i) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.ivLength = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.cipher = streamCipher;
        this.ivLength = i;
    }

    protected AlgorithmParameters engineGetParameters() {
        try {
            if (this.engineParams != null || this.pbeSpec == null) {
                return this.engineParams;
            }
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance(this.pbeAlgorithm, z[0]);
                instance.init(this.pbeSpec);
                return instance;
            } catch (Exception e) {
                return null;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    protected void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    protected int engineGetOutputSize(int i) {
        return i;
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
                    throw new InvalidAlgorithmParameterException(z[1] + algorithmParameters.toString());
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        parameterSpec = null;
        engineInit(i, key, parameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    protected int engineGetBlockSize() {
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void engineInit(int r9, java.security.Key r10, java.security.spec.AlgorithmParameterSpec r11, java.security.SecureRandom r12) {
        /*
        r8_this = this;
        r7 = 1;
        r4 = org.spongycastle.jcajce.provider.symmetric.util.BaseMac.a;
        r1 = 0;
        r8.pbeSpec = r1;	 Catch:{ Exception -> 0x0039 }
        r1 = 0;
        r8.pbeAlgorithm = r1;	 Catch:{ Exception -> 0x0039 }
        r1 = 0;
        r8.engineParams = r1;	 Catch:{ Exception -> 0x0039 }
        r1 = r10 instanceof javax.crypto.SecretKey;	 Catch:{ Exception -> 0x0039 }
        if (r1 != 0) goto L_0x003b;
    L_0x0010:
        r1 = new java.security.InvalidKeyException;	 Catch:{ Exception -> 0x0039 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0039 }
        r2.<init>();	 Catch:{ Exception -> 0x0039 }
        r3 = z;	 Catch:{ Exception -> 0x0039 }
        r4 = 7;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0039 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0039 }
        r3 = r10.getAlgorithm();	 Catch:{ Exception -> 0x0039 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0039 }
        r3 = z;	 Catch:{ Exception -> 0x0039 }
        r4 = 6;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0039 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0039 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0039 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0039 }
        throw r1;	 Catch:{ Exception -> 0x0039 }
    L_0x0039:
        r1 = move-exception;
        throw r1;
    L_0x003b:
        r1 = r10 instanceof org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
        if (r1 == 0) goto L_0x0098;
    L_0x003f:
        r1 = r10;
        r1 = (org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey) r1;
        r2 = r1.getAlgorithm();
        r8.pbeAlgorithm = r2;
        r2 = r1.getParam();
        if (r2 == 0) goto L_0x0063;
    L_0x004e:
        r2 = r1.getParam();
        r3 = new javax.crypto.spec.PBEParameterSpec;	 Catch:{ Exception -> 0x0087 }
        r5 = r1.getSalt();	 Catch:{ Exception -> 0x0087 }
        r6 = r1.getIterationCount();	 Catch:{ Exception -> 0x0087 }
        r3.<init>(r5, r6);	 Catch:{ Exception -> 0x0087 }
        r8.pbeSpec = r3;	 Catch:{ Exception -> 0x0087 }
        if (r4 == 0) goto L_0x008a;
    L_0x0063:
        r2 = r11 instanceof javax.crypto.spec.PBEParameterSpec;	 Catch:{ Exception -> 0x0087 }
        if (r2 == 0) goto L_0x0079;
    L_0x0067:
        r2 = r8.cipher;
        r2 = r2.getAlgorithmName();
        r3 = org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r1, r11, r2);
        r0 = r11;
        r0 = (javax.crypto.spec.PBEParameterSpec) r0;	 Catch:{ Exception -> 0x0085 }
        r2 = r0;
        r8.pbeSpec = r2;	 Catch:{ Exception -> 0x0085 }
        if (r4 == 0) goto L_0x0089;
    L_0x0079:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x0085 }
        r2 = z;	 Catch:{ Exception -> 0x0085 }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0085 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0085 }
        throw r1;	 Catch:{ Exception -> 0x0085 }
    L_0x0085:
        r1 = move-exception;
        throw r1;
    L_0x0087:
        r1 = move-exception;
        throw r1;
    L_0x0089:
        r2 = r3;
    L_0x008a:
        r1 = r1.getIvSize();	 Catch:{ Exception -> 0x00d3 }
        if (r1 <= 0) goto L_0x0096;
    L_0x0090:
        r0 = r2;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;	 Catch:{ Exception -> 0x00d3 }
        r1 = r0;
        r8.ivParam = r1;	 Catch:{ Exception -> 0x00d3 }
    L_0x0096:
        if (r4 == 0) goto L_0x015f;
    L_0x0098:
        if (r11 != 0) goto L_0x00a5;
    L_0x009a:
        r2 = new org.spongycastle.crypto.params.KeyParameter;
        r1 = r10.getEncoded();
        r2.<init>(r1);
        if (r4 == 0) goto L_0x015c;
    L_0x00a5:
        r1 = r11 instanceof javax.crypto.spec.IvParameterSpec;	 Catch:{ Exception -> 0x00d5 }
        if (r1 == 0) goto L_0x00c5;
    L_0x00a9:
        r2 = new org.spongycastle.crypto.params.ParametersWithIV;
        r1 = new org.spongycastle.crypto.params.KeyParameter;
        r3 = r10.getEncoded();
        r1.<init>(r3);
        r11 = (javax.crypto.spec.IvParameterSpec) r11;
        r3 = r11.getIV();
        r2.<init>(r1, r3);
        r0 = r2;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;	 Catch:{ Exception -> 0x00d1 }
        r1 = r0;
        r8.ivParam = r1;	 Catch:{ Exception -> 0x00d1 }
        if (r4 == 0) goto L_0x00d7;
    L_0x00c5:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x00d1 }
        r2 = z;	 Catch:{ Exception -> 0x00d1 }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ Exception -> 0x00d1 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x00d1 }
        throw r1;	 Catch:{ Exception -> 0x00d1 }
    L_0x00d1:
        r1 = move-exception;
        throw r1;
    L_0x00d3:
        r1 = move-exception;
        throw r1;
    L_0x00d5:
        r1 = move-exception;
        throw r1;
    L_0x00d7:
        r1 = r2;
    L_0x00d8:
        r2 = r8.ivLength;	 Catch:{ Exception -> 0x010e }
        if (r2 == 0) goto L_0x0110;
    L_0x00dc:
        r2 = r1 instanceof org.spongycastle.crypto.params.ParametersWithIV;	 Catch:{ Exception -> 0x010e }
        if (r2 != 0) goto L_0x0110;
    L_0x00e0:
        if (r12 != 0) goto L_0x00e7;
    L_0x00e2:
        r12 = new java.security.SecureRandom;
        r12.<init>();
    L_0x00e7:
        if (r9 == r7) goto L_0x00ec;
    L_0x00e9:
        r2 = 3;
        if (r9 != r2) goto L_0x0100;
    L_0x00ec:
        r2 = r8.ivLength;
        r3 = new byte[r2];
        r12.nextBytes(r3);
        r2 = new org.spongycastle.crypto.params.ParametersWithIV;
        r2.<init>(r1, r3);
        r0 = r2;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;	 Catch:{ Exception -> 0x010c }
        r1 = r0;
        r8.ivParam = r1;	 Catch:{ Exception -> 0x010c }
        if (r4 == 0) goto L_0x0111;
    L_0x0100:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x010c }
        r2 = z;	 Catch:{ Exception -> 0x010c }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ Exception -> 0x010c }
        r1.<init>(r2);	 Catch:{ Exception -> 0x010c }
        throw r1;	 Catch:{ Exception -> 0x010c }
    L_0x010c:
        r1 = move-exception;
        throw r1;
    L_0x010e:
        r1 = move-exception;
        throw r1;
    L_0x0110:
        r2 = r1;
    L_0x0111:
        switch(r9) {
            case 1: goto L_0x0147;
            case 2: goto L_0x014f;
            case 3: goto L_0x0147;
            case 4: goto L_0x014f;
            default: goto L_0x0114;
        };
    L_0x0114:
        r1 = new java.security.InvalidParameterException;	 Catch:{ Exception -> 0x013a }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x013a }
        r2.<init>();	 Catch:{ Exception -> 0x013a }
        r3 = z;	 Catch:{ Exception -> 0x013a }
        r4 = 10;
        r3 = r3[r4];	 Catch:{ Exception -> 0x013a }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x013a }
        r2 = r2.append(r9);	 Catch:{ Exception -> 0x013a }
        r3 = z;	 Catch:{ Exception -> 0x013a }
        r4 = 5;
        r3 = r3[r4];	 Catch:{ Exception -> 0x013a }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x013a }
        r2 = r2.toString();	 Catch:{ Exception -> 0x013a }
        r1.<init>(r2);	 Catch:{ Exception -> 0x013a }
        throw r1;	 Catch:{ Exception -> 0x013a }
    L_0x013a:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x013c }
    L_0x013c:
        r1 = move-exception;
        r2 = new java.security.InvalidKeyException;
        r1 = r1.getMessage();
        r2.<init>(r1);
        throw r2;
    L_0x0147:
        r1 = r8.cipher;	 Catch:{ Exception -> 0x0158 }
        r3 = 1;
        r1.init(r3, r2);	 Catch:{ Exception -> 0x0158 }
        if (r4 == 0) goto L_0x0157;
    L_0x014f:
        r1 = r8.cipher;	 Catch:{ Exception -> 0x015a }
        r3 = 0;
        r1.init(r3, r2);	 Catch:{ Exception -> 0x015a }
        if (r4 != 0) goto L_0x0114;
    L_0x0157:
        return;
    L_0x0158:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x015a }
    L_0x015a:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x013a }
    L_0x015c:
        r1 = r2;
        goto L_0x00d8;
    L_0x015f:
        r1 = r2;
        goto L_0x00d8;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 != 0) {
            try {
                this.cipher.processBytes(bArr, i, i2, bArr2, i3);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.cipher.reset();
        return i2;
    }
}
