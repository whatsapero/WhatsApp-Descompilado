package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;
import org.whispersystems.libaxolotl.ay;

public class BaseSecretKeyFactory extends SecretKeyFactorySpi implements PBE {
    private static final String[] z;
    protected String algName;

    static {
        int i;
        int i2;
        String[] strArr = new String[5];
        char[] toCharArray = "\u0018J@7=\u0016L\u0019\u0014,\u0001NT\u00019\u0016]\u0019\r>SAL\b!".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 115;
                    break;
                case ay.f /*1*/:
                    i2 = 47;
                    break;
                case ay.n /*2*/:
                    i2 = 57;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 77;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0018J@D=\u0012]X\t(\u0007JKD$\u0000\u000fW\u0011!\u001f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 115;
                    break;
                case ay.f /*1*/:
                    i2 = 47;
                    break;
                case ay.n /*2*/:
                    i2 = 57;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 77;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = ":AO\u0005!\u001aK\u0019/(\n|I\u0001.".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 115;
                    break;
                case ay.f /*1*/:
                    i2 = 47;
                    break;
                case ay.n /*2*/:
                    i2 = 57;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 77;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "8J@D#\u001c[\u0019\u000b+S[@\u0014(S".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 115;
                    break;
                case ay.f /*1*/:
                    i2 = 47;
                    break;
                case ay.n /*2*/:
                    i2 = 57;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 77;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u0018J@D=\u0012]X\t(\u0007JKD$\u0000\u000fW\u0011!\u001f".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 115;
                    break;
                case ay.f /*1*/:
                    i2 = 47;
                    break;
                case ay.n /*2*/:
                    i2 = 57;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 77;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[4] = new String(cArr).intern();
        z = strArr;
    }

    protected SecretKey engineTranslateKey(SecretKey secretKey) {
        if (secretKey == null) {
            throw new InvalidKeyException(z[4]);
        } else if (secretKey.getAlgorithm().equalsIgnoreCase(this.algName)) {
            return new SecretKeySpec(secretKey.getEncoded(), this.algName);
        } else {
            throw new InvalidKeyException(z[3] + this.algName + ".");
        }
    }

    protected KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) {
        if (cls == null) {
            try {
                throw new InvalidKeySpecException(z[0]);
            } catch (Exception e) {
                throw e;
            }
        } else if (secretKey == null) {
            try {
                throw new InvalidKeySpecException(z[1]);
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            try {
                if (SecretKeySpec.class.isAssignableFrom(cls)) {
                    return new SecretKeySpec(secretKey.getEncoded(), this.algName);
                }
                try {
                    return (KeySpec) cls.getConstructor(new Class[]{byte[].class}).newInstance(new Object[]{secretKey.getEncoded()});
                } catch (Exception e22) {
                    throw new InvalidKeySpecException(e22.toString());
                }
            } catch (Exception e222) {
                throw e222;
            }
        }
    }

    protected BaseSecretKeyFactory(String str) {
        this.algName = str;
    }

    protected SecretKey engineGenerateSecret(KeySpec keySpec) {
        if (keySpec instanceof SecretKeySpec) {
            return (SecretKey) keySpec;
        }
        throw new InvalidKeySpecException(z[2]);
    }
}
