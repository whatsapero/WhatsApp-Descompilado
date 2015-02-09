package com.google;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class gX extends g2 {
    private static final String[] z;
    protected final byte[] c;
    private int d;

    static {
        int i;
        int i2;
        String[] strArr = new String[5];
        char[] toCharArray = "!RO\u0015C\u0015U\u0001PB\u0017\u0013NS\f\u001cGIP^I\u0013".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 115;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 33;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "?VORX\u001b\u0013UZCS_@GK\u0016\t\u0001".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 115;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 33;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "_\u0013".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 115;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 33;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "_\u0013".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 115;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 33;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = ";RR\u0015MS]DB\f\u0007JQP\f\u001cU\u0001wU\u0007VrA^\u001a]F\u0015N\u0016VO\u0015O\u0001V@AI\u0017\f\u0001sC\u0006]E\u0015".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 115;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 33;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[4] = new String(cArr).intern();
        z = strArr;
    }

    boolean a(gX gXVar, int i, int i2) {
        boolean z = dy.b;
        try {
            if (i2 > gXVar.e()) {
                throw new IllegalArgumentException(z[1] + i2 + e());
            }
            try {
                if (i + i2 > gXVar.e()) {
                    throw new IllegalArgumentException(z[0] + i + z[3] + i2 + z[2] + gXVar.e());
                }
                byte[] bArr = this.c;
                byte[] bArr2 = gXVar.c;
                int a = a() + i2;
                int a2 = a();
                int a3 = gXVar.a() + i;
                while (a2 < a) {
                    try {
                        if (bArr[a2] == bArr2[a3]) {
                            a2++;
                            a3++;
                            if (z) {
                                break;
                            }
                        }
                        return false;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                return true;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    protected int c() {
        return this.d;
    }

    public boolean i() {
        int a = a();
        return gB.a(this.c, a, e() + a);
    }

    public InputStream h() {
        return new ByteArrayInputStream(this.c, a(), e());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        try {
            if (!(obj instanceof g2)) {
                return false;
            }
            try {
                if (e() != ((g2) obj).e()) {
                    return false;
                }
                try {
                    if (e() == 0) {
                        return true;
                    }
                    try {
                        if (obj instanceof gX) {
                            return a((gX) obj, 0, e());
                        }
                        try {
                            if (obj instanceof gn) {
                                return obj.equals(this);
                            }
                            throw new IllegalArgumentException(z[4] + obj.getClass());
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    public byte b(int i) {
        return this.c[i];
    }

    public int e() {
        return this.c.length;
    }

    public cR g() {
        return new dm(this, null);
    }

    gX(byte[] bArr) {
        this.d = 0;
        this.c = bArr;
    }

    public int hashCode() {
        int i = this.d;
        if (i == 0) {
            i = e();
            i = a(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.d = i;
        }
        return i;
    }

    protected int b(int i, int i2, int i3) {
        int a = a() + i2;
        return gB.a(i, this.c, a, a + i3);
    }

    public I a() {
        return I.a(this.c, a(), e());
    }

    public String b(String str) {
        return new String(this.c, a(), e(), str);
    }

    protected int a(int i, int i2, int i3) {
        boolean z = dy.b;
        byte[] bArr = this.c;
        int a = a() + i2;
        int i4 = a + i3;
        int i5 = a;
        a = i;
        while (i5 < i4) {
            a = (a * 31) + bArr[i5];
            i5++;
            if (z) {
                break;
            }
        }
        return a;
    }

    protected int a() {
        return 0;
    }

    protected void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, i, bArr, i2, i3);
    }

    public Iterator iterator() {
        return g();
    }
}
