package com.whatsapp.qrcode;

class q implements Runnable {
    final QrCodeActivity a;

    public void run() {
        QrCodeActivity.c(this.a);
    }

    q(QrCodeActivity qrCodeActivity) {
        this.a = qrCodeActivity;
    }
}
