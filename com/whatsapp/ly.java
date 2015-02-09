package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import com.whatsapp.fieldstats.al;
import com.whatsapp.fieldstats.h;
import com.whatsapp.notification.t;

class ly implements OnClickListener {
    private static final String[] z;
    final Conversation a;
    final CheckBox b;
    final int[] c;
    final int[] d;

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
        r2 = "\u00127\u0016\u0017\u0011\u0013#\u0011\u0006\u0011\r3\t\u0006-\n?\n\r";
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
        r0 = "\u001d9\bM9\u00167\u0011\u0010/\u000e&:\u0013<\u001b0\u0000\u0011+\u00105\u0000\u0010";
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
        r2 = 78;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        goto L_0x0038;
    L_0x0043:
        r2 = 86;
        goto L_0x0038;
    L_0x0046:
        r2 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x0038;
    L_0x0049:
        r2 = 99;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ly.<clinit>():void");
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        App.p.getSharedPreferences(z[1], 0).edit().putInt(z[0], this.d[0]).commit();
        long j = (((long) this.c[this.d[0]]) * 60) * 1000;
        if (bd.f(this.a.r.e)) {
            c hVar = new h();
            hVar.a = Double.valueOf((double) j);
            hVar.b = Double.valueOf((double) bd.i(this.a.r.e).h());
            al.a(this.a, hVar);
        }
        t.a(this.a, this.a.r.e, j + System.currentTimeMillis(), this.b.isChecked());
    }

    ly(Conversation conversation, int[] iArr, int[] iArr2, CheckBox checkBox) {
        this.a = conversation;
        this.d = iArr;
        this.c = iArr2;
        this.b = checkBox;
    }
}
