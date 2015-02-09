package android.support.v4.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

abstract class MapCollections {
    EntrySet mEntrySet;
    KeySet mKeySet;
    ValuesCollection mValues;

    final class ArrayIterator implements Iterator {
        boolean mCanRemove;
        int mIndex;
        final int mOffset;
        int mSize;
        final MapCollections this$0;

        ArrayIterator(MapCollections mapCollections, int i) {
            this.this$0 = mapCollections;
            this.mCanRemove = false;
            this.mOffset = i;
            this.mSize = mapCollections.colGetSize();
        }

        public void remove() {
            try {
                if (this.mCanRemove) {
                    this.mIndex--;
                    this.mSize--;
                    this.mCanRemove = false;
                    this.this$0.colRemoveAt(this.mIndex);
                    return;
                }
                throw new IllegalStateException();
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public boolean hasNext() {
            try {
                return this.mIndex < this.mSize;
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public Object next() {
            Object colGetEntry = this.this$0.colGetEntry(this.mIndex, this.mOffset);
            this.mIndex++;
            this.mCanRemove = true;
            return colGetEntry;
        }
    }

    final class EntrySet implements Set {
        final MapCollections this$0;

        public int hashCode() {
            int i = LruCache.a;
            int colGetSize = this.this$0.colGetSize() - 1;
            int i2 = 0;
            while (colGetSize >= 0) {
                Object colGetEntry = this.this$0.colGetEntry(colGetSize, 0);
                Object colGetEntry2 = this.this$0.colGetEntry(colGetSize, 1);
                i2 += (colGetEntry2 == null ? 0 : colGetEntry2.hashCode()) ^ (colGetEntry == null ? 0 : colGetEntry.hashCode());
                int i3 = colGetSize - 1;
                if (i != 0) {
                    break;
                }
                colGetSize = i3;
            }
            return i2;
        }

        public Iterator iterator() {
            return new MapIterator(this.this$0);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean addAll(java.util.Collection r7) {
            /*
            r6_this = this;
            r1 = android.support.v4.util.LruCache.a;
            r0 = r6.this$0;
            r2 = r0.colGetSize();
            r3 = r7.iterator();
        L_0x000c:
            r0 = r3.hasNext();
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r3.next();
            r0 = (java.util.Map.Entry) r0;
            r4 = r6.this$0;
            r5 = r0.getKey();
            r0 = r0.getValue();
            r4.colPut(r5, r0);
            if (r1 == 0) goto L_0x000c;
        L_0x0027:
            r0 = r6.this$0;	 Catch:{ UnsupportedOperationException -> 0x0031 }
            r0 = r0.colGetSize();	 Catch:{ UnsupportedOperationException -> 0x0031 }
            if (r2 == r0) goto L_0x0033;
        L_0x002f:
            r0 = 1;
        L_0x0030:
            return r0;
        L_0x0031:
            r0 = move-exception;
            throw r0;
        L_0x0033:
            r0 = 0;
            goto L_0x0030;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.MapCollections.EntrySet.addAll(java.util.Collection):boolean");
        }

        public boolean contains(Object obj) {
            try {
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                int colIndexOfKey = this.this$0.colIndexOfKey(entry.getKey());
                return colIndexOfKey >= 0 ? ContainerHelpers.equal(this.this$0.colGetEntry(colIndexOfKey, 1), entry.getValue()) : false;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }

        EntrySet(MapCollections mapCollections) {
            this.this$0 = mapCollections;
        }

        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public boolean add(Object obj) {
            return add((Entry) obj);
        }

        public boolean equals(Object obj) {
            return MapCollections.equalsSetHelper(this, obj);
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.this$0.colClear();
        }

        public boolean containsAll(Collection collection) {
            for (Object obj : collection) {
                if (!contains(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean add(Entry entry) {
            throw new UnsupportedOperationException();
        }

        public Object[] toArray(Object[] objArr) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public boolean isEmpty() {
            try {
                return this.this$0.colGetSize() == 0;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return this.this$0.colGetSize();
        }
    }

    final class KeySet implements Set {
        final MapCollections this$0;

        public boolean equals(Object obj) {
            return MapCollections.equalsSetHelper(this, obj);
        }

        public boolean retainAll(Collection collection) {
            return MapCollections.retainAllHelper(this.this$0.colGetMap(), collection);
        }

        public Object[] toArray(Object[] objArr) {
            return this.this$0.toArrayHelper(objArr, 0);
        }

        KeySet(MapCollections mapCollections) {
            this.this$0 = mapCollections;
        }

        public boolean containsAll(Collection collection) {
            return MapCollections.containsAllHelper(this.this$0.colGetMap(), collection);
        }

        public boolean remove(Object obj) {
            int colIndexOfKey = this.this$0.colIndexOfKey(obj);
            if (colIndexOfKey < 0) {
                return false;
            }
            try {
                this.this$0.colRemoveAt(colIndexOfKey);
                return true;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }

        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.this$0.colClear();
        }

        public boolean isEmpty() {
            try {
                return this.this$0.colGetSize() == 0;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }

        public int size() {
            return this.this$0.colGetSize();
        }

        public Object[] toArray() {
            return this.this$0.toArrayHelper(0);
        }

        public boolean contains(Object obj) {
            try {
                return this.this$0.colIndexOfKey(obj) >= 0;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }

        public int hashCode() {
            int i = LruCache.a;
            int colGetSize = this.this$0.colGetSize() - 1;
            int i2 = 0;
            while (colGetSize >= 0) {
                Object colGetEntry = this.this$0.colGetEntry(colGetSize, 0);
                i2 += colGetEntry == null ? 0 : colGetEntry.hashCode();
                int i3 = colGetSize - 1;
                if (i != 0) {
                    break;
                }
                colGetSize = i3;
            }
            return i2;
        }

        public Iterator iterator() {
            return new ArrayIterator(this.this$0, 0);
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection collection) {
            return MapCollections.removeAllHelper(this.this$0.colGetMap(), collection);
        }
    }

    final class MapIterator implements Iterator, Entry {
        private static final String[] z;
        int mEnd;
        boolean mEntryValid;
        int mIndex;
        final MapCollections this$0;

        static {
            String[] strArr = new String[5];
            String str = "m\u0015\u00169XZ\u0012\u0011>\u0019P\u0013\u001a8X]\u0012\u001a9XW\u0012\u000bj\u000bL\r\u000f%\nM]\r/\fX\u0014\u0011#\u0016^]2+\b\u00178\u0011>\n@]\u0010(\u0012\\\u001e\u000b9";
            Object obj = -1;
            String[] strArr2 = strArr;
            String[] strArr3 = strArr;
            int i = 0;
            while (true) {
                char[] toCharArray = str.toCharArray();
                int length = toCharArray.length;
                char[] cArr = toCharArray;
                for (int i2 = 0; length > i2; i2++) {
                    int i3;
                    char c = cArr[i2];
                    switch (i2 % 5) {
                        case PBE.MD5 /*0*/:
                            i3 = 57;
                            break;
                        case ay.f /*1*/:
                            i3 = 125;
                            break;
                        case ay.n /*2*/:
                            i3 = 127;
                            break;
                        case ay.p /*3*/:
                            i3 = 74;
                            break;
                        default:
                            i3 = 120;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "m\u0015\u00169XZ\u0012\u0011>\u0019P\u0013\u001a8X]\u0012\u001a9XW\u0012\u000bj\u000bL\r\u000f%\nM]\r/\fX\u0014\u0011#\u0016^]2+\b\u00178\u0011>\n@]\u0010(\u0012\\\u001e\u000b9";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "m\u0015\u00169XZ\u0012\u0011>\u0019P\u0013\u001a8X]\u0012\u001a9XW\u0012\u000bj\u000bL\r\u000f%\nM]\r/\fX\u0014\u0011#\u0016^]2+\b\u00178\u0011>\n@]\u0010(\u0012\\\u001e\u000b9";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "m\u0015\u00169XZ\u0012\u0011>\u0019P\u0013\u001a8X]\u0012\u001a9XW\u0012\u000bj\u000bL\r\u000f%\nM]\r/\fX\u0014\u0011#\u0016^]2+\b\u00178\u0011>\n@]\u0010(\u0012\\\u001e\u000b9";
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "m\u0015\u00169XZ\u0012\u0011>\u0019P\u0013\u001a8X]\u0012\u001a9XW\u0012\u000bj\u000bL\r\u000f%\nM]\r/\fX\u0014\u0011#\u0016^]2+\b\u00178\u0011>\n@]\u0010(\u0012\\\u001e\u000b9";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }

        public Object next() {
            return next();
        }

        public Entry next() {
            this.mIndex++;
            this.mEntryValid = true;
            return this;
        }

        public boolean hasNext() {
            try {
                return this.mIndex < this.mEnd;
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public final int hashCode() {
            int i = 0;
            try {
                if (this.mEntryValid) {
                    Object colGetEntry = this.this$0.colGetEntry(this.mIndex, 0);
                    Object colGetEntry2 = this.this$0.colGetEntry(this.mIndex, 1);
                    int hashCode = colGetEntry == null ? 0 : colGetEntry.hashCode();
                    if (colGetEntry2 != null) {
                        i = colGetEntry2.hashCode();
                    }
                    return i ^ hashCode;
                }
                throw new IllegalStateException(z[2]);
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        MapIterator(MapCollections mapCollections) {
            this.this$0 = mapCollections;
            this.mEntryValid = false;
            this.mEnd = mapCollections.colGetSize() - 1;
            this.mIndex = -1;
        }

        public void remove() {
            try {
                if (this.mEntryValid) {
                    this.this$0.colRemoveAt(this.mIndex);
                    this.mIndex--;
                    this.mEnd--;
                    this.mEntryValid = false;
                    return;
                }
                throw new IllegalStateException();
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public Object getKey() {
            try {
                if (this.mEntryValid) {
                    return this.this$0.colGetEntry(this.mIndex, 0);
                }
                throw new IllegalStateException(z[4]);
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r7) {
            /*
            r6_this = this;
            r0 = 1;
            r1 = 0;
            r2 = r6.mEntryValid;	 Catch:{ IllegalStateException -> 0x0011 }
            if (r2 != 0) goto L_0x0013;
        L_0x0006:
            r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0011 }
            r1 = z;	 Catch:{ IllegalStateException -> 0x0011 }
            r2 = 3;
            r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0011 }
            r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0011 }
            throw r0;	 Catch:{ IllegalStateException -> 0x0011 }
        L_0x0011:
            r0 = move-exception;
            throw r0;
        L_0x0013:
            r2 = r7 instanceof java.util.Map.Entry;	 Catch:{ IllegalStateException -> 0x0018 }
            if (r2 != 0) goto L_0x001a;
        L_0x0017:
            return r1;
        L_0x0018:
            r0 = move-exception;
            throw r0;
        L_0x001a:
            r7 = (java.util.Map.Entry) r7;
            r2 = r7.getKey();	 Catch:{ IllegalStateException -> 0x0044 }
            r3 = r6.this$0;	 Catch:{ IllegalStateException -> 0x0044 }
            r4 = r6.mIndex;	 Catch:{ IllegalStateException -> 0x0044 }
            r5 = 0;
            r3 = r3.colGetEntry(r4, r5);	 Catch:{ IllegalStateException -> 0x0044 }
            r2 = android.support.v4.util.ContainerHelpers.equal(r2, r3);	 Catch:{ IllegalStateException -> 0x0044 }
            if (r2 == 0) goto L_0x0048;
        L_0x002f:
            r2 = r7.getValue();	 Catch:{ IllegalStateException -> 0x0046 }
            r3 = r6.this$0;	 Catch:{ IllegalStateException -> 0x0046 }
            r4 = r6.mIndex;	 Catch:{ IllegalStateException -> 0x0046 }
            r5 = 1;
            r3 = r3.colGetEntry(r4, r5);	 Catch:{ IllegalStateException -> 0x0046 }
            r2 = android.support.v4.util.ContainerHelpers.equal(r2, r3);	 Catch:{ IllegalStateException -> 0x0046 }
            if (r2 == 0) goto L_0x0048;
        L_0x0042:
            r1 = r0;
            goto L_0x0017;
        L_0x0044:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0046 }
        L_0x0046:
            r0 = move-exception;
            throw r0;
        L_0x0048:
            r0 = r1;
            goto L_0x0042;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.MapCollections.MapIterator.equals(java.lang.Object):boolean");
        }

        public Object setValue(Object obj) {
            try {
                if (this.mEntryValid) {
                    return this.this$0.colSetValue(this.mIndex, obj);
                }
                throw new IllegalStateException(z[1]);
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public Object getValue() {
            try {
                if (this.mEntryValid) {
                    return this.this$0.colGetEntry(this.mIndex, 1);
                }
                throw new IllegalStateException(z[0]);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    final class ValuesCollection implements Collection {
        final MapCollections this$0;

        public Object[] toArray(Object[] objArr) {
            return this.this$0.toArrayHelper(objArr, 1);
        }

        public void clear() {
            this.this$0.colClear();
        }

        public boolean removeAll(Collection collection) {
            int i = 0;
            int i2 = LruCache.a;
            int colGetSize = this.this$0.colGetSize();
            boolean z = false;
            while (i < colGetSize) {
                if (collection.contains(this.this$0.colGetEntry(i, 1))) {
                    this.this$0.colRemoveAt(i);
                    colGetSize--;
                    i--;
                    z = true;
                }
                i++;
                if (i2 != 0) {
                    break;
                }
            }
            return z;
        }

        public boolean containsAll(Collection collection) {
            for (Object obj : collection) {
                if (!contains(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            try {
                return this.this$0.colGetSize() == 0;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj) {
            int colIndexOfValue = this.this$0.colIndexOfValue(obj);
            if (colIndexOfValue < 0) {
                return false;
            }
            try {
                this.this$0.colRemoveAt(colIndexOfValue);
                return true;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }

        public Object[] toArray() {
            return this.this$0.toArrayHelper(1);
        }

        public boolean contains(Object obj) {
            try {
                return this.this$0.colIndexOfValue(obj) >= 0;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }

        public Iterator iterator() {
            return new ArrayIterator(this.this$0, 1);
        }

        public int size() {
            return this.this$0.colGetSize();
        }

        ValuesCollection(MapCollections mapCollections) {
            this.this$0 = mapCollections;
        }

        public boolean retainAll(Collection collection) {
            int i = 0;
            int i2 = LruCache.a;
            int colGetSize = this.this$0.colGetSize();
            boolean z = false;
            while (i < colGetSize) {
                if (!collection.contains(this.this$0.colGetEntry(i, 1))) {
                    this.this$0.colRemoveAt(i);
                    colGetSize--;
                    i--;
                    z = true;
                }
                i++;
                if (i2 != 0) {
                    break;
                }
            }
            return z;
        }

        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    protected abstract void colClear();

    protected abstract Object colGetEntry(int i, int i2);

    protected abstract Map colGetMap();

    protected abstract int colGetSize();

    protected abstract int colIndexOfKey(Object obj);

    protected abstract int colIndexOfValue(Object obj);

    protected abstract void colPut(Object obj, Object obj2);

    protected abstract void colRemoveAt(int i);

    protected abstract Object colSetValue(int i, Object obj);

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object[] toArrayHelper(java.lang.Object[] r6, int r7) {
        /*
        r5_this = this;
        r2 = android.support.v4.util.LruCache.a;
        r3 = r5.colGetSize();
        r0 = r6.length;
        if (r0 >= r3) goto L_0x002f;
    L_0x0009:
        r0 = r6.getClass();
        r0 = r0.getComponentType();
        r0 = java.lang.reflect.Array.newInstance(r0, r3);
        r0 = (java.lang.Object[]) r0;
        r0 = (java.lang.Object[]) r0;
    L_0x0019:
        r1 = 0;
    L_0x001a:
        if (r1 >= r3) goto L_0x0026;
    L_0x001c:
        r4 = r5.colGetEntry(r1, r7);
        r0[r1] = r4;
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x001a;
    L_0x0026:
        r1 = r0.length;	 Catch:{ NullPointerException -> 0x002d }
        if (r1 <= r3) goto L_0x002c;
    L_0x0029:
        r1 = 0;
        r0[r3] = r1;	 Catch:{ NullPointerException -> 0x002d }
    L_0x002c:
        return r0;
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = r6;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.MapCollections.toArrayHelper(java.lang.Object[], int):java.lang.Object[]");
    }

    public static boolean containsAllHelper(Map map, Collection collection) {
        for (Object obj : collection) {
            if (!map.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    public Set getKeySet() {
        try {
            if (this.mKeySet == null) {
                this.mKeySet = new KeySet(this);
            }
            return this.mKeySet;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static boolean equalsSetHelper(Set set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (!(set.size() == set2.size() && set.containsAll(set2))) {
                z = false;
            }
            return z;
        } catch (NullPointerException e) {
            throw e;
        } catch (ClassCastException e2) {
            return false;
        } catch (NullPointerException e3) {
            try {
                throw e3;
            } catch (NullPointerException e4) {
                return false;
            } catch (ClassCastException e22) {
                return false;
            }
        }
    }

    public Object[] toArrayHelper(int i) {
        int i2 = LruCache.a;
        int colGetSize = colGetSize();
        Object[] objArr = new Object[colGetSize];
        int i3 = 0;
        while (i3 < colGetSize) {
            objArr[i3] = colGetEntry(i3, i);
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        return objArr;
    }

    MapCollections() {
    }

    public Set getEntrySet() {
        try {
            if (this.mEntrySet == null) {
                this.mEntrySet = new EntrySet(this);
            }
            return this.mEntrySet;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public Collection getValues() {
        try {
            if (this.mValues == null) {
                this.mValues = new ValuesCollection(this);
            }
            return this.mValues;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean removeAllHelper(java.util.Map r4, java.util.Collection r5) {
        /*
        r0 = android.support.v4.util.LruCache.a;
        r1 = r4.size();
        r2 = r5.iterator();
    L_0x000a:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0019;
    L_0x0010:
        r3 = r2.next();
        r4.remove(r3);
        if (r0 == 0) goto L_0x000a;
    L_0x0019:
        r0 = r4.size();	 Catch:{ NullPointerException -> 0x0021 }
        if (r1 == r0) goto L_0x0023;
    L_0x001f:
        r0 = 1;
    L_0x0020:
        return r0;
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        r0 = 0;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.MapCollections.removeAllHelper(java.util.Map, java.util.Collection):boolean");
    }

    public static boolean retainAllHelper(Map map, Collection collection) {
        int i = LruCache.a;
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                if (i == 0) {
                }
            }
        }
        try {
            break;
            return size != map.size();
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
