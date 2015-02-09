package com.whatsapp;

import com.whatsapp.protocol.cs;

class wa implements cs {
    final DeleteAccount a;

    public void a(String str) {
        if (App.an.jabber_id.equals(str)) {
            DeleteAccount.e(this.a).sendEmptyMessage(1);
            if (App.az == 0) {
                return;
            }
        }
        DeleteAccount.e(this.a).sendEmptyMessage(2);
    }

    wa(DeleteAccount deleteAccount) {
        this.a = deleteAccount;
    }
}
