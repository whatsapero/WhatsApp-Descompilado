package com.whatsapp.qrcode;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class d extends Animation {
    final QrEducationView a;

    protected void applyTransformation(float f, Transformation transformation) {
        QrEducationView.a(this.a, f);
        this.a.invalidate();
    }

    private d(QrEducationView qrEducationView) {
        this.a = qrEducationView;
    }

    d(QrEducationView qrEducationView, c cVar) {
        this(qrEducationView);
    }
}
