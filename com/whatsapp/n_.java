package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class n_ implements OnPreferenceClickListener {
    final Settings a;

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(this.a, ProfileInfoActivity.class));
        return true;
    }

    n_(Settings settings) {
        this.a = settings;
    }
}
