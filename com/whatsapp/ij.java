package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ij implements OnClickListener {
    final AccountInfoActivity a;

    ij(AccountInfoActivity accountInfoActivity) {
        this.a = accountInfoActivity;
    }

    public void onClick(View view) {
        if (!AccountInfoActivity.g(this.a)) {
            if (AccountInfoActivity.m(this.a)) {
                AccountInfoActivity.a(this.a, AccountInfoActivity.l(this.a), new wh(this));
                if (App.az == 0) {
                    return;
                }
            }
            AccountInfoActivity.j(this.a);
        }
    }
}
