package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class ve implements OnPreferenceClickListener {
    final Settings a;

    ve(Settings settings) {
        this.a = settings;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, SettingsChat.class));
        return true;
    }
}
