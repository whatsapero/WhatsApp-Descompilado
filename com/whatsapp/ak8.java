package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import java.util.Collection;

final class ak8 implements OnClickListener {
    private static final String[] z;
    final int a;
    final CheckBox b;
    final Activity c;
    final Collection d;
    final boolean e;
    final String f;
    final ams g;

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
        r2 = "+\u001d\u0011{\u000f \u0013\b&\u00198\u0002#%\n-\u0014\u0019'\u001d&\u0011\u0019&";
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
        r0 = "8\u0000\u00193',\u0017\u00100\f--\u00110\u001c!\u0013";
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
        r2 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 72;
        goto L_0x0038;
    L_0x0043:
        r2 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        goto L_0x0038;
    L_0x0046:
        r2 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        goto L_0x0038;
    L_0x0049:
        r2 = 85;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ak8.<clinit>():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r7, int r8) {
        /*
        r6_this = this;
        r1 = 1;
        r2 = 0;
        r0 = r6.c;
        r3 = r6.a;
        r0.removeDialog(r3);
        r0 = r6.b;
        if (r0 == 0) goto L_0x0082;
    L_0x000d:
        r0 = r6.b;
        r0 = r0.isChecked();
        if (r0 == 0) goto L_0x0082;
    L_0x0015:
        r0 = r1;
    L_0x0016:
        r3 = r6.e;
        if (r0 == r3) goto L_0x0033;
    L_0x001a:
        r3 = com.whatsapp.App.p;
        r4 = z;
        r4 = r4[r2];
        r3 = r3.getSharedPreferences(r4, r2);
        r3 = r3.edit();
        r4 = z;
        r4 = r4[r1];
        r3 = r3.putBoolean(r4, r0);
        r3.commit();
    L_0x0033:
        r3 = r6.f;
        r4 = r6.d;
        com.whatsapp.App.a(r3, r4, r0);
        r0 = r6.d;
        r0 = r0.size();
        if (r0 != r1) goto L_0x0052;
    L_0x0042:
        r0 = r6.c;
        r0 = r0.getBaseContext();
        r3 = 2131624527; // 0x7f0e024f float:1.8876236E38 double:1.0531624486E-314;
        com.whatsapp.App.b(r0, r3, r2);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x007c;
    L_0x0052:
        r0 = r6.c;
        r0 = r0.getBaseContext();
        r3 = com.whatsapp.App.aX;
        r4 = 2131558421; // 0x7f0d0015 float:1.8742157E38 double:1.053129788E-314;
        r5 = r6.d;
        r5 = r5.size();
        r3 = r3.a(r4, r5);
        r1 = new java.lang.Object[r1];
        r4 = r6.d;
        r4 = r4.size();
        r4 = java.lang.Integer.valueOf(r4);
        r1[r2] = r4;
        r1 = java.lang.String.format(r3, r1);
        com.whatsapp.App.a(r0, r1, r2);
    L_0x007c:
        r0 = r6.g;
        r0.a();
        return;
    L_0x0082:
        r0 = r2;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ak8.onClick(android.content.DialogInterface, int):void");
    }

    ak8(Activity activity, int i, CheckBox checkBox, boolean z, String str, Collection collection, ams com_whatsapp_ams) {
        this.c = activity;
        this.a = i;
        this.b = checkBox;
        this.e = z;
        this.f = str;
        this.d = collection;
        this.g = com_whatsapp_ams;
    }
}
