package com.whatsapp;

import com.whatsapp.protocol.b;

class av6 extends avq {
    final jg s;

    public void onPostExecute(Object obj) {
        a((rk) obj);
    }

    public void a(rk rkVar) {
        super.a(rkVar);
        if (rkVar == rk.SUCCESS && this.d) {
            b bVar = new b(this.k);
            bVar.N = true;
            App.j(bVar);
        }
    }

    av6(jg jgVar, b bVar, long j, boolean z) {
        this.s = jgVar;
        super(bVar, j, z);
    }
}
