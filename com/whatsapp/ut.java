package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class ut extends Drawable {
    private int a;

    public void setAlpha(int i) {
    }

    public boolean setState(int[] iArr) {
        int i = App.az;
        int i2 = this.a;
        this.a = 16842921;
        int length = iArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = iArr[i3];
            if (i4 == 16842919) {
                this.a = 16842919;
                if (i == 0) {
                    break;
                }
            }
            if (i4 == 16842908) {
                this.a = 16842908;
            }
            i3++;
            if (i != 0) {
                break;
            }
        }
        if (i2 == this.a) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public int getOpacity() {
        return 0;
    }

    private ut() {
        this.a = 16842921;
    }

    public void draw(Canvas canvas) {
    }

    public boolean isStateful() {
        return true;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    ut(a55 com_whatsapp_a55) {
        this();
    }
}
