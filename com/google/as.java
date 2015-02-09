package com.google;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class as {
    private static final Pattern A;
    private static final String[] C;
    private static final Pattern c;
    private static final Pattern g;
    private static final Pattern k;
    private static final f8 l;
    private static final Pattern n;
    private f8 B;
    private String a;
    private StringBuilder b;
    private int d;
    private String e;
    private final c8 f;
    private boolean h;
    private int i;
    private StringBuilder j;
    private int m;
    private StringBuilder o;
    private boolean p;
    private List q;
    private String r;
    private boolean s;
    private StringBuilder t;
    private StringBuilder u;
    private String v;
    private f8 w;
    private boolean x;
    private boolean y;
    private ef z;

    private String g() {
        int i = c8.b;
        int length = this.j.length();
        if (length <= 0) {
            return this.t.toString();
        }
        String str = "";
        int i2 = 0;
        while (i2 < length) {
            str = c(this.j.charAt(i2));
            i2++;
            if (i != 0) {
                break;
            }
        }
        return this.y ? c(str) : this.o.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a() {
        /*
        r5_this = this;
        r1 = 1;
        r0 = 0;
        r2 = r5.j;
        r2 = r2.length();
        if (r2 != 0) goto L_0x000b;
    L_0x000a:
        return r0;
    L_0x000b:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r5.f;
        r4 = r5.j;
        r3 = r3.a(r4, r2);
        if (r3 == 0) goto L_0x000a;
    L_0x001a:
        r4 = r5.j;
        r4.setLength(r0);
        r0 = r5.j;
        r0.append(r2);
        r0 = r5.f;
        r0 = r0.c(r3);
        r2 = C;
        r2 = r2[r1];
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x0040;
    L_0x0034:
        r2 = r5.f;
        r2 = r2.a(r3);
        r5.B = r2;
        r2 = com.google.c8.b;
        if (r2 == 0) goto L_0x004e;
    L_0x0040:
        r2 = r5.r;
        r2 = r0.equals(r2);
        if (r2 != 0) goto L_0x004e;
    L_0x0048:
        r0 = r5.a(r0);
        r5.B = r0;
    L_0x004e:
        r0 = java.lang.Integer.toString(r3);
        r2 = r5.t;
        r0 = r2.append(r0);
        r2 = 32;
        r0.append(r2);
        r0 = r1;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.as.a():boolean");
    }

    String d() {
        int i = c8.b;
        for (e5 e5Var : this.q) {
            Matcher matcher = this.z.a(e5Var.j()).matcher(this.j);
            if (!matcher.matches()) {
                if (i != 0) {
                    break;
                }
            }
            this.p = A.matcher(e5Var.e()).find();
            return c(matcher.replaceAll(e5Var.a()));
        }
        return "";
    }

    public String a(char c) {
        this.a = b(c, true);
        return this.a;
    }

    private boolean j() {
        if (this.v.length() > 0) {
            this.j.insert(0, this.v);
            this.t.setLength(this.t.lastIndexOf(this.v));
        }
        return !this.v.equals(c());
    }

    private String c(char c) {
        Matcher matcher = k.matcher(this.b);
        if (matcher.find(this.i)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c));
            this.b.replace(0, replaceFirst.length(), replaceFirst);
            this.i = matcher.start();
            return this.b.substring(0, this.i + 1);
        }
        if (this.q.size() == 1) {
            this.y = false;
        }
        this.e = "";
        return this.o.toString();
    }

    private String k() {
        this.y = true;
        this.s = false;
        this.q.clear();
        return i();
    }

    public void h() {
        this.a = "";
        this.o.setLength(0);
        this.u.setLength(0);
        this.b.setLength(0);
        this.i = 0;
        this.e = "";
        this.t.setLength(0);
        this.v = "";
        this.j.setLength(0);
        this.y = true;
        this.x = false;
        this.m = 0;
        this.d = 0;
        this.h = false;
        this.s = false;
        this.q.clear();
        this.p = false;
        if (!this.B.equals(this.w)) {
            this.B = a(this.r);
        }
    }

    private String a(String str, String str2) {
        Matcher matcher = this.z.a(str).matcher(C[4]);
        matcher.find();
        String group = matcher.group();
        return group.length() < this.j.length() ? "" : group.replaceAll(str, str2).replaceAll("9", "\u2008");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private char a(char r3, boolean r4) {
        /*
        r2_this = this;
        r0 = 43;
        if (r3 != r0) goto L_0x000d;
    L_0x0004:
        r0 = r2.u;
        r0.append(r3);
        r0 = com.google.c8.b;
        if (r0 == 0) goto L_0x0021;
    L_0x000d:
        r0 = 10;
        r1 = java.lang.Character.digit(r3, r0);
        r3 = java.lang.Character.forDigit(r1, r0);
        r0 = r2.u;
        r0.append(r3);
        r0 = r2.j;
        r0.append(r3);
    L_0x0021:
        if (r4 == 0) goto L_0x002b;
    L_0x0023:
        r0 = r2.u;
        r0 = r0.length();
        r2.m = r0;
    L_0x002b:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.as.a(char, boolean):char");
    }

    as(String str) {
        this.a = "";
        this.b = new StringBuilder();
        this.e = "";
        this.o = new StringBuilder();
        this.u = new StringBuilder();
        this.y = true;
        this.x = false;
        this.h = false;
        this.s = false;
        this.f = c8.a();
        this.i = 0;
        this.d = 0;
        this.m = 0;
        this.t = new StringBuilder();
        this.p = false;
        this.v = "";
        this.j = new StringBuilder();
        this.q = new ArrayList();
        this.z = new ef(64);
        this.r = str;
        this.B = a(this.r);
        this.w = this.B;
    }

    private boolean b() {
        Matcher matcher = this.z.a(C[0] + this.B.M()).matcher(this.u);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.h = true;
        int end = matcher.end();
        this.j.setLength(0);
        this.j.append(this.u.substring(end));
        this.t.setLength(0);
        this.t.append(this.u.substring(0, end));
        if (this.u.charAt(0) == '+') {
            return true;
        }
        this.t.append(' ');
        return true;
    }

    private void e(String str) {
        int i = c8.b;
        int length = str.length() - 3;
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            e5 e5Var = (e5) it.next();
            if (e5Var.f() > length && !this.z.a(e5Var.a(length)).matcher(str).lookingAt()) {
                it.remove();
                continue;
            }
            if (i != 0) {
                return;
            }
        }
    }

    private boolean f() {
        int i = c8.b;
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            e5 e5Var = (e5) it.next();
            String j = e5Var.j();
            if (!this.e.equals(j)) {
                if (!a(e5Var)) {
                    it.remove();
                    if (i != 0) {
                        break;
                    }
                }
                this.e = j;
                this.p = A.matcher(e5Var.e()).find();
                this.i = 0;
                return true;
            }
            return false;
        }
        this.y = false;
        return false;
    }

    private boolean l() {
        return this.B.N() == 1 && this.j.charAt(0) == '1' && this.j.charAt(1) != '0' && this.j.charAt(1) != '1';
    }

    public String d(char c) {
        this.a = b(c, false);
        return this.a;
    }

    private f8 a(String str) {
        f8 i = this.f.i(this.f.c(this.f.h(str)));
        return i != null ? i : l;
    }

    private String c() {
        int i;
        String substring;
        if (l()) {
            this.t.append('1').append(' ');
            this.h = true;
            if (c8.b != 0) {
                i = 1;
            } else {
                i = 1;
                substring = this.j.substring(0, i);
                this.j.delete(0, i);
                return substring;
            }
        }
        i = 0;
        if (this.B.Z()) {
            Matcher matcher = this.z.a(this.B.q()).matcher(this.j);
            if (matcher.lookingAt()) {
                this.h = true;
                i = matcher.end();
                this.t.append(this.j.substring(0, i));
            }
        }
        substring = this.j.substring(0, i);
        this.j.delete(0, i);
        return substring;
    }

    private boolean a(e5 e5Var) {
        CharSequence j = e5Var.j();
        if (j.indexOf(124) != -1) {
            return false;
        }
        String replaceAll = n.matcher(g.matcher(j).replaceAll(C[2])).replaceAll(C[3]);
        this.b.setLength(0);
        replaceAll = a(replaceAll, e5Var.a());
        if (replaceAll.length() <= 0) {
            return false;
        }
        this.b.append(replaceAll);
        return true;
    }

    public int e() {
        int i = 0;
        int i2 = c8.b;
        if (!this.y) {
            return this.d;
        }
        int i3 = 0;
        while (i3 < this.m && i < this.a.length()) {
            if (this.u.charAt(i3) == this.a.charAt(i)) {
                i3++;
            }
            i++;
            if (i2 != 0) {
                return i;
            }
        }
        return i;
    }

    private boolean b(char c) {
        if (Character.isDigit(c)) {
            return true;
        }
        return this.o.length() == 1 && c8.g.matcher(Character.toString(c)).matches();
    }

    private void b(String str) {
        int i = c8.b;
        List Q;
        if (!this.h || this.B.t() <= 0) {
            Q = this.B.Q();
        } else {
            Q = this.B.S();
        }
        boolean s = this.B.s();
        for (e5 e5Var : r0) {
            if (!(!s || this.h || e5Var.g())) {
                c8 c8Var = this.f;
                if (!c8.e(e5Var.e())) {
                    continue;
                    if (i != 0) {
                        break;
                    }
                }
            }
            if (d(e5Var.a())) {
                this.q.add(e5Var);
                continue;
            } else {
                continue;
            }
            if (i != 0) {
                break;
            }
        }
        e(str);
    }

    private String i() {
        if (this.j.length() < 3) {
            return c(this.j.toString());
        }
        b(this.j.substring(0, 3));
        return f() ? g() : this.o.toString();
    }

    private boolean d(String str) {
        return c.matcher(str).matches();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String b(char r5, boolean r6) {
        /*
        r4_this = this;
        r3 = 1;
        r2 = 0;
        r0 = com.google.c8.b;
        r1 = r4.o;
        r1.append(r5);
        if (r6 == 0) goto L_0x0013;
    L_0x000b:
        r1 = r4.o;
        r1 = r1.length();
        r4.d = r1;
    L_0x0013:
        r1 = r4.b(r5);
        if (r1 != 0) goto L_0x001f;
    L_0x0019:
        r4.y = r2;
        r4.x = r3;
        if (r0 == 0) goto L_0x0023;
    L_0x001f:
        r5 = r4.a(r5, r6);
    L_0x0023:
        r1 = r4.y;
        if (r1 != 0) goto L_0x005c;
    L_0x0027:
        r0 = r4.x;
        if (r0 == 0) goto L_0x0032;
    L_0x002b:
        r0 = r4.o;
        r0 = r0.toString();
    L_0x0031:
        return r0;
    L_0x0032:
        r0 = r4.b();
        if (r0 == 0) goto L_0x0043;
    L_0x0038:
        r0 = r4.a();
        if (r0 == 0) goto L_0x0055;
    L_0x003e:
        r0 = r4.k();
        goto L_0x0031;
    L_0x0043:
        r0 = r4.j();
        if (r0 == 0) goto L_0x0055;
    L_0x0049:
        r0 = r4.t;
        r1 = 32;
        r0.append(r1);
        r0 = r4.k();
        goto L_0x0031;
    L_0x0055:
        r0 = r4.o;
        r0 = r0.toString();
        goto L_0x0031;
    L_0x005c:
        r1 = r4.u;
        r1 = r1.length();
        switch(r1) {
            case 0: goto L_0x008b;
            case 1: goto L_0x008b;
            case 2: goto L_0x008b;
            case 3: goto L_0x0092;
            default: goto L_0x0065;
        };
    L_0x0065:
        r0 = r4.s;
        if (r0 == 0) goto L_0x00a7;
    L_0x0069:
        r0 = r4.a();
        if (r0 == 0) goto L_0x0071;
    L_0x006f:
        r4.s = r2;
    L_0x0071:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r4.t;
        r0 = r0.append(r1);
        r1 = r4.j;
        r1 = r1.toString();
        r0 = r0.append(r1);
        r0 = r0.toString();
        goto L_0x0031;
    L_0x008b:
        r0 = r4.o;
        r0 = r0.toString();
        goto L_0x0031;
    L_0x0092:
        r1 = r4.b();
        if (r1 == 0) goto L_0x009c;
    L_0x0098:
        r4.s = r3;
        if (r0 == 0) goto L_0x0065;
    L_0x009c:
        r0 = r4.c();
        r4.v = r0;
        r0 = r4.i();
        goto L_0x0031;
    L_0x00a7:
        r0 = r4.q;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x00e4;
    L_0x00af:
        r1 = r4.c(r5);
        r0 = r4.d();
        r2 = r0.length();
        if (r2 > 0) goto L_0x0031;
    L_0x00bd:
        r0 = r4.j;
        r0 = r0.toString();
        r4.e(r0);
        r0 = r4.f();
        if (r0 == 0) goto L_0x00d2;
    L_0x00cc:
        r0 = r4.g();
        goto L_0x0031;
    L_0x00d2:
        r0 = r4.y;
        if (r0 == 0) goto L_0x00dc;
    L_0x00d6:
        r0 = r4.c(r1);
        goto L_0x0031;
    L_0x00dc:
        r0 = r4.o;
        r0 = r0.toString();
        goto L_0x0031;
    L_0x00e4:
        r0 = r4.i();
        goto L_0x0031;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.as.b(char, boolean):java.lang.String");
    }

    private String c(String str) {
        int length = this.t.length();
        return (!this.p || length <= 0 || this.t.charAt(length - 1) == ' ') ? this.t + str : new String(this.t) + ' ' + str;
    }

    static {
        String[] strArr = new String[5];
        String str = "H-z";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            int i2;
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 20;
                        break;
                    case ay.f /*1*/:
                        i2 = 6;
                        break;
                    case ay.n /*2*/:
                        i2 = 6;
                        break;
                    case ay.p /*3*/:
                        i2 = 91;
                        break;
                    default:
                        i2 = 127;
                        break;
                }
                cArr[i3] = (char) (i2 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "HZb";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "HZb";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "-??bF-??bF-??bF";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    int i4;
                    char c2;
                    strArr2[i] = str;
                    C = strArr3;
                    f8 f8Var = new f8();
                    char[] toCharArray2 = "ZG".toCharArray();
                    i = toCharArray2.length;
                    toCharArray = toCharArray2;
                    for (i4 = 0; i > i4; i4++) {
                        int i5;
                        c2 = toCharArray[i4];
                        switch (i4 % 5) {
                            case PBE.MD5 /*0*/:
                                i5 = 20;
                                break;
                            case ay.f /*1*/:
                                i5 = 6;
                                break;
                            case ay.n /*2*/:
                                i5 = 6;
                                break;
                            case ay.p /*3*/:
                                i5 = 91;
                                break;
                            default:
                                i5 = 127;
                                break;
                        }
                        toCharArray[i4] = (char) (i5 ^ c2);
                    }
                    l = f8Var.b(new String(toCharArray).intern());
                    str = "H].\u0000!H]Z\u0006\"=,Z\u0006";
                    obj = -1;
                    while (true) {
                        toCharArray = str.toCharArray();
                        i4 = toCharArray.length;
                        char[] cArr2 = toCharArray;
                        for (int i6 = 0; i4 > i6; i6++) {
                            c2 = cArr2[i6];
                            switch (i6 % 5) {
                                case PBE.MD5 /*0*/:
                                    i2 = 20;
                                    break;
                                case ay.f /*1*/:
                                    i2 = 6;
                                    break;
                                case ay.n /*2*/:
                                    i2 = 6;
                                    break;
                                case ay.p /*3*/:
                                    i2 = 91;
                                    break;
                                default:
                                    i2 = 127;
                                    break;
                            }
                            cArr2[i6] = (char) (i2 ^ c2);
                        }
                        str = new String(cArr2).intern();
                        switch (obj) {
                            case PBE.MD5 /*0*/:
                                n = Pattern.compile(str);
                                str = "O+~\u204bR\u2001\u2214\u30fa\uff56R\uff1b&\u00a6\u00f6\u2074\u2074\u3006.r\uff77\uff1d\uff3d\uff3bu#OZ[t\u0001\u2047\u223a\uff58\u0006U<Z\"\u0007\u001bO+~\u204bR\u2001\u2214\u30fa\uff56R\uff1b&\u00a6\u00f6\u2074\u2074\u3006.r\uff77\uff1d\uff3d\uff3bu#OZ[t\u0001\u2047\u223a\uff58\u0006U=-";
                                obj = 1;
                                break;
                            case ay.f /*1*/:
                                c = Pattern.compile(str);
                                str = "O+&\u0006";
                                obj = 2;
                                break;
                            case ay.n /*2*/:
                                A = Pattern.compile(str);
                                k = Pattern.compile("\u2008");
                            default:
                                g = Pattern.compile(str);
                                str = "Hb.dBOX*&\"OX*&\"=";
                                obj = null;
                                break;
                        }
                    }
                default:
                    strArr2[i] = str;
                    str = "$67";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
