package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

class c extends DataSetObserver {
    final l a;

    public void onInvalidated() {
        l.b(this.a).clear();
        this.a.notifyDataSetInvalidated();
    }

    c(l lVar) {
        this.a = lVar;
    }

    public void onChanged() {
        this.a.a();
        this.a.notifyDataSetChanged();
    }
}
