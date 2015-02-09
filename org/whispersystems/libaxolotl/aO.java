package org.whispersystems.libaxolotl;

import org.whispersystems.libaxolotl.ecc.a;
import org.whispersystems.libaxolotl.ecc.f;

public class ao {
    private b2 a;
    private f b;
    private f c;
    private a d;
    private az e;
    private aK f;

    public ao a(a aVar) {
        this.d = aVar;
        return this;
    }

    public ao a(b2 b2Var) {
        this.a = b2Var;
        return this;
    }

    public ao a(f fVar) {
        this.b = fVar;
        return this;
    }

    public ao b(f fVar) {
        this.c = fVar;
        return this;
    }

    public ao a(az azVar) {
        this.e = azVar;
        return this;
    }

    public bN a() {
        return new bN(this.e, this.d, this.a, this.c, this.b, this.f, null);
    }

    public ao a(aK aKVar) {
        this.f = aKVar;
        return this;
    }
}
