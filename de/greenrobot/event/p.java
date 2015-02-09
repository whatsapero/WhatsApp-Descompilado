package de.greenrobot.event;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum p {
    ;
    public static final p Async;
    public static final p BackgroundThread;
    public static final p MainThread;
    public static final p PostThread;
    public static boolean a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "9lsN$\u001c\u007f\u007fA\u0014";
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
                        i4 = 116;
                        break;
                    case ay.f /*1*/:
                        i4 = 13;
                        break;
                    case ay.n /*2*/:
                        i4 = 26;
                        break;
                    case ay.p /*3*/:
                        i4 = 32;
                        break;
                    default:
                        i4 = 112;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "5~cN\u0013";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "$biT$\u001c\u007f\u007fA\u0014";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    PostThread = new p(z[3], 0);
                    MainThread = new p(z[0], 1);
                    BackgroundThread = new p(z[1], 2);
                    Async = new p(z[2], 3);
                    b = new p[]{PostThread, MainThread, BackgroundThread, Async};
                default:
                    strArr2[i2] = str;
                    str = "6lyK\u0017\u0006boN\u0014 ehE\u0011\u0010";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
