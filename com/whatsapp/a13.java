package com.whatsapp;

import com.whatsapp.protocol.b;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class a13 implements Runnable {
    private static final String[] z;
    final m8 a;
    final jg b;
    final bz c;
    final String d;
    final b e;

    static {
        String[] strArr = new String[14];
        String str = "MB\u0005`\u0016XV";
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
                        i3 = 44;
                        break;
                    case ay.f /*1*/:
                        i3 = 58;
                        break;
                    case ay.n /*2*/:
                        i3 = 106;
                        break;
                    case ay.p /*3*/:
                        i3 = 12;
                        break;
                    default:
                        i3 = 121;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "MB\u0005`\u0016XV";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "MB\u0005`\u0016XV";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0012\u001a\u0005bYA_\u0019\u007f\u0018K_J";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\f\\\u0018c\u0014\f[\u001a|\u0015EY\u000bx\u0010CTJz\u001c^I\u0003c\u0017\f";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "MB\u0005`\u0016XV";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "MB\u0005`\u0016XVJo\u000bEN\u0003o\u0018@S\u001euYIL\u000fb\r\u0016\u001a\u0018i\u001aIS\u001ci";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "MB\u0005`\u0016XV";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "MB\u0005`\u0016XV";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "MB\u0005`\u0016XVJe\n\fI\u000f`\u001f\fH\u000fo\u001cEL\u0003b\u001e\u0010";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\fM\u0003x\u0011\fH\u000fx\u000bU\u001a\tc\fBNJ";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    str = "MB\u0005`\u0016XV";
                    obj = 11;
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    strArr2 = strArr3;
                    str = "MB\u0005`\u0016XV";
                    obj = 12;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "lID{\u0011MN\u0019m\t\\\u0014\u0004i\r";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r14_this = this;
        r4 = 4;
        r8 = 0;
        r9 = 1;
        r12 = 0;
        r10 = new com.whatsapp.zt;
        r10.<init>(r14);
        r0 = r14.e;	 Catch:{ IllegalArgumentException -> 0x0121 }
        r0 = r0.I;	 Catch:{ IllegalArgumentException -> 0x0121 }
        if (r0 != r4) goto L_0x001c;
    L_0x0010:
        r0 = com.whatsapp.App.G;	 Catch:{ IllegalArgumentException -> 0x0121 }
        if (r0 != r9) goto L_0x001c;
    L_0x0014:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0123 }
        r1 = 7;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0123 }
        com.whatsapp.App.o(r0);	 Catch:{ IllegalArgumentException -> 0x0123 }
    L_0x001c:
        r11 = new com.whatsapp.fieldstats.f;
        r11.<init>();
        r0 = r14.e;
        r0 = r0.e;
        r0 = r0.c;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = com.whatsapp.App.af();
        r1 = r1.append(r2);
        r2 = z;
        r2 = r2[r9];
        r1 = r1.append(r2);
        r1 = r1.toString();
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0125;
    L_0x0046:
        r0 = r9;
    L_0x0047:
        r2 = (double) r0;
        r0 = java.lang.Double.valueOf(r2);
        r11.b = r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 10;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r1);
        r1 = z;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r1 = r14.e;
        r1 = r1.e;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 11;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r14.e;
        r1 = r1.I;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r14.e;
        r1 = r1.q;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r14.e;
        r0 = r0.I;
        r0 = (double) r0;
        r0 = java.lang.Double.valueOf(r0);
        r11.c = r0;
        r0 = r14.e;
        r0 = r0.q;
        r11.d = r0;
        r0 = r14.e;	 Catch:{ IllegalArgumentException -> 0x0128 }
        r0 = r0.e;	 Catch:{ IllegalArgumentException -> 0x0128 }
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x0128 }
        r6 = com.whatsapp.f_.a(r0);	 Catch:{ IllegalArgumentException -> 0x0128 }
        r1 = new org.whispersystems.libaxolotl.a1;
        r0 = r14.b;
        r0 = com.whatsapp.jg.a(r0);
        r2 = r0.a6;
        r0 = r14.b;
        r0 = com.whatsapp.jg.a(r0);
        r3 = r0.a6;
        r0 = r14.b;
        r0 = com.whatsapp.jg.a(r0);
        r0 = r0.a6;
        r4 = r0.c();
        r0 = r14.b;
        r0 = com.whatsapp.jg.a(r0);
        r5 = r0.a6;
        r1.<init>(r2, r3, r4, r5, r6, r8);
        r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r0 = java.lang.Double.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0144 }
        r11.e = r0;	 Catch:{ IllegalArgumentException -> 0x0144 }
        r0 = r14.e;	 Catch:{ IllegalArgumentException -> 0x0144 }
        r0 = r0.a();	 Catch:{ IllegalArgumentException -> 0x0144 }
        if (r0 != 0) goto L_0x0191;
    L_0x00ef:
        r0 = new org.whispersystems.libaxolotl.aA;	 Catch:{ b3 -> 0x0169 }
        r2 = r14.e;	 Catch:{ b3 -> 0x0169 }
        r2 = r2.d();	 Catch:{ b3 -> 0x0169 }
        r0.<init>(r2);	 Catch:{ b3 -> 0x0169 }
        r1.a(r0, r10);	 Catch:{ b3 -> 0x0169 }
    L_0x00fd:
        r0 = r14.b;
        r0 = com.whatsapp.jg.a(r0);
        com.whatsapp.fieldstats.al.a(r0, r11);
        r0 = r14.b;
        r0 = com.whatsapp.jg.a(r0);
        r0 = r0.U();
        r1 = new com.whatsapp.a5b;
        r2 = r14.b;
        r2 = com.whatsapp.jg.a(r2);
        r2 = r2.a6;
        r1.<init>(r14, r2);
        r0.post(r1);
    L_0x0120:
        return;
    L_0x0121:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0123 }
    L_0x0123:
        r0 = move-exception;
        throw r0;
    L_0x0125:
        r0 = r8;
        goto L_0x0047;
    L_0x0128:
        r0 = move-exception;
        r0 = r14.b;
        r0 = com.whatsapp.jg.a(r0);
        r0 = r0.U();
        r1 = new com.whatsapp.a5b;
        r2 = r14.b;
        r2 = com.whatsapp.jg.a(r2);
        r2 = r2.a6;
        r1.<init>(r14, r2);
        r0.post(r1);
        goto L_0x0120;
    L_0x0144:
        r0 = move-exception;
        throw r0;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
    L_0x0146:
        r0 = move-exception;
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        com.whatsapp.util.Log.c(r1, r0);
        r0 = r14.e;
        r0.a(r9);
        r0 = java.lang.Double.valueOf(r12);
        r11.e = r0;
        r0 = com.whatsapp.fieldstats.ay.INVALID_MESSAGE;
        r0 = r0.getCode();
        r0 = (double) r0;
        r0 = java.lang.Double.valueOf(r0);
        r11.a = r0;
        goto L_0x00fd;
    L_0x0169:
        r0 = move-exception;
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x01e5 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x01e5 }
        com.whatsapp.util.Log.c(r2, r0);	 Catch:{ IllegalArgumentException -> 0x01e5 }
        r0 = r14.e;	 Catch:{ IllegalArgumentException -> 0x01e5 }
        r2 = 1;
        r0.a(r2);	 Catch:{ IllegalArgumentException -> 0x01e5 }
        r2 = 0;
        r0 = java.lang.Double.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x01e5 }
        r11.e = r0;	 Catch:{ IllegalArgumentException -> 0x01e5 }
        r0 = com.whatsapp.fieldstats.ay.NO_SESSION_AVAILABLE;	 Catch:{ IllegalArgumentException -> 0x01e5 }
        r0 = r0.getCode();	 Catch:{ IllegalArgumentException -> 0x01e5 }
        r2 = (double) r0;	 Catch:{ IllegalArgumentException -> 0x01e5 }
        r0 = java.lang.Double.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x01e5 }
        r11.a = r0;	 Catch:{ IllegalArgumentException -> 0x01e5 }
        r0 = com.whatsapp.App.az;	 Catch:{ IllegalArgumentException -> 0x01e5 }
        if (r0 == 0) goto L_0x00fd;
    L_0x0191:
        r0 = new org.whispersystems.libaxolotl.av;	 Catch:{ a7 -> 0x01a1, bA -> 0x0206, Z -> 0x0245 }
        r2 = r14.e;	 Catch:{ a7 -> 0x01a1, bA -> 0x0206, Z -> 0x0245 }
        r2 = r2.d();	 Catch:{ a7 -> 0x01a1, bA -> 0x0206, Z -> 0x0245 }
        r0.<init>(r2);	 Catch:{ a7 -> 0x01a1, bA -> 0x0206, Z -> 0x0245 }
        r1.a(r0, r10);	 Catch:{ a7 -> 0x01a1, bA -> 0x0206, Z -> 0x0245 }
        goto L_0x00fd;
    L_0x01a1:
        r0 = move-exception;
        r1 = z;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        com.whatsapp.util.Log.c(r1, r0);	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = r14.e;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r1 = 1;
        r0.a(r1);	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = 0;
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r11.e = r0;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = com.whatsapp.fieldstats.ay.PRE_KEY_MESSAGE_MISSING_PRE_KEY;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = r0.getCode();	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = (double) r0;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r11.a = r0;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        goto L_0x00fd;
    L_0x01c7:
        r0 = move-exception;
        r1 = z;
        r2 = 9;
        r1 = r1[r2];
        com.whatsapp.util.Log.c(r1, r0);
        r0 = r14.b;
        r0 = com.whatsapp.jg.a(r0);
        r0 = r0.U();
        r1 = new com.whatsapp.tm;
        r1.<init>(r14);
        r0.post(r1);
        goto L_0x0120;
    L_0x01e5:
        r0 = move-exception;
        throw r0;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
    L_0x01e7:
        r0 = move-exception;
        r1 = z;
        r2 = 12;
        r1 = r1[r2];
        com.whatsapp.util.Log.c(r1, r0);
        r0 = java.lang.Double.valueOf(r12);
        r11.e = r0;
        r0 = com.whatsapp.fieldstats.ay.LEGACY_MESSAGE;
        r0 = r0.getCode();
        r0 = (double) r0;
        r0 = java.lang.Double.valueOf(r0);
        r11.a = r0;
        goto L_0x00fd;
    L_0x0206:
        r0 = move-exception;
        r1 = z;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r2 = 13;
        r1 = r1[r2];	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        com.whatsapp.util.Log.c(r1, r0);	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = 0;
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r11.e = r0;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = com.whatsapp.fieldstats.ay.UNTRUSTED_IDENTITY;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = r0.getCode();	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = (double) r0;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r11.a = r0;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        goto L_0x00fd;
    L_0x0227:
        r0 = move-exception;
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        com.whatsapp.util.Log.c(r1, r0);
        r0 = java.lang.Double.valueOf(r12);
        r11.e = r0;
        r0 = com.whatsapp.fieldstats.ay.INVALID_VERSION;
        r0 = r0.getCode();
        r0 = (double) r0;
        r0 = java.lang.Double.valueOf(r0);
        r11.a = r0;
        goto L_0x00fd;
    L_0x0245:
        r0 = move-exception;
        r1 = z;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        com.whatsapp.util.Log.c(r1, r0);	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = r14.e;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r1 = 1;
        r0.a(r1);	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = 0;
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r11.e = r0;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = com.whatsapp.fieldstats.ay.PRE_KEY_MESSAGE_INVALID_KEY;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = r0.getCode();	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = (double) r0;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        r11.a = r0;	 Catch:{ aJ -> 0x0146, a2 -> 0x01c7, ah -> 0x01e7, ba -> 0x0227 }
        goto L_0x00fd;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a13.run():void");
    }

    a13(jg jgVar, b bVar, bz bzVar, String str, m8 m8Var) {
        this.b = jgVar;
        this.e = bVar;
        this.c = bzVar;
        this.d = str;
        this.a = m8Var;
    }
}
