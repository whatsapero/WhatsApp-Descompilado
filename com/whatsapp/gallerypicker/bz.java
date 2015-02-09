package com.whatsapp.gallerypicker;

import android.widget.AdapterView.OnItemLongClickListener;

class bz implements OnItemLongClickListener {
    private static final String[] z;
    final ImageGallery a;

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
        r2 = "\u000e\u00001sVZY";
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
        r0 = "G\u000e?a]I\u00022j]\\\u001aqoLK\u000e2iVI\u00002o[EL~vW]\n*oW@Y";
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
        r2 = 56;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 46;
        goto L_0x0038;
    L_0x0043:
        r2 = 99;
        goto L_0x0038;
    L_0x0046:
        r2 = 94;
        goto L_0x0038;
    L_0x0049:
        r2 = 6;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.bz.<clinit>():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onItemLongClick(android.widget.AdapterView r6, android.view.View r7, int r8, long r9) {
        /*
        r5_this = this;
        r4 = 1;
        r0 = com.whatsapp.gallerypicker.ImagePreview.y;
        r1 = r5.a;
        r1 = com.whatsapp.gallerypicker.ImageGallery.k(r1);
        r1 = r1.a(r8);
        if (r1 == 0) goto L_0x0047;
    L_0x000f:
        r2 = r5.a;
        r2 = com.whatsapp.gallerypicker.ImageGallery.l(r2);
        if (r2 == 0) goto L_0x001e;
    L_0x0017:
        r2 = r5.a;
        com.whatsapp.gallerypicker.ImageGallery.a(r2, r1);
        if (r0 == 0) goto L_0x0072;
    L_0x001e:
        r2 = r5.a;
        r2 = com.whatsapp.gallerypicker.ImageGallery.a(r2);
        r1 = r1.a();
        r2.add(r1);
        r1 = r5.a;
        r2 = r5.a;
        r3 = r5.a;
        r3 = com.whatsapp.gallerypicker.ImageGallery.c(r3);
        r2 = r2.startActionMode(r3);
        com.whatsapp.gallerypicker.ImageGallery.a(r1, r2);
        r1 = r5.a;
        r1 = com.whatsapp.gallerypicker.ImageGallery.d(r1);
        r1.notifyDataSetChanged();
        if (r0 == 0) goto L_0x0072;
    L_0x0047:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r5.a;
        r1 = com.whatsapp.gallerypicker.ImageGallery.b(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x0072:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.bz.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
    }

    bz(ImageGallery imageGallery) {
        this.a = imageGallery;
    }
}
