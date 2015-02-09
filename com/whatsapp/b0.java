package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class b0 implements OnPreferenceClickListener {
    final SettingsChat a;

    b0(SettingsChat settingsChat) {
        this.a = settingsChat;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.a.showDialog(5);
        return true;
    }
}
