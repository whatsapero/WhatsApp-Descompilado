package com.whatsapp.qrcode;

import android.os.Vibrator;
import com.actionbarsherlock.R;
import com.whatsapp.App;
import com.whatsapp.a12;
import com.whatsapp.a5y;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class j implements a5y {
    private static final String z;
    final QrCodeActivity a;

    static {
        char[] toCharArray = "d\u000fv8.f\tf".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 102;
                    break;
                case ay.n /*2*/:
                    i2 = 20;
                    break;
                case ay.p /*3*/:
                    i2 = 74;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(int i) {
        if (i == 403) {
            QrCodeActivity.c(this.a);
            if (!QrCodeActivity.t) {
                return;
            }
        }
        App.b(this.a.getBaseContext(), (int) R.string.invalid_qr_code, 1);
        this.a.finish();
    }

    j(QrCodeActivity qrCodeActivity) {
        this.a = qrCodeActivity;
    }

    public void a() {
        if (a12.c(QrCodeActivity.f(this.a))) {
            ((Vibrator) this.a.getSystemService(z)).vibrate(75);
            this.a.finish();
        }
    }
}
