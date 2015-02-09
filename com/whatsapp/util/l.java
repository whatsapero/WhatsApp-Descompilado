package com.whatsapp.util;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

class l extends InsetDrawable {
    final RtlCheckBox a;

    public void draw(Canvas canvas) {
    }

    l(RtlCheckBox rtlCheckBox, Drawable drawable, int i) {
        this.a = rtlCheckBox;
        super(drawable, i);
    }
}
