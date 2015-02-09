package com.whatsapp;

import android.location.Address;
import android.text.Html;
import com.actionbarsherlock.R;

class cj implements Runnable {
    private static final String[] z;
    final StringBuilder a;
    final cm b;
    final Address c;

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
        r6 = 11;
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "yq%57',h5";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000c:
        r2 = r2.toCharArray();
        r7 = r2.length;
        r8 = r7;
        r9 = r1;
        r7 = r2;
    L_0x0014:
        if (r8 > r9) goto L_0x0031;
    L_0x0016:
        r2 = new java.lang.String;
        r2.<init>(r7);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002c;
            default: goto L_0x0022;
        };
    L_0x0022:
        r4[r3] = r2;
        r2 = 1;
        r0 = "y<y";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000c;
    L_0x002c:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x0031:
        r10 = r7[r9];
        r2 = r9 % 5;
        switch(r2) {
            case 0: goto L_0x0041;
            case 1: goto L_0x0044;
            case 2: goto L_0x0047;
            case 3: goto L_0x004a;
            default: goto L_0x0038;
        };
    L_0x0038:
        r2 = r6;
    L_0x0039:
        r2 = r2 ^ r10;
        r2 = (char) r2;
        r7[r9] = r2;
        r2 = r9 + 1;
        r9 = r2;
        goto L_0x0014;
    L_0x0041:
        r2 = 69;
        goto L_0x0039;
    L_0x0044:
        r2 = 94;
        goto L_0x0039;
    L_0x0047:
        r2 = 71;
        goto L_0x0039;
    L_0x004a:
        r2 = r6;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.cj.<clinit>():void");
    }

    public void run() {
        if (this.c.getMaxAddressLineIndex() > 0) {
            LocationPicker2.w(this.b.c).name = this.c.getAddressLine(0);
        }
        LocationPicker2.w(this.b.c).address = this.a.toString();
        LocationPicker2.d(this.b.c).setText(Html.fromHtml(z[1] + this.b.c.getString(R.string.send_this_location) + z[0] + this.a.toString()));
    }

    cj(cm cmVar, Address address, StringBuilder stringBuilder) {
        this.b = cmVar;
        this.c = address;
        this.a = stringBuilder;
    }
}
