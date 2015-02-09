package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class amo implements OnClickListener {
    final PagerSlidingTabStrip a;
    final int b;

    public void onClick(View view) {
        PagerSlidingTabStrip.b(this.a).setCurrentItem(this.b);
    }

    amo(PagerSlidingTabStrip pagerSlidingTabStrip, int i) {
        this.a = pagerSlidingTabStrip;
        this.b = i;
    }
}
