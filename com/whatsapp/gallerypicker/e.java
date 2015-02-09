package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

public class e extends d {
    private long d;

    public Uri a() {
        return super.a();
    }

    public String d() {
        return super.d();
    }

    public Bitmap a(int i, int i2) {
        return super.a(i, i2);
    }

    public String b() {
        return super.b();
    }

    protected e(aq aqVar, ContentResolver contentResolver, String str, long j) {
        super(aqVar, contentResolver, Uri.fromFile(new File(str)));
        this.d = j;
    }

    public long c() {
        return this.d;
    }

    public Bitmap a(int i) {
        return super.a(i);
    }
}
