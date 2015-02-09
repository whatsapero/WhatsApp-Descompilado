package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class af2 implements OnErrorListener {
    private static final String z;
    final VideoView a;

    static {
        char[] toCharArray = "y\u007fl'8y\u007fm5x/Sz08},(".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 15;
                    break;
                case ay.f /*1*/:
                    i2 = 22;
                    break;
                case ay.n /*2*/:
                    i2 = 8;
                    break;
                case ay.p /*3*/:
                    i2 = 66;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.w(z + i + "," + i2);
        VideoView.c(this.a, -1);
        VideoView.a(this.a, -1);
        return (VideoView.j(this.a) == null || VideoView.j(this.a).onError(VideoView.e(this.a), i, i2)) ? true : true;
    }

    af2(VideoView videoView) {
        this.a = videoView;
    }
}
