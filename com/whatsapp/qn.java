package com.whatsapp;

import android.view.View;
import com.whatsapp.util.ar;

class qn extends ar {
    final CallLogActivity b;

    public void a(View view) {
        App.b(CallLogActivity.c(this.b), this.b);
        this.b.finish();
    }

    qn(CallLogActivity callLogActivity) {
        this.b = callLogActivity;
    }
}
