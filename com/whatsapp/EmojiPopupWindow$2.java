package com.whatsapp;

import android.content.Context;
import android.widget.RelativeLayout;

class EmojiPopupWindow$2 extends RelativeLayout {
    final a11 a;
    int b;

    EmojiPopupWindow$2(a11 com_whatsapp_a11, Context context) {
        this.a = com_whatsapp_a11;
        super(context);
        this.b = -1;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int orientation = a11.b(this.a).getWindowManager().getDefaultDisplay().getOrientation();
        if (!(this.b == -1 || this.b == orientation)) {
            a11.a(this.a).post(new i7(this));
        }
        this.b = orientation;
    }
}
