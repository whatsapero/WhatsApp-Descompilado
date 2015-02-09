package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class amu implements OnPreferenceClickListener {
    final SettingsChat a;

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, SettingsAutodownload.class));
        return false;
    }

    amu(SettingsChat settingsChat) {
        this.a = settingsChat;
    }
}
