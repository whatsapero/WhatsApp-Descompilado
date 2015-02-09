package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.whatsapp.util.bo;

class a17 implements OnScrollListener {
    private int a;
    private int b;
    final MediaGallery c;
    private int d;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4 = App.az;
        if (!(this.d == i || this.a == 0)) {
            bo.a(true);
        }
        if (i != this.d) {
            int size = avt.a(MediaGallery.f(this.c)).size() - 1;
            int i5 = -1;
            while (size >= 0) {
                int keyAt = avt.a(MediaGallery.f(this.c)).keyAt(size);
                if (keyAt <= i && keyAt > r0) {
                    i5 = keyAt;
                }
                keyAt = size - 1;
                if (i4 != 0) {
                    break;
                }
                size = keyAt;
            }
            if (this.b != i5 && i5 >= 0) {
                this.b = i5;
                MediaGallery.c(this.c).setText(((ni) avt.a(MediaGallery.f(this.c)).get(i5)).toString());
                MediaGallery.c(this.c).requestLayout();
            }
        }
        MediaGallery.a(this.c).a();
        this.d = i;
    }

    a17(MediaGallery mediaGallery) {
        this.c = mediaGallery;
        this.d = -1;
        this.b = -1;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        this.a = i;
        bo.a(this.a != 0);
    }
}
