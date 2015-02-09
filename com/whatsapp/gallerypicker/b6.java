package com.whatsapp.gallerypicker;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener;

class b6 implements OnMenuItemClickListener {
    private static final String[] z;
    final Intent a;
    final GalleryPicker b;
    final ResolveInfo c;

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
        r2 = ".\u0005ki9%\u000br4/=\u001aY7<(\fc5+#\tc4";
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
        r0 = "*\u000bj++?\u0013";
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
            case 3: goto L_0x0048;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 78;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 77;
        goto L_0x0038;
    L_0x0043:
        r2 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        goto L_0x0038;
    L_0x0046:
        r2 = 6;
        goto L_0x0038;
    L_0x0048:
        r2 = 71;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.b6.<clinit>():void");
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.b.getSharedPreferences(z[0], 0).edit().putString(z[1] + GalleryPicker.f(this.b), this.c.activityInfo.packageName + "_" + this.c.activityInfo.name).commit();
        this.a.setComponent(new ComponentName(this.c.activityInfo.packageName, this.c.activityInfo.name));
        this.b.startActivityForResult(this.a, 1);
        return false;
    }

    b6(GalleryPicker galleryPicker, ResolveInfo resolveInfo, Intent intent) {
        this.b = galleryPicker;
        this.c = resolveInfo;
        this.a = intent;
    }
}
