package com.whatsapp;

import android.os.ConditionVariable;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

final class a3r implements Runnable {
    private static final String[] z;
    final HashMap a;
    final boolean b;
    final ConditionVariable c;
    final ConditionVariable d;

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
        r2 = "\u00037\u001e$WM1\bgWQ7\u00145\u0012";
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
        r0 = "B5\u000bhJN5\u000bhAF+\u001fhCQ\u001a\b\"\\G\u001a\u0018(\\Ue\u000b5WF(\u000b3\b";
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
        r2 = 50;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 35;
        goto L_0x0038;
    L_0x0043:
        r2 = 69;
        goto L_0x0038;
    L_0x0046:
        r2 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        goto L_0x0038;
    L_0x0049:
        r2 = 71;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a3r.<clinit>():void");
    }

    a3r(HashMap hashMap, boolean z, ConditionVariable conditionVariable, ConditionVariable conditionVariable2) {
        this.a = hashMap;
        this.b = z;
        this.c = conditionVariable;
        this.d = conditionVariable2;
    }

    public void run() {
        int i = App.az;
        List arrayList = new ArrayList();
        try {
            for (b bVar : this.a.values()) {
                if (bVar != null) {
                    arrayList.add(bVar);
                }
                if (i != 0) {
                    break;
                }
            }
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            Log.e(z[1] + this.b + z[0] + e2.toString());
        }
        App.a(0, arrayList, true, this.b, this.c, this.d);
    }
}
