package com.whatsapp.fieldstats;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public enum ag {
    ;
    public static final ag CHAT_DB_ERROR;
    public static final ag DOWNLOAD_ERROR;
    public static final ag NOT_ENOUGH_SPACE;
    public static final ag NOT_SIGNED_IN;
    public static final ag NO_BACKUP;
    public static final ag SKIPPED;
    public static final ag SUCCESS;
    public static final ag TAR_ERROR;
    private static final ag[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[8];
        String str = "\u001aSUBR\u0011]FS[\fNM^";
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
                        i4 = 94;
                        break;
                    case ay.f /*1*/:
                        i4 = 28;
                        break;
                    case ay.n /*2*/:
                        i4 = 2;
                        break;
                    case ay.p /*3*/:
                        i4 = 12;
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
                    str = "\u001dTCXA\u001a^]IL\fSP";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u0010S]N_\u001dWW\\";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\rWK\\N\u001bX";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\n]PS[\fNM^";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0010SVS[\u0010SWKV\u0001ORM]\u001b";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0010SVSM\u0017[LIZ\u0001UL";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NOT_SIGNED_IN = new ag(z[7], 0, 1);
                    NO_BACKUP = new ag(z[3], 1, 2);
                    SKIPPED = new ag(z[4], 2, 3);
                    SUCCESS = new ag(z[1], 3, 4);
                    CHAT_DB_ERROR = new ag(z[2], 4, 5);
                    TAR_ERROR = new ag(z[5], 5, 6);
                    DOWNLOAD_ERROR = new ag(z[0], 6, 7);
                    NOT_ENOUGH_SPACE = new ag(z[6], 7, 8);
                    b = new ag[]{NOT_SIGNED_IN, NO_BACKUP, SKIPPED, SUCCESS, CHAT_DB_ERROR, TAR_ERROR, DOWNLOAD_ERROR, NOT_ENOUGH_SPACE};
                default:
                    strArr2[i2] = str;
                    str = "\rIAO[\rO";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private ag(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }
}
