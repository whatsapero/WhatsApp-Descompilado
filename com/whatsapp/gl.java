package com.whatsapp;

import com.whatsapp.protocol.b;

class gl extends fc {
    final Broadcasts a;

    gl(Broadcasts broadcasts) {
        this.a = broadcasts;
    }

    public void a(b bVar, int i) {
        if (bVar != null && bVar.l && bVar.e.b) {
            Broadcasts.a(this.a).a();
        }
    }

    public void a(String str) {
        if (m8.f(str)) {
            Broadcasts.a(this.a).a();
        }
    }

    public void b(b bVar, int i) {
        if (bVar != null && bVar.l && bVar.e.b) {
            Broadcasts.a(this.a).notifyDataSetChanged();
        }
    }
}
