package com.whatsapp.util;

import android.graphics.Bitmap;
import android.widget.ImageView;

class bz implements Runnable {
    private Bitmap a;
    private ImageView b;
    private String c;
    final bw d;

    public void run() {
        int i = Log.e;
        if (this.b.getTag() != null && this.b.getTag().equals(this.c)) {
            if (this.a != null) {
                this.b.setImageBitmap(this.a);
                if (i == 0) {
                    return;
                }
            }
            if (bw.a(this.d) != 0) {
                this.b.setImageResource(bw.a(this.d));
                if (i == 0) {
                    return;
                }
            }
            this.b.setVisibility(8);
        }
    }

    public bz(bw bwVar, Bitmap bitmap, ImageView imageView, String str) {
        this.d = bwVar;
        this.a = bitmap;
        this.b = imageView;
        this.c = str;
    }
}
