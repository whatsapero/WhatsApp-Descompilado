package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class asl implements OnClickListener {
    private static final String z;
    final RecordAudio a;

    static {
        char[] toCharArray = "\n\u00054F{\u001c\u0001\"M`\u0017O4Hg\u001b\u0005;".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 87;
                    break;
                case ay.p /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    asl(RecordAudio recordAudio) {
        this.a = recordAudio;
    }

    public void onClick(View view) {
        Log.i(z);
        this.a.finish();
        if (!RecordAudio.n(this.a) && RecordAudio.l(this.a) != null && RecordAudio.l(this.a).exists()) {
            RecordAudio.l(this.a).delete();
        }
    }
}
