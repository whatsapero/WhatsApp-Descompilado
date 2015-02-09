package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.whatsapp.fieldstats.al;
import com.whatsapp.fieldstats.y;
import com.whatsapp.util.br;

class amx implements OnPreferenceChangeListener {
    final SettingsPrivacy a;

    amx(SettingsPrivacy settingsPrivacy) {
        this.a = settingsPrivacy;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        if (Boolean.TRUE.equals(obj)) {
            br.a(new v8(this));
        }
        al.a(this.a.getApplicationContext(), y.RECEIPTS_ENABLED, Boolean.valueOf(Boolean.TRUE.equals(obj)));
        return true;
    }
}
