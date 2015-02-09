package com.google;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

class f9 implements Iterator {
    private final Stack a;
    private gX b;

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public Object next() {
        return b();
    }

    public boolean hasNext() {
        try {
            return this.b != null;
        } catch (NoSuchElementException e) {
            throw e;
        }
    }

    public gX b() {
        try {
            if (this.b == null) {
                throw new NoSuchElementException();
            }
            gX gXVar = this.b;
            this.b = a();
            return gXVar;
        } catch (NoSuchElementException e) {
            throw e;
        }
    }

    f9(g2 g2Var, cP cPVar) {
        this(g2Var);
    }

    private gX a(g2 g2Var) {
        boolean z = dy.b;
        g2 g2Var2 = g2Var;
        while (g2Var2 instanceof gn) {
            gn gnVar = (gn) g2Var2;
            this.a.push(gnVar);
            g2Var2 = gn.a(gnVar);
            if (z) {
                break;
            }
        }
        return (gX) g2Var2;
    }

    private gX a() {
        gX a;
        do {
            try {
                if (this.a.isEmpty()) {
                    return null;
                }
                a = a(gn.b((gn) this.a.pop()));
                try {
                } catch (NoSuchElementException e) {
                    throw e;
                }
            } catch (NoSuchElementException e2) {
                throw e2;
            }
        } while (a.d());
        return a;
    }

    private f9(g2 g2Var) {
        this.a = new Stack();
        this.b = a(g2Var);
    }
}
