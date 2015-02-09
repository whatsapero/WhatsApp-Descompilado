package com.whatsapp;

import com.whatsapp.protocol.c5;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Vector;

class dt implements Runnable {
    private static final String[] z;
    final c5 a;
    final ale b;
    final String c;
    final String d;
    final int e;

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
        r2 = "4H'";
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
        r0 = "\"]56\u0004.]56\u000e&N36\u000b&O\u001ah\t&_<6\u001b1B0i\\";
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
        r2 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 67;
        goto L_0x0038;
    L_0x0043:
        r2 = 45;
        goto L_0x0038;
    L_0x0046:
        r2 = 69;
        goto L_0x0038;
    L_0x0049:
        r2 = 25;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dt.<clinit>():void");
    }

    dt(ale com_whatsapp_ale, c5 c5Var, String str, int i, String str2) {
        this.b = com_whatsapp_ale;
        this.a = c5Var;
        this.d = str;
        this.e = i;
        this.c = str2;
    }

    public void run() {
        int i = App.az;
        c5 c5Var = new c5();
        m8 d = App.P.d(this.a.b);
        if (d != null) {
            try {
                if (d.w()) {
                    c5Var.b = d.f();
                    try {
                        c5Var.l = Long.parseLong(d.s);
                    } catch (NumberFormatException e) {
                        Log.e(z[1] + d.s + " " + e);
                    }
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        Collection<l6> b = bd.i(d.e).b();
        c5Var.j = new Vector(b.size());
        for (l6 l6Var : b) {
            c5 c5Var2 = new c5();
            c5Var2.b = l6Var.d;
            c5Var2.g = l6Var.c;
            c5Var.j.add(c5Var2);
            if (i != 0) {
                break;
            }
        }
        App.a(this.d, c5Var, this.e);
        App.a(this.d, this.c, z[0]);
    }
}
