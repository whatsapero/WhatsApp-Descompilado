package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class um implements OnPreparedListener {
    private static final String z;
    final RecordAudio a;

    static {
        char[] toCharArray = "\u001dXju0\u000b\\|~+\u0000\u0012yv#\u0016X{j0\nMhh'\u000b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 111;
                    break;
                case ay.f /*1*/:
                    i2 = 61;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 26;
                    break;
                default:
                    i2 = 66;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        Log.i(z);
    }

    um(RecordAudio recordAudio) {
        this.a = recordAudio;
    }
}
