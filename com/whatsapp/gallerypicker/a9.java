package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;

class a9 implements Runnable {
    final Bitmap a;
    final Bitmap b;
    final bn c;
    final b1 d;

    a9(b1 b1Var, bn bnVar, Bitmap bitmap, Bitmap bitmap2) {
        this.d = b1Var;
        this.c = bnVar;
        this.b = bitmap;
        this.a = bitmap2;
    }

    public void run() {
        this.c.a(this.b, this.a != null);
    }
}
