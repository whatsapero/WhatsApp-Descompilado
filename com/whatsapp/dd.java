package com.whatsapp;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

class dd implements Runnable {
    final dk a;

    public void run() {
        VideoPreviewActivity.a(this.a.a).setVisibility(8);
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(600);
        VideoPreviewActivity.a(this.a.a).startAnimation(alphaAnimation);
    }

    dd(dk dkVar) {
        this.a = dkVar;
    }
}
