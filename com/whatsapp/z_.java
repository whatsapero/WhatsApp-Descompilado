package com.whatsapp;

import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;

class z_ implements OnTouchListener {
    private float a;
    final View b;
    final int c;
    final dz d;
    final TextView e;
    final TextView f;

    z_(dz dzVar, TextView textView, TextView textView2, int i, View view) {
        this.d = dzVar;
        this.e = textView;
        this.f = textView2;
        this.c = i;
        this.b = view;
        this.a = 0.0f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
        r7_this = this;
        r6 = 0;
        r0 = com.whatsapp.App.az;
        r1 = r9.getAction();
        switch(r1) {
            case 0: goto L_0x000b;
            case 1: goto L_0x0041;
            case 2: goto L_0x006d;
            case 3: goto L_0x0041;
            default: goto L_0x000a;
        };
    L_0x000a:
        return r6;
    L_0x000b:
        r1 = r7.e;
        r1 = r1.getText();
        r1 = r1.toString();
        r1 = r1.trim();
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 == 0) goto L_0x000a;
    L_0x001f:
        r1 = r7.d;
        r1.h();
        r1 = r9.getX();
        r7.a = r1;
        r1 = com.whatsapp.App.as();
        if (r1 == 0) goto L_0x0039;
    L_0x0030:
        r1 = r7.f;
        r2 = r7.c;
        r1.setPadding(r6, r6, r2, r6);
        if (r0 == 0) goto L_0x000a;
    L_0x0039:
        r0 = r7.f;
        r1 = r7.c;
        r0.setPadding(r1, r6, r6, r6);
        goto L_0x000a;
    L_0x0041:
        r1 = r7.e;
        r1 = r1.getText();
        r1 = r1.toString();
        r1 = r1.trim();
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x0066;
    L_0x0055:
        r1 = r7.d;
        r1.b(r6);
        r1 = r7.b;
        r1.playSoundEffect(r6);
        r1 = r7.d;
        r1.a();
        if (r0 == 0) goto L_0x000a;
    L_0x0066:
        r0 = r7.d;
        r1 = 1;
        r0.b(r1);
        goto L_0x000a;
    L_0x006d:
        r1 = r9.getX();
        r2 = r7.e;
        r2 = r2.getWidth();
        r2 = (float) r2;
        r1 = r1 / r2;
        r1 = java.lang.Math.abs(r1);
        r2 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x008a;
    L_0x0083:
        r2 = r7.d;
        r2.b(r6);
        if (r0 == 0) goto L_0x00ac;
    L_0x008a:
        r2 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x00a5;
    L_0x0091:
        r2 = r7.d;
        r3 = 0;
        r4 = 1066192077; // 0x3f8ccccd float:1.1 double:5.26768877E-315;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = r1 * r5;
        r1 = r4 - r1;
        r1 = java.lang.Math.max(r3, r1);
        com.whatsapp.dz.a(r2, r1);
        if (r0 == 0) goto L_0x00ac;
    L_0x00a5:
        r1 = r7.d;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        com.whatsapp.dz.a(r1, r2);
    L_0x00ac:
        r1 = com.whatsapp.App.as();
        if (r1 == 0) goto L_0x00cd;
    L_0x00b2:
        r1 = r7.c;
        r2 = r7.c;
        r2 = r2 / 2;
        r2 = (float) r2;
        r3 = r7.a;
        r2 = r2 + r3;
        r3 = r9.getX();
        r2 = r2 - r3;
        r2 = (int) r2;
        r1 = java.lang.Math.max(r1, r2);
        r2 = r7.f;
        r2.setPadding(r6, r6, r1, r6);
        if (r0 == 0) goto L_0x000a;
    L_0x00cd:
        r0 = r7.c;
        r1 = r7.c;
        r1 = r1 / 2;
        r1 = (float) r1;
        r2 = r7.a;
        r1 = r1 - r2;
        r2 = r9.getX();
        r1 = r1 + r2;
        r1 = (int) r1;
        r0 = java.lang.Math.max(r0, r1);
        r1 = r7.f;
        r1.setPadding(r0, r6, r6, r6);
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.z_.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
