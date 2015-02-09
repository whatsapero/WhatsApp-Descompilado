package org.spongycastle.crypto.digests;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.spongycastle.util.Memoable;
import org.spongycastle.util.MemoableResetException;
import org.spongycastle.util.Pack;
import org.whispersystems.libaxolotl.ay;

public class SHA512tDigest extends LongDigest {
    private static final String[] z;
    private long H1t;
    private long H2t;
    private long H3t;
    private long H4t;
    private long H5t;
    private long H6t;
    private long H7t;
    private long H8t;
    private int digestLength;

    static {
        int i;
        int i2;
        String[] strArr = new String[5];
        char[] toCharArray = "E?0v\u001bU\u001a2}\u000fU>wz\u0006@&'a\u0007Q$>r\u001cDv>}HN\"?v\u001a".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 33;
                    break;
                case ay.f /*1*/:
                    i2 = 86;
                    break;
                case ay.n /*2*/:
                    i2 = 87;
                    break;
                case ay.p /*3*/:
                    i2 = 19;
                    break;
                default:
                    i2 = 104;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "C?#_\rO1#{HB79}\u0007Uv5vH\u001fkw&Y\u0013".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 33;
                    break;
                case ay.f /*1*/:
                    i2 = 86;
                    break;
                case ay.n /*2*/:
                    i2 = 87;
                    break;
                case ay.p /*3*/:
                    i2 = 19;
                    break;
                default:
                    i2 = 104;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "C?#_\rO1#{HO32w\u001b\u0001\"83\nDv63\u0005T:#z\u0018M3w|\u000e\u0001n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 33;
                    break;
                case ay.f /*1*/:
                    i2 = 86;
                    break;
                case ay.n /*2*/:
                    i2 = 87;
                    break;
                case ay.p /*3*/:
                    i2 = 19;
                    break;
                default:
                    i2 = 104;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "C?#_\rO1#{HB79}\u0007Uv5vH\u0012nc3\u001dR3w@ `eo'HH8$g\r@2".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 33;
                    break;
                case ay.f /*1*/:
                    i2 = 86;
                    break;
                case ay.n /*2*/:
                    i2 = 87;
                    break;
                case ay.p /*3*/:
                    i2 = 19;
                    break;
                default:
                    i2 = 104;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "r\u001e\u0016>]\u0010dx".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 33;
                    break;
                case ay.f /*1*/:
                    i2 = 86;
                    break;
                case ay.n /*2*/:
                    i2 = 87;
                    break;
                case ay.p /*3*/:
                    i2 = 19;
                    break;
                default:
                    i2 = 104;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[4] = new String(cArr).intern();
        z = strArr;
    }

    public SHA512tDigest(SHA512tDigest sHA512tDigest) {
        super(sHA512tDigest);
        this.digestLength = sHA512tDigest.digestLength;
        reset(sHA512tDigest);
    }

    public int doFinal(byte[] bArr, int i) {
        finish();
        longToBigEndian(this.H1, bArr, i, this.digestLength);
        longToBigEndian(this.H2, bArr, i + 8, this.digestLength - 8);
        longToBigEndian(this.H3, bArr, i + 16, this.digestLength - 16);
        longToBigEndian(this.H4, bArr, i + 24, this.digestLength - 24);
        longToBigEndian(this.H5, bArr, i + 32, this.digestLength - 32);
        longToBigEndian(this.H6, bArr, i + 40, this.digestLength - 40);
        longToBigEndian(this.H7, bArr, i + 48, this.digestLength - 48);
        longToBigEndian(this.H8, bArr, i + 56, this.digestLength - 56);
        reset();
        return this.digestLength;
    }

