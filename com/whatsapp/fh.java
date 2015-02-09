package com.whatsapp;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

class fh implements OnSeekBarChangeListener {
    final ConversationRowVoiceNote a;
    boolean b;

    fh(ConversationRowVoiceNote conversationRowVoiceNote) {
        this.a = conversationRowVoiceNote;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (cb.a(this.a.h) && !cb.h() && this.b) {
            this.b = false;
            ConversationRowVoiceNote.a(this.a).b(ConversationRowVoiceNote.b(this.a).getProgress());
            ConversationRowVoiceNote.a(this.a).r();
        }
        ConversationRowVoiceNote.b().put(this.a.h.e, Integer.valueOf(ConversationRowVoiceNote.b(this.a).getProgress()));
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.b = false;
        if (cb.a(this.a.h) && cb.h()) {
            ConversationRowVoiceNote.a(this.a).g();
            this.b = true;
        }
    }
}
