package com.whatsapp;

import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class zo extends Drawable {
    private int a;
    private int b;
    private Paint c;
    final Broadcasts d;
    private Paint e;

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int getOpacity() {
        return 0;
    }

    public zo(Broadcasts broadcasts, int i, int i2) {
        this.d = broadcasts;
        this.e = new Paint(1);
        this.c = new Paint(1);
        this.a = i2;
        this.b = i;
    }

    public void draw(Canvas canvas) {
        float f = (am1.a().g * 3.0f) / 2.0f;
        Rect rect = new Rect(getBounds());
        rect.right = (int) (((float) rect.right) - (2.0f * f));
        rect.bottom = (int) (((float) rect.bottom) - (2.0f * f));
        int min = (Math.min(rect.width(), rect.height()) / 2) - ((int) f);
        MaskFilter blurMaskFilter = new BlurMaskFilter(f, Blur.NORMAL);
        this.e.setColor(-10066330);
        this.e.setStyle(Style.FILL);
        this.e.setMaskFilter(blurMaskFilter);
        canvas.translate((2.0f * f) / 3.0f, f);
        canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), (float) min, this.e);
        canvas.translate((-2.0f * f) / 3.0f, -f);
        this.e.setMaskFilter(null);
        this.c.setStrokeWidth(1.0f);
        this.c.setStyle(Style.STROKE);
        this.c.setColor(-1728053248);
        canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), (float) min, this.c);
        RectF rectF = new RectF(rect.exactCenterX() - ((float) min), rect.exactCenterY() - ((float) min), rect.exactCenterX() + ((float) min), rect.exactCenterY() + ((float) min));
        this.c.setStyle(Style.FILL);
        if (this.a == 0) {
            this.c.setColor(-1728001024);
            canvas.drawArc(rectF, 270.0f, 360.0f, true, this.c);
            if (App.az == 0) {
                return;
            }
        }
        this.c.setColor(-1728001024);
        canvas.drawArc(rectF, 270.0f, (float) ((this.b * 360) / this.a), true, this.c);
        this.c.setColor(-1426063361);
        canvas.drawArc(rectF, (float) (((this.b * 360) / this.a) + 270), (float) (360 - ((this.b * 360) / this.a)), true, this.c);
    }
}
