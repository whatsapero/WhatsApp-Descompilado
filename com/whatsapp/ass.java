package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.whatsapp.fieldstats.a7;
import com.whatsapp.fieldstats.au;

class ass implements OnPreferenceClickListener {
    final SettingsContacts a;

    ass(SettingsContacts settingsContacts) {
        this.a = settingsContacts;
    }

    public boolean onPreferenceClick(Preference preference) {
        ak4.a(au.TELL_A_FRIEND, a7.SETTINGS_CONTACTS);
        App.c(this.a);
        return true;
    }
}
