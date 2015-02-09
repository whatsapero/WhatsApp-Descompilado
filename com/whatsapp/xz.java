package com.whatsapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Pair;
import com.android.vending.billing.IInAppBillingService.Stub;
import com.whatsapp.util.Log;

class xz implements ServiceConnection {
    private static final String[] z;
    final Runnable a;
    final t0 b;

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
        r2 = "FrJoHXg\u001eoLXrTg_\u0019|]/^SaEkNS<Wk^U|]lHUgVf";
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
        r0 = "FrJoHXg\u001eoLXrTg_\u0019|]/^SaEkNS<PmCXvPvHR";
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
            case 2: goto L_0x0046;
            case 3: goto L_0x0049;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 45;
    L_0x0038:
        r2 = r2 ^ r10;
        r2 = (char) r2;
        r7[r9] = r2;
        r2 = r9 + 1;
        r9 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 54;
        goto L_0x0038;
    L_0x0043:
        r2 = 19;
        goto L_0x0038;
    L_0x0046:
        r2 = 51;
        goto L_0x0038;
    L_0x0049:
        r2 = r6;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.xz.<clinit>():void");
    }

    xz(t0 t0Var, Runnable runnable) {
        this.b = t0Var;
        this.a = runnable;
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Log.i(z[0]);
        t0.e(this.b).sendMessageAtFrontOfQueue(t0.e(this.b).obtainMessage(2, 0, 0, null));
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.i(z[1]);
        t0.e(this.b).sendMessageAtFrontOfQueue(t0.e(this.b).obtainMessage(1, 0, 0, Pair.create(new xa(this.b, Stub.asInterface(iBinder), this), this.a)));
    }
}
