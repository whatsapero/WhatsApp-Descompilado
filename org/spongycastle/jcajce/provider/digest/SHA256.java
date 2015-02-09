package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class SHA256 {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Object clone() {
            org.spongycastle.jcajce.provider.digest.SHA256.Digest digest = (org.spongycastle.jcajce.provider.digest.SHA256.Digest) super.clone();
            digest.digest = new SHA256Digest((SHA256Digest) this.digest);
            return digest;
        }

        public Digest() {
            super(new SHA256Digest());
        }
    }

    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA256Digest()));
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "k]\r\r\u001bkQ~{~".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 35;
                        break;
                    case ay.f /*1*/:
                        i2 = 16;
                        break;
                    case ay.n /*2*/:
                        i2 = 76;
                        break;
                    case ay.p /*3*/:
                        i2 = 78;
                        break;
                    default:
                        i2 = 72;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGenerator() {
            super(z, 256, new CipherKeyGenerator());
        }
    }

    public class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX;
        private static final String[] z;

        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(z[4], PREFIX + z[0]);
            configurableProvider.addAlgorithm(z[5], z[6]);
            addHMACAlgorithm(configurableProvider, z[2], PREFIX + z[1], PREFIX + z[3]);
        }

        static {
            int i;
            int i2;
            String[] strArr = new String[7];
            char[] toCharArray = "\u0002AjvpUq".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 38;
                        break;
                    case ay.f /*1*/:
                        i2 = 5;
                        break;
                    case ay.n /*2*/:
                        i2 = 3;
                        break;
                    case ay.p /*3*/:
                        i2 = 17;
                        break;
                    default:
                        i2 = 21;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "\u0002Mbb}kd`".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 38;
                        break;
                    case ay.f /*1*/:
                        i2 = 5;
                        break;
                    case ay.n /*2*/:
                        i2 = 3;
                        break;
                    case ay.p /*3*/:
                        i2 = 17;
                        break;
                    default:
                        i2 = 21;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "uMB# \u0010".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 38;
                        break;
                    case ay.f /*1*/:
                        i2 = 5;
                        break;
                    case ay.n /*2*/:
                        i2 = 3;
                        break;
                    case ay.p /*3*/:
                        i2 = 17;
                        break;
                    default:
                        i2 = 21;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "\u0002NfhRCkfctRjq".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 38;
                        break;
                    case ay.f /*1*/:
                        i2 = 5;
                        break;
                    case ay.n /*2*/:
                        i2 = 3;
                        break;
                    case ay.p /*3*/:
                        i2 = 17;
                        break;
                    default:
                        i2 = 21;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "k`pbtA`GxrCvw?FnD.# \u0010".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 38;
                        break;
                    case ay.f /*1*/:
                        i2 = 5;
                        break;
                    case ay.n /*2*/:
                        i2 = 3;
                        break;
                    case ay.p /*3*/:
                        i2 = 17;
                        break;
                    default:
                        i2 = 21;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[4] = new String(cArr).intern();
            toCharArray = "gid?TJlbb;k`pbtA`GxrCvw?FnD1$#".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 38;
                        break;
                    case ay.f /*1*/:
                        i2 = 5;
                        break;
                    case ay.n /*2*/:
                        i2 = 3;
                        break;
                    case ay.p /*3*/:
                        i2 = 17;
                        break;
                    default:
                        i2 = 21;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[5] = new String(cArr).intern();
            toCharArray = "uMB<'\u00133".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 38;
                        break;
                    case ay.f /*1*/:
                        i2 = 5;
                        break;
                    case ay.n /*2*/:
                        i2 = 3;
                        break;
                    case ay.p /*3*/:
                        i2 = 17;
                        break;
                    default:
                        i2 = 21;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[6] = new String(cArr).intern();
            z = strArr;
            PREFIX = SHA256.class.getName();
        }
    }

    private SHA256() {
    }
}
