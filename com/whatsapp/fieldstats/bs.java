package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum bs {
    ;
    public static final bs CONNECTED;
    public static final bs DISCONNECTED;
    public static final bs PASSWORD_FAIL;
    public static final bs SOCKET_CONNECTING;
    public static final bs XMPP_CONNECTING;
    private static final bs[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[5];
        String str = "6\u0013!}\u00036\b*w";
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
                        i4 = 117;
                        break;
                    case ay.f /*1*/:
                        i4 = 92;
                        break;
                    case ay.n /*2*/:
                        i4 = 111;
                        break;
                    case ay.p /*3*/:
                        i4 = 51;
                        break;
                    default:
                        i4 = 70;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "%\u001d<`\u0011:\u000e+l\u00004\u0015#";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "-\u0011?c\u00196\u0013!}\u00036\b&}\u0001";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "1\u0015<p\t;\u0012*p\u00120\u0018";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    CONNECTED = new bs(z[0], 0, 0);
                    SOCKET_CONNECTING = new bs(z[1], 1, 1);
                    XMPP_CONNECTING = new bs(z[3], 2, 2);
                    DISCONNECTED = new bs(z[4], 3, 3);
                    PASSWORD_FAIL = new bs(z[2], 4, 4);
                    a = new bs[]{CONNECTED, SOCKET_CONNECTING, XMPP_CONNECTING, DISCONNECTED, PASSWORD_FAIL};
                default:
                    strArr2[i2] = str;
                    str = "&\u0013,x\u0003!\u0003,|\b;\u0019,g\u000f;\u001b";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private bs(int i) {
        this.b = i;
    }
}
