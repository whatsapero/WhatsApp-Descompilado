package com.whatsapp;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class _a implements OnTouchListener {
    final a11 a;

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 4) {
            return false;
        }
        this.a.dismiss();
        return true;
    }

    _a(a11 com_whatsapp_a11) {
        this.a = com_whatsapp_a11;
    }
}
