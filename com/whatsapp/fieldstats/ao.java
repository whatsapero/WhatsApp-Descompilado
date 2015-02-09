package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum ao {
    ;
    public static final ao DAILY;
    public static final ao MONTHLY;
    public static final ao WEEKLY;
    private static final ao[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[3];
        String str = "\fb\u000e$j\rt";
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
                        i4 = 65;
                        break;
                    case ay.f /*1*/:
                        i4 = 45;
                        break;
                    case ay.n /*2*/:
                        i4 = 64;
                        break;
                    case ay.p /*3*/:
                        i4 = 112;
                        break;
                    default:
                        i4 = 34;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0005l\t<{";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    DAILY = new ao(z[2], 0, 1);
                    WEEKLY = new ao(z[1], 1, 2);
                    MONTHLY = new ao(z[0], 2, 3);
                    b = new ao[]{DAILY, WEEKLY, MONTHLY};
                default:
                    strArr2[i2] = str;
                    str = "\u0016h\u0005;n\u0018";
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

    private ao(int i) {
        this.a = i;
    }
}
