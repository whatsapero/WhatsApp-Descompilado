package de.greenrobot.event;

final class a {
    private static final String[] z;
    private i a;
    private i b;

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
        r2 = "y\u0019VF\u0011t\rTD^cLXO\u0011r\u0002K_Tb\t^";
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
        r0 = "_\t[N\u0011g\u001e_YTy\u0018\u0016\nSb\u0018\u001aD^7\u0018[C]";
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
            case 0: goto L_0x0040;
            case 1: goto L_0x0043;
            case 2: goto L_0x0046;
            case 3: goto L_0x0049;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 49;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 23;
        goto L_0x0038;
    L_0x0043:
        r2 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        goto L_0x0038;
    L_0x0046:
        r2 = 58;
        goto L_0x0038;
    L_0x0049:
        r2 = 42;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: de.greenrobot.event.a.<clinit>():void");
    }

    synchronized i a(int i) {
        try {
            if (this.a == null) {
                wait((long) i);
            }
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
        }
        return a();
    }

    a() {
    }

    synchronized void a(i iVar) {
        try {
            if (iVar == null) {
                throw new NullPointerException(z[0]);
            }
            if (this.b != null) {
                this.b.c = iVar;
                this.b = iVar;
            } else if (this.a == null) {
                this.b = iVar;
                this.a = iVar;
            } else {
                throw new IllegalStateException(z[1]);
            }
            notifyAll();
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        } catch (NullPointerException e22) {
            throw e22;
        } catch (Throwable th) {
        }
    }

    synchronized i a() {
        i iVar;
        try {
            iVar = this.a;
            try {
                if (this.a != null) {
                    this.a = this.a.c;
                    if (this.a == null) {
                        this.b = null;
                    }
                }
            } catch (NullPointerException e) {
                throw e;
            } catch (NullPointerException e2) {
                throw e2;
            }
        } catch (Throwable th) {
        }
        return iVar;
    }
}
