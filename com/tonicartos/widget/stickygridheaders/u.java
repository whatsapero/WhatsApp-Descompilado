package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

final class u extends DataSetObserver {
    final p a;

    u(p pVar, e eVar) {
        this(pVar);
    }

    public void onChanged() {
        p.a(this.a, this.a.a(p.a(this.a)));
        this.a.notifyDataSetChanged();
    }

    private u(p pVar) {
        this.a = pVar;
    }

    public void onInvalidated() {
        p.a(this.a, this.a.a(p.a(this.a)));
        this.a.notifyDataSetInvalidated();
    }
}
