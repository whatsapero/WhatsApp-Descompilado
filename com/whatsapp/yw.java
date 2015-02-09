package com.whatsapp;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class yw extends Handler {
    private static final String z;
    final ata a;

    static {
        char[] toCharArray = "1\u0015+a\u0016>\u001d*o\u00033\u001f+m\u0018\"\u001c)m\u0002h\u00040e\u0015(\u0005-".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 71;
                    break;
                case ay.f /*1*/:
                    i2 = 112;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 8;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    yw(ata com_whatsapp_ata) {
        this.a = com_whatsapp_ata;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case ay.f /*1*/:
                Log.e(z);
                ata.a(this.a).removeMessages(1);
                if (VERSION.SDK_INT >= 17) {
                    if (ata.b(this.a).isDestroyed()) {
                        return;
                    }
                } else if (ata.b(this.a).isFinishing()) {
                    return;
                }
                ata.b(this.a).showDialog(200);
            default:
        }
    }
}
