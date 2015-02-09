package com.whatsapp;

import android.view.View;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.f;
import com.whatsapp.util.ar;

class qy extends ar {
    final ConversationRowMedia b;

    qy(ConversationRowMedia conversationRowMedia) {
        this.b = conversationRowMedia;
    }

    public void a(View view) {
        if (this.b.w.e.b) {
            if (f.a(this.b.w.a, 2) >= 0) {
                App.b(this.b.getContext(), (int) R.string.file_uploaded, 0);
                return;
            }
            MediaData mediaData = (MediaData) this.b.w.A;
            if (mediaData.transcoder != null) {
                mediaData.transcoder.h();
            }
            if (mediaData.uploader != null) {
                mediaData.uploader.a();
            }
            if (App.az == 0) {
                return;
            }
        }
        ((MediaData) this.b.w.A).downloader.a();
    }
}
