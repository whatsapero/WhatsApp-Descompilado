package com.whatsapp.contact;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum m {
    ;
    public static final m BOTH;
    public static final m INVISIBLE_ONLY;
    public static final m VISIBLE_ONLY;
    private static final m[] b;
    private static final String[] z;
    private final String[] a;

    static {
        String[] strArr = new String[4];
        String str = "`SNa4zTs{8VZcx(y\u001d,7b";
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
                        i4 = 9;
                        break;
                    case ay.f /*1*/:
                        i4 = 61;
                        break;
                    case ay.n /*2*/:
                        i4 = 17;
                        break;
                    case ay.p /*3*/:
                        i4 = 23;
                        break;
                    default:
                        i4 = 93;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "@sG^\u000e@\u007f]R\u0002Fs]N";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "_tB^\u001fExNX\u0013Ed";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    BOTH = new m(z[1], 0, null);
                    VISIBLE_ONLY = new m(z[3], 1, new String[]{"1"});
                    INVISIBLE_ONLY = new m(z[2], 2, new String[]{"0"});
                    b = new m[]{BOTH, VISIBLE_ONLY, INVISIBLE_ONLY};
                default:
                    strArr2[i2] = str;
                    str = "KrE_";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private m(String[] strArr) {
        this.a = strArr;
    }

    public String getWhereClause() {
        return this.a != null ? z[0] : null;
    }

    public String[] getWhereArgs() {
        return this.a;
    }
}
