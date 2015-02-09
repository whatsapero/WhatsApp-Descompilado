package com.whatsapp;

import com.whatsapp.util.p;

class cy implements p {
    final VoiceService a;

    cy(VoiceService voiceService) {
        this.a = voiceService;
    }

    public void a(boolean z) {
        if (z) {
            VoiceService.b(this.a);
            if (App.az == 0) {
                return;
            }
        }
        VoiceService.a(this.a);
    }
}
