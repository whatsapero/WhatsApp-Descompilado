package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class xv implements OnClickListener {
    final ProfileInfoActivity a;

    public void onClick(View view) {
        zv.a(ProfileInfoActivity.c(this.a), this.a, 12);
    }

    xv(ProfileInfoActivity profileInfoActivity) {
        this.a = profileInfoActivity;
    }
}
