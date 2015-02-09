package com.whatsapp.gallerypicker;

class bk implements Runnable {
    final at a;
    final GalleryPicker b;

    public void run() {
        GalleryPicker.a(this.b, this.a);
    }

    bk(GalleryPicker galleryPicker, at atVar) {
        this.b = galleryPicker;
        this.a = atVar;
    }
}
