package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class amb implements AnimationListener {
    final ConversationsFragment a;
    final int b;

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        ConversationsFragment.c(this.a).post(new anj(this));
    }

    public void onAnimationStart(Animation animation) {
    }

    amb(ConversationsFragment conversationsFragment, int i) {
        this.a = conversationsFragment;
        this.b = i;
    }
}
