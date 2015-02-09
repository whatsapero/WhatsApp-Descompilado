package com.whatsapp;

import android.view.View;
import android.view.animation.Animation;

class hg extends Animation {
    final asj a;
    final int b;
    final int c;
    final View d;

    hg(asj com_whatsapp_asj, View view, int i, int i2) {
        this.a = com_whatsapp_asj;
        this.d = view;
        this.c = i;
        this.b = i2;
    }

    public boolean willChangeBounds() {
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void applyTransformation(float r5, android.view.animation.Transformation r6) {
        /*
        r4_this = this;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x0013;
    L_0x0006:
        r0 = r4.d;
        r0 = r0.getLayoutParams();
        r1 = -2;
        r0.height = r1;
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0026;
    L_0x0013:
        r0 = r4.d;
        r0 = r0.getLayoutParams();
        r1 = r4.c;
        r2 = r4.b;
        r3 = r4.c;
        r2 = r2 - r3;
        r2 = (float) r2;
        r2 = r2 * r5;
        r2 = (int) r2;
        r1 = r1 + r2;
        r0.height = r1;
    L_0x0026:
        r0 = r4.d;
        r0.requestLayout();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.hg.applyTransformation(float, android.view.animation.Transformation):void");
    }
}
