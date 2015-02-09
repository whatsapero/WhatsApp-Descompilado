package com.whatsapp.gallerypicker;

import android.support.v4.view.ViewPager.OnPageChangeListener;

class b3 implements OnPageChangeListener {
    final ImagePreview a;

    b3(ImagePreview imagePreview) {
        this.a = imagePreview;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        ImagePreview.a(this.a, i);
    }
}
