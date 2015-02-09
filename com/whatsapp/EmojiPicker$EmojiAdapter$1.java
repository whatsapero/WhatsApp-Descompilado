package com.whatsapp;

import android.content.Context;
import android.widget.LinearLayout;

class EmojiPicker$EmojiAdapter$1 extends LinearLayout {
    final xy a;

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = App.az;
        int i6 = i4 - i2;
        float i7 = ((float) (i3 - i)) / ((float) c_.i(this.a.b));
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            float f = ((float) i8) * i7;
            getChildAt(i8).layout((int) f, 0, (int) (f + i7), i6);
            i8++;
            if (i5 != 0) {
                return;
            }
        }
    }

    EmojiPicker$EmojiAdapter$1(xy xyVar, Context context) {
        this.a = xyVar;
        super(context);
    }
}
