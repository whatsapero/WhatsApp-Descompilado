package com.whatsapp;

import android.text.TextWatcher;

class nh implements TextWatcher {
    private static final String[] z;
    final DeleteAccount a;

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
        r2 = "*X0cC+\u0010=eT!H2r\u00189\\(e_+OsgQ:X.rR6I?nV Z9b\u0017(\\5jR*\u001d0iX%H,EX;S(tN\rR8c\u0017(O3k\u0017\rR)hC<D\fnX X\u0015hQ!";
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
        r0 = "\u0012y";
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
        r2 = 55;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 78;
        goto L_0x0038;
    L_0x0043:
        r2 = 61;
        goto L_0x0038;
    L_0x0046:
        r2 = 92;
        goto L_0x0038;
    L_0x0049:
        r2 = 6;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.nh.<clinit>():void");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r6) {
        /*
        r5_this = this;
        r2 = com.whatsapp.App.az;
        r1 = 0;
        r0 = r5.a;	 Catch:{ IOException -> 0x008a }
        r0 = com.whatsapp.DeleteAccount.a(r0);	 Catch:{ IOException -> 0x008a }
        if (r0 == 0) goto L_0x0097;
    L_0x000b:
        r0 = r5.a;	 Catch:{ IOException -> 0x008a }
        r0 = com.whatsapp.DeleteAccount.a(r0);	 Catch:{ IOException -> 0x008a }
        r0 = com.whatsapp.ats.d(r0);	 Catch:{ IOException -> 0x008a }
        r3 = r6.toString();	 Catch:{ IOException -> 0x008a }
        r0 = r0.equalsIgnoreCase(r3);	 Catch:{ IOException -> 0x008a }
        if (r0 == 0) goto L_0x0097;
    L_0x001f:
        r0 = r5.a;	 Catch:{ IOException -> 0x008c }
        r0 = com.whatsapp.DeleteAccount.a(r0);	 Catch:{ IOException -> 0x008c }
    L_0x0025:
        r1 = r5.a;	 Catch:{ IOException -> 0x00bd }
        r1 = r1.j;	 Catch:{ IOException -> 0x00bd }
        r1 = r1.getText();	 Catch:{ IOException -> 0x00bd }
        r1 = r1.toString();	 Catch:{ IOException -> 0x00bd }
        r3 = "";
        r1 = r1.equals(r3);	 Catch:{ IOException -> 0x00bd }
        if (r1 == 0) goto L_0x004b;
    L_0x0039:
        r1 = r5.a;	 Catch:{ IOException -> 0x00bf }
        r1 = r1.r;	 Catch:{ IOException -> 0x00bf }
        r3 = r5.a;	 Catch:{ IOException -> 0x00bf }
        r4 = 2131624726; // 0x7f0e0316 float:1.887664E38 double:1.053162547E-314;
        r3 = r3.getString(r4);	 Catch:{ IOException -> 0x00bf }
        r1.setText(r3);	 Catch:{ IOException -> 0x00bf }
        if (r2 == 0) goto L_0x0089;
    L_0x004b:
        if (r0 != 0) goto L_0x005f;
    L_0x004d:
        r1 = r5.a;	 Catch:{ IOException -> 0x00c1 }
        r1 = r1.r;	 Catch:{ IOException -> 0x00c1 }
        r3 = r5.a;	 Catch:{ IOException -> 0x00c1 }
        r4 = 2131624734; // 0x7f0e031e float:1.8876656E38 double:1.053162551E-314;
        r3 = r3.getString(r4);	 Catch:{ IOException -> 0x00c1 }
        r1.setText(r3);	 Catch:{ IOException -> 0x00c1 }
        if (r2 == 0) goto L_0x0089;
    L_0x005f:
        r1 = r5.a;
        r1 = r1.r;
        r1.setText(r0);
        r1 = r5.a;
        com.whatsapp.DeleteAccount.a(r1, r0);
        r0 = r5.a;
        r0 = r0.o;
        r0 = r0.getText();
        r0 = r0.toString();
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r2 = "";
        r0 = r0.replaceAll(r1, r2);
        r1 = r5.a;
        r1 = r1.o;
        r1.setText(r0);
    L_0x0089:
        return;
    L_0x008a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        r3 = z;
        r4 = 0;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r0);
        r0 = r1;
        goto L_0x0025;
    L_0x0097:
        r0 = r5.a;	 Catch:{ IOException -> 0x00b1 }
        r0 = com.whatsapp.DeleteAccount.a(r0);	 Catch:{ IOException -> 0x00b1 }
        if (r0 == 0) goto L_0x00a7;
    L_0x009f:
        if (r6 == 0) goto L_0x00b5;
    L_0x00a1:
        r0 = r6.length();	 Catch:{ IOException -> 0x00b3 }
        if (r0 <= 0) goto L_0x00b5;
    L_0x00a7:
        r0 = r6.toString();	 Catch:{ IOException -> 0x008c }
        r0 = com.whatsapp.ats.f(r0);	 Catch:{ IOException -> 0x008c }
        goto L_0x0025;
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x008c }
    L_0x00b5:
        r0 = r5.a;	 Catch:{ IOException -> 0x008c }
        r0 = com.whatsapp.DeleteAccount.a(r0);	 Catch:{ IOException -> 0x008c }
        goto L_0x0025;
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.nh.afterTextChanged(android.text.Editable):void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    nh(DeleteAccount deleteAccount) {
        this.a = deleteAccount;
    }
}
