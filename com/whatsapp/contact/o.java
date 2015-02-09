package com.whatsapp.contact;

import android.text.TextUtils;
import java.text.Collator;
import java.util.Comparator;

public class o implements Comparator {
    public int a(j jVar, j jVar2) {
        String a = a(jVar);
        String a2 = a(jVar2);
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
        if (jVar.a() == null && jVar2.a() == null) {
            return 0;
        }
        if (jVar.a() == null) {
            return 1;
        }
        return jVar2.a() == null ? -1 : jVar.a().compareTo(jVar2.a());
    }

    public int compare(Object obj, Object obj2) {
        return a((j) obj, (j) obj2);
    }

    private String a(j jVar) {
        if (jVar == null) {
            return null;
        }
        return TextUtils.isEmpty(jVar.d()) ? jVar.g() : jVar.d();
    }
}
