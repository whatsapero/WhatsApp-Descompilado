package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

class e2 implements Runnable {
    final Conversation a;

    public void run() {
        if (Conversation.M(this.a) != null) {
            Conversation.M(this.a).setVisibility(8);
        }
        if (Conversation.Q(this.a) != null) {
            Conversation.Q(this.a).setVisibility(8);
        }
        if (Conversation.ai(this.a) != null && Conversation.ai(this.a).getVisibility() != 8) {
            Conversation.ai(this.a).setVisibility(8);
            Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
            translateAnimation.setDuration(200);
            Conversation.ai(this.a).startAnimation(translateAnimation);
        }
    }

    e2(Conversation conversation) {
        this.a = conversation;
    }
}
