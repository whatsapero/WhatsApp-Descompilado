package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class asn implements OnClickListener {
    final View a;
    final View b;
    final AccountInfoActivity c;
    final View d;

    public void onClick(View view) {
        if (view == this.b) {
            AccountInfoActivity.b(this.c).setChecked(true);
        }
        if (view == this.d) {
            AccountInfoActivity.o(this.c).setChecked(true);
        }
        if (view == this.a) {
            AccountInfoActivity.n(this.c).setChecked(true);
        }
    }

    asn(AccountInfoActivity accountInfoActivity, View view, View view2, View view3) {
        this.c = accountInfoActivity;
        this.b = view;
        this.d = view2;
        this.a = view3;
    }
}
