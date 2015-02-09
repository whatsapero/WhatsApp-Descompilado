package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class yb implements OnPreferenceClickListener {
    final SettingsAccount a;

    yb(SettingsAccount settingsAccount) {
        this.a = settingsAccount;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, DeleteAccount.class));
        return true;
    }
}
