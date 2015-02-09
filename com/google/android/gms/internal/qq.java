package com.google.android.gms.internal;

public abstract class qq extends qw {
    protected qs ayW;

    public void a(qp qpVar) {
        boolean z = qw.a;
        if (this.ayW != null) {
            int i = 0;
            while (i < this.ayW.size()) {
                this.ayW.hi(i).a(qpVar);
                i++;
                if (z) {
                    return;
                }
            }
        }
    }

    protected final boolean a(qq qqVar) {
        return (this.ayW == null || this.ayW.isEmpty()) ? qqVar.ayW == null || qqVar.ayW.isEmpty() : this.ayW.equals(qqVar.ayW);
    }

    protected int c() {
        int i = 0;
        boolean z = qw.a;
        if (this.ayW == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.ayW.size()) {
            i2 += this.ayW.hi(i).c();
            i++;
            if (z) {
                return i2;
            }
        }
        return i2;
    }

    protected final int rQ() {
        return (this.ayW == null || this.ayW.isEmpty()) ? 0 : this.ayW.hashCode();
    }
}
