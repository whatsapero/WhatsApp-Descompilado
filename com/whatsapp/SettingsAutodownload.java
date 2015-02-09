package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import com.actionbarsherlock.R;
import com.whatsapp.preference.WaMultiSelectListPreference;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class SettingsAutodownload extends DialogToastPreferenceActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "V\u0016'OrX\u0014=LyV\u0007\fCs[\u000f&LwE";
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
                        i3 = 55;
                        break;
                    case ay.f /*1*/:
                        i3 = 99;
                        break;
                    case ay.n /*2*/:
                        i3 = 83;
                        break;
                    case ay.p /*3*/:
                        i3 = 32;
                        break;
                    default:
                        i3 = 22;
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
                    str = "V\u0016'OrX\u0014=LyV\u0007\fW\u007fQ\n";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "V\u0016'OrX\u0014=LyV\u0007\fRyV\u000e:Nq";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case ay.f /*1*/:
                return new Builder(this).setMessage(getString(R.string.settings_autodownload_roaming_warning)).setNeutralButton(R.string.ok, new at5(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    static int a(CharSequence[] charSequenceArr) {
        return b(charSequenceArr);
    }

    private static int b(CharSequence[] charSequenceArr) {
        int i = 0;
        int i2 = App.az;
        int length = charSequenceArr.length;
        int i3 = 0;
        while (i3 < length) {
            i |= 1 << Integer.parseInt(charSequenceArr[i3].toString());
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        return i;
    }

    private static CharSequence[] a(int i) {
        int i2 = App.az;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i != 0) {
            if ((i & 1) != 0) {
                arrayList.add(Integer.toString(i3));
            }
            i >>= 1;
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        return (CharSequence[]) arrayList.toArray(new CharSequence[0]);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences_autodownload);
        WaMultiSelectListPreference waMultiSelectListPreference = (WaMultiSelectListPreference) findPreference(z[0]);
        waMultiSelectListPreference.b(getString(R.string.settings_autodownload_none));
        waMultiSelectListPreference.a(getString(R.string.settings_autodownload_all));
        waMultiSelectListPreference.a(a(App.c(2)));
        waMultiSelectListPreference.setOnPreferenceChangeListener(new vq(this));
        waMultiSelectListPreference = (WaMultiSelectListPreference) findPreference(z[2]);
        waMultiSelectListPreference.b(getString(R.string.settings_autodownload_none));
        waMultiSelectListPreference.a(getString(R.string.settings_autodownload_all));
        waMultiSelectListPreference.a(a(App.c(1)));
        waMultiSelectListPreference.setOnPreferenceChangeListener(new xp(this));
        waMultiSelectListPreference = (WaMultiSelectListPreference) findPreference(z[1]);
        waMultiSelectListPreference.b(getString(R.string.settings_autodownload_none));
        waMultiSelectListPreference.a(getString(R.string.settings_autodownload_all));
        waMultiSelectListPreference.a(a(App.c(3)));
        waMultiSelectListPreference.setOnPreferenceChangeListener(new gj(this));
    }
}
