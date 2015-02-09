package com.whatsapp.fieldstats;

import android.content.Context;
import android.os.Handler.Callback;
import android.os.Message;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class b5 implements Callback {
    private static final String z;

    static {
        char[] toCharArray = "@,$`k\u001370`8U40gp\u0013=7fwA".toCharArray();
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
                    i2 = 88;
                    break;
                case ay.n /*2*/:
                    i2 = 69;
                    break;
                case ay.p /*3*/:
                    i2 = 20;
                    break;
                default:
                    i2 = 24;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private void a(Context context) {
        if (al.b() != null) {
            try {
                al.b().flush();
            } catch (Throwable e) {
                Log.b(z, e);
            }
            al.c(context);
        }
    }

    b5() {
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case PBE.MD5 /*0*/:
                a((Context) message.obj);
                al.b((Context) message.obj);
                return true;
            case ay.f /*1*/:
                a((Context) message.obj);
                return true;
            default:
                return false;
        }
    }
}
