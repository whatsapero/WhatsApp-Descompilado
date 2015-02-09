package com.whatsapp.util.dns;

import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class h {
    private static final String[] z;
    private final short a;
    private final String[] b;
    private final int c;

    static {
        String[] strArr = new String[7];
        String str = "\u0004%dK\u0010";
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
                        i3 = 81;
                        break;
                    case ay.f /*1*/:
                        i3 = 113;
                        break;
                    case ay.n /*2*/:
                        i3 = 34;
                        break;
                    case ay.p /*3*/:
                        i3 = 102;
                        break;
                    default:
                        i3 = 40;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0004%dK\u0010";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "%\u001eI\u0003Fq\u001cC\u001f\b?\u001eVFJ4QN\tF6\u0014PF\\9\u0010LF\u001ebQ@\u001f\\4\u0002";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "8\u001fQ\u0013N7\u0018A\u000fM?\u0005\u0002\u0002I%\u0010";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "3\bV\u0003[q\u001cC\u001f\b?\u001eVFJ4QL\u0013D=";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "3\bV\u0003[q\u0018QFA?\u0012M\u000bX=\u0014V\u0003";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "%\u001eI\u0003Fq\u001cC\u001f\b?\u001eVFJ4QN\tF6\u0014PF\\9\u0010LF\u001ebQ@\u001f\\4\u0002";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(java.io.OutputStream r8) {
        /*
        r7_this = this;
        r0 = 0;
        r1 = com.whatsapp.util.dns.b.c;
        r2 = r7.b;
        r3 = r2.length;
    L_0x0006:
        if (r0 >= r3) goto L_0x0030;
    L_0x0008:
        r4 = r2[r0];
        r5 = z;
        r6 = 2;
        r5 = r5[r6];
        r4 = r4.getBytes(r5);
        r5 = r4.length;	 Catch:{ IllegalStateException -> 0x0023 }
        r6 = 63;
        if (r5 <= r6) goto L_0x0025;
    L_0x0018:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0023 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0023 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0023 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0023 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0023 }
    L_0x0023:
        r0 = move-exception;
        throw r0;
    L_0x0025:
        r5 = r4.length;
        r8.write(r5);
        r8.write(r4);
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0006;
    L_0x0030:
        r0 = r7.a;	 Catch:{ IllegalStateException -> 0x004d }
        if (r0 == 0) goto L_0x0048;
    L_0x0034:
        r0 = r7.a;	 Catch:{ IllegalStateException -> 0x004f }
        r0 = r0 >>> 8;
        r0 = r0 & 63;
        r0 = r0 | 192;
        r8.write(r0);	 Catch:{ IllegalStateException -> 0x004f }
        r0 = r7.a;	 Catch:{ IllegalStateException -> 0x004f }
        r0 = r0 & 255;
        r8.write(r0);	 Catch:{ IllegalStateException -> 0x004f }
        if (r1 == 0) goto L_0x004c;
    L_0x0048:
        r0 = 0;
        r8.write(r0);	 Catch:{ IllegalStateException -> 0x004f }
    L_0x004c:
        return;
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.dns.h.a(java.io.OutputStream):void");
    }

    int c() {
        return this.c;
    }

    short b() {
        return this.a;
    }

    String[] a() {
        return this.b;
    }

    private h(String[] strArr, short s, int i) {
        this.b = strArr;
        this.a = s;
        this.c = i;
    }

    static h a(byte[] bArr, int i) {
        short s = (short) 0;
        boolean z = b.c;
        if (bArr == null) {
            try {
                throw new NullPointerException(z[5]);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        try {
            if (bArr.length < 1) {
                throw new IllegalArgumentException(z[4]);
            }
            int i2;
            ArrayList arrayList = new ArrayList();
            StringBuilder stringBuilder = new StringBuilder();
            int i3 = i;
            while (bArr[i3] != null && (bArr[i3] & 192) == 0) {
                byte b = (byte) (bArr[i3] & 63);
                int i4 = i3 + 1;
                try {
                    if (bArr.length >= (i4 + b) + 1) {
                        stringBuilder.setLength(0);
                        byte b2 = (byte) 0;
                        while (b2 < b) {
                            stringBuilder.append((char) bArr[i4 + b2]);
                            b2 = (byte) (b2 + 1);
                            if (z) {
                                break;
                            }
                        }
                        i3 = i4 + b;
                        arrayList.add(stringBuilder.toString());
                        if (z) {
                            break;
                        }
                    }
                    throw new IllegalArgumentException(z[6]);
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            if (bArr[i3] == null) {
                i3++;
                if (!z) {
                    i2 = i3;
                    return new h((String[]) arrayList.toArray(new String[arrayList.size()]), s, i2 - i);
                }
            }
            s = a.a((byte) (bArr[i3] & 63), bArr[i3 + 1]);
            i2 = i3 + 2;
            return new h((String[]) arrayList.toArray(new String[arrayList.size()]), s, i2 - i);
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.whatsapp.util.dns.h a(java.lang.String[] r7, short r8) {
        /*
        r0 = 0;
        r2 = com.whatsapp.util.dns.b.c;
        r3 = r7.length;
        r1 = r0;
    L_0x0005:
        if (r1 >= r3) goto L_0x0033;
    L_0x0007:
        r4 = r7[r1];
        r5 = z;	 Catch:{ UnsupportedEncodingException -> 0x0024 }
        r6 = 0;
        r5 = r5[r6];	 Catch:{ UnsupportedEncodingException -> 0x0024 }
        r4 = r4.getBytes(r5);	 Catch:{ UnsupportedEncodingException -> 0x0024 }
        r5 = r4.length;	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r6 = 63;
        if (r5 <= r6) goto L_0x002b;
    L_0x0017:
        r0 = new java.lang.IllegalStateException;	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r1 = z;	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r0.<init>(r1);	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r0 = move-exception;
        r1 = new java.lang.Error;
        r1.<init>(r0);
        throw r1;
    L_0x002b:
        r4 = r4.length;
        r4 = r4 + 1;
        r0 = r0 + r4;
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x0005;
    L_0x0033:
        if (r8 != 0) goto L_0x0039;
    L_0x0035:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x003b;
    L_0x0039:
        r0 = r0 + 2;
    L_0x003b:
        r1 = new com.whatsapp.util.dns.h;
        r1.<init>(r7, r8, r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.dns.h.a(java.lang.String[], short):com.whatsapp.util.dns.h");
    }
}
