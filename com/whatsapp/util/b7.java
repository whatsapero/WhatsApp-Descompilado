package com.whatsapp.util;

import java.util.HashMap;

public class b7 {
    private HashMap a;
    private long b;

    public b7(long j) {
        this.b = j;
        this.a = new HashMap();
    }

    public synchronized boolean a(Object obj) {
        return this.a.remove(obj) != null;
    }

    public synchronized boolean a() {
        return this.a.isEmpty();
    }

    public synchronized void b() {
        this.a.clear();
    }

    public synchronized boolean b(Object obj) {
        boolean z;
        Long l = (Long) this.a.get(obj);
        if (l == null || l.longValue() + this.b <= System.currentTimeMillis()) {
            this.a.put(obj, Long.valueOf(System.currentTimeMillis()));
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
