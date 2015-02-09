package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.d.a;
import java.util.Map;
import java.util.Set;

abstract class aj {
    private final Set art;

    public abstract a B(Map map);

    boolean a(Set set) {
        return set.containsAll(this.art);
    }

    public Set pJ() {
        return this.art;
    }

    public abstract boolean pe();
}
