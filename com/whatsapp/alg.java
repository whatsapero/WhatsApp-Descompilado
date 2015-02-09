package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

class alg implements OnClickListener {
    private static final String[] z;
    final IncorrectAppReleaseVersionActivity a;

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
        r6 = 85;
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "%T6\t\u00102Po\u0001\u001e8\u001b\"\n\u0010!F4\u0012\u0001";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000c:
        r2 = r2.toCharArray();
        r7 = r2.length;
        r8 = r7;
        r9 = r1;
        r7 = r2;
    L_0x0014:
        if (r8 > r9) goto L_0x0031;
    L_0x0016:
        r2 = new java.lang.String;
        r2.<init>(r7);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002c;
            default: goto L_0x0022;
        };
    L_0x0022:
        r4[r3] = r2;
        r2 = 1;
        r0 = "4[1\u0010\u001e<Q{\u000b\u001f!P;\u0016_4V!\u000b\u001e;\u001b\u0011'=\u0010a\u0010";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000c;
    L_0x002c:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x0031:
        r10 = r7[r9];
        r2 = r9 % 5;
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0044;
            case 2: goto L_0x0047;
            case 3: goto L_0x0049;
            default: goto L_0x0038;
        };
    L_0x0038:
        r2 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
    L_0x003a:
        r2 = r2 ^ r10;
        r2 = (char) r2;
        r7[r9] = r2;
        r2 = r9 + 1;
        r9 = r2;
        goto L_0x0014;
    L_0x0042:
        r2 = r6;
        goto L_0x003a;
    L_0x0044:
        r2 = 53;
        goto L_0x003a;
    L_0x0047:
        r2 = r6;
        goto L_0x003a;
    L_0x0049:
        r2 = 98;
        goto L_0x003a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.alg.<clinit>():void");
    }

    alg(IncorrectAppReleaseVersionActivity incorrectAppReleaseVersionActivity) {
        this.a = incorrectAppReleaseVersionActivity;
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(z[1], Uri.parse(z[0])));
    }
}
