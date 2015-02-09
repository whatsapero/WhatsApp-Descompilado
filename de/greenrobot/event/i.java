package de.greenrobot.event;

import java.util.ArrayList;
import java.util.List;

final class i {
    private static final List d;
    Object a;
    h b;
    i c;

    static void a(i iVar) {
        boolean z = p.a;
        iVar.a = null;
        iVar.b = null;
        iVar.c = null;
        synchronized (d) {
            if (d.size() < 10000) {
                d.add(iVar);
            }
        }
        if (g.o != 0) {
            if (z) {
                z = false;
            } else {
                z = true;
            }
            p.a = z;
        }
    }

    private i(Object obj, h hVar) {
        this.a = obj;
        this.b = hVar;
    }

    static i a(h hVar, Object obj) {
        synchronized (d) {
            int size = d.size();
            if (size > 0) {
                i iVar = (i) d.remove(size - 1);
                iVar.a = obj;
                iVar.b = hVar;
                iVar.c = null;
                return iVar;
            }
            return new i(obj, hVar);
        }
    }

    static {
        d = new ArrayList();
    }
}
