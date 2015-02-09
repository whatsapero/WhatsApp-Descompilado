package com.whatsapp;

import java.util.ArrayList;

class qj implements ams {
    final MediaGallery a;
    final ArrayList b;

    public void a() {
        MediaGallery.m(this.a).removeAll(this.b);
        if (MediaGallery.m(this.a).isEmpty()) {
            this.a.finish();
            if (App.az == 0) {
                return;
            }
        }
        this.a.d();
        MediaGallery.f(this.a).a();
        MediaGallery.f(this.a).notifyDataSetChanged();
        if (MediaGallery.e(this.a) != null) {
            MediaGallery.e(this.a).finish();
        }
    }

    qj(MediaGallery mediaGallery, ArrayList arrayList) {
        this.a = mediaGallery;
        this.b = arrayList;
    }
}
