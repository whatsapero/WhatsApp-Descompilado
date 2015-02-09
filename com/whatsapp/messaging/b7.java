package com.whatsapp.messaging;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class b7 extends LinkedHashMap {
    private static final long serialVersionUID = 1;

    private b7() {
    }

    public static boolean a(Long l) {
        return l == null || l.longValue() + 86400000 < System.currentTimeMillis();
    }

    protected boolean removeEldestEntry(Entry entry) {
        return a(entry);
    }

    public static boolean a(Entry entry) {
        return ((Long) entry.getValue()).longValue() + 86400000 < System.currentTimeMillis();
    }

    b7(aj ajVar) {
        this();
    }
}
