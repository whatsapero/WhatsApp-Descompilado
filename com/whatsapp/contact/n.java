package com.whatsapp.contact;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum n {
    ;
    public static final n BACKGROUND;
    public static final n INTERACTIVE;
    public static final n REGISTRATION;
    private static final String[] z;
    private final String b;

    static {
        String[] strArr = new String[6];
        String str = "Ga\u000b%=Av\r8'Zj";
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
                        i4 = 21;
                        break;
                    case ay.f /*1*/:
                        i4 = 36;
                        break;
                    case ay.n /*2*/:
                        i4 = 76;
                        break;
                    case ay.p /*3*/:
                        i4 = 108;
                        break;
                    default:
                        i4 = 110;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "|J8\t\u001ctG8\u0005\u0018p";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\\j\u0018)<Tg\u0018%8P";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "We\u000f')Gk\u0019\"*";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "wE/\u0007\tgK9\u0002\n";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    REGISTRATION = new n(z[0], 0, z[1]);
                    INTERACTIVE = new n(z[3], 1, z[2]);
                    BACKGROUND = new n(z[4], 2, z[5]);
                    a = new n[]{REGISTRATION, INTERACTIVE, BACKGROUND};
                default:
                    strArr2[i2] = str;
                    str = "gA+\u0005\u001daV-\u0018\u0007zJ";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public String getContextString() {
        return this.b;
    }

    private n(String str) {
        this.b = str;
    }
}
