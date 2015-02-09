package com.whatsapp.qrcode;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;

class p implements AutoFocusCallback {
    final QrCodeView a;

    p(QrCodeView qrCodeView) {
        this.a = qrCodeView;
    }

    public void onAutoFocus(boolean z, Camera camera) {
        this.a.postDelayed(new i(this), 2000);
    }
}
