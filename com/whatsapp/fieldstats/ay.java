package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;

public enum ay {
    ;
    public static final ay INVALID_MESSAGE;
    public static final ay INVALID_VERSION;
    public static final ay LEGACY_MESSAGE;
    public static final ay NO_SESSION_AVAILABLE;
    public static final ay PLAINTEXT_BYTE_MISMATCH;
    public static final ay PRE_KEY_MESSAGE_INVALID_KEY;
    public static final ay PRE_KEY_MESSAGE_MISSING_PRE_KEY;
    public static final ay UNTRUSTED_IDENTITY;
    private static final ay[] a;
    private static final String[] z;
    private final int b;

    private ay(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[8];
        String str = "\u0002BjL\u0011\u0004X{Z\u001b\u001eH{P\u0010\u001eXg";
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
                        i4 = 87;
                        break;
                    case org.whispersystems.libaxolotl.ay.f /*1*/:
                        i4 = 12;
                        break;
                    case org.whispersystems.libaxolotl.ay.n /*2*/:
                        i4 = 62;
                        break;
                    case org.whispersystems.libaxolotl.ay.p /*3*/:
                        i4 = 30;
                        break;
                    default:
                        i4 = 68;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0007^{A\u000f\u0012UaS\u0001\u0004_\u007fY\u0001\bEpH\u0005\u001bEzA\u000f\u0012U";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case org.whispersystems.libaxolotl.ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u0007@\u007fW\n\u0003IfJ\u001b\u0015Uj[\u001b\u001aEmS\u0005\u0003Ov";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case org.whispersystems.libaxolotl.ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\u001eBh_\b\u001eHaH\u0001\u0005_wQ\n";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case org.whispersystems.libaxolotl.ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u001bIy_\u0007\u000eSs[\u0017\u0004My[";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u001eBh_\b\u001eHaS\u0001\u0004_\u007fY\u0001";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0019CaM\u0001\u0004_wQ\n\bMh_\r\u001bM|R\u0001";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    INVALID_MESSAGE = new ay(z[6], 0, 0);
                    LEGACY_MESSAGE = new ay(z[5], 1, 1);
                    INVALID_VERSION = new ay(z[4], 2, 2);
                    PRE_KEY_MESSAGE_MISSING_PRE_KEY = new ay(z[1], 3, 3);
                    PRE_KEY_MESSAGE_INVALID_KEY = new ay(z[2], 4, 4);
                    UNTRUSTED_IDENTITY = new ay(z[0], 5, 5);
                    NO_SESSION_AVAILABLE = new ay(z[7], 6, 6);
                    PLAINTEXT_BYTE_MISMATCH = new ay(z[3], 7, 7);
                    a = new ay[]{INVALID_MESSAGE, LEGACY_MESSAGE, INVALID_VERSION, PRE_KEY_MESSAGE_MISSING_PRE_KEY, PRE_KEY_MESSAGE_INVALID_KEY, UNTRUSTED_IDENTITY, NO_SESSION_AVAILABLE, PLAINTEXT_BYTE_MISMATCH};
                default:
                    strArr2[i2] = str;
                    str = "\u0007^{A\u000f\u0012UaS\u0001\u0004_\u007fY\u0001\bAwM\u0017\u001eByA\u0014\u0005IaU\u0001\u000e";
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
