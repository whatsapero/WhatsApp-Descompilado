package com.whatsapp;

import android.text.TextWatcher;

class a5k implements TextWatcher {
    private static final String[] z;
    final RegisterPhone a;

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
        r2 = "T0G8bR0R~aN:N4>E:U?eT,W0eE=E#>G3T4cR0X%rN4N6tBuL>~M P\u0012~S;T#he:D41@'O<1e:U?eT,p9~H0i?wIuF0xJ0D";
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
        r0 = "z\u0011";
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
        r2 = 17;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 38;
        goto L_0x0038;
    L_0x0043:
        r2 = 85;
        goto L_0x0038;
    L_0x0046:
        r2 = 32;
        goto L_0x0038;
    L_0x0049:
        r2 = 81;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a5k.<clinit>():void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r6) {
        /*
        r5_this = this;
        r2 = com.whatsapp.App.az;
        r1 = 0;
        r0 = r5.a;	 Catch:{ IOException -> 0x0096 }
        r0 = com.whatsapp.RegisterPhone.c(r0);	 Catch:{ IOException -> 0x0096 }
        if (r0 == 0) goto L_0x00a3;
    L_0x000b:
        r0 = r5.a;	 Catch:{ IOException -> 0x0096 }
        r0 = com.whatsapp.RegisterPhone.c(r0);	 Catch:{ IOException -> 0x0096 }
        r0 = com.whatsapp.ats.d(r0);	 Catch:{ IOException -> 0x0096 }
        r3 = r6.toString();	 Catch:{ IOException -> 0x0096 }
        r0 = r0.equalsIgnoreCase(r3);	 Catch:{ IOException -> 0x0096 }
        if (r0 == 0) goto L_0x00a3;
    L_0x001f:
        r0 = r5.a;	 Catch:{ IOException -> 0x0098 }
        r0 = com.whatsapp.RegisterPhone.c(r0);	 Catch:{ IOException -> 0x0098 }
    L_0x0025:
        r1 = r5.a;	 Catch:{ IOException -> 0x00c9 }
        r1 = r1.r;	 Catch:{ IOException -> 0x00c9 }
        r1 = r1.e;	 Catch:{ IOException -> 0x00c9 }
        r1 = r1.getText();	 Catch:{ IOException -> 0x00c9 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x00c9 }
        r3 = "";
        r1 = r1.equals(r3);	 Catch:{ IOException -> 0x00c9 }
        if (r1 == 0) goto L_0x004f;
    L_0x003b:
        r1 = r5.a;	 Catch:{ IOException -> 0x00cb }
        r1 = r1.r;	 Catch:{ IOException -> 0x00cb }
        r1 = r1.f;	 Catch:{ IOException -> 0x00cb }
        r3 = r5.a;	 Catch:{ IOException -> 0x00cb }
        r4 = 2131624726; // 0x7f0e0316 float:1.887664E38 double:1.053162547E-314;
        r3 = r3.getString(r4);	 Catch:{ IOException -> 0x00cb }
        r1.setText(r3);	 Catch:{ IOException -> 0x00cb }
        if (r2 == 0) goto L_0x0095;
    L_0x004f:
        if (r0 != 0) goto L_0x0065;
    L_0x0051:
        r1 = r5.a;	 Catch:{ IOException -> 0x00cd }
        r1 = r1.r;	 Catch:{ IOException -> 0x00cd }
        r1 = r1.f;	 Catch:{ IOException -> 0x00cd }
        r3 = r5.a;	 Catch:{ IOException -> 0x00cd }
        r4 = 2131624734; // 0x7f0e031e float:1.8876656E38 double:1.053162551E-314;
        r3 = r3.getString(r4);	 Catch:{ IOException -> 0x00cd }
        r1.setText(r3);	 Catch:{ IOException -> 0x00cd }
        if (r2 == 0) goto L_0x0095;
    L_0x0065:
        r1 = r5.a;
        r1 = r1.r;
        r1 = r1.f;
        r1.setText(r0);
        r1 = r5.a;
        com.whatsapp.RegisterPhone.a(r1, r0);
        r0 = r5.a;
        r0 = r0.r;
        r0 = r0.c;
        r0 = r0.getText();
        r0 = r0.toString();
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r2 = "";
        r0 = r0.replaceAll(r1, r2);
        r1 = r5.a;
        r1 = r1.r;
        r1 = r1.c;
        r1.setText(r0);
    L_0x0095:
        return;
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0098 }
    L_0x0098:
        r0 = move-exception;
        r3 = z;
        r4 = 0;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r0);
        r0 = r1;
        goto L_0x0025;
    L_0x00a3:
        r0 = r5.a;	 Catch:{ IOException -> 0x00bd }
        r0 = com.whatsapp.RegisterPhone.c(r0);	 Catch:{ IOException -> 0x00bd }
        if (r0 == 0) goto L_0x00b3;
    L_0x00ab:
        if (r6 == 0) goto L_0x00c1;
    L_0x00ad:
        r0 = r6.length();	 Catch:{ IOException -> 0x00bf }
        if (r0 <= 0) goto L_0x00c1;
    L_0x00b3:
        r0 = r6.toString();	 Catch:{ IOException -> 0x0098 }
        r0 = com.whatsapp.ats.f(r0);	 Catch:{ IOException -> 0x0098 }
        goto L_0x0025;
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0098 }
    L_0x00c1:
        r0 = r5.a;	 Catch:{ IOException -> 0x0098 }
        r0 = com.whatsapp.RegisterPhone.c(r0);	 Catch:{ IOException -> 0x0098 }
        goto L_0x0025;
    L_0x00c9:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00cb }
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a5k.afterTextChanged(android.text.Editable):void");
    }

    a5k(RegisterPhone registerPhone) {
        this.a = registerPhone;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
