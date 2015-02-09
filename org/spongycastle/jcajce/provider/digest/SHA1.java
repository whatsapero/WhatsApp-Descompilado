package org.spongycastle.jcajce.provider.digest;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.digest.SHA1.BasePBKDF2WithHmacSHA1;
import org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.spongycastle.jcajce.provider.symmetric.util.PBE.Util;
import org.whispersystems.libaxolotl.ay;

public class SHA1 {

    public class BasePBKDF2WithHmacSHA1 extends BaseSecretKeyFactory {
        private static final String[] z;
        private int scheme;

        static {
            int i;
            int i2;
            String[] strArr = new String[5];
            char[] toCharArray = "9c0\u0006\u0010\u0019if,\u0019\t^6\u0002\u001f".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 112;
                        break;
                    case ay.f /*1*/:
                        i2 = 13;
                        break;
                    case ay.n /*2*/:
                        i2 = 70;
                        break;
                    case ay.p /*3*/:
                        i2 = 103;
                        break;
                    default:
                        i2 = 124;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "\u0000b5\u000e\b\u0019{#G\u0017\u0015tf\u000b\u0019\u001ej2\u000f\\\u0002h7\u0012\u0015\u0002h\"]\\".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 112;
                        break;
                    case ay.f /*1*/:
                        i2 = 13;
                        break;
                    case ay.n /*2*/:
                        i2 = 70;
                        break;
                    case ay.p /*3*/:
                        i2 = 103;
                        break;
                    default:
                        i2 = 124;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "\u0000b5\u000e\b\u0019{#G\u0015\u0004h4\u0006\b\u0019b(G\u001f\u001fx(\u0013\\\u0002h7\u0012\u0015\u0002h\"]\\".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 112;
                        break;
                    case ay.f /*1*/:
                        i2 = 13;
                        break;
                    case ay.n /*2*/:
                        i2 = 70;
                        break;
                    case ay.p /*3*/:
                        i2 = 103;
                        break;
                    default:
                        i2 = 124;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "\u0000l5\u0014\u000b\u001f\u007f\"G\u0019\u001d}2\u001e".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 112;
                        break;
                    case ay.f /*1*/:
                        i2 = 13;
                        break;
                    case ay.n /*2*/:
                        i2 = 70;
                        break;
                    case ay.p /*3*/:
                        i2 = 103;
                        break;
                    default:
                        i2 = 124;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "\u001dd5\u0014\u0015\u001ejf\u0015\u0019\u0001x/\u0015\u0019\u0014-5\u0006\u0010\u0004".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 112;
                        break;
                    case ay.f /*1*/:
                        i2 = 13;
                        break;
                    case ay.n /*2*/:
                        i2 = 70;
                        break;
                    case ay.p /*3*/:
                        i2 = 103;
                        break;
                    default:
                        i2 = 124;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[4] = new String(cArr).intern();
            z = strArr;
        }

        protected SecretKey engineGenerateSecret(KeySpec keySpec) {
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
                try {
                    if (pBEKeySpec.getSalt() == null) {
                        throw new InvalidKeySpecException(z[4]);
                    }
                    try {
                        if (pBEKeySpec.getIterationCount() <= 0) {
                            throw new InvalidKeySpecException(z[2] + pBEKeySpec.getIterationCount());
                        }
                        try {
                            if (pBEKeySpec.getKeyLength() <= 0) {
                                throw new InvalidKeySpecException(z[1] + pBEKeySpec.getKeyLength());
                            }
                            try {
                                if (pBEKeySpec.getPassword().length == 0) {
                                    throw new IllegalArgumentException(z[3]);
                                }
                                int keyLength = pBEKeySpec.getKeyLength();
                                return new BCPBEKey(this.algName, this.scheme, 1, keyLength, -1, pBEKeySpec, Util.makePBEMacParameters(pBEKeySpec, this.scheme, 1, keyLength));
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            }
            throw new InvalidKeySpecException(z[0]);
        }

        public BasePBKDF2WithHmacSHA1(String str, int i) {
            super(str);
            this.scheme = i;
        }
    }

    public class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA1Digest());
        }

