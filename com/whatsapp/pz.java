package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.f;

class pz implements OnClickListener {
    final ConversationRowVoiceNote a;

    public void onClick(View view) {
        if (this.a.w.e.b) {
            if (f.a(this.a.w.a, 2) >= 0) {
                App.b(this.a.getContext(), (int) R.string.file_uploaded, 0);
                return;
            }
            ((MediaData) this.a.w.A).uploader.a();
            if (App.az == 0) {
                return;
            }
        }
        ((MediaData) this.a.w.A).downloader.a();
    }

    pz(ConversationRowVoiceNote conversationRowVoiceNote) {
        this.a = conversationRowVoiceNote;
    }
}
