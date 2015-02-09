package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.actionbarsherlock.R;

public class DividerView extends TextView {
    Context a;

    public DividerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
    }

    protected void onDraw(Canvas canvas) {
        new Paint().setColor(am1.a().F);
        Rect rect = new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        Drawable drawable = this.a.getResources().getDrawable(R.drawable.date_balloon);
        drawable.setBounds(rect);
        drawable.setDither(true);
        drawable.draw(canvas);
        super.onDraw(canvas);
    }
}
