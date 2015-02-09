package com.whatsapp;

class dl implements a_4 {
    final MediaViewPager a;
    final MediaView b;

    public al9 a(float f, float f2) {
        boolean z = false;
        if (!this.a.g.isFinishing()) {
            boolean c;
            PhotoView a = MediaView.a(this.a.g, MediaView.i(this.a.g, this.a.getCurrentItem()));
            if (a != null) {
                c = a.c(f, f2);
                z = a.b(f, f2);
            } else {
                c = false;
            }
            if (c) {
                return z ? al9.BOTH : al9.LEFT;
            } else {
                if (z) {
                    return al9.RIGHT;
                }
            }
        }
        return al9.NONE;
    }

    dl(MediaViewPager mediaViewPager, MediaView mediaView) {
        this.a = mediaViewPager;
        this.b = mediaView;
    }
}
