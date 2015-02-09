package com.whatsapp;

import android.app.Activity;
import android.text.format.DateUtils;
import android.view.View;
import com.actionbarsherlock.R;

class oc implements ul {
    int a;
    final ConversationRowVoiceNote b;

    oc(ConversationRowVoiceNote conversationRowVoiceNote) {
        this.b = conversationRowVoiceNote;
        this.a = -1;
    }

    public void a(boolean z) {
        Activity b = this.b.b();
        if (b != null) {
            View findViewById = b.findViewById(R.id.proximity_overlay);
            if (findViewById != null) {
                int i;
                if (z) {
                    i = 0;
                } else {
                    i = 4;
                }
                findViewById.setVisibility(i);
            }
        }
    }

    public void b() {
        ConversationRowVoiceNote.d(this.b).setImageResource(R.drawable.inline_audio_pause);
        ConversationRowVoiceNote.b().remove(this.b.h.e);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
        r4_this = this;
        r0 = r4.b;
        r0 = com.whatsapp.ConversationRowVoiceNote.d(r0);
        r1 = 2130838914; // 0x7f020582 float:1.7282824E38 double:1.052774304E-314;
        r0.setImageResource(r1);
        r0 = r4.b;
        r0 = r0.h;
        r0 = r0.p;
        if (r0 == 0) goto L_0x002c;
    L_0x0014:
        r0 = r4.b;
        r0 = com.whatsapp.ConversationRowVoiceNote.c(r0);
        r1 = r4.b;
        r1 = r1.h;
        r1 = r1.p;
        r2 = (long) r1;
        r1 = android.text.format.DateUtils.formatElapsedTime(r2);
        r0.setText(r1);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0046;
    L_0x002c:
        r0 = r4.b;
        r0 = com.whatsapp.ConversationRowVoiceNote.c(r0);
        r1 = r4.b;
        r1 = com.whatsapp.ConversationRowVoiceNote.a(r1);
        r1 = r1.f();
        r1 = r1 / 1000;
        r2 = (long) r1;
        r1 = android.text.format.DateUtils.formatElapsedTime(r2);
        r0.setText(r1);
    L_0x0046:
        r0 = com.whatsapp.ConversationRowVoiceNote.b();
        r1 = r4.b;
        r1 = r1.h;
        r1 = r1.e;
        r0 = r0.containsKey(r1);
        if (r0 != 0) goto L_0x006d;
    L_0x0056:
        r0 = r4.b;
        r0 = com.whatsapp.ConversationRowVoiceNote.b(r0);
        r1 = 0;
        r0.setProgress(r1);
        r0 = com.whatsapp.ConversationRowVoiceNote.b();
        r1 = r4.b;
        r1 = r1.h;
        r1 = r1.e;
        r0.remove(r1);
    L_0x006d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.oc.a():void");
    }

    public void c() {
        ConversationRowVoiceNote.d(this.b).setImageResource(R.drawable.inline_audio_pause);
        ConversationRowVoiceNote.b(this.b).setMax(ConversationRowVoiceNote.a(this.b).f());
        ConversationRowVoiceNote.b().remove(this.b.h.e);
        this.a = -1;
    }

    public void a(int i) {
        if (this.a != i / 1000) {
            this.a = i / 1000;
            ConversationRowVoiceNote.c(this.b).setText(DateUtils.formatElapsedTime((long) this.a));
        }
        ConversationRowVoiceNote.b(this.b).setProgress(i);
    }

    public void d() {
        ConversationRowVoiceNote.b().put(this.b.h.e, Integer.valueOf(ConversationRowVoiceNote.a(this.b).c()));
        ConversationRowVoiceNote.d(this.b).setImageResource(R.drawable.inline_audio_play);
        this.a = ConversationRowVoiceNote.a(this.b).c() / 1000;
        ConversationRowVoiceNote.c(this.b).setText(DateUtils.formatElapsedTime((long) this.a));
        ConversationRowVoiceNote.b(this.b).setProgress(ConversationRowVoiceNote.a(this.b).c());
    }
}
