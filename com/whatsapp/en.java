package com.whatsapp;

import android.os.AsyncTask;
import android.preference.CheckBoxPreference;
import com.whatsapp.contact.c;
import com.whatsapp.contact.i;
import com.whatsapp.contact.k;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class en extends AsyncTask {
    private static final String[] z;
    final SettingsContacts a;

    static {
        String[] strArr = new String[4];
        String str = "J3+~DW1,%^@8<%KX?3oI\u00165=yYX\"*y\r";
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
                        i3 = 57;
                        break;
                    case ay.f /*1*/:
                        i3 = 86;
                        break;
                    case ay.n /*2*/:
                        i3 = 95;
                        break;
                    case ay.p /*3*/:
                        i3 = 10;
                        break;
                    default:
                        i3 = 45;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "J3+~DW1,%^@8<%^L5<o^Jy<h^M7+\u007f^\u0019";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "J3+~DW1,%^@8<%KX?3oI\u00165=yYX\"*y\r";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "J3+~DW1,%^@8<%KX?3oI\u00165=yYX\"*y\r";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onPreExecute() {
        this.a.showDialog(16);
    }

    protected k a(Void[] voidArr) {
        return i.d(this.a.getApplicationContext(), c.INTERACTIVE_FULL);
    }

    private void a(CheckBoxPreference checkBoxPreference) {
        checkBoxPreference.setChecked(!checkBoxPreference.isChecked());
    }

    private en(SettingsContacts settingsContacts) {
        this.a = settingsContacts;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.contact.k r6) {
        /*
        r5_this = this;
        r4 = 1;
        r0 = com.whatsapp.App.az;
        r1 = r5.a;
        r2 = 16;
        r1.removeDialog(r2);
        r1 = com.whatsapp.jd.a;
        r2 = r6.ordinal();
        r1 = r1[r2];
        switch(r1) {
            case 1: goto L_0x0016;
            case 2: goto L_0x0051;
            case 3: goto L_0x0086;
            case 4: goto L_0x0086;
            case 5: goto L_0x00c1;
            default: goto L_0x0015;
        };
    L_0x0015:
        return;
    L_0x0016:
        r1 = com.whatsapp.App.a0;
        r1.b(r4);
        r1 = com.whatsapp.App.p;
        r2 = java.lang.System.currentTimeMillis();
        r1.d(r2);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r5.a;
        r2 = com.whatsapp.SettingsContacts.a(r2);
        r2 = r2.isChecked();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r5.a;
        r2 = 2131624154; // 0x7f0e00da float:1.887548E38 double:1.0531622643E-314;
        r1.a(r2);
        if (r0 == 0) goto L_0x0015;
    L_0x0051:
        r1 = r5.a;
        r1 = com.whatsapp.SettingsContacts.a(r1);
        r5.a(r1);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r2 = r5.a;
        r2 = com.whatsapp.SettingsContacts.a(r2);
        r2 = r2.isChecked();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r5.a;
        r2 = 2131624089; // 0x7f0e0099 float:1.8875348E38 double:1.053162232E-314;
        r1.a(r2);
        if (r0 == 0) goto L_0x0015;
    L_0x0086:
        r1 = com.whatsapp.App.a0;
        r1.a(r4);
        r1 = r5.a;
        r1 = com.whatsapp.SettingsContacts.a(r1);
        r5.a(r1);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r5.a;
        r2 = com.whatsapp.SettingsContacts.a(r2);
        r2 = r2.isChecked();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r5.a;
        r2 = 2131624088; // 0x7f0e0098 float:1.8875346E38 double:1.0531622317E-314;
        r1.a(r2);
        if (r0 == 0) goto L_0x0015;
    L_0x00c1:
        r0 = r5.a;
        r0 = com.whatsapp.SettingsContacts.a(r0);
        r5.a(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r5.a;
        r1 = com.whatsapp.SettingsContacts.a(r1);
        r1 = r1.isChecked();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r5.a;
        r1 = 2131624090; // 0x7f0e009a float:1.887535E38 double:1.0531622327E-314;
        r0.a(r1);
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.en.a(com.whatsapp.contact.k):void");
    }

    en(SettingsContacts settingsContacts, ass com_whatsapp_ass) {
        this(settingsContacts);
    }

    protected void onPostExecute(Object obj) {
        a((k) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
