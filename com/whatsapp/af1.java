package com.whatsapp;

import android.content.Context;
import java.util.Comparator;

public class af1 implements Comparator {
    private final Context a;

    public int a(m8 m8Var, m8 m8Var2) {
        int i = 0;
        if (App.P.h(m8Var.e)) {
            return 1;
        }
        if (App.P.h(m8Var2.e)) {
            return -1;
        }
        int i2;
        String a = m8Var.a(this.a);
        String a2 = m8Var2.a(this.a);
        if (a.length() <= 0 || !Character.isLetter(a.charAt(0))) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (a2.length() > 0 && Character.isLetter(a2.charAt(0))) {
            i = 1;
        }
        if (i2 == i) {
            return a.compareToIgnoreCase(a2);
        }
        return i2 != 0 ? -1 : 1;
    }

    public af1(Context context) {
        this.a = context;
    }

    public int compare(Object obj, Object obj2) {
        return a((m8) obj, (m8) obj2);
    }
}
