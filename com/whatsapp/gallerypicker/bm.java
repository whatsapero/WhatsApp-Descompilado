package com.whatsapp.gallerypicker;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;

class bm implements OnCreateContextMenuListener {
    final GalleryPicker a;

    bm(GalleryPicker galleryPicker) {
        this.a = galleryPicker;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        GalleryPicker.a(this.a, contextMenu, contextMenuInfo);
    }
}
