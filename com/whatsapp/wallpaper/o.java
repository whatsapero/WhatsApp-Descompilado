package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class o implements OnClickListener {
    final WallpaperPicker a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(1);
        this.a.finish();
    }

    o(WallpaperPicker wallpaperPicker) {
        this.a = wallpaperPicker;
    }
}
