package com.whatsapp;

import android.content.Context;
import com.whatsapp.fieldstats.al;

class gz implements Runnable {
    final App a;
    final Context b;

    gz(App app, Context context) {
        this.a = app;
        this.b = context;
    }

    public void run() {
        al.j(this.b);
    }
}
