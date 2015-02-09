package com.whatsapp;

import com.whatsapp.VoiceService.VoiceServiceEventCallback;

class a3t implements Runnable {
    final VoiceServiceEventCallback a;

    public void run() {
        this.a.bufferQueue.a();
    }

    a3t(VoiceServiceEventCallback voiceServiceEventCallback) {
        this.a = voiceServiceEventCallback;
    }
}
