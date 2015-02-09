package com.whatsapp;

import android.view.View;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;

class _i implements Runnable {
    private static final String[] z;
    final Conversation a;
    final b b;

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
        r2 = "\u000e\u0013`\u001cQ\u001f\u000fo\u001e]\u0002\u0012!\u0018Q\u000b\u000ek\u0019\\W\\`\u0005\u0014\u001b\u0015k\u001d\u0014\u000b\u0013|J";
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
        r0 = "MT";
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
        r2 = 52;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        goto L_0x0038;
    L_0x0043:
        r2 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        goto L_0x0038;
    L_0x0046:
        r2 = 14;
        goto L_0x0038;
    L_0x0049:
        r2 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp._i.<clinit>():void");
    }

    _i(Conversation conversation, b bVar) {
        this.a = conversation;
        this.b = bVar;
    }

    public void run() {
        View findViewWithTag = this.a.bd.findViewWithTag(this.b);
        if (findViewWithTag != null) {
            ((ConversationRow) findViewWithTag).n();
            if (App.az == 0) {
                return;
            }
        }
        if (!Conversation.a(this.a).contains(this.b)) {
            Conversation.a(this.a).add(this.b);
            Log.w(z[0] + this.b.e.a + " " + this.a.bd.getFirstVisiblePosition() + "-" + this.a.bd.getLastVisiblePosition() + z[1] + this.a.bd.getCount() + ")");
        }
    }
}
