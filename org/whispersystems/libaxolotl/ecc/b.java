package org.whispersystems.libaxolotl.ecc;

import java.math.BigInteger;
import java.util.Arrays;
import org.whispersystems.libaxolotl.aE;
import org.whispersystems.libaxolotl.bD;

public class b implements f {
    private final byte[] a;

    b(byte[] bArr) {
        this.a = bArr;
    }

    public int compareTo(Object obj) {
        return a((f) obj);
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public byte[] a() {
        return this.a;
    }

    public int a(f fVar) {
        return new BigInteger(this.a).compareTo(new BigInteger(((b) fVar).a));
    }

    public byte[] b() {
        boolean z = false;
        boolean z2 = d.a;
        byte[] bArr = new byte[]{(byte) 5};
        bArr = aE.a(new byte[][]{bArr, this.a});
        if (bD.m) {
            if (!z2) {
                z = true;
            }
            d.a = z;
        }
        return bArr;
    }

    public int a() {
        return 5;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return Arrays.equals(this.a, ((b) obj).a);
    }
}
