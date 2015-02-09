package com.whatsapp;

import android.text.TextUtils;
import com.whatsapp.protocol.f;
import java.util.Comparator;

class any implements Comparator {
    final MessageDetailsActivity a;
    kf b;

    any(MessageDetailsActivity messageDetailsActivity) {
        this.a = messageDetailsActivity;
        this.b = new kf(this.a.getApplicationContext());
    }

    public int a(xx xxVar, xx xxVar2) {
        int i = 0;
        int a = f.a(xxVar2.a(), xxVar.a());
        if (a != 0) {
            return a;
        }
        if (xxVar.a == null) {
            return 1;
        }
        if (xxVar2.a == null) {
            return -1;
        }
        m8 a2 = App.P.a(xxVar.a);
        m8 a3 = App.P.a(xxVar2.a);
        if (TextUtils.isEmpty(a2.N)) {
            a = 0;
        } else {
            a = 1;
        }
        if (!TextUtils.isEmpty(a3.N)) {
            i = 1;
        }
        if (a == i) {
            return this.b.a(a2, a3);
        }
        return a != 0 ? -1 : 1;
    }

    public int compare(Object obj, Object obj2) {
        return a((xx) obj, (xx) obj2);
    }
}
