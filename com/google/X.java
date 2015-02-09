package com.google;

import java.io.IOException;

class x extends c {
    final dw b;

    public Object a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    public dw a(I i, aC aCVar) {
        ac b = dw.b(dw.c(this.b));
        try {
            b.a(i, aCVar);
            return b.c();
        } catch (gc e) {
            throw e.a(b.c());
        } catch (IOException e2) {
            throw new gc(e2.getMessage()).a(b.c());
        }
    }

    x(dw dwVar) {
        this.b = dwVar;
    }
}
