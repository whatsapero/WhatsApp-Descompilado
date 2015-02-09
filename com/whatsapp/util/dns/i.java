package com.whatsapp.util.dns;

import java.io.OutputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class i {
    private static final String[] z;
    private final h a;
    private final short b;
    private final int c;
    private final int d;
    private final byte[] e;
    private final short f;

    static {
        String[] strArr = new String[3];
        String str = "^0\u0016\u00004Q7\u0006\u001c7Y*E\u00113C?";
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
                        i3 = 55;
                        break;
                    case ay.f /*1*/:
                        i3 = 94;
                        break;
                    case ay.n /*2*/:
                        i3 = 101;
                        break;
                    case ay.p /*3*/:
                        i3 = 117;
                        break;
                    default:
                        i3 = 82;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "^0\u0016\u00004Q7\u0006\u001c7Y*E\u00113C?";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "U'\u0011\u0010!\u00173\u0004\frY1\u0011U0R~\u000b\u0000>[";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static i a(byte[] bArr, int i) {
        if (bArr == null) {
            try {
                throw new NullPointerException(z[1]);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        h a = h.a(bArr, i);
        int c = a.c() + i;
        try {
            if (bArr.length < c + 10) {
                throw new IllegalArgumentException(z[0]);
            }
            short a2 = a.a(bArr, c);
            short a3 = a.a(bArr, c + 2);
            int b = a.b(bArr, c + 4);
            short a4 = a.a(bArr, c + 8);
            c += 10;
            try {
                if (bArr.length < c + a4) {
                    throw new IllegalArgumentException(z[2]);
                }
                Object obj = new Object[a4];
                System.arraycopy(bArr, c, obj, 0, a4);
                return new i(a, a2, a3, b, obj, a4 + (a.c() + 10));
            } catch (NullPointerException e2) {
                throw e2;
            }
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    short d() {
        return (short) this.e.length;
    }

    int b() {
        return this.c;
    }

    short g() {
        return this.b;
    }

    h c() {
        return this.a;
    }

    private i(h hVar, short s, short s2, int i, byte[] bArr, int i2) {
        this.a = hVar;
        this.f = s;
        this.b = s2;
        this.d = i;
        this.e = bArr;
        this.c = i2;
    }

    short a() {
        return this.f;
    }

    int e() {
        return this.d;
    }

    void a(OutputStream outputStream) {
        this.a.a(outputStream);
        a.a(outputStream, this.f);
        a.a(outputStream, this.b);
        a.a(outputStream, this.d);
        a.a(outputStream, (short) this.e.length);
        outputStream.write(this.e);
    }

    byte[] f() {
        return this.e;
    }
}
