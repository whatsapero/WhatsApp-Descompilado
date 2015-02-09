package com.whatsapp;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

class h0 implements OnCheckedChangeListener {
    final AccountInfoActivity a;
    private boolean b;

    h0(AccountInfoActivity accountInfoActivity) {
        this.a = accountInfoActivity;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.b) {
            this.b = true;
            if (z) {
                if (AccountInfoActivity.b(this.a).getId() != compoundButton.getId()) {
                    AccountInfoActivity.b(this.a).setChecked(false);
                }
                if (AccountInfoActivity.o(this.a).getId() != compoundButton.getId()) {
                    AccountInfoActivity.o(this.a).setChecked(false);
                }
                if (AccountInfoActivity.n(this.a).getId() != compoundButton.getId()) {
                    AccountInfoActivity.n(this.a).setChecked(false);
                }
            }
            this.b = false;
        }
    }
}
