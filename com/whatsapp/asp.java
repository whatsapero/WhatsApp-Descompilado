package com.whatsapp;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

class asp implements OnPreDrawListener {
    final int a;
    final MediaView b;
    final View c;
    final int d;
    final int e;
    final int f;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreDraw() {
        /*
        r6_this = this;
        r5 = 1;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r6.c;
        r0 = r0.getViewTreeObserver();
        r0.removeOnPreDrawListener(r6);
        r0 = 2;
        r0 = new int[r0];
        r1 = r6.c;
        r1.getLocationOnScreen(r0);
        r1 = r6.b;
        r2 = r6.f;
        r3 = 0;
        r3 = r0[r3];
        r2 = r2 - r3;
        com.whatsapp.MediaView.b(r1, r2);
        r1 = r6.b;
        r2 = r6.e;
        r0 = r0[r5];
        r0 = r2 - r0;
        com.whatsapp.MediaView.g(r1, r0);
        r0 = r6.b;
        r1 = r6.a;
        r1 = (float) r1;
        r2 = r6.c;
        r2 = r2.getWidth();
        r2 = (float) r2;
        r1 = r1 / r2;
        com.whatsapp.MediaView.a(r0, r1);
        r0 = r6.b;
        r1 = r6.d;
        r1 = (float) r1;
        r2 = r6.c;
        r2 = r2.getHeight();
        r2 = (float) r2;
        r1 = r1 / r2;
        com.whatsapp.MediaView.b(r0, r1);
        r0 = r6.b;
        r0 = com.whatsapp.MediaView.n(r0);
        r1 = r6.b;
        r1 = com.whatsapp.MediaView.l(r1);
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 >= 0) goto L_0x008b;
    L_0x005a:
        r0 = r6.b;
        r1 = r6.b;
        r1 = com.whatsapp.MediaView.l(r1);
        com.whatsapp.MediaView.a(r0, r1);
        r0 = r6.c;
        r0 = r0.getWidth();
        r0 = (float) r0;
        r1 = r6.b;
        r1 = com.whatsapp.MediaView.n(r1);
        r0 = r0 * r1;
        r1 = r6.b;
        r2 = r6.b;
        r2 = com.whatsapp.MediaView.s(r2);
        r2 = (float) r2;
        r3 = r6.a;
        r3 = (float) r3;
        r0 = r0 - r3;
        r0 = r0 / r4;
        r0 = r2 - r0;
        r0 = (int) r0;
        com.whatsapp.MediaView.b(r1, r0);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x00b8;
    L_0x008b:
        r0 = r6.b;
        r1 = r6.b;
        r1 = com.whatsapp.MediaView.n(r1);
        com.whatsapp.MediaView.b(r0, r1);
        r0 = r6.c;
        r0 = r0.getHeight();
        r0 = (float) r0;
        r1 = r6.b;
        r1 = com.whatsapp.MediaView.l(r1);
        r0 = r0 * r1;
        r1 = r6.b;
        r2 = r6.b;
        r2 = com.whatsapp.MediaView.g(r2);
        r2 = (float) r2;
        r3 = r6.d;
        r3 = (float) r3;
        r0 = r0 - r3;
        r0 = r0 / r4;
        r0 = r2 - r0;
        r0 = (int) r0;
        com.whatsapp.MediaView.g(r1, r0);
    L_0x00b8:
        r0 = r6.b;
        com.whatsapp.MediaView.i(r0);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.asp.onPreDraw():boolean");
    }

    asp(MediaView mediaView, View view, int i, int i2, int i3, int i4) {
        this.b = mediaView;
        this.c = view;
        this.f = i;
        this.e = i2;
        this.a = i3;
        this.d = i4;
    }
}
