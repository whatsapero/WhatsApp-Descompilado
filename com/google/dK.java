package com.google;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class dk extends AbstractMap {
    private List a;
    private final int b;
    private Map c;
    private boolean d;
    private volatile bu e;

    public void c() {
        try {
            if (!this.d) {
                this.c = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
                this.d = true;
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    public Iterable f() {
        try {
            return this.c.isEmpty() ? cX.b() : this.c.entrySet();
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a < 0) {
            return this.c.get(comparable);
        }
        try {
            return ((cA) this.a.get(a)).getValue();
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public int size() {
        return this.a.size() + this.c.size();
    }

    dk(int i, dO dOVar) {
        this(i);
    }

    static void b(dk dkVar) {
        dkVar.b();
    }

    static List c(dk dkVar) {
        return dkVar.a;
    }

    public Entry c(int i) {
        return (Entry) this.a.get(i);
    }

    public int e() {
        return this.a.size();
    }

    public Object a(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            try {
                return ((cA) this.a.get(a)).setValue(obj);
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }
        d();
        int i = -(a + 1);
        try {
            if (i >= this.b) {
                return a().put(comparable, obj);
            }
            if (this.a.size() == this.b) {
                cA cAVar = (cA) this.a.remove(this.b - 1);
                a().put(cAVar.a(), cAVar.getValue());
            }
            this.a.add(i, new cA(this, comparable, obj));
            return null;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    private Object a(int i) {
        b();
        Object value = ((cA) this.a.remove(i)).getValue();
        if (!this.c.isEmpty()) {
            Iterator it = a().entrySet().iterator();
            this.a.add(new cA(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private SortedMap a() {
        try {
            b();
            if (this.c.isEmpty()) {
                if (!(this.c instanceof TreeMap)) {
                    this.c = new TreeMap();
                }
            }
            return (SortedMap) this.c;
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    static dk b(int i) {
        return new dO(i);
    }

    public boolean g() {
        return this.d;
    }

    private dk(int i) {
        this.b = i;
        this.a = Collections.emptyList();
        this.c = Collections.emptyMap();
    }

    public Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            try {
                return a(a);
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }
        try {
            return this.c.isEmpty() ? null : this.c.remove(comparable);
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    public Object put(Object obj, Object obj2) {
        return a((Comparable) obj, obj2);
    }

    private void d() {
        try {
            b();
            try {
                if (!this.a.isEmpty()) {
                    return;
                }
                if (!(this.a instanceof ArrayList)) {
                    this.a = new ArrayList(this.b);
                }
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    static Map a(dk dkVar) {
        return dkVar.c;
    }

    private void b() {
        try {
            if (this.d) {
                throw new UnsupportedOperationException();
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(java.lang.Comparable r8) {
        /*
        r7_this = this;
        r4 = com.google.dy.b;
        r2 = 0;
        r0 = r7.a;
        r0 = r0.size();
        r1 = r0 + -1;
        if (r1 < 0) goto L_0x005a;
    L_0x000d:
        r0 = r7.a;
        r0 = r0.get(r1);
        r0 = (com.google.cA) r0;
        r0 = r0.a();
        r0 = r8.compareTo(r0);
        if (r0 <= 0) goto L_0x0023;
    L_0x001f:
        r0 = r1 + 2;
        r0 = -r0;
    L_0x0022:
        return r0;
    L_0x0023:
        if (r0 != 0) goto L_0x005a;
    L_0x0025:
        r0 = r1;
        goto L_0x0022;
    L_0x0027:
        r3 = r1;
        r1 = r0;
    L_0x0029:
        if (r1 > r3) goto L_0x0058;
    L_0x002b:
        r0 = r1 + r3;
        r2 = r0 / 2;
        r0 = r7.a;
        r0 = r0.get(r2);
        r0 = (com.google.cA) r0;
        r0 = r0.a();
        r5 = r8.compareTo(r0);
        if (r5 >= 0) goto L_0x0056;
    L_0x0041:
        r0 = r2 + -1;
        if (r4 == 0) goto L_0x004d;
    L_0x0045:
        if (r5 <= 0) goto L_0x004b;
    L_0x0047:
        r1 = r2 + 1;
        if (r4 == 0) goto L_0x004d;
    L_0x004b:
        r0 = r2;
        goto L_0x0022;
    L_0x004d:
        r6 = r0;
        r0 = r1;
        r1 = r6;
        if (r4 == 0) goto L_0x0027;
    L_0x0052:
        r0 = r0 + 1;
        r0 = -r0;
        goto L_0x0022;
    L_0x0056:
        r0 = r3;
        goto L_0x0045;
    L_0x0058:
        r0 = r1;
        goto L_0x0052;
    L_0x005a:
        r3 = r1;
        r1 = r2;
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.dk.a(java.lang.Comparable):int");
    }

    public void clear() {
        try {
            b();
            if (!this.a.isEmpty()) {
                this.a.clear();
            }
            try {
                if (!this.c.isEmpty()) {
                    this.c.clear();
                }
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        try {
            if (a(comparable) < 0) {
                if (!this.c.containsKey(comparable)) {
                    try {
                        return false;
                    }
                }
            }
            return true;
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    static Object a(dk dkVar, int i) {
        return dkVar.a(i);
    }

    public Set entrySet() {
        try {
            if (this.e == null) {
                this.e = new bu(this, null);
            }
            return this.e;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }
}
