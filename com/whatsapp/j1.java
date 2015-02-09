package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class j1 extends Drawable {
    private int a;

    public void draw(Canvas canvas) {
        if (this.a != 16842921) {
            canvas.drawColor(1711315404);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int getOpacity() {
        return 0;
    }

    private j1() {
        this.a = 16842921;
    }

    j1(m5 m5Var) {
        this();
    }

    public boolean isStateful() {
        return true;
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
}
