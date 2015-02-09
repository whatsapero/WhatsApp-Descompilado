package com.tonicartos.widget.stickygridheaders;

import android.view.View;

class t implements Runnable {
    final View a;
    final StickyGridHeadersGridView b;
    final j c;

    public void run() {
        this.b.j = -1;
        this.a.setPressed(false);
        this.b.setPressed(false);
        if (!this.b.d) {
            this.c.run();
        }
    }

    t(StickyGridHeadersGridView stickyGridHeadersGridView, View view, j jVar) {
        this.b = stickyGridHeadersGridView;
        this.a = view;
        this.c = jVar;
    }
}
