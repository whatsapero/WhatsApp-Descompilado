package com.tonicartos.widget.stickygridheaders;

import android.view.View;

class i extends h implements Runnable {
    final StickyGridHeadersGridView c;

    private i(StickyGridHeadersGridView stickyGridHeadersGridView) {
        this.c = stickyGridHeadersGridView;
        super(stickyGridHeadersGridView, null);
    }

    i(StickyGridHeadersGridView stickyGridHeadersGridView, r rVar) {
        this(stickyGridHeadersGridView);
    }

    public void run() {
        View b = this.c.b(this.c.x);
        if (b != null) {
            boolean z;
            long a = StickyGridHeadersGridView.a(this.c, this.c.x);
            if (!b() || this.c.d) {
                z = false;
            } else {
                z = this.c.a(b, a);
            }
            if (z) {
                this.c.j = -2;
                this.c.setPressed(false);
                b.setPressed(false);
                if (!StickyGridHeadersGridView.i) {
                    return;
                }
            }
            this.c.j = 2;
        }
    }
}
