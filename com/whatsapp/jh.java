package com.whatsapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class jh extends AnimatorListenerAdapter {
    final MediaView a;
    final Runnable b;

    jh(MediaView mediaView, Runnable runnable) {
        this.a = mediaView;
        this.b = runnable;
    }

    public void onAnimationEnd(Animator animator) {
        this.b.run();
    }
}
