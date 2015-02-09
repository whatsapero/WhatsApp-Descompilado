package com.whatsapp;

import android.os.Build;
import android.os.Build.VERSION;
import java.io.File;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public abstract class ant {
    public static boolean a;
    private static final String[] z;
    protected int b;
    protected File c;

    static {
        String[] strArr = new String[9];
        String str = "\u0013{1*";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 64;
                        break;
                    case ay.f /*1*/:
                        i3 = 20;
                        break;
                    case ay.n /*2*/:
                        i3 = 95;
                        break;
                    case ay.p /*3*/:
                        i3 = 83;
                        break;
                    default:
                        i3 = 36;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0013Yr\u001d\u001dp$";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0003&nc\u0010";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0003&nc\u0011";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "3u2 Q.s";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0013Yr\u001d\u001dp$";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "n{/&W";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0013Yr\u001d\u001dp$o";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "!a;:Ko{84\u001f`w07A#gb<T5g";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public abstract void a();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public int c() {
        return this.b;
    }

    public static ant a(String str, String str2) {
        if (z[1].equals(str2)) {
            return new an3(str + z[7]);
        }
        if (VERSION.SDK_INT < 16 || !Build.MANUFACTURER.equals(z[0]) || Build.MODEL.equals(z[3]) || Build.MODEL.equals(z[4])) {
            return (VERSION.SDK_INT < 16 || !Build.MANUFACTURER.equals(z[5]) || !Build.MODEL.contains(z[6]) || Build.MODEL.equals(z[2]) || Build.MODEL.equals(z[8])) ? new ank(str, str2) : new ans(str);
        } else {
            ant com_whatsapp_ans = new ans(str);
            com_whatsapp_ans.a(5);
            return com_whatsapp_ans;
        }
    }

    public File b() {
        return this.c;
    }
}
