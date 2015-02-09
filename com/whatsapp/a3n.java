package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class a3n implements OnPreferenceClickListener {
    final SettingsAccount a;

    a3n(SettingsAccount settingsAccount) {
        this.a = settingsAccount;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, SettingsPrivacy.class));
        return true;
    }
}
