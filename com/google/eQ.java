package com.google;

final class eq {
    private final M a;
    private final int b;

    public boolean equals(Object obj) {
        if (!(obj instanceof eq)) {
            return false;
        }
        eq eqVar = (eq) obj;
        return this.a == eqVar.a && this.b == eqVar.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 65535) + this.b;
    }

    eq(M m, int i) {
        this.a = m;
        this.b = i;
    }
}
