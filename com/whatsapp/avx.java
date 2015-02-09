package com.whatsapp;

import com.whatsapp.messaging.au;

final class avx implements Runnable {
    public final boolean a;
    final _e b;

    avx(_e _eVar, boolean z) {
        this.b = _eVar;
        this.a = z;
    }

    public void run() {
        int i = App.az;
        if (this.a) {
            App.a(new String[]{this.b.a.e.c});
        }
        if (App.aV() && this.b.a.a != 14) {
            if (this.b.a.d() != null && ge.c && this.b.a.I < ge.b) {
                App.Q().c(au.c(this.b.a));
                if (i == 0) {
                    return;
                }
            }
            App.Q().c(au.f(this.b.a));
            if (i == 0) {
                return;
            }
        }
        App.p.Q.remove(this.b.a.e);
    }
}
