package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class g_ implements OnPreferenceClickListener {
    final Settings a;

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, SettingsHelp.class));
        return true;
    }

    g_(Settings settings) {
        this.a = settings;
    }
}
