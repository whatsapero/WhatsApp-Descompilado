package com.whatsapp;

import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;
import com.whatsapp.util.bm;
import java.util.ArrayList;

class lz {
    final CallsFragment a;
    private final ArrayList b;

    public lz(CallsFragment callsFragment) {
        this.a = callsFragment;
        this.b = new ArrayList();
    }

    public boolean a(b bVar, b bVar2) {
        if (!bVar.e.c.equals(bVar2.e.c) || !bm.a(bVar.D, bVar2.D)) {
            return false;
        }
        boolean z;
        if (bVar.e.b || bVar.p != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !bVar2.e.b && bVar2.p == 0;
        return z == z2;
    }

    public boolean b(b bVar) {
        return this.b.isEmpty() || a(bVar, (b) this.b.get(this.b.size() - 1));
    }

    public boolean a(b bVar) {
        boolean b = b(bVar);
        if (b) {
            this.b.add(bVar);
        }
        return b;
    }

    m8 d() {
        return e() ? null : App.P.a(((b) this.b.get(0)).e.c);
    }

    boolean e() {
        return this.b.isEmpty();
    }

    long b() {
        return e() ? 0 : App.f((b) this.b.get(0));
    }

    static ArrayList a(lz lzVar) {
        return lzVar.b;
    }

    public String toString() {
        return e() ? null : d().a(this.a.getActivity());
    }

    public lz(CallsFragment callsFragment, b bVar) {
        this.a = callsFragment;
        this.b = new ArrayList();
        this.b.add(bVar);
    }

    int a() {
        if (e()) {
            return 0;
        }
        b bVar = (b) this.b.get(0);
        if (bVar.e.b) {
            return R.drawable.call_out;
        }
        return bVar.p > 0 ? R.drawable.call_inc : R.drawable.call_missed;
    }

    int c() {
        return this.b.size();
    }
}
