package com.whatsapp;

public final class atd extends at7 {
    protected boolean b(m8 m8Var) {
        boolean z;
        m8Var.B = this.a.B;
        if ((this.a.M <= 0 || m8Var.M == this.a.M) && ((this.a.A <= 0 || m8Var.A == this.a.A) && ((this.a.M >= 0 || m8Var.M < 0) && (this.a.A >= 0 || m8Var.A < 0)))) {
            z = false;
        } else {
            z = true;
        }
        m8Var.M = this.a.M;
        m8Var.A = this.a.A;
        m8Var.r = this.a.r;
        return z;
    }

    public atd(m8 m8Var) {
        super(m8Var);
    }
}
