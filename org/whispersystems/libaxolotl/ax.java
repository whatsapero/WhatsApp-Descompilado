package org.whispersystems.libaxolotl;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ecc.a;
import org.whispersystems.libaxolotl.ecc.d;
import org.whispersystems.libaxolotl.ecc.f;

public class aX {
    private static final String z;
    private final byte[] a;
    private final aZ b;

    static {
        char[] toCharArray = "ZX\u0012\t_hB)\u001b[nX\u001e\u000e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 13;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 123;
                    break;
                case ay.p /*3*/:
                    i2 = 122;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public byte[] a() {
        return this.a;
    }

    public am a(f fVar, a aVar) {
        bW bWVar = new bW(this.b.a(d.a(fVar, aVar.a()), this.a, z.getBytes(), 64));
        return new am(new aX(this.b, bWVar.b()), new z(this.b, bWVar.a(), 0));
    }

    public aX(aZ aZVar, byte[] bArr) {
        this.b = aZVar;
        this.a = bArr;
    }
}
