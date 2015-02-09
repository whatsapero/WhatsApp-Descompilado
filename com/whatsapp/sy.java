package com.whatsapp;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import com.whatsapp.util.Log;
import com.whatsapp.util.g;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class sy implements OnTouchListener {
    private static final String z;
    final FrameLayout a;
    final nc b;
    final Activity c;

    static {
        char[] toCharArray = "\u0000I\u0011\u001dp\tM\n\ff\u0011J\f\u0012w\u000eJJ\ba\u0014S\u0006\u001dg\bR\u000b\tg\bQ\u0016".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 97;
                    break;
                case ay.f /*1*/:
                    i2 = 61;
                    break;
                case ay.n /*2*/:
                    i2 = 101;
                    break;
                case ay.p /*3*/:
                    i2 = 124;
                    break;
                default:
                    i2 = 19;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    sy(nc ncVar, FrameLayout frameLayout, Activity activity) {
        this.b = ncVar;
        this.a = frameLayout;
        this.c = activity;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 4) {
            this.b.dismiss();
            return true;
        }
        if (App.G == 3) {
            Log.i(z);
            g.a(this.a, this.c, true);
        }
        return false;
    }
}
