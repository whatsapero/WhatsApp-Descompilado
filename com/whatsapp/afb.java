package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class afb implements OnClickListener {
    final QuickContactActivity a;

    afb(QuickContactActivity quickContactActivity) {
        this.a = quickContactActivity;
    }

    public void onClick(View view) {
        App.b(QuickContactActivity.b(this.a), this.a);
        if (!Voip.f() && !App.j(this.a)) {
            QuickContactActivity.a(this.a, false);
        }
    }
}
