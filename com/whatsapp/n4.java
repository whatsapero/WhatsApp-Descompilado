package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.actionbarsherlock.R;

class n4 extends Handler {
    final ViewProfilePhoto a;

    n4(ViewProfilePhoto viewProfilePhoto) {
        this.a = viewProfilePhoto;
    }

    public void handleMessage(Message message) {
        App.b(App.p, ViewProfilePhoto.a(this.a).w() ? R.string.failed_update_photo : R.string.failed_update_profile_photo, 0);
        this.a.findViewById(R.id.progress_bar).setVisibility(8);
    }
}
