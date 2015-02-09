package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class amq implements OnClickListener {
    final AccountInfoActivity a;

    amq(AccountInfoActivity accountInfoActivity) {
        this.a = accountInfoActivity;
    }

    public void onClick(View view) {
        int i = App.az;
        if (!AccountInfoActivity.g(this.a)) {
            if (AccountInfoActivity.m(this.a)) {
                AccountInfoActivity.a(this.a, AccountInfoActivity.l(this.a), new a1e(this));
                if (i == 0) {
                    return;
                }
            }
            if (AccountInfoActivity.i(this.a)) {
                AccountInfoActivity.c(this.a);
                if (i == 0) {
                    return;
                }
            }
            this.a.showDialog(9);
        }
    }
}
