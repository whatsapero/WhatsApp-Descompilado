package com.whatsapp.qrcode;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;

class a implements PreviewCallback {
    final QrCodeActivity a;

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        QrCodeActivity.g(this.a).post(new m(this, bArr));
    }

    a(QrCodeActivity qrCodeActivity) {
        this.a = qrCodeActivity;
    }
}
