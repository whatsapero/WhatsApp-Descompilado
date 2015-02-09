package com.whatsapp.contact;

import android.text.TextUtils;
import com.whatsapp.m8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class f {
    private final List a;
    private final List b;
    private final List c;
    private final List d;

    public ArrayList e() {
        Object arrayList = new ArrayList();
        b(arrayList, this.a);
        b(arrayList, this.b);
        b(arrayList, this.d);
        return arrayList;
    }

    public List c() {
        return this.a;
    }

    private f() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    f(h hVar) {
        this();
    }

    public void b(m8 m8Var) {
        this.d.add(m8Var);
    }

    public m8[] b() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, this.a);
        return (m8[]) arrayList.toArray(new m8[arrayList.size()]);
    }

    public boolean h() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty();
    }

    private void a(Collection collection, Collection collection2) {
        boolean z = i.a;
        for (m8 m8Var : collection2) {
            if (m8Var.q && !TextUtils.isEmpty(m8Var.e)) {
                collection.add(m8Var);
                continue;
            }
            if (z) {
                return;
            }
        }
    }

    public m8[] d() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, this.a);
        a(arrayList, this.b);
        a(arrayList, this.d);
        return (m8[]) arrayList.toArray(new m8[arrayList.size()]);
    }

    public void d(m8 m8Var) {
        this.c.add(m8Var);
    }

    public List a() {
        return this.d;
    }

    public List g() {
        return this.b;
    }

    public void c(m8 m8Var) {
        this.a.add(m8Var);
    }

    private void b(Collection collection, Collection collection2) {
        boolean z = i.a;
        for (m8 m8Var : collection2) {
            if (!(m8Var.h == null || TextUtils.isEmpty(m8Var.h.a()))) {
                collection.add(m8Var.h.a());
                continue;
            }
            if (z) {
                return;
            }
        }
    }

    public ArrayList i() {
        Object arrayList = new ArrayList();
        b(arrayList, this.a);
        return arrayList;
    }

    public void a(m8 m8Var) {
        this.b.add(m8Var);
    }

    public List f() {
        return this.c;
    }
}
