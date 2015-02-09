package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.net.Uri;

public abstract class a3 implements aw {
    private String a;
    protected long b;
    protected ContentResolver c;
    protected Uri d;
    private int e;
    protected final int f;
    protected aq g;
    protected String h;
    private int i;
    private final long j;
    protected String k;

    public long c() {
        return this.j;
    }

    public String toString() {
        return this.d.toString();
    }

    public String b() {
        return this.h;
    }

    public String d() {
        return this.k;
    }

    public boolean equals(Object obj) {
        return (obj == null || !(obj instanceof a8)) ? false : this.d.equals(((a8) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    protected a3(aq aqVar, ContentResolver contentResolver, long j, int i, Uri uri, String str, String str2, long j2, String str3) {
        this.i = -1;
        this.e = -1;
        this.g = aqVar;
        this.c = contentResolver;
        this.b = j;
        this.f = i;
        this.d = uri;
        this.h = str;
        this.k = str2;
        this.j = j2;
        this.a = str3;
    }

    public Uri a() {
        return this.d;
    }
}
