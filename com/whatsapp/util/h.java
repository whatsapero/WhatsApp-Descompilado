package com.whatsapp.util;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class h implements AnimationListener {
    final FloatingChildLayout a;
    final Runnable b;
    final boolean c;

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        if (this.c) {
            if (FloatingChildLayout.d(this.a) == 3) {
                FloatingChildLayout.a(this.a, 4);
                if (this.b != null) {
                    this.b.run();
                    if (Log.e == 0) {
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (FloatingChildLayout.d(this.a) == 1) {
            FloatingChildLayout.a(this.a, 2);
            if (this.b != null) {
                this.b.run();
            }
        }
    }

    h(FloatingChildLayout floatingChildLayout, boolean z, Runnable runnable) {
        this.a = floatingChildLayout;
        this.c = z;
        this.b = runnable;
    }

    public void onAnimationStart(Animation animation) {
    }
}
