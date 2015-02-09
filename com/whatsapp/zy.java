package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class zy implements OnClickListener {
    final Advanced a;

    public void onClick(View view) {
        this.a.startActivity(new Intent(null, null, this.a, CorruptInstallationActivity.class));
    }

    zy(Advanced advanced) {
        this.a = advanced;
    }
}
