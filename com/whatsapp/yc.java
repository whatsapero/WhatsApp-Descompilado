package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class yc implements OnClickListener {
    final NewGroup a;

    yc(NewGroup newGroup) {
        this.a = newGroup;
    }

    public void onClick(View view) {
        NewGroup.a(this.a).N = NewGroup.b(this.a).getText().toString();
        zv.a(NewGroup.a(this.a), this.a, 12);
    }
}
