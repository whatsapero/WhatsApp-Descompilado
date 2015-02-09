package com.whatsapp;

import android.content.ServiceConnection;
import com.android.vending.billing.IInAppBillingService;

class xa {
    public ServiceConnection a;
    final t0 b;
    public IInAppBillingService c;

    public xa(t0 t0Var, IInAppBillingService iInAppBillingService, ServiceConnection serviceConnection) {
        this.b = t0Var;
        this.c = iInAppBillingService;
        this.a = serviceConnection;
    }
}