    public SHA512tDigest(int i) {
        if (i >= 512) {
            throw new IllegalArgumentException(z[1]);
        }
        try {
            if (i % 8 != 0) {
                throw new IllegalArgumentException(z[2]);
            } else if (i == 384) {
                try {
                    throw new IllegalArgumentException(z[3]);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } else {
                this.digestLength = i / 8;
                tIvGenerate(this.digestLength * 8);
                reset();
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void reset(Memoable memoable) {
        SHA512tDigest sHA512tDigest = (SHA512tDigest) memoable;
        try {
            if (this.digestLength != sHA512tDigest.digestLength) {
                throw new MemoableResetException(z[0]);
            }
            super.copyIn(sHA512tDigest);
            this.H1t = sHA512tDigest.H1t;
            this.H2t = sHA512tDigest.H2t;
            this.H3t = sHA512tDigest.H3t;
            this.H4t = sHA512tDigest.H4t;
            this.H5t = sHA512tDigest.H5t;
            this.H6t = sHA512tDigest.H6t;
            this.H7t = sHA512tDigest.H7t;
            this.H8t = sHA512tDigest.H8t;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public Memoable copy() {
        return new SHA512tDigest(this);
    }

    private void tIvGenerate(int r5) {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIncludingExcHandlers(DepthRegionTraversal.java:36)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:53)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r4_this = this;
        r1 = org.spongycastle.crypto.digests.GeneralDigest.a;
        r2 = -3482333909917012819; // 0xcfac43c256196cad float:4.2173009E13 double:-6.392239886847908E75;
        r4.H1 = r2;
        r2 = 2216346199247487646; // 0x1ec20b20216f029e float:8.0979814E-19 double:1.604250256667292E-160;
        r4.H2 = r2;
        r2 = -7364697282686394994; // 0x99cb56d75b315d8e float:4.9923935E16 double:-2.0106609494103695E-184;
        r4.H3 = r2;
        r2 = 65953792586715988; // 0xea509ffab89354 float:-4.791854E35 double:2.9978976005667514E-304;
        r4.H4 = r2;
        r2 = -816286391624063116; // 0xf4abf7da08432774 float:5.8727055E-34 double:-1.0252515228978657E254;
        r4.H5 = r2;
        r2 = 4512832404995164602; // 0x3ea0cd298e9bc9ba float:-3.8404706E-30 double:5.007211971427005E-7;
        r4.H6 = r2;
        r2 = -5033199132376557362; // 0xba267c0e5ee418ce float:8.2180567E18 double:-1.418977391716189E-28;
        r4.H7 = r2;
        r2 = -124578254951840548; // 0xfe4568bcb6db84dc float:-6.5421755E-6 double:-1.7921927020935902E300;
        r4.H8 = r2;
        r0 = 83;
        r4.update(r0);
        r0 = 72;
        r4.update(r0);
        r0 = 65;
        r4.update(r0);
        r0 = 45;
        r4.update(r0);
        r0 = 53;
        r4.update(r0);
        r0 = 49;
        r4.update(r0);
        r0 = 50;
        r4.update(r0);
        r0 = 47;
        r4.update(r0);
        r0 = 100;
        if (r5 <= r0) goto L_0x00c6;
    L_0x0066:
        r0 = r5 / 100;
        r0 = r0 + 48;
        r0 = (byte) r0;
        r4.update(r0);
        r0 = r5 % 100;
        r2 = r0 / 10;
        r2 = r2 + 48;
        r2 = (byte) r2;
        r4.update(r2);
        r0 = r0 % 10;
        r2 = r0 + 48;
        r2 = (byte) r2;
        r4.update(r2);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r1 == 0) goto L_0x009e;
    L_0x0082:
        r2 = 10;
        if (r0 <= r2) goto L_0x0098;
    L_0x0086:
        r2 = r0 / 10;
        r2 = r2 + 48;
        r2 = (byte) r2;
        r4.update(r2);
        r0 = r0 % 10;
        r2 = r0 + 48;
        r2 = (byte) r2;
        r4.update(r2);	 Catch:{ IllegalArgumentException -> 0x00c4 }
        if (r1 == 0) goto L_0x009e;	 Catch:{ IllegalArgumentException -> 0x00c4 }
    L_0x0098:
        r0 = r0 + 48;	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r0 = (byte) r0;	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r4.update(r0);	 Catch:{ IllegalArgumentException -> 0x00c4 }
    L_0x009e:
        r4.finish();
        r0 = r4.H1;
        r4.H1t = r0;
        r0 = r4.H2;
        r4.H2t = r0;
        r0 = r4.H3;
        r4.H3t = r0;
        r0 = r4.H4;
        r4.H4t = r0;
        r0 = r4.H5;
        r4.H5t = r0;
        r0 = r4.H6;
        r4.H6t = r0;
        r0 = r4.H7;
        r4.H7t = r0;
        r0 = r4.H8;
        r4.H8t = r0;
        return;
    L_0x00c2:
        r0 = move-exception;
        throw r0;
    L_0x00c4:
        r0 = move-exception;
        throw r0;
    L_0x00c6:
        r0 = r5;
        goto L_0x0082;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.digests.SHA512tDigest.tIvGenerate(int):void");
    }

    public int getDigestSize() {
        return this.digestLength;
    }

    private static void intToBigEndian(int i, byte[] bArr, int i2, int i3) {
        boolean z = GeneralDigest.a;
        int min = Math.min(4, i3);
        do {
            min--;
            if (min >= 0) {
                bArr[i2 + min] = (byte) (i >>> ((3 - min) * 8));
            } else {
                return;
            }
        } while (!z);
    }

    public void reset() {
        super.reset();
        this.H1 = this.H1t;
        this.H2 = this.H2t;
        this.H3 = this.H3t;
        this.H4 = this.H4t;
        this.H5 = this.H5t;
        this.H6 = this.H6t;
        this.H7 = this.H7t;
        this.H8 = this.H8t;
    }

    public SHA512tDigest(byte[] bArr) {
        this(readDigestLength(bArr));
        restoreState(bArr);
    }

    public String getAlgorithmName() {
        return z[4] + Integer.toString(this.digestLength * 8);
    }

    private static void longToBigEndian(long j, byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            try {
                intToBigEndian((int) (j >>> 32), bArr, i, i2);
                if (i2 > 4) {
                    intToBigEndian((int) (4294967295L & j), bArr, i + 4, i2 - 4);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    private static int readDigestLength(byte[] bArr) {
        return Pack.bigEndianToInt(bArr, bArr.length - 4);
    }

    public byte[] getEncodedState() {
        int encodedStateSize = getEncodedStateSize();
        byte[] bArr = new byte[(encodedStateSize + 4)];
        populateState(bArr);
        Pack.intToBigEndian(this.digestLength * 8, bArr, encodedStateSize);
        return bArr;
    }
}
