package com.whatsapp;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.TextView;

class asb implements OnPreDrawListener {
    final TextView a;
    final int b;
    final View c;
    final dz d;

    asb(dz dzVar, View view, int i, TextView textView) {
        this.d = dzVar;
        this.c = view;
        this.b = i;
        this.a = textView;
    }

    public boolean onPreDraw() {
        int i = App.az;
        int width = this.c.getWidth();
        if (width > 0) {
            this.c.getViewTreeObserver().removeOnPreDrawListener(this);
            int i2 = width - (this.b * 2);
            String toString = this.a.getText().toString();
            float textSize = this.a.getTextSize();
            while (textSize > 1.0f && (this.a.getPaint().measureText(toString) >= ((float) i2) || i != 0)) {
                textSize -= 1.0f;
                this.a.setTextSize(textSize);
                if (i != 0) {
                    break;
                }
            }
        }
        return true;
    }
}
