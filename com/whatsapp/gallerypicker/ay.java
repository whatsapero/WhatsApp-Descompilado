package com.whatsapp.gallerypicker;

import android.database.ContentObserver;
import android.os.Handler;

class ay extends ContentObserver {
    final GalleryPicker a;

    ay(GalleryPicker galleryPicker, Handler handler) {
        this.a = galleryPicker;
        super(handler);
    }

    public void onChange(boolean z) {
        GalleryPicker.a(this.a, false, ao.a(this.a.getContentResolver()));
    }
}
