package com.google;

public final class bP {
    private static String a(cn cnVar, M m, String str) {
        if (m != null) {
            return m.b() + '.' + str;
        }
        return cnVar.e().length() > 0 ? cnVar.e() + '.' + str : str;
    }

    static String b(cn cnVar, M m, String str) {
        return a(cnVar, m, str);
    }
}
