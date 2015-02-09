package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

class EmojiPicker$EmojiImageView extends View {
    private int a;
    private Drawable b;
    final c_ c;

    public EmojiPicker$EmojiImageView(c_ c_Var, Context context) {
        this.c = c_Var;
        super(context);
    }

    public void setEmojiCode(int i) {
        if (this.a != i) {
            this.a = i;
            setTag(Integer.valueOf(i));
            this.b = null;
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b == null && this.a != 0) {
            this.b = c_.a(getContext(), this.a);
        }
        if (this.b != null) {
            int intrinsicWidth = this.b.getIntrinsicWidth();
            int intrinsicHeight = this.b.getIntrinsicHeight();
            int width = (getWidth() - intrinsicWidth) / 2;
            int height = (getHeight() - intrinsicHeight) / 2;
            this.b.setBounds(width, height, intrinsicWidth + width, intrinsicHeight + height);
            this.b.draw(canvas);
        }
    }
}
