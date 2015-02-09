package com.whatsapp.camera;

import android.view.View;
import android.view.View.OnClickListener;

class w implements OnClickListener {
    final CameraActivity a;

    w(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public void onClick(View view) {
        CameraActivity.d(this.a).c();
    }
}
