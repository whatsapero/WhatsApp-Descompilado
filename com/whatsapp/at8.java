package com.whatsapp;

import com.whatsapp.Voip.CallState;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class at8 implements Runnable {
    private static final String z;
    final CallState a;
    final VoipActivity b;

    static {
        char[] toCharArray = "UP7\u0006yuP7\u0006\u0017@K7\u0000?WFq\u00157OS\r\u00027WZ\u001d\u001e7MX;\u0012vPK?\u00023\u0003\u0002cV\u0018lq\u001bV0JQ7\u0005>JQ9V5VM,\u00138W\u001f?\u0015\"JI7\u0002/".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 35;
                    break;
                case ay.f /*1*/:
                    i2 = 63;
                    break;
                case ay.n /*2*/:
                    i2 = 94;
                    break;
                case ay.p /*3*/:
                    i2 = 118;
                    break;
                default:
                    i2 = 86;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    at8(VoipActivity voipActivity, CallState callState) {
        this.b = voipActivity;
        this.a = callState;
    }

    public void run() {
        if (this.a == CallState.RECEIVED_CALL) {
            VoipActivity.a(this.b, Voip.getPeerJid());
        }
        if (this.a == CallState.NONE) {
            Log.i(z);
            this.b.finish();
        }
        if (this.a == CallState.ACTIVE) {
            this.b.getWindow().clearFlags(128);
        }
        VoipActivity.f(this.b);
    }
}
