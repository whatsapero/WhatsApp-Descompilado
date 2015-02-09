package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class afg implements OnPreferenceClickListener {
    final SettingsChat a;

    public boolean onPreferenceClick(Preference preference) {
        this.a.showDialog(4);
        return true;
    }

    afg(SettingsChat settingsChat) {
        this.a = settingsChat;
    }
}
