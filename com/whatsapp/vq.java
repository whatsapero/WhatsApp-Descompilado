package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

class vq implements OnPreferenceChangeListener {
    final SettingsAutodownload a;

    public boolean onPreferenceChange(Preference preference, Object obj) {
        App.a(2, SettingsAutodownload.a((CharSequence[]) obj));
        return true;
    }

    vq(SettingsAutodownload settingsAutodownload) {
        this.a = settingsAutodownload;
    }
}
