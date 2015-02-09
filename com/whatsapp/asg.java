package com.whatsapp;

import android.os.CountDownTimer;

class asg extends CountDownTimer {
    final String a;
    final WebSessionsActivity b;

    public void onTick(long j) {
    }

    asg(WebSessionsActivity webSessionsActivity, long j, long j2, String str) {
        this.b = webSessionsActivity;
        this.a = str;
        super(j, j2);
    }

    public void onFinish() {
        a12.b(this.a);
        WebSessionsActivity.b(this.b).remove(this.a);
        WebSessionsActivity.e(this.b).a(a12.g());
    }
}
