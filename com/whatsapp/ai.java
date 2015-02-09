package com.whatsapp;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Transformation;
import com.whatsapp.util.a;

class ai extends a {
    final View h;
    final View i;
    final View j;
    private boolean k;
    final lv l;
    final boolean m;

    public ai(lv lvVar, View view, View view2, View view3, boolean z) {
        this.l = lvVar;
        this.h = view;
        this.i = view2;
        this.j = view3;
        this.m = z;
        super(0.0f, 360.0f, (float) (view.getWidth() / 2), (float) (view.getHeight() / 2), am1.a().g * 200.0f, false);
        setDuration(1000);
        setInterpolator(new AccelerateDecelerateInterpolator());
    }

    protected void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        float f2 = this.d;
        int i = ((int) (f2 + ((this.c - f2) * f))) % 360;
        if (i > 90 && i < 270) {
            if (!this.k) {
                this.k = true;
                this.i.setVisibility(4);
                this.j.setVisibility(4);
                if (App.az == 0) {
                    return;
                }
            }
            return;
        }
        if (this.k) {
            this.k = false;
            this.i.setVisibility(0);
            if (this.m) {
                this.j.setVisibility(0);
            }
        }
    }
}
