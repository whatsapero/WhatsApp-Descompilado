package com.whatsapp;

import android.view.Display;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class h6 implements OnGlobalLayoutListener {
    final ee a;

    public void onGlobalLayout() {
        if (ee.a(this.a) != null) {
            boolean z;
            int i;
            int height = ee.a(this.a).getHeight();
            int[] iArr = new int[2];
            ee.a(this.a).getLocationOnScreen(iArr);
            int i2 = iArr[1] + height;
            Display defaultDisplay = ee.d(this.a).getWindowManager().getDefaultDisplay();
            int width = defaultDisplay.getWidth();
            if (((float) (defaultDisplay.getHeight() - i2)) < am1.a().g * 128.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.a.dismiss();
                if (App.az == 0) {
                    i = 0;
                    this.a.update(0, i2, width, i, true);
                }
            }
            i = defaultDisplay.getHeight() - i2;
            ee.a(this.a, i);
            this.a.update(0, i2, width, i, true);
        }
    }

    h6(ee eeVar) {
        this.a = eeVar;
    }
}
