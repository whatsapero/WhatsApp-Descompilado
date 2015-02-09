package com.whatsapp;

import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.ExitGroupDialogFragment;

class rb implements OnClickListener {
    private static final String[] z;
    final ExitGroupDialogFragment a;
    final m8 b;

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
        r2 = "\f\u007f#`=\u001dc,b1\u0000~>9=\u0017y99?\u001d\u007f8fb";
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
        r0 = "\f\u007f#`=\u001dc,b1\u0000~>9-\u001cu?;,\u001di`z=\u000ef(Q*\u0000e=";
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
        r2 = 88;
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
        r2 = 16;
        goto L_0x0038;
    L_0x0046:
        r2 = 77;
        goto L_0x0038;
    L_0x0049:
        r2 = 22;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.rb.<clinit>():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r5, int r6) {
        /*
        r4_this = this;
        r3 = 1;
        r2 = 0;
        r0 = z;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.a();
        if (r0 == 0) goto L_0x003c;
    L_0x000f:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r4.b;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r4.b;
        r0 = r0.e;
        com.whatsapp.App.a(r0, r3);
        r0 = new com.whatsapp.bu;
        r0.<init>(r4);
        com.whatsapp.util.br.a(r0);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x004c;
    L_0x003c:
        r0 = r4.a;
        r0 = r0.getActivity();
        r0 = r0.getBaseContext();
        r1 = 2131624321; // 0x7f0e0181 float:1.8875818E38 double:1.053162347E-314;
        com.whatsapp.App.b(r0, r1, r2);
    L_0x004c:
        r0 = com.whatsapp.ConversationsFragment.g();
        r0 = r0 + 1;
        com.whatsapp.ConversationsFragment.d(r0);
        r0 = r4.a;
        r0.dismiss();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.rb.onClick(android.content.DialogInterface, int):void");
    }

    rb(ExitGroupDialogFragment exitGroupDialogFragment, m8 m8Var) {
        this.a = exitGroupDialogFragment;
        this.b = m8Var;
    }
}
