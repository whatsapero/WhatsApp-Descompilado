package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class jx implements OnClickListener {
    final View a;
    final boolean b;
    final lv c;
    final View d;
    final View e;

    jx(lv lvVar, View view, boolean z, View view2, View view3) {
        this.c = lvVar;
        this.e = view;
        this.b = z;
        this.a = view2;
        this.d = view3;
    }

    public void onClick(View view) {
        this.e.startAnimation(new ai(this.c, this.e, this.d, this.a, this.b));
    }
}
