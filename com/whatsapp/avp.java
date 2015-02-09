package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;

class avp extends Drawable {
    final BroadcastDetails a;
    final View b;
    final Drawable c;

    public void draw(Canvas canvas) {
        int intrinsicHeight = this.c.getIntrinsicHeight();
        int intrinsicWidth = this.c.getIntrinsicWidth();
        int width = this.b.getWidth();
        this.b.getWidth();
        this.c.setBounds(0, 0, width, (intrinsicHeight * width) / intrinsicWidth);
        this.c.draw(canvas);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    avp(BroadcastDetails broadcastDetails, Drawable drawable, View view) {
        this.a = broadcastDetails;
        this.c = drawable;
        this.b = view;
    }

    public int getOpacity() {
        return 0;
    }
}
