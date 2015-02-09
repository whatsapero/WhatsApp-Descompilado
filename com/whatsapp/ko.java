package com.whatsapp;

import android.support.v4.view.ViewPager.OnPageChangeListener;

class ko implements OnPageChangeListener {
    final PagerSlidingTabStrip a;

    public void onPageScrolled(int i, float f, int i2) {
        PagerSlidingTabStrip.a(this.a, i);
        PagerSlidingTabStrip.a(this.a, f);
        PagerSlidingTabStrip.a(this.a, i, (int) (((float) PagerSlidingTabStrip.a(this.a).getChildAt(i).getWidth()) * f));
        this.a.invalidate();
        if (this.a.w != null) {
            this.a.w.onPageScrolled(i, f, i2);
        }
    }

    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            PagerSlidingTabStrip.a(this.a, PagerSlidingTabStrip.b(this.a).getCurrentItem(), 0);
        }
        if (this.a.w != null) {
            this.a.w.onPageScrollStateChanged(i);
        }
    }

    ko(PagerSlidingTabStrip pagerSlidingTabStrip, tt ttVar) {
        this(pagerSlidingTabStrip);
    }

    public void onPageSelected(int i) {
        if (this.a.w != null) {
            this.a.w.onPageSelected(i);
        }
    }

    private ko(PagerSlidingTabStrip pagerSlidingTabStrip) {
        this.a = pagerSlidingTabStrip;
    }
}
