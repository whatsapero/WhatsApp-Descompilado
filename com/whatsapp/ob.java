package com.whatsapp;

import android.support.v4.view.ViewPager.OnPageChangeListener;

class ob implements OnPageChangeListener {
    final MediaViewPager a;
    final MediaView b;

    public void onPageSelected(int i) {
        MediaView.d(this.a.g, i);
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    ob(MediaViewPager mediaViewPager, MediaView mediaView) {
        this.a = mediaViewPager;
        this.b = mediaView;
    }

    public void onPageScrollStateChanged(int i) {
    }
}
