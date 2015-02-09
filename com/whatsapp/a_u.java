package com.whatsapp;

import android.content.Context;
import java.util.Comparator;

public class a_u implements Comparator {
    private final Context a;

    public a_u(Context context) {
        this.a = context;
    }

    public int compare(Object obj, Object obj2) {
        return a((m8) obj, (m8) obj2);
    }

    public int a(m8 m8Var, m8 m8Var2) {
        int i;
        int i2 = 0;
        String a = m8Var.a(this.a);
        String a2 = m8Var2.a(this.a);
        if (a.length() <= 0 || !Character.isLetter(a.charAt(0))) {
            i = 0;
        } else {
            i = 1;
        }
        if (a2.length() > 0 && Character.isLetter(a2.charAt(0))) {
            i2 = 1;
        }
        if (i == i2) {
            return a.compareToIgnoreCase(a2);
        }
        return i != 0 ? -1 : 1;
    }
}
