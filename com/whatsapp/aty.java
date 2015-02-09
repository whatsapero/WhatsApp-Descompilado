package com.whatsapp;

import android.text.TextUtils;

public final class aty extends at7 {
    public aty(m8 m8Var) {
        super(m8Var);
    }

    protected boolean b(m8 m8Var) {
        boolean z = !TextUtils.equals(this.a.b, m8Var.b);
        m8Var.b = this.a.b;
        m8Var.c = this.a.c;
        return z;
    }
}
