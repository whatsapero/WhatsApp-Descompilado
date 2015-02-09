package com.whatsapp.gallerypicker;

class al implements Runnable {
    final GalleryPicker a;
    final at b;

    al(GalleryPicker galleryPicker, at atVar) {
        this.a = galleryPicker;
        this.b = atVar;
    }

    public void run() {
        GalleryPicker.a(this.a, this.b);
    }
}
