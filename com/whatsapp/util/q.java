package com.whatsapp.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class q extends AnimatorListenerAdapter {
    final Runnable a;
    final FloatingChildLayout b;
    final boolean c;

    q(FloatingChildLayout floatingChildLayout, boolean z, Runnable runnable) {
        this.b = floatingChildLayout;
        this.c = z;
        this.a = runnable;
    }

    public void onAnimationEnd(Animator animator) {
        FloatingChildLayout.b(this.b).setLayerType(0, null);
        if (this.c) {
            if (FloatingChildLayout.d(this.b) == 3) {
                FloatingChildLayout.a(this.b, 4);
                if (this.a != null) {
                    this.a.run();
                    if (Log.e == 0) {
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (FloatingChildLayout.d(this.b) == 1) {
            FloatingChildLayout.a(this.b, 2);
            if (this.a != null) {
                this.a.run();
            }
        }
    }
}
