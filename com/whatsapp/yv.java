package com.whatsapp;

import com.whatsapp.protocol.cd;

final class yv implements cd {
    private static final String[] z;

    static {
        /* JADX: method processing error */
/*
        Error: java.lang.OutOfMemoryError: GC overhead limit exceeded
	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:635)
	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:90)
	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:320)
	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:90)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:46)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
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
        r2 = "s2Ce u4Wf%u(\rh/u9I&)e7@n5?7C\u007f$x";
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
        r0 = "s2Ce u4Wf%u(\rm&y6\u0002";
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
        r2 = 71;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 16;
        goto L_0x0038;
    L_0x0043:
        r2 = 90;
        goto L_0x0038;
    L_0x0046:
        r2 = 34;
        goto L_0x0038;
    L_0x0049:
        r2 = 11;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.yv.<clinit>():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r6) {
        /*
        r5_this = this;
        r4 = 6;
        r0 = com.whatsapp.App.az;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r6);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        switch(r6) {
            case 400: goto L_0x0031;
            case 401: goto L_0x0049;
            case 405: goto L_0x0058;
            case 409: goto L_0x005f;
            default: goto L_0x001f;
        };
    L_0x001f:
        r0 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r6 >= r0) goto L_0x0030;
    L_0x0023:
        r0 = com.whatsapp.ChangeNumber.c();
        r0.sendEmptyMessage(r4);
        com.whatsapp.a54.m();
        com.whatsapp.App.ao();
    L_0x0030:
        return;
    L_0x0031:
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        com.whatsapp.util.Log.w(r1);
        r1 = com.whatsapp.ChangeNumber.c();
        r2 = 5;
        r1.sendEmptyMessage(r2);
        com.whatsapp.a54.m();
        com.whatsapp.App.ao();
        if (r0 == 0) goto L_0x0030;
    L_0x0049:
        r1 = com.whatsapp.ChangeNumber.c();
        r1.sendEmptyMessage(r4);
        com.whatsapp.a54.m();
        com.whatsapp.App.ao();
        if (r0 == 0) goto L_0x0030;
    L_0x0058:
        r1 = com.whatsapp.ChangeNumber.B;
        r1.run();
        if (r0 == 0) goto L_0x0030;
    L_0x005f:
        if (r0 == 0) goto L_0x0030;
    L_0x0061:
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.yv.a(int):void");
    }

    yv() {
    }
}
