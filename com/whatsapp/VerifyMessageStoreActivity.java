package com.whatsapp;

import android.app.Dialog;

public class VerifyMessageStoreActivity extends UserFeedbackActivity {
    private ata j;

    protected void a(boolean z) {
        this.j.a(z, true);
    }

    public VerifyMessageStoreActivity() {
        this.j = new atp(this, this);
    }

    protected void d() {
    }

    protected void b(boolean z) {
        this.j.a(z);
    }

    protected void e() {
        this.j.b();
    }

    protected void b() {
    }

    protected Dialog onCreateDialog(int i) {
        Dialog a = this.j.a(i);
        return a != null ? a : super.onCreateDialog(i);
    }
}
