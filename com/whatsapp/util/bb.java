package com.whatsapp.util;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.protocol.b;

class bb implements Runnable {
    private ImageView a;
    private b b;
    final bo c;
    private bf d;
    private Bitmap e;

    public void run() {
        if (this.a.getTag() != null && this.a.getTag().equals(this.b.e)) {
            this.d.a(this.a, this.e, this.b);
            bo.a(this.c).remove(this.b.e);
            if (this.e != null) {
                bo.b(this.c).put(this.b.e, this.e);
                bo.c(this.c).add(this.b.e);
                if (Log.e == 0) {
                    return;
                }
            }
            return;
        }
        if (this.e != null) {
            this.e.recycle();
        }
    }

    public bb(bo boVar, Bitmap bitmap, ImageView imageView, b bVar, bf bfVar) {
        this.c = boVar;
        this.e = bitmap;
        this.a = imageView;
        this.b = bVar;
        this.d = bfVar;
    }
}
