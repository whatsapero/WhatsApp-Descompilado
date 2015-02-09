package com.google;

final class fe {
    private final int a;
    private final Object b;

    public int hashCode() {
        return (System.identityHashCode(this.b) * 65535) + this.a;
    }

    fe(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof fe)) {
            return false;
        }
        fe feVar = (fe) obj;
        return this.b == feVar.b && this.a == feVar.a;
    }
}
