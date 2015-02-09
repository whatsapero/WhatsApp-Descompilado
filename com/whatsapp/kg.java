package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class kg implements OnClickListener {
    final f6 a;
    final m8 b;

    kg(f6 f6Var, m8 m8Var) {
        this.a = f6Var;
        this.b = m8Var;
    }

    public void onClick(View view) {
        this.a.a.k.remove(this.b);
        this.a.notifyDataSetChanged();
        this.a.a.d();
    }
}
