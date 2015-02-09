package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class td implements OnClickListener {
    final lv a;

    td(lv lvVar) {
        this.a = lvVar;
    }

    public void onClick(View view) {
        this.a.g.startActivity(new Intent(this.a.g, AccountInfoActivity.class));
        this.a.g.finish();
        RegisterName.a(null);
        this.a.g.removeDialog(0);
    }
}
