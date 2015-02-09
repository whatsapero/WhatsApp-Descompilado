package com.whatsapp;

import android.app.Activity;
import android.text.format.DateUtils;
import android.view.View;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;
import com.whatsapp.util.b0;

class ud implements ul {
    final b a;
    int b;
    final ConversationRowAudio c;

    public void c() {
        ConversationRowAudio.d(this.c).setText(R.string.record_audio_stop);
        ConversationRowAudio.d(this.c).setOnClickListener(ConversationRowAudio.b(this.c));
        ConversationRowAudio.e(this.c).setVisibility(0);
        ConversationRowAudio.c(this.c).setImageDrawable(new ex(this.c.getContext(), b0.e(this.c.getContext()), this.c.h.e.b));
        ConversationRowAudio.a(this.c).setTextColor(-9801869);
        ConversationRowAudio.a(this.c).setCompoundDrawablesWithIntrinsicBounds(R.drawable.mark_stop, 0, 0, 0);
        this.b = -1;
    }

    public void a(int i) {
        if (this.b != i / 1000) {
            this.b = i / 1000;
            ConversationRowAudio.a(this.c).setText(DateUtils.formatElapsedTime((long) this.b));
        }
    }

    public void b() {
    }

    ud(ConversationRowAudio conversationRowAudio, b bVar) {
        this.c = conversationRowAudio;
        this.a = bVar;
        this.b = -1;
    }

    public void a(boolean z) {
        Activity b = this.c.b();
        if (b != null) {
            View findViewById = b.findViewById(R.id.proximity_overlay);
            if (findViewById != null) {
                findViewById.setVisibility(z ? 0 : 4);
            }
        }
    }

    public void d() {
        if (ConversationRowAudio.f(this.c) != null) {
            ConversationRowAudio.f(this.c).o();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
        r6_this = this;
        r3 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r6.c;
        r0 = com.whatsapp.ConversationRowAudio.d(r0);
        r2 = 2131624681; // 0x7f0e02e9 float:1.8876549E38 double:1.0531625247E-314;
        r0.setText(r2);
        r0 = r6.c;
        r0 = com.whatsapp.ConversationRowAudio.e(r0);
        r2 = 8;
        r0.setVisibility(r2);
        r0 = r6.c;
        r0 = com.whatsapp.ConversationRowAudio.a(r0);
        r2 = -1;
        r0.setTextColor(r2);
        r0 = r6.c;
        r0 = com.whatsapp.ConversationRowAudio.a(r0);
        r2 = 2130838936; // 0x7f020598 float:1.7282868E38 double:1.052774315E-314;
        r0.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r3, r3);
        r0 = r6.a;
        r0 = com.whatsapp.util.bo.b(r0);
        if (r0 == 0) goto L_0x0054;
    L_0x0038:
        r2 = r6.c;
        r2 = com.whatsapp.ConversationRowAudio.c(r2);
        r3 = new com.whatsapp.ex;
        r4 = r6.c;
        r4 = r4.getContext();
        r5 = r6.a;
        r5 = r5.e;
        r5 = r5.b;
        r3.<init>(r4, r0, r5);
        r2.setImageDrawable(r3);
        if (r1 == 0) goto L_0x0078;
    L_0x0054:
        r0 = r6.c;
        r0 = com.whatsapp.ConversationRowAudio.c(r0);
        r2 = new com.whatsapp.ex;
        r3 = r6.c;
        r3 = r3.getContext();
        r4 = r6.c;
        r4 = r4.getContext();
        r4 = com.whatsapp.util.b0.c(r4);
        r5 = r6.a;
        r5 = r5.e;
        r5 = r5.b;
        r2.<init>(r3, r4, r5);
        r0.setImageDrawable(r2);
    L_0x0078:
        r0 = r6.a;
        r0 = r0.p;
        if (r0 == 0) goto L_0x0089;
    L_0x007e:
        r0 = r6.a;
        r0 = r0.p;
        r2 = (long) r0;
        r0 = android.text.format.DateUtils.formatElapsedTime(r2);
        if (r1 == 0) goto L_0x0093;
    L_0x0089:
        r0 = com.whatsapp.App.p;
        r1 = r6.a;
        r2 = r1.k;
        r0 = android.text.format.Formatter.formatShortFileSize(r0, r2);
    L_0x0093:
        r1 = r6.c;
        r1 = com.whatsapp.ConversationRowAudio.a(r1);
        r1.setText(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ud.a():void");
    }
}
