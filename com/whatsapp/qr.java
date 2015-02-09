package com.whatsapp;

import android.view.View;
import com.whatsapp.util.ar;

class qr extends ar {
    final vf b;
    final m8 c;

    qr(vf vfVar, m8 m8Var) {
        this.b = vfVar;
        this.c = m8Var;
    }

    public void a(View view) {
        ContactsFragment.a(this.b.d, this.c);
    }
}
