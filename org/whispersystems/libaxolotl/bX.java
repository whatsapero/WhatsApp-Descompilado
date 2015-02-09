package org.whispersystems.libaxolotl;

import com.google.g2;
import org.whispersystems.libaxolotl.ecc.a;
import org.whispersystems.libaxolotl.ecc.d;

public class bX {
    private aT a;

    public bX(int i, long j, a aVar, byte[] bArr) {
        this.a = aT.k().a(i).b(g2.a(aVar.b().b())).c(g2.a(aVar.a().b())).a(g2.a(bArr)).a(j).g();
    }

    public bX(byte[] bArr) {
        this.a = aT.a(bArr);
    }

    public int d() {
        return this.a.p();
    }

    public byte[] c() {
        return this.a.f().b();
    }

    public byte[] a() {
        return this.a.b();
    }

    public a b() {
        try {
            return new a(d.a(this.a.m().b(), 0), d.a(this.a.q().b()));
        } catch (Z e) {
            throw new AssertionError(e);
        }
    }
}
