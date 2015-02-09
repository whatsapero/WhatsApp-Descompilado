package com.whatsapp.camera;

import android.view.View;
import com.whatsapp.util.ar;

class p extends ar {
    final CameraActivity b;

    p(CameraActivity cameraActivity) {
        this.b = cameraActivity;
    }

    public void a(View view) {
        CameraActivity.t(this.b).delete();
        CameraActivity.b(this.b);
    }
}
