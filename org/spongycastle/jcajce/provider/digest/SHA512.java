package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.digests.SHA512tDigest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.digest.SHA512.DigestT;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class SHA512 {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Object clone() {
            org.spongycastle.jcajce.provider.digest.SHA512.Digest digest = (org.spongycastle.jcajce.provider.digest.SHA512.Digest) super.clone();
            digest.digest = new SHA512Digest((SHA512Digest) this.digest);
            return digest;
        }

        public Digest() {
            super(new SHA512Digest());
        }
    }

    public class DigestT extends BCMessageDigest implements Cloneable {
        public Object clone() {
            org.spongycastle.jcajce.provider.digest.SHA512.DigestT digestT = (org.spongycastle.jcajce.provider.digest.SHA512.DigestT) super.clone();
            digestT.digest = new SHA512tDigest((SHA512tDigest) this.digest);
            return digestT;
        }

        public DigestT(int i) {
            super(new SHA512tDigest(i));
        }
    }

    public class DigestT224 extends DigestT {
        public DigestT224() {
            super(224);
        }
    }

    public class DigestT256 extends DigestT {
        public DigestT256() {
            super(256);
        }
    }

    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA512Digest()));
        }
    }

    public class HashMacT224 extends BaseMac {
        public HashMacT224() {
            super(new HMac(new SHA512tDigest(224)));
        }
    }

    public class HashMacT256 extends BaseMac {
        public HashMacT256() {
            super(new HMac(new SHA512tDigest(256)));
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "lpt\",l|\u0000PM".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 36;
                        break;
                    case ay.f /*1*/:
                        i2 = 61;
                        break;
                    case ay.n /*2*/:
                        i2 = 53;
                        break;
                    case ay.p /*3*/:
                        i2 = 97;
                        break;
                    default:
                        i2 = 127;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGenerator() {
            super(z, 512, new CipherKeyGenerator());
        }
    }

    public class KeyGeneratorT224 extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "\u0003p\u001b7&\u0003|oEGd\u000fh@".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 75;
                        break;
                    case ay.f /*1*/:
                        i2 = 61;
                        break;
                    case ay.n /*2*/:
                        i2 = 90;
                        break;
                    case ay.p /*3*/:
                        i2 = 116;
                        break;
                    default:
                        i2 = 117;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGeneratorT224() {
            super(z, 224, new CipherKeyGenerator());
        }
    }

    public class KeyGeneratorT256 extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "\u0012X\u000f,R\u0012T{^3u'{Y".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 21;
                        break;
                    case ay.n /*2*/:
                        i2 = 78;
                        break;
                    case ay.p /*3*/:
                        i2 = 111;
                        break;
                    default:
                        i2 = 1;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGeneratorT256() {
            super(z, 256, new CipherKeyGenerator());
        }
    }

    public class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX;
        private static final String[] z;

        public void configure(ConfigurableProvider configurableProvider) {
            boolean z = false;
            int i = BCMessageDigest.a;
            configurableProvider.addAlgorithm(z[16], PREFIX + z[14]);
            configurableProvider.addAlgorithm(z[6], z[17]);
            configurableProvider.addAlgorithm(z[8], PREFIX + z[9]);
            configurableProvider.addAlgorithm(z[7], z[13]);
            configurableProvider.addAlgorithm(z[18], PREFIX + z[10]);
            configurableProvider.addAlgorithm(z[2], z[11]);
            addHMACAlgorithm(configurableProvider, z[3], PREFIX + z[0], PREFIX + z[15]);
            addHMACAlgorithm(configurableProvider, z[4], PREFIX + z[5], PREFIX + z[12]);
            addHMACAlgorithm(configurableProvider, z[20], PREFIX + z[19], PREFIX + z[1]);
            if (i != 0) {
                if (!BaseKeyGenerator.a) {
                    z = true;
                }
                BaseKeyGenerator.a = z;
            }
        }

        static {
            int i;
            int i2;
            String[] strArr = new String[21];
            char[] toCharArray = "yC\n\n\u001f\u0010j\b".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "y@\u000e\u000008e\u000e\u000b\u0016)d\u0019-Eh=".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "\u001cg\fW61b\n\nY\u0010n\u0018\n\u0016:n/\u0010\u00108x\u001fW$\u0015J^HEo>]".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "\u000eC*LFo".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "\u000eC*LFo$YKC".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[4] = new String(cArr).intern();
            toCharArray = "yC\n\n\u001f\u0010j\b-Eo?".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[5] = new String(cArr).intern();
            toCharArray = "\u001cg\fW61b\n\nY\u0010n\u0018\n\u0016:n/\u0010\u00108x\u001fW$\u0015J^HE".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[6] = new String(cArr).intern();
            toCharArray = "\u001cg\fW61b\n\nY\u0010n\u0018\n\u0016:n/\u0010\u00108x\u001fW$\u0015J^HEr9YM".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[7] = new String(cArr).intern();
            toCharArray = "\u0010n\u0018\n\u0016:n/\u0010\u00108x\u001fW$\u0015JFLFo$YKC".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[8] = new String(cArr).intern();
            toCharArray = "yO\u0002\u001e\u0012.\u007f?KEi".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[9] = new String(cArr).intern();
            toCharArray = "yO\u0002\u001e\u0012.\u007f?KBk".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[10] = new String(cArr).intern();
            toCharArray = "\u000eC*TBl9DKBk".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[11] = new String(cArr).intern();
            toCharArray = "y@\u000e\u000008e\u000e\u000b\u0016)d\u0019-Eo?".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[12] = new String(cArr).intern();
            toCharArray = "\u000eC*TBl9DKEi".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[13] = new String(cArr).intern();
            toCharArray = "yO\u0002\u001e\u0012.\u007f".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[14] = new String(cArr).intern();
            toCharArray = "y@\u000e\u000008e\u000e\u000b\u0016)d\u0019".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[15] = new String(cArr).intern();
            toCharArray = "\u0010n\u0018\n\u0016:n/\u0010\u00108x\u001fW$\u0015JFLFo".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[16] = new String(cArr).intern();
            toCharArray = "\u000eC*TBl9".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[17] = new String(cArr).intern();
            toCharArray = "\u0010n\u0018\n\u0016:n/\u0010\u00108x\u001fW$\u0015JFLFo$YLA".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[18] = new String(cArr).intern();
            toCharArray = "yC\n\n\u001f\u0010j\b-Eh=".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[19] = new String(cArr).intern();
            toCharArray = "\u000eC*LFo$YLA".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 93;
                        break;
                    case ay.f /*1*/:
                        i2 = 11;
                        break;
                    case ay.n /*2*/:
                        i2 = 107;
                        break;
                    case ay.p /*3*/:
                        i2 = 121;
                        break;
                    default:
                        i2 = 119;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[20] = new String(cArr).intern();
            z = strArr;
            PREFIX = SHA512.class.getName();
        }
    }

    private SHA512() {
    }
}
