package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import org.whispersystems.libaxolotl.ay;

class dr extends Handler {
    final RegisterName a;

    public void handleMessage(Message message) {
        int i = App.az;
        if (RegisterName.o() != null && k5.c(RegisterName.o())) {
            if (k5.b(RegisterName.o())) {
                if (RegisterName.b(this.a) != null) {
                    RegisterName.b(this.a).a(1);
                    if (i == 0) {
                        return;
                    }
                }
                return;
            }
            this.a.removeDialog(0);
            switch (k5.a(RegisterName.o())) {
                case ay.f /*1*/:
                    this.a.showDialog(1);
                    if (i == 0) {
                        return;
                    }
                    break;
                case ay.p /*3*/:
                    break;
                default:
                    return;
            }
            this.a.showDialog(109);
        }
    }

    dr(RegisterName registerName) {
        this.a = registerName;
    }
}
