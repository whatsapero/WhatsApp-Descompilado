package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a_g implements OnPreferenceClickListener {
    private static final String z;
    final SettingsContacts a;

    static {
        char[] toCharArray = "=h\u00046I=s".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 94;
                    break;
                case ay.f /*1*/:
                    i2 = 7;
                    break;
                case ay.n /*2*/:
                    i2 = 106;
                    break;
                case ay.p /*3*/:
                    i2 = 66;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean onPreferenceClick(Preference preference) {
        Intent intent = new Intent(this.a, AccountInfoActivity.class);
        intent.putExtra(z, true);
        this.a.startActivity(intent);
        return true;
    }

    a_g(SettingsContacts settingsContacts) {
        this.a = settingsContacts;
    }
}
