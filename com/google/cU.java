package com.google;

import java.util.EnumMap;
import java.util.Map;

public final class cu {
    private bm[] a;
    private final long b;
    private final byte[] c;
    private final String d;
    private final R e;
    private Map f;

    public byte[] a() {
        return this.c;
    }

    public bm[] b() {
        return this.a;
    }

    public cu(String str, byte[] bArr, bm[] bmVarArr, R r) {
        this(str, bArr, bmVarArr, r, System.currentTimeMillis());
    }

    public cu(String str, byte[] bArr, bm[] bmVarArr, R r, long j) {
        this.d = str;
        this.c = bArr;
        this.a = bmVarArr;
        this.e = r;
        this.f = null;
        this.b = j;
    }

    public R d() {
        return this.e;
    }

    public void a(Map map) {
        if (map != null) {
            if (this.f == null) {
                this.f = map;
                if (bm.a == 0) {
                    return;
                }
            }
            this.f.putAll(map);
        }
    }

    public void a(bm[] bmVarArr) {
        Object obj = this.a;
        if (obj == null) {
            this.a = bmVarArr;
            if (bm.a == 0) {
                return;
            }
        }
        if (bmVarArr != null && bmVarArr.length > 0) {
            Object obj2 = new Object[(obj.length + bmVarArr.length)];
            System.arraycopy(obj, 0, obj2, 0, obj.length);
            System.arraycopy(bmVarArr, 0, obj2, obj.length, bmVarArr.length);
            this.a = obj2;
        }
    }

    public void a(bU bUVar, Object obj) {
        if (this.f == null) {
            this.f = new EnumMap(bU.class);
        }
        this.f.put(bUVar, obj);
    }

    public String c() {
        return this.d;
    }

    public Map e() {
        return this.f;
    }

    public String toString() {
        return this.d;
    }
}
