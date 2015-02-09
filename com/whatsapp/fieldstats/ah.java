package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum ah {
    ;
    public static final ah DEDUPED;
    public static final ah ERROR_CANCEL;
    public static final ah ERROR_CANNOT_RESUME;
    public static final ah ERROR_DNS;
    public static final ah ERROR_HASH_MISMATCH;
    public static final ah ERROR_INSUFFICIENT_SPACE;
    public static final ah ERROR_INVALID_URL;
    public static final ah ERROR_OUTPUT_STREAM;
    public static final ah ERROR_TIMEOUT;
    public static final ah ERROR_TOO_OLD;
    public static final ah ERROR_UNKNOWN;
    public static final ah OK;
    private static final ah[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[12];
        String str = "a\u0004\u000eM\u000b{\u001f\u0012Q\fb\u0010\u0015A\u0010a\u0018\b]\nt\u0017\u001fG";
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
                        i4 = 36;
                        break;
                    case ay.f /*1*/:
                        i4 = 86;
                        break;
                    case ay.n /*2*/:
                        i4 = 92;
                        break;
                    case ay.p /*3*/:
                        i4 = 2;
                        break;
                    default:
                        i4 = 89;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "a\u0004\u000eM\u000b{\u0019\tV\tq\u0002\u0003Q\rv\u0013\u001dO";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "`\u0013\u0018W\ta\u0012";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "a\u0004\u000eM\u000b{\u001f\u0012T\u0018h\u001f\u0018]\fv\u001a";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "k\u001d";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "a\u0004\u000eM\u000b{\u0015\u001dL\u001aa\u001a";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "a\u0004\u000eM\u000b{\u0012\u0012Q";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "a\u0004\u000eM\u000b{\u0003\u0012I\u0017k\u0001\u0012";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "a\u0004\u000eM\u000b{\u0002\u0013M\u0006k\u001a\u0018";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "a\u0004\u000eM\u000b{\u0002\u0015O\u001ck\u0003\b";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "a\u0004\u000eM\u000b{\u0015\u001dL\u0017k\u0002\u0003P\u001cw\u0003\u0011G";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new ah(z[5], 0, 1);
                    ERROR_UNKNOWN = new ah(z[8], 1, 2);
                    ERROR_TIMEOUT = new ah(z[10], 2, 3);
                    ERROR_DNS = new ah(z[7], 3, 4);
                    ERROR_INSUFFICIENT_SPACE = new ah(z[0], 4, 5);
                    ERROR_TOO_OLD = new ah(z[9], 5, 6);
                    ERROR_CANNOT_RESUME = new ah(z[11], 6, 7);
                    ERROR_HASH_MISMATCH = new ah(z[1], 7, 8);
                    ERROR_INVALID_URL = new ah(z[4], 8, 9);
                    ERROR_OUTPUT_STREAM = new ah(z[2], 9, 10);
                    ERROR_CANCEL = new ah(z[6], 10, 11);
                    DEDUPED = new ah(z[3], 11, 12);
                    b = new ah[]{OK, ERROR_UNKNOWN, ERROR_TIMEOUT, ERROR_DNS, ERROR_INSUFFICIENT_SPACE, ERROR_TOO_OLD, ERROR_CANNOT_RESUME, ERROR_HASH_MISMATCH, ERROR_INVALID_URL, ERROR_OUTPUT_STREAM, ERROR_CANCEL, DEDUPED};
                default:
                    strArr2[i2] = str;
                    str = "a\u0004\u000eM\u000b{\u001e\u001dQ\u0011{\u001b\u0015Q\u0014e\u0002\u001fJ";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private ah(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }
}
