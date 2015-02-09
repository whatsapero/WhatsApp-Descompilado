package com.google;

import java.io.IOException;

public final class y extends c {
    public Object a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public eS a(I i, aC aCVar) {
        ej b = eS.b();
        try {
            b.a(i);
            return b.f();
        } catch (gc e) {
            throw e.a(b.f());
        } catch (IOException e2) {
            throw new gc(e2.getMessage()).a(b.f());
        }
    }
}
