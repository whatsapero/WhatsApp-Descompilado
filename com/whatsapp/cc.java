package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class cc extends Animation {
    final AnswerCallView a;

    protected void applyTransformation(float f, Transformation transformation) {
        AnswerCallView.a(this.a, f);
        this.a.invalidate();
    }

    private cc(AnswerCallView answerCallView) {
        this.a = answerCallView;
    }

    cc(AnswerCallView answerCallView, a8j com_whatsapp_a8j) {
        this(answerCallView);
    }
}
