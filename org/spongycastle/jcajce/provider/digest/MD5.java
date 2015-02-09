package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class MD5 {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new MD5Digest());
        }

        public Object clone() {
            org.spongycastle.jcajce.provider.digest.MD5.Digest digest = (org.spongycastle.jcajce.provider.digest.MD5.Digest) super.clone();
            digest.digest = new MD5Digest((MD5Digest) this.digest);
            return digest;
        }
    }

    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new MD5Digest()));
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "C^\u0019bQO&".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 11;
                        break;
                    case ay.f /*1*/:
                        i2 = 19;
                        break;
                    case ay.n /*2*/:
                        i2 = 88;
                        break;
                    case ay.p /*3*/:
                        i2 = 33;
                        break;
                    default:
                        i2 = 28;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGenerator() {
            super(z, 128, new CipherKeyGenerator());
        }
    }

    public class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX;
        private static final String[] z;

        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(z[3], PREFIX + z[0]);
            addHMACAlgorithm(configurableProvider, z[4], PREFIX + z[2], PREFIX + z[1]);
        }

        static {
            int i;
            int i2;
            String[] strArr = new String[5];
            char[] toCharArray = "[9D,D\f\t".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 127;
                        break;
                    case ay.f /*1*/:
                        i2 = 125;
                        break;
                    case ay.n /*2*/:
                        i2 = 45;
                        break;
                    case ay.p /*3*/:
                        i2 = 75;
                        break;
                    default:
                        i2 = 33;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "[6H2f\u001a\u0013H9@\u000b\u0012_".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 127;
                        break;
                    case ay.f /*1*/:
                        i2 = 125;
                        break;
                    case ay.n /*2*/:
                        i2 = 45;
                        break;
                    case ay.p /*3*/:
                        i2 = 75;
                        break;
                    default:
                        i2 = 33;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "[5L8I2\u001cN".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 127;
                        break;
                    case ay.f /*1*/:
                        i2 = 125;
                        break;
                    case ay.n /*2*/:
                        i2 = 45;
                        break;
                    case ay.p /*3*/:
                        i2 = 75;
                        break;
                    default:
                        i2 = 33;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "2\u0018^8@\u0018\u0018i\"F\u001a\u000eYel;H".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 127;
                        break;
                    case ay.f /*1*/:
                        i2 = 125;
                        break;
                    case ay.n /*2*/:
                        i2 = 45;
                        break;
                    case ay.p /*3*/:
                        i2 = 75;
                        break;
                    default:
                        i2 = 33;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "29\u0018".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 127;
                        break;
                    case ay.f /*1*/:
                        i2 = 125;
                        break;
                    case ay.n /*2*/:
                        i2 = 45;
                        break;
                    case ay.p /*3*/:
                        i2 = 75;
                        break;
                    default:
                        i2 = 33;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[4] = new String(cArr).intern();
            z = strArr;
            PREFIX = MD5.class.getName();
        }
    }

    private MD5() {
    }
}
