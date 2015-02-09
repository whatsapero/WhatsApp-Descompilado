package org.spongycastle.jcajce.provider.symmetric.util;

import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.modes.AEADBlockCipher;
import org.spongycastle.crypto.paddings.BlockCipherPadding;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.whispersystems.libaxolotl.ay;

public class BaseBlockCipher extends BaseWrapCipher implements PBE {
    private static final String[] z;
    private Class[] availableSpecs;
    private BlockCipher baseEngine;
    private GenericBlockCipher cipher;
    private BlockCipherProvider engineProvider;
    private int ivLength;
    private ParametersWithIV ivParam;
    private String modeName;
    private boolean padded;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;

    interface GenericBlockCipher {
        int doFinal(byte[] bArr, int i);

        String getAlgorithmName();

        int getOutputSize(int i);

        BlockCipher getUnderlyingCipher();

        int getUpdateOutputSize(int i);

        void init(boolean z, CipherParameters cipherParameters);

        int processByte(byte b, byte[] bArr, int i);

        int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

        void updateAAD(byte[] bArr, int i, int i2);

        boolean wrapOnNoPadding();
    }

    class AEADGenericBlockCipher implements GenericBlockCipher {
        private static final Constructor aeadBadTagConstructor;
        private AEADBlockCipher cipher;

        public String getAlgorithmName() {
            return this.cipher.getUnderlyingCipher().getAlgorithmName();
        }

        public int processByte(byte b, byte[] bArr, int i) {
            return this.cipher.processByte(b, bArr, i);
        }

        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        }

        public int getUpdateOutputSize(int i) {
            return this.cipher.getUpdateOutputSize(i);
        }

        static {
            char[] toCharArray = "bDJ%*&FN=\"|J\u0012\u0005\u0017Ia~%6\\D[\u0001*k@L0;gK".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 8;
                        break;
                    case ay.f /*1*/:
                        i2 = 37;
                        break;
                    case ay.n /*2*/:
                        i2 = 60;
                        break;
                    case ay.p /*3*/:
                        i2 = 68;
                        break;
                    default:
                        i2 = 82;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            Class access$000 = BaseBlockCipher.access$000(new String(cArr).intern());
            if (access$000 != null) {
                aeadBadTagConstructor = findExceptionConstructor(access$000);
            } else {
                aeadBadTagConstructor = null;
            }
        }

        private static Constructor findExceptionConstructor(Class cls) {
            try {
                return cls.getConstructor(new Class[]{String.class});
            } catch (Exception e) {
                return null;
            }
        }

        public void updateAAD(byte[] bArr, int i, int i2) {
            this.cipher.processAADBytes(bArr, i, i2);
        }

