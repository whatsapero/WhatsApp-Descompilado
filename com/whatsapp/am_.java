package com.whatsapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.Voip.CallState;
import com.whatsapp.util.Log;

class am_ implements ServiceConnection {
    private static final String[] z;
    final VoipActivity a;

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
        r2 = "\u0005E`\u0005u%E`\u0005\u001b\u0010^`\u00033\u0007S&\u001a4 O{\u00033\u0010OJ\u001a4\u001dOj\u0001?\u0017";
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
        r0 = "\u0005E`\u0005u%E`\u0005\u001b\u0010^`\u00033\u0007S&\u001a4 O{\u00033\u0010OM\u001c)\u0010Eg\u001b?\u0010^l\u0011";
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
        r2 = 90;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x0038;
    L_0x0043:
        r2 = 42;
        goto L_0x0038;
    L_0x0046:
        r2 = 9;
        goto L_0x0038;
    L_0x0049:
        r2 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.am_.<clinit>():void");
    }

    am_(VoipActivity voipActivity) {
        this.a = voipActivity;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.i(z[0]);
        a36 com_whatsapp_a36 = (a36) iBinder;
        VoipActivity.a(this.a, true);
        VoipActivity.a(this.a, com_whatsapp_a36.a());
        VoipActivity.a(this.a).a(this.a);
        this.a.a(CallState.NONE, Voip.getCallInfo());
        VoipActivity.f(this.a);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Log.i(z[1]);
        VoipActivity.a(this.a).a(null);
        VoipActivity.a(this.a, null);
        VoipActivity.a(this.a, false);
    }
}
