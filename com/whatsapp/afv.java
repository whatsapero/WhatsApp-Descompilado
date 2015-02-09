package com.whatsapp;

import android.view.View;
import android.view.View.OnLongClickListener;

class afv implements OnLongClickListener {
    final AccountInfoActivity a;

    afv(AccountInfoActivity accountInfoActivity) {
        this.a = accountInfoActivity;
    }

    public boolean onLongClick(View view) {
        AccountInfoActivity.k(this.a).onClick(view);
        return true;
    }
}
