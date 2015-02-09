package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class j implements OnPreferenceClickListener {
    final SettingsChat a;

    j(SettingsChat settingsChat) {
        this.a = settingsChat;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.a.showDialog(3);
        return true;
    }
}
