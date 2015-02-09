package com.whatsapp.protocol;

class ag extends w {
    private static final String[] z;
    final String a;
    final String b;
    final j c;
    final String d;

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
        r2 = "X&GmqZ*";
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
        if (r7 > r8) goto L_0x002f;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = "A+";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x002f:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x003f;
            case 1: goto L_0x0042;
            case 2: goto L_0x0045;
            case 3: goto L_0x0048;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 4;
    L_0x0037:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x003f:
        r2 = 40;
        goto L_0x0037;
    L_0x0042:
        r2 = 79;
        goto L_0x0037;
    L_0x0045:
        r2 = 36;
        goto L_0x0037;
    L_0x0048:
        r2 = 25;
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.ag.<clinit>():void");
    }

    ag(j jVar, String str, String str2, String str3) {
        this.c = jVar;
        this.d = str;
        this.a = str2;
        this.b = str3;
    }

    public void a(bi biVar, String str) {
        bi d = biVar.d(z[0]);
        String str2 = this.d;
        byte[] bArr = null;
        if (d != null) {
            bArr = d.b;
            str2 = d.b(z[1]);
        }
        if (str != null) {
            j.a(this.c).a(str, str2, bArr, this.a);
        }
    }

    public void a(int i) {
        if (i == 404) {
            j.a(this.c).a(this.b, null, null, this.a);
            if (!b.n) {
                return;
            }
        }
        j.a(this.c).b(this.b, i);
    }
}
