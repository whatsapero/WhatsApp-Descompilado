package com.whatsapp.util;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;

final class ay implements OnClickListener {
    private static final String[] z;
    final EditText a;
    final Activity b;
    final CheckBox c;
    final CheckBox d;

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
        r2 = "gU\u0006\u0007FVS\u0000";
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
        r0 = "{[\u001a\u0017GT[\u0004\u0016";
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
        r2 = 55;
        goto L_0x0038;
    L_0x0043:
        r2 = 58;
        goto L_0x0038;
    L_0x0046:
        r2 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        goto L_0x0038;
    L_0x0049:
        r2 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ay.<clinit>():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r4, int r5) {
        /*
        r3_this = this;
        r0 = r3.a;
        r0 = r0.getText();
        r1 = r3.d;
        r1 = r1.isChecked();
        if (r1 == 0) goto L_0x001a;
    L_0x000e:
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        com.whatsapp.util.g.a(r1);
        r1 = com.whatsapp.util.Log.e;
        if (r1 == 0) goto L_0x0022;
    L_0x001a:
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        com.whatsapp.util.g.a(r1);
    L_0x0022:
        r1 = r3.c;
        r1 = r1.isChecked();
        com.whatsapp.util.g.a(r1);
        r1 = r3.b;
        com.whatsapp.util.g.a(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ay.onClick(android.content.DialogInterface, int):void");
    }

    ay(EditText editText, CheckBox checkBox, CheckBox checkBox2, Activity activity) {
        this.a = editText;
        this.d = checkBox;
        this.c = checkBox2;
        this.b = activity;
    }
}
