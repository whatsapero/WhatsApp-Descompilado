package org.whispersystems.libaxolotl;

import com.google.M;
import com.google.cn;
import com.google.er;

public final class aI {
    private static er a;
    private static er b;
    private static er c;
    public static int d;
    private static M e;
    private static er f;
    private static cn g;
    private static M h;
    private static M i;
    private static er j;
    private static M k;
    private static M l;

    static er b() {
        return f;
    }

    static er c() {
        return c;
    }

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
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
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "RtT.S+\u001df4n=\u0015w\u0016H7\u0019l%U4Cs4U,\u0002\u0011LN=\u0015w5_;\u0018q#\u0018:g\r\u0011R1\u001es#H\u0015\bp5[?\b\u0011T0R\u001fb2Y0\bw\r_!u\u0002f;pa\u0011I0_\u000el3T,\bq^8xl+K(Og\f6H=\u001bj)O+.l3T,\bq^9xl+K(Jg\t%S(\u0005f4N=\u0015w^>xl+J\u0018\u00d7l\tRj*\bH#C\u000f\u0005j5J=\u001fN#I+\fd#(Ng\r4_?\u0004p2H9\u0019j)T\u0011\t\u001bC\u001aYE\u000eT*Res4_\u0013\bz\u000f^@l#G\u0012U\u007f\u0015L4+\u0004d(_<=q#q=\u0014J\"\"^M\u0002n7Jb\tAX9\u001ef\r_!u\u0001f;pa\u0011U0S\u0004g#T,\u0004w?q=\u0014\u001bE\u001aYE\u000fT5Rjn#I+\fd#\"\\M\u0002n6z\u0019\tTq=\u0014F>Y0\fm!_\u0015\bp5[?\b\u0011L0Z\u0004g^;xl+K(Wg\u0004$[+\bH#C@o#G\u0012T\u007f\u0011L0*\fw%R=\u0019H#C@n#G\u0012T\u007f\u0010L11\tf(N1\u0019z\r_!u\u0007f;pa\u0011^0H\u000fb5_\u0013\bz\u0015S?\u0003b2O*\b\u001bC\u001a";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000a:
        r2 = r2.toCharArray();
        r6 = r2.length;
        r7 = r6;
        r8 = r1;
        r6 = r2;
    L_0x0012:
        if (r7 > r8) goto L_0x002a;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x0046;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = "YE\u000fd\u007fR}P#T<\bq\r_! f5I9\nfT0Roj\"\"YM\u0002n7J|\tOS,\bq'N1\u0002m^8xl+K(Jg\t%S(\u0005f4N=\u0015w^9xl+J\u0018;g\u001f\u0015_6\tf4q=\u0014G/I,\u001fj$O,\u0004l(w=\u001ep']=\u007f\tL81\t\u001bG\u001aYE\u000eT+Rdj2_*\fw/U6u\u0001f;p`\u0011V0P\u000ek'S6&f?\"[M\u0002n6J\u007f\tLI1\nm/T?&f?\"\\M\u0002n6\u001aZ\t`U*\n-1R1\u001es#H+\u0014p2_5\u001e-*S:\f{)V7\u0019ohJ*\u0002w)Y7\u0001AKm0\u0004p6_*=q)N7\u001e";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x003b;
            case 1: goto L_0x003e;
            case 2: goto L_0x0041;
            case 3: goto L_0x0043;
            default: goto L_0x0031;
        };
    L_0x0031:
        r2 = 58;
    L_0x0033:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x003b:
        r2 = 88;
        goto L_0x0033;
    L_0x003e:
        r2 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        goto L_0x0033;
    L_0x0041:
        r2 = 3;
        goto L_0x0033;
    L_0x0043:
        r2 = 70;
        goto L_0x0033;
    L_0x0046:
        r4[r3] = r2;
        r0 = new org.whispersystems.libaxolotl.bv;
        r0.<init>();
        r1 = new com.google.cn[r1];
        com.google.cn.a(r5, r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.aI.<clinit>():void");
    }

    static er c(er erVar) {
        b = erVar;
        return erVar;
    }

    static er g() {
        return a;
    }

    static er i() {
        return b;
    }

    public static cn h() {
        return g;
    }

    static er e(er erVar) {
        c = erVar;
        return erVar;
    }

    static M b(M m) {
        h = m;
        return m;
    }

    static cn a(cn cnVar) {
        g = cnVar;
        return cnVar;
    }

    static M f() {
        return k;
    }

    static M e(M m) {
        i = m;
        return m;
    }

    static M a(M m) {
        e = m;
        return m;
    }

    static er d(er erVar) {
        f = erVar;
        return erVar;
    }

    static er b(er erVar) {
        a = erVar;
        return erVar;
    }

    static M a() {
        return h;
    }

    static M e() {
        return l;
    }

    static er j() {
        return j;
    }

    static M d(M m) {
        l = m;
        return m;
    }

    static M d() {
        return e;
    }

    static er a(er erVar) {
        j = erVar;
        return erVar;
    }

    static M c(M m) {
        k = m;
        return m;
    }

    static M k() {
        return i;
    }
}
