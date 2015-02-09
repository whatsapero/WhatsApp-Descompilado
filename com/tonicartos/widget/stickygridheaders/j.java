package com.tonicartos.widget.stickygridheaders;

import android.view.View;

class j extends h implements Runnable {
    final StickyGridHeadersGridView c;
    int d;

    j(StickyGridHeadersGridView stickyGridHeadersGridView, r rVar) {
        this(stickyGridHeadersGridView);
    }

    public void run() {
        if (!this.c.d && this.c.o != null && this.c.o.getCount() > 0 && this.d != -1 && this.d < this.c.o.getCount() && b()) {
            View b = this.c.b(this.d);
            if (b != null) {
                this.c.b(b, StickyGridHeadersGridView.a(this.c, this.d));
            }
        }
    }

    private j(StickyGridHeadersGridView stickyGridHeadersGridView) {
        this.c = stickyGridHeadersGridView;
        super(stickyGridHeadersGridView, null);
    }
}
