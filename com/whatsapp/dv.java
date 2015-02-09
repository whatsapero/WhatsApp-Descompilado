package com.whatsapp;

import android.graphics.Bitmap;

class dv implements Runnable {
    final a5 a;
    final Bitmap b;

    public void run() {
        if (!this.a.isCancelled()) {
            ContactInfo.a(this.a.a, this.b);
        }
    }

    dv(a5 a5Var, Bitmap bitmap) {
        this.a = a5Var;
        this.b = bitmap;
    }
}
