package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

class p0 implements OnClickListener {
    private static final String[] z;
    final UserFeedbackActivity a;

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
        r6 = 2;
        r1 = 0;
        r3 = new java.lang.String[r6];
        r2 = "\u001dv8\"=O-c?!\u0017k 7`\u0001u%&:\u0010pb1!\u0018-;3\u0011\u0006v-&;\u0006";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000a:
        r2 = r2.toCharArray();
        r7 = r2.length;
        r8 = r7;
        r9 = r1;
        r7 = r2;
    L_0x0012:
        if (r8 > r9) goto L_0x002f;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r7);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = "\u0014l( !\u001cfb; \u0001g\"&`\u0014a8;!\u001b,\u001a\u001b\u000b\"";
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
        r10 = r7[r9];
        r2 = r9 % 5;
        switch(r2) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0043;
            case 2: goto L_0x0045;
            case 3: goto L_0x0048;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 78;
    L_0x0038:
        r2 = r2 ^ r10;
        r2 = (char) r2;
        r7[r9] = r2;
        r2 = r9 + 1;
        r9 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        goto L_0x0038;
    L_0x0043:
        r2 = r6;
        goto L_0x0038;
    L_0x0045:
        r2 = 76;
        goto L_0x0038;
    L_0x0048:
        r2 = 82;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.p0.<clinit>():void");
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(123);
        this.a.startActivity(new Intent(z[1], Uri.parse(z[0])));
    }

    p0(UserFeedbackActivity userFeedbackActivity) {
        this.a = userFeedbackActivity;
    }
}
