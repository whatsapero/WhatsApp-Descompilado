package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.br;
import java.io.File;

class wb extends Handler {
    private static final String[] z;
    final ank a;

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
        r2 = "A:\u000fY";
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
        r0 = "Aj";
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
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
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
        r2 = 91;
        goto L_0x0038;
    L_0x0046:
        r2 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        goto L_0x0038;
    L_0x0049:
        r2 = 58;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wb.<clinit>():void");
    }

    wb(ank com_whatsapp_ank, al3 com_whatsapp_al3) {
        this(com_whatsapp_ank);
    }

    private wb(ank com_whatsapp_ank) {
        this.a = com_whatsapp_ank;
    }

    public void handleMessage(Message message) {
        if (ank.b(this.a) != null) {
            File file = new File(ank.c(this.a) + z[1] + z[0]);
            if (file.length() > 0) {
                br.a(new fw(this, file));
                if (!ant.a) {
                    return;
                }
            }
            sendEmptyMessageDelayed(0, 50);
        }
    }
}
