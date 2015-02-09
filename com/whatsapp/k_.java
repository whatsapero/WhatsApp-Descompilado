package com.whatsapp;

import android.content.Context;

class k_ extends kf {
    final an4 b;

    k_(an4 com_whatsapp_an4, Context context) {
        this.b = com_whatsapp_an4;
        super(context);
    }

    public int a(m8 m8Var, m8 m8Var2) {
        if (!m8Var.q || m8Var2.q) {
            return (m8Var.q || !m8Var2.q) ? super.a(m8Var, m8Var2) : 1;
        } else {
            return -1;
        }
    }

    public int compare(Object obj, Object obj2) {
        return a((m8) obj, (m8) obj2);
    }
}
