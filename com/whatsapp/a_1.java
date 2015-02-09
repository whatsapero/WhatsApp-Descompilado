package com.whatsapp;

import android.os.Handler.Callback;
import android.os.Message;
import de.greenrobot.event.g;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class a_1 implements Callback {
    public boolean handleMessage(Message message) {
        bz bzVar = (bz) g.b().b(bz.class);
        switch (message.what) {
            case PBE.MD5 /*0*/:
                if (!bzVar.a()) {
                    App.T();
                }
                return true;
            case ay.f /*1*/:
                if (!bzVar.a()) {
                    App.k();
                }
                return true;
            default:
                return false;
        }
    }

    a_1() {
    }
}
