package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

class vx implements OnClickListener {
    private static final String[] z;
    final VerifyNumber a;

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
        r2 = "`'\"\u0018\u00112|y\u0005\rj::\rL|$?\u001c\u0016m!x\u000b\re|!\t={'7\u001c\u0017{";
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
        r0 = "i=2\u001a\ra7x\u0001\f|68\u001cLi0\"\u0001\rf}\u0000!'_";
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
        r2 = 98;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 8;
        goto L_0x0038;
    L_0x0043:
        r2 = 83;
        goto L_0x0038;
    L_0x0046:
        r2 = 86;
        goto L_0x0038;
    L_0x0049:
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.vx.<clinit>():void");
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(109);
        this.a.startActivity(new Intent(z[1], Uri.parse(z[0])));
    }

    vx(VerifyNumber verifyNumber) {
        this.a = verifyNumber;
    }
}
