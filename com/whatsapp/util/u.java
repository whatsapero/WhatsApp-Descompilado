package com.whatsapp.util;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class u extends LinkedHashMap {
    private static final float a = 0.75f;
    private int b;

    public u(int i) {
        super(((int) Math.ceil((double) (((float) i) / a))) + 1, a, true);
        this.b = i;
    }

    protected boolean removeEldestEntry(Entry entry) {
        return size() > this.b;
    }
}
