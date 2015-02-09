package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class c implements OnPreferenceClickListener {
    final SettingsAccount a;

    c(SettingsAccount settingsAccount) {
        this.a = settingsAccount;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, AccountInfoActivity.class));
        return true;
    }
}
