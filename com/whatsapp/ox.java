package com.whatsapp;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class ox implements OnTouchListener {
    final ee a;

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        x += iArr[0];
        y += iArr[1];
        iArr = new int[2];
        ee.b(this.a).getLocationOnScreen(iArr);
        int i = x - iArr[0];
        int i2 = y - iArr[1];
        if (i >= 0 && i < ee.b(this.a).getWidth() && i2 >= 0 && i2 < ee.b(this.a).getHeight()) {
            return true;
        }
        iArr = new int[2];
        ee.c(this.a).getLocationOnScreen(iArr);
        x -= iArr[0];
        y -= iArr[1];
        return x >= 0 && x < ee.c(this.a).getWidth() && y >= 0 && y < ee.c(this.a).getHeight();
    }

    ox(ee eeVar) {
        this.a = eeVar;
    }
}
