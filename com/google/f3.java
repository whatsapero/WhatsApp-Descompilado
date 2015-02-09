package com.google;

import java.io.IOException;

class f3 {
    private volatile a1 a;
    private final a1 b;
    private final aC c;
    private g2 d;
    private volatile boolean e;

    public a1 a(a1 a1Var) {
        a1 a1Var2 = this.a;
        this.a = a1Var;
        this.d = null;
        this.e = true;
        return a1Var2;
    }

    public int b() {
        return this.e ? this.a.d() : this.d.e();
    }

    public int hashCode() {
        c();
        return this.a.hashCode();
    }

    public f3(a1 a1Var, aC aCVar, g2 g2Var) {
        this.e = false;
        this.b = a1Var;
        this.c = aCVar;
        this.d = g2Var;
    }

    public String toString() {
        c();
        return this.a.toString();
    }

    public a1 a() {
        c();
        return this.a;
    }

    public g2 d() {
        if (!this.e) {
            return this.d;
        }
        synchronized (this) {
            if (this.e) {
                this.d = this.a.e();
                this.e = false;
                g2 g2Var = this.d;
                return g2Var;
            }
            g2Var = this.d;
            return g2Var;
        }
    }

    public boolean equals(Object obj) {
        c();
        return this.a.equals(obj);
    }

    private void c() {
        try {
            if (this.a == null) {
                synchronized (this) {
                    if (this.a != null) {
                        return;
                    }
                    try {
                        if (this.d != null) {
                            this.a = (a1) this.b.c().b(this.d, this.c);
                        }
                    } catch (IOException e) {
                    }
                }
            }
        } catch (IOException e2) {
            throw e2;
        }
    }
}
