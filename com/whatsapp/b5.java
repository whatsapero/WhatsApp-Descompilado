package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.whatsapp.fieldstats.au;

class b5 implements OnPreferenceClickListener {
    final SettingsHelp a;

    b5(SettingsHelp settingsHelp) {
        this.a = settingsHelp;
    }

    public boolean onPreferenceClick(Preference preference) {
        ak4.a(au.ABOUT);
        this.a.startActivity(new Intent(this.a, About.class));
        return true;
    }
}
