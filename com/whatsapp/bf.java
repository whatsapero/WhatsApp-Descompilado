package com.whatsapp;

import android.media.AudioManager.OnAudioFocusChangeListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class bf implements OnAudioFocusChangeListener {
    private static final String z;

    static {
        char[] toCharArray = "E3M^`R)@G/\u0013:KM5@|GF!];AJz\u0013".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 51;
                    break;
                case ay.f /*1*/:
                    i2 = 92;
                    break;
                case ay.n /*2*/:
                    i2 = 36;
                    break;
                case ay.p /*3*/:
                    i2 = 46;
                    break;
                default:
                    i2 = 64;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    bf() {
    }

    public void onAudioFocusChange(int i) {
        Log.i(z + i);
    }
}
