package de.greenrobot.event.util;

import android.util.Log;
import de.greenrobot.event.g;

class c implements Runnable {
    private static final String[] z;
    final m a;
    final g b;

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
        r2 = "-'S\u001a\u0007\f4V]\u000b\u001a6_\r\u001a\u000b:TG";
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
        r0 = "!:O\u0011\nB;U\tN\u0001'_\u001c\u001a\u0007u\\\u001c\u0007\u000e H\u0018N\u0007#_\u0013\u001a";
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
        r2 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 98;
        goto L_0x0038;
    L_0x0043:
        r2 = 85;
        goto L_0x0038;
    L_0x0046:
        r2 = 58;
        goto L_0x0038;
    L_0x0049:
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: de.greenrobot.event.util.c.<clinit>():void");
    }

    public void run() {
        try {
            this.b.a();
        } catch (Throwable e) {
            try {
                Object newInstance = m.b(this.a).newInstance(new Object[]{e});
                try {
                    if (newInstance instanceof e) {
                        ((e) newInstance).a(m.c(this.a));
                    }
                    m.a(this.a).b(newInstance);
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Throwable e3) {
                Log.e(g.k, z[0], e);
                throw new RuntimeException(z[1], e3);
            }
        }
    }

    c(m mVar, g gVar) {
        this.a = mVar;
        this.b = gVar;
    }
}
