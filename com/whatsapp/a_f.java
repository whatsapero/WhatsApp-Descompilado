package com.whatsapp;

import com.whatsapp.fieldstats.t;
import java.util.TimerTask;

class a_f extends TimerTask {
    final a89 a;

    public void run() {
        if (!a89.a(this.a)) {
            this.a.g = true;
            a89.a().remove(a89.b(this.a).toString());
            if (!this.a.i) {
                a89.n.obtainMessage(2, this.a.c).sendToTarget();
            }
            a89.a(this.a, t.TIMEOUT);
        }
    }

    public a_f(a89 com_whatsapp_a89) {
        this.a = com_whatsapp_a89;
    }
}
