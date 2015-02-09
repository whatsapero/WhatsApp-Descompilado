package com.whatsapp.appwidget;

import com.whatsapp.protocol.b;
import java.util.Comparator;

class f implements Comparator {
    final e a;

    f(e eVar) {
        this.a = eVar;
    }

    public int a(b bVar, b bVar2) {
        if (bVar.D == bVar2.D) {
            return 0;
        }
        return bVar.D < bVar2.D ? 1 : -1;
    }

    public int compare(Object obj, Object obj2) {
        return a((b) obj, (b) obj2);
    }
}
