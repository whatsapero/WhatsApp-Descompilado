package com.google;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class ct extends LinkedHashMap {
    final at a;

    ct(at atVar, int i, float f, boolean z) {
        this.a = atVar;
        super(i, f, z);
    }

    protected boolean removeEldestEntry(Entry entry) {
        return size() > at.a(this.a);
    }
}
