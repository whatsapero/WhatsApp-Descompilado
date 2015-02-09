package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class a8b implements OnPreferenceClickListener {
    final Settings a;

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, SettingsContacts.class));
        return true;
    }

    a8b(Settings settings) {
        this.a = settings;
    }
}
