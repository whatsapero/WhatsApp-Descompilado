package com.whatsapp.util;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

public class b3 extends InsetDrawable {
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.scale(-1.0f, 1.0f, getBounds().exactCenterX(), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    public b3(Drawable drawable) {
        super(drawable, 0);
    }
}
