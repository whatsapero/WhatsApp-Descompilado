package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceCategory;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class SettingsNotifications extends DialogToastPreferenceActivity {
    private static final String[] z;
    private OnPreferenceChangeListener h;
    private OnPreferenceChangeListener i;
    private OnPreferenceChangeListener j;

    static {
        String[] strArr = new String[9];
        String str = "]:B\u0000:e&B\u0001#\\1r\u0003#X:L\u0001/e$H\u001b-N ";
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
                        i3 = 58;
                        break;
                    case ay.f /*1*/:
                        i3 = 72;
                        break;
                    case ay.n /*2*/:
                        i3 = 45;
                        break;
                    case ay.p /*3*/:
                        i3 = 117;
                        break;
                    default:
                        i3 = 74;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "T'Y\u001c,C\u0017A\u001c-R<r\u0016%V'_";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "]:B\u0000:e&B\u0001#\\1r\u0005%J=]*'U,H";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "B0U\r2B0";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "]:B\u0000:e&B\u0001#\\!N\u0014>S'C";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "T'Y\u001c,C\u0017[\u001c(H)Y\u0010\u0015V-C\u0012>R";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "T'Y\u001c,C\u0017]\u001a:O8r\u0018%^-";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "]:B\u0000:e&B\u0001#\\1r\u0019#] Y*)U$B\u0007";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "T'Y\u001c,S+L\u0001#U&";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public SettingsNotifications() {
        this.h = new li(this);
        this.i = new bm(this);
        this.j = new aks(this);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences_notifications);
        ListPreference listPreference = (ListPreference) findPreference(z[2]);
        listPreference.setTitle(getString(R.string.settings_notification_light_with_value, new Object[]{listPreference.getEntry()}));
        listPreference.setOnPreferenceChangeListener(this.h);
        ListPreference listPreference2 = (ListPreference) findPreference(z[8]);
        listPreference2.setTitle(getString(R.string.settings_notification_light_with_value, new Object[]{listPreference2.getEntry()}));
        listPreference2.setOnPreferenceChangeListener(this.h);
        ListPreference listPreference3 = (ListPreference) findPreference(z[6]);
        listPreference3.setTitle(getString(R.string.settings_notification_vibrate_length_with_value, new Object[]{listPreference3.getEntry()}));
        listPreference3.setOnPreferenceChangeListener(this.i);
        listPreference3 = (ListPreference) findPreference(z[0]);
        listPreference3.setTitle(getString(R.string.settings_notification_vibrate_length_with_value, new Object[]{listPreference3.getEntry()}));
        listPreference3.setOnPreferenceChangeListener(this.i);
        listPreference3 = (ListPreference) findPreference(z[7]);
        listPreference3.setSummary(listPreference3.getEntry());
        listPreference3.setOnPreferenceChangeListener(this.j);
        listPreference3 = (ListPreference) findPreference(z[3]);
        listPreference3.setSummary(listPreference3.getEntry());
        listPreference3.setOnPreferenceChangeListener(this.j);
        if (Build.MANUFACTURER.replace(' ', '_').equalsIgnoreCase(z[4]) && getPreferenceScreen() != null) {
            PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference(z[1]);
            if (preferenceCategory != null) {
                preferenceCategory.removePreference(listPreference);
            }
            PreferenceCategory preferenceCategory2 = (PreferenceCategory) findPreference(z[5]);
            if (preferenceCategory2 != null) {
                preferenceCategory2.removePreference(listPreference2);
            }
        }
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case a8.s /*7*/:
                return new Builder(this).setMessage(getString(R.string.led_support_green_only)).setNeutralButton(R.string.ok, new ae(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }
}
