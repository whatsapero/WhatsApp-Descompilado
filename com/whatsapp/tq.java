package com.whatsapp;

import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;

class tq implements Runnable {
    private int a;
    private Animation[] b;
    final lt c;

    tq(lt ltVar) {
        this.c = ltVar;
        this.a = 0;
    }

    public void run() {
        int i = App.az;
        if (this.b == null) {
            this.b = new Animation[lt.a(this.c).length];
            int i2 = 0;
            while (i2 < lt.d(this.c).length) {
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(new AlphaAnimation(1.0f, 0.5f));
                animationSet.addAnimation(new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.5f, 1, 0.5f));
                this.b[i2] = animationSet;
                this.b[i2].setDuration(400);
                this.b[i2].setFillAfter(true);
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
        }
        if (lt.c(this.c) == 1) {
            long j;
            if (this.a < lt.d(this.c).length) {
                this.b[this.a].reset();
                lt.d(this.c)[this.a].startAnimation(this.b[this.a]);
            }
            this.a = (this.a + 1) % lt.d(this.c).length;
            Handler b = lt.b(this.c);
            if (this.a == 0) {
                j = 800;
            } else {
                j = 100;
            }
            b.postDelayed(this, j);
        }
    }
}
