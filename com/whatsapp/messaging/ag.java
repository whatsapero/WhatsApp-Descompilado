package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;

class ag extends Handler {
    final ak a;

    public void a() {
        removeMessages(0);
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case PBE.MD5 /*0*/:
                ak.h(this.a);
            default:
        }
    }

    public void a(long j) {
        sendEmptyMessageDelayed(0, j);
    }

    public boolean b() {
        return hasMessages(0);
    }

    private ag(ak akVar) {
        this.a = akVar;
    }

    ag(ak akVar, b3 b3Var) {
        this(akVar);
    }
}
