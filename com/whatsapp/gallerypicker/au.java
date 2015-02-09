package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.v4.util.LruCache;

final class au extends LruCache {
    protected int a(String str, Bitmap bitmap) {
        if (VERSION.SDK_INT < 12) {
            int rowBytes = (bitmap.getRowBytes() * bitmap.getHeight()) / 1024;
            if (ImagePreview.y == 0) {
                return rowBytes;
            }
        }
        return bitmap.getByteCount() / 1024;
    }

    protected int sizeOf(Object obj, Object obj2) {
        return a((String) obj, (Bitmap) obj2);
    }

    au(int i) {
        super(i);
    }
}
