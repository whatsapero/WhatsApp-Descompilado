package com.whatsapp;

import com.whatsapp.protocol.b;

class gm extends fc {
    final MessageDetailsActivity a;

    public void b(b bVar, int i) {
        d(bVar);
    }

    public void b(b bVar) {
        d(bVar);
    }

    public void a(String str) {
        if (str != null && str.equals(MessageDetailsActivity.d(this.a).e.c) && App.aJ.b(MessageDetailsActivity.d(this.a).e) == null) {
            this.a.finish();
        }
    }

    private void d(b bVar) {
        this.a.runOnUiThread(new nl(this, bVar));
    }

    gm(MessageDetailsActivity messageDetailsActivity) {
        this.a = messageDetailsActivity;
    }
}
