package com.whatsapp;

import android.backport.util.Base64;
import java.util.Arrays;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class fz {
    private static final byte[] a;
    public static boolean e;
    private static final String[] z;
    private int b;
    private final byte[] c;
    private boolean d;

    public static com.whatsapp.fz a(android.content.Context r9, java.lang.String r10) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Block not found by B:100:0x00d7, in BRI start: (B:28:?, B:67:?), list: [(B:28:?, B:67:?)], outs: [(B:29:0x0069, B:68:0x00d7)], regMap: {}, split: 0, method: com.whatsapp.fz.a(android.content.Context, java.lang.String):com.whatsapp.fz
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.applyRemove(BlockFinallyExtract.java:380)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.extractFinally(BlockFinallyExtract.java:176)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.processExceptionHandler(BlockFinallyExtract.java:88)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.visit(BlockFinallyExtract.java:54)
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
        r8 = 3;
        r1 = 0;
        r0 = 0;
        r4 = e;
        r2 = com.whatsapp.App.G;	 Catch:{ IOException -> 0x0013 }
        if (r2 != r8) goto L_0x0015;	 Catch:{ IOException -> 0x0013 }
    L_0x0009:
        r0 = new com.whatsapp.fz;	 Catch:{ IOException -> 0x0013 }
        r1 = 20;	 Catch:{ IOException -> 0x0013 }
        r1 = new byte[r1];	 Catch:{ IOException -> 0x0013 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0013 }
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r5 = new java.io.ByteArrayOutputStream;
        r5.<init>();
        r2 = r9.getPackageName();
        if (r2 == 0) goto L_0x0012;
    L_0x0020:
        r3 = z;	 Catch:{ IOException -> 0x00bf, IOException -> 0x00c1 }
        r6 = 5;	 Catch:{ IOException -> 0x00bf, IOException -> 0x00c1 }
        r3 = r3[r6];	 Catch:{ IOException -> 0x00bf, IOException -> 0x00c1 }
        r3 = r3.equals(r2);	 Catch:{ IOException -> 0x00bf, IOException -> 0x00c1 }
        if (r3 == 0) goto L_0x0012;
    L_0x002b:
        r3 = z;	 Catch:{ IOException -> 0x00c3 }
        r6 = 3;	 Catch:{ IOException -> 0x00c3 }
        r3 = r3[r6];	 Catch:{ IOException -> 0x00c3 }
        r2 = r2.getBytes(r3);	 Catch:{ IOException -> 0x00c3 }
        r5.write(r2);	 Catch:{ IOException -> 0x00c3 }
        r2 = com.whatsapp.fz.class;
        r3 = z;
        r3 = r3[r1];
        r2 = r2.getResourceAsStream(r3);
        if (r2 != 0) goto L_0x00fb;
    L_0x0043:
        r2 = com.whatsapp.fz.class;
        r3 = z;
        r6 = 4;
        r3 = r3[r6];
        r2 = r2.getResourceAsStream(r3);
        r3 = r2;
    L_0x004f:
        if (r3 == 0) goto L_0x0012;
    L_0x0051:
        r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r6 = new byte[r2];
        r2 = r3.read(r6);	 Catch:{ IOException -> 0x00ca, all -> 0x00d3 }
    L_0x0059:
        r7 = -1;	 Catch:{ IOException -> 0x00ca, all -> 0x00d3 }
        if (r2 == r7) goto L_0x0066;	 Catch:{ IOException -> 0x00ca, all -> 0x00d3 }
    L_0x005c:
        r7 = 0;	 Catch:{ IOException -> 0x00ca, all -> 0x00d3 }
        r5.write(r6, r7, r2);	 Catch:{ IOException -> 0x00ca, all -> 0x00d3 }
        r2 = r3.read(r6);	 Catch:{ IOException -> 0x00ca, all -> 0x00d3 }
        if (r4 == 0) goto L_0x0059;
    L_0x0066:
        r3.close();	 Catch:{ IOException -> 0x00f6 }
    L_0x0069:
        r2 = r5.toByteArray();
        r3 = a;
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r6 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r2 = com.whatsapp.a54.a(r2, r3, r5, r6);
        r3 = z;	 Catch:{ NoSuchAlgorithmException -> 0x00d8 }
        r5 = 1;	 Catch:{ NoSuchAlgorithmException -> 0x00d8 }
        r3 = r3[r5];	 Catch:{ NoSuchAlgorithmException -> 0x00d8 }
        r3 = javax.crypto.Mac.getInstance(r3);	 Catch:{ NoSuchAlgorithmException -> 0x00d8 }
        r3.init(r2);	 Catch:{ InvalidKeyException -> 0x00df }
        r2 = com.whatsapp.util.b9.a(r9);
        if (r2 == 0) goto L_0x0012;
    L_0x0089:
        r5 = r2.length;	 Catch:{ IOException -> 0x00e6, IOException -> 0x00e8 }
        if (r5 == 0) goto L_0x0012;
    L_0x008c:
        r5 = r2.length;
        r0 = r1;
    L_0x008e:
        if (r0 >= r5) goto L_0x009d;
    L_0x0090:
        r1 = r2[r0];
        r1 = r1.toByteArray();
        r3.update(r1);
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x008e;
    L_0x009d:
        r0 = com.whatsapp.App.aa;
        if (r8 != r0) goto L_0x00ea;
    L_0x00a1:
        r0 = 16;
        r0 = new byte[r0];
    L_0x00a5:
        r3.update(r0);
        r0 = z;	 Catch:{ UnsupportedEncodingException -> 0x00ef }
        r1 = 2;	 Catch:{ UnsupportedEncodingException -> 0x00ef }
        r0 = r0[r1];	 Catch:{ UnsupportedEncodingException -> 0x00ef }
        r0 = r10.getBytes(r0);	 Catch:{ UnsupportedEncodingException -> 0x00ef }
        r3.update(r0);
        r0 = new com.whatsapp.fz;
        r1 = r3.doFinal();
        r0.<init>(r1);
        goto L_0x0012;
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00bf, IOException -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        throw r0;
    L_0x00c3:
        r0 = move-exception;
        r1 = new java.lang.Error;
        r1.<init>(r0);
        throw r1;
    L_0x00ca:
        r1 = move-exception;
        r3.close();	 Catch:{ IOException -> 0x00d0 }
        goto L_0x0012;
    L_0x00d0:
        r1 = move-exception;
        goto L_0x0012;
    L_0x00d3:
        r0 = move-exception;
        r3.close();	 Catch:{ IOException -> 0x00f9 }
    L_0x00d7:
        throw r0;
    L_0x00d8:
        r0 = move-exception;
        r1 = new java.lang.AssertionError;
        r1.<init>(r0);
        throw r1;
    L_0x00df:
        r0 = move-exception;
        r1 = new java.lang.AssertionError;
        r1.<init>(r0);
        throw r1;
    L_0x00e6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e6, IOException -> 0x00e8 }
    L_0x00e8:
        r0 = move-exception;
        throw r0;
    L_0x00ea:
        r0 = com.whatsapp.a54.a(r9);
        goto L_0x00a5;
    L_0x00ef:
        r0 = move-exception;
        r1 = new java.lang.Error;
        r1.<init>(r0);
        throw r1;
    L_0x00f6:
        r2 = move-exception;
        goto L_0x0069;
    L_0x00f9:
        r1 = move-exception;
        goto L_0x00d7;
    L_0x00fb:
        r3 = r2;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fz.a(android.content.Context, java.lang.String):com.whatsapp.fz");
    }

    public int hashCode() {
        if (this.d) {
            return this.b;
        }
        this.b = Arrays.hashCode(this.c);
        this.d = true;
        return this.b;
    }

    private fz(byte[] bArr) {
        this.c = bArr;
    }

    static {
        String[] strArr = new String[6];
        String str = "WLyA@\u001cL}E\u000e\u001aRy\u001f\u0007\u001cNu\u001d\u000e\u001aQiF0\u0014Q{]A\bP{";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 120;
                        break;
                    case ay.f /*1*/:
                        i4 = 62;
                        break;
                    case ay.n /*2*/:
                        i4 = 28;
                        break;
                    case ay.p /*3*/:
                        i4 = 50;
                        break;
                    default:
                        i4 = 111;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "-jZ\u001fW";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "-jZ\u001fW";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "WLyA@\u001cL}E\u000e\u001aRy\u001f\u0007\u001cNu\u001f\u0019L\u0011}P\u0000\rJC^\u0000\u001fQ2B\u0001\u001f";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u001bQq\u001c\u0018\u0010_hA\u000e\bN";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    char[] toCharArray2 = "(UHE$+dmg\t9ke`_\nnM\n\u0007!t,E!\u000boM\u0001\u000b/\u000f7\u0001<;Pef71XYs\u0017\u0000m+\u0007)\u000fUXT[OIRD@\u001b\u0006lb\\\b\u000e[j$*\bS}>\u0015Vew=\u000fF+\u0006\t\u000f\u000fNk<-\u000f,{[\n\u000f{K-.z~`%L\u000el[\u000b\u0012s(\u0003(Iw-]!".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (int i5 = 0; length2 > i5; i5++) {
                        char c2 = cArr2[i5];
                        switch (i5 % 5) {
                            case PBE.MD5 /*0*/:
                                i = 120;
                                break;
                            case ay.f /*1*/:
                                i = 62;
                                break;
                            case ay.n /*2*/:
                                i = 28;
                                break;
                            case ay.p /*3*/:
                                i = 50;
                                break;
                            default:
                                i = 111;
                                break;
                        }
                        cArr2[i5] = (char) (i ^ c2);
                    }
                    a = Base64.decode(new String(cArr2).intern(), 0);
                default:
                    strArr2[i2] = str;
                    str = "0s]q<0\u007f-";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public boolean equals(Object obj) {
        boolean z = false;
        boolean z2 = e;
        boolean z3 = this == obj || (obj != null && getClass().equals(obj.getClass()) && Arrays.equals(this.c, ((fz) obj).c));
        if (z2) {
            if (!DialogToastActivity.i) {
                z = true;
            }
            DialogToastActivity.i = z;
        }
        return z3;
    }

    public String toString() {
        return Base64.encodeToString(this.c, 2);
    }
}
