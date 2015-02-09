package com.whatsapp;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.v4.util.LruCache;

class wz extends LruCache {
    final App b;

    protected int a(String str, Bitmap bitmap) {
        return VERSION.SDK_INT < 12 ? (bitmap.getRowBytes() * bitmap.getHeight()) / 1024 : bitmap.getByteCount() / 1024;
    }

    wz(App app, int i) {
        this.b = app;
        super(i);
    }

    protected int sizeOf(Object obj, Object obj2) {
        return a((String) obj, (Bitmap) obj2);
    }
}
