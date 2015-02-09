package com.google;

import java.util.Iterator;
import java.util.Map.Entry;

public class bC {
    private final boolean a;
    private Entry b;
    private final Iterator c;
    final eo d;

    private bC(eo eoVar, boolean z) {
        this.d = eoVar;
        this.c = eo.a(this.d).e();
        if (this.c.hasNext()) {
            this.b = (Entry) this.c.next();
        }
        this.a = z;
    }

    bC(eo eoVar, boolean z, gh ghVar) {
        this(eoVar, z);
    }
}
