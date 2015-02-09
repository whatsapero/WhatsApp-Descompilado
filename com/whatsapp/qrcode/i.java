package com.whatsapp.qrcode;

class i implements Runnable {
    final p a;

    i(p pVar) {
        this.a = pVar;
    }

    public void run() {
        if (QrCodeView.b(this.a.a) != null) {
            QrCodeView.b(this.a.a).autoFocus(this.a.a.b);
        }
    }
}
