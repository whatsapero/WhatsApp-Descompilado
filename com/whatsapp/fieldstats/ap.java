package com.whatsapp.fieldstats;

public enum ap {
    ;
    public static final ap FOURSQUARE;
    public static final ap GOOGLE;
    private static final ap[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    private ap(int i) {
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
        r2 = "\n4\u0012\\\u001d\b";
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
        r0 = "\u000b4\bI\u0002\u001c.\u001cI\u0014";
        r2 = r0;
        r3 = r4;
        r5 = r6;
        r0 = r1;
        goto L_0x000b;
    L_0x002a:
        r5[r3] = r2;
        z = r6;
        r0 = new com.whatsapp.fieldstats.ap;
        r2 = z;
        r2 = r2[r1];
        r0.<init>(r2, r1, r4);
        GOOGLE = r0;
        r0 = new com.whatsapp.fieldstats.ap;
        r2 = z;
        r2 = r2[r4];
        r0.<init>(r2, r4, r11);
        FOURSQUARE = r0;
        r0 = new com.whatsapp.fieldstats.ap[r11];
        r2 = GOOGLE;
        r0[r1] = r2;
        r1 = FOURSQUARE;
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
        r2 = 77;
        goto L_0x005a;
    L_0x0065:
        r2 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        goto L_0x005a;
    L_0x0068:
        r2 = 93;
        goto L_0x005a;
    L_0x006b:
        r2 = 27;
        goto L_0x005a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fieldstats.ap.<clinit>():void");
    }
}
