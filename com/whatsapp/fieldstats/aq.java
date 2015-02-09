package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum aq {
    ;
    public static final aq ERROR_FAILED;
    public static final aq ERROR_PROVIDER;
    public static final aq ERROR_REQUEST;
    public static final aq SUCCESS;
    private static final aq[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[4];
        String str = "ml^@Bmj";
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
                        i4 = 62;
                        break;
                    case ay.f /*1*/:
                        i4 = 57;
                        break;
                    case ay.n /*2*/:
                        i4 = 29;
                        break;
                    case ay.p /*3*/:
                        i4 = 3;
                        break;
                    default:
                        i4 = 7;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "{kOLUa\u007f\\JK{}";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "{kOLUakXRR{jI";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SUCCESS = new aq(z[0], 0, 1);
                    ERROR_PROVIDER = new aq(z[1], 1, 2);
                    ERROR_REQUEST = new aq(z[3], 2, 3);
                    ERROR_FAILED = new aq(z[2], 3, 4);
                    a = new aq[]{SUCCESS, ERROR_PROVIDER, ERROR_REQUEST, ERROR_FAILED};
                default:
                    strArr2[i2] = str;
                    str = "{kOLUaiOLQw}XQ";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private aq(int i) {
        this.b = i;
    }
}
