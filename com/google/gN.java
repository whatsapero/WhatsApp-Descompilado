package com.google;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class gn extends g2 {
    private static final int[] e;
    private static final String[] z;
    private int c;
    private final int d;
    private final int f;
    private final g2 g;
    private final g2 h;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        try {
            if (!(obj instanceof g2)) {
                return false;
            }
            g2 g2Var = (g2) obj;
            try {
                if (this.d != g2Var.e()) {
                    return false;
                }
                try {
                    if (this.d == 0) {
                        return true;
                    }
                    if (this.c != 0) {
                        int c = g2Var.c();
                        if (c != 0) {
                            try {
                                if (this.c != c) {
                                    return false;
                                }
                            } catch (ArrayIndexOutOfBoundsException e) {
                                throw e;
                            }
                        }
                    }
                    return a(g2Var);
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw e2;
                }
            } catch (ArrayIndexOutOfBoundsException e22) {
                throw e22;
            }
        } catch (ArrayIndexOutOfBoundsException e222) {
            throw e222;
        }
    }

    public cR g() {
        return new fP(this, null);
    }

    public InputStream h() {
        return new ex(this);
    }

    public byte b(int i) {
        if (i < 0) {
            try {
                throw new ArrayIndexOutOfBoundsException(z[2] + i);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        try {
            if (i > this.d) {
                throw new ArrayIndexOutOfBoundsException(z[1] + i + z[0] + this.d);
            }
            if (i < this.f) {
                byte b = this.g.b(i);
                if (!dy.b) {
                    return b;
                }
            }
            return this.h.b(i - this.f);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    public boolean i() {
        return this.h.b(this.g.b(0, 0, this.f), 0, this.h.e()) == 0;
    }

    protected int a(int i, int i2, int i3) {
        try {
            if (i2 + i3 <= this.f) {
                return this.g.a(i, i2, i3);
            }
            try {
                if (i2 >= this.f) {
                    return this.h.a(i, i2 - this.f, i3);
                }
                int i4 = this.f - i2;
                return this.h.a(this.g.a(i, i2, i4), 0, i3 - i4);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = this.c;
        if (i == 0) {
            i = a(this.d, 0, this.d);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    protected int b(int i, int i2, int i3) {
        try {
            if (i2 + i3 <= this.f) {
                return this.g.b(i, i2, i3);
            }
            try {
                if (i2 >= this.f) {
                    return this.h.b(i, i2 - this.f, i3);
                }
                int i4 = this.f - i2;
                return this.h.b(this.g.b(i, i2, i4), 0, i3 - i4);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    static g2 a(gn gnVar) {
        return gnVar.g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void b(byte[] r5, int r6, int r7, int r8) {
        /*
        r4_this = this;
        r0 = com.google.dy.b;
        r1 = r6 + r8;
        r2 = r4.f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0031 }
        if (r1 > r2) goto L_0x000f;
    L_0x0008:
        r1 = r4.g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0033 }
        r1.b(r5, r6, r7, r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0033 }
        if (r0 == 0) goto L_0x0030;
    L_0x000f:
        r1 = r4.f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0035 }
        if (r6 < r1) goto L_0x001e;
    L_0x0013:
        r1 = r4.h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0035 }
        r2 = r4.f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0035 }
        r2 = r6 - r2;
        r1.b(r5, r2, r7, r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0035 }
        if (r0 == 0) goto L_0x0030;
    L_0x001e:
        r0 = r4.f;
        r0 = r0 - r6;
        r1 = r4.g;
        r1.b(r5, r6, r7, r0);
        r1 = r4.h;
        r2 = 0;
        r3 = r7 + r0;
        r0 = r8 - r0;
        r1.b(r5, r2, r3, r0);
    L_0x0030:
        return;
    L_0x0031:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0033 }
    L_0x0033:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0035 }
    L_0x0035:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gn.b(byte[], int, int, int):void");
    }

    private boolean a(g2 g2Var) {
        boolean z = dy.b;
        Iterator f9Var = new f9(this, null);
        gX gXVar = (gX) f9Var.next();
        Iterator f9Var2 = new f9(g2Var, null);
        gX gXVar2 = (gX) f9Var2.next();
        int i = 0;
        gX gXVar3 = gXVar;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int e = gXVar3.e() - i2;
            int e2 = gXVar2.e() - i;
            int min = Math.min(e, e2);
            if (i2 == 0) {
                try {
                    boolean a = gXVar3.a(gXVar2, i, min);
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw e3;
                }
            }
            a = gXVar2.a(gXVar3, i2, min);
            if (!a) {
                return false;
            }
            int i4 = i3 + min;
            try {
                if (i4 >= this.d) {
                    break;
                }
                int i5;
                if (min == e) {
                    gXVar = (gX) f9Var.next();
                    if (z) {
                        i2 = 0;
                    } else {
                        gXVar3 = gXVar;
                        i2 = 0;
                        if (min != e2) {
                            gXVar = (gX) f9Var2.next();
                            if (z) {
                                i5 = 0;
                                i = i5;
                                gXVar2 = gXVar;
                                i3 = i4;
                            } else {
                                i = 0;
                            }
                        } else {
                            gXVar = gXVar2;
                        }
                        i5 = i + min;
                        i = i5;
                        gXVar2 = gXVar;
                        i3 = i4;
                    }
                } else {
                    gXVar = gXVar3;
                }
                i2 += min;
                gXVar3 = gXVar;
                if (min != e2) {
                    gXVar = gXVar2;
                } else {
                    gXVar = (gX) f9Var2.next();
                    if (z) {
                        i5 = 0;
                        i = i5;
                        gXVar2 = gXVar;
                        i3 = i4;
                    } else {
                        i = 0;
                    }
                }
                i5 = i + min;
                i = i5;
                gXVar2 = gXVar;
                i3 = i4;
            } catch (ArrayIndexOutOfBoundsException e32) {
                throw e32;
            } catch (ArrayIndexOutOfBoundsException e322) {
                throw e322;
            }
        }
        if (i4 == this.d) {
            return true;
        }
        throw new IllegalStateException();
    }

    public int e() {
        return this.d;
    }

    static {
        int i;
        int i2;
        int i3 = 1;
        int i4 = 0;
        String[] strArr = new String[3];
        char[] toCharArray = "\u0017G".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 59;
                    break;
                case ay.f /*1*/:
                    i2 = 103;
                    break;
                case ay.n /*2*/:
                    i2 = 69;
                    break;
                case ay.p /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "r\t!\u001d;\u001bYe\u0014&U\u00001\u0010y\u001b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 59;
                    break;
                case ay.f /*1*/:
                    i2 = 103;
                    break;
                case ay.n /*2*/:
                    i2 = 69;
                    break;
                case ay.p /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "r\t!\u001d;\u001b[eHy\u001b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 59;
                    break;
                case ay.f /*1*/:
                    i2 = 103;
                    break;
                case ay.n /*2*/:
                    i2 = 69;
                    break;
                case ay.p /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        z = strArr;
        List arrayList = new ArrayList();
        i2 = 1;
        while (i2 > 0) {
            arrayList.add(Integer.valueOf(i2));
            int i5 = i3 + i2;
            i3 = i2;
            i2 = i5;
        }
        arrayList.add(Integer.valueOf(Integer.MAX_VALUE));
        e = new int[arrayList.size()];
        while (i4 < e.length) {
            try {
                e[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
    }

    public I a() {
        return I.a(new ex(this));
    }

    protected int c() {
        return this.c;
    }

    static g2 b(gn gnVar) {
        return gnVar.h;
    }

    public String b(String str) {
        return new String(b(), str);
    }

    public Iterator iterator() {
        return g();
    }
}
