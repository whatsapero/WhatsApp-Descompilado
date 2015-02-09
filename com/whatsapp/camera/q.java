package com.whatsapp.camera;

import android.view.View;
import com.whatsapp.util.ar;

class q extends ar {
    final CameraActivity b;

    public void a(View view) {
        if (!CameraActivity.d(this.b).m() && CameraActivity.t(this.b) == null) {
            CameraActivity.q(this.b);
        }
    }

    q(CameraActivity cameraActivity) {
        this.b = cameraActivity;
    }
}
