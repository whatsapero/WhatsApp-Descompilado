package com.google;

import java.util.Iterator;

class e2 implements Iterator {
    Iterator a;
    final d2 b;

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public Object next() {
        return a();
    }

    public String a() {
        return (String) this.a.next();
    }

    e2(d2 d2Var) {
        this.b = d2Var;
        this.a = d2.a(this.b).iterator();
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }
}
