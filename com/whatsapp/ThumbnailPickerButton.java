package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;

public class ThumbnailPickerButton extends ThumbnailButton {
    private Path k;

    protected void a(Canvas canvas) {
        super.a(canvas);
        if (isEnabled() && this.f > 0.0f) {
            float f = 7.0f * this.f;
            this.k.reset();
            this.e.setStyle(Style.FILL);
            this.k.moveTo(this.d.right, this.d.bottom - f);
            this.k.lineTo(this.d.right, this.d.bottom - this.f);
            this.k.arcTo(new RectF(this.d.right - (this.f * 2.0f), this.d.bottom - (this.f * 2.0f), this.d.right, this.d.bottom), 0.0f, 90.0f);
            this.k.lineTo(this.d.right - f, this.d.bottom);
            this.k.lineTo(this.d.right, this.d.bottom - f);
            this.e.setColor(1409286144);
            canvas.drawPath(this.k, this.e);
            this.k.reset();
            this.k.moveTo(this.d.right, this.d.bottom - f);
            this.k.lineTo(this.d.right - f, this.d.bottom);
            this.e.setStyle(Style.STROKE);
            this.e.setStrokeJoin(Join.ROUND);
            this.e.setStrokeCap(Cap.ROUND);
            this.e.setStrokeWidth(1.0f * am1.a().g);
            this.e.setColor(-570425345);
            canvas.drawPath(this.k, this.e);
        }
    }

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new Path();
    }

    public ThumbnailPickerButton(Context context) {
        super(context);
        this.k = new Path();
    }

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new Path();
    }
}
