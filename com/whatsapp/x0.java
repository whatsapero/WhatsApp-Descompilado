package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum x0 {
    ;
    public static final x0 ERROR_CONNECTIVITY;
    public static final x0 ERROR_UNSPECIFIED;
    public static final x0 EXPIRED;
    public static final x0 FAIL_BLOCKED;
    public static final x0 FAIL_GUESSED_TOO_FAST;
    public static final x0 FAIL_MISMATCH;
    public static final x0 FAIL_MISSING;
    public static final x0 FAIL_STALE;
    public static final x0 FAIL_TEMPORARILY_UNAVAILABLE;
    public static final x0 FAIL_TOO_MANY_GUESSES;
    public static final x0 YES;
    private static final x0[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[11];
        String str = "Nf\u001aSAEn\u0000LWF`";
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
                        i4 = 8;
                        break;
                    case ay.f /*1*/:
                        i4 = 39;
                        break;
                    case ay.n /*2*/:
                        i4 = 83;
                        break;
                    case ay.p /*3*/:
                        i4 = 31;
                        break;
                    default:
                        i4 = 30;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "Mu\u0001PLWr\u001dLNMd\u001aYWMc";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "Mu\u0001PLWd\u001cQPMd\u0007VHAs\n";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "Nf\u001aSAOr\u0016LMMc\fKQGx\u0015^M\\";
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "Nf\u001aSA[s\u0012S[";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "Qb\u0000";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "Nf\u001aSAJk\u001c\\UMc";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    str = "M\u007f\u0003VLMc";
                    i = 7;
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    strArr2 = strArr3;
                    str = "Nf\u001aSA\\h\u001c@SIi\n@Y]b\u0000L[[";
                    i = 8;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "Nf\u001aSA\\b\u001eOQZf\u0001VRQx\u0006Q_^f\u001aS_Jk\u0016";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    YES = new x0(z[6], 0);
                    EXPIRED = new x0(z[8], 1);
                    ERROR_UNSPECIFIED = new x0(z[2], 2);
                    ERROR_CONNECTIVITY = new x0(z[3], 3);
                    FAIL_MISMATCH = new x0(z[1], 4);
                    FAIL_TOO_MANY_GUESSES = new x0(z[9], 5);
                    FAIL_GUESSED_TOO_FAST = new x0(z[4], 6);
                    FAIL_MISSING = new x0(z[0], 7);
                    FAIL_STALE = new x0(z[5], 8);
                    FAIL_TEMPORARILY_UNAVAILABLE = new x0(z[10], 9);
                    FAIL_BLOCKED = new x0(z[7], 10);
                    a = new x0[]{YES, EXPIRED, ERROR_UNSPECIFIED, ERROR_CONNECTIVITY, FAIL_MISMATCH, FAIL_TOO_MANY_GUESSES, FAIL_GUESSED_TOO_FAST, FAIL_MISSING, FAIL_STALE, FAIL_TEMPORARILY_UNAVAILABLE, FAIL_BLOCKED};
                default:
                    strArr2[i2] = str;
                    str = "Nf\u001aSAEn\u0000R_\\d\u001b";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
