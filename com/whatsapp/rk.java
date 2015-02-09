package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum rk {
    ;
    public static final rk CANCEL;
    public static final rk FAILED_BAD_MEDIA;
    public static final rk FAILED_GENERIC;
    public static final rk FAILED_INSUFFICIENT_SPACE;
    public static final rk FAILED_IO;
    public static final rk FAILED_NO_PERMISSIONS;
    public static final rk FAILED_OOM;
    public static final rk SUCCESS;
    private static final rk[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[8];
        String str = "\u0001<\u00109R\u0003\"\u0010:";
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
                        i4 = 71;
                        break;
                    case ay.f /*1*/:
                        i4 = 125;
                        break;
                    case ay.n /*2*/:
                        i4 = 89;
                        break;
                    case ay.p /*3*/:
                        i4 = 117;
                        break;
                    default:
                        i4 = 23;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0001<\u00109R\u0003\"\u0010;D\u0012;\u001f<T\u000e8\u0017!H\u0014-\u00186R";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u0001<\u00109R\u0003\"\u001e0Y\u0002/\u00106";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\u0004<\u00176R\u000b";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u0014(\u001a6R\u0014.";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0001<\u00109R\u0003\"\u001b4S\u00180\u001c1^\u0006";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0001<\u00109R\u0003\"\u0016:Z";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SUCCESS = new rk(z[5], 0);
                    FAILED_GENERIC = new rk(z[3], 1);
                    FAILED_INSUFFICIENT_SPACE = new rk(z[2], 2);
                    FAILED_IO = new rk(z[0], 3);
                    FAILED_OOM = new rk(z[7], 4);
                    FAILED_BAD_MEDIA = new rk(z[6], 5);
                    FAILED_NO_PERMISSIONS = new rk(z[1], 6);
                    CANCEL = new rk(z[4], 7);
                    a = new rk[]{SUCCESS, FAILED_GENERIC, FAILED_INSUFFICIENT_SPACE, FAILED_IO, FAILED_OOM, FAILED_BAD_MEDIA, FAILED_NO_PERMISSIONS, CANCEL};
                default:
                    strArr2[i2] = str;
                    str = "\u0001<\u00109R\u0003\"\u0017:H\u00178\u000b8^\u0014.\u0010:Y\u0014";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
