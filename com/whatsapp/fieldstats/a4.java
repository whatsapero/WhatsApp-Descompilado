package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum a4 {
    ;
    public static final a4 NO_BACKUP_FOUND;
    public static final a4 ONLY_LOCAL_BACKUP_FOUND;
    public static final a4 ONLY_REMOTE_BACKUP_FOUND;
    public static final a4 REMOTE_AND_LOCAL_BACKUP_FOUND;
    private static final a4[] a;
    private static final String[] z;
    private final int b;

    static {
        String[] strArr = new String[4];
        String str = "\u001e*+,K\u0003!*:@\u0014;%4W\u001a17*R\u001e1)1";
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
                        i4 = 81;
                        break;
                    case ay.f /*1*/:
                        i4 = 100;
                        break;
                    case ay.n /*2*/:
                        i4 = 103;
                        break;
                    case ay.p /*3*/:
                        i4 = 117;
                        break;
                    default:
                        i4 = 20;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0003!*:@\u0014;&;P\u000e((6U\u001d;%4W\u001a17*R\u001e1)1";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u001f+87U\u0012/2%K\u0017+2;P";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    REMOTE_AND_LOCAL_BACKUP_FOUND = new a4(z[2], 0, 1);
                    ONLY_REMOTE_BACKUP_FOUND = new a4(z[0], 1, 2);
                    ONLY_LOCAL_BACKUP_FOUND = new a4(z[1], 2, 3);
                    NO_BACKUP_FOUND = new a4(z[3], 3, 4);
                    a = new a4[]{REMOTE_AND_LOCAL_BACKUP_FOUND, ONLY_REMOTE_BACKUP_FOUND, ONLY_LOCAL_BACKUP_FOUND, NO_BACKUP_FOUND};
                default:
                    strArr2[i2] = str;
                    str = "\u001e*+,K\u001d+$4X\u000e&&6_\u0004483[\u0004*#";
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

    private a4(int i) {
        this.b = i;
    }
}
