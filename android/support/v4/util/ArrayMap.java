package android.support.v4.util;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayMap extends SimpleArrayMap implements Map {
    MapCollections mCollections;

    public void putAll(Map map) {
        int i = LruCache.a;
        ensureCapacity(this.mSize + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
            if (i != 0) {
                return;
            }
        }
    }

    public Collection values() {
        return getCollection().getValues();
    }

    public Set keySet() {
        return getCollection().getKeySet();
    }

    public boolean retainAll(Collection collection) {
        return MapCollections.retainAllHelper(this, collection);
    }

    public Set entrySet() {
        return getCollection().getEntrySet();
    }

    private MapCollections getCollection() {
        if (this.mCollections == null) {
            this.mCollections = new MapCollections() {
                final ArrayMap this$0;

                protected Object colSetValue(int i, Object obj) {
                    return this.this$0.setValueAt(i, obj);
                }

                protected int colIndexOfValue(Object obj) {
                    return this.this$0.indexOfValue(obj);
                }

                protected void colPut(Object obj, Object obj2) {
                    this.this$0.put(obj, obj2);
                }

                protected Object colGetEntry(int i, int i2) {
                    return this.this$0.mArray[(i << 1) + i2];
                }

                protected void colRemoveAt(int i) {
                    this.this$0.removeAt(i);
                }

                protected int colGetSize() {
                    return this.this$0.mSize;
                }

                protected int colIndexOfKey(Object obj) {
                    return this.this$0.indexOfKey(obj);
                }

                protected void colClear() {
                    this.this$0.clear();
                }

                {
                    this.this$0 = r1;
                }

                protected Map colGetMap() {
                    return this.this$0;
                }
            };
        }
        return this.mCollections;
    }
}
