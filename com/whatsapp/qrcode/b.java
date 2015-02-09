package com.whatsapp.qrcode;

import android.hardware.Camera;

class b implements Runnable {
    final QrCodeActivity a;

    public void run() {
        Camera a = QrCodeActivity.a(this.a).a();
        if (a != null) {
            a.setOneShotPreviewCallback(QrCodeActivity.e(this.a));
        }
    }

    b(QrCodeActivity qrCodeActivity) {
        this.a = qrCodeActivity;
    }
}
