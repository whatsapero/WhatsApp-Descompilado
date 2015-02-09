package com.whatsapp;

import com.whatsapp.contact.c;
import com.whatsapp.contact.i;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class b1 {
    private static Thread a;
    private static final Runnable b;
    private static AtomicBoolean c;
    private static final String[] z;

    public static void d() {
        int i = m3.d;
        if (g()) {
            Log.i(z[1]);
            if (i == 0) {
                return;
            }
        }
        if (c.get()) {
            Log.i(z[0]);
            if (i == 0) {
                return;
            }
        }
        a = new Thread(b);
        a.start();
    }

    public static boolean b() {
        return c.get();
    }

    public static boolean g() {
        return a != null && a.isAlive();
    }

    static {
        String[] strArr = new String[4];
        String str = "^pCjyWxPy8NxXey[}En8^h\u0017x,YrRx*\\d[";
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
                        i3 = 17;
                        break;
                    case ay.n /*2*/:
                        i3 = 55;
                        break;
                    case ay.p /*3*/:
                        i3 = 11;
                        break;
                    default:
                        i3 = 89;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "^pCj4SvEj-\u0015xYb-^s";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "S\u007f^\u007f\u001dx>Ry+Uc";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    c = new AtomicBoolean();
                    b = new fe();
                default:
                    strArr2[i] = str;
                    str = "^pCjyWxPy8NxXey[}En8^h\u0017y,T\u007f^e>";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static boolean a() {
        try {
            int l;
            Log.i(z[2]);
            if (i.a()) {
                App.an();
                App.P.a();
                l = App.P.l();
                i.c(App.p, c.REGISTRATION_FULL);
                App.aH.sendEmptyMessage(1);
            } else {
                App.an();
                App.P.a();
                l = App.P.l();
                i.c(App.p, c.REGISTRATION_FULL);
                App.aH.sendEmptyMessage(1);
            }
            if (i.b()) {
                App.a0.b(true);
                App.a0.a(l);
            } else {
                App.a0.b(true);
                App.a0.a(l);
            }
            return true;
        } catch (Throwable e) {
            Log.b(z[3], e);
            return false;
        }
    }

    static boolean c() {
        return a();
    }

    public static void e() {
        c.set(false);
    }

    static AtomicBoolean f() {
        return c;
    }

    public static boolean i() {
        if (g()) {
            a.join();
        }
        return c.get();
    }

    public static void h() {
        c.set(true);
    }
}
