package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class all implements OnClickListener {
    final AccountInfoActivity a;

    all(AccountInfoActivity accountInfoActivity) {
        this.a = accountInfoActivity;
    }

    public void onClick(View view) {
        int i = App.az;
        if (!AccountInfoActivity.g(this.a)) {
            if (AccountInfoActivity.m(this.a)) {
                AccountInfoActivity.a(this.a, AccountInfoActivity.l(this.a), new xh(this));
                if (i == 0) {
                    return;
                }
            }
            if (AccountInfoActivity.i(this.a)) {
                AccountInfoActivity.f(this.a);
                if (i == 0) {
                    return;
                }
            }
            this.a.showDialog(11);
        }
    }
}
