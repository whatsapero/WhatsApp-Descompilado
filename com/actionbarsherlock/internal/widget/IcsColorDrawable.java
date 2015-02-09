package com.actionbarsherlock.internal.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public class IcsColorDrawable extends Drawable {
    private int color;
    private final Paint paint;

    public int getOpacity() {
        return this.color >>> 24;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setAlpha(int i) {
        if (i != (this.color >>> 24)) {
            this.color = (this.color & 16777215) & (i << 24);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if ((this.color >>> 24) != 0) {
            this.paint.setColor(this.color);
            canvas.drawRect(getBounds(), this.paint);
        }
    }

    public IcsColorDrawable(int i) {
        this.paint = new Paint();
        this.color = i;
    }
}
