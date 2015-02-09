package com.whatsapp.camera;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;

class d implements AutoFocusCallback {
    final CameraView a;

    d(CameraView cameraView) {
        this.a = cameraView;
    }

    public void onAutoFocus(boolean z, Camera camera) {
        CameraView.g(this.a).a(z);
    }
}
