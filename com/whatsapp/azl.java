package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.regex.Pattern;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class azl {
    private static final String[] z;

    static {
        String[] strArr = new String[6];
        String str = "@+";
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
                        i3 = 58;
                        break;
                    case ay.f /*1*/:
                        i3 = 81;
                        break;
                    case ay.n /*2*/:
                        i3 = 56;
                        break;
                    case ay.p /*3*/:
                        i3 = 102;
                        break;
                    default:
                        i3 = 50;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "a0\u0015\u001coAcE";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "`\u000b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "L4J\u000fTC?M\u000bP_#\u0017\u0014WK$]\u0015FY>\\\u0003\u001dS?N\u0007^S5\u0015\u0005]O?L\u0014K\u001a";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "a\u0010\u0015<oAcE";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "L4J\u000fTC?M\u000bP_#\u0017\u0014WK$]\u0015FY>\\\u0003\u001dS?N\u0007^S5\u0015\nST6M\u0007U_q";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static Locale c() {
        Locale locale = App.p.getResources().getConfiguration().locale;
        return locale == null ? Locale.getDefault() : locale;
    }

    public static String a() {
        String language = c().getLanguage();
        if (language != null && Pattern.matches(z[2], language)) {
            return language;
        }
        Log.i(z[1] + language);
        return z[0];
    }

    public static String b() {
        String country = c().getCountry();
        if (country != null && Pattern.matches(z[5], country)) {
            return country;
        }
        Log.i(z[4] + country);
        return z[3];
    }
}
