package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class a8v implements OnPreferenceClickListener {
    final Settings a;

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, SettingsAccount.class));
        return true;
    }

    a8v(Settings settings) {
        this.a = settings;
    }
}
