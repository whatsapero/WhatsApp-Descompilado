package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class kj implements OnPreferenceClickListener {
    final SettingsContacts a;

    public boolean onPreferenceClick(Preference preference) {
        a5w.a(new en(this.a, null), new Void[0]);
        return true;
    }

    kj(SettingsContacts settingsContacts) {
        this.a = settingsContacts;
    }
}
