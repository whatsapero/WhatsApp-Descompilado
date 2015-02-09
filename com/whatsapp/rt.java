package com.whatsapp;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.protocol.b;

final class rt implements OnClickListener {
    final Activity a;
    final b b;
    final String c;

    rt(Activity activity, b bVar, String str) {
        this.a = activity;
        this.b = bVar;
        this.c = str;
    }

    public void onClick(View view) {
        this.a.startActivity(MediaView.a(this.b, this.c, this.a.getBaseContext(), view));
    }
}
