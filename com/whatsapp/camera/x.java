package com.whatsapp.camera;

import android.hardware.Camera.ShutterCallback;

class x implements ShutterCallback {
    final u a;
    final CameraView b;

    x(CameraView cameraView, u uVar) {
        this.b = cameraView;
        this.a = uVar;
    }

    public void onShutter() {
        this.a.a();
    }
}
