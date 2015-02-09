package org.spongycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.AESFastEngine;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.whispersystems.libaxolotl.ay;

public final class AES {
    public static int a;

    public class AlgParamGen extends BaseAlgorithmParameterGenerator {
        private static final String[] z;

        static {
            int i;
            String[] strArr = new String[3];
            char[] toCharArray = "\u00038\u001d\u001b-='R\u001a,(3\u001d)4*8O\u0001,%:m\t*,:X\u001c=?\u0004M\r;m1R\u001ax\f\u0012nH(,%\\\u0005=92OH?(9X\u001a99>R\u0006v".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 77;
                        break;
                    case ay.f /*1*/:
                        i2 = 87;
                        break;
                    case ay.n /*2*/:
                        i2 = 61;
                        break;
                    case ay.p /*3*/:
                        i2 = 104;
                        break;
                    default:
                        i2 = 88;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "\u001e\u0014".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 77;
                        break;
                    case ay.f /*1*/:
                        i2 = 87;
                        break;
                    case ay.n /*2*/:
                        i2 = 61;
                        break;
                    case ay.p /*3*/:
                        i2 = 104;
                        break;
                    default:
                        i2 = 88;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "\f\u0012n".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 77;
                        break;
                    case ay.f /*1*/:
                        i2 = 87;
                        break;
                    case ay.n /*2*/:
                        i2 = 61;
                        break;
                    case ay.p /*3*/:
                        i2 = 104;
                        break;
                    default:
                        i2 = 88;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[2] = new String(cArr).intern();
            z = strArr;
        }

        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            try {
                if (this.random == null) {
                    this.random = new SecureRandom();
                }
                this.random.nextBytes(bArr);
                try {
                    AlgorithmParameters instance = AlgorithmParameters.getInstance(z[2], z[1]);
                    instance.init(new IvParameterSpec(bArr));
                    return instance;
                } catch (Exception e) {
                    throw new RuntimeException(e.getMessage());
                }
            } catch (Exception e2) {
                throw e2;
            }
        }

        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException(z[0]);
        }
    }

    public class AlgParams extends IvAlgorithmParameters {
        private static final String z;

        static {
            char[] toCharArray = "uWH\u0010Gb".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 52;
                        break;
                    case ay.f /*1*/:
                        i2 = 18;
                        break;
                    case ay.n /*2*/:
                        i2 = 27;
                        break;
                    case ay.p /*3*/:
                        i2 = 48;
                        break;
                    default:
                        i2 = 14;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        protected String engineToString() {
            return z;
        }
    }

    public class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() {
                public BlockCipher get() {
                    return new AESFastEngine();
                }
            });
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        private static final String z;

        static {
            char[] toCharArray = "73|".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 118;
                        break;
                    case ay.f /*1*/:
                        i2 = 118;
                        break;
                    case ay.n /*2*/:
                        i2 = 47;
                        break;
                    case ay.p /*3*/:
                        i2 = 83;
                        break;
                    default:
                        i2 = 49;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public KeyGen() {
            this(192);
        }

        public KeyGen(int i) {
            super(z, i, new CipherKeyGenerator());
        }
    }

    public class Mappings extends AlgorithmProvider {
        private static final String PREFIX;
        private static final String[] z;

        static {
            int i;
            int i2;
            String[] strArr = new String[8];
            char[] toCharArray = "`VNC#HNAA\u0001@HHA4U_[_\u007f`\u007fz".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 33;
                        break;
                    case ay.f /*1*/:
                        i2 = 58;
                        break;
                    case ay.n /*2*/:
                        i2 = 41;
                        break;
                    case ay.p /*3*/:
                        i2 = 44;
                        break;
                    default:
                        i2 = 81;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            strArr[0] = new String(cArr).intern();
            toCharArray = "bSYD4S\u0014hi\u0002".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                char c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 33;
                        break;
                    case ay.f /*1*/:
                        i2 = 58;
                        break;
                    case ay.n /*2*/:
                        i2 = 41;
                        break;
                    case ay.p /*3*/:
                        i2 = 44;
                        break;
                    default:
                        i2 = 81;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[1] = new String(cArr).intern();
            toCharArray = "\u0005{EK\u0001@HHA\u0016DT".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 33;
                        break;
                    case ay.f /*1*/:
                        i2 = 58;
                        break;
                    case ay.n /*2*/:
                        i2 = 41;
                        break;
                    case ay.p /*3*/:
                        i2 = 44;
                        break;
                    default:
                        i2 = 81;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[2] = new String(cArr).intern();
            toCharArray = "j_Pk4O_[M%NH\u0007m\u0014r".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 33;
                        break;
                    case ay.f /*1*/:
                        i2 = 58;
                        break;
                    case ay.n /*2*/:
                        i2 = 41;
                        break;
                    case ay.p /*3*/:
                        i2 = 44;
                        break;
                    default:
                        i2 = 81;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[3] = new String(cArr).intern();
            toCharArray = "`VNC#HNAA\u0001@HHA4U_[k4O_[M%NH\u0007m\u0014r".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 33;
                        break;
                    case ay.f /*1*/:
                        i2 = 58;
                        break;
                    case ay.n /*2*/:
                        i2 = 41;
                        break;
                    case ay.p /*3*/:
                        i2 = 44;
                        break;
                    default:
                        i2 = 81;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[4] = new String(cArr).intern();
            toCharArray = "\u0005\u007fjn".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 33;
                        break;
                    case ay.f /*1*/:
                        i2 = 58;
                        break;
                    case ay.n /*2*/:
                        i2 = 41;
                        break;
                    case ay.p /*3*/:
                        i2 = 44;
                        break;
                    default:
                        i2 = 81;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[5] = new String(cArr).intern();
            toCharArray = "\u0005qLU\u0016DT".toCharArray();
            length = toCharArray.length;
            cArr = toCharArray;
            for (i = 0; length > i; i++) {
                c2 = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 33;
                        break;
                    case ay.f /*1*/:
                        i2 = 58;
                        break;
                    case ay.n /*2*/:
                        i2 = 41;
                        break;
                    case ay.p /*3*/:
                        i2 = 44;
                        break;
                    default:
                        i2 = 81;
                        break;
                }
                cArr[i] = (char) (i2 ^ c2);
            }
            strArr[6] = new String(cArr).intern();
            toCharArray = "\u0005{EK\u0001@HHA\"".toCharArray();
            int length2 = toCharArray.length;
            cArr = toCharArray;
            for (length = 0; length2 > length; length++) {
                c = cArr[length];
                switch (length % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 33;
                        break;
                    case ay.f /*1*/:
                        i2 = 58;
                        break;
                    case ay.n /*2*/:
                        i2 = 41;
                        break;
                    case ay.p /*3*/:
                        i2 = 44;
                        break;
                    default:
                        i2 = 81;
                        break;
                }
                cArr[length] = (char) (i2 ^ c);
            }
            strArr[7] = new String(cArr).intern();
            z = strArr;
            PREFIX = AES.class.getName();
        }

        public void configure(ConfigurableProvider configurableProvider) {
            boolean z = false;
            int i = a;
            configurableProvider.addAlgorithm(z[0], PREFIX + z[7]);
            configurableProvider.addAlgorithm(z[4], PREFIX + z[2]);
            configurableProvider.addAlgorithm(z[1], PREFIX + z[5]);
            configurableProvider.addAlgorithm(z[3], PREFIX + z[6]);
            if (i != 0) {
                if (!BaseKeyGenerator.a) {
                    z = true;
                }
                BaseKeyGenerator.a = z;
            }
        }
    }

    private AES() {
    }
}
