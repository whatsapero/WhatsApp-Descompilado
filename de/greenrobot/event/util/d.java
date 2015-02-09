package de.greenrobot.event.util;

import android.content.res.Resources;
import android.util.Log;
import de.greenrobot.event.g;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class d {
    private static final String z;
    final int a;
    int b;
    String c;
    boolean d;
    final l e;
    final int f;
    g g;
    Class h;
    final Resources i;

    static {
        char[] toCharArray = "3\u001aw\u0016\u0013\u0018\u0016>\u0003\n\u001eU:\u0000\u0010\u000e\u00140\u0000C\u000f\u0010$\u0016\f\b\u00074\u0000C41w\u0003\f\b\u001b3E\u0005\u0012\u0007w".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 125;
                    break;
                case ay.f /*1*/:
                    i2 = 117;
                    break;
                case ay.n /*2*/:
                    i2 = 87;
                    break;
                case ay.p /*3*/:
                    i2 = 101;
                    break;
                default:
                    i2 = 99;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public int a(Throwable th) {
        Integer b = this.e.b(th);
        if (b != null) {
            return b.intValue();
        }
        Log.d(g.k, z + th);
        return this.a;
    }

    public d a(Class cls, int i) {
        this.e.a(cls, i);
        return this;
    }

    public void a(String str) {
        this.c = str;
    }

    public void a() {
        this.d = false;
    }

    public void a(int i) {
        this.b = i;
    }

    public void a(Class cls) {
        this.h = cls;
    }

    public d(Resources resources, int i, int i2) {
        this.d = true;
        this.i = resources;
        this.f = i;
        this.a = i2;
        this.e = new l();
    }

    public void a(g gVar) {
        this.g = gVar;
    }

    g b() {
        return this.g != null ? this.g : g.b();
    }
}
