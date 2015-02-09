package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class b implements OnClickListener {
    final WallpaperPicker a;
    final String b;

    b(WallpaperPicker wallpaperPicker, String str) {
        this.a = wallpaperPicker;
        this.b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.startActivity(new Intent(this.b));
    }
}
