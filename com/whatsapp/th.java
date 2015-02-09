package com.whatsapp;

import android.graphics.Bitmap;

class th implements Runnable {
    final Bitmap a;
    final v9 b;

    th(v9 v9Var, Bitmap bitmap) {
        this.b = v9Var;
        this.a = bitmap;
    }

    public void run() {
        CallLogActivity.a(this.b.a).setImageBitmap(this.a);
    }
}
