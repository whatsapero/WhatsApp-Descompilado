package com.whatsapp;

import android.database.Observable;
import com.whatsapp.protocol.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class a1t extends Observable {
    public void c(b bVar) {
        int i = m3.d;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((fc) it.next()).b(bVar);
            if (i != 0) {
                return;
            }
        }
    }

    public void b(b bVar, int i) {
        int i2 = m3.d;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((fc) it.next()).b(bVar, i);
            if (i2 != 0) {
                return;
            }
        }
    }

    public void a(Collection collection, Map map) {
        int i = m3.d;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((fc) it.next()).a(collection, map);
            if (i != 0) {
                return;
            }
        }
    }

    a1t(a3m com_whatsapp_a3m) {
        this();
    }

    public void a() {
        int i = m3.d;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((fc) it.next()).a();
            if (i != 0) {
                return;
            }
        }
    }

    public void a(b bVar, int i) {
        int i2 = m3.d;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((fc) it.next()).a(bVar, i);
            if (i2 != 0) {
                return;
            }
        }
    }

    public void a(b bVar) {
        int i = m3.d;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((fc) it.next()).c(bVar);
            if (i != 0) {
                return;
            }
        }
    }

    public void a(String str) {
        int i = m3.d;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((fc) it.next()).a(str);
            if (i != 0) {
                return;
            }
        }
    }

    public void b(b bVar) {
        int i = m3.d;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((fc) it.next()).a(bVar);
            if (i != 0) {
                return;
            }
        }
    }

    private a1t() {
    }

    public void a(b bVar, boolean z) {
        int i = m3.d;
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            ((fc) it.next()).a(bVar, z);
            if (i != 0) {
                return;
            }
        }
    }
}
