package com.google;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ap extends aC {
    private static final ap e;
    private final Map d;
    private final Map f;

    public static ap a() {
        return e;
    }

    private ap() {
        this.d = new HashMap();
        this.f = new HashMap();
    }

    public dM a(M m, int i) {
        return (dM) this.f.get(new eq(m, i));
    }

    static {
        e = new ap(true);
    }

    private ap(boolean z) {
        super(aC.a());
        this.d = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }
}
