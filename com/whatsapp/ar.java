package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum ar {
    ;
    public static final ar ALLOW;
    public static final ar FORWARD;
    public static final ar NONE;
    public static final ar UPGRADE;
    private static final String[] z;
    private final String b;

    public static ar fromText(String str) {
        int i = m3.d;
        ar[] values = values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            ar arVar = values[i2];
            if (arVar.getText().equals(str)) {
                return arVar;
            }
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        return getDefault();
    }

    static {
        String[] strArr = new String[8];
        String str = "\u0007GM\u00182";
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
                        i4 = 102;
                        break;
                    case ay.f /*1*/:
                        i4 = 43;
                        break;
                    case ay.n /*2*/:
                        i4 = 33;
                        break;
                    case ay.p /*3*/:
                        i4 = 119;
                        break;
                    default:
                        i4 = 69;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0000DS\u0000$\u0014O";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "(do2";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "'gm8\u0012";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "3{f%\u0004\"n";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\bDO\u0012";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = " ds \u00044o";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ALLOW = new ar(z[4], 0, z[0]);
                    UPGRADE = new ar(z[5], 1, z[1]);
                    FORWARD = new ar(z[7], 2, z[2]);
                    NONE = new ar(z[3], 3, z[6]);
                    a = new ar[]{ALLOW, UPGRADE, FORWARD, NONE};
                default:
                    strArr2[i2] = str;
                    str = "\u0013[F\u0005$\u0002N";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static ar getDefault() {
        return ALLOW;
    }

    public String getText() {
        return this.b;
    }

    private ar(String str) {
        this.b = str;
    }
}
