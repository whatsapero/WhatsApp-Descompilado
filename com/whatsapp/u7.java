package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class u7 implements OnPreferenceClickListener {
    final Settings a;

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, SettingsNotifications.class));
        return true;
    }

    u7(Settings settings) {
        this.a = settings;
    }
}
