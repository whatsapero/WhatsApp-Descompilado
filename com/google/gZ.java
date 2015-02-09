package com.google;

import java.util.Iterator;
import java.util.Map.Entry;

class gZ implements Iterator {
    private Iterator a;

    public gZ(Iterator it) {
        this.a = it;
    }

    public Entry a() {
        Entry entry = (Entry) this.a.next();
        return entry.getValue() instanceof f3 ? new cb(entry, null) : entry;
    }

    public Object next() {
        return a();
    }

    public void remove() {
        this.a.remove();
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }
}
