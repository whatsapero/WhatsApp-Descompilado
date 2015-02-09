package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum y2 {
    ;
    public static final y2 CREATED;
    public static final y2 EXPIRED;
    public static final y2 FAIL;
    public static final y2 OK;
    private static final y2[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "I\u001f\u000bw!I\u0003";
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
                        i4 = 12;
                        break;
                    case ay.f /*1*/:
                        i4 = 71;
                        break;
                    case ay.n /*2*/:
                        i4 = 91;
                        break;
                    case ay.p /*3*/:
                        i4 = 62;
                        break;
                    default:
                        i4 = 115;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "O\u0015\u001e\u007f'I\u0003";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "J\u0006\u0012r";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new y2(z[1], 0);
                    EXPIRED = new y2(z[0], 1);
                    FAIL = new y2(z[3], 2);
                    CREATED = new y2(z[2], 3);
                    a = new y2[]{OK, EXPIRED, FAIL, CREATED};
                default:
                    strArr2[i2] = str;
                    str = "C\f";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
