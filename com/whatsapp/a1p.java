package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.Voip.CallState;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a1p implements OnClickListener {
    private static final String z;
    final VoipActivity a;

    static {
        char[] toCharArray = "X\u001e\u0013<rK\u001f\u001el1O\u001d\u0016l0[\u0005\u000e#<\u000e\u0001\b)!]\u0014\u001e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 46;
                    break;
                case ay.f /*1*/:
                    i2 = 113;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 76;
                    break;
                default:
                    i2 = 82;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a1p(VoipActivity voipActivity) {
        this.a = voipActivity;
    }

    public void onClick(View view) {
        Log.i(z);
        if (Voip.getCurrentCallState() == CallState.RECEIVED_CALL) {
            VoipActivity.b(this.a);
            if (App.az == 0) {
                return;
            }
        }
        VoipActivity.e(this.a);
    }
}
