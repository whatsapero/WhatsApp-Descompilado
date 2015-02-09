package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum ac {
    ;
    public static final ac AUTH_FAILED;
    public static final ac BACKUP_SERVER_UNREACHABLE;
    public static final ac DATA_CONNECTION_REQUIRED_BUT_MISSING;
    public static final ac NO_SPACE_AVAILABLE;
    public static final ac OK;
    public static final ac UNKNOWN_ERROR;
    public static final ac WIFI_REQUIRED_BUT_MISSING;
    private static final ac[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[7];
        String str = "P\u001b\u00023\u000fW\u0015\u0018<\u0015W\u000e\u001f=\u001eK\b\u0013#\u0005]\b\u00136\u000fV\u000f\u0002-\u001d]\t\u0005;\u001eS";
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
                        i4 = 20;
                        break;
                    case ay.f /*1*/:
                        i4 = 90;
                        break;
                    case ay.n /*2*/:
                        i4 = 86;
                        break;
                    case ay.p /*3*/:
                        i4 = 114;
                        break;
                    default:
                        i4 = 80;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "U\u000f\u0002:\u000fR\u001b\u001f>\u0015P";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "Z\u0015\t!\u0000U\u0019\u0013-\u0011B\u001b\u001f>\u0011V\u0016\u0013";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "A\u0014\u001d<\u001fC\u0014\t7\u0002F\u0015\u0004";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "[\u0011";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "C\u0013\u0010;\u000fF\u001f\u0007'\u0019F\u001f\u0012-\u0012A\u000e\t?\u0019G\t\u001f<\u0017";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new ac(z[5], 0, 1);
                    UNKNOWN_ERROR = new ac(z[4], 1, 2);
                    NO_SPACE_AVAILABLE = new ac(z[3], 2, 3);
                    DATA_CONNECTION_REQUIRED_BUT_MISSING = new ac(z[0], 3, 7);
                    WIFI_REQUIRED_BUT_MISSING = new ac(z[6], 4, 4);
                    BACKUP_SERVER_UNREACHABLE = new ac(z[1], 5, 5);
                    AUTH_FAILED = new ac(z[2], 6, 6);
                    b = new ac[]{OK, UNKNOWN_ERROR, NO_SPACE_AVAILABLE, DATA_CONNECTION_REQUIRED_BUT_MISSING, WIFI_REQUIRED_BUT_MISSING, BACKUP_SERVER_UNREACHABLE, AUTH_FAILED};
                default:
                    strArr2[i2] = str;
                    str = "V\u001b\u00159\u0005D\u0005\u00057\u0002B\u001f\u0004-\u0005Z\b\u00133\u0013\\\u001b\u0014>\u0015";
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

    private ac(int i) {
        this.a = i;
    }
}
