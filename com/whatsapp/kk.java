package com.whatsapp;

import android.net.NetworkInfo;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;

class kk implements OnClickListener {
    private static final String[] z;
    final EULA a;

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
        r2 = "!\u0005BEg'\u0015BH=(\u0011\\\t&!\u0004YK:/P@Q$(";
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
        r0 = "!\u0005BEg'\u0015BH=(\u0011\\\t&!\u0004YK:/P[J#*\u001fYJ";
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
        r2 = 72;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 68;
        goto L_0x0038;
    L_0x0043:
        r2 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        goto L_0x0038;
    L_0x0046:
        r2 = 46;
        goto L_0x0038;
    L_0x0049:
        r2 = 36;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kk.<clinit>():void");
    }

    public void onClick(View view) {
        int i = App.az;
        int networkType = App.a3.getNetworkType();
        NetworkInfo activeNetworkInfo = App.ah.getActiveNetworkInfo();
        int i2;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        App.p.B.b(this.a);
        if (App.a3 == null) {
            Log.e(z[0]);
            this.a.showDialog(2);
            if (i == 0) {
                return;
            }
        }
        if (networkType == 0 && r0 == 0) {
            Log.e(z[1]);
            this.a.showDialog(2);
            if (i == 0) {
                return;
            }
        }
        if (App.a3.getDeviceId() == null) {
            this.a.showDialog(3);
            if (i == 0) {
                return;
            }
        }
        EULA.a(this.a);
    }

    kk(EULA eula) {
        this.a = eula;
    }
}
