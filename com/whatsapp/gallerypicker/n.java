package com.whatsapp.gallerypicker;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

class n implements Runnable {
    final ImagePreview a;

    public void run() {
        ImagePreview.f(this.a).setBackgroundColor(1962934272);
        if (!ImagePreview.e(this.a)) {
            ImagePreview.k(this.a).setTextColor(-1291845633);
            ImagePreview.r(this.a).setAlpha(178);
        }
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300);
        ImagePreview.f(this.a).startAnimation(alphaAnimation);
    }

    n(ImagePreview imagePreview) {
        this.a = imagePreview;
    }
}
