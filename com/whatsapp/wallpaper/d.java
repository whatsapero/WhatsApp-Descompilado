package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class d implements OnCancelListener {
    final WallpaperPicker a;

    d(WallpaperPicker wallpaperPicker) {
        this.a = wallpaperPicker;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(1);
        this.a.finish();
    }
}
