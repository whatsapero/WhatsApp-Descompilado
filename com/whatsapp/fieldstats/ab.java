package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum ab {
    ;
    public static final ab CELLULAR_1XRTT;
    public static final ab CELLULAR_CDMA;
    public static final ab CELLULAR_EDGE;
    public static final ab CELLULAR_EHRPD;
    public static final ab CELLULAR_EVDO;
    public static final ab CELLULAR_GPRS;
    public static final ab CELLULAR_HSDPA;
    public static final ab CELLULAR_HSPA;
    public static final ab CELLULAR_HSPAP;
    public static final ab CELLULAR_HSUPA;
    public static final ab CELLULAR_IDEN;
    public static final ab CELLULAR_LTE;
    public static final ab CELLULAR_UMTS;
    public static final ab CELLULAR_UNKNOWN;
    public static final ab WIFI_UNKNOWN;
    private static final ab[] a;
    private static final String[] z;
    private final int b;

    private ab(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[15];
        String str = "]\t5]#R\r+N>M\u001c8";
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
                        i4 = 30;
                        break;
                    case ay.f /*1*/:
                        i4 = 76;
                        break;
                    case ay.n /*2*/:
                        i4 = 121;
                        break;
                    case ay.p /*3*/:
                        i4 = 17;
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
                    str = "]\t5]#R\r+N5Z\u00018";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "]\t5]#R\r+N?Z\t7";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "I\u0005?X)K\u00022_9I\u0002";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "]\t5]#R\r+N3V\u001e)U";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "]\t5]#R\r+N:J\t";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "]\t5]#R\r+N3H\b6";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "]\t5]#R\r+N3Z\u000b<";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "]\t5]#R\r+N>M\b)P";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "]\t5]#R\r+N>M\u0019)P";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "]\t5]#R\r+NGF\u001e-E";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "]\t5]#R\r+N#P\u00077^!P";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "]\t5]#R\r+N#S\u0018*";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "]\t5]#R\r+N>M\u001c8A";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    CELLULAR_UNKNOWN = new ab(z[12], 0, 0);
                    WIFI_UNKNOWN = new ab(z[4], 1, 1);
                    CELLULAR_EDGE = new ab(z[8], 2, 100);
                    CELLULAR_IDEN = new ab(z[3], 3, 101);
                    CELLULAR_UMTS = new ab(z[13], 4, 102);
                    CELLULAR_EVDO = new ab(z[7], 5, 103);
                    CELLULAR_GPRS = new ab(z[1], 6, 104);
                    CELLULAR_HSDPA = new ab(z[9], 7, 105);
                    CELLULAR_HSUPA = new ab(z[10], 8, 106);
                    CELLULAR_HSPA = new ab(z[0], 9, 107);
                    CELLULAR_CDMA = new ab(z[2], 10, 108);
                    CELLULAR_1XRTT = new ab(z[11], 11, 109);
                    CELLULAR_EHRPD = new ab(z[5], 12, 110);
                    CELLULAR_LTE = new ab(z[6], 13, 111);
                    CELLULAR_HSPAP = new ab(z[14], 14, 112);
                    a = new ab[]{CELLULAR_UNKNOWN, WIFI_UNKNOWN, CELLULAR_EDGE, CELLULAR_IDEN, CELLULAR_UMTS, CELLULAR_EVDO, CELLULAR_GPRS, CELLULAR_HSDPA, CELLULAR_HSUPA, CELLULAR_HSPA, CELLULAR_CDMA, CELLULAR_1XRTT, CELLULAR_EHRPD, CELLULAR_LTE, CELLULAR_HSPAP};
                default:
                    strArr2[i2] = str;
                    str = "]\t5]#R\r+N1N\u001e*";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.b;
    }
}
