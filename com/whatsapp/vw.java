package com.whatsapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class vw extends AsyncTask {
    private static final String z;
    final VoiceService a;
    private final m8 b;
    private final int c;

    static {
        char[] toCharArray = "IjoD\u0010HgVX\u001aOfo_\u0016Z{`Y\u001b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 59;
                    break;
                case ay.f /*1*/:
                    i2 = 15;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 54;
                    break;
                default:
                    i2 = 117;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    public vw(VoiceService voiceService, m8 m8Var, int i) {
        this.a = voiceService;
        this.b = m8Var;
        this.c = i;
    }

    protected void onPostExecute(Object obj) {
        a((Bitmap) obj);
    }

    protected void a(Bitmap bitmap) {
        this.a.startService(new Intent(z, null, this.a, VoiceService.class));
    }

    protected Bitmap a(Void[] voidArr) {
        return this.b.a(this.c, 0.0f, true);
    }
}
