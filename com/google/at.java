package com.google;

import java.util.LinkedHashMap;

class at {
    private int a;
    private LinkedHashMap b;

    public at(int i) {
        this.a = i;
        this.b = new ct(this, ((i * 4) / 3) + 1, 0.75f, true);
    }

    public synchronized void a(Object obj, Object obj2) {
        this.b.put(obj, obj2);
    }

    public synchronized Object a(Object obj) {
        return this.b.get(obj);
    }

    static int a(at atVar) {
        return atVar.a;
    }
}
