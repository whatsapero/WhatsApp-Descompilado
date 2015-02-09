package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;

final class aly implements Runnable {
    private m8 a;
    private ImageView b;
    private Bitmap c;
    final fk d;

    public aly(fk fkVar, Bitmap bitmap, ImageView imageView, m8 m8Var) {
        this.d = fkVar;
        this.c = bitmap;
        this.b = imageView;
        this.a = m8Var;
    }

    public void run() {
        if (this.b.getTag() != null && this.b.getTag().equals(this.a.c(fk.b(this.d), fk.a(this.d)))) {
            if (this.c != null) {
                Drawable transitionDrawable = new TransitionDrawable(new Drawable[]{this.b.getDrawable(), new BitmapDrawable(this.c)});
                transitionDrawable.setCrossFadeEnabled(false);
                transitionDrawable.startTransition(300);
                this.b.setImageDrawable(transitionDrawable);
                if (App.az == 0) {
                    return;
                }
            }
            Bitmap j = this.a.j();
            if (!(this.b.getDrawable() instanceof BitmapDrawable) || ((BitmapDrawable) this.b.getDrawable()).getBitmap() != j) {
                this.b.setImageBitmap(j);
            }
        }
    }
}
