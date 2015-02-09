package com.whatsapp;

import com.actionbarsherlock.R;

final class sk implements Runnable {
    sk() {
    }

    public void run() {
        if (!SettingsPrivacy.c().isEmpty()) {
            SettingsPrivacy.c().clear();
            App.b(App.p.getApplicationContext(), (int) R.string.failed_to_update_privacy_settings, 1);
            if (SettingsPrivacy.a() != null) {
                SettingsPrivacy.a(SettingsPrivacy.a());
            }
        }
    }
}
