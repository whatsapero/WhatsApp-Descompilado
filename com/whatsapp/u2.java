package com.whatsapp;

import android.preference.Preference.OnPreferenceClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class u2 implements OnPreferenceClickListener {
    private static final String z;
    final SettingsChat a;

    static {
        char[] toCharArray = "lC\u00174!VF\u001f.9f\\\u000f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 9;
                    break;
                case ay.f /*1*/:
                    i2 = 46;
                    break;
                case ay.n /*2*/:
                    i2 = 118;
                    break;
                case ay.p /*3*/:
                    i2 = 93;
                    break;
                default:
                    i2 = 77;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreferenceClick(android.preference.Preference r5) {
        /*
        r4_this = this;
        r3 = 1;
        r0 = com.whatsapp.App.d;
        if (r0 != 0) goto L_0x0009;
    L_0x0005:
        r0 = com.whatsapp.App.aF;
        if (r0 == 0) goto L_0x001b;
    L_0x0009:
        r1 = r4.a;
        r0 = com.whatsapp.App.aT();
        if (r0 == 0) goto L_0x0031;
    L_0x0011:
        r0 = 2131624582; // 0x7f0e0286 float:1.8876348E38 double:1.053162476E-314;
    L_0x0014:
        r1.a(r0);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0030;
    L_0x001b:
        r0 = new android.content.Intent;
        r1 = r4.a;
        r2 = com.whatsapp.ContactPicker.class;
        r0.<init>(r1, r2);
        r1 = z;
        r0.putExtra(r1, r3);
        r1 = r4.a;
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r1.startActivityForResult(r0, r2);
    L_0x0030:
        return r3;
    L_0x0031:
        r0 = 2131624583; // 0x7f0e0287 float:1.887635E38 double:1.0531624763E-314;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.u2.onPreferenceClick(android.preference.Preference):boolean");
    }

    u2(SettingsChat settingsChat) {
        this.a = settingsChat;
    }
}
