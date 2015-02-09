package com.whatsapp.qrcode;

import android.hardware.Camera.ErrorCallback;

class f implements ErrorCallback {
    private static final String[] z;
    final QrCodeView a;

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
        r2 = "9E$7E?\u0018!*A:C1?M-E3~C)Z7,AhR ,O:\r";
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
        r0 = "9E$7E?\u0018!*A:C1?M-E3~";
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
        r2 = 32;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 72;
        goto L_0x0038;
    L_0x0043:
        r2 = 55;
        goto L_0x0038;
    L_0x0046:
        r2 = 82;
        goto L_0x0038;
    L_0x0049:
        r2 = 94;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.f.<clinit>():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(int r4, android.hardware.Camera r5) {
        /*
        r3_this = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = 100;
        if (r4 != r0) goto L_0x003b;
    L_0x001d:
        r0 = r3.a;
        com.whatsapp.qrcode.QrCodeView.d(r0);
        r0 = r3.a;
        com.whatsapp.qrcode.QrCodeView.e(r0);
        r0 = r3.a;	 Catch:{ RuntimeException -> 0x003c, IOException -> 0x005a }
        r0 = com.whatsapp.qrcode.QrCodeView.b(r0);	 Catch:{ RuntimeException -> 0x003c, IOException -> 0x005a }
        r1 = r3.a;	 Catch:{ RuntimeException -> 0x003c, IOException -> 0x005a }
        r1 = com.whatsapp.qrcode.QrCodeView.c(r1);	 Catch:{ RuntimeException -> 0x003c, IOException -> 0x005a }
        r0.setPreviewDisplay(r1);	 Catch:{ RuntimeException -> 0x003c, IOException -> 0x005a }
        r0 = r3.a;	 Catch:{ RuntimeException -> 0x003c, IOException -> 0x005a }
        r0.f();	 Catch:{ RuntimeException -> 0x003c, IOException -> 0x005a }
    L_0x003b:
        return;
    L_0x003c:
        r0 = move-exception;
    L_0x003d:
        r1 = r3.a;
        r1 = com.whatsapp.qrcode.QrCodeView.b(r1);
        r1.release();
        r1 = r3.a;
        r2 = 0;
        com.whatsapp.qrcode.QrCodeView.a(r1, r2);
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        r0 = r3.a;
        com.whatsapp.qrcode.QrCodeView.a(r0);
        goto L_0x003b;
    L_0x005a:
        r0 = move-exception;
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.f.onError(int, android.hardware.Camera):void");
    }

    f(QrCodeView qrCodeView) {
        this.a = qrCodeView;
    }
}
