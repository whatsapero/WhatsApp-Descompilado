package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

class bo extends BroadcastReceiver {
    static final String yR;
    private final cx asb;

    static {
        yR = bo.class.getName();
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            Bundle extras = intent.getExtras();
            Boolean bool = Boolean.FALSE;
            if (extras != null) {
                bool = Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"));
            }
            this.asb.C(!bool.booleanValue());
            if (DataLayer.a == 0) {
                return;
            }
        }
        if ("com.google.analytics.RADIO_POWERED".equals(action) && !intent.hasExtra(yR)) {
            this.asb.ey();
        }
    }
}
