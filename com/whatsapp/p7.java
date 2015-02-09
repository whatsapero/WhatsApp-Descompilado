package com.whatsapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

class p7 implements Runnable {
    final lh a;

    public void run() {
        int i = App.az;
        ArrayList arrayList = new ArrayList();
        synchronized (lh.c(this.a)) {
            for (Entry entry : lh.a(this.a).entrySet()) {
                Long l = (Long) entry.getValue();
                if (l.longValue() != 0 && l.longValue() < System.currentTimeMillis()) {
                    arrayList.add(entry);
                    continue;
                }
                if (i != 0) {
                    break;
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) ((Entry) it.next()).getKey();
            this.a.b(str);
            Iterator it2 = lh.d(this.a).iterator();
            while (it2.hasNext()) {
                ((z6) it2.next()).a(str);
                App.p(str);
                if (i != 0) {
                    break;
                    continue;
                }
            }
            if (i != 0) {
                break;
            }
        }
        lh.b(this.a);
    }

    p7(lh lhVar) {
        this.a = lhVar;
    }
}
