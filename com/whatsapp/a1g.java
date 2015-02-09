package com.whatsapp;

import android.preference.Preference.OnPreferenceClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a1g implements OnPreferenceClickListener {
    private static final String[] z;
    final SettingsHelp a;

    static {
        String[] strArr = new String[3];
        String str = "\u001c\u0016U1n\u0001\u0014Rjf\r\u001cT1(\f\u001bO0jO";
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
                        i3 = 111;
                        break;
                    case ay.f /*1*/:
                        i3 = 115;
                        break;
                    case ay.n /*2*/:
                        i3 = 33;
                        break;
                    case ay.p /*3*/:
                        i3 = 69;
                        break;
                    default:
                        i3 = 7;
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
                    str = "\u000e\u0011N0s@\u001dNhd\u0000\u001dO d\u001b\u001aW,s\u0016";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u001c\u0016U1n\u0001\u0014Rjf\r\u001cT1";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreferenceClick(android.preference.Preference r7) {
        /*
        r6_this = this;
        r4 = 1;
        r3 = 0;
        r0 = com.whatsapp.fieldstats.au.CONTACT_US;
        com.whatsapp.ak4.a(r0);
        r0 = com.whatsapp.App.a();
        if (r0 != 0) goto L_0x0028;
    L_0x000d:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r6.a;
        r0 = r0.isFinishing();
        if (r0 != 0) goto L_0x0042;
    L_0x001d:
        r0 = r6.a;
        r1 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r0.showDialog(r1);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0042;
    L_0x0028:
        r0 = r6.a;
        r0 = com.whatsapp.ChangeNumber.c(r0);
        if (r0 != 0) goto L_0x0043;
    L_0x0030:
        r0 = z;
        r5 = r0[r4];
    L_0x0034:
        r0 = new com.whatsapp.o6;
        r1 = r6.a;
        r2 = r6.a;
        r0.<init>(r1, r2, r3, r4, r5);
        r1 = new java.lang.String[r3];
        com.whatsapp.a5w.a(r0, r1);
    L_0x0042:
        return r4;
    L_0x0043:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r5 = r0.toString();
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a1g.onPreferenceClick(android.preference.Preference):boolean");
    }

    a1g(SettingsHelp settingsHelp) {
        this.a = settingsHelp;
    }
}
