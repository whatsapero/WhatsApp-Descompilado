package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

public class WaveformVisualizerView extends View {
    private Paint a;
    private byte[] b;
    private float[] c;
    private Rect d;

    protected void onDraw(Canvas canvas) {
        int i = 0;
        int i2 = App.az;
        super.onDraw(canvas);
        if (this.b != null) {
            if (this.c == null || this.c.length < this.b.length * 4) {
                this.c = new float[(this.b.length * 4)];
            }
            this.d.set(0, 0, getWidth(), getHeight());
            Rect rect = this.d;
            rect.top += getPaddingTop();
            rect = this.d;
            rect.bottom -= getPaddingBottom();
            rect = this.d;
            rect.left += getPaddingLeft();
            rect = this.d;
            rect.right -= getPaddingRight();
            Path path = new Path();
            path.moveTo((float) this.d.left, (float) ((this.d.top + (this.d.height() / 2)) + ((((byte) (this.b[0] + 128)) * (this.d.height() / 2)) / 128)));
            while (i < this.b.length - 1) {
                path.lineTo((float) (this.d.left + ((this.d.width() * i) / (this.b.length - 1))), (float) ((this.d.top + (this.d.height() / 2)) + ((((byte) (this.b[i] + 128)) * (this.d.height() / 2)) / 128)));
                i++;
                if (i2 != 0) {
                    break;
                }
            }
            canvas.drawPath(path, this.a);
        }
    }

    public void a(byte[] bArr) {
        this.b = bArr;
        invalidate();
    }

    private void a() {
        this.b = null;
        this.a.setStrokeWidth(2.0f);
        this.a.setStyle(Style.STROKE);
        this.a.setStrokeJoin(Join.ROUND);
        this.a.setStrokeCap(Cap.ROUND);
        this.a.setAntiAlias(true);
        this.a.setColor(Color.rgb(0, 128, 255));
    }

    public WaveformVisualizerView(Context context) {
        super(context);
        this.d = new Rect();
        this.a = new Paint();
        a();
    }
}
