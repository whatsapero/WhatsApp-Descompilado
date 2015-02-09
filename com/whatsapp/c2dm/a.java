package com.whatsapp.c2dm;

import android.content.Context;
import android.content.SharedPreferences;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class a {
    private static final String[] z;
    private final Context a;

    static {
        String[] strArr = new String[12];
        String str = " \\_Oi1\u000b\\}_'";
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
                        i3 = 67;
                        break;
                    case ay.f /*1*/:
                        i3 = 110;
                        break;
                    case ay.n /*2*/:
                        i3 = 59;
                        break;
                    case ay.p /*3*/:
                        i3 = 34;
                        break;
                    default:
                        i3 = 54;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = " \\_Oi\"\u001eK}@&\u001cH";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = " \\_Oi1\u000b\\}_'";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = " \\_Oi1\u000bOPO\u001c\rTWX7";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = " \\_Oi1\u000b\\}_'";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "$\u000bOaC1\u001c^LB\u0002\u001eKN_ \u000fOKY-8^PE*\u0001U";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = " \\_Oi\"\u001eK}@&\u001cH";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = " \u0001V\fA+\u000fOQW3\u001edRD&\b^PS-\r^Q";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = " \\_Oi\"\u001eK}@&\u001cH";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = " \\_Oi1\u000bOPO\u001c\rTWX7";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = " \\_Oi1\u000b\\}_'";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = " \\_Oi1\u000bOPO\u001c\rTWX7";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String c() {
        return d().getString(z[3], null);
    }

    private SharedPreferences d() {
        return this.a.getSharedPreferences(z[8], 0);
    }

    public boolean e() {
        return d().contains(z[0]);
    }

    public a(Context context) {
        this.a = context;
    }

    public void a(String str) {
        Log.b(d().edit().putString(z[5], str).commit());
    }

    public int g() {
        return d().getInt(z[10], 0);
    }

    public void i() {
        Log.b(d().edit().remove(z[4]).commit());
    }

    public int f() {
        return d().getInt(z[9], 0);
    }

    public void a() {
        Log.b(d().edit().remove(z[11]).commit());
    }

    public int b() {
        try {
            return this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode;
        } catch (Throwable e) {
            Log.b(z[6], e);
            return -1;
        }
    }

    public void a(int i) {
        Log.b(d().edit().putInt(z[2], i).commit());
    }

    public void j() {
        int i = C2DMRegistrar.c;
        int g = g();
        if (g < Integer.MAX_VALUE) {
            g++;
        }
        Log.b(d().edit().putInt(z[1], g).commit());
        if (DialogToastActivity.i) {
            C2DMRegistrar.c = i + 1;
        }
    }

    public void h() {
        Log.b(d().edit().remove(z[7]).commit());
    }
}
