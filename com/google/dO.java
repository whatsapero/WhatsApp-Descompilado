package com.google;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class dO extends dk {
    public void c() {
        boolean z = dy.b;
        if (!g()) {
            int i = 0;
            while (i < e()) {
                Entry c = c(i);
                if (((eY) c.getKey()).a()) {
                    c.setValue(Collections.unmodifiableList((List) c.getValue()));
                }
                int i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            }
            for (Entry entry : f()) {
                if (((eY) entry.getKey()).a()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        super.c();
    }

    dO(int i) {
        super(i, null);
    }

    public Object put(Object obj, Object obj2) {
        return super.a((eY) obj, obj2);
    }
}
