package com.whatsapp;

import android.view.animation.Interpolator;

class tl implements Interpolator {
    final dz a;

    public float getInterpolation(float f) {
        return ((double) f) > 0.5d ? Math.min(f, dz.c(this.a)) : 0.0f;
    }

    tl(dz dzVar) {
        this.a = dzVar;
    }
}
