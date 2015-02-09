package com.whatsapp.wallpaper;

class m implements Runnable {
    final ImageViewTouchBase a;
    final f b;
    final boolean c;

    m(ImageViewTouchBase imageViewTouchBase, f fVar, boolean z) {
        this.a = imageViewTouchBase;
        this.b = fVar;
        this.c = z;
    }

    public void run() {
        this.a.setImageRotateBitmapResetBase(this.b, this.c);
    }
}
