package com.whatsapp;

import android.os.Bundle;
import com.actionbarsherlock.R;
import com.whatsapp.fieldstats.au;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class Settings extends DialogToastPreferenceActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[6];
        String str = "h:YG\u0017u8^l\u001ds>Y";
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
                        i3 = 27;
                        break;
                    case ay.f /*1*/:
                        i3 = 95;
                        break;
                    case ay.n /*2*/:
                        i3 = 45;
                        break;
                    case ay.p /*3*/:
                        i3 = 51;
                        break;
                    default:
                        i3 = 126;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "z<N\\\u000bu+rZ\u0010}0";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "h:YG\u0017u8^l\u0016~3]";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "k-BU\u0017w:rZ\u0010}0";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "x0CG\u001fx+rZ\u0010}0";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "u0YZ\u0018r<LG\u0017t1^";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ak4.a(au.SETTINGS);
        addPreferencesFromResource(R.xml.preferences);
        findPreference(z[3]).setOnPreferenceClickListener(new g_(this));
        findPreference(z[5]).setOnPreferenceClickListener(new a8b(this));
        findPreference(z[4]).setOnPreferenceClickListener(new n_(this));
        findPreference(z[2]).setOnPreferenceClickListener(new a8v(this));
        findPreference(z[0]).setOnPreferenceClickListener(new ve(this));
        findPreference(z[1]).setOnPreferenceClickListener(new u7(this));
    }
}
