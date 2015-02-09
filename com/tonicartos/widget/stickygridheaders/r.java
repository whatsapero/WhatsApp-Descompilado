package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

class r extends DataSetObserver {
    final StickyGridHeadersGridView a;

    public void onChanged() {
        StickyGridHeadersGridView.a(this.a);
    }

    r(StickyGridHeadersGridView stickyGridHeadersGridView) {
        this.a = stickyGridHeadersGridView;
    }

    public void onInvalidated() {
        StickyGridHeadersGridView.a(this.a);
    }
}
