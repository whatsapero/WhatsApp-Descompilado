package com.whatsapp;

import com.whatsapp.protocol.b;

class ix implements a1y {
    final MediaData a;
    Runnable b;
    final b c;
    final fj d;

    ix(fj fjVar, b bVar, MediaData mediaData) {
        this.d = fjVar;
        this.c = bVar;
        this.a = mediaData;
        this.b = new _9(this);
    }

    public boolean a(int i) {
        this.a.progress = (long) i;
        j_.c(this.d.a).post(this.b);
        return false;
    }
}
