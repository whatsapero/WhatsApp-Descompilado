package com.whatsapp;

import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class aj implements OnClickListener {
    private static final String z;
    final ProfilePhotoReminder a;

    static {
        char[] toCharArray = "\"vh\u001fY$v}\u0018K=v \u0018E}cz\u0005B>rb\u0013".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 80;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 15;
                    break;
                case ay.p /*3*/:
                    i2 = 118;
                    break;
                default:
                    i2 = 42;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    aj(ProfilePhotoReminder profilePhotoReminder) {
        this.a = profilePhotoReminder;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r5) {
        /*
        r4_this = this;
        r0 = r4.a;
        r0 = com.whatsapp.ProfilePhotoReminder.d(r0);
        r0 = r0.getText();
        r0 = r0.toString();
        r0 = r0.trim();
        r1 = r0.length();
        if (r1 != 0) goto L_0x002a;
    L_0x0018:
        r1 = z;
        com.whatsapp.util.Log.w(r1);
        r1 = r4.a;
        r2 = 2131624732; // 0x7f0e031c float:1.8876652E38 double:1.05316255E-314;
        r3 = 0;
        com.whatsapp.App.b(r1, r2, r3);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x003e;
    L_0x002a:
        r1 = r4.a;
        r1 = com.whatsapp.App.p(r1);
        r1 = r0.equals(r1);
        if (r1 != 0) goto L_0x003e;
    L_0x0036:
        r1 = com.whatsapp.App.p;
        r1.x(r0);
        com.whatsapp.App.d(r0);
    L_0x003e:
        r0 = r4.a;
        r0.finish();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aj.onClick(android.view.View):void");
    }
}
