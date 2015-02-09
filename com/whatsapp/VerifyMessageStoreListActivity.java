package com.whatsapp;

import android.app.Dialog;

public class VerifyMessageStoreListActivity extends DialogToastListActivity {
    private ata i;

    protected void b() {
    }

    protected void a() {
    }

    public VerifyMessageStoreListActivity() {
        this.i = new ate(this, this);
    }

    protected Dialog onCreateDialog(int i) {
        Dialog a = this.i.a(i);
        return a != null ? a : super.onCreateDialog(i);
    }
}
