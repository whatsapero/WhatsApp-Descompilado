package com.whatsapp.util;

import android.view.View;
import android.view.ViewTreeObserver.OnDrawListener;

final class w implements OnDrawListener {
    final Runnable a;
    final View b;

    public void onDraw() {
        this.b.getViewTreeObserver().removeOnDrawListener(this);
        this.a.run();
    }

    w(View view, Runnable runnable) {
        this.b = view;
        this.a = runnable;
    }
}
