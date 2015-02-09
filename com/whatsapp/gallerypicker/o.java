package com.whatsapp.gallerypicker;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class o implements OnItemClickListener {
    final GalleryPicker a;

    o(GalleryPicker galleryPicker) {
        this.a = galleryPicker;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        GalleryPicker.a(this.a, i);
    }
}
