package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

class g extends DataSetObserver {
    final d a;

    public void onInvalidated() {
        this.a.notifyDataSetInvalidated();
    }

    public void onChanged() {
        this.a.notifyDataSetChanged();
    }

    g(d dVar) {
        this.a = dVar;
    }
}
