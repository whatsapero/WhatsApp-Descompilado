package com.whatsapp.wallpaper;

import android.app.Activity;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ResetWallpaper extends Activity {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "K)Tu\\Q?\u007f";
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
                        i3 = 34;
                        break;
                    case ay.f /*1*/:
                        i3 = 90;
                        break;
                    case ay.n /*2*/:
                        i3 = 11;
                        break;
                    case ay.p /*3*/:
                        i3 = 7;
                        break;
                    default:
                        i3 = 57;
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
                    str = "K)Tc\\D;~kM";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "A5f)NJ;\u007ftXR*%nWV?es\u0017C9\u007fnVLtYBjg\u000eTPxn\u0016[Fig\b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
        r4_this = this;
        r3 = 1;
        super.onCreate(r5);
        r0 = new android.content.Intent;
        r0.<init>();
        r1 = z;
        r1 = r1[r3];
        r2 = r4.getIntent();
        r2 = r2.getAction();
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0027;
    L_0x001b:
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0.putExtra(r1, r3);
        r1 = com.whatsapp.wallpaper.ImageViewTouchBase.e;
        if (r1 == 0) goto L_0x002f;
    L_0x0027:
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0.putExtra(r1, r3);
    L_0x002f:
        r1 = -1;
        r4.setResult(r1, r0);
        r4.finish();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.ResetWallpaper.onCreate(android.os.Bundle):void");
    }
}
