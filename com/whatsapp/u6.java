package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class u6 implements OnScrollListener {
    final int a;
    final Drawable b;
    final MessageDetailsActivity c;
    final boolean d;
    final ViewGroup e;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    u6(MessageDetailsActivity messageDetailsActivity, Drawable drawable, boolean z, ViewGroup viewGroup, int i) {
        this.c = messageDetailsActivity;
        this.b = drawable;
        this.d = z;
        this.e = viewGroup;
        this.a = i;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4 = App.az;
        if (MessageDetailsActivity.b(this.c).getFirstVisiblePosition() > 0) {
            this.b.setAlpha(255);
            if (VERSION.SDK_INT >= 11 && !this.d) {
                this.e.setTranslationY(0.0f);
                if (i4 == 0) {
                    return;
                }
            }
            return;
        }
        View childAt = MessageDetailsActivity.b(this.c).getChildAt(0);
        if (childAt == null) {
            this.b.setAlpha(0);
            if (VERSION.SDK_INT >= 11 && !this.d) {
                this.e.setTranslationY(0.0f);
                if (i4 == 0) {
                    return;
                }
            }
            return;
        }
        i4 = childAt.getTop();
        this.b.setAlpha(Math.min(255, ((-i4) * 255) / Math.min(this.a, childAt.getHeight())));
        if (VERSION.SDK_INT >= 11 && !this.d) {
            this.e.setTranslationY((float) ((-i4) / 2));
        }
    }
}
