package com.whatsapp;

import android.text.method.TextKeyListener;
import android.view.View;
import android.view.View.OnClickListener;

class a1v implements OnClickListener {
    final kc a;

    a1v(kc kcVar) {
        this.a = kcVar;
    }

    public void onClick(View view) {
        kc.a(this.a, false);
        kc.a(this.a, null);
        kc.d(this.a).removeDialog(50);
        TextKeyListener.clear(kc.e(this.a).getText());
        this.a.dismiss();
    }
}
