package com.google;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class dz implements Iterator {
    public void remove() {
        throw new UnsupportedOperationException();
    }

    dz() {
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return false;
    }
}
