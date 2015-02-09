package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum as {
    ;
    public static final as EMAIL_SEND;
    public static final as PROBLEM_DESCRIPTION;
    public static final as SUGGESTED_FAQ;
    private static final as[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[3];
        String str = "4/\u0013KI.1\u0017LA";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 113;
                        break;
                    case ay.f /*1*/:
                        i4 = 98;
                        break;
                    case ay.n /*2*/:
                        i4 = 82;
                        break;
                    case ay.p /*3*/:
                        i4 = 2;
                        break;
                    default:
                        i4 = 5;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "!0\u001d@I4/\rF@\"!\u0000KU%+\u001dL";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    PROBLEM_DESCRIPTION = new as(z[2], 0, 1);
                    SUGGESTED_FAQ = new as(z[1], 1, 2);
                    EMAIL_SEND = new as(z[0], 2, 3);
                    a = new as[]{PROBLEM_DESCRIPTION, SUGGESTED_FAQ, EMAIL_SEND};
                default:
                    strArr2[i2] = str;
                    str = "\"7\u0015E@\"6\u0017FZ7#\u0003";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private as(int i) {
        this.b = i;
    }
}
