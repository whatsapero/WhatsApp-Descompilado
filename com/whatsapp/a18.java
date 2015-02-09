package com.whatsapp;

import android.text.TextUtils.TruncateAt;

class a18 implements Runnable {
    final zb a;

    public void run() {
        if (zb.a(this.a).equals(this.a.b.r.e)) {
            Conversation.af(this.a.b);
            Conversation.X(this.a.b).setEllipsize(TruncateAt.END);
        }
    }

    a18(zb zbVar) {
        this.a = zbVar;
    }
}
