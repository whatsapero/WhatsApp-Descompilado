package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.y.a;
import com.google.android.gms.internal.jx;

class u extends BroadcastReceiver {
    static final String yR;
    private final aj yS;

    static {
        yR = u.class.getName();
    }

    public void onReceive(Context context, Intent intent) {
        boolean z = false;
        boolean z2 = a.a;
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            aj ajVar = this.yS;
            if (!booleanExtra) {
                z = true;
            }
            ajVar.C(z);
            if (z2) {
                jx.a++;
            } else {
                return;
            }
        }
        if ("com.google.analytics.RADIO_POWERED".equals(action) && !intent.hasExtra(yR)) {
            this.yS.ey();
        }
    }
}
