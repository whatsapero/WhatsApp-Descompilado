package com.whatsapp;

import android.os.Binder;

public class a36 extends Binder {
    final VoiceService a;

    public VoiceService a() {
        return this.a;
    }

    public a36(VoiceService voiceService) {
        this.a = voiceService;
    }
}
