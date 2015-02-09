package com.whatsapp;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import com.actionbarsherlock.R;

class fn implements Runnable {
    final VoipActivity a;

    public void run() {
        TextView textView = (TextView) this.a.findViewById(R.id.user_hint);
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(400);
        textView.setAnimation(alphaAnimation);
        textView.setVisibility(4);
    }

    fn(VoipActivity voipActivity) {
        this.a = voipActivity;
    }
}
