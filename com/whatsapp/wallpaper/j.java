package com.whatsapp.wallpaper;

import android.view.View;
import android.view.View.OnClickListener;

class j implements OnClickListener {
    final CropImage a;

    public void onClick(View view) {
        this.a.setResult(0);
        this.a.finish();
    }

    j(CropImage cropImage) {
        this.a = cropImage;
    }
}
