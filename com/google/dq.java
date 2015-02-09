package com.google;

import java.util.AbstractList;
import java.util.List;

class dQ extends AbstractList implements List {
    gk a;

    public int size() {
        return this.a.j();
    }

    public eE a(int i) {
        return this.a.d(i);
    }

    public Object get(int i) {
        return a(i);
    }

    void a() {
        this.modCount++;
    }
}
