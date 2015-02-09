package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

class gj implements OnPreferenceChangeListener {
    final SettingsAutodownload a;

    public boolean onPreferenceChange(Preference preference, Object obj) {
        int a = SettingsAutodownload.a((CharSequence[]) obj);
        App.a(3, a);
        if ((a & 4) != 0) {
            this.a.showDialog(1);
        }
        return true;
    }

    gj(SettingsAutodownload settingsAutodownload) {
        this.a = settingsAutodownload;
    }
}
