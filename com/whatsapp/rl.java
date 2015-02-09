package com.whatsapp;

import com.whatsapp.protocol.cs;

class rl implements cs {
    final ChangeNumber a;

    public void a(String str) {
        if (App.an.jabber_id.equals(str)) {
            ChangeNumber.c(this.a).sendEmptyMessage(1);
            if (App.az == 0) {
                return;
            }
        }
        ChangeNumber.c(this.a).sendEmptyMessage(2);
    }

    rl(ChangeNumber changeNumber) {
        this.a = changeNumber;
    }
}
