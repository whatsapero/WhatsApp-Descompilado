package com.whatsapp.util;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class k implements OnGlobalLayoutListener {
    final View a;
    final Runnable b;

    k(View view, Runnable runnable) {
        this.a = view;
        this.b = runnable;
    }

    public void onGlobalLayout() {
        this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.b.run();
    }
}
