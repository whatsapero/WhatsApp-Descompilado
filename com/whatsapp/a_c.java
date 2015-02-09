package com.whatsapp;

import java.util.Collection;

class a_c implements anq {
    final MediaView a;

    public void c(String str) {
    }

    public void a(Collection collection) {
    }

    public void a() {
    }

    a_c(MediaView mediaView) {
        this.a = mediaView;
    }

    public void b(String str) {
    }

    public void a(String str) {
    }

    public void d(String str) {
        if (MediaView.r(this.a) != null && MediaView.r(this.a).equals(str)) {
            this.a.removeDialog(1);
            if (App.az == 0) {
                return;
            }
        }
        m8 d = App.P.d();
        if (d != null && str.equals(d.e)) {
            this.a.removeDialog(0);
        }
    }
}
