package com.whatsapp;

import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.protocol.b;

final class atn implements Runnable {
    final m8 a;
    final b b;

    atn(m8 m8Var, b bVar) {
        this.a = m8Var;
        this.b = bVar;
    }

    public void run() {
        App.b(new o0(this));
        App.aJ.a(this.a.e, this.b);
        App.p(this.a.e);
        WidgetProvider.a(App.p);
        App.w();
    }
}
