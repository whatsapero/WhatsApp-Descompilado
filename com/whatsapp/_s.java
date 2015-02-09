package com.whatsapp;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.actionbarsherlock.R;

class _s implements OnPreferenceChangeListener {
    final SettingsChat a;

    _s(SettingsChat settingsChat) {
        this.a = settingsChat;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        ListPreference listPreference = (ListPreference) preference;
        String toString = listPreference.getEntries()[listPreference.findIndexOfValue((String) obj)].toString();
        preference.setTitle(this.a.getString(R.string.settings_font_size_with_value, new Object[]{toString}));
        return true;
    }
}
