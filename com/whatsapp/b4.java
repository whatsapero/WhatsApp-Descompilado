package com.whatsapp;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import com.actionbarsherlock.R;

class b4 implements a86 {
    final VoipActivity a;

    public void a(boolean z) {
        TextView textView = (TextView) this.a.findViewById(R.id.user_hint);
        textView.clearAnimation();
        textView.setText(z ? R.string.slide_to_answer : R.string.slide_to_reject);
        textView.setVisibility(0);
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200);
        textView.setAnimation(alphaAnimation);
        textView.removeCallbacks(VoipActivity.d(this.a));
        textView.postDelayed(VoipActivity.d(this.a), 3000);
    }

    b4(VoipActivity voipActivity) {
        this.a = voipActivity;
    }

    public void b() {
        VoipActivity.b(this.a);
    }

    public void a() {
        VoipActivity.g(this.a);
    }
}