        public Object clone() {
            org.spongycastle.jcajce.provider.digest.SHA1.Digest digest = (org.spongycastle.jcajce.provider.digest.SHA1.Digest) super.clone();
            digest.digest = new SHA1Digest((SHA1Digest) this.digest);
            return digest;
        }
    }

    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA1Digest()));
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "<\\\u001c\u001fZ<Pl".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 116;
                        break;
                    case ay.f /*1*/:
                        i2 = 17;
                        break;
                    case ay.n /*2*/:
                        i2 = 93;
                        break;
                    case ay.p /*3*/:
                        i2 = 92;
                        break;
                    default:
                        i2 = 9;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGenerator() {
            super(z, 160, new CipherKeyGenerator());
        }
    }

    public class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX;
        private static final String[] z;

        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(z[5], PREFIX + z[8]);
            configurableProvider.addAlgorithm(z[2], z[13]);
            configurableProvider.addAlgorithm(z[1], z[0]);
            addHMACAlgorithm(configurableProvider, z[11], PREFIX + z[7], PREFIX + z[12]);
            configurableProvider.addAlgorithm(z[9], PREFIX + z[4]);
            configurableProvider.addAlgorithm(z[10], z[14]);
            configurableProvider.addAlgorithm(z[6], PREFIX + z[3]);
        }

        static {
            int i;
            String[] strArr = new String[15];
            char[] toCharArray = "\thF\u0003W".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 7;
                        break;
                    case ay.p /*3*/:
                        i2 = 46;
                        break;
                    default:
                        i2 = 102;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "\u001bL`\u0000'6If]H\u0017Et]\u0007=ECG\u0001?Ss\u00005\u0012a".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 7;
                        break;
                    case ay.p /*3*/:
                        i2 = 46;
                        break;
                    default:
                        i2 = 102;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "\u001bL`\u0000'6If]H\u0017Et]\u0007=ECG\u0001?Ss\u00005\u0012a6".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 7;
                        break;
                    case ay.p /*3*/:
                        i2 = 46;
                        break;
                    default:
                        i2 = 102;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "~pEe\"\u001c\u0012PG\u00122hjO\u0005\thF\u001f^\u0018iS".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 7;
                        break;
                    case ay.p /*3*/:
                        i2 = 46;
                        break;
                    default:
                        i2 = 102;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "~pEe\"\u001c\u0012PG\u00122hjO\u0005\thF\u001f3\u000ef?".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 7;
                        break;
                    case ay.p /*3*/:
                        i2 = 46;
                        break;
                    default:
                        i2 = 102;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[4] = new String(cArr).intern();
            toCharArray = "\u0017Et]\u0007=ECG\u0001?Ss\u00005\u0012a*\u001f".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 7;
                        break;
                    case ay.p /*3*/:
                        i2 = 46;
                        break;
                    default:
                        i2 = 102;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[5] = new String(cArr).intern();
            toCharArray = "\tEd\\\u0003.kbW ;CsA\u0014#\u000eWl-\u001ef5y\u000f.HOC\u00079sOoW\u001bNc\u0016$\u0013t".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 7;
                        break;
                    case ay.p /*3*/:
                        i2 = 46;
                        break;
                    default:
                        i2 = 102;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[6] = new String(cArr).intern();
            toCharArray = "~hf]\u000e\u0017Ad".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 7;
                        break;
                    case ay.p /*3*/:
                        i2 = 46;
                        break;
                    default:
                        i2 = 102;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[7] = new String(cArr).intern();
            toCharArray = "~dnI\u0003)T".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 7;
                        break;
                    case ay.p /*3*/:
                        i2 = 46;
                        break;
                    default:
                        i2 = 102;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[8] = new String(cArr).intern();
            toCharArray = "\tEd\\\u0003.kbW ;CsA\u0014#\u000eWl-\u001ef5y\u000f.HOC\u00079sOoW".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 7;
                        break;
                    case ay.p /*3*/:
                        i2 = 46;
                        break;
                    default:
                        i2 = 102;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[9] = new String(cArr).intern();
            toCharArray = "\u001bL`\u0000'6If]H\tEd\\\u0003.kbW ;CsA\u0014#\u000eWl-\u001ef5y\u000f.HOC\u00079sOoW\u001bNc{2\u001c\u0018".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 7;
                        break;
                    case ay.p /*3*/:
                        i2 = 46;
                        break;
                    default:
                        i2 = 102;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[10] = new String(cArr).intern();
            toCharArray = "\thF\u001f".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 7;
                        break;
                    case ay.p /*3*/:
                        i2 = 46;
                        break;
                    default:
                        i2 = 102;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[11] = new String(cArr).intern();
            toCharArray = "~kbW!?Nb\\\u0007.Ou".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 7;
                        break;
                    case ay.p /*3*/:
                        i2 = 46;
                        break;
                    default:
                        i2 = 102;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[12] = new String(cArr).intern();
            toCharArray = "\thF\u0003W".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 7;
                        break;
                    case ay.p /*3*/:
                        i2 = 46;
                        break;
                    default:
                        i2 = 102;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[13] = new String(cArr).intern();
            toCharArray = "\nbLj hwnZ\u000e\u0012MfM5\u0012a6".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 7;
                        break;
                    case ay.p /*3*/:
                        i2 = 46;
                        break;
                    default:
                        i2 = 102;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[14] = new String(cArr).intern();
            z = strArr;
            PREFIX = SHA1.class.getName();
        }
    }

    public class PBKDF2WithHmacSHA18BIT extends BasePBKDF2WithHmacSHA1 {
        private static final String z;

        static {
            char[] toCharArray = "y3U>k\u001b&w\u000eEa\u001c\u007f\u0019~a0/;CMI|\u0013Y".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 41;
                        break;
                    case ay.f /*1*/:
                        i2 = 113;
                        break;
                    case ay.n /*2*/:
                        i2 = 30;
                        break;
                    case ay.p /*3*/:
                        i2 = 122;
                        break;
                    default:
                        i2 = 45;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public PBKDF2WithHmacSHA18BIT() {
            super(z, 1);
        }
    }

    public class PBKDF2WithHmacSHA1UTF8 extends BasePBKDF2WithHmacSHA1 {
        private static final String z;

        static {
            char[] toCharArray = "p\t!O\\\u0012\u001c\u0003\u007frh&\u000bhIh\n[".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 32;
                        break;
                    case ay.f /*1*/:
                        i2 = 75;
                        break;
                    case ay.n /*2*/:
                        i2 = 106;
                        break;
                    case ay.p /*3*/:
                        i2 = 11;
                        break;
                    default:
                        i2 = 26;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public PBKDF2WithHmacSHA1UTF8() {
            super(z, 5);
        }
    }

    private SHA1() {
    }
}
