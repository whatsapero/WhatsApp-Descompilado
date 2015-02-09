package com.whatsapp.util.dns;

import com.whatsapp.DialogToastActivity;
import java.io.OutputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class f {
    private static final String[] z;
    private final short a;
    private final boolean b;
    private final boolean c;
    private final short d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final short h;
    private final short i;
    private final short j;
    private final short k;
    private final byte l;

    static {
        String[] strArr = new String[4];
        String str = "(u85\u0019ja-)J$c8p\b/,\"%\u0006&";
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
                        i3 = 74;
                        break;
                    case ay.f /*1*/:
                        i3 = 12;
                        break;
                    case ay.n /*2*/:
                        i3 = 76;
                        break;
                    case ay.p /*3*/:
                        i3 = 80;
                        break;
                    default:
                        i3 = 106;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "(u85\u0019jh#5\u0019jb#$J)c\"$\u000b#bl5\u0004%y+8J.m81";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "(u85\u0019ja-)J$c8p\b/,\"%\u0006&";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "(u85\u0019jh#5\u0019jb#$J)c\"$\u000b#bl5\u0004%y+8J9|-3\u000f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    boolean f() {
        return this.b;
    }

    static f b(byte[] bArr, int i) {
        boolean z = b.c;
        if (bArr == null) {
            try {
                throw new NullPointerException(z[3]);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        try {
            if (bArr.length < i + 12) {
                throw new IllegalArgumentException(z[2]);
            }
            short a = a.a(bArr, i);
            try {
                boolean z2;
                if ((bArr[i + 2] & 128) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                byte b = (byte) ((bArr[i + 2] >> 3) & 15);
                try {
                    boolean z3 = (bArr[i + 2] & 4) != 0;
                    try {
                        boolean z4 = (bArr[i + 2] & 2) != 0;
                        try {
                            boolean z5 = (bArr[i + 2] & 1) != 0;
                            try {
                                boolean z6;
                                if ((bArr[i + 3] & 128) != 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                try {
                                    f fVar = new f(a, z2, b, z3, z4, z5, z6, (short) ((byte) (bArr[i + 3] & 15)), a.a(bArr, i + 4), a.a(bArr, i + 6), a.a(bArr, i + 8), a.a(bArr, i + 10));
                                    if (DialogToastActivity.i) {
                                        boolean z7;
                                        if (z) {
                                            z7 = false;
                                        } else {
                                            z7 = true;
                                        }
                                        b.c = z7;
                                    }
                                    return fVar;
                                } catch (NullPointerException e2) {
                                    throw e2;
                                } catch (NullPointerException e22) {
                                    throw e22;
                                }
                            } catch (NullPointerException e222) {
                                throw e222;
                            }
                        } catch (NullPointerException e2222) {
                            throw e2222;
                        }
                    } catch (NullPointerException e22222) {
                        throw e22222;
                    }
                } catch (NullPointerException e222222) {
                    throw e222222;
                }
            } catch (NullPointerException e2222222) {
                throw e2222222;
            }
        } catch (NullPointerException e22222222) {
            throw e22222222;
        }
    }

    byte[] a() {
        byte[] bArr = new byte[12];
        a(bArr, 0);
        return bArr;
    }

    short c() {
        return this.a;
    }

    void a(byte[] bArr, int i) {
        int i2 = 128;
        boolean z = false;
        boolean z2 = b.c;
        if (bArr == null) {
            try {
                throw new NullPointerException(z[0]);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        try {
            if (bArr.length < i + 12) {
                throw new IllegalArgumentException(z[1]);
            }
            try {
                int i3;
                a.a(this.a, bArr, i);
                bArr[i + 2] = (byte) 0;
                int i4 = i + 2;
                byte b = bArr[i4];
                if (this.b) {
                    i3 = 128;
                } else {
                    i3 = 0;
                }
                try {
                    bArr[i4] = (byte) (i3 | b);
                    i3 = i + 2;
                    bArr[i3] = (byte) (bArr[i3] | ((byte) ((this.l & 15) << 3)));
                    i4 = i + 2;
                    try {
                        bArr[i4] = (byte) ((this.e ? 4 : 0) | bArr[i4]);
                        i4 = i + 2;
                        try {
                            bArr[i4] = (byte) ((this.f ? 2 : 0) | bArr[i4]);
                            i4 = i + 2;
                            b = bArr[i4];
                            if (this.c) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            try {
                                bArr[i4] = (byte) (i3 | b);
                                bArr[i + 3] = (byte) 0;
                                i3 = i + 3;
                                byte b2 = bArr[i3];
                                if (!this.g) {
                                    i2 = 0;
                                }
                                try {
                                    bArr[i3] = (byte) (i2 | b2);
                                    i2 = i + 3;
                                    bArr[i2] = (byte) (bArr[i2] | ((byte) (this.h & 15)));
                                    a.a(this.i, bArr, i + 4);
                                    a.a(this.d, bArr, i + 6);
                                    a.a(this.j, bArr, i + 8);
                                    a.a(this.k, bArr, i + 10);
                                    if (z2) {
                                        if (!DialogToastActivity.i) {
                                            z = true;
                                        }
                                        DialogToastActivity.i = z;
                                    }
                                } catch (NullPointerException e2) {
                                    throw e2;
                                } catch (NullPointerException e22) {
                                    throw e22;
                                }
                            } catch (NullPointerException e222) {
                                throw e222;
                            }
                        } catch (NullPointerException e2222) {
                            throw e2222;
                        }
                    } catch (NullPointerException e22222) {
                        throw e22222;
                    }
                } catch (NullPointerException e222222) {
                    throw e222222;
                }
            } catch (NullPointerException e2222222) {
                throw e2222222;
            }
        } catch (NullPointerException e22222222) {
            throw e22222222;
        }
    }

    short g() {
        return this.h;
    }

    short e() {
        return this.i;
    }

    short h() {
        return this.d;
    }

    void a(OutputStream outputStream) {
        outputStream.write(a());
    }

    boolean b() {
        return this.f;
    }

    f(short s, boolean z, byte b, boolean z2, boolean z3, boolean z4, boolean z5, short s2, short s3, short s4, short s5, short s6) {
        this.a = s;
        this.b = z;
        this.l = b;
        this.e = z2;
        this.f = z3;
        this.c = z4;
        this.g = z5;
        this.h = s2;
        this.i = s3;
        this.d = s4;
        this.j = s5;
        this.k = s6;
    }

    public int d() {
        return 12;
    }
}
