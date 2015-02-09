package com.coremedia.iso.boxes.mdat;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DummyMap<K, V> implements Map<K, V> {
    static final /* synthetic */ boolean $assertionsDisabled;
    HashSet<K> keys;
    V value;

    static {
        $assertionsDisabled = !DummyMap.class.desiredAssertionStatus();
    }

    public DummyMap(V value) {
        this.keys = new HashSet();
        this.value = value;
    }

    public Comparator<? super K> comparator() {
        return null;
    }

    public void addKeys(K[] keys) {
        Collections.addAll(this.keys, keys);
    }

    public int size() {
        return this.keys.size();
    }

    public boolean isEmpty() {
        return this.keys.isEmpty();
    }

    public boolean containsKey(Object key) {
        return this.keys.contains(key);
    }

    public boolean containsValue(Object value) {
        return this.value == value;
    }

    public V get(Object key) {
        return this.keys.contains(key) ? this.value : null;
    }

    public V put(K key, V value) {
        if ($assertionsDisabled || this.value == value) {
            this.keys.add(key);
            return this.value;
        }
        throw new AssertionError();
    }

    public V remove(Object key) {
        V v = get(key);
        this.keys.remove(key);
        return v;
    }

    public void putAll(Map<? extends K, ? extends V> m) {
        Iterator it = m.keySet().iterator();
        while (it.hasNext()) {
            Object k = it.next();
            if ($assertionsDisabled || m.get(k) == this.value) {
                this.keys.add(k);
            } else {
                throw new AssertionError();
            }
        }
    }

    public void clear() {
        this.keys.clear();
    }

    public Set<K> keySet() {
        return this.keys;
    }

    public Collection<V> values() {
        throw new UnsupportedOperationException();
    }

    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }
}
