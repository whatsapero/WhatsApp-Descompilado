package com.google;

import com.whatsapp.vk;
import java.math.BigInteger;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class fY {
    private static final dd a;
    private static final dd b;
    private static final dd c;
    private static final String[] z;

    static String a(long j) {
        return b(j);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(int r8, java.lang.Object r9, com.google.cS r10) {
        /*
        r4 = com.google.dy.b;
        r2 = com.google.aA.a(r8);	 Catch:{ IllegalStateException -> 0x0092 }
        switch(r2) {
            case 0: goto L_0x0028;
            case 1: goto L_0x0055;
            case 2: goto L_0x0071;
            case 3: goto L_0x0088;
            case 4: goto L_0x0009;
            case 5: goto L_0x0039;
            default: goto L_0x0009;
        };
    L_0x0009:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x0026 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0026 }
        r3.<init>();	 Catch:{ IllegalStateException -> 0x0026 }
        r4 = z;	 Catch:{ IllegalStateException -> 0x0026 }
        r5 = 15;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0026 }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x0026 }
        r3 = r3.append(r8);	 Catch:{ IllegalStateException -> 0x0026 }
        r3 = r3.toString();	 Catch:{ IllegalStateException -> 0x0026 }
        r2.<init>(r3);	 Catch:{ IllegalStateException -> 0x0026 }
        throw r2;	 Catch:{ IllegalStateException -> 0x0026 }
    L_0x0026:
        r2 = move-exception;
        throw r2;
    L_0x0028:
        r0 = r9;
        r0 = (java.lang.Long) r0;	 Catch:{ IllegalStateException -> 0x0094 }
        r2 = r0;
        r2 = r2.longValue();	 Catch:{ IllegalStateException -> 0x0094 }
        r2 = b(r2);	 Catch:{ IllegalStateException -> 0x0094 }
        r10.a(r2);	 Catch:{ IllegalStateException -> 0x0094 }
        if (r4 == 0) goto L_0x0091;
    L_0x0039:
        r2 = 0;
        r2 = (java.util.Locale) r2;	 Catch:{ IllegalStateException -> 0x0096 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0096 }
        r5 = 14;
        r5 = r3[r5];	 Catch:{ IllegalStateException -> 0x0096 }
        r3 = 1;
        r6 = new java.lang.Object[r3];	 Catch:{ IllegalStateException -> 0x0096 }
        r7 = 0;
        r0 = r9;
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalStateException -> 0x0096 }
        r3 = r0;
        r6[r7] = r3;	 Catch:{ IllegalStateException -> 0x0096 }
        r2 = java.lang.String.format(r2, r5, r6);	 Catch:{ IllegalStateException -> 0x0096 }
        r10.a(r2);	 Catch:{ IllegalStateException -> 0x0096 }
        if (r4 == 0) goto L_0x0091;
    L_0x0055:
        r2 = 0;
        r2 = (java.util.Locale) r2;	 Catch:{ IllegalStateException -> 0x0098 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0098 }
        r5 = 13;
        r5 = r3[r5];	 Catch:{ IllegalStateException -> 0x0098 }
        r3 = 1;
        r6 = new java.lang.Object[r3];	 Catch:{ IllegalStateException -> 0x0098 }
        r7 = 0;
        r0 = r9;
        r0 = (java.lang.Long) r0;	 Catch:{ IllegalStateException -> 0x0098 }
        r3 = r0;
        r6[r7] = r3;	 Catch:{ IllegalStateException -> 0x0098 }
        r2 = java.lang.String.format(r2, r5, r6);	 Catch:{ IllegalStateException -> 0x0098 }
        r10.a(r2);	 Catch:{ IllegalStateException -> 0x0098 }
        if (r4 == 0) goto L_0x0091;
    L_0x0071:
        r2 = "\"";
        r10.a(r2);	 Catch:{ IllegalStateException -> 0x009a }
        r0 = r9;
        r0 = (com.google.g2) r0;	 Catch:{ IllegalStateException -> 0x009a }
        r2 = r0;
        r2 = a(r2);	 Catch:{ IllegalStateException -> 0x009a }
        r10.a(r2);	 Catch:{ IllegalStateException -> 0x009a }
        r2 = "\"";
        r10.a(r2);	 Catch:{ IllegalStateException -> 0x009a }
        if (r4 == 0) goto L_0x0091;
    L_0x0088:
        r2 = c;	 Catch:{ IllegalStateException -> 0x0026 }
        r9 = (com.google.eS) r9;	 Catch:{ IllegalStateException -> 0x0026 }
        com.google.dd.a(r2, r9, r10);	 Catch:{ IllegalStateException -> 0x0026 }
        if (r4 != 0) goto L_0x0009;
    L_0x0091:
        return;
    L_0x0092:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0094 }
    L_0x0094:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0096 }
    L_0x0096:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0098 }
    L_0x0098:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x009a }
    L_0x009a:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0026 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fY.a(int, java.lang.Object, com.google.cS):void");
    }

    private static boolean a(byte b) {
        return 48 <= b && b <= 55;
    }

    static long b(String str) {
        return a(str, true, true);
    }

    private static String b(int i) {
        if (i < 0) {
            return Long.toString(((long) i) & 4294967295L);
        }
        try {
            return Integer.toString(i);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private static boolean b(byte b) {
        return (48 <= b && b <= 57) || ((97 <= b && b <= 102) || (65 <= b && b <= 70));
    }

    public static void a(eS eSVar, Appendable appendable) {
        dd.a(c, eSVar, new cS(appendable, null));
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[24];
        char[] toCharArray = "[}\u007fE;{w)A$qryAwavxQ2|pl\u001ew5O.\u00046f3lJ32|o\u0004$fa`J0<".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "[}\u007fE;{w)A$qryAwavxQ2|pl\u001ew5Oq\u0003wez}Lw||)@>uz}W".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "[}\u007fE;{w)A$qryAwavxQ2|pl\u001ew5O".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "Ne".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "N4".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "N1".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "Na".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "Nq".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "NO".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "Nu".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "Ng".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "N}".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "Nr".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "\"k,\u0014f$k".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[13] = new String(cArr).intern();
        toCharArray = "\"k,\u0014oj".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[14] = new String(cArr).intern();
        toCharArray = "Prm\u0004#st3\u0004".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[15] = new String(cArr).intern();
        toCharArray = "\\fdF2`3fQ#2|o\u0004%s}nAwt|{\u0004d >kM#2``C9ww)M9fvnA%(3".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[16] = new String(cArr).intern();
        toCharArray = "\"k".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[17] = new String(cArr).intern();
        toCharArray = "\\fdF2`3fQ#2|o\u0004%s}nAwt|{\u0004d >kM#2fgW>u}l@w{}}A0wa3\u0004".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[18] = new String(cArr).intern();
        toCharArray = "\\fdF2`3fQ#2|o\u0004%s}nAwt|{\u0004d >kM#2``C9ww)M9fvnA%(3".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[19] = new String(cArr).intern();
        toCharArray = "\\fdF2`3fQ#2|o\u0004%s}nAwt|{\u0004d >kM#2fgW>u}l@w{}}A0wa3\u0004".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[20] = new String(cArr).intern();
        toCharArray = "\\fdF2`3dQ$f3kAwb|zM#{el\u001ew".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[21] = new String(cArr).intern();
        toCharArray = "\\fdF2`3fQ#2|o\u0004%s}nAwt|{\u0004a&>kM#2``C9ww)M9fvnA%(3".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[22] = new String(cArr).intern();
        toCharArray = "\\fdF2`3fQ#2|o\u0004%s}nAwt|{\u0004a&>kM#2fgW>u}l@w{}}A0wa3\u0004".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[23] = new String(cArr).intern();
        z = strArr;
        c = new dd(null);
        a = dd.b(new dd(null), true);
        b = dd.a(new dd(null), false);
    }

    static void b(int i, Object obj, cS cSVar) {
        a(i, obj, cSVar);
    }

    private static String b(long j) {
        if (j < 0) {
            return BigInteger.valueOf(Long.MAX_VALUE & j).setBit(63).toString();
        }
        try {
            return Long.toString(j);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static String e(String str) {
        return a(g2.a(str));
    }

    static String a(int i) {
        return b(i);
    }

    static long c(String str) {
        return a(str, false, true);
    }

    private static int c(byte b) {
        if (48 > b || b > 57) {
            return (97 > b || b > 122) ? (b - 65) + 10 : (b - 97) + 10;
        } else {
            return b - 48;
        }
    }

    private static long a(String str, boolean z, boolean z2) {
        int i = 1;
        int i2 = 0;
        try {
            int i3;
            if (!str.startsWith("-", 0)) {
                i = 0;
            } else if (z) {
                i2 = 1;
            } else {
                throw new NumberFormatException(z[21] + str);
            }
            if (str.startsWith(z[17], i2)) {
                i3 = i2 + 2;
                i2 = 16;
            } else if (str.startsWith("0", i2)) {
                i3 = i2;
                i2 = 8;
            } else {
                i3 = i2;
                i2 = 10;
            }
            String substring = str.substring(i3);
            if (substring.length() < 16) {
                long j;
                long parseLong = Long.parseLong(substring, i2);
                if (i != 0) {
                    j = -parseLong;
                } else {
                    j = parseLong;
                }
                if (z2) {
                    return j;
                }
                if (z) {
                    if (j <= 2147483647L && j >= -2147483648L) {
                        return j;
                    }
                    try {
                        throw new NumberFormatException(z[19] + str);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                } else if (j < 4294967296L && j >= 0) {
                    return j;
                } else {
                    try {
                        throw new NumberFormatException(z[20] + str);
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
            }
            BigInteger negate;
            BigInteger bigInteger = new BigInteger(substring, i2);
            if (i != 0) {
                negate = bigInteger.negate();
            } else {
                negate = bigInteger;
            }
            if (z2) {
                if (z) {
                    try {
                        if (negate.bitLength() > 63) {
                            throw new NumberFormatException(z[22] + str);
                        }
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                }
                try {
                    if (negate.bitLength() > 64) {
                        throw new NumberFormatException(z[23] + str);
                    }
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            } else if (z) {
                try {
                    if (negate.bitLength() > 31) {
                        throw new NumberFormatException(z[16] + str);
                    }
                } catch (IllegalStateException e2222) {
                    throw e2222;
                }
            } else {
                try {
                    if (negate.bitLength() > 32) {
                        throw new NumberFormatException(z[18] + str);
                    }
                } catch (IllegalStateException e22222) {
                    throw e22222;
                }
            }
            return negate.longValue();
        } catch (IllegalStateException e222222) {
            throw e222222;
        } catch (IllegalStateException e2222222) {
            throw e2222222;
        }
    }

    public static String a(eE eEVar) {
        try {
            Appendable stringBuilder = new StringBuilder();
            a(eEVar, stringBuilder);
            return stringBuilder.toString();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    static int a(String str) {
        return (int) a(str, false, false);
    }

    public static String a(eS eSVar) {
        try {
            Appendable stringBuilder = new StringBuilder();
            a(eSVar, stringBuilder);
            return stringBuilder.toString();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    static int d(String str) {
        return (int) a(str, true, false);
    }

    public static void a(eE eEVar, Appendable appendable) {
        dd.a(c, eEVar, new cS(appendable, null));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(com.google.g2 r6) {
        /*
        r1 = com.google.dy.b;
        r2 = new java.lang.StringBuilder;
        r0 = r6.e();
        r2.<init>(r0);
        r0 = 0;
    L_0x000c:
        r3 = r6.e();
        if (r0 >= r3) goto L_0x0048;
    L_0x0012:
        r3 = r6.b(r0);
        switch(r3) {
            case 7: goto L_0x004d;
            case 8: goto L_0x0058;
            case 9: goto L_0x0082;
            case 10: goto L_0x006d;
            case 11: goto L_0x008d;
            case 12: goto L_0x0062;
            case 13: goto L_0x0078;
            case 34: goto L_0x00ac;
            case 39: goto L_0x00a2;
            case 92: goto L_0x0097;
            default: goto L_0x0019;
        };
    L_0x0019:
        r4 = 32;
        if (r3 < r4) goto L_0x0023;
    L_0x001d:
        r4 = (char) r3;
        r2.append(r4);	 Catch:{ IllegalStateException -> 0x00ce }
        if (r1 == 0) goto L_0x0044;
    L_0x0023:
        r4 = 92;
        r2.append(r4);	 Catch:{ IllegalStateException -> 0x00ce }
        r4 = r3 >>> 6;
        r4 = r4 & 3;
        r4 = r4 + 48;
        r4 = (char) r4;	 Catch:{ IllegalStateException -> 0x00ce }
        r2.append(r4);	 Catch:{ IllegalStateException -> 0x00ce }
        r4 = r3 >>> 3;
        r4 = r4 & 7;
        r4 = r4 + 48;
        r4 = (char) r4;	 Catch:{ IllegalStateException -> 0x00ce }
        r2.append(r4);	 Catch:{ IllegalStateException -> 0x00ce }
        r3 = r3 & 7;
        r3 = r3 + 48;
        r3 = (char) r3;	 Catch:{ IllegalStateException -> 0x00ce }
        r2.append(r3);	 Catch:{ IllegalStateException -> 0x00ce }
    L_0x0044:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x000c;
    L_0x0048:
        r0 = r2.toString();
        return r0;
    L_0x004d:
        r4 = z;	 Catch:{ IllegalStateException -> 0x00b8 }
        r5 = 12;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x00b8 }
        r2.append(r4);	 Catch:{ IllegalStateException -> 0x00b8 }
        if (r1 == 0) goto L_0x0044;
    L_0x0058:
        r4 = z;	 Catch:{ IllegalStateException -> 0x00ba }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x00ba }
        r2.append(r4);	 Catch:{ IllegalStateException -> 0x00ba }
        if (r1 == 0) goto L_0x0044;
    L_0x0062:
        r4 = z;	 Catch:{ IllegalStateException -> 0x00bc }
        r5 = 9;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x00bc }
        r2.append(r4);	 Catch:{ IllegalStateException -> 0x00bc }
        if (r1 == 0) goto L_0x0044;
    L_0x006d:
        r4 = z;	 Catch:{ IllegalStateException -> 0x00be }
        r5 = 11;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x00be }
        r2.append(r4);	 Catch:{ IllegalStateException -> 0x00be }
        if (r1 == 0) goto L_0x0044;
    L_0x0078:
        r4 = z;	 Catch:{ IllegalStateException -> 0x00c0 }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x00c0 }
        r2.append(r4);	 Catch:{ IllegalStateException -> 0x00c0 }
        if (r1 == 0) goto L_0x0044;
    L_0x0082:
        r4 = z;	 Catch:{ IllegalStateException -> 0x00c2 }
        r5 = 10;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x00c2 }
        r2.append(r4);	 Catch:{ IllegalStateException -> 0x00c2 }
        if (r1 == 0) goto L_0x0044;
    L_0x008d:
        r4 = z;	 Catch:{ IllegalStateException -> 0x00c4 }
        r5 = 3;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x00c4 }
        r2.append(r4);	 Catch:{ IllegalStateException -> 0x00c4 }
        if (r1 == 0) goto L_0x0044;
    L_0x0097:
        r4 = z;	 Catch:{ IllegalStateException -> 0x00c6 }
        r5 = 8;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x00c6 }
        r2.append(r4);	 Catch:{ IllegalStateException -> 0x00c6 }
        if (r1 == 0) goto L_0x0044;
    L_0x00a2:
        r4 = z;	 Catch:{ IllegalStateException -> 0x00c8 }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x00c8 }
        r2.append(r4);	 Catch:{ IllegalStateException -> 0x00c8 }
        if (r1 == 0) goto L_0x0044;
    L_0x00ac:
        r4 = z;	 Catch:{ IllegalStateException -> 0x00ca }
        r5 = 5;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x00ca }
        r2.append(r4);	 Catch:{ IllegalStateException -> 0x00ca }
        if (r1 == 0) goto L_0x0044;
    L_0x00b6:
        goto L_0x0019;
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00bc }
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c2 }
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c4 }
    L_0x00c4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c6 }
    L_0x00c6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c8 }
    L_0x00c8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ca }
    L_0x00ca:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00cc }
    L_0x00cc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ce }
    L_0x00ce:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fY.a(com.google.g2):java.lang.String");
    }

    static g2 a(CharSequence charSequence) {
        g2 a = g2.a(charSequence.toString());
        byte[] bArr = new byte[a.e()];
        int i = 0;
        int i2;
        for (int i3 = 0; i3 < a.e(); i3 = i2 + 1) {
            byte b = a.b(i3);
            if (b == (byte) 92) {
                try {
                    if (i3 + 1 < a.e()) {
                        i2 = i3 + 1;
                        byte b2 = a.b(i2);
                        int i4;
                        if (a(b2)) {
                            i3 = c(b2);
                            try {
                                if (i2 + 1 < a.e() && a(a.b(i2 + 1))) {
                                    i2++;
                                    i3 = (i3 * 8) + c(a.b(i2));
                                }
                                try {
                                    if (i2 + 1 < a.e() && a(a.b(i2 + 1))) {
                                        i2++;
                                        i3 = (i3 * 8) + c(a.b(i2));
                                    }
                                    i4 = i + 1;
                                    bArr[i] = (byte) i3;
                                    i = i4;
                                } catch (IllegalStateException e) {
                                    throw e;
                                }
                            } catch (IllegalStateException e2) {
                                throw e2;
                            }
                        }
                        switch (b2) {
                            case vk.SherlockTheme_searchViewGoIcon /*34*/:
                                i3 = i + 1;
                                bArr[i] = (byte) 34;
                                break;
                            case vk.SherlockTheme_searchViewTextField /*39*/:
                                i3 = i + 1;
                                bArr[i] = (byte) 39;
                                break;
                            case (byte) 92:
                                i3 = i + 1;
                                bArr[i] = (byte) 92;
                                break;
                            case (byte) 97:
                                i3 = i + 1;
                                try {
                                    bArr[i] = (byte) 7;
                                    break;
                                } catch (IllegalStateException e22) {
                                    throw e22;
                                }
                            case (byte) 98:
                                i3 = i + 1;
                                bArr[i] = (byte) 8;
                                break;
                            case (byte) 102:
                                i3 = i + 1;
                                bArr[i] = (byte) 12;
                                break;
                            case (byte) 110:
                                i3 = i + 1;
                                bArr[i] = (byte) 10;
                                break;
                            case (byte) 114:
                                i3 = i + 1;
                                bArr[i] = (byte) 13;
                                break;
                            case (byte) 116:
                                i3 = i + 1;
                                bArr[i] = (byte) 9;
                                break;
                            case (byte) 118:
                                i3 = i + 1;
                                bArr[i] = (byte) 11;
                                break;
                            case (byte) 120:
                                try {
                                    if (i2 + 1 >= a.e() || !b(a.b(i2 + 1))) {
                                        throw new ba(z[1]);
                                    }
                                    i2++;
                                    i3 = c(a.b(i2));
                                    try {
                                        if (i2 + 1 < a.e() && b(a.b(i2 + 1))) {
                                            i2++;
                                            i3 = (i3 * 16) + c(a.b(i2));
                                        }
                                        i4 = i + 1;
                                        bArr[i] = (byte) i3;
                                        i3 = i4;
                                        break;
                                    } catch (IllegalStateException e222) {
                                        throw e222;
                                    }
                                } catch (IllegalStateException e2222) {
                                    throw e2222;
                                }
                            default:
                                throw new ba(z[2] + ((char) b2) + '\'');
                        }
                        i = i3;
                    } else {
                        throw new ba(z[0]);
                    }
                } catch (IllegalStateException e22222) {
                    throw e22222;
                }
            }
            i2 = i + 1;
            bArr[i] = b;
            i = i2;
            i2 = i3;
        }
        return g2.a(bArr, 0, i);
    }
}
