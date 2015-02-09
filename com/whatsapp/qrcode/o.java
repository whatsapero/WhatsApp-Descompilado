package com.whatsapp.qrcode;

class o implements Runnable {
    final QrCodeActivity a;

    o(QrCodeActivity qrCodeActivity) {
        this.a = qrCodeActivity;
    }

    public void run() {
        this.a.setSupportProgressBarIndeterminateVisibility(true);
    }
}
