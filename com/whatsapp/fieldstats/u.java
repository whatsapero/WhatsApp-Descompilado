package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum u {
    ;
    public static final u BUSY;
    public static final u NOT_ALLOWED;
    public static final u NO_MESSAGES;
    public static final u SUCCESS;
    private static final u[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[4];
        String str = "e\u0019#\u001e%x\u0005=\u0014%x";
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
                        i4 = 43;
                        break;
                    case ay.f /*1*/:
                        i4 = 86;
                        break;
                    case ay.n /*2*/:
                        i4 = 124;
                        break;
                    case ay.p /*3*/:
                        i4 = 83;
                        break;
                    default:
                        i4 = 96;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "e\u0019(\f!g\u001a3\u0004%o";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "i\u0003/\n";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SUCCESS = new u(z[1], 0, 1);
                    NO_MESSAGES = new u(z[0], 1, 2);
                    BUSY = new u(z[3], 2, 3);
                    NOT_ALLOWED = new u(z[2], 3, 4);
                    b = new u[]{SUCCESS, NO_MESSAGES, BUSY, NOT_ALLOWED};
                default:
                    strArr2[i2] = str;
                    str = "x\u0003?\u0010%x\u0005";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private u(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }
}
