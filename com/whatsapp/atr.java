package com.whatsapp;

class atr implements Runnable {
    private static final String[] z;
    private long a;
    final wj b;
    private long c;

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
        r2 = "m\u0012[MQ)\\";
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
        r0 = ".\u000eTOU.\u0015\u0015TV>\u0004HMQ?NUUW%\u0000T\\Qb\u0017_IG$\u000eT\u0006";
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
        r2 = 52;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 77;
        goto L_0x0038;
    L_0x0043:
        r2 = 97;
        goto L_0x0038;
    L_0x0046:
        r2 = 58;
        goto L_0x0038;
    L_0x0049:
        r2 = 59;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.atr.<clinit>():void");
    }

    atr(wj wjVar) {
        this.b = wjVar;
        this.a = 5000;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r8_this = this;
        r6 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r1 = com.whatsapp.App.az;
        r0 = com.whatsapp.App.P;
        r0 = r0.l();
        r2 = r8.b;
        r2 = r2.a();
        r3 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0039 }
        r3.<init>();	 Catch:{ InterruptedException -> 0x0039 }
        r4 = z;	 Catch:{ InterruptedException -> 0x0039 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ InterruptedException -> 0x0039 }
        r3 = r3.append(r4);	 Catch:{ InterruptedException -> 0x0039 }
        r3 = r3.append(r0);	 Catch:{ InterruptedException -> 0x0039 }
        r4 = z;	 Catch:{ InterruptedException -> 0x0039 }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ InterruptedException -> 0x0039 }
        r3 = r3.append(r4);	 Catch:{ InterruptedException -> 0x0039 }
        r3 = r3.append(r2);	 Catch:{ InterruptedException -> 0x0039 }
        r3 = r3.toString();	 Catch:{ InterruptedException -> 0x0039 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ InterruptedException -> 0x0039 }
        if (r2 != r0) goto L_0x003b;
    L_0x0038:
        return;
    L_0x0039:
        r0 = move-exception;
        throw r0;
    L_0x003b:
        r0 = com.whatsapp.App.p;	 Catch:{ InterruptedException -> 0x00a7 }
        r0 = r0.U();	 Catch:{ InterruptedException -> 0x00a7 }
        r2 = r8.b;	 Catch:{ InterruptedException -> 0x00a7 }
        r2 = com.whatsapp.wj.a(r2);	 Catch:{ InterruptedException -> 0x00a7 }
        r0.post(r2);	 Catch:{ InterruptedException -> 0x00a7 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ InterruptedException -> 0x00a7 }
        r4 = r8.c;	 Catch:{ InterruptedException -> 0x00a7 }
        r2 = r2 - r4;
        r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x005b;
    L_0x0055:
        r2 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r8.a = r2;	 Catch:{ InterruptedException -> 0x00a7 }
        if (r1 == 0) goto L_0x0068;
    L_0x005b:
        r2 = r8.a;	 Catch:{ InterruptedException -> 0x00a9 }
        r4 = 2;
        r2 = r2 * r4;
        r4 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r2 = java.lang.Math.min(r2, r4);	 Catch:{ InterruptedException -> 0x00a9 }
        r8.a = r2;	 Catch:{ InterruptedException -> 0x00a9 }
    L_0x0068:
        r2 = com.whatsapp.App.p;	 Catch:{ InterruptedException -> 0x00ab }
        r0 = com.whatsapp.App.aX();	 Catch:{ InterruptedException -> 0x00ab }
        if (r0 == 0) goto L_0x00ad;
    L_0x0070:
        r0 = com.whatsapp.contact.c.INTERACTIVE_DELTA;	 Catch:{ InterruptedException -> 0x00ab }
    L_0x0072:
        r0 = com.whatsapp.contact.i.d(r2, r0);
        r2 = r0.isFailure();	 Catch:{ InterruptedException -> 0x00b0 }
        if (r2 == 0) goto L_0x0084;
    L_0x007c:
        r2 = r8.b;	 Catch:{ InterruptedException -> 0x00b0 }
        r3 = 0;
        r2.a(r3);	 Catch:{ InterruptedException -> 0x00b0 }
        if (r1 == 0) goto L_0x0090;
    L_0x0084:
        r1 = r0.isSuccess();	 Catch:{ InterruptedException -> 0x00b2 }
        if (r1 == 0) goto L_0x0090;
    L_0x008a:
        r1 = r8.b;	 Catch:{ InterruptedException -> 0x00b4 }
        r2 = 0;
        r1.b(r2);	 Catch:{ InterruptedException -> 0x00b4 }
    L_0x0090:
        r2 = r8.a;	 Catch:{ InterruptedException -> 0x00b6 }
        java.lang.Thread.sleep(r2);	 Catch:{ InterruptedException -> 0x00b6 }
    L_0x0095:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ InterruptedException -> 0x00a5 }
        r8.c = r2;	 Catch:{ InterruptedException -> 0x00a5 }
        r1 = com.whatsapp.contact.k.IN_PROGRESS;	 Catch:{ InterruptedException -> 0x00a5 }
        if (r0 != r1) goto L_0x0038;
    L_0x009f:
        r0 = r8.b;	 Catch:{ InterruptedException -> 0x00a5 }
        com.whatsapp.wj.b(r0);	 Catch:{ InterruptedException -> 0x00a5 }
        goto L_0x0038;
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r0 = com.whatsapp.contact.c.BACKGROUND_DELTA;
        goto L_0x0072;
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00b2 }
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;
    L_0x00b6:
        r1 = move-exception;
        goto L_0x0095;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.atr.run():void");
    }
}
