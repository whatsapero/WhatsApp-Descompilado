package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class hv implements OnClickListener {
    final SettingsNetworkUsage a;

    hv(SettingsNetworkUsage settingsNetworkUsage) {
        this.a = settingsNetworkUsage;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            d7.a();
            SettingsNetworkUsage.a(this.a);
        }
    }
}
