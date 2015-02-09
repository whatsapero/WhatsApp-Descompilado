package com.whatsapp;

import android.backport.util.Base64;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.b6;
import com.whatsapp.util.f;
import java.io.File;
import java.security.SecureRandom;

public class avr extends avq {
    private static final String[] z;
    private b6 s;
    private int t;
    private boolean u;

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
        r2 = "\u0000p\u000bCw\u0018p\u0016E=\u001bz\u0006Is\u0003o\u000eOs\u00120\rN`\u0013|\rRv\u001fq\u0005Sf\u0019o\u0012EvV";
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
        r0 = "%W#\u0011B$Q%";
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
        r2 = 18;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        goto L_0x0038;
    L_0x0043:
        r2 = 31;
        goto L_0x0038;
    L_0x0046:
        r2 = 98;
        goto L_0x0038;
    L_0x0049:
        r2 = 32;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avr.<clinit>():void");
    }

    protected String f() {
        try {
            byte[] bArr = new byte[32];
            SecureRandom.getInstance(z[1]).nextBytes(bArr);
            return Base64.encodeToString(bArr, 2);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    protected int e() {
        return this.t;
    }

    public void onPostExecute(Object obj) {
        a((rk) obj);
    }

    static boolean b(avr com_whatsapp_avr) {
        return com_whatsapp_avr.u;
    }

    public void a(rk rkVar) {
        if (rkVar == rk.SUCCESS) {
            File a = f.a(App.p, d().file, (byte) 2, 1, true);
            MediaData d = d();
            d.file.renameTo(a);
            d.file = a;
        }
        super.a(rkVar);
    }

    protected w1 i() {
        return new eh(this);
    }

    static b6 a(avr com_whatsapp_avr) {
        return com_whatsapp_avr.s;
    }

    protected long k() {
        return 65536;
    }

    static b6 a(avr com_whatsapp_avr, b6 b6Var) {
        com_whatsapp_avr.s = b6Var;
        return b6Var;
    }

    public void b(boolean z) {
        Log.i(z[0] + z);
        this.u = true;
        try {
            if (z) {
                MediaData d = d();
                g().k = d.file.length();
                App.aJ.c(g(), 1);
                if (App.az == 0) {
                    return;
                }
            }
            a();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public avr(b bVar, int i) {
        super(bVar);
        this.t = 2048;
        if (i > 0) {
            this.t = i / 8;
        }
    }
}
