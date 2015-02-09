package com.whatsapp.gallerypicker;

class a7 implements Runnable {
    final GalleryPicker a;

    a7(GalleryPicker galleryPicker) {
        this.a = galleryPicker;
    }

    public void run() {
        GalleryPicker.h(this.a);
    }
}
