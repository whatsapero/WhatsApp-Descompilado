package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum z {
    ;
    public static final z BUSY;
    public static final z CONNECTED;
    public static final z MISSED;
    public static final z REJECTED_BY_SERVER;
    public static final z REJECTED_BY_USER;
    public static final z SERVER_NACK;
    public static final z SETUP_ERROR;
    private static final z[] b;
    private static final String[] z;
    private final int a;

    private z(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[7];
        String str = "%Hjp0#Hdj1.Rsp!!Hr";
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
                        i4 = 119;
                        break;
                    case ay.f /*1*/:
                        i4 = 13;
                        break;
                    case ay.n /*2*/:
                        i4 = 32;
                        break;
                    case ay.p /*3*/:
                        i4 = 53;
                        break;
                    default:
                        i4 = 115;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "%Hjp0#Hdj1.Ruf6%";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "$Hrc6%Rnt0<";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = ":Dsf63";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "4Bn{64Yeq";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "5Xsl";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    CONNECTED = new z(z[5], 0, 1);
                    REJECTED_BY_USER = new z(z[2], 1, 2);
                    REJECTED_BY_SERVER = new z(z[0], 2, 3);
                    MISSED = new z(z[4], 3, 4);
                    BUSY = new z(z[6], 4, 5);
                    SETUP_ERROR = new z(z[1], 5, 6);
                    SERVER_NACK = new z(z[3], 6, 7);
                    b = new z[]{CONNECTED, REJECTED_BY_USER, REJECTED_BY_SERVER, MISSED, BUSY, SETUP_ERROR, SERVER_NACK};
                default:
                    strArr2[i2] = str;
                    str = "$Ht`#(Hrg<%";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
