package com.whatsapp;

import android.os.CountDownTimer;
import android.text.format.DateUtils;

class oa extends CountDownTimer {
    final CircularProgressBar a;
    final SpamWarningActivity b;

    oa(SpamWarningActivity spamWarningActivity, long j, long j2, CircularProgressBar circularProgressBar) {
        this.b = spamWarningActivity;
        this.a = circularProgressBar;
        super(j, j2);
    }

    public void onTick(long j) {
        this.a.setCenterText(DateUtils.formatElapsedTime((long) (((int) j) / 1000)));
        this.a.setProgress((int) j);
    }

    public void onFinish() {
        this.b.finish();
    }
}
