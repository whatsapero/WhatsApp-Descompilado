package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

public class o extends n {
    private static final String[] z;
    private final String a;
    private boolean b;
    private long c;

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
        r2 = "{)p\u000fVs#:\u0014Wn\"z\t\u0017{$`\u0014VtiB4|M";
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
        r0 = "y(ySXt#f\u0012P~iv\u000fVm4q\u000f\u0017{7d\u0011Py&`\u0014Vt\u0018}\u0019";
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
        r2 = 57;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 26;
        goto L_0x0038;
    L_0x0043:
        r2 = 71;
        goto L_0x0038;
    L_0x0046:
        r2 = 20;
        goto L_0x0038;
    L_0x0049:
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.o.<clinit>():void");
    }

    public boolean a(View view, MotionEvent motionEvent) {
        this.b = motionEvent.getAction() == 0;
        view.invalidate();
        if (motionEvent.getAction() == 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.c > 1000) {
                this.c = elapsedRealtime;
                Uri parse = Uri.parse(this.a);
                Context context = view.getContext();
                Intent intent = new Intent(z[0], parse);
                intent.putExtra(z[1], context.getPackageName());
                App.a(context, intent);
            }
        }
        return false;
    }

    public o(String str) {
        this.a = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateDrawState(android.text.TextPaint r2) {
        /*
        r1_this = this;
        r0 = r1.b;
        if (r0 == 0) goto L_0x0012;
    L_0x0004:
        r0 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        r2.setColor(r0);
        r0 = 1711315404; // 0x660099cc float:1.5182499E23 double:8.455021503E-315;
        r2.bgColor = r0;
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x001a;
    L_0x0012:
        r0 = r2.linkColor;
        r2.setColor(r0);
        r0 = 0;
        r2.bgColor = r0;
    L_0x001a:
        r0 = 1;
        r2.setUnderlineText(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.o.updateDrawState(android.text.TextPaint):void");
    }
}
