package com.whatsapp.messaging;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

enum ao {
    ;
    public static final ao DEBUG_CHAT_HOST;
    public static final ao END;
    public static final ao FALLBACKS;
    public static final ao HTTP;
    public static final ao IP_OVERRIDE_PORT_1;
    public static final ao IP_OVERRIDE_PORT_2;
    public static final ao OVERRIDES;
    public static final ao PRIMARY;
    public static final ao START;
    private static final ao[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[9];
        String str = "\u001c\u0004\\\u0015";
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
                        i4 = 84;
                        break;
                    case ay.f /*1*/:
                        i4 = 80;
                        break;
                    case ay.n /*2*/:
                        i4 = 8;
                        break;
                    case ay.p /*3*/:
                        i4 = 69;
                        break;
                    default:
                        i4 = 47;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u001d\u0000W\ny\u0011\u0002Z\fk\u0011\u000fX\n}\u0000\u000f9";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u0010\u0015J\u0010h\u000b\u0013@\u0004{\u000b\u0018G\u0016{";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\u001b\u0006M\u0017}\u001d\u0014M\u0016";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u001d\u0000W\ny\u0011\u0002Z\fk\u0011\u000fX\n}\u0000\u000f:";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0007\u0004I\u0017{";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0004\u0002A\bn\u0006\t";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u0011\u001eL";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    START = new ao(z[6], 0);
                    DEBUG_CHAT_HOST = new ao(z[3], 1);
                    OVERRIDES = new ao(z[4], 2);
                    IP_OVERRIDE_PORT_1 = new ao(z[2], 3);
                    IP_OVERRIDE_PORT_2 = new ao(z[5], 4);
                    PRIMARY = new ao(z[7], 5);
                    FALLBACKS = new ao(z[1], 6);
                    HTTP = new ao(z[0], 7);
                    END = new ao(z[8], 8);
                    a = new ao[]{START, DEBUG_CHAT_HOST, OVERRIDES, IP_OVERRIDE_PORT_1, IP_OVERRIDE_PORT_2, PRIMARY, FALLBACKS, HTTP, END};
                default:
                    strArr2[i2] = str;
                    str = "\u0012\u0011D\tm\u0015\u0013C\u0016";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
