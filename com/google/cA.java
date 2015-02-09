package com.google;

import java.util.ListIterator;

class ca implements ListIterator {
    ListIterator a;
    final int b;
    final d2 c;

    public void add(Object obj) {
        b((String) obj);
    }

    public void b(String str) {
        throw new UnsupportedOperationException();
    }

    public Object previous() {
        return b();
    }

    public int nextIndex() {
        return this.a.nextIndex();
    }

    ca(d2 d2Var, int i) {
        this.c = d2Var;
        this.b = i;
        this.a = d2.a(this.c).listIterator(this.b);
    }

    public void a(String str) {
        throw new UnsupportedOperationException();
    }

    public String a() {
        return (String) this.a.next();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    public Object next() {
        return a();
    }

    public void set(Object obj) {
        a((String) obj);
    }

    public String b() {
        return (String) this.a.previous();
    }

    public int previousIndex() {
        return this.a.previousIndex();
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }
}
