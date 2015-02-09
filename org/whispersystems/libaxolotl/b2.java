package org.whispersystems.libaxolotl;

import org.whispersystems.libaxolotl.ecc.d;
import org.whispersystems.libaxolotl.ecc.f;

public class b2 {
    private final f a;

    public b2(f fVar) {
        this.a = fVar;
    }

    public f a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj != null && (obj instanceof b2)) ? this.a.equals(((b2) obj).a()) : false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public b2(byte[] bArr, int i) {
        this.a = d.a(bArr, i);
    }

    public byte[] b() {
        return this.a.b();
    }
}
