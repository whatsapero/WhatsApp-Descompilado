package com.whatsapp;

import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.notification.t;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.c5;
import com.whatsapp.protocol.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

final class go implements Runnable {
    final ConditionVariable a;
    final boolean b;
    final ConditionVariable c;
    final String d;
    final HashMap e;

    public void run() {
        int i = App.az;
        List arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        List<Pair> arrayList2 = new ArrayList();
        int i2;
        try {
            String str;
            for (Entry entry : this.e.entrySet()) {
                str = (String) entry.getKey();
                b bVar = (b) entry.getValue();
                c5 c5Var = new c5();
                m8 b = v.b(str);
                c5Var.l = App.aJ.i(str);
                c5Var.p = App.aJ.y(str);
                c5Var.b = str;
                c5Var.r = b.w() ? t.c(App.p, str) : 0;
                c5Var.e = b.a;
                c5Var.g = App.aJ.q(str);
                c5Var.s = TextUtils.isEmpty(b.N) ? null : b.N;
                if (b.w()) {
                    boolean z;
                    if (bd.f(str)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c5Var.m = z;
                }
                arrayList.add(c5Var);
                if (bVar != null && m8.d(str) && bVar.a == 6) {
                    App.d(str, true);
                }
                if (currentTimeMillis - 86400000 < c5Var.l && bVar != null) {
                    arrayList2.add(Pair.create(bVar.e, Integer.valueOf(c5Var.e + 20)));
                    continue;
                }
                if (i != 0) {
                    break;
                }
            }
            str = this.d;
            if (this.b) {
                i2 = 7;
            } else {
                i2 = 0;
            }
            App.a(str, arrayList, i2, this.b);
            this.c.open();
            for (Pair pair : arrayList2) {
                App.a(1, App.aJ.a((m) pair.first, ((Integer) pair.second).intValue()), false, this.b, null, this.a);
                if (i != 0) {
                    return;
                }
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            String str2 = this.d;
            if (this.b) {
                i2 = 7;
            } else {
                i2 = 0;
            }
            App.a(str2, arrayList, i2, this.b);
            this.c.open();
        }
    }

    go(HashMap hashMap, String str, boolean z, ConditionVariable conditionVariable, ConditionVariable conditionVariable2) {
        this.e = hashMap;
        this.d = str;
        this.b = z;
        this.c = conditionVariable;
        this.a = conditionVariable2;
    }
}
