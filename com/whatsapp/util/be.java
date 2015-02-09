package com.whatsapp.util;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.am1;

class be extends Drawable {
    String a;
    Path b;
    Paint c;

    public void draw(Canvas canvas) {
        int i = Log.e;
        Rect bounds = getBounds();
        float height = (3.0f * ((float) bounds.height())) / 5.0f;
        this.c.setTextSize(height);
        this.c.setStyle(Style.FILL);
        canvas.drawText(this.a, (float) ((bounds.left + bounds.right) / 2), ((float) bounds.top) + height, this.c);
        this.c.setStyle(Style.STROKE);
        height += height / 6.0f;
        this.b.reset();
        this.b.moveTo((float) (bounds.left + 1), (float) (bounds.bottom - 1));
        this.b.lineTo((float) (bounds.left + 1), (float) (bounds.top + 1));
        this.b.lineTo((float) bounds.right, (float) (bounds.top + 1));
        this.b.lineTo((float) bounds.right, ((float) bounds.top) + height);
        this.b.lineTo((float) (bounds.left + 1), ((float) bounds.top) + height);
        this.b.setFillType(FillType.WINDING);
        canvas.drawPath(this.b, this.c);
        if (i != 0) {
            DialogToastActivity.i = !DialogToastActivity.i;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    public int getOpacity() {
        return -3;
    }

    public int getIntrinsicHeight() {
        return (int) (am1.a().g * 32.0f);
    }

    public int getIntrinsicWidth() {
        return (int) (am1.a().g * 32.0f);
    }

    public be(String str) {
        this.b = new Path();
        this.a = str;
        this.c = new Paint();
        this.c.setColor(-16777216);
        this.c.setAntiAlias(true);
        this.c.setFakeBoldText(true);
        this.c.setStyle(Style.FILL);
        this.c.setTextAlign(Align.CENTER);
    }

    public void setAlpha(int i) {
        this.c.setAlpha(i);
    }
}
