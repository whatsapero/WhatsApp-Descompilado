package com.whatsapp;

import android.preference.Preference.OnPreferenceClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class jq implements OnPreferenceClickListener {
    private static final String z;
    final SettingsHelp a;

    static {
        char[] toCharArray = "\u000br\u0015)%\u0016p\u0012r/\u0010r\u00026?\u0001d\u00158!\u000bc\u0000)9\u000b8\u000f2a\u001bx\u000f3)\u001bc\b+%\fn".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case ay.f /*1*/:
                    i2 = 23;
                    break;
                case ay.n /*2*/:
                    i2 = 97;
                    break;
                case ay.p /*3*/:
                    i2 = 93;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    jq(SettingsHelp settingsHelp) {
        this.a = settingsHelp;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreferenceClick(android.preference.Preference r9) {
        /*
        r8_this = this;
        r7 = 0;
        r3 = 1;
        r0 = com.whatsapp.App.a();
        if (r0 != 0) goto L_0x002c;
    L_0x0008:
        r0 = z;
        com.whatsapp.util.Log.i(r0);
        r0 = r8.a;
        r1 = r8.a;
        r2 = 2131624725; // 0x7f0e0315 float:1.8876638E38 double:1.0531625464E-314;
        r4 = new java.lang.Object[r3];
        r5 = r8.a;
        r6 = 2131624132; // 0x7f0e00c4 float:1.8875435E38 double:1.0531622535E-314;
        r5 = r5.getString(r6);
        r4[r7] = r5;
        r1 = r1.getString(r2, r4);
        r0.f(r1);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x003d;
    L_0x002c:
        r0 = new com.whatsapp.o6;
        r1 = r8.a;
        r2 = r8.a;
        r5 = "";
        r4 = r3;
        r0.<init>(r1, r2, r3, r4, r5);
        r1 = new java.lang.String[r7];
        com.whatsapp.a5w.a(r0, r1);
    L_0x003d:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jq.onPreferenceClick(android.preference.Preference):boolean");
    }
}
