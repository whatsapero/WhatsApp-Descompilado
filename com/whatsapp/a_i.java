package com.whatsapp;

import android.view.animation.Interpolator;

final class a_i implements Interpolator {
    a_i() {
    }

    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
    }
}
