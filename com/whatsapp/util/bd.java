package com.whatsapp.util;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.whatsapp.App;

public class bd extends InsetDrawable {
    public void draw(Canvas canvas) {
        if (App.as()) {
            super.draw(canvas);
            if (Log.e == 0) {
                return;
            }
        }
        canvas.save();
        canvas.scale(-1.0f, 1.0f, getBounds().exactCenterX(), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    public bd(Drawable drawable) {
        super(drawable, 0);
    }

    public boolean getPadding(Rect rect) {
        boolean padding = super.getPadding(rect);
        if (!App.as()) {
            int i = rect.right;
            rect.right = rect.left;
            rect.left = i;
        }
        return padding;
    }
}
