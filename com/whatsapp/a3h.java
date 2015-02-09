package com.whatsapp;

import android.os.Handler;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a3h extends Handler {
    private static final String z;
    final MediaView a;

    static {
        char[] toCharArray = "\u001f\u00154E#\u0004\u00195[m\u0013\u00054E-]\u00035Xb\u0006\u001fp_6\u001d\u0000p_6\u0013\u0004%_".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 112;
                    break;
                case ay.n /*2*/:
                    i2 = 80;
                    break;
                case ay.p /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 66;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a3h(MediaView mediaView) {
        this.a = mediaView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r9) {
        /*
        r8_this = this;
        r7 = 5;
        r6 = 4;
        r0 = com.whatsapp.App.az;
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.q(r1);
        if (r1 != 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.b(r1);
        if (r1 != r6) goto L_0x006d;
    L_0x0015:
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.k(r1);
        r1 = r1.getMax();
        if (r1 <= 0) goto L_0x0065;
    L_0x0021:
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.q(r1);
        r1 = r1.f();
        r2 = r8.a;
        r2 = com.whatsapp.MediaView.k(r2);
        r2 = r2.getMax();
        r1 = java.lang.Math.min(r1, r2);
        r2 = r8.a;
        r2 = com.whatsapp.MediaView.t(r2);
        r2 = r2 / 1000;
        r3 = r1 / 1000;
        if (r2 == r3) goto L_0x005a;
    L_0x0045:
        r2 = r8.a;
        r2 = com.whatsapp.MediaView.a(r2);
        r3 = r1 / 1000;
        r4 = (long) r3;
        r3 = android.text.format.DateUtils.formatElapsedTime(r4);
        r2.setText(r3);
        r2 = r8.a;
        com.whatsapp.MediaView.a(r2, r1);
    L_0x005a:
        r2 = r8.a;
        r2 = com.whatsapp.MediaView.k(r2);
        r2.setProgress(r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0065:
        r1 = r8.a;
        r2 = 2131624301; // 0x7f0e016d float:1.8875778E38 double:1.053162337E-314;
        r1.a(r2);
    L_0x006d:
        r1 = r8.a;
        r1 = r1.isFinishing();
        if (r1 != 0) goto L_0x0097;
    L_0x0075:
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.b(r1);
        if (r1 != r6) goto L_0x0097;
    L_0x007d:
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.q(r1);
        r1 = r1.c();
        if (r1 == 0) goto L_0x0097;
    L_0x0089:
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.m(r1);
        r2 = 0;
        r4 = 50;
        r1.sendEmptyMessageDelayed(r2, r4);
        if (r0 == 0) goto L_0x000c;
    L_0x0097:
        r0 = r8.a;
        r0 = com.whatsapp.MediaView.b(r0);
        if (r0 == r7) goto L_0x000c;
    L_0x009f:
        r0 = z;
        com.whatsapp.util.Log.i(r0);
        r0 = r8.a;
        r0 = com.whatsapp.MediaView.k(r0);
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.k(r1);
        r1 = r1.getMax();
        r0.setProgress(r1);
        r0 = r8.a;
        r0 = com.whatsapp.MediaView.a(r0);
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.q(r1);
        r1 = r1.e();
        r1 = r1 / 1000;
        r2 = (long) r1;
        r1 = android.text.format.DateUtils.formatElapsedTime(r2);
        r0.setText(r1);
        r0 = r8.a;
        com.whatsapp.MediaView.e(r0, r7);
        r0 = r8.a;
        r0 = com.whatsapp.MediaView.p(r0);
        r1 = 2130838990; // 0x7f0205ce float:1.7282978E38 double:1.052774342E-314;
        r0.setImageResource(r1);
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a3h.handleMessage(android.os.Message):void");
    }
}
