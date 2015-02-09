package org.spongycastle.crypto.macs;

import java.util.Hashtable;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.spongycastle.util.Memoable;
import org.whispersystems.libaxolotl.ay;

public class HMac implements Mac {
    private static final byte IPAD = (byte) 54;
    private static final byte OPAD = (byte) 92;
    public static int a;
    private static Hashtable blockLengths;
    private static final String[] z;
    private int blockLength;
    private Digest digest;
    private int digestSize;
    private byte[] inputPad;
    private Memoable ipadState;
    private Memoable opadState;
    private byte[] outputBuf;

    private static void xorPad(byte[] bArr, int i, byte b) {
        int i2 = a;
        int i3 = 0;
        while (i3 < i) {
            bArr[i3] = (byte) (bArr[i3] ^ b);
            i3++;
            if (i2 != 0) {
                return;
            }
        }
    }

    public int getMacSize() {
        return this.digestSize;
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[2];
        char[] toCharArray = "n$ \u001cOl$k\u0016I|/8\u0006\u0000k+8\u0001E\u007fpk".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 27;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 75;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "4\u0002\u00063c".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 27;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 75;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
        blockLengths = new Hashtable();
        Hashtable hashtable = blockLengths;
        toCharArray = "\\\u0005\u0018&\u0013/{z".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 27;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 75;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(32));
        hashtable = blockLengths;
        toCharArray = "V\u000ey".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 27;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 75;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(16));
        hashtable = blockLengths;
        toCharArray = "V\u000e\u007f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 27;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 75;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(64));
        hashtable = blockLengths;
        toCharArray = "V\u000e~".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 27;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 75;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(64));
        hashtable = blockLengths;
        toCharArray = "I\u0003\u001b7m_{yJ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 27;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 75;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(64));
        hashtable = blockLengths;
        toCharArray = "I\u0003\u001b7m_{}B".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 27;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 75;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(64));
        hashtable = blockLengths;
        toCharArray = "H\u0002\n_\u0011".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 27;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 75;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(64));
        hashtable = blockLengths;
        toCharArray = "H\u0002\n_\u0012)~".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 27;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 75;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(64));
        hashtable = blockLengths;
        toCharArray = "H\u0002\n_\u0012.|".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 27;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 75;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(64));
        hashtable = blockLengths;
        toCharArray = "H\u0002\n_\u0013#~".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 27;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 75;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(128));
        hashtable = blockLengths;
        toCharArray = "H\u0002\n_\u0015*x".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 27;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 75;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(128));
        hashtable = blockLengths;
        toCharArray = "O#,\u0017R".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 27;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 75;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        hashtable.put(new String(cArr).intern(), Integer.valueOf(64));
        Hashtable hashtable2 = blockLengths;
        toCharArray = "L\"\"\u0000Lk%$\u001e".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            char c3 = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 27;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 75;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[length] = (char) (i2 ^ c3);
        }
        hashtable2.put(new String(cArr).intern(), Integer.valueOf(64));
    }

    public HMac(Digest digest) {
        this(digest, getByteLength(digest));
    }

    public void update(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }

    public String getAlgorithmName() {
        return this.digest.getAlgorithmName() + z[1];
    }

    private static int getByteLength(Digest digest) {
        try {
            if (digest instanceof ExtendedDigest) {
                return ((ExtendedDigest) digest).getByteLength();
            }
            Integer num = (Integer) blockLengths.get(digest.getAlgorithmName());
            if (num != null) {
                return num.intValue();
            }
            try {
                throw new IllegalArgumentException(z[0] + digest.getAlgorithmName());
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doFinal(byte[] r7, int r8) {
        /*
        r6_this = this;
        r5 = 0;
        r1 = a;
        r0 = r6.digest;	 Catch:{ IllegalArgumentException -> 0x006d }
        r2 = r6.outputBuf;	 Catch:{ IllegalArgumentException -> 0x006d }
        r3 = r6.blockLength;	 Catch:{ IllegalArgumentException -> 0x006d }
        r0.doFinal(r2, r3);	 Catch:{ IllegalArgumentException -> 0x006d }
        r0 = r6.opadState;	 Catch:{ IllegalArgumentException -> 0x006d }
        if (r0 == 0) goto L_0x002a;
    L_0x0010:
        r0 = r6.digest;	 Catch:{ IllegalArgumentException -> 0x006f }
        r0 = (org.spongycastle.util.Memoable) r0;	 Catch:{ IllegalArgumentException -> 0x006f }
        r2 = r6.opadState;	 Catch:{ IllegalArgumentException -> 0x006f }
        r0.reset(r2);	 Catch:{ IllegalArgumentException -> 0x006f }
        r0 = r6.digest;	 Catch:{ IllegalArgumentException -> 0x006f }
        r2 = r6.outputBuf;	 Catch:{ IllegalArgumentException -> 0x006f }
        r3 = r6.blockLength;	 Catch:{ IllegalArgumentException -> 0x006f }
        r4 = r6.digest;	 Catch:{ IllegalArgumentException -> 0x006f }
        r4 = r4.getDigestSize();	 Catch:{ IllegalArgumentException -> 0x006f }
        r0.update(r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x006f }
        if (r1 == 0) goto L_0x0035;
    L_0x002a:
        r0 = r6.digest;	 Catch:{ IllegalArgumentException -> 0x006f }
        r2 = r6.outputBuf;	 Catch:{ IllegalArgumentException -> 0x006f }
        r3 = 0;
        r4 = r6.outputBuf;	 Catch:{ IllegalArgumentException -> 0x006f }
        r4 = r4.length;	 Catch:{ IllegalArgumentException -> 0x006f }
        r0.update(r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x0035:
        r0 = r6.digest;
        r2 = r0.doFinal(r7, r8);
        r0 = r6.blockLength;
    L_0x003d:
        r3 = r6.outputBuf;
        r3 = r3.length;
        if (r0 >= r3) goto L_0x004a;
    L_0x0042:
        r3 = r6.outputBuf;
        r3[r0] = r5;
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x003d;
    L_0x004a:
        r0 = r6.ipadState;	 Catch:{ IllegalArgumentException -> 0x0071 }
        if (r0 == 0) goto L_0x0059;
    L_0x004e:
        r0 = r6.digest;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r0 = (org.spongycastle.util.Memoable) r0;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r3 = r6.ipadState;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r0.reset(r3);	 Catch:{ IllegalArgumentException -> 0x0073 }
        if (r1 == 0) goto L_0x0064;
    L_0x0059:
        r0 = r6.digest;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r3 = r6.inputPad;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r4 = 0;
        r5 = r6.inputPad;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r5 = r5.length;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r0.update(r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0064:
        r0 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r0 == 0) goto L_0x006c;
    L_0x0068:
        r0 = r1 + 1;
        a = r0;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x006c:
        return r2;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;
    L_0x0075:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.macs.HMac.doFinal(byte[], int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(org.spongycastle.crypto.CipherParameters r6) {
        /*
        r5_this = this;
        r1 = 0;
        r3 = a;
        r0 = r5.digest;
        r0.reset();
        r6 = (org.spongycastle.crypto.params.KeyParameter) r6;
        r4 = r6.getKey();
        r0 = r4.length;
        r2 = r5.blockLength;
        if (r0 <= r2) goto L_0x002b;
    L_0x0013:
        r2 = r5.digest;
        r2.update(r4, r1, r0);
        r0 = r5.digest;
        r2 = r5.inputPad;
        r0.doFinal(r2, r1);
        r2 = r5.digestSize;
        if (r3 == 0) goto L_0x0031;
    L_0x0023:
        r0 = org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a;	 Catch:{ IllegalArgumentException -> 0x0093 }
        if (r0 == 0) goto L_0x0095;
    L_0x0027:
        r0 = r1;
    L_0x0028:
        org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator.a = r0;
        r0 = r2;
    L_0x002b:
        r2 = r5.inputPad;
        java.lang.System.arraycopy(r4, r1, r2, r1, r0);
        r2 = r0;
    L_0x0031:
        r0 = r5.inputPad;
        r0 = r0.length;
        if (r2 >= r0) goto L_0x003e;
    L_0x0036:
        r0 = r5.inputPad;
        r0[r2] = r1;
        r2 = r2 + 1;
        if (r3 == 0) goto L_0x0031;
    L_0x003e:
        r0 = r5.inputPad;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r1 = 0;
        r2 = r5.outputBuf;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r3 = 0;
        r4 = r5.blockLength;	 Catch:{ IllegalArgumentException -> 0x0097 }
        java.lang.System.arraycopy(r0, r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = r5.inputPad;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r1 = r5.blockLength;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r2 = 54;
        xorPad(r0, r1, r2);	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = r5.outputBuf;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r1 = r5.blockLength;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r2 = 92;
        xorPad(r0, r1, r2);	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = r5.digest;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = r0 instanceof org.spongycastle.util.Memoable;	 Catch:{ IllegalArgumentException -> 0x0097 }
        if (r0 == 0) goto L_0x0077;
    L_0x0061:
        r0 = r5.digest;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = (org.spongycastle.util.Memoable) r0;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = r0.copy();	 Catch:{ IllegalArgumentException -> 0x0097 }
        r5.opadState = r0;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = r5.opadState;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = (org.spongycastle.crypto.Digest) r0;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r1 = r5.outputBuf;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r2 = 0;
        r3 = r5.blockLength;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0.update(r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0097 }
    L_0x0077:
        r0 = r5.digest;	 Catch:{ IllegalArgumentException -> 0x0099 }
        r1 = r5.inputPad;	 Catch:{ IllegalArgumentException -> 0x0099 }
        r2 = 0;
        r3 = r5.inputPad;	 Catch:{ IllegalArgumentException -> 0x0099 }
        r3 = r3.length;	 Catch:{ IllegalArgumentException -> 0x0099 }
        r0.update(r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0099 }
        r0 = r5.digest;	 Catch:{ IllegalArgumentException -> 0x0099 }
        r0 = r0 instanceof org.spongycastle.util.Memoable;	 Catch:{ IllegalArgumentException -> 0x0099 }
        if (r0 == 0) goto L_0x0092;
    L_0x0088:
        r0 = r5.digest;	 Catch:{ IllegalArgumentException -> 0x0099 }
        r0 = (org.spongycastle.util.Memoable) r0;	 Catch:{ IllegalArgumentException -> 0x0099 }
        r0 = r0.copy();	 Catch:{ IllegalArgumentException -> 0x0099 }
        r5.ipadState = r0;	 Catch:{ IllegalArgumentException -> 0x0099 }
    L_0x0092:
        return;
    L_0x0093:
        r0 = move-exception;
        throw r0;
    L_0x0095:
        r0 = 1;
        goto L_0x0028;
    L_0x0097:
        r0 = move-exception;
        throw r0;
    L_0x0099:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.macs.HMac.init(org.spongycastle.crypto.CipherParameters):void");
    }

    public void update(byte b) {
        this.digest.update(b);
    }

    public void reset() {
        this.digest.reset();
        this.digest.update(this.inputPad, 0, this.inputPad.length);
    }

    public Digest getUnderlyingDigest() {
        return this.digest;
    }

    private HMac(Digest digest, int i) {
        this.digest = digest;
        this.digestSize = digest.getDigestSize();
        this.blockLength = i;
        this.inputPad = new byte[this.blockLength];
        this.outputBuf = new byte[(this.blockLength + this.digestSize)];
    }
}
