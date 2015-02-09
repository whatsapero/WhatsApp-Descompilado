package com.whatsapp.camera;

import android.view.View;
import android.view.View.OnClickListener;

class b implements OnClickListener {
    final CameraActivity a;

    public void onClick(View view) {
        CameraActivity.a(this.a, CameraActivity.d(this.a).j());
    }

    b(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }
}
