package com.whatsapp.qrcode;

import com.actionbarsherlock.R;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class e implements n {
    private static final String z;
    final QrCodeActivity a;

    static {
        char[] toCharArray = "\f]fA\u0012\u0014YnV\u001fR_uG\u0010\u0014JpP\u0003\u001cK~".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 125;
                    break;
                case ay.f /*1*/:
                    i2 = 47;
                    break;
                case ay.n /*2*/:
                    i2 = 7;
                    break;
                case ay.p /*3*/:
                    i2 = 34;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    e(QrCodeActivity qrCodeActivity) {
        this.a = qrCodeActivity;
    }

    public void a() {
        App.b(this.a, (int) R.string.cannot_start_camera, 1);
        this.a.finish();
    }

    public void b() {
        Log.i(z);
        QrCodeActivity.a(this.a, true);
        if (!QrCodeActivity.b(this.a)) {
            QrCodeActivity.a(this.a).a().setOneShotPreviewCallback(QrCodeActivity.e(this.a));
        }
    }
}
