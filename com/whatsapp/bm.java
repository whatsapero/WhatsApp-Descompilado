package com.whatsapp;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.actionbarsherlock.R;

class bm implements OnPreferenceChangeListener {
    final SettingsNotifications a;

    bm(SettingsNotifications settingsNotifications) {
        this.a = settingsNotifications;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        ListPreference listPreference = (ListPreference) preference;
        String toString = listPreference.getEntries()[listPreference.findIndexOfValue((String) obj)].toString();
        preference.setTitle(this.a.getString(R.string.settings_notification_vibrate_length_with_value, new Object[]{toString}));
        return true;
    }
}
