package com.whatsapp;

public enum sg {
    ;
    public static final sg GROUP;
    public static final sg INDIVIDUAL;
    private static final sg[] a;
    private static final String[] z;

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
        r7 = 2;
        r4 = 1;
        r1 = 0;
        r3 = new java.lang.String[r7];
        r2 = "uP\u000b1\u0002";
        r0 = -1;
        r5 = r3;
        r6 = r3;
        r3 = r1;
    L_0x000b:
        r2 = r2.toCharArray();
        r8 = r2.length;
        r9 = r8;
        r10 = r1;
        r8 = r2;
    L_0x0013:
        if (r9 > r10) goto L_0x0051;
    L_0x0015:
        r2 = new java.lang.String;
        r2.<init>(r8);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0021;
        };
    L_0x0021:
        r5[r3] = r2;
        r0 = "{L\u0000-\u0004{F\u0011%\u001e";
        r2 = r0;
        r3 = r4;
        r5 = r6;
        r0 = r1;
        goto L_0x000b;
    L_0x002a:
        r5[r3] = r2;
        z = r6;
        r0 = new com.whatsapp.sg;
        r2 = z;
        r2 = r2[r4];
        r0.<init>(r2, r1);
        INDIVIDUAL = r0;
        r0 = new com.whatsapp.sg;
        r2 = z;
        r2 = r2[r1];
        r0.<init>(r2, r4);
        GROUP = r0;
        r0 = new com.whatsapp.sg[r7];
        r2 = INDIVIDUAL;
        r0[r1] = r2;
        r1 = GROUP;
        r0[r4] = r1;
        a = r0;
        return;
    L_0x0051:
        r11 = r8[r10];
        r2 = r10 % 5;
        switch(r2) {
            case 0: goto L_0x0062;
            case 1: goto L_0x0065;
            case 2: goto L_0x0067;
            case 3: goto L_0x006a;
            default: goto L_0x0058;
        };
    L_0x0058:
        r2 = 82;
    L_0x005a:
        r2 = r2 ^ r11;
        r2 = (char) r2;
        r8[r10] = r2;
        r2 = r10 + 1;
        r10 = r2;
        goto L_0x0013;
    L_0x0062:
        r2 = 50;
        goto L_0x005a;
    L_0x0065:
        r2 = r7;
        goto L_0x005a;
    L_0x0067:
        r2 = 68;
        goto L_0x005a;
    L_0x006a:
        r2 = 100;
        goto L_0x005a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.sg.<clinit>():void");
    }
}
