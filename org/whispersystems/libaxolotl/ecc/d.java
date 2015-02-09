package org.whispersystems.libaxolotl.ecc;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.Z;
import org.whispersystems.libaxolotl.ay;

public class d {
    public static boolean a;
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "\u0000n\u0013%C3;\u0010'Npk\u0003 \\1o\u0014iA5b\u0002iG%h\u0005iH5;\u001e/\n$s\u0014iY1v\u0014i^)k\u0014h";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 80;
                        break;
                    case ay.f /*1*/:
                        i3 = 27;
                        break;
                    case ay.n /*2*/:
                        i3 = 113;
                        break;
                    case ay.p /*3*/:
                        i3 = 73;
                        break;
                    default:
                        i3 = 42;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0005u\u001a'E'uQ=S ~Ki";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0005u\u001a'E'uQ\"O);\u00050Z5!Q";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0005u\u001a'E'uQ=S ~Ki";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0005u\u001a'E'uQ=S ~Ki";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static f a(byte[] bArr, int i) {
        byte b = bArr[i];
        if (b == 5) {
            return Curve25519.a(bArr, i);
        }
        throw new Z(z[3] + b);
    }

    public static byte[] a(e eVar, byte[] bArr) {
        if (eVar.a() == 5) {
            return Curve25519.a(eVar, bArr);
        }
        throw new Z(z[4] + eVar.a());
    }

    public static boolean a(f fVar, byte[] bArr, byte[] bArr2) {
        if (fVar.a() == 5) {
            return Curve25519.a(fVar, bArr, bArr2);
        }
        throw new Z(z[2] + fVar.a());
    }

    public static a a() {
        return Curve25519.a();
    }

    public static byte[] a(f fVar, e eVar) {
        if (fVar.a() != eVar.a()) {
            throw new Z(z[0]);
        } else if (fVar.a() == 5) {
            return Curve25519.a(fVar, eVar);
        } else {
            throw new Z(z[1] + fVar.a());
        }
    }

    public static e a(byte[] bArr) {
        return new c(bArr);
    }
}
