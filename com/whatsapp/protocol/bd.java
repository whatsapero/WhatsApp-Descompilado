package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class bd {
    private static final String F;
    private Integer A;
    private Boolean B;
    private String C;
    private String D;
    private byte[] E;
    private Boolean a;
    private String b;
    private String c;
    private Integer d;
    private Double e;
    private Long f;
    private Integer g;
    private String h;
    private Integer i;
    private String j;
    private String k;
    private Integer l;
    private Long m;
    private String n;
    private Boolean o;
    private Double p;
    private String q;
    private b r;
    private String s;
    private String t;
    private Byte u;
    private String v;
    private String w;
    private Integer x;
    private byte[] y;
    private String z;

    static {
        char[] toCharArray = "Y1U!JZ?\u0006 FE-O FPxV LD=T&Z\u0014:C4LF=\u0006;MG,G<W]9R;MSxH7T\u00141H1LY1H5\u0003Y=U!BS=".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 52;
                    break;
                case ay.f /*1*/:
                    i2 = 88;
                    break;
                case ay.n /*2*/:
                    i2 = 38;
                    break;
                case ay.p /*3*/:
                    i2 = 82;
                    break;
                default:
                    i2 = 35;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        F = new String(cArr).intern();
    }

    public bd f(String str) {
        this.k = str;
        return this;
    }

    public bd b(Double d) {
        this.p = d;
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.protocol.bd a() {
        /*
        r5_this = this;
        r0 = r5.w;	 Catch:{ UnsupportedOperationException -> 0x0016 }
        if (r0 == 0) goto L_0x000c;
    L_0x0004:
        r0 = r5.a;	 Catch:{ UnsupportedOperationException -> 0x0018 }
        if (r0 == 0) goto L_0x000c;
    L_0x0008:
        r0 = r5.n;	 Catch:{ UnsupportedOperationException -> 0x0014 }
        if (r0 != 0) goto L_0x001a;
    L_0x000c:
        r0 = new java.lang.UnsupportedOperationException;	 Catch:{ UnsupportedOperationException -> 0x0014 }
        r1 = F;	 Catch:{ UnsupportedOperationException -> 0x0014 }
        r0.<init>(r1);	 Catch:{ UnsupportedOperationException -> 0x0014 }
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0014 }
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0018 }
    L_0x0018:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0014 }
    L_0x001a:
        r0 = new com.whatsapp.protocol.b;
        r1 = new com.whatsapp.protocol.m;
        r2 = r5.w;
        r3 = r5.a;
        r3 = r3.booleanValue();
        r4 = r5.n;
        r1.<init>(r2, r3, r4);
        r0.<init>(r1);
        r5.r = r0;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.bd.a():com.whatsapp.protocol.bd");
    }

    public bd a(int i) {
        this.x = new Integer(i);
        return this;
    }

    public bd k(String str) {
        this.t = str;
        return this;
    }

    public bd a(Double d) {
        this.e = d;
        return this;
    }

    public bd b(String str) {
        this.s = str;
        return this;
    }

    public bd e(String str) {
        this.j = str;
        return this;
    }

    public bd l(String str) {
        this.v = str;
        return this;
    }

    public bd b(byte[] bArr) {
        this.E = bArr;
        return this;
    }

    public bd d(int i) {
        this.g = new Integer(i);
        return this;
    }

    public bd a(Boolean bool) {
        this.o = bool;
        return this;
    }

    public bd j(String str) {
        this.D = str;
        return this;
    }

    public bd g(String str) {
        this.b = str;
        return this;
    }

    public bd a(long j) {
        this.f = new Long(j);
        return this;
    }

    public bd a(byte b) {
        this.u = new Byte(b);
        return this;
    }

    public Byte b() {
        return this.u;
    }

    public bd m(String str) {
        this.n = str;
        return this;
    }

    public bd h(String str) {
        this.h = str;
        return this;
    }

    public bd b(Boolean bool) {
        this.B = bool;
        return this;
    }

    public bd b(long j) {
        this.m = new Long(j);
        return this;
    }

    public bd a(Integer num) {
        this.i = num;
        return this;
    }

    public bd a(byte[] bArr) {
        this.y = bArr;
        return this;
    }

    public bd c(int i) {
        this.A = new Integer(i);
        return this;
    }

    public bd c(String str) {
        this.w = str;
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.protocol.b c() {
        /*
        r5_this = this;
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x0006 }
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = 0;
    L_0x0005:
        return r0;
    L_0x0006:
        r0 = move-exception;
        throw r0;
    L_0x0008:
        r0 = r5.w;	 Catch:{ UnsupportedOperationException -> 0x016d }
        if (r0 == 0) goto L_0x0027;
    L_0x000c:
        r0 = r5.a;	 Catch:{ UnsupportedOperationException -> 0x016f }
        if (r0 == 0) goto L_0x0027;
    L_0x0010:
        r0 = r5.n;	 Catch:{ UnsupportedOperationException -> 0x0171 }
        if (r0 == 0) goto L_0x0027;
    L_0x0014:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x0171 }
        r1 = new com.whatsapp.protocol.m;	 Catch:{ UnsupportedOperationException -> 0x0171 }
        r2 = r5.w;	 Catch:{ UnsupportedOperationException -> 0x0171 }
        r3 = r5.a;	 Catch:{ UnsupportedOperationException -> 0x0171 }
        r3 = r3.booleanValue();	 Catch:{ UnsupportedOperationException -> 0x0171 }
        r4 = r5.n;	 Catch:{ UnsupportedOperationException -> 0x0171 }
        r1.<init>(r2, r3, r4);	 Catch:{ UnsupportedOperationException -> 0x0171 }
        r0.e = r1;	 Catch:{ UnsupportedOperationException -> 0x0171 }
    L_0x0027:
        r0 = r5.b;	 Catch:{ UnsupportedOperationException -> 0x0173 }
        if (r0 == 0) goto L_0x0031;
    L_0x002b:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x0173 }
        r1 = r5.b;	 Catch:{ UnsupportedOperationException -> 0x0173 }
        r0.F = r1;	 Catch:{ UnsupportedOperationException -> 0x0173 }
    L_0x0031:
        r0 = r5.c;	 Catch:{ UnsupportedOperationException -> 0x0175 }
        if (r0 == 0) goto L_0x003b;
    L_0x0035:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x0175 }
        r1 = r5.c;	 Catch:{ UnsupportedOperationException -> 0x0175 }
        r0.m = r1;	 Catch:{ UnsupportedOperationException -> 0x0175 }
    L_0x003b:
        r0 = r5.v;	 Catch:{ UnsupportedOperationException -> 0x0177 }
        if (r0 == 0) goto L_0x0046;
    L_0x003f:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x0177 }
        r1 = r5.v;	 Catch:{ UnsupportedOperationException -> 0x0177 }
        r0.b(r1);	 Catch:{ UnsupportedOperationException -> 0x0177 }
    L_0x0046:
        r0 = r5.y;	 Catch:{ UnsupportedOperationException -> 0x0179 }
        if (r0 == 0) goto L_0x0051;
    L_0x004a:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x0179 }
        r1 = r5.y;	 Catch:{ UnsupportedOperationException -> 0x0179 }
        r0.b(r1);	 Catch:{ UnsupportedOperationException -> 0x0179 }
    L_0x0051:
        r0 = r5.E;	 Catch:{ UnsupportedOperationException -> 0x017b }
        if (r0 == 0) goto L_0x005c;
    L_0x0055:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x017b }
        r1 = r5.E;	 Catch:{ UnsupportedOperationException -> 0x017b }
        r0.a(r1);	 Catch:{ UnsupportedOperationException -> 0x017b }
    L_0x005c:
        r0 = r5.l;	 Catch:{ UnsupportedOperationException -> 0x017d }
        if (r0 == 0) goto L_0x006b;
    L_0x0060:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x017d }
        r1 = r5.l;	 Catch:{ UnsupportedOperationException -> 0x017d }
        r1 = r1.intValue();	 Catch:{ UnsupportedOperationException -> 0x017d }
        r0.a(r1);	 Catch:{ UnsupportedOperationException -> 0x017d }
    L_0x006b:
        r0 = r5.g;	 Catch:{ UnsupportedOperationException -> 0x017f }
        if (r0 == 0) goto L_0x0079;
    L_0x006f:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x017f }
        r1 = r5.g;	 Catch:{ UnsupportedOperationException -> 0x017f }
        r1 = r1.intValue();	 Catch:{ UnsupportedOperationException -> 0x017f }
        r0.I = r1;	 Catch:{ UnsupportedOperationException -> 0x017f }
    L_0x0079:
        r0 = r5.k;	 Catch:{ UnsupportedOperationException -> 0x0181 }
        if (r0 == 0) goto L_0x0083;
    L_0x007d:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x0181 }
        r1 = r5.k;	 Catch:{ UnsupportedOperationException -> 0x0181 }
        r0.q = r1;	 Catch:{ UnsupportedOperationException -> 0x0181 }
    L_0x0083:
        r0 = r5.A;	 Catch:{ UnsupportedOperationException -> 0x0183 }
        if (r0 == 0) goto L_0x0091;
    L_0x0087:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x0183 }
        r1 = r5.A;	 Catch:{ UnsupportedOperationException -> 0x0183 }
        r1 = r1.intValue();	 Catch:{ UnsupportedOperationException -> 0x0183 }
        r0.O = r1;	 Catch:{ UnsupportedOperationException -> 0x0183 }
    L_0x0091:
        r0 = r5.d;	 Catch:{ UnsupportedOperationException -> 0x0185 }
        if (r0 == 0) goto L_0x009f;
    L_0x0095:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x0185 }
        r1 = r5.d;	 Catch:{ UnsupportedOperationException -> 0x0185 }
        r1 = r1.intValue();	 Catch:{ UnsupportedOperationException -> 0x0185 }
        r0.w = r1;	 Catch:{ UnsupportedOperationException -> 0x0185 }
    L_0x009f:
        r0 = r5.m;	 Catch:{ UnsupportedOperationException -> 0x0187 }
        if (r0 == 0) goto L_0x00ad;
    L_0x00a3:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x0187 }
        r1 = r5.m;	 Catch:{ UnsupportedOperationException -> 0x0187 }
        r2 = r1.longValue();	 Catch:{ UnsupportedOperationException -> 0x0187 }
        r0.D = r2;	 Catch:{ UnsupportedOperationException -> 0x0187 }
    L_0x00ad:
        r0 = r5.i;	 Catch:{ UnsupportedOperationException -> 0x0189 }
        if (r0 == 0) goto L_0x00b7;
    L_0x00b1:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x0189 }
        r1 = r5.i;	 Catch:{ UnsupportedOperationException -> 0x0189 }
        r0.r = r1;	 Catch:{ UnsupportedOperationException -> 0x0189 }
    L_0x00b7:
        r0 = r5.u;	 Catch:{ UnsupportedOperationException -> 0x018b }
        if (r0 == 0) goto L_0x00c5;
    L_0x00bb:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x018b }
        r1 = r5.u;	 Catch:{ UnsupportedOperationException -> 0x018b }
        r1 = r1.byteValue();	 Catch:{ UnsupportedOperationException -> 0x018b }
        r0.j = r1;	 Catch:{ UnsupportedOperationException -> 0x018b }
    L_0x00c5:
        r0 = r5.f;	 Catch:{ UnsupportedOperationException -> 0x018d }
        if (r0 == 0) goto L_0x00d3;
    L_0x00c9:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x018d }
        r1 = r5.f;	 Catch:{ UnsupportedOperationException -> 0x018d }
        r2 = r1.longValue();	 Catch:{ UnsupportedOperationException -> 0x018d }
        r0.k = r2;	 Catch:{ UnsupportedOperationException -> 0x018d }
    L_0x00d3:
        r0 = r5.C;	 Catch:{ UnsupportedOperationException -> 0x018f }
        if (r0 == 0) goto L_0x00dd;
    L_0x00d7:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x018f }
        r1 = r5.C;	 Catch:{ UnsupportedOperationException -> 0x018f }
        r0.z = r1;	 Catch:{ UnsupportedOperationException -> 0x018f }
    L_0x00dd:
        r0 = r5.x;	 Catch:{ UnsupportedOperationException -> 0x0191 }
        if (r0 == 0) goto L_0x00eb;
    L_0x00e1:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r1 = r5.x;	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r1 = r1.intValue();	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r0.p = r1;	 Catch:{ UnsupportedOperationException -> 0x0191 }
    L_0x00eb:
        r0 = r5.z;	 Catch:{ UnsupportedOperationException -> 0x0193 }
        if (r0 == 0) goto L_0x00f5;
    L_0x00ef:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r1 = r5.z;	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r0.t = r1;	 Catch:{ UnsupportedOperationException -> 0x0193 }
    L_0x00f5:
        r0 = r5.s;	 Catch:{ UnsupportedOperationException -> 0x0195 }
        if (r0 == 0) goto L_0x00ff;
    L_0x00f9:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x0195 }
        r1 = r5.s;	 Catch:{ UnsupportedOperationException -> 0x0195 }
        r0.o = r1;	 Catch:{ UnsupportedOperationException -> 0x0195 }
    L_0x00ff:
        r0 = r5.j;	 Catch:{ UnsupportedOperationException -> 0x0197 }
        if (r0 == 0) goto L_0x0109;
    L_0x0103:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x0197 }
        r1 = r5.j;	 Catch:{ UnsupportedOperationException -> 0x0197 }
        r0.s = r1;	 Catch:{ UnsupportedOperationException -> 0x0197 }
    L_0x0109:
        r0 = r5.h;	 Catch:{ UnsupportedOperationException -> 0x0199 }
        if (r0 == 0) goto L_0x0113;
    L_0x010d:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x0199 }
        r1 = r5.h;	 Catch:{ UnsupportedOperationException -> 0x0199 }
        r0.H = r1;	 Catch:{ UnsupportedOperationException -> 0x0199 }
    L_0x0113:
        r0 = r5.q;	 Catch:{ UnsupportedOperationException -> 0x019b }
        if (r0 == 0) goto L_0x011d;
    L_0x0117:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x019b }
        r1 = r5.q;	 Catch:{ UnsupportedOperationException -> 0x019b }
        r0.v = r1;	 Catch:{ UnsupportedOperationException -> 0x019b }
    L_0x011d:
        r0 = r5.B;	 Catch:{ UnsupportedOperationException -> 0x019d }
        if (r0 == 0) goto L_0x012b;
    L_0x0121:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x019d }
        r1 = r5.B;	 Catch:{ UnsupportedOperationException -> 0x019d }
        r1 = r1.booleanValue();	 Catch:{ UnsupportedOperationException -> 0x019d }
        r0.N = r1;	 Catch:{ UnsupportedOperationException -> 0x019d }
    L_0x012b:
        r0 = r5.p;	 Catch:{ UnsupportedOperationException -> 0x019f }
        if (r0 == 0) goto L_0x0139;
    L_0x012f:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x019f }
        r1 = r5.p;	 Catch:{ UnsupportedOperationException -> 0x019f }
        r2 = r1.doubleValue();	 Catch:{ UnsupportedOperationException -> 0x019f }
        r0.K = r2;	 Catch:{ UnsupportedOperationException -> 0x019f }
    L_0x0139:
        r0 = r5.e;	 Catch:{ UnsupportedOperationException -> 0x01a1 }
        if (r0 == 0) goto L_0x0147;
    L_0x013d:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x01a1 }
        r1 = r5.e;	 Catch:{ UnsupportedOperationException -> 0x01a1 }
        r2 = r1.doubleValue();	 Catch:{ UnsupportedOperationException -> 0x01a1 }
        r0.G = r2;	 Catch:{ UnsupportedOperationException -> 0x01a1 }
    L_0x0147:
        r0 = r5.t;	 Catch:{ UnsupportedOperationException -> 0x01a3 }
        if (r0 == 0) goto L_0x0151;
    L_0x014b:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x01a3 }
        r1 = r5.t;	 Catch:{ UnsupportedOperationException -> 0x01a3 }
        r0.J = r1;	 Catch:{ UnsupportedOperationException -> 0x01a3 }
    L_0x0151:
        r0 = r5.o;	 Catch:{ UnsupportedOperationException -> 0x01a5 }
        if (r0 == 0) goto L_0x015f;
    L_0x0155:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x01a5 }
        r1 = r5.o;	 Catch:{ UnsupportedOperationException -> 0x01a5 }
        r1 = r1.booleanValue();	 Catch:{ UnsupportedOperationException -> 0x01a5 }
        r0.l = r1;	 Catch:{ UnsupportedOperationException -> 0x01a5 }
    L_0x015f:
        r0 = r5.D;	 Catch:{ UnsupportedOperationException -> 0x01a7 }
        if (r0 == 0) goto L_0x0169;
    L_0x0163:
        r0 = r5.r;	 Catch:{ UnsupportedOperationException -> 0x01a7 }
        r1 = r5.D;	 Catch:{ UnsupportedOperationException -> 0x01a7 }
        r0.u = r1;	 Catch:{ UnsupportedOperationException -> 0x01a7 }
    L_0x0169:
        r0 = r5.r;
        goto L_0x0005;
    L_0x016d:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x016f }
    L_0x016f:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0171 }
    L_0x0171:
        r0 = move-exception;
        throw r0;
    L_0x0173:
        r0 = move-exception;
        throw r0;
    L_0x0175:
        r0 = move-exception;
        throw r0;
    L_0x0177:
        r0 = move-exception;
        throw r0;
    L_0x0179:
        r0 = move-exception;
        throw r0;
    L_0x017b:
        r0 = move-exception;
        throw r0;
    L_0x017d:
        r0 = move-exception;
        throw r0;
    L_0x017f:
        r0 = move-exception;
        throw r0;
    L_0x0181:
        r0 = move-exception;
        throw r0;
    L_0x0183:
        r0 = move-exception;
        throw r0;
    L_0x0185:
        r0 = move-exception;
        throw r0;
    L_0x0187:
        r0 = move-exception;
        throw r0;
    L_0x0189:
        r0 = move-exception;
        throw r0;
    L_0x018b:
        r0 = move-exception;
        throw r0;
    L_0x018d:
        r0 = move-exception;
        throw r0;
    L_0x018f:
        r0 = move-exception;
        throw r0;
    L_0x0191:
        r0 = move-exception;
        throw r0;
    L_0x0193:
        r0 = move-exception;
        throw r0;
    L_0x0195:
        r0 = move-exception;
        throw r0;
    L_0x0197:
        r0 = move-exception;
        throw r0;
    L_0x0199:
        r0 = move-exception;
        throw r0;
    L_0x019b:
        r0 = move-exception;
        throw r0;
    L_0x019d:
        r0 = move-exception;
        throw r0;
    L_0x019f:
        r0 = move-exception;
        throw r0;
    L_0x01a1:
        r0 = move-exception;
        throw r0;
    L_0x01a3:
        r0 = move-exception;
        throw r0;
    L_0x01a5:
        r0 = move-exception;
        throw r0;
    L_0x01a7:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.bd.c():com.whatsapp.protocol.b");
    }

    public bd a(String str) {
        this.C = str;
        return this;
    }

    public bd b(int i) {
        this.l = new Integer(i);
        return this;
    }

    public bd a(boolean z) {
        Boolean bool;
        if (z) {
            try {
                bool = Boolean.TRUE;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }
        bool = Boolean.FALSE;
        this.a = bool;
        return this;
    }

    public bd d(String str) {
        this.q = str;
        return this;
    }

    public bd i(String str) {
        this.z = str;
        return this;
    }

    public bd e(int i) {
        this.d = new Integer(i);
        return this;
    }
}
