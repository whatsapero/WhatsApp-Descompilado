package com.whatsapp.qrcode;

import com.actionbarsherlock.R;

class l implements Runnable {
    final QrCodeActivity a;

    l(QrCodeActivity qrCodeActivity) {
        this.a = qrCodeActivity;
    }

    public void run() {
        this.a.a(R.string.timeout_qr_code);
        this.a.setSupportProgressBarIndeterminateVisibility(false);
        QrCodeActivity.a(this.a, null);
        QrCodeActivity.c(this.a);
    }
}
