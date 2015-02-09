package com.google.android.gms.internal;

import java.util.Arrays;

final class qy {
    final byte[] azi;
    final int tag;

    void a(qp qpVar) {
        qpVar.hd(this.tag);
        qpVar.t(this.azi);
    }

    int c() {
        return (0 + qp.he(this.tag)) + this.azi.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qy)) {
            return false;
        }
        qy qyVar = (qy) obj;
        return this.tag == qyVar.tag && Arrays.equals(this.azi, qyVar.azi);
    }

    public int hashCode() {
        return ((this.tag + 527) * 31) + Arrays.hashCode(this.azi);
    }
}
