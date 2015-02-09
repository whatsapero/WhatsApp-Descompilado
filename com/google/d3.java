package com.google;

final class d3 {
    private final dh a;
    private final int b;

    public boolean equals(Object obj) {
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return this.a == d3Var.a && this.b == d3Var.b;
    }

    d3(dh dhVar, int i) {
        this.a = dhVar;
        this.b = i;
    }

    public int hashCode() {
        return (this.a.hashCode() * 65535) + this.b;
    }
}
