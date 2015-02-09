package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class dj extends d0 implements K {
    public static final int A = 4;
    public static final int B = 7;
    public static final int C = 3;
    public static final int E = 8;
    public static final int l = 1;
    public static final int o = 9;
    private static final dj p;
    public static final int q = 5;
    public static final int r = 6;
    public static eR s = null;
    private static final long serialVersionUID = 0;
    public static final int t = 11;
    public static final int u = 10;
    public static final int z = 2;
    private final eS D;
    private List F;
    private int e;
    private Object f;
    private eW g;
    private byte h;
    private eg i;
    private Object j;
    private List k;
    private List m;
    private List n;
    private List v;
    private List w;
    private c1 x;
    private int y;

    public List x() {
        return this.m;
    }

    public static dj a(g2 g2Var, aC aCVar) {
        return (dj) s.b(g2Var, aCVar);
    }

    public eg E() {
        return this.i;
    }

    private void L() {
        this.j = "";
        this.f = "";
        this.x = fI.a;
        this.F = Collections.emptyList();
        this.k = Collections.emptyList();
        this.n = Collections.emptyList();
        this.m = Collections.emptyList();
        this.v = Collections.emptyList();
        this.w = Collections.emptyList();
        this.i = eg.n();
        this.g = eW.b();
    }

    public static dj a(byte[] bArr, aC aCVar) {
        return (dj) s.a(bArr, aCVar);
    }

    public a1 c() {
        return C();
    }

    public aJ c() {
        return K();
    }

    public g2 c(int i) {
        return this.x.a(i);
    }

    public cj a() {
        return K();
    }

    static Object j(dj djVar) {
        return djVar.f;
    }

    public ea B() {
        return this.i;
    }

    public static dj a(InputStream inputStream, aC aCVar) {
        return (dj) s.a(inputStream, aCVar);
    }

    public final boolean a() {
        boolean z = true;
        boolean z2 = dy.b;
        byte b = this.h;
        if (b != -1) {
            if (b != (byte) 1) {
                z = false;
            }
            return z;
        }
        int i = 0;
        while (i < h()) {
            if (g(i).a()) {
                i++;
                if (z2) {
                    break;
                }
            }
            this.h = (byte) 0;
            return false;
        }
        i = 0;
        while (i < g()) {
            if (k(i).a()) {
                i++;
                if (z2) {
                    break;
                }
            }
            this.h = (byte) 0;
            return false;
        }
        i = 0;
        while (i < b()) {
            if (d(i).a()) {
                i++;
                if (z2) {
                    break;
                }
            }
            this.h = (byte) 0;
            return false;
        }
        i = 0;
        while (i < u()) {
            if (i(i).a()) {
                i++;
                if (z2) {
                    break;
                }
            }
            this.h = (byte) 0;
            return false;
        }
        if (!c() || E().a()) {
            this.h = (byte) 1;
            return true;
        }
        this.h = (byte) 0;
        return false;
    }

    public az K() {
        return m();
    }

    public boolean z() {
        return (this.y & 1) == l;
    }

    static List b(dj djVar) {
        return djVar.m;
    }

    public List H() {
        return this.n;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private dj(com.google.I r13, com.google.aC r14) {
        /*
        r12_this = this;
        r11 = 64;
        r10 = 32;
        r9 = 16;
        r8 = 4;
        r7 = 8;
        r4 = com.google.dy.b;
        r12.<init>();
        r0 = -1;
        r12.h = r0;
        r0 = -1;
        r12.e = r0;
        r12.L();
        r1 = 0;
        r5 = com.google.eS.b();
        r0 = 0;
    L_0x001d:
        if (r0 != 0) goto L_0x01cd;
    L_0x001f:
        r2 = r13.o();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        switch(r2) {
            case 0: goto L_0x0230;
            case 10: goto L_0x002f;
            case 18: goto L_0x003d;
            case 26: goto L_0x004b;
            case 34: goto L_0x0063;
            case 42: goto L_0x007d;
            case 50: goto L_0x0097;
            case 58: goto L_0x00b3;
            case 66: goto L_0x00cf;
            case 74: goto L_0x02ef;
            case 80: goto L_0x012b;
            case 82: goto L_0x0147;
            case 88: goto L_0x017c;
            case 90: goto L_0x0198;
            default: goto L_0x0026;
        };
    L_0x0026:
        r2 = r12.a(r13, r5, r14, r2);	 Catch:{ gc -> 0x0235, IOException -> 0x02a7 }
        if (r2 != 0) goto L_0x01cb;
    L_0x002c:
        r0 = 1;
        if (r4 == 0) goto L_0x01cb;
    L_0x002f:
        r2 = r12.y;	 Catch:{ gc -> 0x02a1, IOException -> 0x02a7 }
        r2 = r2 | 1;
        r12.y = r2;	 Catch:{ gc -> 0x02a1, IOException -> 0x02a7 }
        r2 = r13.z();	 Catch:{ gc -> 0x02a1, IOException -> 0x02a7 }
        r12.j = r2;	 Catch:{ gc -> 0x02a1, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x003d:
        r2 = r12.y;	 Catch:{ gc -> 0x02a3, IOException -> 0x02a7 }
        r2 = r2 | 2;
        r12.y = r2;	 Catch:{ gc -> 0x02a3, IOException -> 0x02a7 }
        r2 = r13.z();	 Catch:{ gc -> 0x02a3, IOException -> 0x02a7 }
        r12.f = r2;	 Catch:{ gc -> 0x02a3, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x004b:
        r2 = r1 & 4;
        if (r2 == r8) goto L_0x0058;
    L_0x004f:
        r2 = new com.google.fI;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r2.<init>();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r12.x = r2;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 4;
    L_0x0058:
        r2 = r12.x;	 Catch:{ gc -> 0x02b6, IOException -> 0x02a7 }
        r3 = r13.z();	 Catch:{ gc -> 0x02b6, IOException -> 0x02a7 }
        r2.a(r3);	 Catch:{ gc -> 0x02b6, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x0063:
        r2 = r1 & 32;
        if (r2 == r10) goto L_0x0070;
    L_0x0067:
        r2 = new java.util.ArrayList;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r2.<init>();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r12.n = r2;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 32;
    L_0x0070:
        r2 = r12.n;	 Catch:{ gc -> 0x02b8, IOException -> 0x02a7 }
        r3 = com.google.dU.w;	 Catch:{ gc -> 0x02b8, IOException -> 0x02a7 }
        r3 = r13.a(r3, r14);	 Catch:{ gc -> 0x02b8, IOException -> 0x02a7 }
        r2.add(r3);	 Catch:{ gc -> 0x02b8, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x007d:
        r2 = r1 & 64;
        if (r2 == r11) goto L_0x008a;
    L_0x0081:
        r2 = new java.util.ArrayList;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r2.<init>();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r12.m = r2;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 64;
    L_0x008a:
        r2 = r12.m;	 Catch:{ gc -> 0x02ba, IOException -> 0x02a7 }
        r3 = com.google.d4.e;	 Catch:{ gc -> 0x02ba, IOException -> 0x02a7 }
        r3 = r13.a(r3, r14);	 Catch:{ gc -> 0x02ba, IOException -> 0x02a7 }
        r2.add(r3);	 Catch:{ gc -> 0x02ba, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x0097:
        r2 = r1 & 128;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 == r3) goto L_0x00a6;
    L_0x009d:
        r2 = new java.util.ArrayList;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r2.<init>();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r12.v = r2;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 128;
    L_0x00a6:
        r2 = r12.v;	 Catch:{ gc -> 0x02bc, IOException -> 0x02a7 }
        r3 = com.google.d7.p;	 Catch:{ gc -> 0x02bc, IOException -> 0x02a7 }
        r3 = r13.a(r3, r14);	 Catch:{ gc -> 0x02bc, IOException -> 0x02a7 }
        r2.add(r3);	 Catch:{ gc -> 0x02bc, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x00b3:
        r2 = r1 & 256;
        r3 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r2 == r3) goto L_0x00c2;
    L_0x00b9:
        r2 = new java.util.ArrayList;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r2.<init>();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r12.w = r2;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 256;
    L_0x00c2:
        r2 = r12.w;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r3 = com.google.d6.j;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r3 = r13.a(r3, r14);	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r2.add(r3);	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x00cf:
        r2 = r0;
        r0 = 0;
        r3 = r12.y;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r3 = r3 & 4;
        if (r3 != r8) goto L_0x02ec;
    L_0x00d7:
        r0 = r12.i;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r0 = r0.w();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r3 = r0;
    L_0x00de:
        r0 = com.google.eg.l;	 Catch:{ gc -> 0x02be, IOException -> 0x02a7 }
        r0 = r13.a(r0, r14);	 Catch:{ gc -> 0x02be, IOException -> 0x02a7 }
        r0 = (com.google.eg) r0;	 Catch:{ gc -> 0x02be, IOException -> 0x02a7 }
        r12.i = r0;	 Catch:{ gc -> 0x02be, IOException -> 0x02a7 }
        if (r3 == 0) goto L_0x00f5;
    L_0x00ea:
        r0 = r12.i;	 Catch:{ gc -> 0x02be, IOException -> 0x02a7 }
        r3.a(r0);	 Catch:{ gc -> 0x02be, IOException -> 0x02a7 }
        r0 = r3.l();	 Catch:{ gc -> 0x02be, IOException -> 0x02a7 }
        r12.i = r0;	 Catch:{ gc -> 0x02be, IOException -> 0x02a7 }
    L_0x00f5:
        r0 = r12.y;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r0 = r0 | 4;
        r12.y = r0;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x02e6;
    L_0x00fd:
        r0 = 0;
        r3 = r12.y;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r3 = r3 & 8;
        if (r3 != r7) goto L_0x02e9;
    L_0x0104:
        r0 = r12.g;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r0 = r0.j();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r3 = r0;
    L_0x010b:
        r0 = com.google.eW.g;	 Catch:{ gc -> 0x02c0, IOException -> 0x02a7 }
        r0 = r13.a(r0, r14);	 Catch:{ gc -> 0x02c0, IOException -> 0x02a7 }
        r0 = (com.google.eW) r0;	 Catch:{ gc -> 0x02c0, IOException -> 0x02a7 }
        r12.g = r0;	 Catch:{ gc -> 0x02c0, IOException -> 0x02a7 }
        if (r3 == 0) goto L_0x0122;
    L_0x0117:
        r0 = r12.g;	 Catch:{ gc -> 0x02c0, IOException -> 0x02a7 }
        r3.a(r0);	 Catch:{ gc -> 0x02c0, IOException -> 0x02a7 }
        r0 = r3.g();	 Catch:{ gc -> 0x02c0, IOException -> 0x02a7 }
        r12.g = r0;	 Catch:{ gc -> 0x02c0, IOException -> 0x02a7 }
    L_0x0122:
        r0 = r12.y;	 Catch:{ gc -> 0x02c2, IOException -> 0x02a7 }
        r0 = r0 | 8;
        r12.y = r0;	 Catch:{ gc -> 0x02c2, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x02e6;
    L_0x012a:
        r0 = r2;
    L_0x012b:
        r2 = r1 & 8;
        if (r2 == r7) goto L_0x0138;
    L_0x012f:
        r2 = new java.util.ArrayList;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r2.<init>();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r12.F = r2;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 8;
    L_0x0138:
        r2 = r12.F;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r3 = r13.r();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r2.add(r3);	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x0147:
        r2 = r13.h();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r2 = r13.f(r2);	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r3 = r1 & 8;
        if (r3 == r7) goto L_0x0162;
    L_0x0153:
        r3 = r13.i();	 Catch:{ gc -> 0x02c4, IOException -> 0x02a7 }
        if (r3 <= 0) goto L_0x0162;
    L_0x0159:
        r3 = new java.util.ArrayList;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r3.<init>();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r12.F = r3;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 8;
    L_0x0162:
        r3 = r13.i();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        if (r3 <= 0) goto L_0x0177;
    L_0x0168:
        r3 = r12.F;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r6 = r13.r();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r3.add(r6);	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x0162;
    L_0x0177:
        r13.c(r2);	 Catch:{ gc -> 0x02c6, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x017c:
        r2 = r1 & 16;
        if (r2 == r9) goto L_0x0189;
    L_0x0180:
        r2 = new java.util.ArrayList;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r2.<init>();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r12.k = r2;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 16;
    L_0x0189:
        r2 = r12.k;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r3 = r13.r();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r2.add(r3);	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x0198:
        r2 = r13.h();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r2 = r13.f(r2);	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r3 = r1 & 16;
        if (r3 == r9) goto L_0x01b3;
    L_0x01a4:
        r3 = r13.i();	 Catch:{ gc -> 0x02c8, IOException -> 0x02a7 }
        if (r3 <= 0) goto L_0x01b3;
    L_0x01aa:
        r3 = new java.util.ArrayList;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r3.<init>();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r12.k = r3;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 16;
    L_0x01b3:
        r3 = r13.i();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        if (r3 <= 0) goto L_0x01c8;
    L_0x01b9:
        r3 = r12.k;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r6 = r13.r();	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        r3.add(r6);	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01b3;
    L_0x01c8:
        r13.c(r2);	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
    L_0x01cb:
        if (r4 == 0) goto L_0x001d;
    L_0x01cd:
        r0 = r1 & 4;
        if (r0 != r8) goto L_0x01da;
    L_0x01d1:
        r0 = new com.google.d2;	 Catch:{ gc -> 0x02d8 }
        r2 = r12.x;	 Catch:{ gc -> 0x02d8 }
        r0.<init>(r2);	 Catch:{ gc -> 0x02d8 }
        r12.x = r0;	 Catch:{ gc -> 0x02d8 }
    L_0x01da:
        r0 = r1 & 32;
        if (r0 != r10) goto L_0x01e6;
    L_0x01de:
        r0 = r12.n;	 Catch:{ gc -> 0x02da }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x02da }
        r12.n = r0;	 Catch:{ gc -> 0x02da }
    L_0x01e6:
        r0 = r1 & 64;
        if (r0 != r11) goto L_0x01f2;
    L_0x01ea:
        r0 = r12.m;	 Catch:{ gc -> 0x02dc }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x02dc }
        r12.m = r0;	 Catch:{ gc -> 0x02dc }
    L_0x01f2:
        r0 = r1 & 128;
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r0 != r2) goto L_0x0200;
    L_0x01f8:
        r0 = r12.v;	 Catch:{ gc -> 0x02de }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x02de }
        r12.v = r0;	 Catch:{ gc -> 0x02de }
    L_0x0200:
        r0 = r1 & 256;
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r0 != r2) goto L_0x020e;
    L_0x0206:
        r0 = r12.w;	 Catch:{ gc -> 0x02e0 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x02e0 }
        r12.w = r0;	 Catch:{ gc -> 0x02e0 }
    L_0x020e:
        r0 = r1 & 8;
        if (r0 != r7) goto L_0x021a;
    L_0x0212:
        r0 = r12.F;	 Catch:{ gc -> 0x02e2 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x02e2 }
        r12.F = r0;	 Catch:{ gc -> 0x02e2 }
    L_0x021a:
        r0 = r1 & 16;
        if (r0 != r9) goto L_0x0226;
    L_0x021e:
        r0 = r12.k;	 Catch:{ gc -> 0x02e4 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ gc -> 0x02e4 }
        r12.k = r0;	 Catch:{ gc -> 0x02e4 }
    L_0x0226:
        r0 = r5.c();
        r12.D = r0;
        r12.c();
        return;
    L_0x0230:
        r0 = 1;
        if (r4 == 0) goto L_0x01cb;
    L_0x0233:
        goto L_0x0026;
    L_0x0235:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
    L_0x0237:
        r0 = move-exception;
        r0 = r0.a(r12);	 Catch:{ all -> 0x023d }
        throw r0;	 Catch:{ all -> 0x023d }
    L_0x023d:
        r0 = move-exception;
        r2 = r1 & 4;
        if (r2 != r8) goto L_0x024b;
    L_0x0242:
        r2 = new com.google.d2;	 Catch:{ gc -> 0x02ca }
        r3 = r12.x;	 Catch:{ gc -> 0x02ca }
        r2.<init>(r3);	 Catch:{ gc -> 0x02ca }
        r12.x = r2;	 Catch:{ gc -> 0x02ca }
    L_0x024b:
        r2 = r1 & 32;
        if (r2 != r10) goto L_0x0257;
    L_0x024f:
        r2 = r12.n;	 Catch:{ gc -> 0x02cc }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ gc -> 0x02cc }
        r12.n = r2;	 Catch:{ gc -> 0x02cc }
    L_0x0257:
        r2 = r1 & 64;
        if (r2 != r11) goto L_0x0263;
    L_0x025b:
        r2 = r12.m;	 Catch:{ gc -> 0x02ce }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ gc -> 0x02ce }
        r12.m = r2;	 Catch:{ gc -> 0x02ce }
    L_0x0263:
        r2 = r1 & 128;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 != r3) goto L_0x0271;
    L_0x0269:
        r2 = r12.v;	 Catch:{ gc -> 0x02d0 }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ gc -> 0x02d0 }
        r12.v = r2;	 Catch:{ gc -> 0x02d0 }
    L_0x0271:
        r2 = r1 & 256;
        r3 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r2 != r3) goto L_0x027f;
    L_0x0277:
        r2 = r12.w;	 Catch:{ gc -> 0x02d2 }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ gc -> 0x02d2 }
        r12.w = r2;	 Catch:{ gc -> 0x02d2 }
    L_0x027f:
        r2 = r1 & 8;
        if (r2 != r7) goto L_0x028b;
    L_0x0283:
        r2 = r12.F;	 Catch:{ gc -> 0x02d4 }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ gc -> 0x02d4 }
        r12.F = r2;	 Catch:{ gc -> 0x02d4 }
    L_0x028b:
        r1 = r1 & 16;
        if (r1 != r9) goto L_0x0297;
    L_0x028f:
        r1 = r12.k;	 Catch:{ gc -> 0x02d6 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ gc -> 0x02d6 }
        r12.k = r1;	 Catch:{ gc -> 0x02d6 }
    L_0x0297:
        r1 = r5.c();
        r12.D = r1;
        r12.c();
        throw r0;
    L_0x02a1:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x02a3, IOException -> 0x02a7 }
    L_0x02a3:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x02a5, IOException -> 0x02a7 }
    L_0x02a5:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
    L_0x02a7:
        r0 = move-exception;
        r2 = new com.google.gc;	 Catch:{ all -> 0x023d }
        r0 = r0.getMessage();	 Catch:{ all -> 0x023d }
        r2.<init>(r0);	 Catch:{ all -> 0x023d }
        r0 = r2.a(r12);	 Catch:{ all -> 0x023d }
        throw r0;	 Catch:{ all -> 0x023d }
    L_0x02b6:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
    L_0x02b8:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
    L_0x02ba:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
    L_0x02bc:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
    L_0x02be:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
    L_0x02c0:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
    L_0x02c2:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
    L_0x02c4:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
    L_0x02c6:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
    L_0x02c8:
        r0 = move-exception;
        throw r0;	 Catch:{ gc -> 0x0237, IOException -> 0x02a7 }
    L_0x02ca:
        r0 = move-exception;
        throw r0;
    L_0x02cc:
        r0 = move-exception;
        throw r0;
    L_0x02ce:
        r0 = move-exception;
        throw r0;
    L_0x02d0:
        r0 = move-exception;
        throw r0;
    L_0x02d2:
        r0 = move-exception;
        throw r0;
    L_0x02d4:
        r0 = move-exception;
        throw r0;
    L_0x02d6:
        r0 = move-exception;
        throw r0;
    L_0x02d8:
        r0 = move-exception;
        throw r0;
    L_0x02da:
        r0 = move-exception;
        throw r0;
    L_0x02dc:
        r0 = move-exception;
        throw r0;
    L_0x02de:
        r0 = move-exception;
        throw r0;
    L_0x02e0:
        r0 = move-exception;
        throw r0;
    L_0x02e2:
        r0 = move-exception;
        throw r0;
    L_0x02e4:
        r0 = move-exception;
        throw r0;
    L_0x02e6:
        r0 = r2;
        goto L_0x01cb;
    L_0x02e9:
        r3 = r0;
        goto L_0x010b;
    L_0x02ec:
        r3 = r0;
        goto L_0x00de;
    L_0x02ef:
        r2 = r0;
        goto L_0x00fd;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.dj.<init>(com.google.I, com.google.aC):void");
    }

    public static dj a(byte[] bArr) {
        return (dj) s.a(bArr);
    }

    public String l() {
        Object obj = this.f;
        if (obj instanceof String) {
            return (String) obj;
        }
        g2 g2Var = (g2) obj;
        String f = g2Var.f();
        if (g2Var.i()) {
            this.f = f;
        }
        return f;
    }

    protected az a(b1 b1Var) {
        return new az(b1Var, null);
    }

    private dj(ax axVar) {
        super(axVar);
        this.h = (byte) -1;
        this.e = -1;
        this.D = axVar.b();
    }

    public List A() {
        return this.x;
    }

    public d6 i(int i) {
        return (d6) this.w.get(i);
    }

    static List a(dj djVar) {
        return djVar.v;
    }

    public List q() {
        return this.F;
    }

    public ei a(int i) {
        return (ei) this.w.get(i);
    }

    public bn G() {
        return this.g;
    }

    static Object e(dj djVar) {
        return djVar.j;
    }

    public aJ a() {
        return F();
    }

    private dj(boolean z) {
        this.h = (byte) -1;
        this.e = -1;
        this.D = eS.e();
    }

    public eb c() {
        return C();
    }

    public final eS b() {
        return this.D;
    }

    public List D() {
        return this.m;
    }

    public int l(int i) {
        return ((Integer) this.F.get(i)).intValue();
    }

    public List a() {
        return this.n;
    }

    public dU g(int i) {
        return (dU) this.n.get(i);
    }

    public List p() {
        return this.v;
    }

    public static az m() {
        return az.c();
    }

    public eR c() {
        return s;
    }

    public int h() {
        return this.n.size();
    }

    public int d() {
        int i = 0;
        boolean z = dy.b;
        int i2 = this.e;
        if (i2 != -1) {
            return i2;
        }
        if ((this.y & 1) == l) {
            i2 = bF.b((int) l, v()) + 0;
        } else {
            i2 = 0;
        }
        if ((this.y & 2) == z) {
            i2 += bF.b((int) z, w());
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.x.size()) {
            i4 += bF.a(this.x.a(i3));
            i3++;
            if (z) {
                break;
            }
        }
        i3 = 0;
        i4 = (i2 + i4) + (A().size() * 1);
        while (i3 < this.n.size()) {
            i4 += bF.a((int) A, (a1) this.n.get(i3));
            i2 = i3 + 1;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i3 = 0;
        while (i3 < this.m.size()) {
            i4 += bF.a((int) q, (a1) this.m.get(i3));
            i2 = i3 + 1;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i3 = 0;
        while (i3 < this.v.size()) {
            i4 += bF.a((int) r, (a1) this.v.get(i3));
            i2 = i3 + 1;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i3 = 0;
        while (i3 < this.w.size()) {
            i4 += bF.a((int) B, (a1) this.w.get(i3));
            i2 = i3 + 1;
            if (z) {
                break;
            }
            i3 = i2;
        }
        if ((this.y & 4) == A) {
            i4 += bF.a((int) E, this.i);
        }
        if ((this.y & 8) == E) {
            i4 += bF.a((int) o, this.g);
        }
        i3 = 0;
        int i5 = 0;
        while (i3 < this.F.size()) {
            i5 += bF.p(((Integer) this.F.get(i3)).intValue());
            i2 = i3 + 1;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i4 = (i4 + i5) + (q().size() * 1);
        i3 = 0;
        while (i < this.k.size()) {
            i2 = bF.p(((Integer) this.k.get(i)).intValue()) + i3;
            i++;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = i3;
        i2 = ((i2 + i4) + (J().size() * 1)) + b().d();
        this.e = i2;
        return i2;
    }

    public boolean s() {
        return (this.y & 8) == E;
    }

    static List c(dj djVar, List list) {
        djVar.m = list;
        return list;
    }

    static List b(dj djVar, List list) {
        djVar.k = list;
        return list;
    }

    public int b() {
        return this.v.size();
    }

    public bi b(int i) {
        return (bi) this.v.get(i);
    }

    static List h(dj djVar) {
        return djVar.k;
    }

    public int g() {
        return this.m.size();
    }

    static Object b(dj djVar, Object obj) {
        djVar.j = obj;
        return obj;
    }

    dj(ax axVar, gY gYVar) {
        this(axVar);
    }

    public static dj a(InputStream inputStream) {
        return (dj) s.a(inputStream);
    }

    static c1 d(dj djVar) {
        return djVar.x;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public cj b() {
        return F();
    }

    static List g(dj djVar) {
        return djVar.w;
    }

    public static final M t() {
        return cN.I();
    }

    public static dj a(I i, aC aCVar) {
        return (dj) s.b(i, aCVar);
    }

    protected er b() {
        return cN.b().a(dj.class, az.class);
    }

    dj(I i, aC aCVar, gY gYVar) {
        this(i, aCVar);
    }

    public static dj a(I i) {
        return (dj) s.a(i);
    }

    public static dj a(g2 g2Var) {
        return (dj) s.a(g2Var);
    }

    public int r() {
        return this.k.size();
    }

    public B e(int i) {
        return (B) this.m.get(i);
    }

    public int u() {
        return this.w.size();
    }

    public List J() {
        return this.k;
    }

    public static az c(dj djVar) {
        return m().a(djVar);
    }

    public List I() {
        return this.v;
    }

    public String f() {
        Object obj = this.j;
        if (obj instanceof String) {
            return (String) obj;
        }
        g2 g2Var = (g2) obj;
        String f = g2Var.f();
        if (g2Var.i()) {
            this.j = f;
        }
        return f;
    }

    static c1 a(dj djVar, c1 c1Var) {
        djVar.x = c1Var;
        return c1Var;
    }

    static List i(dj djVar) {
        return djVar.n;
    }

    protected cj a(b1 b1Var) {
        return a(b1Var);
    }

    public List y() {
        return this.w;
    }

    static eW a(dj djVar, eW eWVar) {
        djVar.g = eWVar;
        return eWVar;
    }

    public static dj k() {
        return p;
    }

    public String f(int i) {
        return (String) this.x.get(i);
    }

    public d4 k(int i) {
        return (d4) this.m.get(i);
    }

    public az F() {
        return c(this);
    }

    public static dj b(InputStream inputStream, aC aCVar) {
        return (dj) s.b(inputStream, aCVar);
    }

    public List o() {
        return this.w;
    }

    public int h(int i) {
        return ((Integer) this.k.get(i)).intValue();
    }

    public dj C() {
        return p;
    }

    static List f(dj djVar, List list) {
        djVar.F = list;
        return list;
    }

    static {
        s = new l();
        p = new dj(true);
        p.L();
    }

    public void a(bF bFVar) {
        int i = 0;
        boolean z = dy.b;
        d();
        if ((this.y & 1) == l) {
            bFVar.a((int) l, v());
        }
        if ((this.y & 2) == z) {
            bFVar.a((int) z, w());
        }
        int i2 = 0;
        while (i2 < this.x.size()) {
            bFVar.a((int) C, this.x.a(i2));
            i2++;
            if (z) {
                break;
            }
        }
        int i3 = 0;
        while (i3 < this.n.size()) {
            bFVar.d((int) A, (a1) this.n.get(i3));
            i2 = i3 + 1;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i3 = 0;
        while (i3 < this.m.size()) {
            bFVar.d((int) q, (a1) this.m.get(i3));
            i2 = i3 + 1;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i3 = 0;
        while (i3 < this.v.size()) {
            bFVar.d((int) r, (a1) this.v.get(i3));
            i2 = i3 + 1;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i3 = 0;
        while (i3 < this.w.size()) {
            bFVar.d((int) B, (a1) this.w.get(i3));
            i2 = i3 + 1;
            if (z) {
                break;
            }
            i3 = i2;
        }
        if ((this.y & 4) == A) {
            bFVar.d((int) E, this.i);
        }
        if ((this.y & 8) == E) {
            bFVar.d((int) o, this.g);
        }
        i3 = 0;
        while (i3 < this.F.size()) {
            bFVar.c((int) u, ((Integer) this.F.get(i3)).intValue());
            i2 = i3 + 1;
            if (z) {
                break;
            }
            i3 = i2;
        }
        while (i < this.k.size()) {
            bFVar.c((int) t, ((Integer) this.k.get(i)).intValue());
            i++;
            if (z) {
                break;
            }
        }
        b().a(bFVar);
    }

    static List a(dj djVar, List list) {
        djVar.w = list;
        return list;
    }

    static eg a(dj djVar, eg egVar) {
        djVar.i = egVar;
        return egVar;
    }

    static List e(dj djVar, List list) {
        djVar.n = list;
        return list;
    }

    static List d(dj djVar, List list) {
        djVar.v = list;
        return list;
    }

    public d7 d(int i) {
        return (d7) this.v.get(i);
    }

    public int e() {
        return this.x.size();
    }

    public int n() {
        return this.F.size();
    }

    public static dj b(InputStream inputStream) {
        return (dj) s.b(inputStream);
    }

    public P j(int i) {
        return (P) this.n.get(i);
    }

    public boolean j() {
        return (this.y & 2) == z;
    }

    public boolean c() {
        return (this.y & 4) == A;
    }

    public eW i() {
        return this.g;
    }

    static Object a(dj djVar, Object obj) {
        djVar.f = obj;
        return obj;
    }

    static int a(dj djVar, int i) {
        djVar.y = i;
        return i;
    }

    public g2 w() {
        Object obj = this.f;
        if (!(obj instanceof String)) {
            return (g2) obj;
        }
        g2 a = g2.a((String) obj);
        this.f = a;
        return a;
    }

    static List f(dj djVar) {
        return djVar.F;
    }

    public g2 v() {
        Object obj = this.j;
        if (!(obj instanceof String)) {
            return (g2) obj;
        }
        g2 a = g2.a((String) obj);
        this.j = a;
        return a;
    }
}
