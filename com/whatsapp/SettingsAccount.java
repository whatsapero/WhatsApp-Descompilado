package com.whatsapp;

import android.os.Bundle;
import com.actionbarsherlock.R;
import com.whatsapp.fieldstats.au;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class SettingsAccount extends DialogToastPreferenceActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "x\u0006\u0017z;w\u0011+| \u007f\n";
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
                        i3 = 25;
                        break;
                    case ay.f /*1*/:
                        i3 = 101;
                        break;
                    case ay.n /*2*/:
                        i3 = 116;
                        break;
                    case ay.p /*3*/:
                        i3 = 21;
                        break;
                    default:
                        i3 = 78;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "}\u0000\u0018p:|:\u0015v-v\u0010\u001aa";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "w\u0000\u0000b!k\u000e+`=x\u0002\u0011";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "i\u0017\u001dc/z\u001c";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "z\r\u0015{)|:\u001a`#{\u0000\u0006";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ak4.a(au.ACCOUNT);
        addPreferencesFromResource(R.xml.preferences_account);
        findPreference(z[0]).setOnPreferenceClickListener(new c(this));
        findPreference(z[3]).setOnPreferenceClickListener(new a5i(this));
        findPreference(z[1]).setOnPreferenceClickListener(new so(this));
        findPreference(z[2]).setOnPreferenceClickListener(new yb(this));
        findPreference(z[4]).setOnPreferenceClickListener(new a3n(this));
    }
}
