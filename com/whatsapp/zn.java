package com.whatsapp;

import android.telephony.PhoneStateListener;

class zn extends PhoneStateListener {
    final VoiceService a;

    public void onCallStateChanged(int i, String str) {
        boolean d = VoiceService.d(this.a);
        VoiceService.d(this.a, i != 0);
        if (d != VoiceService.d(this.a)) {
            VoiceService.c(this.a);
        }
    }

    zn(VoiceService voiceService) {
        this.a = voiceService;
    }
}
