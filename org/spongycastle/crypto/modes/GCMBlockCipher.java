package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.modes.gcm.GCMExponentiator;
import org.spongycastle.crypto.modes.gcm.GCMMultiplier;
import org.spongycastle.crypto.modes.gcm.Tables8kGCMMultiplier;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.spongycastle.util.Arrays;
import org.whispersystems.libaxolotl.ay;

public class GCMBlockCipher implements AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final String[] z;
    private byte[] H;
    private byte[] J0;
    private byte[] S;
    private byte[] S_at;
    private byte[] S_atPre;
    private byte[] atBlock;
    private int atBlockPos;
    private long atLength;
    private long atLengthPre;
    private byte[] bufBlock;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] counter;
    private GCMExponentiator exp;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private byte[] macBlock;
    private int macSize;
    private GCMMultiplier multiplier;
    private byte[] nonce;
    private long totalLength;

    static {
        int i;
        int i2;
        String[] strArr = new String[12];
        char[] toCharArray = "A\bs\u0006".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 110;
                    break;
                case ay.f /*1*/:
                    i2 = 79;
                    break;
                case ay.n /*2*/:
                    i2 = 48;
                    break;
                case ay.p /*3*/:
                    i2 = 75;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "!:D;\u0013\u001aoR>\u0000\b*Bk\u0012\u0001 \u00108\u000e\u0001=D".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 110;
                    break;
                case ay.f /*1*/:
                    i2 = 79;
                    break;
                case ay.n /*2*/:
                    i2 = 48;
                    break;
                case ay.p /*3*/:
                    i2 = 75;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "!:D;\u0013\u001aoR>\u0000\b*Bk\u0012\u0001 \u00108\u000e\u0001=D".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 110;
                    break;
                case ay.f /*1*/:
                    i2 = 79;
                    break;
                case ay.n /*2*/:
                    i2 = 48;
                    break;
                case ay.p /*3*/:
                    i2 = 75;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\u0003.Sk\u0005\u0006*S F\u0007!\u0010\f%#oV*\u000f\u0002*T".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 110;
                    break;
                case ay.f /*1*/:
                    i2 = 79;
                    break;
                case ay.n /*2*/:
                    i2 = 48;
                    break;
                case ay.p /*3*/:
                    i2 = 75;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\n.D*F\u001a _k\u0015\u0006 B?".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 110;
                    break;
                case ay.f /*1*/:
                    i2 = 79;
                    break;
                case ay.n /*2*/:
                    i2 = 48;
                    break;
                case ay.p /*3*/:
                    i2 = 75;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "!:D;\u0013\u001aoR>\u0000\b*Bk\u0012\u0001 \u00108\u000e\u0001=D".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 110;
                    break;
                case ay.f /*1*/:
                    i2 = 79;
                    break;
                case ay.n /*2*/:
                    i2 = 48;
                    break;
                case ay.p /*3*/:
                    i2 = 75;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "'!F*\n\u0007+\u0010=\u0007\u0002:Uk\u0000\u0001=\u0010\u0006'-oC\"\u001c\u000bu\u0010".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 110;
                    break;
                case ay.f /*1*/:
                    i2 = 79;
                    break;
                case ay.n /*2*/:
                    i2 = 48;
                    break;
                case ay.p /*3*/:
                    i2 = 75;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "\u0007!F*\n\u0007+\u0010;\u0007\u001c.].\u0012\u000b=Ck\u0016\u000f<C.\u0002N;_k!-\u0002".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 110;
                    break;
                case ay.f /*1*/:
                    i2 = 79;
                    break;
                case ay.n /*2*/:
                    i2 = 48;
                    break;
                case ay.p /*3*/:
                    i2 = 75;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "%*Ik\u000b\u001b<Dk\u0004\u000boC;\u0003\r&V\"\u0003\noY%F\u0007!Y?\u000f\u000f#\u0010\"\b\u0007;".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 110;
                    break;
                case ay.f /*1*/:
                    i2 = 79;
                    break;
                case ay.n /*2*/:
                    i2 = 48;
                    break;
                case ay.p /*3*/:
                    i2 = 75;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "'\u0019\u0010&\u0013\u001d;\u0010)\u0003N.Dk\n\u000b.C?F_oR2\u0012\u000b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 110;
                    break;
                case ay.f /*1*/:
                    i2 = 79;
                    break;
                case ay.n /*2*/:
                    i2 = 48;
                    break;
                case ay.p /*3*/:
                    i2 = 75;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "\r&@#\u0003\u001coB.\u0017\u001b&B.\u0002N8Y?\u000eN.\u0010)\n\u0001,[k\u0015\u00075Uk\t\bo\u0001}H".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 110;
                    break;
                case ay.f /*1*/:
                    i2 = 79;
                    break;
                case ay.n /*2*/:
                    i2 = 48;
                    break;
                case ay.p /*3*/:
                    i2 = 75;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "'!@>\u0012N-E-\u0000\u000b=\u0010?\t\u0001oC#\t\u001c;".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 110;
                    break;
                case ay.f /*1*/:
                    i2 = 79;
                    break;
                case ay.n /*2*/:
                    i2 = 48;
                    break;
                case ay.p /*3*/:
                    i2 = 75;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[11] = new String(cArr).intern();
        z = strArr;
    }

    private void reset(boolean z) {
        try {
            this.cipher.reset();
            this.S = new byte[BLOCK_SIZE];
            this.S_at = new byte[BLOCK_SIZE];
            this.S_atPre = new byte[BLOCK_SIZE];
            this.atBlock = new byte[BLOCK_SIZE];
            this.atBlockPos = 0;
            this.atLength = 0;
            this.atLengthPre = 0;
            this.counter = Arrays.clone(this.J0);
            this.bufOff = 0;
            this.totalLength = 0;
            if (this.bufBlock != null) {
                Arrays.fill(this.bufBlock, (byte) 0);
            }
            if (z) {
                try {
                    this.macBlock = null;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            try {
                if (this.initialAssociatedText != null) {
                    processAADBytes(this.initialAssociatedText, 0, this.initialAssociatedText.length);
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void reset() {
        reset(true);
    }

    private static void multiply(byte[] bArr, byte[] bArr2) {
        int i = SICBlockCipher.a;
        byte[] clone = Arrays.clone(bArr);
        Object obj = new Object[BLOCK_SIZE];
        int i2 = 0;
        while (i2 < BLOCK_SIZE) {
            int i3;
            byte b = bArr2[i2];
            int i4 = 7;
            while (i4 >= 0) {
                if (((1 << i4) & b) != 0) {
                    try {
                        xor(obj, clone);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                try {
                    if ((clone[15] & 1) != 0) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    try {
                        shiftRight(clone);
                        if (i3 != 0) {
                            clone[0] = (byte) (clone[0] ^ -31);
                        }
                        i3 = i4 - 1;
                        if (i != 0) {
                            break;
                        }
                        i4 = i3;
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        System.arraycopy(obj, 0, bArr, 0, BLOCK_SIZE);
    }

    public int getUpdateOutputSize(int i) {
        int i2 = this.bufOff + i;
        try {
            if (!this.forEncryption) {
                if (i2 < this.macSize) {
                    return 0;
                }
                i2 -= this.macSize;
            }
            try {
                return i2 - (i2 % 16);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void processAADBytes(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int i4 = SICBlockCipher.a;
        while (i3 < i2) {
            try {
                this.atBlock[this.atBlockPos] = bArr[i + i3];
                int i5 = this.atBlockPos + 1;
                this.atBlockPos = i5;
                if (i5 == BLOCK_SIZE) {
                    gHASHBlock(this.S_at, this.atBlock);
                    this.atBlockPos = 0;
                    this.atLength += 16;
                }
                i3++;
                if (i4 != 0) {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public byte[] getMac() {
        return Arrays.clone(this.macBlock);
    }

    private byte[] getNextCounterBlock() {
        int i = SICBlockCipher.a;
        int i2 = 15;
        while (i2 >= 12) {
            byte b = (byte) ((this.counter[i2] + 1) & 255);
            try {
                this.counter[i2] = b;
                if (b != null && i == 0) {
                    break;
                }
                i2--;
                if (i != 0) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        byte[] bArr = new byte[BLOCK_SIZE];
        this.cipher.processBlock(this.counter, 0, bArr, 0);
        return bArr;
    }

    private void gCTRBlock(byte[] bArr, byte[] bArr2, int i) {
        Object nextCounterBlock = getNextCounterBlock();
        try {
            xor(nextCounterBlock, bArr);
            System.arraycopy(nextCounterBlock, 0, bArr2, i, BLOCK_SIZE);
            byte[] bArr3 = this.S;
            if (this.forEncryption) {
                bArr = nextCounterBlock;
            }
            gHASHBlock(bArr3, bArr);
            this.totalLength += 16;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        int i5 = SICBlockCipher.a;
        try {
            if (bArr.length < i + i2) {
                throw new DataLengthException(z[11]);
            }
            int i6 = 0;
            while (i6 < i2) {
                try {
                    this.bufBlock[this.bufOff] = bArr[i + i6];
                    int i7 = this.bufOff + 1;
                    this.bufOff = i7;
                    if (i7 == this.bufBlock.length) {
                        outputBlock(bArr2, i3 + i4);
                        i4 += 16;
                    }
                    i6++;
                    if (i5 != 0) {
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            return i4;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + z[0];
    }

    public GCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, null);
    }

    private static void shiftRight(byte[] bArr) {
        int i = 0;
        int i2 = SICBlockCipher.a;
        int i3 = 0;
        do {
            int i4 = bArr[i3] & 255;
            bArr[i3] = (byte) (i | (i4 >>> 1));
            i3++;
            if (i3 != BLOCK_SIZE || i2 != 0) {
                i = (i4 & 1) << 7;
            } else {
                return;
            }
        } while (i2 == 0);
    }

    private static void xor(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = SICBlockCipher.a;
        while (true) {
            int i4 = i2 - 1;
            if (i2 > 0) {
                bArr[i4] = (byte) (bArr[i4] ^ bArr2[i + i4]);
                if (i3 == 0) {
                    i2 = i4;
                } else {
                    return;
                }
            }
            return;
        }
    }

    private void gHASHPartial(byte[] bArr, byte[] bArr2, int i, int i2) {
        xor(bArr, bArr2, i, i2);
        this.multiplier.multiplyH(bArr);
    }

    public int getOutputSize(int i) {
        int i2 = this.bufOff + i;
        try {
            if (this.forEncryption) {
                return i2 + this.macSize;
            }
            try {
                return i2 < this.macSize ? 0 : i2 - this.macSize;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void processAADByte(byte b) {
        try {
            this.atBlock[this.atBlockPos] = b;
            int i = this.atBlockPos + 1;
            this.atBlockPos = i;
            if (i == BLOCK_SIZE) {
                gHASHBlock(this.S_at, this.atBlock);
                this.atBlockPos = 0;
                this.atLength += 16;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void outputBlock(byte[] bArr, int i) {
        try {
            if (bArr.length < i + 16) {
                throw new OutputLengthException(z[1]);
            }
            try {
                if (this.totalLength == 0) {
                    initCipher();
                }
                try {
                    gCTRBlock(this.bufBlock, bArr, i);
                    if (this.forEncryption) {
                        this.bufOff = 0;
                        if (SICBlockCipher.a == 0) {
                            return;
                        }
                    }
                    System.arraycopy(this.bufBlock, BLOCK_SIZE, this.bufBlock, 0, this.macSize);
                    this.bufOff = this.macSize;
                } catch (IllegalArgumentException e) {
                    throw e;
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

    private void gHASH(byte[] bArr, byte[] bArr2, int i) {
        int i2 = SICBlockCipher.a;
        int i3 = 0;
        while (i3 < i) {
            gHASHPartial(bArr, bArr2, i3, Math.min(i - i3, BLOCK_SIZE));
            i3 += 16;
            if (i2 != 0) {
                return;
            }
        }
    }

    public GCMBlockCipher(BlockCipher blockCipher, GCMMultiplier gCMMultiplier) {
        if (blockCipher.getBlockSize() != BLOCK_SIZE) {
            throw new IllegalArgumentException(z[10]);
        }
        if (gCMMultiplier == null) {
            gCMMultiplier = new Tables8kGCMMultiplier();
        }
        this.cipher = blockCipher;
        this.multiplier = gCMMultiplier;
    }

    private void initCipher() {
        try {
            if (this.atLength > 0) {
                System.arraycopy(this.S_at, 0, this.S_atPre, 0, BLOCK_SIZE);
                this.atLengthPre = this.atLength;
            }
            try {
                if (this.atBlockPos > 0) {
                    gHASHPartial(this.S_atPre, this.atBlock, 0, this.atBlockPos);
                    this.atLengthPre += (long) this.atBlockPos;
                }
                try {
                    if (this.atLengthPre > 0) {
                        System.arraycopy(this.S_atPre, 0, this.S, 0, BLOCK_SIZE);
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    private void gHASHBlock(byte[] bArr, byte[] bArr2) {
        xor(bArr, bArr2);
        this.multiplier.multiplyH(bArr);
    }

    private void gCTRPartial(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        Object nextCounterBlock = getNextCounterBlock();
        try {
            xor(nextCounterBlock, bArr, i, i2);
            System.arraycopy(nextCounterBlock, 0, bArr2, i3, i2);
            byte[] bArr3 = this.S;
            if (this.forEncryption) {
                bArr = nextCounterBlock;
            }
            gHASHPartial(bArr3, bArr, 0, i2);
            this.totalLength += (long) i2;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public int processByte(byte b, byte[] bArr, int i) {
        try {
            this.bufBlock[this.bufOff] = b;
            int i2 = this.bufOff + 1;
            this.bufOff = i2;
            if (i2 != this.bufBlock.length) {
                return 0;
            }
            outputBlock(bArr, i);
            return BLOCK_SIZE;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(boolean r9, org.spongycastle.crypto.CipherParameters r10) {
        /*
        r8_this = this;
        r7 = 0;
        r2 = 1;
        r1 = 0;
        r3 = 16;
        r4 = org.spongycastle.crypto.modes.SICBlockCipher.a;
        r8.forEncryption = r9;
        r8.macBlock = r7;
        r0 = r10 instanceof org.spongycastle.crypto.params.AEADParameters;
        if (r0 == 0) goto L_0x005d;
    L_0x000f:
        r0 = r10;
        r0 = (org.spongycastle.crypto.params.AEADParameters) r0;
        r5 = r0.getNonce();
        r8.nonce = r5;
        r5 = r0.getAssociatedText();
        r8.initialAssociatedText = r5;
        r5 = r0.getMacSize();
        r6 = 32;
        if (r5 < r6) goto L_0x002e;
    L_0x0026:
        r6 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r5 > r6) goto L_0x002e;
    L_0x002a:
        r6 = r5 % 8;
        if (r6 == 0) goto L_0x004c;
    L_0x002e:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004a }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x004a }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x004a }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x004a }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x004a }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x004a }
        r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x004a }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x004a }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x004a }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r5 = r5 / 8;
        r8.macSize = r5;
        r0 = r0.getKey();
        if (r4 == 0) goto L_0x0086;
    L_0x0056:
        r0 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;	 Catch:{ IllegalArgumentException -> 0x0082 }
        if (r0 == 0) goto L_0x0084;
    L_0x005a:
        r0 = r1;
    L_0x005b:
        org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a = r0;
    L_0x005d:
        r0 = r10 instanceof org.spongycastle.crypto.params.ParametersWithIV;
        if (r0 == 0) goto L_0x0075;
    L_0x0061:
        r10 = (org.spongycastle.crypto.params.ParametersWithIV) r10;
        r0 = r10.getIV();
        r8.nonce = r0;
        r8.initialAssociatedText = r7;
        r8.macSize = r3;
        r0 = r10.getParameters();
        r0 = (org.spongycastle.crypto.params.KeyParameter) r0;
        if (r4 == 0) goto L_0x0086;
    L_0x0075:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0080 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0080 }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0080 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0080 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0080 }
    L_0x0080:
        r0 = move-exception;
        throw r0;
    L_0x0082:
        r0 = move-exception;
        throw r0;
    L_0x0084:
        r0 = r2;
        goto L_0x005b;
    L_0x0086:
        r1 = r0;
        if (r9 == 0) goto L_0x00a5;
    L_0x0089:
        r0 = r3;
    L_0x008a:
        r0 = new byte[r0];	 Catch:{ IllegalArgumentException -> 0x00aa }
        r8.bufBlock = r0;	 Catch:{ IllegalArgumentException -> 0x00aa }
        r0 = r8.nonce;	 Catch:{ IllegalArgumentException -> 0x00aa }
        if (r0 == 0) goto L_0x0097;
    L_0x0092:
        r0 = r8.nonce;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r0 = r0.length;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        if (r0 >= r2) goto L_0x00ac;
    L_0x0097:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r2 = 9;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r0 = r8.macSize;
        r0 = r0 + 16;
        goto L_0x008a;
    L_0x00aa:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x00ac:
        if (r1 == 0) goto L_0x00d1;
    L_0x00ae:
        r0 = r8.cipher;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r2 = 1;
        r0.init(r2, r1);	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r0 = 16;
        r0 = new byte[r0];	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r8.H = r0;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r0 = r8.cipher;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r1 = r8.H;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r2 = 0;
        r5 = r8.H;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r6 = 0;
        r0.processBlock(r1, r2, r5, r6);	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r0 = r8.multiplier;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r1 = r8.H;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r0.init(r1);	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r0 = 0;
        r8.exp = r0;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        if (r4 == 0) goto L_0x00e5;
    L_0x00d1:
        r0 = r8.H;	 Catch:{ IllegalArgumentException -> 0x00e1 }
        if (r0 != 0) goto L_0x00e5;
    L_0x00d5:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r2 = 8;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x00e1 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e1 }
    L_0x00e1:
        r0 = move-exception;
        throw r0;
    L_0x00e3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e1 }
    L_0x00e5:
        r0 = 16;
        r0 = new byte[r0];	 Catch:{ IllegalArgumentException -> 0x0164 }
        r8.J0 = r0;	 Catch:{ IllegalArgumentException -> 0x0164 }
        r0 = r8.nonce;	 Catch:{ IllegalArgumentException -> 0x0164 }
        r0 = r0.length;	 Catch:{ IllegalArgumentException -> 0x0164 }
        r1 = 12;
        if (r0 != r1) goto L_0x0107;
    L_0x00f2:
        r0 = r8.nonce;	 Catch:{ IllegalArgumentException -> 0x0164 }
        r1 = 0;
        r2 = r8.J0;	 Catch:{ IllegalArgumentException -> 0x0164 }
        r5 = 0;
        r6 = r8.nonce;	 Catch:{ IllegalArgumentException -> 0x0164 }
        r6 = r6.length;	 Catch:{ IllegalArgumentException -> 0x0164 }
        java.lang.System.arraycopy(r0, r1, r2, r5, r6);	 Catch:{ IllegalArgumentException -> 0x0164 }
        r0 = r8.J0;	 Catch:{ IllegalArgumentException -> 0x0164 }
        r1 = 15;
        r2 = 1;
        r0[r1] = r2;	 Catch:{ IllegalArgumentException -> 0x0164 }
        if (r4 == 0) goto L_0x0124;
    L_0x0107:
        r0 = r8.J0;
        r1 = r8.nonce;
        r2 = r8.nonce;
        r2 = r2.length;
        r8.gHASH(r0, r1, r2);
        r0 = new byte[r3];
        r1 = r8.nonce;
        r1 = r1.length;
        r2 = (long) r1;
        r4 = 8;
        r2 = r2 * r4;
        r1 = 8;
        org.spongycastle.util.Pack.longToBigEndian(r2, r0, r1);
        r1 = r8.J0;
        r8.gHASHBlock(r1, r0);
    L_0x0124:
        r0 = 16;
        r0 = new byte[r0];	 Catch:{ IllegalArgumentException -> 0x0166 }
        r8.S = r0;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r0 = 16;
        r0 = new byte[r0];	 Catch:{ IllegalArgumentException -> 0x0166 }
        r8.S_at = r0;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r0 = 16;
        r0 = new byte[r0];	 Catch:{ IllegalArgumentException -> 0x0166 }
        r8.S_atPre = r0;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r0 = 16;
        r0 = new byte[r0];	 Catch:{ IllegalArgumentException -> 0x0166 }
        r8.atBlock = r0;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r0 = 0;
        r8.atBlockPos = r0;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r0 = 0;
        r8.atLength = r0;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r0 = 0;
        r8.atLengthPre = r0;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r0 = r8.J0;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r0 = org.spongycastle.util.Arrays.clone(r0);	 Catch:{ IllegalArgumentException -> 0x0166 }
        r8.counter = r0;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r0 = 0;
        r8.bufOff = r0;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r0 = 0;
        r8.totalLength = r0;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r0 = r8.initialAssociatedText;	 Catch:{ IllegalArgumentException -> 0x0166 }
        if (r0 == 0) goto L_0x0163;
    L_0x015a:
        r0 = r8.initialAssociatedText;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r1 = 0;
        r2 = r8.initialAssociatedText;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r2 = r2.length;	 Catch:{ IllegalArgumentException -> 0x0166 }
        r8.processAADBytes(r0, r1, r2);	 Catch:{ IllegalArgumentException -> 0x0166 }
    L_0x0163:
        return;
    L_0x0164:
        r0 = move-exception;
        throw r0;
    L_0x0166:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.modes.GCMBlockCipher.init(boolean, org.spongycastle.crypto.CipherParameters):void");
    }

    private static void xor(byte[] bArr, byte[] bArr2) {
        int i = SICBlockCipher.a;
        int i2 = 15;
        while (i2 >= 0) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            i2--;
            if (i != 0) {
                return;
            }
        }
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doFinal(byte[] r11, int r12) {
        /*
        r10_this = this;
        r6 = org.spongycastle.crypto.modes.SICBlockCipher.a;
        r0 = r10.totalLength;	 Catch:{ IllegalArgumentException -> 0x0024 }
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x000d;
    L_0x000a:
        r10.initCipher();	 Catch:{ IllegalArgumentException -> 0x0024 }
    L_0x000d:
        r3 = r10.bufOff;
        r0 = r10.forEncryption;	 Catch:{ IllegalArgumentException -> 0x0026 }
        if (r0 != 0) goto L_0x002b;
    L_0x0013:
        r0 = r10.macSize;	 Catch:{ IllegalArgumentException -> 0x0022 }
        if (r3 >= r0) goto L_0x0028;
    L_0x0017:
        r0 = new org.spongycastle.crypto.InvalidCipherTextException;	 Catch:{ IllegalArgumentException -> 0x0022 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0022 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0022 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0022 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0022 }
    L_0x0028:
        r0 = r10.macSize;
        r3 = r3 - r0;
    L_0x002b:
        if (r3 <= 0) goto L_0x0048;
    L_0x002d:
        r0 = r11.length;	 Catch:{ IllegalArgumentException -> 0x003d }
        r1 = r12 + r3;
        if (r0 >= r1) goto L_0x003f;
    L_0x0032:
        r0 = new org.spongycastle.crypto.OutputLengthException;	 Catch:{ IllegalArgumentException -> 0x003d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x003d }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x003d }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x003d }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r1 = r10.bufBlock;
        r2 = 0;
        r0 = r10;
        r4 = r11;
        r5 = r12;
        r0.gCTRPartial(r1, r2, r3, r4, r5);
    L_0x0048:
        r0 = r10.atLength;	 Catch:{ IllegalArgumentException -> 0x00fc }
        r2 = r10.atBlockPos;	 Catch:{ IllegalArgumentException -> 0x00fc }
        r4 = (long) r2;	 Catch:{ IllegalArgumentException -> 0x00fc }
        r0 = r0 + r4;
        r10.atLength = r0;	 Catch:{ IllegalArgumentException -> 0x00fc }
        r0 = r10.atLength;	 Catch:{ IllegalArgumentException -> 0x00fc }
        r4 = r10.atLengthPre;	 Catch:{ IllegalArgumentException -> 0x00fc }
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x00a6;
    L_0x0058:
        r0 = r10.atBlockPos;	 Catch:{ IllegalArgumentException -> 0x00fe }
        if (r0 <= 0) goto L_0x0066;
    L_0x005c:
        r0 = r10.S_at;	 Catch:{ IllegalArgumentException -> 0x00fe }
        r1 = r10.atBlock;	 Catch:{ IllegalArgumentException -> 0x00fe }
        r2 = 0;
        r4 = r10.atBlockPos;	 Catch:{ IllegalArgumentException -> 0x00fe }
        r10.gHASHPartial(r0, r1, r2, r4);	 Catch:{ IllegalArgumentException -> 0x00fe }
    L_0x0066:
        r0 = r10.atLengthPre;	 Catch:{ IllegalArgumentException -> 0x0100 }
        r4 = 0;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x0075;
    L_0x006e:
        r0 = r10.S_at;	 Catch:{ IllegalArgumentException -> 0x0100 }
        r1 = r10.S_atPre;	 Catch:{ IllegalArgumentException -> 0x0100 }
        xor(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0100 }
    L_0x0075:
        r0 = r10.totalLength;
        r4 = 8;
        r0 = r0 * r4;
        r4 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r0 = r0 + r4;
        r2 = 7;
        r0 = r0 >>> r2;
        r2 = 16;
        r2 = new byte[r2];
        r4 = r10.exp;	 Catch:{ IllegalArgumentException -> 0x0102 }
        if (r4 != 0) goto L_0x0095;
    L_0x0087:
        r4 = new org.spongycastle.crypto.modes.gcm.Tables1kGCMExponentiator;	 Catch:{ IllegalArgumentException -> 0x0102 }
        r4.<init>();	 Catch:{ IllegalArgumentException -> 0x0102 }
        r10.exp = r4;	 Catch:{ IllegalArgumentException -> 0x0102 }
        r4 = r10.exp;	 Catch:{ IllegalArgumentException -> 0x0102 }
        r5 = r10.H;	 Catch:{ IllegalArgumentException -> 0x0102 }
        r4.init(r5);	 Catch:{ IllegalArgumentException -> 0x0102 }
    L_0x0095:
        r4 = r10.exp;
        r4.exponentiateX(r0, r2);
        r0 = r10.S_at;
        multiply(r0, r2);
        r0 = r10.S;
        r1 = r10.S_at;
        xor(r0, r1);
    L_0x00a6:
        r0 = 16;
        r0 = new byte[r0];
        r4 = r10.atLength;
        r8 = 8;
        r4 = r4 * r8;
        r1 = 0;
        org.spongycastle.util.Pack.longToBigEndian(r4, r0, r1);
        r4 = r10.totalLength;
        r8 = 8;
        r4 = r4 * r8;
        r1 = 8;
        org.spongycastle.util.Pack.longToBigEndian(r4, r0, r1);
        r1 = r10.S;
        r10.gHASHBlock(r1, r0);
        r0 = 16;
        r0 = new byte[r0];
        r1 = r10.cipher;
        r2 = r10.J0;
        r4 = 0;
        r5 = 0;
        r1.processBlock(r2, r4, r0, r5);
        r1 = r10.S;
        xor(r0, r1);
        r1 = r10.macSize;	 Catch:{ IllegalArgumentException -> 0x0104 }
        r1 = new byte[r1];	 Catch:{ IllegalArgumentException -> 0x0104 }
        r10.macBlock = r1;	 Catch:{ IllegalArgumentException -> 0x0104 }
        r1 = 0;
        r2 = r10.macBlock;	 Catch:{ IllegalArgumentException -> 0x0104 }
        r4 = 0;
        r5 = r10.macSize;	 Catch:{ IllegalArgumentException -> 0x0104 }
        java.lang.System.arraycopy(r0, r1, r2, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0104 }
        r0 = r10.forEncryption;	 Catch:{ IllegalArgumentException -> 0x0104 }
        if (r0 == 0) goto L_0x0146;
    L_0x00e7:
        r0 = r11.length;	 Catch:{ IllegalArgumentException -> 0x00fa }
        r1 = r12 + r3;
        r2 = r10.macSize;	 Catch:{ IllegalArgumentException -> 0x00fa }
        r1 = r1 + r2;
        if (r0 >= r1) goto L_0x0106;
    L_0x00ef:
        r0 = new org.spongycastle.crypto.OutputLengthException;	 Catch:{ IllegalArgumentException -> 0x00fa }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x00fa }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x00fa }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x00fa }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00fa }
    L_0x00fa:
        r0 = move-exception;
        throw r0;
    L_0x00fc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00fe }
    L_0x00fe:
        r0 = move-exception;
        throw r0;
    L_0x0100:
        r0 = move-exception;
        throw r0;
    L_0x0102:
        r0 = move-exception;
        throw r0;
    L_0x0104:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00fa }
    L_0x0106:
        r0 = r10.macBlock;
        r1 = 0;
        r2 = r10.bufOff;
        r2 = r2 + r12;
        r4 = r10.macSize;
        java.lang.System.arraycopy(r0, r1, r11, r2, r4);
        r0 = r10.macSize;
        r0 = r0 + r3;
        if (r6 == 0) goto L_0x0137;
    L_0x0116:
        r1 = r10.macSize;
        r1 = new byte[r1];
        r2 = r10.bufBlock;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r4 = 0;
        r5 = r10.macSize;	 Catch:{ IllegalArgumentException -> 0x0135 }
        java.lang.System.arraycopy(r2, r3, r1, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0135 }
        r2 = r10.macBlock;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r1 = org.spongycastle.util.Arrays.constantTimeAreEqual(r2, r1);	 Catch:{ IllegalArgumentException -> 0x0135 }
        if (r1 != 0) goto L_0x0137;
    L_0x012a:
        r0 = new org.spongycastle.crypto.InvalidCipherTextException;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0135 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0135 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0135 }
    L_0x0135:
        r0 = move-exception;
        throw r0;
    L_0x0137:
        r1 = 0;
        r10.reset(r1);	 Catch:{ IllegalArgumentException -> 0x0144 }
        r1 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;	 Catch:{ IllegalArgumentException -> 0x0144 }
        if (r1 == 0) goto L_0x0143;
    L_0x013f:
        r1 = r6 + 1;
        org.spongycastle.crypto.modes.SICBlockCipher.a = r1;	 Catch:{ IllegalArgumentException -> 0x0144 }
    L_0x0143:
        return r0;
    L_0x0144:
        r0 = move-exception;
        throw r0;
    L_0x0146:
        r0 = r3;
        goto L_0x0116;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.modes.GCMBlockCipher.doFinal(byte[], int):int");
    }
}
