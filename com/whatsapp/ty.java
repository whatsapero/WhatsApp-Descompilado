package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class ty implements OnClickListener {
    final Advanced a;

    public void onClick(View view) {
        App.d(this.a, 0);
        Intent intent = new Intent(this.a, EULA.class);
        this.a.finish();
        this.a.startActivity(intent);
    }

    ty(Advanced advanced) {
        this.a = advanced;
    }
}
