package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class cn {
    public static float a;
    public static int c;
    public static int j;
    private static final String[] z;
    public double b;
    public long d;
    public double e;
    public int f;
    public int g;
    public String h;
    public float i;

    static {
        String[] strArr = new String[7];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "Yl]cA\u001d\"";
        int i2 = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 121;
                        break;
                    case ay.f /*1*/:
                        i4 = 31;
                        break;
                    case ay.n /*2*/:
                        i4 = 45;
                        break;
                    case ay.p /*3*/:
                        i4 = 6;
                        break;
                    default:
                        i4 = 36;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "YkDkA\nkLkTD";
                    i = 2;
                    strArr2 = strArr3;
                    i2 = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\"J^cV5pNgP\u0010pC&N\u0010{\u0010";
                    i = 3;
                    strArr2 = strArr3;
                    i2 = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "Y~NeQ\u000b~N\u007f\u0019";
                    i2 = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "Y}HgV\u0010qJ;";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "YsLrM\rjIc\u0019";
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    j = -1;
                    a = -1.0f;
                    c = -1;
                default:
                    strArr2[i] = str;
                    str = "YsBhC\u0010kXbAD";
                    i = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    public boolean a() {
        return this.d > 0;
    }

    public String toString() {
        return z[3] + this.h + z[6] + this.b + z[1] + this.e + z[4] + this.g + z[0] + this.i + z[5] + this.f + z[2] + this.d + "]";
    }

    public cn() {
        this.g = j;
        this.i = a;
        this.f = c;
    }
}
