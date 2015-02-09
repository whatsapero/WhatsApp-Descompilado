package com.whatsapp.wallpaper;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;

class i extends BaseAdapter {
    private static final String[] z;
    final WallpaperPicker a;
    private LayoutInflater b;

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
        r2 = "a/*\u0000\"\u00049=\f?@46\bpP5-\u00022J<1\u0003pV8+&4\u0019";
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
        r0 = "\u0004;7\u001dpS<4\u0003 E-=\u001dp\u0007";
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
        r2 = 80;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 36;
        goto L_0x0038;
    L_0x0043:
        r2 = 93;
        goto L_0x0038;
    L_0x0046:
        r2 = 88;
        goto L_0x0038;
    L_0x0049:
        r2 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.i.<clinit>():void");
    }

    public int getCount() {
        return WallpaperPicker.b(this.a).size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    i(WallpaperPicker wallpaperPicker, WallpaperPicker wallpaperPicker2) {
        this.a = wallpaperPicker;
        this.b = wallpaperPicker2.getLayoutInflater();
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
        r5_this = this;
        r4 = 1;
        r3 = 0;
        r1 = com.whatsapp.wallpaper.ImageViewTouchBase.e;
        if (r7 != 0) goto L_0x0013;
    L_0x0006:
        r0 = r5.b;
        r2 = 2130903217; // 0x7f0300b1 float:1.7413246E38 double:1.052806074E-314;
        r0 = r0.inflate(r2, r8, r3);
        r0 = (android.widget.ImageView) r0;
        if (r1 == 0) goto L_0x0060;
    L_0x0013:
        r7 = (android.widget.ImageView) r7;
    L_0x0015:
        r0 = r5.a;
        r0 = com.whatsapp.wallpaper.WallpaperPicker.b(r0);
        r0 = r0.get(r6);
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r2 = r5.a;
        r2 = r2.c;
        r2 = r2.getDrawable(r0);
        r7.setImageDrawable(r2);
        r2 = r7.getDrawable();
        if (r2 == 0) goto L_0x003b;
    L_0x0036:
        r2.setDither(r4);
        if (r1 == 0) goto L_0x005f;
    L_0x003b:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = z;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r0 = r0.append(r6);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x005f:
        return r7;
    L_0x0060:
        r7 = r0;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.i.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
