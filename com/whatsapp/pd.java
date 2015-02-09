package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class pd implements OnClickListener {
    final ProfilePhotoReminder a;

    pd(ProfilePhotoReminder profilePhotoReminder) {
        this.a = profilePhotoReminder;
    }

    public void onClick(View view) {
        zv.a(ProfilePhotoReminder.a(this.a), this.a, 12);
    }
}
