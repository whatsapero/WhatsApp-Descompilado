package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum am {
    ;
    public static final am AUDIO;
    public static final am CONTACT;
    public static final am LOCATION;
    public static final am NONE;
    public static final am PHOTO;
    public static final am PTT;
    public static final am VIDEO;
    private static final am[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[7];
        String str = "N[f\u0014\u0016";
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
                        i4 = 15;
                        break;
                    case ay.f /*1*/:
                        i4 = 14;
                        break;
                    case ay.n /*2*/:
                        i4 = 34;
                        break;
                    case ay.p /*3*/:
                        i4 = 93;
                        break;
                    default:
                        i4 = 89;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "LAl\t\u0018LZ";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "AAl\u0018";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "YGf\u0018\u0016";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "_Fm\t\u0016";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "_Zv";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NONE = new am(z[3], 0, 1);
                    PHOTO = new am(z[5], 1, 2);
                    VIDEO = new am(z[4], 2, 3);
                    AUDIO = new am(z[0], 3, 4);
                    PTT = new am(z[6], 4, 5);
                    LOCATION = new am(z[1], 5, 6);
                    CONTACT = new am(z[2], 6, 7);
                    b = new am[]{NONE, PHOTO, VIDEO, AUDIO, PTT, LOCATION, CONTACT};
                default:
                    strArr2[i2] = str;
                    str = "CAa\u001c\rFAl";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.a;
    }

    private am(int i) {
        this.a = i;
    }
}
