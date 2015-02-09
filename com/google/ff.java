package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum ff {
    ;
    public static final ff INVALID_COUNTRY_CODE;
    public static final ff IS_POSSIBLE;
    public static final ff TOO_LONG;
    public static final ff TOO_SHORT;
    private static final ff[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "x\u001d{\tPx\u0017r\u000bSd\u001dy\u001aEn\u0010b\fY";
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
                        i4 = 49;
                        break;
                    case ay.f /*1*/:
                        i4 = 83;
                        break;
                    case ay.n /*2*/:
                        i4 = 45;
                        break;
                    case ay.p /*3*/:
                        i4 = 72;
                        break;
                    default:
                        i4 = 28;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "e\u001cb\u0017Oy\u001c\u007f\u001c";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "e\u001cb\u0017P~\u001dj";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    IS_POSSIBLE = new ff(z[1], 0);
                    INVALID_COUNTRY_CODE = new ff(z[0], 1);
                    TOO_SHORT = new ff(z[2], 2);
                    TOO_LONG = new ff(z[3], 3);
                    a = new ff[]{IS_POSSIBLE, INVALID_COUNTRY_CODE, TOO_SHORT, TOO_LONG};
                default:
                    strArr2[i2] = str;
                    str = "x\u0000r\u0018Sb\u0000d\nPt";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
