package com.whatsapp;

import android.view.View.OnClickListener;

class yy implements OnClickListener {
    private static final String[] z;
    final Advanced a;

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
        r2 = "\u000b\u0000Xk\u0012\f\u001a[oS\f\u0001F";
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
        r0 = "/\u0006\u001blZ\u000e\u0001FzB\u001f[[~F";
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
        r2 = 50;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        goto L_0x0038;
    L_0x0043:
        r2 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        goto L_0x0038;
    L_0x0046:
        r2 = 53;
        goto L_0x0038;
    L_0x0049:
        r2 = 27;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.yy.<clinit>():void");
    }

    yy(Advanced advanced) {
        this.a = advanced;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r6) {
        /*
        r5_this = this;
        r1 = com.whatsapp.App.az;
        r0 = z;
        r2 = 0;
        r0 = r0[r2];
        com.whatsapp.App.v(r0);
        r0 = r5.a;
        r2 = 2131427468; // 0x7f0b008c float:1.8476553E38 double:1.0530650885E-314;
        r0 = r0.findViewById(r2);
        r0 = (android.widget.EditText) r0;
        r0 = r0.getText();
        r2 = r0.toString();
        if (r2 == 0) goto L_0x0035;
    L_0x001f:
        r0 = r2.length();
        if (r0 <= 0) goto L_0x0035;
    L_0x0025:
        r0 = "-";
        r0 = r2.contains(r0);
        if (r0 == 0) goto L_0x0035;
    L_0x002d:
        r0 = com.whatsapp.App.P;
        r0 = r0.h();
        if (r1 == 0) goto L_0x0061;
    L_0x0035:
        if (r2 == 0) goto L_0x005b;
    L_0x0037:
        r0 = r2.length();
        if (r0 <= 0) goto L_0x005b;
    L_0x003d:
        r0 = com.whatsapp.App.P;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        r0 = r0.e(r2);
        if (r1 == 0) goto L_0x0061;
    L_0x005b:
        r0 = com.whatsapp.App.P;
        r0 = r0.f();
    L_0x0061:
        if (r0 == 0) goto L_0x007b;
    L_0x0063:
        r2 = r0.size();
        if (r2 <= 0) goto L_0x007b;
    L_0x0069:
        r2 = r0.iterator();
    L_0x006d:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x007b;
    L_0x0073:
        r0 = r2.next();
        r0 = (com.whatsapp.m8) r0;
        if (r1 == 0) goto L_0x006d;
    L_0x007b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.yy.onClick(android.view.View):void");
    }
}
