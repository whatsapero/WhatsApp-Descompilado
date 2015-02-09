package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.protocol.b;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.ay;

class z2 extends Handler {
    final l7 a;

    public void handleMessage(Message message) {
        boolean z = true;
        int i = m3.d;
        b bVar = (b) message.obj;
        switch (message.what) {
            case ay.n /*2*/:
                this.a.d(bVar, message.arg1);
                if (i == 0) {
                    return;
                }
                break;
            case a6.h /*10*/:
                break;
            case a6.e /*11*/:
                break;
            default:
                return;
        }
        l7.g(this.a).c(bVar);
        if (i == 0) {
            return;
        }
        a1t g = l7.g(this.a);
        if (message.arg1 != 1) {
            z = false;
        }
        g.a(bVar, z);
    }

    z2(l7 l7Var) {
        this.a = l7Var;
    }
}
