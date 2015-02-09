package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class dW implements dh, Comparable, eY {
    private static final bJ[] i;
    private static final String[] z;
    private M a;
    private final String b;
    private aa c;
    private final int d;
    private M e;
    private final M f;
    private final cn g;
    private d6 h;
    private dH j;
    private Object k;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
        r7_this = this;
        r6 = 34;
        r5 = 0;
        r0 = r7.h;
        r0 = r0.f();
        if (r0 == 0) goto L_0x009f;
    L_0x000b:
        r0 = r7.g;
        r0 = com.google.cn.a(r0);
        r1 = r7.h;
        r1 = r1.u();
        r2 = com.google.fo.TYPES_ONLY;
        r0 = r0.a(r1, r7, r2);
        r1 = r0 instanceof com.google.M;	 Catch:{ ba -> 0x004b }
        if (r1 != 0) goto L_0x004d;
    L_0x0021:
        r0 = new com.google.fc;	 Catch:{ ba -> 0x004b }
        r1 = new java.lang.StringBuilder;	 Catch:{ ba -> 0x004b }
        r1.<init>();	 Catch:{ ba -> 0x004b }
        r2 = 34;
        r1 = r1.append(r2);	 Catch:{ ba -> 0x004b }
        r2 = r7.h;	 Catch:{ ba -> 0x004b }
        r2 = r2.u();	 Catch:{ ba -> 0x004b }
        r1 = r1.append(r2);	 Catch:{ ba -> 0x004b }
        r2 = z;	 Catch:{ ba -> 0x004b }
        r3 = 30;
        r2 = r2[r3];	 Catch:{ ba -> 0x004b }
        r1 = r1.append(r2);	 Catch:{ ba -> 0x004b }
        r1 = r1.toString();	 Catch:{ ba -> 0x004b }
        r2 = 0;
        r0.<init>(r7, r1, r2);	 Catch:{ ba -> 0x004b }
        throw r0;	 Catch:{ ba -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;
    L_0x004d:
        r0 = (com.google.M) r0;	 Catch:{ ba -> 0x009d }
        r7.e = r0;	 Catch:{ ba -> 0x009d }
        r0 = r7.g();	 Catch:{ ba -> 0x009d }
        r1 = r7.e();	 Catch:{ ba -> 0x009d }
        r0 = r0.b(r1);	 Catch:{ ba -> 0x009d }
        if (r0 != 0) goto L_0x009f;
    L_0x005f:
        r0 = new com.google.fc;	 Catch:{ ba -> 0x009d }
        r1 = new java.lang.StringBuilder;	 Catch:{ ba -> 0x009d }
        r1.<init>();	 Catch:{ ba -> 0x009d }
        r2 = 34;
        r1 = r1.append(r2);	 Catch:{ ba -> 0x009d }
        r2 = r7.g();	 Catch:{ ba -> 0x009d }
        r2 = r2.b();	 Catch:{ ba -> 0x009d }
        r1 = r1.append(r2);	 Catch:{ ba -> 0x009d }
        r2 = z;	 Catch:{ ba -> 0x009d }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ ba -> 0x009d }
        r1 = r1.append(r2);	 Catch:{ ba -> 0x009d }
        r2 = r7.e();	 Catch:{ ba -> 0x009d }
        r1 = r1.append(r2);	 Catch:{ ba -> 0x009d }
        r2 = z;	 Catch:{ ba -> 0x009d }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ ba -> 0x009d }
        r1 = r1.append(r2);	 Catch:{ ba -> 0x009d }
        r1 = r1.toString();	 Catch:{ ba -> 0x009d }
        r2 = 0;
        r0.<init>(r7, r1, r2);	 Catch:{ ba -> 0x009d }
        throw r0;	 Catch:{ ba -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;
    L_0x009f:
        r0 = r7.h;
        r0 = r0.t();
        if (r0 == 0) goto L_0x01bb;
    L_0x00a7:
        r0 = r7.g;
        r0 = com.google.cn.a(r0);
        r1 = r7.h;
        r1 = r1.w();
        r2 = com.google.fo.TYPES_ONLY;
        r0 = r0.a(r1, r7, r2);
        r1 = r7.h;	 Catch:{ ba -> 0x0101 }
        r1 = r1.e();	 Catch:{ ba -> 0x0101 }
        if (r1 != 0) goto L_0x00c9;
    L_0x00c1:
        r1 = r0 instanceof com.google.M;	 Catch:{ ba -> 0x0101 }
        if (r1 == 0) goto L_0x0105;
    L_0x00c5:
        r1 = com.google.dH.MESSAGE;	 Catch:{ ba -> 0x0103 }
        r7.j = r1;	 Catch:{ ba -> 0x0103 }
    L_0x00c9:
        r1 = r7.f();	 Catch:{ ba -> 0x0137 }
        r2 = com.google.f0.MESSAGE;	 Catch:{ ba -> 0x0137 }
        if (r1 != r2) goto L_0x0154;
    L_0x00d1:
        r1 = r0 instanceof com.google.M;	 Catch:{ ba -> 0x0137 }
        if (r1 != 0) goto L_0x0139;
    L_0x00d5:
        r0 = new com.google.fc;	 Catch:{ ba -> 0x00ff }
        r1 = new java.lang.StringBuilder;	 Catch:{ ba -> 0x00ff }
        r1.<init>();	 Catch:{ ba -> 0x00ff }
        r2 = 34;
        r1 = r1.append(r2);	 Catch:{ ba -> 0x00ff }
        r2 = r7.h;	 Catch:{ ba -> 0x00ff }
        r2 = r2.w();	 Catch:{ ba -> 0x00ff }
        r1 = r1.append(r2);	 Catch:{ ba -> 0x00ff }
        r2 = z;	 Catch:{ ba -> 0x00ff }
        r3 = 29;
        r2 = r2[r3];	 Catch:{ ba -> 0x00ff }
        r1 = r1.append(r2);	 Catch:{ ba -> 0x00ff }
        r1 = r1.toString();	 Catch:{ ba -> 0x00ff }
        r2 = 0;
        r0.<init>(r7, r1, r2);	 Catch:{ ba -> 0x00ff }
        throw r0;	 Catch:{ ba -> 0x00ff }
    L_0x00ff:
        r0 = move-exception;
        throw r0;
    L_0x0101:
        r0 = move-exception;
        throw r0;	 Catch:{ ba -> 0x0103 }
    L_0x0103:
        r0 = move-exception;
        throw r0;
    L_0x0105:
        r1 = r0 instanceof com.google.aa;	 Catch:{ ba -> 0x010e }
        if (r1 == 0) goto L_0x0110;
    L_0x0109:
        r1 = com.google.dH.ENUM;	 Catch:{ ba -> 0x010e }
        r7.j = r1;	 Catch:{ ba -> 0x010e }
        goto L_0x00c9;
    L_0x010e:
        r0 = move-exception;
        throw r0;
    L_0x0110:
        r0 = new com.google.fc;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1 = r1.append(r6);
        r2 = r7.h;
        r2 = r2.w();
        r1 = r1.append(r2);
        r2 = z;
        r3 = 20;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r7, r1, r5);
        throw r0;
    L_0x0137:
        r0 = move-exception;
        throw r0;	 Catch:{ ba -> 0x00ff }
    L_0x0139:
        r0 = (com.google.M) r0;	 Catch:{ ba -> 0x0152 }
        r7.a = r0;	 Catch:{ ba -> 0x0152 }
        r0 = r7.h;	 Catch:{ ba -> 0x0152 }
        r0 = r0.p();	 Catch:{ ba -> 0x0152 }
        if (r0 == 0) goto L_0x0192;
    L_0x0145:
        r0 = new com.google.fc;	 Catch:{ ba -> 0x0152 }
        r1 = z;	 Catch:{ ba -> 0x0152 }
        r2 = 17;
        r1 = r1[r2];	 Catch:{ ba -> 0x0152 }
        r2 = 0;
        r0.<init>(r7, r1, r2);	 Catch:{ ba -> 0x0152 }
        throw r0;	 Catch:{ ba -> 0x0152 }
    L_0x0152:
        r0 = move-exception;
        throw r0;
    L_0x0154:
        r1 = r7.f();	 Catch:{ ba -> 0x018c }
        r2 = com.google.f0.ENUM;	 Catch:{ ba -> 0x018c }
        if (r1 != r2) goto L_0x01af;
    L_0x015c:
        r1 = r0 instanceof com.google.aa;	 Catch:{ ba -> 0x018c }
        if (r1 != 0) goto L_0x018e;
    L_0x0160:
        r0 = new com.google.fc;	 Catch:{ ba -> 0x018a }
        r1 = new java.lang.StringBuilder;	 Catch:{ ba -> 0x018a }
        r1.<init>();	 Catch:{ ba -> 0x018a }
        r2 = 34;
        r1 = r1.append(r2);	 Catch:{ ba -> 0x018a }
        r2 = r7.h;	 Catch:{ ba -> 0x018a }
        r2 = r2.w();	 Catch:{ ba -> 0x018a }
        r1 = r1.append(r2);	 Catch:{ ba -> 0x018a }
        r2 = z;	 Catch:{ ba -> 0x018a }
        r3 = 24;
        r2 = r2[r3];	 Catch:{ ba -> 0x018a }
        r1 = r1.append(r2);	 Catch:{ ba -> 0x018a }
        r1 = r1.toString();	 Catch:{ ba -> 0x018a }
        r2 = 0;
        r0.<init>(r7, r1, r2);	 Catch:{ ba -> 0x018a }
        throw r0;	 Catch:{ ba -> 0x018a }
    L_0x018a:
        r0 = move-exception;
        throw r0;
    L_0x018c:
        r0 = move-exception;
        throw r0;	 Catch:{ ba -> 0x018a }
    L_0x018e:
        r0 = (com.google.aa) r0;
        r7.c = r0;
    L_0x0192:
        r0 = r7.h;	 Catch:{ ba -> 0x01dc }
        r0 = r0.p();	 Catch:{ ba -> 0x01dc }
        if (r0 == 0) goto L_0x0404;
    L_0x019a:
        r0 = r7.a();	 Catch:{ ba -> 0x01dc }
        if (r0 == 0) goto L_0x01de;
    L_0x01a0:
        r0 = new com.google.fc;	 Catch:{ ba -> 0x01ad }
        r1 = z;	 Catch:{ ba -> 0x01ad }
        r2 = 27;
        r1 = r1[r2];	 Catch:{ ba -> 0x01ad }
        r2 = 0;
        r0.<init>(r7, r1, r2);	 Catch:{ ba -> 0x01ad }
        throw r0;	 Catch:{ ba -> 0x01ad }
    L_0x01ad:
        r0 = move-exception;
        throw r0;
    L_0x01af:
        r0 = new com.google.fc;
        r1 = z;
        r2 = 25;
        r1 = r1[r2];
        r0.<init>(r7, r1, r5);
        throw r0;
    L_0x01bb:
        r0 = r7.f();	 Catch:{ ba -> 0x01da }
        r1 = com.google.f0.MESSAGE;	 Catch:{ ba -> 0x01da }
        if (r0 == r1) goto L_0x01cb;
    L_0x01c3:
        r0 = r7.f();	 Catch:{ ba -> 0x01da }
        r1 = com.google.f0.ENUM;	 Catch:{ ba -> 0x01da }
        if (r0 != r1) goto L_0x0192;
    L_0x01cb:
        r0 = new com.google.fc;	 Catch:{ ba -> 0x01d8 }
        r1 = z;	 Catch:{ ba -> 0x01d8 }
        r2 = 26;
        r1 = r1[r2];	 Catch:{ ba -> 0x01d8 }
        r2 = 0;
        r0.<init>(r7, r1, r2);	 Catch:{ ba -> 0x01d8 }
        throw r0;	 Catch:{ ba -> 0x01d8 }
    L_0x01d8:
        r0 = move-exception;
        throw r0;
    L_0x01da:
        r0 = move-exception;
        throw r0;	 Catch:{ ba -> 0x01d8 }
    L_0x01dc:
        r0 = move-exception;
        throw r0;	 Catch:{ ba -> 0x01ad }
    L_0x01de:
        r0 = com.google.bA.b;	 Catch:{ ba -> 0x0240 }
        r1 = r7.k();	 Catch:{ ba -> 0x0240 }
        r1 = r1.ordinal();	 Catch:{ ba -> 0x0240 }
        r0 = r0[r1];	 Catch:{ ba -> 0x0240 }
        switch(r0) {
            case 1: goto L_0x022f;
            case 2: goto L_0x022f;
            case 3: goto L_0x022f;
            case 4: goto L_0x026a;
            case 5: goto L_0x026a;
            case 6: goto L_0x027c;
            case 7: goto L_0x027c;
            case 8: goto L_0x027c;
            case 9: goto L_0x028e;
            case 10: goto L_0x028e;
            case 11: goto L_0x02a0;
            case 12: goto L_0x0308;
            case 13: goto L_0x0370;
            case 14: goto L_0x037e;
            case 15: goto L_0x0388;
            case 16: goto L_0x03b9;
            case 17: goto L_0x03f7;
            case 18: goto L_0x03f7;
            default: goto L_0x01ed;
        };
    L_0x01ed:
        r0 = r7.n();	 Catch:{ ba -> 0x0444 }
        if (r0 != 0) goto L_0x01fc;
    L_0x01f3:
        r0 = r7.g;	 Catch:{ ba -> 0x0444 }
        r0 = com.google.cn.a(r0);	 Catch:{ ba -> 0x0444 }
        r0.a(r7);	 Catch:{ ba -> 0x0444 }
    L_0x01fc:
        r0 = r7.e;	 Catch:{ ba -> 0x0446 }
        if (r0 == 0) goto L_0x045a;
    L_0x0200:
        r0 = r7.e;	 Catch:{ ba -> 0x0448 }
        r0 = r0.d();	 Catch:{ ba -> 0x0448 }
        r0 = r0.f();	 Catch:{ ba -> 0x0448 }
        if (r0 == 0) goto L_0x045a;
    L_0x020c:
        r0 = r7.n();	 Catch:{ ba -> 0x044a }
        if (r0 == 0) goto L_0x044e;
    L_0x0212:
        r0 = r7.h();	 Catch:{ ba -> 0x044c }
        if (r0 == 0) goto L_0x0220;
    L_0x0218:
        r0 = r7.k();	 Catch:{ ba -> 0x022d }
        r1 = com.google.dH.MESSAGE;	 Catch:{ ba -> 0x022d }
        if (r0 == r1) goto L_0x045a;
    L_0x0220:
        r0 = new com.google.fc;	 Catch:{ ba -> 0x022d }
        r1 = z;	 Catch:{ ba -> 0x022d }
        r2 = 14;
        r1 = r1[r2];	 Catch:{ ba -> 0x022d }
        r2 = 0;
        r0.<init>(r7, r1, r2);	 Catch:{ ba -> 0x022d }
        throw r0;	 Catch:{ ba -> 0x022d }
    L_0x022d:
        r0 = move-exception;
        throw r0;
    L_0x022f:
        r0 = r7.h;	 Catch:{ ba -> 0x0240 }
        r0 = r0.l();	 Catch:{ ba -> 0x0240 }
        r0 = com.google.fY.d(r0);	 Catch:{ ba -> 0x0240 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ ba -> 0x0240 }
        r7.k = r0;	 Catch:{ ba -> 0x0240 }
        goto L_0x01ed;
    L_0x0240:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0242 }
    L_0x0242:
        r0 = move-exception;
        r1 = new com.google.fc;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 19;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r7.h;
        r3 = r3.l();
        r2 = r2.append(r3);
        r2 = r2.append(r6);
        r2 = r2.toString();
        r1.<init>(r7, r2, r0, r5);
        throw r1;
    L_0x026a:
        r0 = r7.h;	 Catch:{ NumberFormatException -> 0x0242 }
        r0 = r0.l();	 Catch:{ NumberFormatException -> 0x0242 }
        r0 = com.google.fY.a(r0);	 Catch:{ NumberFormatException -> 0x0242 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0242 }
        r7.k = r0;	 Catch:{ NumberFormatException -> 0x0242 }
        goto L_0x01ed;
    L_0x027c:
        r0 = r7.h;	 Catch:{ NumberFormatException -> 0x0242 }
        r0 = r0.l();	 Catch:{ NumberFormatException -> 0x0242 }
        r0 = com.google.fY.b(r0);	 Catch:{ NumberFormatException -> 0x0242 }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0242 }
        r7.k = r0;	 Catch:{ NumberFormatException -> 0x0242 }
        goto L_0x01ed;
    L_0x028e:
        r0 = r7.h;	 Catch:{ NumberFormatException -> 0x0242 }
        r0 = r0.l();	 Catch:{ NumberFormatException -> 0x0242 }
        r0 = com.google.fY.c(r0);	 Catch:{ NumberFormatException -> 0x0242 }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0242 }
        r7.k = r0;	 Catch:{ NumberFormatException -> 0x0242 }
        goto L_0x01ed;
    L_0x02a0:
        r0 = r7.h;	 Catch:{ ba -> 0x02bc }
        r0 = r0.l();	 Catch:{ ba -> 0x02bc }
        r1 = z;	 Catch:{ ba -> 0x02bc }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ ba -> 0x02bc }
        r0 = r0.equals(r1);	 Catch:{ ba -> 0x02bc }
        if (r0 == 0) goto L_0x02be;
    L_0x02b2:
        r0 = 2139095040; // 0x7f800000 float:Infinity double:1.0568533725E-314;
        r0 = java.lang.Float.valueOf(r0);	 Catch:{ ba -> 0x02bc }
        r7.k = r0;	 Catch:{ ba -> 0x02bc }
        goto L_0x01ed;
    L_0x02bc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0242 }
    L_0x02be:
        r0 = r7.h;	 Catch:{ ba -> 0x02da }
        r0 = r0.l();	 Catch:{ ba -> 0x02da }
        r1 = z;	 Catch:{ ba -> 0x02da }
        r2 = 18;
        r1 = r1[r2];	 Catch:{ ba -> 0x02da }
        r0 = r0.equals(r1);	 Catch:{ ba -> 0x02da }
        if (r0 == 0) goto L_0x02dc;
    L_0x02d0:
        r0 = -8388608; // 0xffffffffff800000 float:-Infinity double:NaN;
        r0 = java.lang.Float.valueOf(r0);	 Catch:{ ba -> 0x02da }
        r7.k = r0;	 Catch:{ ba -> 0x02da }
        goto L_0x01ed;
    L_0x02da:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0242 }
    L_0x02dc:
        r0 = r7.h;	 Catch:{ ba -> 0x02f8 }
        r0 = r0.l();	 Catch:{ ba -> 0x02f8 }
        r1 = z;	 Catch:{ ba -> 0x02f8 }
        r2 = 9;
        r1 = r1[r2];	 Catch:{ ba -> 0x02f8 }
        r0 = r0.equals(r1);	 Catch:{ ba -> 0x02f8 }
        if (r0 == 0) goto L_0x02fa;
    L_0x02ee:
        r0 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
        r0 = java.lang.Float.valueOf(r0);	 Catch:{ ba -> 0x02f8 }
        r7.k = r0;	 Catch:{ ba -> 0x02f8 }
        goto L_0x01ed;
    L_0x02f8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0242 }
    L_0x02fa:
        r0 = r7.h;	 Catch:{ NumberFormatException -> 0x0242 }
        r0 = r0.l();	 Catch:{ NumberFormatException -> 0x0242 }
        r0 = java.lang.Float.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0242 }
        r7.k = r0;	 Catch:{ NumberFormatException -> 0x0242 }
        goto L_0x01ed;
    L_0x0308:
        r0 = r7.h;	 Catch:{ ba -> 0x0324 }
        r0 = r0.l();	 Catch:{ ba -> 0x0324 }
        r1 = z;	 Catch:{ ba -> 0x0324 }
        r2 = 15;
        r1 = r1[r2];	 Catch:{ ba -> 0x0324 }
        r0 = r0.equals(r1);	 Catch:{ ba -> 0x0324 }
        if (r0 == 0) goto L_0x0326;
    L_0x031a:
        r0 = 9218868437227405312; // 0x7ff0000000000000 float:0.0 double:Infinity;
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ ba -> 0x0324 }
        r7.k = r0;	 Catch:{ ba -> 0x0324 }
        goto L_0x01ed;
    L_0x0324:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0242 }
    L_0x0326:
        r0 = r7.h;	 Catch:{ ba -> 0x0342 }
        r0 = r0.l();	 Catch:{ ba -> 0x0342 }
        r1 = z;	 Catch:{ ba -> 0x0342 }
        r2 = 12;
        r1 = r1[r2];	 Catch:{ ba -> 0x0342 }
        r0 = r0.equals(r1);	 Catch:{ ba -> 0x0342 }
        if (r0 == 0) goto L_0x0344;
    L_0x0338:
        r0 = -4503599627370496; // 0xfff0000000000000 float:0.0 double:-Infinity;
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ ba -> 0x0342 }
        r7.k = r0;	 Catch:{ ba -> 0x0342 }
        goto L_0x01ed;
    L_0x0342:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0242 }
    L_0x0344:
        r0 = r7.h;	 Catch:{ ba -> 0x0360 }
        r0 = r0.l();	 Catch:{ ba -> 0x0360 }
        r1 = z;	 Catch:{ ba -> 0x0360 }
        r2 = 23;
        r1 = r1[r2];	 Catch:{ ba -> 0x0360 }
        r0 = r0.equals(r1);	 Catch:{ ba -> 0x0360 }
        if (r0 == 0) goto L_0x0362;
    L_0x0356:
        r0 = 9221120237041090560; // 0x7ff8000000000000 float:0.0 double:NaN;
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ ba -> 0x0360 }
        r7.k = r0;	 Catch:{ ba -> 0x0360 }
        goto L_0x01ed;
    L_0x0360:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0242 }
    L_0x0362:
        r0 = r7.h;	 Catch:{ NumberFormatException -> 0x0242 }
        r0 = r0.l();	 Catch:{ NumberFormatException -> 0x0242 }
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0242 }
        r7.k = r0;	 Catch:{ NumberFormatException -> 0x0242 }
        goto L_0x01ed;
    L_0x0370:
        r0 = r7.h;	 Catch:{ NumberFormatException -> 0x0242 }
        r0 = r0.l();	 Catch:{ NumberFormatException -> 0x0242 }
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0242 }
        r7.k = r0;	 Catch:{ NumberFormatException -> 0x0242 }
        goto L_0x01ed;
    L_0x037e:
        r0 = r7.h;	 Catch:{ NumberFormatException -> 0x0242 }
        r0 = r0.l();	 Catch:{ NumberFormatException -> 0x0242 }
        r7.k = r0;	 Catch:{ NumberFormatException -> 0x0242 }
        goto L_0x01ed;
    L_0x0388:
        r0 = r7.h;	 Catch:{ ba -> 0x0396 }
        r0 = r0.l();	 Catch:{ ba -> 0x0396 }
        r0 = com.google.fY.a(r0);	 Catch:{ ba -> 0x0396 }
        r7.k = r0;	 Catch:{ ba -> 0x0396 }
        goto L_0x01ed;
    L_0x0396:
        r0 = move-exception;
        r1 = new com.google.fc;	 Catch:{ NumberFormatException -> 0x0242 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0242 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0242 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x0242 }
        r4 = 16;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0242 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0242 }
        r3 = r0.getMessage();	 Catch:{ NumberFormatException -> 0x0242 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0242 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0242 }
        r3 = 0;
        r1.<init>(r7, r2, r0, r3);	 Catch:{ NumberFormatException -> 0x0242 }
        throw r1;	 Catch:{ NumberFormatException -> 0x0242 }
    L_0x03b9:
        r0 = r7.c;	 Catch:{ ba -> 0x03f5 }
        r1 = r7.h;	 Catch:{ ba -> 0x03f5 }
        r1 = r1.l();	 Catch:{ ba -> 0x03f5 }
        r0 = r0.a(r1);	 Catch:{ ba -> 0x03f5 }
        r7.k = r0;	 Catch:{ ba -> 0x03f5 }
        r0 = r7.k;	 Catch:{ ba -> 0x03f5 }
        if (r0 != 0) goto L_0x01ed;
    L_0x03cb:
        r0 = new com.google.fc;	 Catch:{ ba -> 0x03f5 }
        r1 = new java.lang.StringBuilder;	 Catch:{ ba -> 0x03f5 }
        r1.<init>();	 Catch:{ ba -> 0x03f5 }
        r2 = z;	 Catch:{ ba -> 0x03f5 }
        r3 = 28;
        r2 = r2[r3];	 Catch:{ ba -> 0x03f5 }
        r1 = r1.append(r2);	 Catch:{ ba -> 0x03f5 }
        r2 = r7.h;	 Catch:{ ba -> 0x03f5 }
        r2 = r2.l();	 Catch:{ ba -> 0x03f5 }
        r1 = r1.append(r2);	 Catch:{ ba -> 0x03f5 }
        r2 = 34;
        r1 = r1.append(r2);	 Catch:{ ba -> 0x03f5 }
        r1 = r1.toString();	 Catch:{ ba -> 0x03f5 }
        r2 = 0;
        r0.<init>(r7, r1, r2);	 Catch:{ ba -> 0x03f5 }
        throw r0;	 Catch:{ ba -> 0x03f5 }
    L_0x03f5:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0242 }
    L_0x03f7:
        r0 = new com.google.fc;	 Catch:{ NumberFormatException -> 0x0242 }
        r1 = z;	 Catch:{ NumberFormatException -> 0x0242 }
        r2 = 22;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0242 }
        r2 = 0;
        r0.<init>(r7, r1, r2);	 Catch:{ NumberFormatException -> 0x0242 }
        throw r0;	 Catch:{ NumberFormatException -> 0x0242 }
    L_0x0404:
        r0 = r7.a();	 Catch:{ ba -> 0x0412 }
        if (r0 == 0) goto L_0x0414;
    L_0x040a:
        r0 = java.util.Collections.emptyList();	 Catch:{ ba -> 0x0412 }
        r7.k = r0;	 Catch:{ ba -> 0x0412 }
        goto L_0x01ed;
    L_0x0412:
        r0 = move-exception;
        throw r0;
    L_0x0414:
        r0 = com.google.bA.a;	 Catch:{ ba -> 0x043e }
        r1 = r7.f();	 Catch:{ ba -> 0x043e }
        r1 = r1.ordinal();	 Catch:{ ba -> 0x043e }
        r0 = r0[r1];	 Catch:{ ba -> 0x043e }
        switch(r0) {
            case 1: goto L_0x042f;
            case 2: goto L_0x0440;
            default: goto L_0x0423;
        };
    L_0x0423:
        r0 = r7.f();
        r0 = com.google.f0.a(r0);
        r7.k = r0;
        goto L_0x01ed;
    L_0x042f:
        r0 = r7.c;	 Catch:{ ba -> 0x043e }
        r0 = r0.a();	 Catch:{ ba -> 0x043e }
        r1 = 0;
        r0 = r0.get(r1);	 Catch:{ ba -> 0x043e }
        r7.k = r0;	 Catch:{ ba -> 0x043e }
        goto L_0x01ed;
    L_0x043e:
        r0 = move-exception;
        throw r0;
    L_0x0440:
        r7.k = r5;
        goto L_0x01ed;
    L_0x0444:
        r0 = move-exception;
        throw r0;
    L_0x0446:
        r0 = move-exception;
        throw r0;	 Catch:{ ba -> 0x0448 }
    L_0x0448:
        r0 = move-exception;
        throw r0;	 Catch:{ ba -> 0x044a }
    L_0x044a:
        r0 = move-exception;
        throw r0;	 Catch:{ ba -> 0x044c }
    L_0x044c:
        r0 = move-exception;
        throw r0;	 Catch:{ ba -> 0x022d }
    L_0x044e:
        r0 = new com.google.fc;
        r1 = z;
        r2 = 21;
        r1 = r1[r2];
        r0.<init>(r7, r1, r5);
        throw r0;
    L_0x045a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.dW.i():void");
    }

    public dH k() {
        return this.j;
    }

    public Object j() {
        try {
            if (f() != f0.MESSAGE) {
                return this.k;
            }
            throw new UnsupportedOperationException(z[8]);
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public M c() {
        try {
            if (f() == f0.MESSAGE) {
                return this.a;
            }
            throw new UnsupportedOperationException(z[1]);
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[32];
        char[] toCharArray = "&}0\u0017\u0004\u0014|<\b@R|*DJ\u001day\u0005JRp!\u0010A\u001cf0\u000bJ\\".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "&}0\u0017\u0004\u0014|<\b@R|*DJ\u001day\u000bBRx<\u0017W\u0013r<DP\u000be<J".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = ")e8\u0007O\u0017qyY\u0004\u0006g,\u0001yRv8\n\u0004\u001d{5\u001d\u0004\u0010py\u0017T\u0017v0\u0002M\u0017qy\u0002K\u00005+\u0001T\u0017t-\u0001@Re+\rI\u001ba0\u0012ARs0\u0001H\u0016fw".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "4|<\b@R{,\tF\u0017g*DI\u0007f-DF\u00175)\u000bW\u001ba0\u0012AR|7\u0010A\u0015p+\u0017\n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "4|<\b@6p*\u0007V\u001be-\u000bV\"g6\u0010K\\p!\u0010A\u001cq<\u0001\u0004\u001cz-DW\u0017ay\u0002K\u00005<\u001cP\u0017{*\rK\u001c5?\rA\u001eqw".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "4|<\b@6p*\u0007V\u001be-\u000bV\"g6\u0010K\\p!\u0010A\u001cq<\u0001\u0004\u0001p-DB\u001dgy\nK\u001c8<\u001cP\u0017{*\rK\u001c5?\rA\u001eqw".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "4|<\b@6p*\u0007V\u001be-\u000bV\u00015:\u0005JRz7\b]Rw<DG\u001dx)\u0005V\u0017qy\u0010KRz-\fA\u00005\u001f\rA\u001eq\u001d\u0001W\u0011g0\u0014P\u001dg*DB\u001dgy\u0002M\u0017y=\u0017\u0004\u001dsy\u0010L\u00175*\u0005I\u001754\u0001W\u0001t>\u0001\u0004\u0006l)\u0001\n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "&}0\u0017\u0004\u0014|<\b@R|*DJ\u001day\u000bBRp7\u0011IRa \u0014A\\".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "4|<\b@6p*\u0007V\u001be-\u000bV\\r<\u0010`\u0017s8\u0011H\u0006C8\bQ\u0017=pDG\u0013y5\u0001@Rz7DE\u001c5<\tF\u0017q=\u0001@Rx<\u0017W\u0013r<DB\u001bp5\u0000\n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "\u001ct7".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "Rt*DE\u001c5<\u001cP\u0017{*\rK\u001c57\u0011I\u0010p+J".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "\u001b{?".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "_|7\u0002".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "P5=\u000bA\u000157\u000bPRq<\u0007H\u0013g<D".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[13] = new String(cArr).intern();
        toCharArray = "7m-\u0001J\u0001|6\nWRz?Di\u0017f*\u0005C\u0017F<\u0010WRx,\u0017PRw<DK\u0002a0\u000bJ\u0013yy\tA\u0001f8\u0003A\u0001;".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[14] = new String(cArr).intern();
        toCharArray = "\u001b{?".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[15] = new String(cArr).intern();
        toCharArray = "1z,\b@\u001c2-DT\u0013g*\u0001\u0004\u0016p?\u0005Q\u001eay\u0012E\u001e`<^\u0004".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[16] = new String(cArr).intern();
        toCharArray = "?p*\u0017E\u0015p*DG\u0013{~\u0010\u0004\u001at/\u0001\u0004\u0016p?\u0005Q\u001eay\u0012E\u001e`<\u0017\n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[17] = new String(cArr).intern();
        toCharArray = "_|7\u0002".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[18] = new String(cArr).intern();
        toCharArray = "1z,\b@R{6\u0010\u0004\u0002t+\u0017ARq<\u0002E\u0007y-DR\u0013y,\u0001\u001eR7".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[19] = new String(cArr).intern();
        toCharArray = "P50\u0017\u0004\u001cz-DERa \u0014A\\".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[20] = new String(cArr).intern();
        toCharArray = "?p*\u0017E\u0015p\n\u0001P\u00015:\u0005J\u001cz-DL\u0013c<DB\u001bp5\u0000W^56\nH\u000b5<\u001cP\u0017{*\rK\u001cfw".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[21] = new String(cArr).intern();
        toCharArray = "?p*\u0017E\u0015py\u0010]\u0002py\fE\u00165=\u0001B\u0013`5\u0010\u0004\u0004t5\u0011A\\".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[22] = new String(cArr).intern();
        toCharArray = "\u001ct7".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[23] = new String(cArr).intern();
        toCharArray = "P50\u0017\u0004\u001cz-DE\u001c5<\nQ\u001f5-\u001dT\u0017;".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[24] = new String(cArr).intern();
        toCharArray = "4|<\b@Rb0\u0010LRe+\rI\u001ba0\u0012ARa \u0014AR}8\u0017\u0004\u0006l)\u0001{\u001ct4\u0001\n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[25] = new String(cArr).intern();
        toCharArray = "4|<\b@Rb0\u0010LRx<\u0017W\u0013r<DK\u00005<\nQ\u001f5-\u001dT\u001754\rW\u0001|7\u0003\u0004\u0006l)\u0001{\u001ct4\u0001\n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[26] = new String(cArr).intern();
        toCharArray = " p)\u0001E\u0006p=DB\u001bp5\u0000WRv8\nJ\u001day\fE\u0004py\u0000A\u0014t,\bPRc8\bQ\u0017fw".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[27] = new String(cArr).intern();
        toCharArray = "'{2\nK\u0005{y\u0001J\u0007xy\u0000A\u0014t,\bPRc8\bQ\u0017/yF".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[28] = new String(cArr).intern();
        toCharArray = "P50\u0017\u0004\u001cz-DERx<\u0017W\u0013r<DP\u000be<J".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[29] = new String(cArr).intern();
        toCharArray = "P50\u0017\u0004\u001cz-DERx<\u0017W\u0013r<DP\u000be<J".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[30] = new String(cArr).intern();
        toCharArray = "\u0016p*\u0007V\u001be-\u000bV\\e+\u000bP\u001d51\u0005WRty\nA\u00055=\u0001G\u001et+\u0001@Ra \u0014ARw,\u0010\u00046p*\u0016G\u001be-\u000bV\u0001;3\u0005R\u00135.\u0005W\u001c2-DQ\u0002q8\u0010A\u0016;".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 21;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[31] = new String(cArr).intern();
        z = strArr;
        try {
            i = bJ.values();
            if (dH.values().length != b6.values().length) {
                throw new RuntimeException(z[31]);
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public d6 o() {
        return this.h;
    }

    public aa b() {
        try {
            if (f() == f0.ENUM) {
                return this.c;
            }
            throw new UnsupportedOperationException(z[7]);
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public boolean h() {
        try {
            return this.h.h() == bt.LABEL_OPTIONAL;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public int compareTo(Object obj) {
        return a((dW) obj);
    }

    public boolean l() {
        try {
            if (a()) {
                if (d().isPackable()) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    public eJ a() {
        return this.h.A();
    }

    public M g() {
        return this.e;
    }

    public cc c() {
        return d().getJavaType();
    }

    static void b(dW dWVar) {
        dWVar.i();
    }

    public aJ a(aJ aJVar, a1 a1Var) {
        return ((cj) aJVar).a((eb) a1Var);
    }

    public M e() {
        try {
            if (n()) {
                return this.f;
            }
            throw new UnsupportedOperationException(z[0]);
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public int a(dW dWVar) {
        try {
            if (dWVar.e == this.e) {
                return e() - dWVar.e();
            }
            throw new IllegalArgumentException(z[6]);
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public String c() {
        return this.h.a();
    }

    public cn a() {
        return this.g;
    }

    private void a(d6 d6Var) {
        this.h = d6Var;
    }

    public eb d() {
        return o();
    }

    dW(d6 d6Var, cn cnVar, M m, int i, boolean z, bA bAVar) {
        this(d6Var, cnVar, m, i, z);
    }

    private dW(d6 d6Var, cn cnVar, M m, int i, boolean z) {
        this.d = i;
        this.h = d6Var;
        this.b = bP.b(cnVar, m, d6Var.a());
        this.g = cnVar;
        if (d6Var.e()) {
            this.j = dH.valueOf(d6Var.j());
        }
        try {
            if (e() <= 0) {
                throw new fc((dh) this, z[3], null);
            }
            try {
                if (d6Var.A().h()) {
                    if (!l()) {
                        throw new fc((dh) this, z[2], null);
                    }
                }
                if (z) {
                    try {
                        if (d6Var.f()) {
                            try {
                                this.e = null;
                                if (m != null) {
                                    this.f = m;
                                } else {
                                    this.f = null;
                                }
                            } catch (UnsupportedOperationException e) {
                                throw e;
                            }
                        }
                        throw new fc((dh) this, z[4], null);
                    } catch (UnsupportedOperationException e2) {
                        throw e2;
                    }
                }
                try {
                    if (d6Var.f()) {
                        throw new fc((dh) this, z[5], null);
                    }
                    this.e = m;
                    this.f = null;
                } catch (UnsupportedOperationException e22) {
                    throw e22;
                }
                cn.a(cnVar).d(this);
            } catch (UnsupportedOperationException e222) {
                throw e222;
            } catch (UnsupportedOperationException e2222) {
                throw e2222;
            }
        } catch (UnsupportedOperationException e22222) {
            throw e22222;
        }
    }

    public f0 f() {
        return this.j.getJavaType();
    }

    public bJ d() {
        return i[this.j.ordinal()];
    }

    public boolean a() {
        try {
            return this.h.h() == bt.LABEL_REPEATED;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public String b() {
        return this.b;
    }

    static void a(dW dWVar, d6 d6Var) {
        dWVar.a(d6Var);
    }

    public int e() {
        return this.h.g();
    }

    public boolean m() {
        try {
            return this.h.h() == bt.LABEL_REQUIRED;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public boolean b() {
        return a().h();
    }

    public boolean n() {
        return this.h.f();
    }

    public int d() {
        return this.d;
    }
}
