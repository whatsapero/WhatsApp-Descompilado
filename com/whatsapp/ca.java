package com.whatsapp;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ca implements OnTouchListener {
    final Handler a;
    final c_ b;

    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case PBE.MD5 /*0*/:
                if (c_.g(this.b) != null) {
                    c_.g(this.b).a();
                    this.a.sendEmptyMessageDelayed(0, (long) c_.d());
                    break;
                }
                break;
            case ay.f /*1*/:
                this.a.removeMessages(0);
                break;
            case ay.p /*3*/:
                this.a.removeMessages(0);
                break;
        }
        return false;
    }

    ca(c_ c_Var, Handler handler) {
        this.b = c_Var;
        this.a = handler;
    }
}
