package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class q implements OnClickListener {
    final WallpaperPicker a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }

    q(WallpaperPicker wallpaperPicker) {
        this.a = wallpaperPicker;
    }
}
