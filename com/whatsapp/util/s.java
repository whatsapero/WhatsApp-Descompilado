package com.whatsapp.util;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class s implements AnimatorUpdateListener {
    final FloatingChildLayout a;

    s(FloatingChildLayout floatingChildLayout) {
        this.a = floatingChildLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setBackgroundColorAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
