package com.whatsapp.fieldstats;

public enum a9 {
    ;
    public static final a9 ENDED_BY_USER;
    public static final a9 TIMEOUT;
    private static final a9[] a;
    private static final String[] z;
    private final int b;

    private a9(int i) {
        this.b = i;
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
        r11 = 2;
        r4 = 1;
        r1 = 0;
        r3 = new java.lang.String[r11];
        r2 = "\bVd/\u0014\tK";
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
        if (r8 > r9) goto L_0x0051;
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
        r0 = "\u0019Qm/\u001f\u0003]p5\u000e\u000fZ{";
        r2 = r0;
        r3 = r4;
        r5 = r6;
        r0 = r1;
        goto L_0x000b;
    L_0x002a:
        r5[r3] = r2;
        z = r6;
        r0 = new com.whatsapp.fieldstats.a9;
        r2 = z;
        r2 = r2[r4];
        r0.<init>(r2, r1, r4);
        ENDED_BY_USER = r0;
        r0 = new com.whatsapp.fieldstats.a9;
        r2 = z;
        r2 = r2[r1];
        r0.<init>(r2, r4, r11);
        TIMEOUT = r0;
        r0 = new com.whatsapp.fieldstats.a9[r11];
        r2 = ENDED_BY_USER;
        r0[r1] = r2;
        r1 = TIMEOUT;
        r0[r4] = r1;
        a = r0;
        return;
    L_0x0051:
        r10 = r7[r9];
        r2 = r9 % 5;
        switch(r2) {
            case 0: goto L_0x0062;
            case 1: goto L_0x0065;
            case 2: goto L_0x0068;
            case 3: goto L_0x006b;
            default: goto L_0x0058;
        };
    L_0x0058:
        r2 = 91;
    L_0x005a:
        r2 = r2 ^ r10;
        r2 = (char) r2;
        r7[r9] = r2;
        r2 = r9 + 1;
        r9 = r2;
        goto L_0x0013;
    L_0x0062:
        r2 = 92;
        goto L_0x005a;
    L_0x0065:
        r2 = 31;
        goto L_0x005a;
    L_0x0068:
        r2 = 41;
        goto L_0x005a;
    L_0x006b:
        r2 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        goto L_0x005a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fieldstats.a9.<clinit>():void");
    }

    public int getCode() {
        return this.b;
    }
}