        public int doFinal(byte[] bArr, int i) {
            try {
                return this.cipher.doFinal(bArr, i);
            } catch (InvalidCipherTextException e) {
                InvalidCipherTextException invalidCipherTextException = e;
                if (aeadBadTagConstructor != null) {
                    BadPaddingException badPaddingException;
                    try {
                        badPaddingException = (BadPaddingException) aeadBadTagConstructor.newInstance(new Object[]{invalidCipherTextException.getMessage()});
                    } catch (Exception e2) {
                        badPaddingException = null;
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new BadPaddingException(invalidCipherTextException.getMessage());
            } catch (InvalidCipherTextException e3) {
                throw e3;
            }
        }

        public BlockCipher getUnderlyingCipher() {
            return this.cipher.getUnderlyingCipher();
        }

        public boolean wrapOnNoPadding() {
            return false;
        }

        AEADGenericBlockCipher(AEADBlockCipher aEADBlockCipher) {
            this.cipher = aEADBlockCipher;
        }

        public int getOutputSize(int i) {
            return this.cipher.getOutputSize(i);
        }

        public void init(boolean z, CipherParameters cipherParameters) {
            this.cipher.init(z, cipherParameters);
        }
    }

    class BufferedGenericBlockCipher implements GenericBlockCipher {
        private static final String z;
        private BufferedBlockCipher cipher;

        static {
            char[] toCharArray = "'`3_\u001f\u0015\u0001\u0019\u0010\u0002FR\u0002\u000f\u0006\tS\u0003\u001a\u0012FH\u0019_\u0002\u000eDW\u001c\u0003\u0014S\u0012\u0011\u0002FL\u0018\u001b\u0013H".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 102;
                        break;
                    case ay.f /*1*/:
                        i2 = 33;
                        break;
                    case ay.n /*2*/:
                        i2 = 119;
                        break;
                    case ay.p /*3*/:
                        i2 = 127;
                        break;
                    default:
                        i2 = 118;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public int processByte(byte b, byte[] bArr, int i) {
            return this.cipher.processByte(b, bArr, i);
        }

        public void updateAAD(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException(z);
        }

        public boolean wrapOnNoPadding() {
            return true;
        }

        BufferedGenericBlockCipher(BlockCipher blockCipher) {
            this.cipher = new PaddedBufferedBlockCipher(blockCipher);
        }

        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        }

        public void init(boolean z, CipherParameters cipherParameters) {
            this.cipher.init(z, cipherParameters);
        }

        public String getAlgorithmName() {
            return this.cipher.getUnderlyingCipher().getAlgorithmName();
        }

        BufferedGenericBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
            this.cipher = new PaddedBufferedBlockCipher(blockCipher, blockCipherPadding);
        }

        public BlockCipher getUnderlyingCipher() {
            return this.cipher.getUnderlyingCipher();
        }

        public int doFinal(byte[] bArr, int i) {
            try {
                return this.cipher.doFinal(bArr, i);
            } catch (InvalidCipherTextException e) {
                throw new BadPaddingException(e.getMessage());
            }
        }

        public int getOutputSize(int i) {
            return this.cipher.getOutputSize(i);
        }

        BufferedGenericBlockCipher(BufferedBlockCipher bufferedBlockCipher) {
            this.cipher = bufferedBlockCipher;
        }

        public int getUpdateOutputSize(int i) {
            return this.cipher.getUpdateOutputSize(i);
        }
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[34];
        char[] toCharArray = "[\u0001}#3\u0018\brj#T\u00053t&J\u0001~a3]\u00123".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "k#".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "k#".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "}!K".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "{#^".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "\u007f#^".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "w#Q".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "v/CE\u0003|)]C".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "w\u000e\u007f}gv\u000fCe#\\\t}cg[\u0001}$%]@fw\"\\@dm3P@RA\u0006|@~k#]\u0013=".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "h\u0001w`.V\u00073".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "h+PWph!W@\u000ev'".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "\u0018\u0015}o)W\u0017}*".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "h+PWrh!W@\u000ev'".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "w&Q".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[13] = new String(cArr).intern();
        toCharArray = "\u007f#^".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[14] = new String(cArr).intern();
        toCharArray = "{&Q".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[15] = new String(cArr).intern();
        toCharArray = "{\"P".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[16] = new String(cArr).intern();
        toCharArray = "{4A".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[17] = new String(cArr).intern();
        toCharArray = "[\u0001}#3\u0018\u0013ft7W\u0012g$*W\u0004v$".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[18] = new String(cArr).intern();
        toCharArray = "}#Q".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[19] = new String(cArr).intern();
        toCharArray = "h'CG\u0001z".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[20] = new String(cArr).intern();
        toCharArray = "j#&$5]\u0011fm5]\u00133e)\u00182P1\u0017Y\u0012ri\"L\u0005aw\u0014H\u0005p$3W@qagH\u0001`w\"\\@zji".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[21] = new String(cArr).intern();
        toCharArray = "s\u0005j$!W\u00123e+_\u000fam3P\r3".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[22] = new String(cArr).intern();
        toCharArray = "\u0018\u0010rw4]\u0004".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[23] = new String(cArr).intern();
        toCharArray = "V\u000f3M\u0011\u0018\u0013vpgO\bvjgW\u000ev$\"@\u0010vg3]\u0004".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[24] = new String(cArr).intern();
        toCharArray = "q63i2K\u00143f\"\u0018".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[25] = new String(cArr).intern();
        toCharArray = "j#&)q\f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[26] = new String(cArr).intern();
        toCharArray = "\u0018\u000e|pgK\u0015zp&Z\fv$!W\u00123w>U\rvp5Q\u00033a)J\u0019cp.W\u000e=".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[27] = new String(cArr).intern();
        toCharArray = "h\"V$5]\u0011fm5]\u00133T\u0005}@ce5Y\rvp\"J\u00133p(\u0018\u0002v$4]\u0014=".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[28] = new String(cArr).intern();
        toCharArray = "}#Q".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[29] = new String(cArr).intern();
        toCharArray = "M\u000exj(O\u000e3k7U\u000fwag".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[30] = new String(cArr).intern();
        toCharArray = "\u0018\u0002jp\"K@\u007fk)_N".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[31] = new String(cArr).intern();
        toCharArray = "M\u000exj(O\u000e3t&J\u0001~a3]\u00123p>H\u0005=".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[32] = new String(cArr).intern();
        toCharArray = "}#Q$*W\u0004v$#W\u0005`$)W\u00143q4]@rjgq6".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[33] = new String(cArr).intern();
        z = strArr;
    }

