package com.google;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class d2 extends AbstractList implements c1, RandomAccess {
    private final c1 a;

    public g2 a(int i) {
        return this.a.a(i);
    }

    public String a(int i) {
        return (String) this.a.get(i);
    }

    public ListIterator listIterator(int i) {
        return new ca(this, i);
    }

    static c1 a(d2 d2Var) {
        return d2Var.a;
    }

    public Object get(int i) {
        return a(i);
    }

    public int size() {
        return this.a.size();
    }

    public Iterator iterator() {
        return new e2(this);
    }

    public void a(g2 g2Var) {
        throw new UnsupportedOperationException();
    }

    public d2(c1 c1Var) {
        this.a = c1Var;
    }

    public List a() {
        return this.a.a();
    }
}
