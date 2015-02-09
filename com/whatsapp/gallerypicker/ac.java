package com.whatsapp.gallerypicker;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class ac implements OnItemClickListener {
    final ImageGallery a;

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ImageGallery.a(this.a, ImageGallery.k(this.a).a(i));
    }

    ac(ImageGallery imageGallery) {
        this.a = imageGallery;
    }
}
