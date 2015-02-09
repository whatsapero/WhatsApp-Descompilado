package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.HashMap;

public class az implements v {
    private aw a;
    private Uri b;

    public void b(ContentObserver contentObserver) {
    }

    public void a(ContentObserver contentObserver) {
    }

    public void e() {
        this.a = null;
        this.b = null;
    }

    public aw a(int i) {
        if (i != 0) {
            return null;
        }
        try {
            return this.a;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public HashMap c() {
        throw new UnsupportedOperationException();
    }

    public az(ContentResolver contentResolver, Uri uri) {
        this.b = uri;
        this.a = new d(this, contentResolver, uri);
    }

    public void d() {
    }

    public int b() {
        return 1;
    }

    public boolean a() {
        return false;
    }
}
