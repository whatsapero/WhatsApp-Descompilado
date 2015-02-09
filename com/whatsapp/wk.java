package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;

class wk extends ShapeDrawable {
    final MediaView a;

    public int getIntrinsicWidth() {
        return (int) (am1.a().g * 16.0f);
    }

    wk(MediaView mediaView) {
        this.a = mediaView;
    }

    public int getIntrinsicHeight() {
        return (int) (am1.a().g * 16.0f);
    }

    public int getOpacity() {
        return 0;
    }

    public void draw(Canvas canvas) {
    }
}
