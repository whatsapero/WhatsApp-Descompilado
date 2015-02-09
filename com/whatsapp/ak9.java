package com.whatsapp;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import java.util.regex.Pattern;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class ak9 {
    private static final Pattern a;
    private static String b;
    private static final String[] z;

    static {
        String[] strArr = new String[9];
        String str = "Hic\u0013lJi";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            int i2;
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 61;
                        break;
                    case ay.f /*1*/:
                        i2 = 7;
                        break;
                    case ay.n /*2*/:
                        i2 = 8;
                        break;
                    case ay.p /*3*/:
                        i2 = 125;
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                cArr[i3] = (char) (i2 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "|il\u000flTc";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "Hic\u0013lJi";
                    obj = 2;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\\wxRvNbzPbZbf\t,Obd\u0018bNb";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "Hic\u0013lJi";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001dCm\u000bj^b'";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    str = "\\wxRvNbzPbZbf\t,Pff\be\\d|\bqXu";
                    obj = 6;
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    str = "\u000f)9L-\b7=";
                    i = 8;
                    strArr2 = strArr3;
                    obj = 7;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    char[] toCharArray2 = "fY$!-apTP_\u0015[! ".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (i2 = 0; length2 > i2; i2++) {
                        int i4;
                        char c2 = cArr2[i2];
                        switch (i2 % 5) {
                            case PBE.MD5 /*0*/:
                                i4 = 61;
                                break;
                            case ay.f /*1*/:
                                i4 = 7;
                                break;
                            case ay.n /*2*/:
                                i4 = 8;
                                break;
                            case ay.p /*3*/:
                                i4 = 125;
                                break;
                            default:
                                i4 = 3;
                                break;
                        }
                        cArr2[i2] = (char) (i4 ^ c2);
                    }
                    a = Pattern.compile(new String(cArr2).intern());
                default:
                    strArr2[i] = str;
                    str = "\\wxRvNbzPbZbf\t,Phl\u0018o";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void a(Context context) {
        String replace = z[8].replace(' ', '_');
        String replace2 = z[2].replace(' ', '_');
        String replace3 = context.getString(R.string.app_name).replace(' ', '_');
        String str = z[5];
        String str2 = z[0];
        String str3 = z[3];
        try {
            str = a.matcher(VERSION.RELEASE).replaceAll("_");
        } catch (Throwable e) {
            Log.b(z[4], e);
        }
        try {
            str2 = a.matcher(Build.MANUFACTURER).replaceAll("_");
        } catch (Throwable e2) {
            Log.b(z[7], e2);
        }
        try {
            str3 = a.matcher(Build.MODEL).replaceAll("_");
        } catch (Throwable e22) {
            Log.b(z[1], e22);
        }
        b = replace3 + "/" + replace + " " + replace2 + "/" + str + z[6] + str2 + "-" + str3;
    }

    public static String a() {
        return b;
    }
}
