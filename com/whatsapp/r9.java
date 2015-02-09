package com.whatsapp;

import android.support.v4.view.ViewPager.OnPageChangeListener;

class r9 implements OnPageChangeListener {
    final ContactPicker a;

    r9(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageSelected(int i) {
        this.a.getSupportActionBar().setSelectedNavigationItem(i);
    }
}
