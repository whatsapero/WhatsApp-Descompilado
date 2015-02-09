package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class c6 implements OnClickListener {
    final HomeActivity a;

    c6(HomeActivity homeActivity) {
        this.a = homeActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        HomeActivity.e(this.a);
    }
}
