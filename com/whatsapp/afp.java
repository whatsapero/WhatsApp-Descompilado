package com.whatsapp;

import android.os.CountDownTimer;
import android.text.format.DateUtils;
import com.actionbarsherlock.R;

class afp extends CountDownTimer {
    final VerifySms a;

    afp(VerifySms verifySms, long j, long j2) {
        this.a = verifySms;
        super(j, j2);
    }

    public void onTick(long j) {
        VerifySms.z(this.a).setText(this.a.getString(R.string.verify_voice_call_button_disabled, new Object[]{DateUtils.getRelativeTimeSpanString(System.currentTimeMillis() + j, System.currentTimeMillis(), 0)}));
    }

    public void onFinish() {
        VerifySms.z(this.a).setText(this.a.getString(R.string.verify_voice_call_button));
        VerifySms.z(this.a).setEnabled(true);
    }
}
