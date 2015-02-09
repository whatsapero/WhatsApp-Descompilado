package com.whatsapp.notification;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.whatsapp.App;

class o implements Runnable {
    final PopupNotification a;

    public void run() {
        View childAt = PopupNotification.q(this.a).getChildAt(PopupNotification.a(this.a, 0));
        Animation translateAnimation = new TranslateAnimation((float) (((App.as() ? 1 : -1) * (-childAt.getWidth())) / 2), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration((long) PopupNotification.g());
        translateAnimation.setFillAfter(true);
        childAt.startAnimation(translateAnimation);
    }

    o(PopupNotification popupNotification) {
        this.a = popupNotification;
    }
}
