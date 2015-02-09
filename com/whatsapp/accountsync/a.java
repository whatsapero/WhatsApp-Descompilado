package com.whatsapp.accountsync;

import android.content.Context;

final class a implements Runnable {
    final Context a;

    public void run() {
        PerformSyncManager.e(this.a);
    }

    a(Context context) {
        this.a = context;
    }
}
