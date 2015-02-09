package com.whatsapp;

import android.view.View.OnLongClickListener;

class alh implements OnLongClickListener {
    private static final String[] z;
    final LocationPicker2 a;

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
        r4 = 1;
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "r\"\u0014kbI0\u0019?uNu;ptS&\fj`S0";
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
        if (r8 > r9) goto L_0x002f;
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
        r0 = "r\"\u0014kbI0\u0019?uNu:pnF9\u0018";
        r2 = r0;
        r3 = r4;
        r5 = r6;
        r0 = r1;
        goto L_0x000b;
    L_0x002a:
        r5[r3] = r2;
        z = r6;
        return;
    L_0x002f:
        r10 = r7[r9];
        r2 = r9 % 5;
        switch(r2) {
            case 0: goto L_0x003f;
            case 1: goto L_0x0042;
            case 2: goto L_0x0045;
            case 3: goto L_0x0048;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = r4;
    L_0x0037:
        r2 = r2 ^ r10;
        r2 = (char) r2;
        r7[r9] = r2;
        r2 = r9 + 1;
        r9 = r2;
        goto L_0x0013;
    L_0x003f:
        r2 = 33;
        goto L_0x0037;
    L_0x0042:
        r2 = 85;
        goto L_0x0037;
    L_0x0045:
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        goto L_0x0037;
    L_0x0048:
        r2 = 31;
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.alh.<clinit>():void");
    }

    alh(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onLongClick(android.view.View r6) {
        /*
        r5_this = this;
        r3 = 2;
        r4 = 0;
        r2 = 1;
        r0 = r5.a;
        r0 = com.whatsapp.LocationPicker2.v(r0);
        if (r0 != r2) goto L_0x0028;
    L_0x000b:
        r0 = r5.a;
        com.whatsapp.LocationPicker2.a(r0, r3);
        com.whatsapp.atb.a(r2);
        r0 = r5.a;
        r0 = r0.getApplicationContext();
        r1 = z;
        r1 = r1[r4];
        r0 = android.widget.Toast.makeText(r0, r1, r2);
        r0.show();
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0041;
    L_0x0028:
        r0 = r5.a;
        com.whatsapp.LocationPicker2.a(r0, r2);
        com.whatsapp.atb.a(r3);
        r0 = r5.a;
        r0 = r0.getApplicationContext();
        r1 = z;
        r1 = r1[r2];
        r0 = android.widget.Toast.makeText(r0, r1, r2);
        r0.show();
    L_0x0041:
        r0 = r5.a;
        com.whatsapp.LocationPicker2.a(r0, r4);
        r0 = r5.a;
        r1 = r5.a;
        r1 = com.whatsapp.LocationPicker2.q(r1);
        r2 = r5.a;
        r2 = com.whatsapp.LocationPicker2.m(r2);
        r3 = 0;
        com.whatsapp.LocationPicker2.a(r0, r1, r2, r3, r4);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.alh.onLongClick(android.view.View):boolean");
    }
}