    protected byte[] engineGetIV() {
        try {
            return this.ivParam != null ? this.ivParam.getIV() : null;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void engineInit(int r9, java.security.Key r10, java.security.spec.AlgorithmParameterSpec r11, java.security.SecureRandom r12) {
        /*
        r8_this = this;
        r3 = 0;
        r4 = 1;
        r7 = org.spongycastle.jcajce.provider.symmetric.util.BaseMac.a;
        r1 = 0;
        r8.pbeSpec = r1;	 Catch:{ Exception -> 0x003c }
        r1 = 0;
        r8.pbeAlgorithm = r1;	 Catch:{ Exception -> 0x003c }
        r1 = 0;
        r8.engineParams = r1;	 Catch:{ Exception -> 0x003c }
        r1 = r10 instanceof javax.crypto.SecretKey;	 Catch:{ Exception -> 0x003c }
        if (r1 != 0) goto L_0x003e;
    L_0x0011:
        r1 = new java.security.InvalidKeyException;	 Catch:{ Exception -> 0x003c }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x003c }
        r2.<init>();	 Catch:{ Exception -> 0x003c }
        r3 = z;	 Catch:{ Exception -> 0x003c }
        r4 = 22;
        r3 = r3[r4];	 Catch:{ Exception -> 0x003c }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x003c }
        r3 = r10.getAlgorithm();	 Catch:{ Exception -> 0x003c }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x003c }
        r3 = z;	 Catch:{ Exception -> 0x003c }
        r4 = 27;
        r3 = r3[r4];	 Catch:{ Exception -> 0x003c }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x003c }
        r2 = r2.toString();	 Catch:{ Exception -> 0x003c }
        r1.<init>(r2);	 Catch:{ Exception -> 0x003c }
        throw r1;	 Catch:{ Exception -> 0x003c }
    L_0x003c:
        r1 = move-exception;
        throw r1;
    L_0x003e:
        if (r11 != 0) goto L_0x0062;
    L_0x0040:
        r1 = r8.baseEngine;	 Catch:{ Exception -> 0x0060 }
        r1 = r1.getAlgorithmName();	 Catch:{ Exception -> 0x0060 }
        r2 = z;	 Catch:{ Exception -> 0x0060 }
        r5 = 26;
        r2 = r2[r5];	 Catch:{ Exception -> 0x0060 }
        r1 = r1.startsWith(r2);	 Catch:{ Exception -> 0x0060 }
        if (r1 == 0) goto L_0x0062;
    L_0x0052:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x005e }
        r2 = z;	 Catch:{ Exception -> 0x005e }
        r3 = 21;
        r2 = r2[r3];	 Catch:{ Exception -> 0x005e }
        r1.<init>(r2);	 Catch:{ Exception -> 0x005e }
        throw r1;	 Catch:{ Exception -> 0x005e }
    L_0x005e:
        r1 = move-exception;
        throw r1;
    L_0x0060:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x005e }
    L_0x0062:
        r1 = r10 instanceof org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
        if (r1 == 0) goto L_0x00c1;
    L_0x0066:
        r1 = r10;
        r1 = (org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey) r1;
        r2 = r1.getAlgorithm();
        r8.pbeAlgorithm = r2;
        r2 = r1.getParam();
        if (r2 == 0) goto L_0x008b;
    L_0x0075:
        r6 = r1.getParam();
        r2 = r11 instanceof javax.crypto.spec.IvParameterSpec;
        if (r2 == 0) goto L_0x0244;
    L_0x007d:
        r2 = r11;
        r2 = (javax.crypto.spec.IvParameterSpec) r2;
        r5 = new org.spongycastle.crypto.params.ParametersWithIV;
        r2 = r2.getIV();
        r5.<init>(r6, r2);
        if (r7 == 0) goto L_0x00b4;
    L_0x008b:
        r2 = r11 instanceof javax.crypto.spec.PBEParameterSpec;	 Catch:{ Exception -> 0x00b2 }
        if (r2 == 0) goto L_0x00a4;
    L_0x008f:
        r2 = r11;
        r2 = (javax.crypto.spec.PBEParameterSpec) r2;
        r8.pbeSpec = r2;
        r2 = r8.cipher;
        r2 = r2.getUnderlyingCipher();
        r2 = r2.getAlgorithmName();
        r2 = org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r1, r11, r2);
        if (r7 == 0) goto L_0x00b5;
    L_0x00a4:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x00b0 }
        r2 = z;	 Catch:{ Exception -> 0x00b0 }
        r3 = 28;
        r2 = r2[r3];	 Catch:{ Exception -> 0x00b0 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x00b0 }
        throw r1;	 Catch:{ Exception -> 0x00b0 }
    L_0x00b0:
        r1 = move-exception;
        throw r1;
    L_0x00b2:
        r1 = move-exception;
        throw r1;
    L_0x00b4:
        r2 = r5;
    L_0x00b5:
        r1 = r2 instanceof org.spongycastle.crypto.params.ParametersWithIV;	 Catch:{ Exception -> 0x0114 }
        if (r1 == 0) goto L_0x00bf;
    L_0x00b9:
        r0 = r2;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;	 Catch:{ Exception -> 0x0114 }
        r1 = r0;
        r8.ivParam = r1;	 Catch:{ Exception -> 0x0114 }
    L_0x00bf:
        if (r7 == 0) goto L_0x0241;
    L_0x00c1:
        if (r11 != 0) goto L_0x00ce;
    L_0x00c3:
        r2 = new org.spongycastle.crypto.params.KeyParameter;
        r1 = r10.getEncoded();
        r2.<init>(r1);
        if (r7 == 0) goto L_0x023e;
    L_0x00ce:
        r1 = r11 instanceof javax.crypto.spec.IvParameterSpec;	 Catch:{ Exception -> 0x0116 }
        if (r1 == 0) goto L_0x0165;
    L_0x00d2:
        r1 = r8.ivLength;	 Catch:{ Exception -> 0x0118 }
        if (r1 == 0) goto L_0x0136;
    L_0x00d6:
        r11 = (javax.crypto.spec.IvParameterSpec) r11;
        r1 = r11.getIV();	 Catch:{ Exception -> 0x011a }
        r1 = r1.length;	 Catch:{ Exception -> 0x011a }
        r2 = r8.ivLength;	 Catch:{ Exception -> 0x011a }
        if (r1 == r2) goto L_0x011c;
    L_0x00e1:
        r1 = r8.modeName;	 Catch:{ Exception -> 0x011a }
        r1 = r8.isAEADModeName(r1);	 Catch:{ Exception -> 0x011a }
        if (r1 != 0) goto L_0x011c;
    L_0x00e9:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x0112 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0112 }
        r2.<init>();	 Catch:{ Exception -> 0x0112 }
        r3 = z;	 Catch:{ Exception -> 0x0112 }
        r4 = 25;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0112 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0112 }
        r3 = r8.ivLength;	 Catch:{ Exception -> 0x0112 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0112 }
        r3 = z;	 Catch:{ Exception -> 0x0112 }
        r4 = 31;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0112 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0112 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0112 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0112 }
        throw r1;	 Catch:{ Exception -> 0x0112 }
    L_0x0112:
        r1 = move-exception;
        throw r1;
    L_0x0114:
        r1 = move-exception;
        throw r1;
    L_0x0116:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0118 }
    L_0x0118:
        r1 = move-exception;
        throw r1;
    L_0x011a:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0112 }
    L_0x011c:
        r2 = new org.spongycastle.crypto.params.ParametersWithIV;
        r1 = new org.spongycastle.crypto.params.KeyParameter;
        r5 = r10.getEncoded();
        r1.<init>(r5);
        r5 = r11.getIV();
        r2.<init>(r1, r5);
        r0 = r2;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;	 Catch:{ Exception -> 0x0156 }
        r1 = r0;
        r8.ivParam = r1;	 Catch:{ Exception -> 0x0156 }
        if (r7 == 0) goto L_0x023b;
    L_0x0136:
        r1 = r8.modeName;	 Catch:{ Exception -> 0x0156 }
        if (r1 == 0) goto L_0x015a;
    L_0x013a:
        r1 = r8.modeName;	 Catch:{ Exception -> 0x0158 }
        r2 = z;	 Catch:{ Exception -> 0x0158 }
        r5 = 29;
        r2 = r2[r5];	 Catch:{ Exception -> 0x0158 }
        r1 = r1.equals(r2);	 Catch:{ Exception -> 0x0158 }
        if (r1 == 0) goto L_0x015a;
    L_0x0148:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x0154 }
        r2 = z;	 Catch:{ Exception -> 0x0154 }
        r3 = 33;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0154 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0154 }
        throw r1;	 Catch:{ Exception -> 0x0154 }
    L_0x0154:
        r1 = move-exception;
        throw r1;
    L_0x0156:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0158 }
    L_0x0158:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0154 }
    L_0x015a:
        r2 = new org.spongycastle.crypto.params.KeyParameter;
        r1 = r10.getEncoded();
        r2.<init>(r1);
        if (r7 == 0) goto L_0x0173;
    L_0x0165:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x0171 }
        r2 = z;	 Catch:{ Exception -> 0x0171 }
        r3 = 32;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0171 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0171 }
        throw r1;	 Catch:{ Exception -> 0x0171 }
    L_0x0171:
        r1 = move-exception;
        throw r1;
    L_0x0173:
        r1 = r2;
    L_0x0174:
        r2 = r8.ivLength;	 Catch:{ Exception -> 0x01c4 }
        if (r2 == 0) goto L_0x01ca;
    L_0x0178:
        r2 = r1 instanceof org.spongycastle.crypto.params.ParametersWithIV;	 Catch:{ Exception -> 0x01c4 }
        if (r2 != 0) goto L_0x01ca;
    L_0x017c:
        r2 = r1 instanceof org.spongycastle.crypto.params.AEADParameters;	 Catch:{ Exception -> 0x01c6 }
        if (r2 != 0) goto L_0x01ca;
    L_0x0180:
        if (r12 != 0) goto L_0x0238;
    L_0x0182:
        r2 = new java.security.SecureRandom;
        r2.<init>();
    L_0x0187:
        if (r9 == r4) goto L_0x018c;
    L_0x0189:
        r5 = 3;
        if (r9 != r5) goto L_0x0235;
    L_0x018c:
        r5 = r8.ivLength;
        r5 = new byte[r5];
        r2.nextBytes(r5);
        r2 = new org.spongycastle.crypto.params.ParametersWithIV;
        r2.<init>(r1, r5);
        r0 = r2;
        r0 = (org.spongycastle.crypto.params.ParametersWithIV) r0;	 Catch:{ Exception -> 0x01c8 }
        r1 = r0;
        r8.ivParam = r1;	 Catch:{ Exception -> 0x01c8 }
        if (r7 == 0) goto L_0x01cb;
    L_0x01a0:
        r1 = r8.cipher;	 Catch:{ Exception -> 0x01c8 }
        r1 = r1.getUnderlyingCipher();	 Catch:{ Exception -> 0x01c8 }
        r1 = r1.getAlgorithmName();	 Catch:{ Exception -> 0x01c8 }
        r5 = z;	 Catch:{ Exception -> 0x01c8 }
        r6 = 20;
        r5 = r5[r6];	 Catch:{ Exception -> 0x01c8 }
        r1 = r1.indexOf(r5);	 Catch:{ Exception -> 0x01c8 }
        if (r1 >= 0) goto L_0x01cb;
    L_0x01b6:
        r1 = new java.security.InvalidAlgorithmParameterException;	 Catch:{ Exception -> 0x01c2 }
        r2 = z;	 Catch:{ Exception -> 0x01c2 }
        r3 = 24;
        r2 = r2[r3];	 Catch:{ Exception -> 0x01c2 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x01c2 }
        throw r1;	 Catch:{ Exception -> 0x01c2 }
    L_0x01c2:
        r1 = move-exception;
        throw r1;
    L_0x01c4:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x01c6 }
    L_0x01c6:
        r1 = move-exception;
        throw r1;
    L_0x01c8:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x01c2 }
    L_0x01ca:
        r2 = r1;
    L_0x01cb:
        if (r12 == 0) goto L_0x0233;
    L_0x01cd:
        r1 = r8.padded;	 Catch:{ Exception -> 0x020d }
        if (r1 == 0) goto L_0x0233;
    L_0x01d1:
        r1 = new org.spongycastle.crypto.params.ParametersWithRandom;
        r1.<init>(r2, r12);
    L_0x01d6:
        switch(r9) {
            case 1: goto L_0x020f;
            case 2: goto L_0x0217;
            case 3: goto L_0x020f;
            case 4: goto L_0x0217;
            default: goto L_0x01d9;
        };
    L_0x01d9:
        r1 = new java.security.InvalidParameterException;	 Catch:{ Exception -> 0x0200 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0200 }
        r2.<init>();	 Catch:{ Exception -> 0x0200 }
        r3 = z;	 Catch:{ Exception -> 0x0200 }
        r4 = 30;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0200 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0200 }
        r2 = r2.append(r9);	 Catch:{ Exception -> 0x0200 }
        r3 = z;	 Catch:{ Exception -> 0x0200 }
        r4 = 23;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0200 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0200 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0200 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0200 }
        throw r1;	 Catch:{ Exception -> 0x0200 }
    L_0x0200:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0202 }
    L_0x0202:
        r1 = move-exception;
        r2 = new java.security.InvalidKeyException;
        r1 = r1.getMessage();
        r2.<init>(r1);
        throw r2;
    L_0x020d:
        r1 = move-exception;
        throw r1;
    L_0x020f:
        r2 = r8.cipher;	 Catch:{ Exception -> 0x0229 }
        r5 = 1;
        r2.init(r5, r1);	 Catch:{ Exception -> 0x0229 }
        if (r7 == 0) goto L_0x021f;
    L_0x0217:
        r2 = r8.cipher;	 Catch:{ Exception -> 0x022b }
        r5 = 0;
        r2.init(r5, r1);	 Catch:{ Exception -> 0x022b }
        if (r7 != 0) goto L_0x01d9;
    L_0x021f:
        r1 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;	 Catch:{ Exception -> 0x022d }
        if (r1 == 0) goto L_0x0228;
    L_0x0223:
        if (r7 == 0) goto L_0x0231;
    L_0x0225:
        r1 = r3;
    L_0x0226:
        org.spongycastle.jcajce.provider.symmetric.util.BaseMac.a = r1;
    L_0x0228:
        return;
    L_0x0229:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x022b }
    L_0x022b:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x0200 }
    L_0x022d:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x022f }
    L_0x022f:
        r1 = move-exception;
        throw r1;
    L_0x0231:
        r1 = r4;
        goto L_0x0226;
    L_0x0233:
        r1 = r2;
        goto L_0x01d6;
    L_0x0235:
        r2 = r1;
        goto L_0x01a0;
    L_0x0238:
        r2 = r12;
        goto L_0x0187;
    L_0x023b:
        r1 = r2;
        goto L_0x0174;
    L_0x023e:
        r1 = r2;
        goto L_0x0174;
    L_0x0241:
        r1 = r2;
        goto L_0x0174;
    L_0x0244:
        r2 = r6;
        goto L_0x00b5;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    protected void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.cipher.updateAAD(bArr, i, i2);
    }

    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        try {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        } catch (DataLengthException e) {
            throw new ShortBufferException(e.getMessage());
        }
    }

    protected AlgorithmParameters engineGetParameters() {
        try {
            if (this.engineParams == null) {
                if (this.pbeSpec != null) {
                    try {
                        this.engineParams = AlgorithmParameters.getInstance(this.pbeAlgorithm, z[1]);
                        this.engineParams.init(this.pbeSpec);
                    } catch (Exception e) {
                        return null;
                    }
                } else if (this.ivParam != null) {
                    String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
                    if (algorithmName.indexOf(47) >= 0) {
                        algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                    }
                    try {
                        this.engineParams = AlgorithmParameters.getInstance(algorithmName, z[2]);
                        this.engineParams.init(this.ivParam.getIV());
                    } catch (Exception e2) {
                        throw new RuntimeException(e2.toString());
                    }
                }
            }
            return this.engineParams;
        } catch (Exception e22) {
            throw e22;
        }
    }

    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    protected void engineUpdateAAD(ByteBuffer byteBuffer) {
        engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    protected void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec parameterSpec;
        int i2 = 0;
        boolean z = BaseMac.a;
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (algorithmParameters != null) {
            while (i2 != this.availableSpecs.length) {
                try {
                    if (this.availableSpecs[i2] != null || z) {
                        try {
                            parameterSpec = algorithmParameters.getParameterSpec(this.availableSpecs[i2]);
                            break;
                        } catch (Exception e) {
                        }
                    }
                    i2++;
                    if (z) {
                        break;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            parameterSpec = algorithmParameterSpec;
            if (parameterSpec == null) {
                try {
                    throw new InvalidAlgorithmParameterException(z[0] + algorithmParameters.toString());
                } catch (Exception e22) {
                    throw e22;
                }
            }
        }
        parameterSpec = null;
        engineInit(i, key, parameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i2);
        if (updateOutputSize > 0) {
            byte[] bArr2 = new byte[updateOutputSize];
            int processBytes = this.cipher.processBytes(bArr, i, i2, bArr2, 0);
            if (processBytes == 0) {
                return null;
            }
            if (processBytes == bArr2.length) {
                return bArr2;
            }
            Object obj = new Object[processBytes];
            System.arraycopy(bArr2, 0, obj, 0, processBytes);
            return obj;
        }
        this.cipher.processBytes(bArr, i, i2, null, 0);
        return null;
    }

    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        try {
            if (i2 != 0) {
                i4 = this.cipher.processBytes(bArr, i, i2, bArr2, i3);
            }
            return i4 + this.cipher.doFinal(bArr2, i3 + i4);
        } catch (OutputLengthException e) {
            throw new ShortBufferException(e.getMessage());
        } catch (DataLengthException e2) {
            throw new IllegalBlockSizeException(e2.getMessage());
        }
    }

    private static Class lookup(String str) {
        try {
            return BaseBlockCipher.class.getClassLoader().loadClass(str);
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void engineSetMode(java.lang.String r7) {
        /*
        r6_this = this;
        r5 = 3;
        r0 = org.spongycastle.jcajce.provider.symmetric.util.BaseMac.a;
        r1 = org.spongycastle.util.Strings.toUpperCase(r7);	 Catch:{ RuntimeException -> 0x015b }
        r6.modeName = r1;	 Catch:{ RuntimeException -> 0x015b }
        r1 = r6.modeName;	 Catch:{ RuntimeException -> 0x015b }
        r2 = z;	 Catch:{ RuntimeException -> 0x015b }
        r3 = 19;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x015b }
        r1 = r1.equals(r2);	 Catch:{ RuntimeException -> 0x015b }
        if (r1 == 0) goto L_0x0025;
    L_0x0017:
        r1 = 0;
        r6.ivLength = r1;	 Catch:{ RuntimeException -> 0x015d }
        r1 = new org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher$BufferedGenericBlockCipher;	 Catch:{ RuntimeException -> 0x015d }
        r2 = r6.baseEngine;	 Catch:{ RuntimeException -> 0x015d }
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x015d }
        r6.cipher = r1;	 Catch:{ RuntimeException -> 0x015d }
        if (r0 == 0) goto L_0x0175;
    L_0x0025:
        r1 = r6.modeName;	 Catch:{ RuntimeException -> 0x015f }
        r2 = z;	 Catch:{ RuntimeException -> 0x015f }
        r3 = 16;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x015f }
        r1 = r1.equals(r2);	 Catch:{ RuntimeException -> 0x015f }
        if (r1 == 0) goto L_0x004b;
    L_0x0033:
        r1 = r6.baseEngine;	 Catch:{ RuntimeException -> 0x0161 }
        r1 = r1.getBlockSize();	 Catch:{ RuntimeException -> 0x0161 }
        r6.ivLength = r1;	 Catch:{ RuntimeException -> 0x0161 }
        r1 = new org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher$BufferedGenericBlockCipher;	 Catch:{ RuntimeException -> 0x0161 }
        r2 = new org.spongycastle.crypto.modes.CBCBlockCipher;	 Catch:{ RuntimeException -> 0x0161 }
        r3 = r6.baseEngine;	 Catch:{ RuntimeException -> 0x0161 }
        r2.<init>(r3);	 Catch:{ RuntimeException -> 0x0161 }
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x0161 }
        r6.cipher = r1;	 Catch:{ RuntimeException -> 0x0161 }
        if (r0 == 0) goto L_0x0175;
    L_0x004b:
        r1 = r6.modeName;	 Catch:{ RuntimeException -> 0x0163 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0163 }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0163 }
        r1 = r1.startsWith(r2);	 Catch:{ RuntimeException -> 0x0163 }
        if (r1 == 0) goto L_0x009b;
    L_0x0059:
        r1 = r6.baseEngine;	 Catch:{ RuntimeException -> 0x0163 }
        r1 = r1.getBlockSize();	 Catch:{ RuntimeException -> 0x0163 }
        r6.ivLength = r1;	 Catch:{ RuntimeException -> 0x0163 }
        r1 = r6.modeName;	 Catch:{ RuntimeException -> 0x0163 }
        r1 = r1.length();	 Catch:{ RuntimeException -> 0x0163 }
        if (r1 == r5) goto L_0x0083;
    L_0x0069:
        r1 = r6.modeName;
        r1 = r1.substring(r5);
        r1 = java.lang.Integer.parseInt(r1);
        r2 = new org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher$BufferedGenericBlockCipher;	 Catch:{ RuntimeException -> 0x0165 }
        r3 = new org.spongycastle.crypto.modes.OFBBlockCipher;	 Catch:{ RuntimeException -> 0x0165 }
        r4 = r6.baseEngine;	 Catch:{ RuntimeException -> 0x0165 }
        r3.<init>(r4, r1);	 Catch:{ RuntimeException -> 0x0165 }
        r2.<init>(r3);	 Catch:{ RuntimeException -> 0x0165 }
        r6.cipher = r2;	 Catch:{ RuntimeException -> 0x0165 }
        if (r0 == 0) goto L_0x0175;
    L_0x0083:
        r1 = new org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher$BufferedGenericBlockCipher;	 Catch:{ RuntimeException -> 0x0167 }
        r2 = new org.spongycastle.crypto.modes.OFBBlockCipher;	 Catch:{ RuntimeException -> 0x0167 }
        r3 = r6.baseEngine;	 Catch:{ RuntimeException -> 0x0167 }
        r4 = r6.baseEngine;	 Catch:{ RuntimeException -> 0x0167 }
        r4 = r4.getBlockSize();	 Catch:{ RuntimeException -> 0x0167 }
        r4 = r4 * 8;
        r2.<init>(r3, r4);	 Catch:{ RuntimeException -> 0x0167 }
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x0167 }
        r6.cipher = r1;	 Catch:{ RuntimeException -> 0x0167 }
        if (r0 == 0) goto L_0x0175;
    L_0x009b:
        r1 = r6.modeName;	 Catch:{ RuntimeException -> 0x0169 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0169 }
        r3 = 15;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0169 }
        r1 = r1.startsWith(r2);	 Catch:{ RuntimeException -> 0x0169 }
        if (r1 == 0) goto L_0x00eb;
    L_0x00a9:
        r1 = r6.baseEngine;	 Catch:{ RuntimeException -> 0x0169 }
        r1 = r1.getBlockSize();	 Catch:{ RuntimeException -> 0x0169 }
        r6.ivLength = r1;	 Catch:{ RuntimeException -> 0x0169 }
        r1 = r6.modeName;	 Catch:{ RuntimeException -> 0x0169 }
        r1 = r1.length();	 Catch:{ RuntimeException -> 0x0169 }
        if (r1 == r5) goto L_0x00d3;
    L_0x00b9:
        r1 = r6.modeName;
        r1 = r1.substring(r5);
        r1 = java.lang.Integer.parseInt(r1);
        r2 = new org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher$BufferedGenericBlockCipher;	 Catch:{ RuntimeException -> 0x016b }
        r3 = new org.spongycastle.crypto.modes.CFBBlockCipher;	 Catch:{ RuntimeException -> 0x016b }
        r4 = r6.baseEngine;	 Catch:{ RuntimeException -> 0x016b }
        r3.<init>(r4, r1);	 Catch:{ RuntimeException -> 0x016b }
        r2.<init>(r3);	 Catch:{ RuntimeException -> 0x016b }
        r6.cipher = r2;	 Catch:{ RuntimeException -> 0x016b }
        if (r0 == 0) goto L_0x0175;
    L_0x00d3:
        r1 = new org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher$BufferedGenericBlockCipher;	 Catch:{ RuntimeException -> 0x016d }
        r2 = new org.spongycastle.crypto.modes.CFBBlockCipher;	 Catch:{ RuntimeException -> 0x016d }
        r3 = r6.baseEngine;	 Catch:{ RuntimeException -> 0x016d }
        r4 = r6.baseEngine;	 Catch:{ RuntimeException -> 0x016d }
        r4 = r4.getBlockSize();	 Catch:{ RuntimeException -> 0x016d }
        r4 = r4 * 8;
        r2.<init>(r3, r4);	 Catch:{ RuntimeException -> 0x016d }
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x016d }
        r6.cipher = r1;	 Catch:{ RuntimeException -> 0x016d }
        if (r0 == 0) goto L_0x0175;
    L_0x00eb:
        r1 = r6.modeName;	 Catch:{ RuntimeException -> 0x016f }
        r2 = z;	 Catch:{ RuntimeException -> 0x016f }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x016f }
        r1 = r1.startsWith(r2);	 Catch:{ RuntimeException -> 0x016f }
        if (r1 == 0) goto L_0x0116;
    L_0x00f9:
        r1 = r6.baseEngine;	 Catch:{ RuntimeException -> 0x0171 }
        r1 = r1.getBlockSize();	 Catch:{ RuntimeException -> 0x0171 }
        r6.ivLength = r1;	 Catch:{ RuntimeException -> 0x0171 }
        r1 = new org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher$BufferedGenericBlockCipher;	 Catch:{ RuntimeException -> 0x0171 }
        r2 = new org.spongycastle.crypto.BufferedBlockCipher;	 Catch:{ RuntimeException -> 0x0171 }
        r3 = new org.spongycastle.crypto.modes.SICBlockCipher;	 Catch:{ RuntimeException -> 0x0171 }
        r4 = r6.baseEngine;	 Catch:{ RuntimeException -> 0x0171 }
        r3.<init>(r4);	 Catch:{ RuntimeException -> 0x0171 }
        r2.<init>(r3);	 Catch:{ RuntimeException -> 0x0171 }
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x0171 }
        r6.cipher = r1;	 Catch:{ RuntimeException -> 0x0171 }
        if (r0 == 0) goto L_0x0175;
    L_0x0116:
        r1 = r6.modeName;	 Catch:{ RuntimeException -> 0x0173 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0173 }
        r3 = 14;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0173 }
        r1 = r1.startsWith(r2);	 Catch:{ RuntimeException -> 0x0173 }
        if (r1 == 0) goto L_0x013c;
    L_0x0124:
        r1 = r6.baseEngine;	 Catch:{ RuntimeException -> 0x0159 }
        r1 = r1.getBlockSize();	 Catch:{ RuntimeException -> 0x0159 }
        r6.ivLength = r1;	 Catch:{ RuntimeException -> 0x0159 }
        r1 = new org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher$AEADGenericBlockCipher;	 Catch:{ RuntimeException -> 0x0159 }
        r2 = new org.spongycastle.crypto.modes.GCMBlockCipher;	 Catch:{ RuntimeException -> 0x0159 }
        r3 = r6.baseEngine;	 Catch:{ RuntimeException -> 0x0159 }
        r2.<init>(r3);	 Catch:{ RuntimeException -> 0x0159 }
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x0159 }
        r6.cipher = r1;	 Catch:{ RuntimeException -> 0x0159 }
        if (r0 == 0) goto L_0x0175;
    L_0x013c:
        r0 = new java.security.NoSuchAlgorithmException;	 Catch:{ RuntimeException -> 0x0159 }
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0159 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x0159 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0159 }
        r3 = 18;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0159 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0159 }
        r1 = r1.append(r7);	 Catch:{ RuntimeException -> 0x0159 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x0159 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x0159 }
        throw r0;	 Catch:{ RuntimeException -> 0x0159 }
    L_0x0159:
        r0 = move-exception;
        throw r0;
    L_0x015b:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x015d }
    L_0x015d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x015f }
    L_0x015f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0161 }
    L_0x0161:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0163 }
    L_0x0163:
        r0 = move-exception;
        throw r0;
    L_0x0165:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0167 }
    L_0x0167:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0169 }
    L_0x0169:
        r0 = move-exception;
        throw r0;
    L_0x016b:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x016d }
    L_0x016d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x016f }
    L_0x016f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0171 }
    L_0x0171:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0173 }
    L_0x0173:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0159 }
    L_0x0175:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineSetMode(java.lang.String):void");
    }

    protected BaseBlockCipher(BlockCipherProvider blockCipherProvider) {
        boolean z = false;
        boolean z2 = BaseMac.a;
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.ivLength = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipherProvider.get();
        this.engineProvider = blockCipherProvider;
        this.cipher = new BufferedGenericBlockCipher(blockCipherProvider.get());
        if (z2) {
            try {
                if (!BaseKeyGenerator.a) {
                    z = true;
                }
                BaseKeyGenerator.a = z;
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }

    static Class access$000(String str) {
        return lookup(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void engineSetPadding(java.lang.String r6) {
        /*
        r5_this = this;
        r0 = org.spongycastle.jcajce.provider.symmetric.util.BaseMac.a;
        r1 = org.spongycastle.util.Strings.toUpperCase(r6);
        r2 = z;	 Catch:{ RuntimeException -> 0x0046 }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0046 }
        r2 = r1.equals(r2);	 Catch:{ RuntimeException -> 0x0046 }
        if (r2 == 0) goto L_0x002d;
    L_0x0011:
        r2 = r5.cipher;	 Catch:{ RuntimeException -> 0x0048 }
        r2 = r2.wrapOnNoPadding();	 Catch:{ RuntimeException -> 0x0048 }
        if (r2 == 0) goto L_0x00a0;
    L_0x0019:
        r2 = new org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher$BufferedGenericBlockCipher;	 Catch:{ RuntimeException -> 0x004a }
        r3 = new org.spongycastle.crypto.BufferedBlockCipher;	 Catch:{ RuntimeException -> 0x004a }
        r4 = r5.cipher;	 Catch:{ RuntimeException -> 0x004a }
        r4 = r4.getUnderlyingCipher();	 Catch:{ RuntimeException -> 0x004a }
        r3.<init>(r4);	 Catch:{ RuntimeException -> 0x004a }
        r2.<init>(r3);	 Catch:{ RuntimeException -> 0x004a }
        r5.cipher = r2;	 Catch:{ RuntimeException -> 0x004a }
        if (r0 == 0) goto L_0x00a0;
    L_0x002d:
        r2 = 1;
        r5.padded = r2;	 Catch:{ RuntimeException -> 0x0044 }
        r2 = r5.modeName;	 Catch:{ RuntimeException -> 0x0044 }
        r2 = r5.isAEADModeName(r2);	 Catch:{ RuntimeException -> 0x0044 }
        if (r2 == 0) goto L_0x004c;
    L_0x0038:
        r0 = new javax.crypto.NoSuchPaddingException;	 Catch:{ RuntimeException -> 0x0044 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0044 }
        r2 = 8;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0044 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x0044 }
        throw r0;	 Catch:{ RuntimeException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0044 }
    L_0x004c:
        r2 = z;	 Catch:{ RuntimeException -> 0x009c }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x009c }
        r2 = r1.equals(r2);	 Catch:{ RuntimeException -> 0x009c }
        if (r2 != 0) goto L_0x0064;
    L_0x0058:
        r2 = z;	 Catch:{ RuntimeException -> 0x009e }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x009e }
        r1 = r1.equals(r2);	 Catch:{ RuntimeException -> 0x009e }
        if (r1 == 0) goto L_0x0073;
    L_0x0064:
        r1 = new org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher$BufferedGenericBlockCipher;	 Catch:{ RuntimeException -> 0x009a }
        r2 = r5.cipher;	 Catch:{ RuntimeException -> 0x009a }
        r2 = r2.getUnderlyingCipher();	 Catch:{ RuntimeException -> 0x009a }
        r1.<init>(r2);	 Catch:{ RuntimeException -> 0x009a }
        r5.cipher = r1;	 Catch:{ RuntimeException -> 0x009a }
        if (r0 == 0) goto L_0x00a0;
    L_0x0073:
        r0 = new javax.crypto.NoSuchPaddingException;	 Catch:{ RuntimeException -> 0x009a }
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x009a }
        r1.<init>();	 Catch:{ RuntimeException -> 0x009a }
        r2 = z;	 Catch:{ RuntimeException -> 0x009a }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x009a }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x009a }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x009a }
        r2 = z;	 Catch:{ RuntimeException -> 0x009a }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x009a }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x009a }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x009a }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x009a }
        throw r0;	 Catch:{ RuntimeException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;
    L_0x009c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x009e }
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x009a }
    L_0x00a0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineSetPadding(java.lang.String):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isAEADModeName(java.lang.String r3) {
        /*
        r2_this = this;
        r0 = z;	 Catch:{ RuntimeException -> 0x002e }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x002e }
        r0 = r0.equals(r3);	 Catch:{ RuntimeException -> 0x002e }
        if (r0 != 0) goto L_0x002c;
    L_0x000b:
        r0 = z;	 Catch:{ RuntimeException -> 0x0030 }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0030 }
        r0 = r0.equals(r3);	 Catch:{ RuntimeException -> 0x0030 }
        if (r0 != 0) goto L_0x002c;
    L_0x0016:
        r0 = z;	 Catch:{ RuntimeException -> 0x0032 }
        r1 = 5;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0032 }
        r0 = r0.equals(r3);	 Catch:{ RuntimeException -> 0x0032 }
        if (r0 != 0) goto L_0x002c;
    L_0x0021:
        r0 = z;	 Catch:{ RuntimeException -> 0x0034 }
        r1 = 6;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0034 }
        r0 = r0.equals(r3);	 Catch:{ RuntimeException -> 0x0034 }
        if (r0 == 0) goto L_0x0036;
    L_0x002c:
        r0 = 1;
    L_0x002d:
        return r0;
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r0 = 0;
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.isAEADModeName(java.lang.String):boolean");
    }

    protected int engineGetOutputSize(int i) {
        return this.cipher.getOutputSize(i);
    }

    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        int processBytes;
        Object obj = new Object[engineGetOutputSize(i2)];
        if (i2 != 0) {
            processBytes = this.cipher.processBytes(bArr, i, i2, obj, 0);
        } else {
            processBytes = 0;
        }
        try {
            int doFinal = this.cipher.doFinal(obj, processBytes) + processBytes;
            try {
                if (doFinal == obj.length) {
                    return obj;
                }
                Object obj2 = new Object[doFinal];
                System.arraycopy(obj, 0, obj2, 0, doFinal);
                return obj2;
            } catch (DataLengthException e) {
                throw e;
            }
        } catch (DataLengthException e2) {
            throw new IllegalBlockSizeException(e2.getMessage());
        }
    }

    protected int engineGetBlockSize() {
        return this.baseEngine.getBlockSize();
    }
}
