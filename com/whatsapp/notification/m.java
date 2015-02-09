package com.whatsapp.notification;

import android.text.format.DateUtils;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.cb;
import com.whatsapp.ul;

class m implements ul {
    final PopupNotification a;
    final ImageButton b;
    final TextView c;
    int d;
    final cb e;
    final ProgressBar f;

    public void a(boolean z) {
        this.a.findViewById(R.id.proximity_overlay).setVisibility(z ? 0 : 4);
    }

    public void d() {
        this.b.setImageResource(R.drawable.inline_audio_play);
    }

    public void c() {
        this.b.setImageResource(R.drawable.inline_audio_pause);
        this.f.setMax(this.e.f());
        this.d = -1;
    }

    public void a() {
        this.b.setImageResource(R.drawable.inline_audio_play);
        this.f.setProgress(0);
        this.c.setText(DateUtils.formatElapsedTime((long) (this.e.f() / 1000)));
    }

    public void a(int i) {
        int min = Math.min(i, this.f.getMax());
        if (this.d != min / 1000) {
            this.d = min / 1000;
            this.c.setText(DateUtils.formatElapsedTime((long) this.d));
        }
        if (this.f.getProgress() < min) {
            this.f.setProgress(min);
        }
    }

    public void b() {
        this.b.setImageResource(R.drawable.inline_audio_pause);
    }

    m(PopupNotification popupNotification, ImageButton imageButton, ProgressBar progressBar, cb cbVar, TextView textView) {
        this.a = popupNotification;
        this.b = imageButton;
        this.f = progressBar;
        this.e = cbVar;
        this.c = textView;
        this.d = -1;
    }
}
