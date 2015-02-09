package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum a6 {
    ;
    public static final a6 CANCEL;
    public static final a6 CURRENT_LOCATION;
    public static final a6 CUSTOM_LOCATION;
    public static final a6 PLACE;
    private static final a6[] a;
    private static final String[] z;
    private final int b;

    static {
        String[] strArr = new String[4];
        String str = "|\u001cyq^q\u001dtoT|\b\u007fjTq";
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
                        i4 = 63;
                        break;
                    case ay.f /*1*/:
                        i4 = 73;
                        break;
                    case ay.n /*2*/:
                        i4 = 43;
                        break;
                    case ay.p /*3*/:
                        i4 = 35;
                        break;
                    default:
                        i4 = 27;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "|\be`^s";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "|\u001cxwTr\u0016glX~\u001dblU";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    CANCEL = new a6(z[2], 0, 1);
                    CURRENT_LOCATION = new a6(z[0], 1, 2);
                    CUSTOM_LOCATION = new a6(z[3], 2, 3);
                    PLACE = new a6(z[1], 3, 4);
                    a = new a6[]{CANCEL, CURRENT_LOCATION, CUSTOM_LOCATION, PLACE};
                default:
                    strArr2[i2] = str;
                    str = "o\u0005j`^";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private a6(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }
}
