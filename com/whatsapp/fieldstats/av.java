package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum av {
    ;
    public static final av CORRUPT;
    public static final av MANUAL;
    public static final av RESUME;
    private static final av[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    private av(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[3];
        String str = "\u0012\r(\u0000>\u0001\u0016";
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
                        i4 = 81;
                        break;
                    case ay.f /*1*/:
                        i4 = 66;
                        break;
                    case ay.n /*2*/:
                        i4 = 122;
                        break;
                    case ay.p /*3*/:
                        i4 = 82;
                        break;
                    default:
                        i4 = 107;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0003\u0007)\u0007&\u0014";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    MANUAL = new av(z[1], 0, 1);
                    RESUME = new av(z[2], 1, 2);
                    CORRUPT = new av(z[0], 2, 3);
                    a = new av[]{MANUAL, RESUME, CORRUPT};
                default:
                    strArr2[i2] = str;
                    str = "\u001c\u00034\u0007*\u001d";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
