package com.google;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class ej implements aJ {
    private static final String[] z;
    private Map a;
    private int b;
    private eH c;

    static {
        int i;
        String[] strArr = new String[5];
        char[] toCharArray = "\u000b_m x8I?!7%\u001a~o.0Vv+x7Sz#<qTj\":4H1".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 81;
                    break;
                case ay.f /*1*/:
                    i2 = 58;
                    break;
                case ay.n /*2*/:
                    i2 = 31;
                    break;
                case ay.p /*3*/:
                    i2 = 79;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u000b_m x8I?!7%\u001a~o.0Vv+x7Sz#<qTj\":4H1".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 81;
                    break;
                case ay.f /*1*/:
                    i2 = 58;
                    break;
                case ay.n /*2*/:
                    i2 = 31;
                    break;
                case ay.p /*3*/:
                    i2 = 79;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u000b_m x8I?!7%\u001a~o.0Vv+x7Sz#<qTj\":4H1".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 81;
                    break;
                case ay.f /*1*/:
                    i2 = 58;
                    break;
                case ay.n /*2*/:
                    i2 = 31;
                    break;
                case ay.p /*3*/:
                    i2 = 79;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\u0003_~+1?]?)*>W?.x3Ck*x0Hm.!qNw==&\u001a~!x\u0018uZ7;4Jk&7?\u001a7<0>Os+x?_i**qR~?(4T6a".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 81;
                    break;
                case ay.f /*1*/:
                    i2 = 58;
                    break;
                case ay.n /*2*/:
                    i2 = 31;
                    break;
                case ay.p /*3*/:
                    i2 = 79;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u000b_m x8I?!7%\u001a~o.0Vv+x7Sz#<qTj\":4H1".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 81;
                    break;
                case ay.f /*1*/:
                    i2 = 58;
                    break;
                case ay.n /*2*/:
                    i2 = 31;
                    break;
                case ay.p /*3*/:
                    i2 = 79;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[4] = new String(cArr).intern();
        z = strArr;
    }

    public boolean a(int i, I i2) {
        int b = aA.b(i);
        try {
            switch (aA.a(i)) {
                case PBE.MD5 /*0*/:
                    a(b).b(i2.j());
                    return true;
                case ay.f /*1*/:
                    a(b).a(i2.p());
                    return true;
                case ay.n /*2*/:
                    a(b).a(i2.z());
                    return true;
                case ay.p /*3*/:
                    aJ b2 = eS.b();
                    i2.a(b, b2, ap.a());
                    a(b).a(b2.c());
                    return true;
                case aj.i /*4*/:
                    return false;
                case aV.r /*5*/:
                    a(b).a(i2.y());
                    return true;
                default:
                    throw gc.b();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }

    public boolean b(int i) {
        if (i == 0) {
            try {
                throw new IllegalArgumentException(z[4]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            if (i != this.b) {
                if (!this.a.containsKey(Integer.valueOf(i))) {
                    try {
                        return false;
                    }
                }
            }
            return true;
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    private eH a(int i) {
        try {
            if (this.c != null) {
                if (i == this.b) {
                    return this.c;
                }
                b(this.b, this.c.c());
            }
            try {
                if (i == 0) {
                    return null;
                }
                de deVar = (de) this.a.get(Integer.valueOf(i));
                try {
                    this.b = i;
                    this.c = de.a();
                    if (deVar != null) {
                        this.c.a(deVar);
                    }
                    return this.c;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public eS d() {
        return eS.e();
    }

    private void g() {
        this.a = Collections.emptyMap();
        this.b = 0;
        this.c = null;
    }

    public Object clone() {
        return a();
    }

    public a1 c() {
        return d();
    }

    public a1 b() {
        return c();
    }

    private ej() {
    }

    public ej a() {
        a(0);
        return eS.b().a(new eS(this.a, null));
    }

    public ej a(I i, aC aCVar) {
        return a(i);
    }

    public ej a(I i) {
        boolean z = dy.b;
        do {
            int o = i.o();
            if (o == 0) {
                break;
            }
            try {
                if (!a(o, i) && !z) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } while (!z);
        return this;
    }

    private static ej b() {
        ej ejVar = new ej();
        ejVar.g();
        return ejVar;
    }

    public ej b(int i, de deVar) {
        if (i == 0) {
            try {
                throw new IllegalArgumentException(z[0]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            if (this.c != null) {
                if (this.b == i) {
                    this.c = null;
                    this.b = 0;
                }
            }
            try {
                if (this.a.isEmpty()) {
                    this.a = new TreeMap();
                }
                this.a.put(Integer.valueOf(i), deVar);
                return this;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.eS c() {
        /*
        r3_this = this;
        r2 = 0;
        r0 = 0;
        r3.a(r0);
        r0 = r3.a;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0015;
    L_0x000d:
        r0 = com.google.eS.e();
        r1 = com.google.dy.b;
        if (r1 == 0) goto L_0x0020;
    L_0x0015:
        r0 = new com.google.eS;
        r1 = r3.a;
        r1 = java.util.Collections.unmodifiableMap(r1);
        r0.<init>(r1, r2);
    L_0x0020:
        r3.a = r2;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ej.c():com.google.eS");
    }

    public ej a(int i, int i2) {
        if (i == 0) {
            try {
                throw new IllegalArgumentException(z[1]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        a(i).b((long) i2);
        return this;
    }

    static ej e() {
        return b();
    }

    public boolean a() {
        return true;
    }

    public aJ a(byte[] bArr) {
        return a(bArr);
    }

    public aJ a(I i, aC aCVar) {
        return a(i, aCVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.ej a(int r4, com.google.de r5) {
        /*
        r3_this = this;
        if (r4 != 0) goto L_0x000f;
    L_0x0002:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x000d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x000d }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x000d }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x000d }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x000d }
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r0 = r3.b(r4);	 Catch:{ IllegalArgumentException -> 0x0024 }
        if (r0 == 0) goto L_0x0020;
    L_0x0015:
        r0 = r3.a(r4);	 Catch:{ IllegalArgumentException -> 0x0026 }
        r0.a(r5);	 Catch:{ IllegalArgumentException -> 0x0026 }
        r0 = com.google.dy.b;	 Catch:{ IllegalArgumentException -> 0x0026 }
        if (r0 == 0) goto L_0x0023;
    L_0x0020:
        r3.b(r4, r5);	 Catch:{ IllegalArgumentException -> 0x0026 }
    L_0x0023:
        return r3;
    L_0x0024:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ej.a(int, com.google.de):com.google.ej");
    }

    public ej a(byte[] bArr) {
        try {
            I a = I.a(bArr);
            a(a);
            a.b(0);
            return this;
        } catch (gc e) {
            throw e;
        } catch (Throwable e2) {
            throw new RuntimeException(z[3], e2);
        }
    }

    public eS f() {
        return c();
    }

    public ej a(eS eSVar) {
        boolean z = dy.b;
        if (eSVar != eS.e()) {
            for (Entry entry : eS.a(eSVar).entrySet()) {
                a(((Integer) entry.getKey()).intValue(), (de) entry.getValue());
                if (z) {
                    break;
                }
            }
        }
        return this;
    }

    public a1 a() {
        return f();
    }
}
