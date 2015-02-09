package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.RC4Engine;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.whispersystems.libaxolotl.ay;

public final class ARC4 {

    public class Base extends BaseStreamCipher {
        public Base() {
            super(new RC4Engine(), 0);
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "\u001eI\t".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 76;
                        break;
                    case ay.f /*1*/:
                        i2 = 10;
                        break;
                    case ay.n /*2*/:
                        i2 = 61;
                        break;
                    case ay.p /*3*/:
                        i2 = 47;
                        break;
                    default:
                        i2 = 84;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGen() {
            super(z, 128, new CipherKeyGenerator());
        }
    }

    public class Mappings extends AlgorithmProvider {
        private static final String PREFIX;
        private static final String[] z;

        public void configure(ConfigurableProvider configurableProvider) {
            int i = AES.a;
            configurableProvider.addAlgorithm(z[3], PREFIX + z[4]);
            configurableProvider.addAlgorithm(z[5], z[6]);
            configurableProvider.addAlgorithm(z[7], z[9]);
            configurableProvider.addAlgorithm(z[1], PREFIX + z[0]);
            configurableProvider.addAlgorithm(z[2], z[8]);
            if (BaseKeyGenerator.a) {
                AES.a = i + 1;
            }
        }

        static {
            int i;
            int i2;
            String[] strArr = new String[10];
            char[] toCharArray = "01y\u0004\fq\u0014".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 20;
                        break;
                    case ay.f /*1*/:
                        i2 = 122;
                        break;
                    case ay.n /*2*/:
                        i2 = 28;
                        break;
                    case ay.p /*3*/:
                        i2 = 125;
                        break;
                    default:
                        i2 = 75;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "_\u001fe:.z\u001fn\u001c?{\b2<\u0019WN".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 20;
                        break;
                    case ay.f /*1*/:
                        i2 = 122;
                        break;
                    case ay.n /*2*/:
                        i2 = 28;
                        break;
                    case ay.p /*3*/:
                        i2 = 125;
                        break;
                    default:
                        i2 = 75;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "U\u0016{S\nx\u0013}\u000ee_\u001fe:.z\u001fn\u001c?{\b2/\b ".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 20;
                        break;
                    case ay.f /*1*/:
                        i2 = 122;
                        break;
                    case ay.n /*2*/:
                        i2 = 28;
                        break;
                    case ay.p /*3*/:
                        i2 = 125;
                        break;
                    default:
                        i2 = 75;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "W\u0013l\u0015.fT]/\b ".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 20;
                        break;
                    case ay.f /*1*/:
                        i2 = 122;
                        break;
                    case ay.n /*2*/:
                        i2 = 28;
                        break;
                    case ay.p /*3*/:
                        i2 = 125;
                        break;
                    default:
                        i2 = 75;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "08}\u000e.".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 20;
                        break;
                    case ay.f /*1*/:
                        i2 = 122;
                        break;
                    case ay.n /*2*/:
                        i2 = 28;
                        break;
                    case ay.p /*3*/:
                        i2 = 125;
                        break;
                    default:
                        i2 = 75;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[4] = new String(cArr).intern();
            toCharArray = "U\u0016{S\nx\u0013}\u000eeW\u0013l\u0015.fT]/\bR5I/".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 20;
                        break;
                    case ay.f /*1*/:
                        i2 = 122;
                        break;
                    case ay.n /*2*/:
                        i2 = 28;
                        break;
                    case ay.p /*3*/:
                        i2 = 125;
                        break;
                    default:
                        i2 = 75;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[5] = new String(cArr).intern();
            toCharArray = "U(_I".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 20;
                        break;
                    case ay.f /*1*/:
                        i2 = 122;
                        break;
                    case ay.n /*2*/:
                        i2 = 28;
                        break;
                    case ay.p /*3*/:
                        i2 = 125;
                        break;
                    default:
                        i2 = 75;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[6] = new String(cArr).intern();
            toCharArray = "U\u0016{S\nx\u0013}\u000eeW\u0013l\u0015.fTN>\u007f".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 20;
                        break;
                    case ay.f /*1*/:
                        i2 = 122;
                        break;
                    case ay.n /*2*/:
                        i2 = 28;
                        break;
                    case ay.p /*3*/:
                        i2 = 125;
                        break;
                    default:
                        i2 = 75;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[7] = new String(cArr).intern();
            toCharArray = "U(_I".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 20;
                        break;
                    case ay.f /*1*/:
                        i2 = 122;
                        break;
                    case ay.n /*2*/:
                        i2 = 28;
                        break;
                    case ay.p /*3*/:
                        i2 = 125;
                        break;
                    default:
                        i2 = 75;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[8] = new String(cArr).intern();
            toCharArray = "U(_I".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 20;
                        break;
                    case ay.f /*1*/:
                        i2 = 122;
                        break;
                    case ay.n /*2*/:
                        i2 = 28;
                        break;
                    case ay.p /*3*/:
                        i2 = 125;
                        break;
                    default:
                        i2 = 75;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[9] = new String(cArr).intern();
            z = strArr;
            PREFIX = ARC4.class.getName();
        }
    }

    private ARC4() {
    }
}
