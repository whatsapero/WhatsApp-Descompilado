package com.whatsapp;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class pq implements OnTouchListener {
    final QuickContactActivity a;

    public boolean onTouch(View view, MotionEvent motionEvent) {
        QuickContactActivity.a(this.a);
        return true;
    }

    pq(QuickContactActivity quickContactActivity) {
        this.a = quickContactActivity;
    }
}
