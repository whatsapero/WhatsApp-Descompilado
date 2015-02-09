package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum x {
    ;
    public static final x DELAYED;
    public static final x FAILED;
    public static final x IN_PROGRESS;
    public static final x NETWORK_UNAVAILABLE;
    public static final x UP_TO_DATE;
    public static final x USER_IS_EXPIRED;
    private static final x[] b;
    private static final String[] z;
    private final int a;

    private x(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[6];
        String str = "\u001bF\u0010I8\u0011R\u000eI2";
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
                        i4 = 78;
                        break;
                    case ay.f /*1*/:
                        i4 = 22;
                        break;
                    case ay.n /*2*/:
                        i4 = 79;
                        break;
                    case ay.p /*3*/:
                        i4 = 29;
                        break;
                    default:
                        i4 = 119;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0007X\u0010M%\u0001Q\u001dX$\u001d";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\nS\u0003\\.\u000bR";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\u001bE\nO(\u0007E\u0010X/\u001e_\u001dX3";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u0000S\u001bJ8\u001c]\u0010H9\u000f@\u000eT;\u000fT\u0003X";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NETWORK_UNAVAILABLE = new x(z[5], 0, 1);
                    IN_PROGRESS = new x(z[2], 1, 2);
                    UP_TO_DATE = new x(z[0], 2, 3);
                    FAILED = new x(z[1], 3, 4);
                    DELAYED = new x(z[3], 4, 5);
                    USER_IS_EXPIRED = new x(z[4], 5, 6);
                    b = new x[]{NETWORK_UNAVAILABLE, IN_PROGRESS, UP_TO_DATE, FAILED, DELAYED, USER_IS_EXPIRED};
                default:
                    strArr2[i2] = str;
                    str = "\bW\u0006Q2\n";
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
}
