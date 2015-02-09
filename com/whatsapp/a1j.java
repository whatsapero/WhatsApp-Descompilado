package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class a1j implements OnClickListener {
    private static final String z;
    final Activity a;

    static {
        char[] toCharArray = "n7]".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 12;
                    break;
                case ay.f /*1*/:
                    i2 = 66;
                    break;
                case ay.n /*2*/:
                    i2 = 36;
                    break;
                case ay.p /*3*/:
                    i2 = 102;
                    break;
                default:
                    i2 = 126;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r5, int r6) {
        /*
        r4_this = this;
        r0 = com.whatsapp.App.az;
        switch(r6) {
            case 0: goto L_0x000d;
            case 1: goto L_0x0023;
            case 2: goto L_0x0028;
            default: goto L_0x0005;
        };
    L_0x0005:
        r0 = r4.a;
        r1 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r0.removeDialog(r1);
        return;
    L_0x000d:
        r1 = new android.content.Intent;
        r2 = r4.a;
        r3 = com.whatsapp.AccountInfoActivity.class;
        r1.<init>(r2, r3);
        r2 = z;
        r3 = 1;
        r1.putExtra(r2, r3);
        r2 = r4.a;
        r2.startActivity(r1);
        if (r0 == 0) goto L_0x0005;
    L_0x0023:
        com.whatsapp.App.K();
        if (r0 == 0) goto L_0x0005;
    L_0x0028:
        r0 = new android.content.Intent;
        r1 = r4.a;
        r2 = com.whatsapp.AccountInfoActivity.class;
        r0.<init>(r1, r2);
        r1 = r4.a;
        r1.startActivity(r0);
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a1j.onClick(android.content.DialogInterface, int):void");
    }

    a1j(Activity activity) {
        this.a = activity;
    }
}
