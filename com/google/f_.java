package com.google;

import java.util.Arrays;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class f_ {
    private static final String[] z;
    private final String a;
    private final int b;
    private final ft c;

    static {
        String[] strArr = new String[3];
        String str = "\u000f\u001f\u0012h\u001c|\u0002\u001d~\r$K\u001eo\u001b(K\u0011\u007fHbVS*F";
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
                        i3 = 92;
                        break;
                    case ay.f /*1*/:
                        i3 = 107;
                        break;
                    case ay.n /*2*/:
                        i3 = 115;
                        break;
                    case ay.p /*3*/:
                        i3 = 26;
                        break;
                    default:
                        i3 = 104;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "uK";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\f\u0003\u001ct\r\u0012\u001e\u001ex\r.&\u0012n\u000b4K(";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.a, this.c});
    }

    f_(int i, String str, ft ftVar) {
        if (i < 0) {
            throw new IllegalArgumentException(z[0]);
        } else if (str == null || ftVar == null) {
            try {
                throw new NullPointerException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else {
            this.b = i;
            this.a = str;
            this.c = ftVar;
        }
    }

    public int b() {
        return this.b + this.a.length();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4_this = this;
        r0 = 1;
        r1 = 0;
        if (r4 != r5) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r2 = r5 instanceof com.google.f_;	 Catch:{ IllegalArgumentException -> 0x000b }
        if (r2 != 0) goto L_0x000d;
    L_0x0009:
        r0 = r1;
        goto L_0x0004;
    L_0x000b:
        r0 = move-exception;
        throw r0;
    L_0x000d:
        r5 = (com.google.f_) r5;
        r2 = r4.a;	 Catch:{ IllegalArgumentException -> 0x002b }
        r3 = r5.a;	 Catch:{ IllegalArgumentException -> 0x002b }
        r2 = r2.equals(r3);	 Catch:{ IllegalArgumentException -> 0x002b }
        if (r2 == 0) goto L_0x0029;
    L_0x0019:
        r2 = r4.b;	 Catch:{ IllegalArgumentException -> 0x002d }
        r3 = r5.b;	 Catch:{ IllegalArgumentException -> 0x002d }
        if (r2 != r3) goto L_0x0029;
    L_0x001f:
        r2 = r4.c;	 Catch:{ IllegalArgumentException -> 0x002f }
        r3 = r5.c;	 Catch:{ IllegalArgumentException -> 0x002f }
        r2 = r2.equals(r3);	 Catch:{ IllegalArgumentException -> 0x002f }
        if (r2 != 0) goto L_0x0004;
    L_0x0029:
        r0 = r1;
        goto L_0x0004;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002f }
    L_0x002f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.f_.equals(java.lang.Object):boolean");
    }

    public String toString() {
        return z[1] + a() + "," + b() + z[2] + this.a;
    }

    public int a() {
        return this.b;
    }
}
