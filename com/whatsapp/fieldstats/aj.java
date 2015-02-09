package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum aj {
    ;
    public static final aj CREATE_DATA;
    public static final aj DELETE_DATA;
    public static final aj GET_DATA;
    public static final aj SET_DATA;
    private static final aj[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[4];
        String str = "p\u0018!M2v\t4";
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
                        i4 = 55;
                        break;
                    case ay.f /*1*/:
                        i4 = 93;
                        break;
                    case ay.n /*2*/:
                        i4 = 117;
                        break;
                    case ay.p /*3*/:
                        i4 = 18;
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
                    str = "s\u00189W\"r\u00021S\"v";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "t\u000f0S\"r\u00021S\"v";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SET_DATA = new aj(z[1], 0, 1);
                    GET_DATA = new aj(z[0], 1, 2);
                    CREATE_DATA = new aj(z[3], 2, 3);
                    DELETE_DATA = new aj(z[2], 3, 4);
                    b = new aj[]{SET_DATA, GET_DATA, CREATE_DATA, DELETE_DATA};
                default:
                    strArr2[i2] = str;
                    str = "d\u0018!M2v\t4";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private aj(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }
}
