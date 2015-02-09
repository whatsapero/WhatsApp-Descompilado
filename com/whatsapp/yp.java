package com.whatsapp;

import android.app.Activity;
import android.os.Handler;

final class yp implements Runnable {
    final m8 a;
    final Activity b;
    final boolean c;
    final Handler d;
    final ho e;

    yp(m8 m8Var, boolean z, Handler handler, ho hoVar, Activity activity) {
        this.a = m8Var;
        this.c = z;
        this.d = handler;
        this.e = hoVar;
        this.b = activity;
    }

    public void run() {
        this.d.post(new a_w(this, App.aJ.c(this.a.e, this.c)));
    }
}
