package com.google;

import java.io.InputStream;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class g2 implements Iterable {
    public static final g2 a;
    static final boolean b;
    private static final String[] z;

    protected abstract int a(int i, int i2, int i3);

    public abstract I a();

    public abstract byte b(int i);

    protected abstract int b(int i, int i2, int i3);

    public abstract String b(String str);

    protected abstract void b(byte[] bArr, int i, int i2, int i3);

    protected abstract int c();

    public abstract int e();

    public abstract boolean equals(Object obj);

    public abstract cR g();

    public abstract InputStream h();

    public abstract int hashCode();

    public abstract boolean i();

    public static g2 a(String str) {
        try {
            return new gX(str.getBytes(z[9]));
        } catch (Throwable e) {
            throw new RuntimeException(z[8], e);
        }
    }

    public void a(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            try {
                throw new IndexOutOfBoundsException(z[1] + i);
            } catch (RuntimeException e) {
                throw e;
            }
        } else if (i2 < 0) {
            try {
                throw new IndexOutOfBoundsException(z[2] + i2);
            } catch (RuntimeException e2) {
                throw e2;
            }
        } else if (i3 < 0) {
            try {
                throw new IndexOutOfBoundsException(z[0] + i3);
            } catch (RuntimeException e22) {
                throw e22;
            }
        } else {
            try {
                if (i + i3 > e()) {
                    throw new IndexOutOfBoundsException(z[3] + (i + i3));
                }
                try {
                    if (i2 + i3 > bArr.length) {
                        throw new IndexOutOfBoundsException(z[4] + (i2 + i3));
                    } else if (i3 > 0) {
                        try {
                            b(bArr, i, i2, i3);
                        } catch (RuntimeException e222) {
                            throw e222;
                        }
                    }
                } catch (RuntimeException e2222) {
                    throw e2222;
                }
            } catch (RuntimeException e22222) {
                throw e22222;
            }
        }
    }

    public String toString() {
        return String.format(z[7], new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(e())});
    }

    public boolean d() {
        try {
            return e() == 0;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public byte[] b() {
        int e = e();
        byte[] bArr = new byte[e];
        b(bArr, 0, 0, e);
        return bArr;
    }

    public String f() {
        try {
            return b(z[6]);
        } catch (Throwable e) {
            throw new RuntimeException(z[5], e);
        }
    }

    public Iterator iterator() {
        return g();
    }

    public static g2 a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    static en a(int i) {
        return new en(i, null);
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[10];
        char[] toCharArray = "PK\f&ft\u000e^a\"&\u000e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 28;
                    break;
                case ay.f /*1*/:
                    i2 = 46;
                    break;
                case ay.n /*2*/:
                    i2 = 98;
                    break;
                case ay.p /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "OA\u00173qy\u000e\r'toK\u0016a.<\u001eXa".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 28;
                    break;
                case ay.f /*1*/:
                    i2 = 46;
                    break;
                case ay.n /*2*/:
                    i2 = 98;
                    break;
                case ay.p /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "HO\u0010&wh\u000e\r'toK\u0016a.<\u001eXa".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 28;
                    break;
                case ay.f /*1*/:
                    i2 = 46;
                    break;
                case ay.n /*2*/:
                    i2 = 98;
                    break;
                case ay.p /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "OA\u00173qy\u000e\u0007/v<A\u0004'ayZB}2,\u0014B".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 28;
                    break;
                case ay.f /*1*/:
                    i2 = 46;
                    break;
                case ay.n /*2*/:
                    i2 = 98;
                    break;
                case ay.p /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "HO\u0010&wh\u000e\u0007/v<A\u0004'ayZB}2,\u0014B".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 28;
                    break;
                case ay.f /*1*/:
                    i2 = 46;
                    break;
                case ay.n /*2*/:
                    i2 = 98;
                    break;
                case ay.p /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "Iz$l*<@\r52o[\u00121}nZ\u0007%-".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 28;
                    break;
                case ay.f /*1*/:
                    i2 = 46;
                    break;
                case ay.n /*2*/:
                    i2 = 98;
                    break;
                case ay.p /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "Iz$l*".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 28;
                    break;
                case ay.f /*1*/:
                    i2 = 46;
                    break;
                case ay.n /*2*/:
                    i2 = 98;
                    break;
                case ay.p /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = " l\u001b5wOZ\u0010(|{nG22oG\u0018$/9J\\".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 28;
                    break;
                case ay.f /*1*/:
                    i2 = 46;
                    break;
                case ay.n /*2*/:
                    i2 = 98;
                    break;
                case ay.p /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "Iz$l*<@\r52o[\u00121}nZ\u0007%-".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 28;
                    break;
                case ay.f /*1*/:
                    i2 = 46;
                    break;
                case ay.n /*2*/:
                    i2 = 98;
                    break;
                case ay.p /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "Iz$l*".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 28;
                    break;
                case ay.f /*1*/:
                    i2 = 46;
                    break;
                case ay.n /*2*/:
                    i2 = 98;
                    break;
                case ay.p /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        z = strArr;
        try {
            boolean z;
            if (g2.class.desiredAssertionStatus()) {
                z = false;
            } else {
                z = true;
            }
            b = z;
            a = new gX(new byte[0]);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public static g2 a(byte[] bArr, int i, int i2) {
        Object obj = new Object[i2];
        System.arraycopy(bArr, i, obj, 0, i2);
        return new gX(obj);
    }

    g2() {
    }
}
