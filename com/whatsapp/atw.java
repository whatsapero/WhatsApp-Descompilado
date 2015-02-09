package com.whatsapp;

public final class atw extends at7 {
    public atw(m8 m8Var) {
        super(m8Var);
    }

    protected boolean b(m8 m8Var) {
        ar arVar;
        ar arVar2 = m8Var.C != null ? m8Var.C : ar.getDefault();
        if (this.a.C != null) {
            arVar = this.a.C;
        } else {
            arVar = ar.getDefault();
        }
        boolean z = arVar2 != arVar;
        m8Var.C = this.a.C;
        return z;
    }
}
