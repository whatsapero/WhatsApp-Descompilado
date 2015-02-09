package com.whatsapp.camera;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;

class al implements AutoFocusCallback {
    final CameraView a;

    al(CameraView cameraView) {
        this.a = cameraView;
    }

    public void onAutoFocus(boolean z, Camera camera) {
    }
}
