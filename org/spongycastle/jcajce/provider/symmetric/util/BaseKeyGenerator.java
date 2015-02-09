package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.whispersystems.libaxolotl.ay;

public class BaseKeyGenerator extends KeyGeneratorSpi {
    public static boolean a;
    private static final String z;
    protected String algName;
    protected int defaultKeySize;
    protected CipherKeyGenerator engine;
    protected int keySize;
    protected boolean uninitialised;

    static {
        char[] toCharArray = "\u0001fYn^\"yA+z*gY+s".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 79;
                    break;
                case ay.f /*1*/:
                    i2 = 9;
                    break;
                case ay.n /*2*/:
                    i2 = 45;
                    break;
                case ay.p /*3*/:
                    i2 = 78;
                    break;
                default:
                    i2 = 23;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void engineInit(int i, SecureRandom secureRandom) {
        try {
            if (secureRandom == null) {
                secureRandom = new SecureRandom();
            }
            this.engine.init(new KeyGenerationParameters(secureRandom, i));
            this.uninitialised = false;
        } catch (IllegalArgumentException e) {
            throw new InvalidParameterException(e.getMessage());
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        throw new InvalidAlgorithmParameterException(z);
    }

    protected void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            try {
                this.engine.init(new KeyGenerationParameters(secureRandom, this.defaultKeySize));
                this.uninitialised = false;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    protected SecretKey engineGenerateKey() {
        try {
            if (this.uninitialised) {
                this.engine.init(new KeyGenerationParameters(new SecureRandom(), this.defaultKeySize));
                this.uninitialised = false;
            }
            return new SecretKeySpec(this.engine.generateKey(), this.algName);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected BaseKeyGenerator(String str, int i, CipherKeyGenerator cipherKeyGenerator) {
        this.uninitialised = true;
        this.algName = str;
        this.defaultKeySize = i;
        this.keySize = i;
        this.engine = cipherKeyGenerator;
    }
}
