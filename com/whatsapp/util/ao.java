package com.whatsapp.util;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import com.whatsapp.protocol.m;
import java.lang.ref.SoftReference;

class ao extends LruCache {
    final bo b;

    ao(bo boVar, int i) {
        this.b = boVar;
        super(i);
    }

    protected int sizeOf(Object obj, Object obj2) {
        return a((m) obj, (Bitmap) obj2);
    }

    protected void a(boolean z, m mVar, Bitmap bitmap, Bitmap bitmap2) {
        if (z) {
            bo.a(this.b).put(mVar, new SoftReference(bitmap));
            bo.c(this.b).remove(mVar);
        }
    }

    protected int a(m mVar, Bitmap bitmap) {
        return b0.a(bitmap) / 1024;
    }

    protected void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        a(z, (m) obj, (Bitmap) obj2, (Bitmap) obj3);
    }
}
