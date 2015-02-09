package com.whatsapp;

import android.os.Build;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class li implements OnPreferenceChangeListener {
    private static final String[] z;
    final SettingsNotifications a;

    static {
        String[] strArr = new String[3];
        String str = "\u001f\u0014Be[!\u000fK";
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
                        i3 = 72;
                        break;
                    case ay.f /*1*/:
                        i3 = 125;
                        break;
                    case ay.n /*2*/:
                        i3 = 46;
                        break;
                    case ay.p /*3*/:
                        i3 = 1;
                        break;
                    default:
                        i3 = 61;
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
                    str = "xMhG\rx";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\f\u0018]hO-";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    li(SettingsNotifications settingsNotifications) {
        this.a = settingsNotifications;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        if ((Build.MODEL.contains(z[1]) || Build.MODEL.contains(z[0])) && !obj.toString().equals(z[2])) {
            this.a.showDialog(7);
        }
        ListPreference listPreference = (ListPreference) preference;
        String toString = listPreference.getEntries()[listPreference.findIndexOfValue((String) obj)].toString();
        preference.setTitle(this.a.getString(R.string.settings_notification_light_with_value, new Object[]{toString}));
        return true;
    }
}
