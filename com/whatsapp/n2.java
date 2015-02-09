package com.whatsapp;

public final class n2 {
    private final int a;
    private final boolean b;
    private final boolean c;

    public int hashCode() {
        int i;
        int i2 = 1;
        int i3 = this.a * 31;
        if (this.b) {
            i = 1;
        } else {
            i = 0;
        }
        i = (i + i3) * 31;
        if (!this.c) {
            i2 = 0;
        }
        return i + i2;
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    private n2(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public int a() {
        return this.a;
    }

    n2(int i, boolean z, boolean z2, _g _gVar) {
        this(i, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return this.a == n2Var.a && this.b == n2Var.b && this.c == n2Var.c;
    }
}
