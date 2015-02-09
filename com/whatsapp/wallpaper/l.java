package com.whatsapp.wallpaper;

class l implements Runnable {
    final CropImageView a;
    final e b;

    public void run() {
        CropImageView.a(this.a, this.b);
    }

    l(CropImageView cropImageView, e eVar) {
        this.a = cropImageView;
        this.b = eVar;
    }
}
