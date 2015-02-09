package com.whatsapp;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.actionbarsherlock.R;

class c8 implements AnimationListener {
    final mp a;

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        View findViewById = dz.d(this.a.a.b).findViewById(R.id.emoji_picker_btn);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    c8(mp mpVar) {
        this.a = mpVar;
    }
}
