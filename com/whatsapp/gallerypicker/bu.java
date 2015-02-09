package com.whatsapp.gallerypicker;

class bu implements Runnable {
    final a5 a;
    final bs b;

    bu(bs bsVar, a5 a5Var) {
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
