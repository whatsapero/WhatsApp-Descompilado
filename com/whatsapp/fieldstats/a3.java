package com.whatsapp.fieldstats;

public enum a3 {
    ;
    public static final a3 CALLEE;
    public static final a3 CALLER;
    private static final a3[] a;
    private static final String[] z;
    private final int b;

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
        r2 = "=\u0003\u0014l\u0014,";
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
        r0 = "=\u0003\u0014l\u0014;";
        r2 = r0;
        r3 = r4;
        r5 = r6;
        r0 = r1;
        goto L_0x000b;
    L_0x002a:
        r5[r3] = r2;
        z = r6;
        r0 = new com.whatsapp.fieldstats.a3;
        r2 = z;
        r2 = r2[r1];
        r0.<init>(r2, r1, r4);
        CALLER = r0;
        r0 = new com.whatsapp.fieldstats.a3;
        r2 = z;
        r2 = r2[r4];
        r0.<init>(r2, r4, r11);
        CALLEE = r0;
        r0 = new com.whatsapp.fieldstats.a3[r11];
        r2 = CALLER;
        r0[r1] = r2;
        r1 = CALLEE;
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
        r2 = 81;
    L_0x005a:
        r2 = r2 ^ r10;
        r2 = (char) r2;
        r7[r9] = r2;
        r2 = r9 + 1;
        r9 = r2;
        goto L_0x0013;
    L_0x0062:
        r2 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        goto L_0x005a;
    L_0x0065:
        r2 = 66;
        goto L_0x005a;
    L_0x0068:
        r2 = 88;
        goto L_0x005a;
    L_0x006b:
        r2 = 32;
        goto L_0x005a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fieldstats.a3.<clinit>():void");
    }

    private a3(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }
}
