package org.whispersystems.libaxolotl;

import com.google.g2;
import org.whispersystems.libaxolotl.ecc.a;
import org.whispersystems.libaxolotl.ecc.d;

public class bo {
    private ay a;

    public bo(int i, a aVar) {
        this.a = ay.j().a(i).a(g2.a(aVar.b().b())).b(g2.a(aVar.a().b())).b();
    }

    public int a() {
        return this.a.i();
    }

    public a b() {
        try {
            return new a(d.a(this.a.m().b(), 0), d.a(this.a.g().b()));
        } catch (Z e) {
            throw new AssertionError(e);
        }
    }

    public bo(byte[] bArr) {
        this.a = ay.a(bArr);
    }

    public byte[] c() {
        return this.a.b();
    }
}
