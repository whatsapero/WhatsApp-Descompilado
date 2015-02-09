package com.whatsapp.camera;

import android.view.View;
import android.view.View.OnClickListener;

class a5 implements OnClickListener {
    final CameraActivity a;

    a5(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public void onClick(View view) {
        CameraActivity.a(this.a, CameraActivity.i(this.a) + 90);
        if (CameraActivity.i(this.a) >= 360) {
            CameraActivity.a(this.a, CameraActivity.i(this.a) - 360);
        }
        CameraActivity.l(this.a).d();
    }
}
