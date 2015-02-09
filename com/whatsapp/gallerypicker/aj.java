package com.whatsapp.gallerypicker;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import com.whatsapp.am1;

class aj extends ShapeDrawable {
    final GalleryPicker a;

    public void draw(Canvas canvas) {
    }

    public int getIntrinsicWidth() {
        return (int) (am1.a().g * 32.0f);
    }

    public int getIntrinsicHeight() {
        return (int) (am1.a().g * 32.0f);
    }

    aj(GalleryPicker galleryPicker) {
        this.a = galleryPicker;
    }

    public int getOpacity() {
        return 0;
    }
}
