package org.spongycastle.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class Strings {
    private static final String[] z;

    static {
        int i;
        int i2;
        String[] strArr = new String[3];
        char[] toCharArray = "IW~a$^\u0016ua(ERu/8^Dya,\nB\u007f/)SBu/*XDqvj".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 42;
                    break;
                case ay.f /*1*/:
                    i2 = 54;
                    break;
                case ay.n /*2*/:
                    i2 = 16;
                    break;
                case ay.p /*3*/:
                    i2 = 15;
                    break;
                default:
                    i2 = 75;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "CXfn'CR0Z\u001fl\u001b!9kIYtj;E_~{".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 42;
                    break;
                case ay.f /*1*/:
                    i2 = 54;
                    break;
                case ay.n /*2*/:
                    i2 = 16;
                    break;
                case ay.p /*3*/:
                    i2 = 15;
                    break;
                default:
                    i2 = 75;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "CXfn'CR0Z\u001fl\u001b!9kIYtj;E_~{".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 42;
                    break;
                case ay.f /*1*/:
                    i2 = 54;
                    break;
                case ay.n /*2*/:
                    i2 = 16;
                    break;
                case ay.p /*3*/:
                    i2 = 15;
                    break;
                default:
                    i2 = 75;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[2] = new String(cArr).intern();
        z = strArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void toUTF8ByteArray(char[] r5, java.io.OutputStream r6) {
        /*
        r3 = org.spongycastle.util.Pack.a;
        r0 = 0;
    L_0x0003:
        r1 = r5.length;
        if (r0 >= r1) goto L_0x00a8;
    L_0x0006:
        r2 = r5[r0];
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 >= r1) goto L_0x0011;
    L_0x000c:
        r6.write(r2);	 Catch:{ IllegalStateException -> 0x0041 }
        if (r3 == 0) goto L_0x00a4;
    L_0x0011:
        r1 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        if (r2 >= r1) goto L_0x0025;
    L_0x0015:
        r1 = r2 >> 6;
        r1 = r1 | 192;
        r6.write(r1);	 Catch:{ IllegalStateException -> 0x0045 }
        r1 = r2 & 63;
        r1 = r1 | 128;
        r6.write(r1);	 Catch:{ IllegalStateException -> 0x0045 }
        if (r3 == 0) goto L_0x00a4;
    L_0x0025:
        r1 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r1) goto L_0x00ab;
    L_0x002a:
        r1 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r2 > r1) goto L_0x00ab;
    L_0x002f:
        r1 = r0 + 1;
        r4 = r5.length;	 Catch:{ IllegalStateException -> 0x003f }
        if (r1 < r4) goto L_0x004b;
    L_0x0034:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x003f }
        r1 = z;	 Catch:{ IllegalStateException -> 0x003f }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x003f }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x003f }
        throw r0;	 Catch:{ IllegalStateException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x003f }
    L_0x004b:
        r0 = r0 + 1;
        r1 = r5[r0];
        r4 = 56319; // 0xdbff float:7.892E-41 double:2.78253E-319;
        if (r2 <= r4) goto L_0x0061;
    L_0x0054:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x005f }
        r1 = z;	 Catch:{ IllegalStateException -> 0x005f }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x005f }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x005f }
        throw r0;	 Catch:{ IllegalStateException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;
    L_0x0061:
        r2 = r2 & 1023;
        r2 = r2 << 10;
        r4 = r1 & 1023;
        r2 = r2 | r4;
        r4 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r2 = r2 + r4;
        r4 = r2 >> 18;
        r4 = r4 | 240;
        r6.write(r4);	 Catch:{ IllegalStateException -> 0x00a9 }
        r4 = r2 >> 12;
        r4 = r4 & 63;
        r4 = r4 | 128;
        r6.write(r4);	 Catch:{ IllegalStateException -> 0x00a9 }
        r4 = r2 >> 6;
        r4 = r4 & 63;
        r4 = r4 | 128;
        r6.write(r4);	 Catch:{ IllegalStateException -> 0x00a9 }
        r2 = r2 & 63;
        r2 = r2 | 128;
        r6.write(r2);	 Catch:{ IllegalStateException -> 0x00a9 }
        if (r3 == 0) goto L_0x00a4;
    L_0x008d:
        r2 = r1 >> 12;
        r2 = r2 | 224;
        r6.write(r2);	 Catch:{ IllegalStateException -> 0x00a9 }
        r2 = r1 >> 6;
        r2 = r2 & 63;
        r2 = r2 | 128;
        r6.write(r2);	 Catch:{ IllegalStateException -> 0x00a9 }
        r1 = r1 & 63;
        r1 = r1 | 128;
        r6.write(r1);	 Catch:{ IllegalStateException -> 0x00a9 }
    L_0x00a4:
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0003;
    L_0x00a8:
        return;
    L_0x00a9:
        r0 = move-exception;
        throw r0;
    L_0x00ab:
        r1 = r2;
        goto L_0x008d;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.util.Strings.toUTF8ByteArray(char[], java.io.OutputStream):void");
    }

    public static String toUpperCase(String str) {
        int i = 0;
        boolean z = Pack.a;
        char[] toCharArray = str.toCharArray();
        int i2 = 0;
        while (i != toCharArray.length) {
            char c = toCharArray[i];
            if ('a' <= c && 'z' >= c) {
                i2 = 1;
                toCharArray[i] = (char) ((c - 97) + 65);
            }
            i++;
            if (z) {
                break;
            }
        }
        if (i2 == 0) {
            return str;
        }
        try {
            return new String(toCharArray);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public static byte[] toUTF8ByteArray(char[] cArr) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            toUTF8ByteArray(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(z[0]);
        }
    }
}
