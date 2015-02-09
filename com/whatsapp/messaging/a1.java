package com.whatsapp.messaging;

import java.io.FilterInputStream;
import java.io.InputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class a1 extends FilterInputStream {
    private static final String[] z;
    private boolean a;
    private int b;

    static {
        String[] strArr = new String[12];
        String str = "\u001e,4]\u0000[.u@\u0003\u001e:4F\u001f[";
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
                        i3 = 62;
                        break;
                    case ay.f /*1*/:
                        i3 = 74;
                        break;
                    case ay.n /*2*/:
                        i3 = 85;
                        break;
                    case ay.p /*3*/:
                        i3 = 52;
                        break;
                    default:
                        i3 = 108;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "M>'Q\rSj0Z\b[.uQ\rL&,\u0014\bK8<Z\u000b\u001e:4F\u001f[j3]\u0002_&uW\u0004K$>";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "]\" Z\u0007\u001e&0Z\u000bJ\"u";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "k\u001e\u0013\u0019T";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "M>'Q\rSj0Z\b[.uQ\rL&,\u0014\bK8<Z\u000b\u001e:4F\u001f[j3]\u0002_&uW\u0004K$>";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "]%'F\u0019N>uD\u001f[?1[LV>!DLW$%A\u0018\u001e\u00118U\u0014\u001e\"!@\u001c\u001e\"0U\b[8uX\tP-!\\L[26Q\tZ/1i";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "]\" Z\u0007[.";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "k$0L\u001c[)!\u0014\u0018L+;G\n[8uQ\u0002]%1]\u0002Yj0Z\u000fQ?;@\tL/1\u000eL";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "]%'F\u0019N>uD\u001f[?1[LV>!DLW$%A\u0018\u001e\u00118U\u0014\u001e)=A\u0002Uj=Q\rZ/'\u0014\u0000[$2@\u0004\u001e/-W\t[.0P1";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "j84Z\u001fX/'\u0019)P):P\u0005P-";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "W$uY\rGj;[\u0018\u001e(0\u0014\u0002K&9";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "k\u001e\u0013\u0019T";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        boolean z = au.a;
        int i3 = 0;
        while (i3 < i2) {
            int read = read();
            if (read == -1) {
                return i3;
            }
            bArr[i + i3] = (byte) read;
            i3++;
            if (z) {
                return i2;
            }
        }
        return i2;
    }

    public long skip(long j) {
        boolean z = au.a;
        long j2 = 0;
        while (j2 < j) {
            if (read() == -1) {
                return j2;
            }
            j2++;
            if (z) {
                return j;
            }
        }
        return j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read() {
        /*
        r13_this = this;
        r12 = 10;
        r11 = 1;
        r10 = 0;
        r1 = -1;
        r9 = 2;
        r2 = com.whatsapp.messaging.au.a;
        r0 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r3 = java.nio.ByteBuffer.allocate(r0);
        r4 = r3.array();
    L_0x0012:
        r0 = super.read();
        if (r0 == r1) goto L_0x0175;
    L_0x0018:
        r5 = r13.a;	 Catch:{ NumberFormatException -> 0x002f }
        if (r5 != 0) goto L_0x00bf;
    L_0x001c:
        r5 = r3.remaining();	 Catch:{ NumberFormatException -> 0x002f }
        if (r5 != 0) goto L_0x0031;
    L_0x0022:
        r0 = new java.io.IOException;	 Catch:{ NumberFormatException -> 0x002d }
        r1 = z;	 Catch:{ NumberFormatException -> 0x002d }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x002d }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x002d }
        throw r0;	 Catch:{ NumberFormatException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x002d }
    L_0x0031:
        r5 = (byte) r0;
        r3.put(r5);
        r5 = r3.position();
        if (r5 < r9) goto L_0x0012;
    L_0x003b:
        r5 = r3.position();
        r5 = r5 + -1;
        r5 = r4[r5];
        if (r5 != r12) goto L_0x0012;
    L_0x0045:
        r5 = r3.position();
        r5 = r5 + -2;
        r5 = r4[r5];
        r6 = 13;
        if (r5 != r6) goto L_0x0012;
    L_0x0051:
        r5 = r3.position();	 Catch:{ NumberFormatException -> 0x00b6 }
        if (r5 != r9) goto L_0x005c;
    L_0x0057:
        r5 = 1;
        r13.a = r5;	 Catch:{ NumberFormatException -> 0x00b6 }
        if (r2 == 0) goto L_0x00ba;
    L_0x005c:
        r5 = new java.lang.String;
        r6 = r3.position();
        r6 = r6 + -2;
        r7 = z;
        r7 = r7[r11];
        r5.<init>(r4, r10, r6, r7);
        r6 = ":";
        r5 = r5.split(r6, r9);
        r6 = r5.length;
        if (r6 != r9) goto L_0x00ba;
    L_0x0074:
        r6 = r5[r10];
        r6 = r6.trim();
        r5 = r5[r11];
        r5 = r5.trim();
        r7 = z;	 Catch:{ NumberFormatException -> 0x00b8 }
        r8 = 10;
        r7 = r7[r8];	 Catch:{ NumberFormatException -> 0x00b8 }
        r6 = r6.equalsIgnoreCase(r7);	 Catch:{ NumberFormatException -> 0x00b8 }
        if (r6 == 0) goto L_0x00ba;
    L_0x008c:
        r6 = z;	 Catch:{ NumberFormatException -> 0x00b8 }
        r7 = 7;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x00b8 }
        r6 = r5.equalsIgnoreCase(r6);	 Catch:{ NumberFormatException -> 0x00b8 }
        if (r6 != 0) goto L_0x00ba;
    L_0x0097:
        r0 = new java.io.IOException;	 Catch:{ NumberFormatException -> 0x00b4 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00b4 }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x00b4 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x00b4 }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x00b4 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x00b4 }
        r1 = r1.append(r5);	 Catch:{ NumberFormatException -> 0x00b4 }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x00b4 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x00b4 }
        throw r0;	 Catch:{ NumberFormatException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;
    L_0x00b6:
        r0 = move-exception;
        throw r0;
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00b4 }
    L_0x00ba:
        r3.clear();
        if (r2 == 0) goto L_0x0012;
    L_0x00bf:
        r5 = r13.b;	 Catch:{ NumberFormatException -> 0x00ca }
        if (r5 <= 0) goto L_0x00cc;
    L_0x00c3:
        r1 = r13.b;	 Catch:{ NumberFormatException -> 0x00ca }
        r1 = r1 + -1;
        r13.b = r1;	 Catch:{ NumberFormatException -> 0x00ca }
    L_0x00c9:
        return r0;
    L_0x00ca:
        r0 = move-exception;
        throw r0;
    L_0x00cc:
        r5 = r3.remaining();	 Catch:{ NumberFormatException -> 0x00de }
        if (r5 != 0) goto L_0x00e0;
    L_0x00d2:
        r0 = new java.io.IOException;	 Catch:{ NumberFormatException -> 0x00de }
        r1 = z;	 Catch:{ NumberFormatException -> 0x00de }
        r2 = 9;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x00de }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x00de }
        throw r0;	 Catch:{ NumberFormatException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        throw r0;
    L_0x00e0:
        r0 = (byte) r0;
        r3.put(r0);
        r0 = r3.position();
        if (r0 < r9) goto L_0x0012;
    L_0x00ea:
        r0 = r3.position();
        r0 = r0 + -1;
        r0 = r4[r0];
        if (r0 != r12) goto L_0x0012;
    L_0x00f4:
        r0 = r3.position();
        r0 = r0 + -2;
        r0 = r4[r0];
        r5 = 13;
        if (r0 != r5) goto L_0x0012;
    L_0x0100:
        r0 = r3.position();
        if (r0 <= r9) goto L_0x0170;
    L_0x0106:
        r0 = new java.lang.String;
        r5 = r3.position();
        r5 = r5 + -2;
        r6 = z;
        r7 = 4;
        r6 = r6[r7];
        r0.<init>(r4, r10, r5, r6);
        r5 = 16;
        r5 = java.lang.Integer.parseInt(r0, r5);	 Catch:{ NumberFormatException -> 0x0135 }
        r13.b = r5;	 Catch:{ NumberFormatException -> 0x0135 }
        r0 = r13.b;
        if (r0 != 0) goto L_0x0170;
    L_0x0122:
        r0 = super.read();
        if (r0 != r1) goto L_0x015a;
    L_0x0128:
        r0 = new java.io.IOException;	 Catch:{ NumberFormatException -> 0x0133 }
        r1 = z;	 Catch:{ NumberFormatException -> 0x0133 }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0133 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x0133 }
        throw r0;	 Catch:{ NumberFormatException -> 0x0133 }
    L_0x0133:
        r0 = move-exception;
        throw r0;
    L_0x0135:
        r1 = move-exception;
        r1 = new java.io.IOException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r2 = z;
        r2 = r2[r10];
        r0 = r0.append(r2);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x015a:
        r0 = super.read();
        if (r0 != r1) goto L_0x016d;
    L_0x0160:
        r0 = new java.io.IOException;	 Catch:{ NumberFormatException -> 0x016b }
        r1 = z;	 Catch:{ NumberFormatException -> 0x016b }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x016b }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x016b }
        throw r0;	 Catch:{ NumberFormatException -> 0x016b }
    L_0x016b:
        r0 = move-exception;
        throw r0;
    L_0x016d:
        r0 = r1;
        goto L_0x00c9;
    L_0x0170:
        r3.clear();
        if (r2 == 0) goto L_0x0012;
    L_0x0175:
        r0 = r1;
        goto L_0x00c9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.a1.read():int");
    }

    public synchronized void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public a1(InputStream inputStream) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException(z[11]);
        }
    }

    public synchronized void reset() {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int available() {
        return 0;
    }
}
