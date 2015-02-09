package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.PhotoView;

class g implements bn {
    final PhotoView a;
    final ImagePreview b;
    final Uri c;

    g(ImagePreview imagePreview, PhotoView photoView, Uri uri) {
        this.b = imagePreview;
        this.a = photoView;
        this.c = uri;
    }

    public void a() {
    }

    public void a(Bitmap bitmap, boolean z) {
        if (this.a.getTag() == this.c) {
            this.a.a(bitmap);
        }
    }
}
