package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

class xp implements OnPreferenceChangeListener {
    final SettingsAutodownload a;

    xp(SettingsAutodownload settingsAutodownload) {
        this.a = settingsAutodownload;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        App.a(1, SettingsAutodownload.a((CharSequence[]) obj));
        return true;
    }
}
