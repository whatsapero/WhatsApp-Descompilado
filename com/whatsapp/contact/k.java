package com.whatsapp.contact;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum k {
    ;
    public static final k DELAYED;
    public static final k FAILED;
    public static final k IN_PROGRESS;
    public static final k NETWORK_UNAVAILABLE;
    public static final k UP_TO_DATE;
    public static final k USER_IS_EXPIRED;
    private static final String[] z;

    public boolean isFailure() {
        return (this == IN_PROGRESS || isSuccess()) ? false : true;
    }

    public boolean isSuccess() {
        return this == UP_TO_DATE;
    }

    static {
        String[] strArr = new String[6];
        String str = "=.*H97:4H3";
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
                        i4 = 104;
                        break;
                    case ay.f /*1*/:
                        i4 = 126;
                        break;
                    case ay.n /*2*/:
                        i4 = 117;
                        break;
                    case ay.p /*3*/:
                        i4 = 28;
                        break;
                    default:
                        i4 = 118;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "!0*L$'9'Y%;";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = ".?<P3,";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "=-0N)!-*Y.87'Y2";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = ",;9]/-:";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NETWORK_UNAVAILABLE = new k(z[1], 0);
                    IN_PROGRESS = new k(z[2], 1);
                    UP_TO_DATE = new k(z[0], 2);
                    FAILED = new k(z[3], 3);
                    DELAYED = new k(z[5], 4);
                    USER_IS_EXPIRED = new k(z[4], 5);
                    a = new k[]{NETWORK_UNAVAILABLE, IN_PROGRESS, UP_TO_DATE, FAILED, DELAYED, USER_IS_EXPIRED};
                default:
                    strArr2[i2] = str;
                    str = "&;!K9:5*I8)(4U:)<9Y";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
