package com.whatsapp.util;

import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class a0 {
    private static final Pattern c;
    private static final String[] z;
    private final String a;
    private final String b;

    public int hashCode() {
        int i = 0;
        try {
            int hashCode = this.a == null ? 0 : this.a.hashCode();
            try {
                if (this.b != null) {
                    i = this.b.hashCode();
                }
                return (hashCode * 31) + i;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static {
        String[] strArr = new String[5];
        String str = "\u001c[?w%2\u0004";
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
                        i3 = 81;
                        break;
                    case ay.f /*1*/:
                        i3 = 56;
                        break;
                    case ay.n /*2*/:
                        i3 = 92;
                        break;
                    case ay.p /*3*/:
                        i3 = 58;
                        break;
                    default:
                        i3 = 75;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "a\bl";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "t\bo^";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "<[?W%2\u0017,[9\"]|W%2\u00182U?qH=H84Y>V.qY/\u001a\"?L9].#\u0002|";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    char[] toCharArray2 = "yd8Ax,\u0011tf/*\np\t6x".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (int i4 = 0; length2 > i4; i4++) {
                        int i5;
                        char c2 = cArr2[i4];
                        switch (i4 % 5) {
                            case PBE.MD5 /*0*/:
                                i5 = 81;
                                break;
                            case ay.f /*1*/:
                                i5 = 56;
                                break;
                            case ay.n /*2*/:
                                i5 = 92;
                                break;
                            case ay.p /*3*/:
                                i5 = 58;
                                break;
                            default:
                                i5 = 75;
                                break;
                        }
                        cArr2[i4] = (char) (i5 ^ c2);
                    }
                    c = Pattern.compile(new String(cArr2).intern());
                default:
                    strArr2[i] = str;
                    str = "a\bl";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (getClass() != obj.getClass()) {
                return false;
            }
            a0 a0Var = (a0) obj;
            try {
                if (TextUtils.equals(this.a, a0Var.a)) {
                    if (TextUtils.equals(this.b, a0Var.b)) {
                        return true;
                    }
                }
                return false;
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    private a0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static a0 a(String str) {
        return a(str, z[2], z[1]);
    }

    public String toString() {
        return z[0] + this.a + "," + this.b + ">";
    }

    public static a0 a(String str, String str2, String str3) {
        if (str == null) {
            try {
                return new a0(str2, str3);
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        Matcher matcher = c.matcher(str);
        try {
            if (!matcher.matches()) {
                return new a0(str2, str3);
            }
            String group = matcher.group(1);
            try {
                str3 = String.format(Locale.US, z[3], new Object[]{Integer.valueOf(Integer.valueOf(matcher.group(2)).intValue())});
            } catch (NumberFormatException e2) {
                Log.e(z[4] + matcher.group(2));
            }
            return new a0(group, str3);
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    public String a() {
        return this.a;
    }

    public static String a(String str, String str2) {
        if (str == null) {
            return str2;
        }
        Matcher matcher = c.matcher(str);
        try {
            if (!matcher.matches()) {
                return str2;
            }
            String group = matcher.group(1);
            return group + "-" + matcher.group(2);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public String b() {
        return this.b;
    }
}
