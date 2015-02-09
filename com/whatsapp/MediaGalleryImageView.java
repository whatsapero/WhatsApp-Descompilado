package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;

public class MediaGalleryImageView extends ThumbnailTextButton {
    private static Paint v;
    private static Paint w;
    private static Paint y;
    private final Rect u;
    protected boolean x;

    public void c(Canvas canvas) {
        getDrawingRect(this.u);
        if (isPressed() || isSelected()) {
            if (this.x) {
                canvas.drawRect(this.u, w);
            }
            canvas.drawRect(this.u, v);
            if (App.az == 0) {
                return;
            }
        }
        canvas.drawRect(this.u, y);
    }

    public MediaGalleryImageView(Context context) {
        super(context);
        this.u = new Rect();
        this.x = true;
        if (w == null) {
            w = new Paint();
            w.setColor(1711315404);
            w.setStyle(Style.FILL);
            w.setAntiAlias(true);
        }
        if (v == null) {
            am1 a = am1.a();
            v = new Paint();
            v.setColor(-16725026);
            v.setStrokeWidth((float) (a.l * 3));
            v.setStyle(Style.STROKE);
            v.setAntiAlias(true);
        }
        if (y == null) {
            a = am1.a();
            y = new Paint();
            y.setColor(2097152000);
            y.setStrokeWidth((float) a.l);
            y.setStyle(Style.STROKE);
            y.setAntiAlias(true);
        }
    }
}
