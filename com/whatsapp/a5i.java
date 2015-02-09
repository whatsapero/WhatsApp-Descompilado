package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class a5i implements OnPreferenceClickListener {
    final SettingsAccount a;

    a5i(SettingsAccount settingsAccount) {
        this.a = settingsAccount;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, SettingsNetworkUsage.class));
        return false;
    }
}
