package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class SettingsContacts extends DialogToastPreferenceActivity {
    private static final String[] z;
    private CheckBoxPreference h;

    static {
        String[] strArr = new String[3];
        String str = ":Qu\u0016#(Uv>\u001f&Wn\u0000\u001f=J";
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
                        i3 = 73;
                        break;
                    case ay.f /*1*/:
                        i3 = 57;
                        break;
                    case ay.n /*2*/:
                        i3 = 26;
                        break;
                    case ay.p /*3*/:
                        i3 = 97;
                        break;
                    default:
                        i3 = 124;
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
                    str = "9Xc>\u001a&KE\u0000#/Ks\u0004\u0012-";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "=\\v\r#(f|\u0013\u0015,W~";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static CheckBoxPreference a(SettingsContacts settingsContacts) {
        return settingsContacts.h;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences_contacts);
        findPreference(z[1]).setOnPreferenceClickListener(new ass(this));
        findPreference(z[2]).setOnPreferenceClickListener(new a_g(this));
        this.h = (CheckBoxPreference) findPreference(z[0]);
        this.h.setOnPreferenceClickListener(new kj(this));
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.register_wait_message));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            default:
                return super.onCreateDialog(i);
        }
    }
}
