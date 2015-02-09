package com.whatsapp;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

class aks implements OnPreferenceChangeListener {
    final SettingsNotifications a;

    public boolean onPreferenceChange(Preference preference, Object obj) {
        ListPreference listPreference = (ListPreference) preference;
        preference.setSummary(listPreference.getEntries()[listPreference.findIndexOfValue((String) obj)].toString());
        return true;
    }

    aks(SettingsNotifications settingsNotifications) {
        this.a = settingsNotifications;
    }
}
