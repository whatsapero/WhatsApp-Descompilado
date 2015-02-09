package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import android.text.format.DateUtils;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class hp extends Handler {
    private static final String z;
    long a;
    final dz b;

    static {
        char[] toCharArray = "\u0006\u0017\u0005\ru\u001e\u0017\u0018\u000b?\u0016\u0011\u0000\u000b|\u0019\u0015\u0005\u001a0".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 112;
                    break;
                case ay.f /*1*/:
                    i2 = 120;
                    break;
                case ay.n /*2*/:
                    i2 = 108;
                    break;
                case ay.p /*3*/:
                    i2 = 110;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    hp(dz dzVar) {
        this.b = dzVar;
    }

    public void handleMessage(Message message) {
        if (dz.b(this.b) != null) {
            long currentTimeMillis = System.currentTimeMillis() - dz.g(this.b);
            dz.h(this.b).setText(DateUtils.formatElapsedTime((long) ((int) (currentTimeMillis / 1000))));
            dz.i(this.b).sendEmptyMessageDelayed(0, 50);
            if (dz.e(this.b) == null && currentTimeMillis > 1000 && dz.b(this.b).b().length() > 0) {
                Object mediaData = new MediaData();
                mediaData.autodownloadRetryEnabled = true;
                mediaData.file = dz.b(this.b).b();
                b bVar = new b(dz.a(this.b), (byte[]) null, mediaData);
                bVar.D = App.a2();
                bVar.O = 1;
                bVar.j = (byte) 2;
                bVar.w = 1;
                bVar.H = mediaData.file.getName();
                bVar.k = 0;
                App.a(bVar, v.b(dz.a(this.b)));
                dz.a(this.b, new avr(bVar, dz.b(this.b).c()));
                mediaData.uploader = dz.e(this.b);
                dz.e(this.b).b();
            }
            if (this.a + 1000 < System.currentTimeMillis() && dz.a(this.b) != null) {
                this.a = System.currentTimeMillis();
                App.c(dz.a(this.b), 1);
                if (dz.b(this.b).b().length() > ((long) ge.k) * 1048576) {
                    Log.i(z + dz.b(this.b).b().length());
                    this.b.b(true);
                }
            }
        }
    }
}
