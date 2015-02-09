package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class z3 implements OnGlobalLayoutListener {
    final CallLogActivity a;

    z3(CallLogActivity callLogActivity) {
        this.a = callLogActivity;
    }

    public void onGlobalLayout() {
        CallLogActivity.b(this.a);
    }
}
