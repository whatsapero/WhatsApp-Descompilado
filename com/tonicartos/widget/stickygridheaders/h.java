package com.tonicartos.widget.stickygridheaders;

class h {
    private int a;
    final StickyGridHeadersGridView b;

    h(StickyGridHeadersGridView stickyGridHeadersGridView, r rVar) {
        this(stickyGridHeadersGridView);
    }

    public void a() {
        this.a = StickyGridHeadersGridView.c(this.b);
    }

    public boolean b() {
        return this.b.hasWindowFocus() && StickyGridHeadersGridView.b(this.b) == this.a;
    }

    private h(StickyGridHeadersGridView stickyGridHeadersGridView) {
        this.b = stickyGridHeadersGridView;
    }
}
