package com.whatsapp;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;

class rc implements AnimationListener {
    final View a;
    final dz b;
    final View c;
    final View d;

    public void onAnimationStart(Animation animation) {
    }

    rc(dz dzVar, View view, View view2, View view3) {
        this.b = dzVar;
        this.c = view;
        this.d = view2;
        this.a = view3;
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        this.c.setVisibility(8);
        Animation animationSet = new AnimationSet(true);
        Animation translateAnimation = new TranslateAnimation(1, -0.3f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(150);
        Animation rotateAnimation = new RotateAnimation(-60.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(150);
        rotateAnimation.setFillAfter(true);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(translateAnimation);
        this.d.startAnimation(animationSet);
        this.a.postDelayed(new mp(this), 500);
    }
}
