package com.whatsapp.gallerypicker;

class a2 extends Thread {
    final GalleryPicker a;

    public void run() {
        GalleryPicker.c(this.a);
    }

    a2(GalleryPicker galleryPicker, String str) {
        this.a = galleryPicker;
        super(str);
    }
}
