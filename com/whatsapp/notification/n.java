package com.whatsapp.notification;

import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class n implements Runnable {
    private static final String[] z;
    final PopupNotification a;

    static {
        String[] strArr = new String[3];
        String str = "BJ\u0010?\f\\J\u0014#\u001a[F\u0001>\u0015]KO:\u000e]]\t'\u0015F\\Z";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 50;
                        break;
                    case ay.f /*1*/:
                        i3 = 37;
                        break;
                    case ay.n /*2*/:
                        i3 = 96;
                        break;
                    case ay.p /*3*/:
                        i3 = 74;
                        break;
                    default:
                        i3 = 124;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "BJ\u0010?\f\\J\u0014#\u001a[F\u0001>\u0015]KO$\u0013\u0012U\u0012%\u0004[H\t>\u0005\u0012V\u0005$\u000f]W";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0012H\u00012F";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    n(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    public void run() {
        if (PopupNotification.r(this.a) != null) {
            PopupNotification.o(this.a).unregisterListener(PopupNotification.r(this.a));
        }
        PopupNotification.a(this.a, null);
        if (PopupNotification.l(this.a) != null) {
            Log.i(z[0] + PopupNotification.c(this.a) + z[1] + PopupNotification.l(this.a).getMaximumRange());
            if (PopupNotification.c(this.a) >= 5.0f || PopupNotification.c(this.a) == PopupNotification.l(this.a).getMaximumRange()) {
                PopupNotification.p(this.a);
                if (!PopupNotification.H) {
                    return;
                }
            }
            return;
        }
        Log.i(z[2]);
        PopupNotification.p(this.a);
    }
}
