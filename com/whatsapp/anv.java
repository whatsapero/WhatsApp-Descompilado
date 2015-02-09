package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.util.Log;
import java.io.IOException;

class anv implements TextWatcher {
    private static final String[] z;
    private afi a;
    final ChangeNumber b;

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
        r2 = "g\u0017";
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
        r0 = "X;\u0017xV^=\u0003{S^!YaPO0\u001esC\u00142\u0010bTI'\u0013nEX;\u0017xV^7VpPR?\u0013r\u0011W<\u0019}DK\u0010\u0019c_O!\u000fU^_6VpCT>VU^N=\u0002dHk;\u0019xTr=\u0010y";
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
        r2 = 49;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 59;
        goto L_0x0038;
    L_0x0043:
        r2 = 83;
        goto L_0x0038;
    L_0x0046:
        r2 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        goto L_0x0038;
    L_0x0049:
        r2 = 22;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.anv.<clinit>():void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        Throwable th;
        String str;
        Throwable th2;
        String str2 = null;
        try {
            if (editable != null) {
                if (editable.length() > 0) {
                    str2 = ats.f(editable.toString());
                    try {
                        this.a.a = str2;
                    } catch (Throwable e) {
                        th = e;
                        str = str2;
                        th2 = th;
                        Log.b(z[1], th2);
                        str2 = str;
                        if (!this.a.e.getText().toString().equals("")) {
                        }
                    }
                    if (!this.a.e.getText().toString().equals("") && str2 != null) {
                        ChangeNumber.a(this.b, str2, this.a);
                        this.a.c.setText(this.a.c.getText().toString().replaceAll(z[0], ""));
                        return;
                    }
                }
            }
            this.a.a = null;
        } catch (IOException e2) {
            throw e2;
        } catch (Throwable e3) {
            th = e3;
            str = null;
            th2 = th;
        }
        try {
            if (!this.a.e.getText().toString().equals("")) {
            }
        } catch (IOException e4) {
            throw e4;
        }
    }

    public anv(ChangeNumber changeNumber, afi com_whatsapp_afi) {
        this.b = changeNumber;
        this.a = com_whatsapp_afi;
    }
}
