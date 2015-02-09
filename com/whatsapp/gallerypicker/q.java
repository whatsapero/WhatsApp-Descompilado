package com.whatsapp.gallerypicker;

class q implements Runnable {
    final a5 a;
    final bs b;

    q(bs bsVar, a5 a5Var) {
        this.b = bsVar;
        this.a = a5Var;
    }

    public void run() {
        if (!this.b.isCancelled()) {
            ImageGallery.f(this.b.a).add(this.a);
            ImageGallery.d(this.b.a).notifyDataSetChanged();
        }
    }
}
