package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.HorizontalScrollView;

final class a3i implements OnGlobalLayoutListener {
    final HorizontalScrollView a;

    public void onGlobalLayout() {
        this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.a.fullScroll(66);
    }

    a3i(HorizontalScrollView horizontalScrollView) {
        this.a = horizontalScrollView;
    }
}
