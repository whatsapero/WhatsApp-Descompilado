package com.whatsapp;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class w0 {
    private static final String[] z;
    private Resources a;
    private String b;
    private azn c;
    private Method d;

    static {
        String[] strArr = new String[4];
        String str = "]\t) PaE.7Bb\u0010.1T-,\u0018r\u0012=\u001d";
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
                        i3 = 13;
                        break;
                    case ay.f /*1*/:
                        i3 = 101;
                        break;
                    case ay.n /*2*/:
                        i3 = 92;
                        break;
                    case ay.p /*3*/:
                        i3 = 82;
                        break;
                    default:
                        i3 = 49;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "-\f(7\\0";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "j\u0000(\u0000T~\n) Rh'=5eh\u001d(";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "-\u0014)3_y\f(+\f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String a(int i, int i2, Object[] objArr) {
        return String.format(this.a.getConfiguration().locale, a(i, i2), objArr);
    }

    public w0(Resources resources) {
        this.a = resources;
        if (VERSION.SDK_INT < 11) {
            try {
                this.d = resources.getAssets().getClass().getDeclaredMethod(z[3], new Class[]{Integer.TYPE, Integer.TYPE});
                this.d.setAccessible(true);
            } catch (Throwable e) {
                Log.c(e);
            } catch (Throwable e2) {
                Log.c(e2);
            }
        }
    }

    public String a(int i, int i2) {
        try {
            if (VERSION.SDK_INT >= 11) {
                return this.a.getQuantityString(i, i2);
            }
            try {
                if (this.d == null) {
                    return this.a.getQuantityString(i, i2);
                }
                Locale locale = this.a.getConfiguration().locale;
                try {
                    if (!locale.getLanguage().equals(this.b)) {
                        this.b = locale.getLanguage();
                        this.c = azn.a(locale);
                    }
                    try {
                        if (this.c == null) {
                            return this.a.getQuantityString(i, i2);
                        }
                        Object obj = null;
                        try {
                            if (null == null) {
                                obj = this.d.invoke(this.a.getAssets(), new Object[]{Integer.valueOf(i), Integer.valueOf(azn.b(this.c.c(i2)))});
                            }
                            if (obj == null) {
                                obj = this.d.invoke(this.a.getAssets(), new Object[]{Integer.valueOf(i), Integer.valueOf(16777220)});
                            }
                            if (obj != null) {
                                return obj.toString();
                            }
                            try {
                                throw new NotFoundException(z[0] + Integer.toHexString(i) + z[1] + i2 + z[2] + azn.a(this.c.c(i2)));
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        } catch (IllegalArgumentException e2) {
                            throw new NotFoundException(e2.getMessage());
                        } catch (IllegalAccessException e3) {
                            throw new NotFoundException(e3.getMessage());
                        } catch (InvocationTargetException e4) {
                            throw new NotFoundException(e4.getMessage());
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        } catch (IllegalArgumentException e22222) {
            throw e22222;
        }
    }
}
