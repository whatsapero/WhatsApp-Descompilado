package org.whispersystems.libaxolotl;

import com.google.g2;
import org.whispersystems.libaxolotl.ecc.f;

public class av implements a3 {
    private static final String[] z;
    private final byte[] a;
    private final f b;
    private final b2 c;
    private final int d;
    private final int e;
    private final aA f;
    private final int g;
    private final aK h;

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
        r4 = 1;
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = ",o:-[\u0015m<6SEl<1E\u0004f<l";
        r0 = -1;
        r5 = r3;
        r6 = r3;
        r3 = r1;
    L_0x000b:
        r2 = r2.toCharArray();
        r7 = r2.length;
        r8 = r7;
        r9 = r1;
        r7 = r2;
    L_0x0013:
        if (r8 > r9) goto L_0x002f;
    L_0x0015:
        r2 = new java.lang.String;
        r2.<init>(r7);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0021;
        };
    L_0x0021:
        r5[r3] = r2;
        r0 = "0o2,Y\u0012oy4S\u0017r0-X_!";
        r2 = r0;
        r3 = r4;
        r5 = r6;
        r0 = r1;
        goto L_0x000b;
    L_0x002a:
        r5[r3] = r2;
        z = r6;
        return;
    L_0x002f:
        r10 = r7[r9];
        r2 = r9 % 5;
        switch(r2) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0043;
            case 2: goto L_0x0045;
            case 3: goto L_0x0048;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 54;
    L_0x0038:
        r2 = r2 ^ r10;
        r2 = (char) r2;
        r7[r9] = r2;
        r2 = r9 + 1;
        r9 = r2;
        goto L_0x0013;
    L_0x0040:
        r2 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x0038;
    L_0x0043:
        r2 = r4;
        goto L_0x0038;
    L_0x0045:
        r2 = 89;
        goto L_0x0038;
    L_0x0048:
        r2 = 66;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.av.<clinit>():void");
    }

    public b2 g() {
        return this.c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public av(byte[] r6) {
        /*
        r5_this = this;
        r4 = 3;
        r1 = org.whispersystems.libaxolotl.aI.d;
        r5.<init>();
        r0 = 0;
        r0 = r6[r0];	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r0 = org.whispersystems.libaxolotl.aE.a(r0);	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r5.d = r0;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r0 = r5.d;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        if (r0 <= r4) goto L_0x0038;
    L_0x0013:
        r0 = new org.whispersystems.libaxolotl.ba;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r1 = new java.lang.StringBuilder;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r1.<init>();	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r2 = z;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r1 = r1.append(r2);	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r2 = r5.d;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r1 = r1.append(r2);	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r1 = r1.toString();	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r0.<init>(r1);	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        throw r0;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
    L_0x0031:
        r0 = move-exception;
    L_0x0032:
        r1 = new org.whispersystems.libaxolotl.aJ;
        r1.<init>(r0);
        throw r1;
    L_0x0038:
        r0 = 1;
        r2 = r6.length;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r2 = r2 + -1;
        r0 = com.google.g2.a(r6, r0, r2);	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r2 = org.whispersystems.libaxolotl.aV.a(r0);	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r0 = r5.d;	 Catch:{ gc -> 0x007a, Z -> 0x0078, ah -> 0x0086 }
        r3 = 2;
        if (r0 != r3) goto L_0x004f;
    L_0x0049:
        r0 = r2.b();	 Catch:{ gc -> 0x007a, Z -> 0x0078, ah -> 0x0086 }
        if (r0 == 0) goto L_0x006b;
    L_0x004f:
        r0 = r5.d;	 Catch:{ gc -> 0x007c, Z -> 0x0078, ah -> 0x0086 }
        if (r0 != r4) goto L_0x0059;
    L_0x0053:
        r0 = r2.r();	 Catch:{ gc -> 0x007e, Z -> 0x0078, ah -> 0x0086 }
        if (r0 == 0) goto L_0x006b;
    L_0x0059:
        r0 = r2.t();	 Catch:{ gc -> 0x0080, Z -> 0x0078, ah -> 0x0086 }
        if (r0 == 0) goto L_0x006b;
    L_0x005f:
        r0 = r2.i();	 Catch:{ gc -> 0x0082, Z -> 0x0078, ah -> 0x0086 }
        if (r0 == 0) goto L_0x006b;
    L_0x0065:
        r0 = r2.g();	 Catch:{ gc -> 0x0084, Z -> 0x0078, ah -> 0x0086 }
        if (r0 != 0) goto L_0x0088;
    L_0x006b:
        r0 = new org.whispersystems.libaxolotl.aJ;	 Catch:{ gc -> 0x0076, Z -> 0x0078, ah -> 0x0086 }
        r1 = z;	 Catch:{ gc -> 0x0076, Z -> 0x0078, ah -> 0x0086 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ gc -> 0x0076, Z -> 0x0078, ah -> 0x0086 }
        r0.<init>(r1);	 Catch:{ gc -> 0x0076, Z -> 0x0078, ah -> 0x0086 }
        throw r0;	 Catch:{ gc -> 0x0076, Z -> 0x0078, ah -> 0x0086 }
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
    L_0x0078:
        r0 = move-exception;
        goto L_0x0032;
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x007c, Z -> 0x0078, ah -> 0x0086 }
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x007e, Z -> 0x0078, ah -> 0x0086 }
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0080, Z -> 0x0078, ah -> 0x0086 }
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0082, Z -> 0x0078, ah -> 0x0086 }
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0084, Z -> 0x0078, ah -> 0x0086 }
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0076, Z -> 0x0078, ah -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        goto L_0x0032;
    L_0x0088:
        r5.a = r6;	 Catch:{ gc -> 0x00f1, Z -> 0x0078, ah -> 0x0086 }
        r0 = r2.q();	 Catch:{ gc -> 0x00f1, Z -> 0x0078, ah -> 0x0086 }
        r5.e = r0;	 Catch:{ gc -> 0x00f1, Z -> 0x0078, ah -> 0x0086 }
        r0 = r2.b();	 Catch:{ gc -> 0x00f1, Z -> 0x0078, ah -> 0x0086 }
        if (r0 == 0) goto L_0x00f5;
    L_0x0096:
        r0 = r2.m();	 Catch:{ gc -> 0x00f1, Z -> 0x0078, ah -> 0x0086 }
        if (r0 < 0) goto L_0x00f5;
    L_0x009c:
        r0 = r2.m();	 Catch:{ gc -> 0x00f3, Z -> 0x0078, ah -> 0x0086 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ gc -> 0x00f3, Z -> 0x0078, ah -> 0x0086 }
        r0 = org.whispersystems.libaxolotl.aK.a(r0);	 Catch:{ gc -> 0x00f3, Z -> 0x0078, ah -> 0x0086 }
    L_0x00a8:
        r5.h = r0;	 Catch:{ gc -> 0x00fa, Z -> 0x0078, ah -> 0x0086 }
        r0 = r2.r();	 Catch:{ gc -> 0x00fa, Z -> 0x0078, ah -> 0x0086 }
        if (r0 == 0) goto L_0x00fc;
    L_0x00b0:
        r0 = r2.s();	 Catch:{ gc -> 0x00fa, Z -> 0x0078, ah -> 0x0086 }
    L_0x00b4:
        r5.g = r0;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r0 = r2.c();	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r0 = r0.b();	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r3 = 0;
        r0 = org.whispersystems.libaxolotl.ecc.d.a(r0, r3);	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r5.b = r0;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r0 = new org.whispersystems.libaxolotl.b2;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r3 = r2.k();	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r3 = r3.b();	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r4 = 0;
        r3 = org.whispersystems.libaxolotl.ecc.d.a(r3, r4);	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r0.<init>(r3);	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r5.c = r0;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r0 = new org.whispersystems.libaxolotl.aA;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r2 = r2.j();	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r2 = r2.b();	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r0.<init>(r2);	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r5.f = r0;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        r0 = org.whispersystems.libaxolotl.bD.m;	 Catch:{ gc -> 0x00fe }
        if (r0 == 0) goto L_0x00f0;
    L_0x00ec:
        r0 = r1 + 1;
        org.whispersystems.libaxolotl.aI.d = r0;	 Catch:{ gc -> 0x00fe }
    L_0x00f0:
        return;
    L_0x00f1:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x00f3, Z -> 0x0078, ah -> 0x0086 }
    L_0x00f3:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
    L_0x00f5:
        r0 = org.whispersystems.libaxolotl.aK.d();	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
        goto L_0x00a8;
    L_0x00fa:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0031, Z -> 0x0078, ah -> 0x0086 }
    L_0x00fc:
        r0 = -1;
        goto L_0x00b4;
    L_0x00fe:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.av.<init>(byte[]):void");
    }

    public f f() {
        return this.b;
    }

    public byte[] a() {
        return this.a;
    }

    public int e() {
        return this.g;
    }

    public int b() {
        return 3;
    }

    public int d() {
        return this.e;
    }

    public av(int i, int i2, aK aKVar, int i3, f fVar, b2 b2Var, aA aAVar) {
        this.d = i;
        this.e = i2;
        this.h = aKVar;
        this.g = i3;
        this.b = fVar;
        this.c = b2Var;
        this.f = aAVar;
        D c = aV.f().b(i3).a(g2.a(fVar.b())).b(g2.a(b2Var.b())).c(g2.a(aAVar.a())).c(i2);
        if (aKVar.b()) {
            c.a(((Integer) aKVar.c()).intValue());
        }
        byte[] bArr = new byte[]{aE.a(this.d, 3)};
        byte[] b = c.a().b();
        this.a = aE.a(new byte[][]{bArr, b});
    }

    public aK c() {
        return this.h;
    }

    public aA b() {
        return this.f;
    }

    public int a() {
        return this.d;
    }
}
