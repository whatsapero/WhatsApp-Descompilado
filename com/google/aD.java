package com.google;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class ad {
    static final boolean d;
    private static final String[] z;
    private final Map a;
    private final Set b;
    private final Map c;
    private final Map e;

    private void a(cn cnVar) {
        for (cn cnVar2 : cnVar.b()) {
            if (this.b.add(cnVar2)) {
                a(cnVar2);
            }
        }
    }

    void a(String str, cn cnVar) {
        String str2;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            str2 = str;
        } else {
            a(str.substring(0, lastIndexOf), cnVar);
            str2 = str.substring(lastIndexOf + 1);
        }
        dh dhVar = (dh) this.c.put(str, new fk(str2, str, cnVar));
        if (dhVar != null) {
            this.c.put(str, dhVar);
            if (!(dhVar instanceof fk)) {
                throw new fc(cnVar, '\"' + str2 + z[12] + z[11] + dhVar.a().a() + z[13], null);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    com.google.dh a(java.lang.String r8, com.google.dh r9, com.google.fo r10) {
        /*
        r7_this = this;
        r6 = -1;
        r0 = ".";
        r0 = r8.startsWith(r0);
        if (r0 == 0) goto L_0x0038;
    L_0x0009:
        r0 = 1;
        r0 = r8.substring(r0);
        r0 = r7.a(r0, r10);
    L_0x0012:
        if (r0 != 0) goto L_0x0088;
    L_0x0014:
        r0 = new com.google.fc;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = 34;
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r2 = z;
        r3 = 14;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.toString();
        r2 = 0;
        r0.<init>(r9, r1, r2);
        throw r0;
    L_0x0038:
        r0 = 46;
        r2 = r8.indexOf(r0);
        if (r2 != r6) goto L_0x0057;
    L_0x0040:
        r0 = r8;
    L_0x0041:
        r3 = new java.lang.StringBuilder;
        r1 = r9.b();
        r3.<init>(r1);
    L_0x004a:
        r1 = ".";
        r4 = r3.lastIndexOf(r1);
        if (r4 != r6) goto L_0x005d;
    L_0x0052:
        r0 = r7.a(r8, r10);
        goto L_0x0012;
    L_0x0057:
        r0 = 0;
        r0 = r8.substring(r0, r2);
        goto L_0x0041;
    L_0x005d:
        r1 = r4 + 1;
        r3.setLength(r1);
        r3.append(r0);
        r1 = r3.toString();
        r5 = com.google.fo.AGGREGATES_ONLY;
        r1 = r7.a(r1, r5);
        if (r1 == 0) goto L_0x0084;
    L_0x0071:
        if (r2 == r6) goto L_0x0089;
    L_0x0073:
        r0 = r4 + 1;
        r3.setLength(r0);
        r3.append(r8);
        r0 = r3.toString();
        r0 = r7.a(r0, r10);
        goto L_0x0012;
    L_0x0084:
        r3.setLength(r4);
        goto L_0x004a;
    L_0x0088:
        return r0;
    L_0x0089:
        r0 = r1;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ad.a(java.lang.String, com.google.dh, com.google.fo):com.google.dh");
    }

    static Map b(ad adVar) {
        return adVar.e;
    }

    void a(bv bvVar) {
        d3 d3Var = new d3(bvVar.a(), bvVar.getNumber());
        bv bvVar2 = (bv) this.e.put(d3Var, bvVar);
        if (bvVar2 != null) {
            this.e.put(d3Var, bvVar2);
        }
    }

    boolean b(dh dhVar) {
        return (dhVar instanceof M) || (dhVar instanceof aa);
    }

    boolean a(dh dhVar) {
        return (dhVar instanceof M) || (dhVar instanceof aa) || (dhVar instanceof fk) || (dhVar instanceof bR);
    }

    void d(dh dhVar) {
        c(dhVar);
        String b = dhVar.b();
        int lastIndexOf = b.lastIndexOf(46);
        dh dhVar2 = (dh) this.c.put(b, dhVar);
        if (dhVar2 != null) {
            this.c.put(b, dhVar2);
            if (dhVar.a() != dhVar2.a()) {
                throw new fc(dhVar, '\"' + b + z[9] + dhVar2.a().a() + z[6], null);
            } else if (lastIndexOf == -1) {
                throw new fc(dhVar, '\"' + b + z[7], null);
            } else {
                throw new fc(dhVar, '\"' + b.substring(lastIndexOf + 1) + z[10] + b.substring(0, lastIndexOf) + z[8], null);
            }
        }
    }

    dh a(String str) {
        return a(str, fo.ALL_SYMBOLS);
    }

    dh a(String str, fo foVar) {
        dh dhVar = (dh) this.c.get(str);
        if (dhVar != null) {
            if (foVar == fo.ALL_SYMBOLS) {
                return dhVar;
            }
            if (foVar == fo.TYPES_ONLY && b(dhVar)) {
                return dhVar;
            }
            if (foVar == fo.AGGREGATES_ONLY && a(dhVar)) {
                return dhVar;
            }
        }
        for (cn cnVar : this.b) {
            dhVar = (dh) cn.a(cnVar).c.get(str);
            if (dhVar != null) {
                if (foVar == fo.ALL_SYMBOLS) {
                    return dhVar;
                }
                if (foVar == fo.TYPES_ONLY && b(dhVar)) {
                    return dhVar;
                }
                if (foVar == fo.AGGREGATES_ONLY && a(dhVar)) {
                    return dhVar;
                }
            }
        }
        return null;
    }

    void a(dW dWVar) {
        d3 d3Var = new d3(dWVar.g(), dWVar.e());
        dW dWVar2 = (dW) this.a.put(d3Var, dWVar);
        if (dWVar2 != null) {
            this.a.put(d3Var, dWVar2);
            throw new fc((dh) dWVar, z[4] + dWVar.e() + z[5] + dWVar.g().b() + z[2] + dWVar2.c() + z[3], null);
        }
    }

    static void c(dh dhVar) {
        String c = dhVar.c();
        if (c.length() == 0) {
            throw new fc(dhVar, z[0], null);
        }
        int i = 0;
        int i2 = 1;
        while (i < c.length()) {
            char charAt = c.charAt(i);
            if (charAt >= '\u0080') {
                i2 = 0;
            }
            if (!(Character.isLetter(charAt) || charAt == '_' || (Character.isDigit(charAt) && i > 0))) {
                i2 = 0;
            }
            i++;
        }
        if (i2 == 0) {
            throw new fc(dhVar, '\"' + c + z[1], null);
        }
    }

    static {
        int i;
        int i2;
        boolean z = false;
        String[] strArr = new String[15];
        char[] toCharArray = "Sb\tF8plZ[0snT".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 30;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "<+\u0013Fqpd\u000e\u00150>}\u001bY8z+\u0013Q4p\u007f\u0013S8{yT".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 30;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "<+\u0018Lqxb\u001fY5>)".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 30;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "<%".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 30;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "Xb\u001fY5>e\u000fX3{yZ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 30;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "vj\t\u00150ry\u001fT5g+\u0018P4p+\u000fF4z+\u0013[q<".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 30;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "<%".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 30;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "<+\u0013Fq\u007fg\bP0zrZQ4xb\u0014P50".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 30;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "<%".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 30;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "<+\u0013Fq\u007fg\bP0zrZQ4xb\u0014P5>b\u0014\u00157wg\u001f\u0015s".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 30;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "<+\u0013Fq\u007fg\bP0zrZQ4xb\u0014P5>b\u0014\u0015s".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 30;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "nj\u0019^0ynS\u00158p+\u001c\\={+X".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 30;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "<+\u0013Fq\u007fg\bP0zrZQ4xb\u0014P5>#\u001bFqmd\u0017P%vb\u0014Rqq\u007f\u0012P#>\u007f\u0012T?>jZ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 30;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "<%".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 30;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[13] = new String(cArr).intern();
        toCharArray = "<+\u0013Fqpd\u000e\u00155{m\u0013[4z%".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 30;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 122;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[14] = new String(cArr).intern();
        z = strArr;
        if (!bP.class.desiredAssertionStatus()) {
            z = true;
        }
        d = z;
    }

    ad(cn[] cnVarArr) {
        this.c = new HashMap();
        this.a = new HashMap();
        this.e = new HashMap();
        this.b = new HashSet();
        int i = 0;
        while (i < cnVarArr.length) {
            try {
                this.b.add(cnVarArr[i]);
                a(cnVarArr[i]);
                i++;
            } catch (fc e) {
                throw e;
            }
        }
        for (cn cnVar : this.b) {
            try {
                a(cnVar.e(), cnVar);
            } catch (fc e2) {
                if (!d) {
                    throw new AssertionError();
                }
            } catch (fc e3) {
                throw e3;
            }
        }
    }

    static Map a(ad adVar) {
        return adVar.a;
    }
}
