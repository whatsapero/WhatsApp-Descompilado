package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import com.actionbarsherlock.R;

class ib extends BitmapDrawable {
    private Paint a;
    final Conversation b;

    public void draw(Canvas canvas) {
        if (this.a == null) {
            this.a = new Paint();
            this.a.setAntiAlias(true);
            this.a.setStrokeJoin(Join.ROUND);
            this.a.setStrokeCap(Cap.ROUND);
            this.a.setStrokeWidth(1.0f * Conversation.L(this.b).g);
        }
        super.draw(canvas);
        float dimension = this.b.getResources().getDimension(R.dimen.small_avatar_radius);
        RectF rectF = new RectF(getBounds());
        this.a.setStyle(Style.STROKE);
        this.a.setColor(1493172224);
        canvas.drawRoundRect(rectF, dimension, dimension, this.a);
    }

    public ib(Conversation conversation, Resources resources, Bitmap bitmap) {
        this.b = conversation;
        super(resources, bitmap);
    }
}
