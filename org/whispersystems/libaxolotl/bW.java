package org.whispersystems.libaxolotl;

public class bW {
    private final byte[] a;
    private final byte[] b;

    public byte[] a() {
        return this.b;
    }

    public byte[] b() {
        return this.a;
    }

    public bW(byte[] bArr) {
        boolean z = false;
        boolean z2 = aZ.a;
        byte[][] c = aE.c(bArr, 32, 32);
        this.a = c[0];
        this.b = c[1];
        if (bD.m) {
            if (!z2) {
                z = true;
            }
            aZ.a = z;
        }
    }
}
