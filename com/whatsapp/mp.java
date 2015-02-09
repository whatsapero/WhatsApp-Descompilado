package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

class mp implements Runnable {
    final rc a;

    public void run() {
        this.a.a.setVisibility(8);
        Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setAnimationListener(new c8(this));
        translateAnimation.setDuration(200);
        this.a.a.startAnimation(translateAnimation);
    }

    mp(rc rcVar) {
        this.a = rcVar;
    }
}
