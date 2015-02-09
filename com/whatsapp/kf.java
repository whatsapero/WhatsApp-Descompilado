package com.whatsapp;

import android.content.Context;
import java.text.Collator;
import java.util.Comparator;

public class kf implements Comparator {
    private final Context a;

    private static String a(Context context, m8 m8Var) {
        if (m8Var == null) {
            return null;
        }
        return (m8Var.n == null || m8Var.n.length() <= 0) ? m8Var.a(context) : m8Var.n;
    }

    public int compare(Object obj, Object obj2) {
        return a((m8) obj, (m8) obj2);
    }

    public int a(m8 m8Var, m8 m8Var2) {
        String a = a(this.a, m8Var);
        String a2 = a(this.a, m8Var2);
        if (a == null && a2 == null) {
            return 0;
        }
        if (a == null) {
            return 1;
        }
        if (a2 == null) {
            return -1;
        }
        Collator instance = Collator.getInstance();
        instance.setStrength(0);
        instance.setDecomposition(1);
        int compare = instance.compare(a, a2);
        if (compare != 0) {
            return compare;
        }
        if (m8Var.e == null && m8Var2.e == null) {
            return 0;
        }
        if (m8Var.e == null) {
            return 1;
        }
        return m8Var2.e == null ? -1 : m8Var.e.compareTo(m8Var2.e);
    }

    public kf(Context context) {
        this.a = context;
    }
}
