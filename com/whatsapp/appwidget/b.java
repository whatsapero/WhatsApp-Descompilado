package com.whatsapp.appwidget;

import android.os.Build.VERSION;
import android.os.Bundle;
import com.actionbarsherlock.R;
import java.util.ArrayList;

class b implements Runnable {
    private static final String[] z;
    final e a;
    final ArrayList b;

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
        r2 = "Iw]\u0013\u0019L`H0=Aie!\u0019OoY";
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
        r0 = "Iw]\u0013\u0019L`H0=Aiz-\u0014\\o";
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
            case 2: goto L_0x0045;
            case 3: goto L_0x0048;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 40;
        goto L_0x0038;
    L_0x0043:
        r2 = 7;
        goto L_0x0038;
    L_0x0045:
        r2 = 45;
        goto L_0x0038;
    L_0x0048:
        r2 = 68;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.appwidget.b.<clinit>():void");
    }

    public void run() {
        boolean z = WidgetProvider.b;
        WidgetProvider.a(this.b);
        int[] a = e.a(this.a);
        int length = a.length;
        int i = 0;
        while (i < length) {
            int i2;
            int i3;
            int i4 = a[i];
            if (VERSION.SDK_INT >= 16) {
                Bundle appWidgetOptions = e.c(this.a).getAppWidgetOptions(i4);
                if (appWidgetOptions != null) {
                    i2 = appWidgetOptions.getInt(z[1]);
                    i3 = appWidgetOptions.getInt(z[0]);
                    if (i2 == 0 || i3 == 0) {
                        i3 = Integer.MAX_VALUE;
                        i2 = Integer.MAX_VALUE;
                    }
                    e.c(this.a).updateAppWidget(i4, WidgetProvider.b(e.b(this.a), i4, i2, i3));
                    if (WidgetProvider.b(i2, i3)) {
                        e.c(this.a).notifyAppWidgetViewDataChanged(i4, R.id.list_view_widget);
                    }
                    i3 = i + 1;
                    if (z) {
                        i = i3;
                    } else {
                        return;
                    }
                }
            }
            i3 = Integer.MAX_VALUE;
            i2 = Integer.MAX_VALUE;
            e.c(this.a).updateAppWidget(i4, WidgetProvider.b(e.b(this.a), i4, i2, i3));
            if (WidgetProvider.b(i2, i3)) {
                e.c(this.a).notifyAppWidgetViewDataChanged(i4, R.id.list_view_widget);
            }
            i3 = i + 1;
            if (z) {
                i = i3;
            } else {
                return;
            }
        }
    }

    b(e eVar, ArrayList arrayList) {
        this.a = eVar;
        this.b = arrayList;
    }
}
