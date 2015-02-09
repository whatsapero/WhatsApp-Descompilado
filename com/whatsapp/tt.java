package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class tt implements OnGlobalLayoutListener {
    final PagerSlidingTabStrip a;

    tt(PagerSlidingTabStrip pagerSlidingTabStrip) {
        this.a = pagerSlidingTabStrip;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"NewApi"})
    public void onGlobalLayout() {
        /*
        r3_this = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 >= r1) goto L_0x0013;
    L_0x0006:
        r0 = r3.a;
        r0 = r0.getViewTreeObserver();
        r0.removeGlobalOnLayoutListener(r3);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x001c;
    L_0x0013:
        r0 = r3.a;
        r0 = r0.getViewTreeObserver();
        r0.removeOnGlobalLayoutListener(r3);
    L_0x001c:
        r0 = r3.a;
        r1 = r3.a;
        r1 = com.whatsapp.PagerSlidingTabStrip.b(r1);
        r1 = r1.getCurrentItem();
        com.whatsapp.PagerSlidingTabStrip.a(r0, r1);
        r0 = r3.a;
        r1 = r3.a;
        r1 = com.whatsapp.PagerSlidingTabStrip.c(r1);
        r2 = 0;
        com.whatsapp.PagerSlidingTabStrip.a(r0, r1, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.tt.onGlobalLayout():void");
    }
}
