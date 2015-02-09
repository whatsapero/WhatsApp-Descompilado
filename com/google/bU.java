package com.google;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class bu extends AbstractSet {
    final dk a;

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public int size() {
        return this.a.size();
    }

    bu(dk dkVar, dO dOVar) {
        this(dkVar);
    }

    private bu(dk dkVar) {
        this.a = dkVar;
    }

    public boolean a(Entry entry) {
        if (contains(entry)) {
            return false;
        }
        this.a.a((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.a.remove(entry.getKey());
        return true;
    }

    public boolean add(Object obj) {
        return a((Entry) obj);
    }

    public void clear() {
        this.a.clear();
    }

    public Iterator iterator() {
        return new dB(this.a, null);
    }
}
