package com.whatsapp.util;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

class a3 implements Runnable {
    final FloatingChildLayout a;

    a3(FloatingChildLayout floatingChildLayout) {
        this.a = floatingChildLayout;
    }

    public void run() {
        if (FloatingChildLayout.c()) {
            FloatingChildLayout.c(this.a).setDuration((long) FloatingChildLayout.a(this.a)).start();
            if (Log.e == 0) {
                return;
            }
        }
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration((long) FloatingChildLayout.a(this.a));
        alphaAnimation.setFillAfter(true);
        this.a.setBackgroundColor(2130706432);
        this.a.startAnimation(alphaAnimation);
    }
}
