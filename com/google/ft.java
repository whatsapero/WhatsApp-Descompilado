package com.google;

import java.io.Serializable;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ft implements Serializable {
    private static final long serialVersionUID = 1;
    private static final String[] z;
    private boolean a;
    private String b;
    private df c;
    private int d;
    private boolean e;
    private String f;
    private boolean g;
    private boolean h;
    private String i;
    private boolean j;
    private long k;
    private boolean l;
    private boolean m;
    private boolean n;

    static {
        String[] strArr = new String[6];
        String str = "<U\r|n\rCXQu\u001b_B2";
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
                        i3 = 127;
                        break;
                    case ay.f /*1*/:
                        i3 = 58;
                        break;
                    case ay.n /*2*/:
                        i3 = 120;
                        break;
                    case ay.p /*3*/:
                        i3 = 18;
                        break;
                    default:
                        i3 = 26;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "_y\u0017gt\u000bH\u00012Y\u0010^\u001d2I\u0010O\nq\u007fE\u001a";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "_\u007f\u0000f\u007f\u0011I\u0011}tE\u001a";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "_v\u001ds~\u0016T\u001f2@\u001aH\u0017(:\u000bH\rw";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "_t\u0019fs\u0010T\u0019~:1O\u0015p\u007f\r\u0000X";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "_j\nw|\u001aH\nw~_~\u0017\u007f\u007f\fN\u0011q:<[\n`s\u001aHXQu\u001b_B2";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public ft a(boolean z) {
        this.j = true;
        this.g = z;
        return this;
    }

    public String b() {
        return this.i;
    }

    public ft m() {
        this.j = false;
        this.g = false;
        return this;
    }

    public boolean d() {
        return this.e;
    }

    public final ft r() {
        h();
        f();
        j();
        m();
        p();
        e();
        u();
        return this;
    }

    public boolean l() {
        return this.j;
    }

    public ft b(String str) {
        if (str == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.m = true;
        this.b = str;
        return this;
    }

    public boolean equals(Object obj) {
        try {
            if (obj instanceof ft) {
                if (b((ft) obj)) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public ft p() {
        this.n = false;
        this.i = "";
        return this;
    }

    public ft a(long j) {
        this.h = true;
        this.k = j;
        return this;
    }

    public ft u() {
        this.m = false;
        this.b = "";
        return this;
    }

    public ft j() {
        this.a = false;
        this.f = "";
        return this;
    }

    public String n() {
        return this.b;
    }

    public df v() {
        return this.c;
    }

    public ft c(String str) {
        if (str == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.a = true;
        this.f = str;
        return this;
    }

    public boolean q() {
        return this.g;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append(z[0]).append(this.d);
            stringBuilder.append(z[5]).append(this.k);
            if (l()) {
                if (q()) {
                    stringBuilder.append(z[4]);
                }
            }
            try {
                if (s()) {
                    stringBuilder.append(z[3]).append(this.f);
                }
                try {
                    if (c()) {
                        stringBuilder.append(z[2]).append(this.c);
                    }
                    try {
                        if (g()) {
                            stringBuilder.append(z[1]).append(this.b);
                        }
                        return stringBuilder.toString();
                    } catch (NullPointerException e) {
                        throw e;
                    }
                } catch (NullPointerException e2) {
                    throw e2;
                }
            } catch (NullPointerException e22) {
                throw e22;
            }
        } catch (NullPointerException e222) {
            throw e222;
        } catch (NullPointerException e2222) {
            throw e2222;
        }
    }

    public ft a(ft ftVar) {
        try {
            if (ftVar.d()) {
                a(ftVar.a());
            }
            try {
                if (ftVar.k()) {
                    a(ftVar.t());
                }
                try {
                    if (ftVar.s()) {
                        c(ftVar.i());
                    }
                    try {
                        if (ftVar.l()) {
                            a(ftVar.q());
                        }
                        try {
                            if (ftVar.o()) {
                                a(ftVar.b());
                            }
                            try {
                                if (ftVar.c()) {
                                    a(ftVar.v());
                                }
                                try {
                                    if (ftVar.g()) {
                                        b(ftVar.n());
                                    }
                                    return this;
                                } catch (NullPointerException e) {
                                    throw e;
                                }
                            } catch (NullPointerException e2) {
                                throw e2;
                            }
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
    }

    public ft e() {
        this.l = false;
        this.c = df.FROM_NUMBER_WITH_PLUS_SIGN;
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(com.google.ft r7) {
        /*
        r6_this = this;
        r0 = 1;
        r1 = 0;
        if (r7 != 0) goto L_0x0006;
    L_0x0004:
        r0 = r1;
    L_0x0005:
        return r0;
    L_0x0006:
        if (r6 == r7) goto L_0x0005;
    L_0x0008:
        r2 = r6.d;	 Catch:{ NullPointerException -> 0x004c }
        r3 = r7.d;	 Catch:{ NullPointerException -> 0x004c }
        if (r2 != r3) goto L_0x004a;
    L_0x000e:
        r2 = r6.k;	 Catch:{ NullPointerException -> 0x004e }
        r4 = r7.k;	 Catch:{ NullPointerException -> 0x004e }
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x004a;
    L_0x0016:
        r2 = r6.f;	 Catch:{ NullPointerException -> 0x0050 }
        r3 = r7.f;	 Catch:{ NullPointerException -> 0x0050 }
        r2 = r2.equals(r3);	 Catch:{ NullPointerException -> 0x0050 }
        if (r2 == 0) goto L_0x004a;
    L_0x0020:
        r2 = r6.g;	 Catch:{ NullPointerException -> 0x0052 }
        r3 = r7.g;	 Catch:{ NullPointerException -> 0x0052 }
        if (r2 != r3) goto L_0x004a;
    L_0x0026:
        r2 = r6.i;	 Catch:{ NullPointerException -> 0x0054 }
        r3 = r7.i;	 Catch:{ NullPointerException -> 0x0054 }
        r2 = r2.equals(r3);	 Catch:{ NullPointerException -> 0x0054 }
        if (r2 == 0) goto L_0x004a;
    L_0x0030:
        r2 = r6.c;	 Catch:{ NullPointerException -> 0x0056 }
        r3 = r7.c;	 Catch:{ NullPointerException -> 0x0056 }
        if (r2 != r3) goto L_0x004a;
    L_0x0036:
        r2 = r6.b;	 Catch:{ NullPointerException -> 0x0058 }
        r3 = r7.b;	 Catch:{ NullPointerException -> 0x0058 }
        r2 = r2.equals(r3);	 Catch:{ NullPointerException -> 0x0058 }
        if (r2 == 0) goto L_0x004a;
    L_0x0040:
        r2 = r6.g();	 Catch:{ NullPointerException -> 0x005a }
        r3 = r7.g();	 Catch:{ NullPointerException -> 0x005a }
        if (r2 == r3) goto L_0x0005;
    L_0x004a:
        r0 = r1;
        goto L_0x0005;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0056 }
    L_0x0056:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0058 }
    L_0x0058:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ft.b(com.google.ft):boolean");
    }

    public boolean g() {
        return this.m;
    }

    public int a() {
        return this.d;
    }

    public ft a(df dfVar) {
        if (dfVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.l = true;
        this.c = dfVar;
        return this;
    }

    public boolean s() {
        return this.a;
    }

    public ft h() {
        this.e = false;
        this.d = 0;
        return this;
    }

    public ft() {
        this.d = 0;
        this.k = 0;
        this.f = "";
        this.g = false;
        this.i = "";
        this.b = "";
        this.c = df.FROM_NUMBER_WITH_PLUS_SIGN;
    }

    public ft f() {
        this.h = false;
        this.k = 0;
        return this;
    }

    public ft a(int i) {
        this.e = true;
        this.d = i;
        return this;
    }

    public boolean o() {
        return this.n;
    }

    public long t() {
        return this.k;
    }

    public String i() {
        return this.f;
    }

    public int hashCode() {
        int i = 1231;
        int a = (((((a() + 2173) * 53) + Long.valueOf(t()).hashCode()) * 53) + i().hashCode()) * 53;
        try {
            int i2;
            if (q()) {
                i2 = 1231;
            } else {
                i2 = 1237;
            }
            i2 = (((((((i2 + a) * 53) + b().hashCode()) * 53) + v().hashCode()) * 53) + n().hashCode()) * 53;
            try {
                if (!g()) {
                    i = 1237;
                }
                return i2 + i;
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public boolean c() {
        return this.l;
    }

    public boolean k() {
        return this.h;
    }

    public ft a(String str) {
        if (str == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.n = true;
        this.i = str;
        return this;
    }
}
