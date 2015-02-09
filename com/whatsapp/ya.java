package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.actionbarsherlock.R;
import com.whatsapp.preference.WaPrivacyPreference;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class ya implements OnPreferenceChangeListener {
    private static final String[] z;
    final SettingsPrivacy a;

    static {
        String[] strArr = new String[6];
        String str = "\u0007\u007fxfH\u0014tN|H\u0004yNcL\u0012c";
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
                        i3 = 119;
                        break;
                    case ay.f /*1*/:
                        i3 = 13;
                        break;
                    case ay.n /*2*/:
                        i3 = 17;
                        break;
                    case ay.p /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 41;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0007\u007fxfH\u0014tN`[\u0018kx|L(}y\u007f]\u0018";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0004ypd\\\u0004";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0007\u007f~v@\u001bh";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0007\u007fxfH\u0014tNc]\u0016ydc";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u001blbd";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        if (App.a()) {
            WaPrivacyPreference waPrivacyPreference = (WaPrivacyPreference) preference;
            int findIndexOfValue = waPrivacyPreference.findIndexOfValue((String) obj);
            waPrivacyPreference.setSummary(waPrivacyPreference.getEntries()[findIndexOfValue].toString());
            waPrivacyPreference.a(true);
            waPrivacyPreference.setEnabled(false);
            String key = preference.getKey();
            String str = null;
            if (z[0].equals(key)) {
                str = z[1];
            } else if (z[2].equals(key)) {
                str = z[4];
            } else if (z[5].equals(key)) {
                str = z[3];
            }
            String a = SettingsPrivacy.a(findIndexOfValue);
            SettingsPrivacy.c().put(str, new uy(str, a));
            App.T();
            App.b(str, a);
            SettingsPrivacy.d().removeCallbacks(SettingsPrivacy.b());
            SettingsPrivacy.d().postDelayed(SettingsPrivacy.b(), 20000);
            return true;
        }
        App.b(this.a, (int) R.string.coldsync_no_network, 0);
        return false;
    }

    ya(SettingsPrivacy settingsPrivacy) {
        this.a = settingsPrivacy;
    }
}
