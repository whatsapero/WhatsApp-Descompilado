package com.whatsapp;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.ProgressBar;
import com.whatsapp.util.Log;

class a3b extends CountDownTimer {
    private static final String[] z;
    final ProgressBar a;
    final long b;
    final View c;
    final VerifySms d;

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
        r2 = "\t\u0015F\u0018\u0003\u0006\u0003Y\u0002J\u001c\u001fA\u001f\u0011\u001b\u001fC\u001f\u0011\u0016\u001dQ\u0003J\u001b\u001fZ\u0014J\u000b\u0002M\\\u0016\u001e\u0006Q\u0015\u0006\u0010\u0014Q";
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
        r0 = "\u000b\u0011D\u0001\u0000\u001b";
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
        r2 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        goto L_0x0038;
    L_0x0043:
        r2 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        goto L_0x0038;
    L_0x0046:
        r2 = 52;
        goto L_0x0038;
    L_0x0049:
        r2 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a3b.<clinit>():void");
    }

    a3b(VerifySms verifySms, long j, long j2, ProgressBar progressBar, long j3, View view) {
        this.d = verifySms;
        this.a = progressBar;
        this.b = j3;
        this.c = view;
        super(j, j2);
    }

    public void onTick(long j) {
        this.a.setProgress((int) ((((double) (this.b - j)) * 100.0d) / ((double) this.b)));
    }

    public void onFinish() {
        VerifySms.e(this.d).setEnabled(true);
        this.c.setVisibility(8);
        this.a.setVisibility(8);
        if (VerifySms.c(this.d) != null) {
            Log.i(z[0]);
            VerifySms.x(this.d);
            a5w.a(new uc(this.d), new String[]{r0, z[1]});
        }
    }
}
