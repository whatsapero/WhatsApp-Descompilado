package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class ow implements OnPreferenceClickListener {
    final SettingsPrivacy a;

    ow(SettingsPrivacy settingsPrivacy) {
        this.a = settingsPrivacy;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, BlockList.class));
        return true;
    }
}
