package com.google.android.gms.internal;

public abstract class qw {
    public static boolean a;
    protected volatile int azh;

    public qw() {
        this.azh = -1;
    }

    public void a(qp qpVar) {
    }

    protected int c() {
        return 0;
    }

    public int rY() {
        if (this.azh < 0) {
            rZ();
        }
        return this.azh;
    }

    public int rZ() {
        int c = c();
        this.azh = c;
        return c;
    }

    public String toString() {
        return qx.g(this);
    }
}
