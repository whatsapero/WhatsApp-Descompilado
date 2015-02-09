package com.whatsapp.gallerypicker;

import android.database.ContentObserver;
import android.os.Handler;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class af extends ContentObserver {
    private static final String z;
    final ImageGallery a;

    static {
        char[] toCharArray = "\"{\u0017kA,w\u001a`A9oYcJ(~\u0017bC.6".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 75;
                    break;
                case ay.f /*1*/:
                    i2 = 22;
                    break;
                case ay.n /*2*/:
                    i2 = 118;
                    break;
                case ay.p /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    public void onChange(boolean z) {
        Log.i(z + z);
        if (ImageGallery.k(this.a) != null) {
            ImageGallery.k(this.a).d();
            ImageGallery.a(this.a, ImageGallery.k(this.a).b());
        }
        ImageGallery.d(this.a).notifyDataSetChanged();
    }

    af(ImageGallery imageGallery, Handler handler) {
        this.a = imageGallery;
        super(handler);
    }
}
