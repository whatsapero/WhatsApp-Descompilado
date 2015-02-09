package com.whatsapp.util;

import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class bl {
    private static final String z;

    static {
        char[] toCharArray = "2\u001f\u001bX_".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 28;
                    break;
                case ay.f /*1*/:
                    i2 = 112;
                    break;
                case ay.n /*2*/:
                    i2 = 107;
                    break;
                case ay.p /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(OnErrorListener onErrorListener);

    public abstract void a(OnPreparedListener onPreparedListener);

    public abstract void b();

    public abstract void b(int i);

    public abstract boolean c();

    public abstract void d();

    public abstract int e();

    public abstract int f();

    public abstract void g();

    public abstract void h();

    public abstract int i();

    public static bl a(String str) {
        return str.endsWith(z) ? new bt(str) : new bv(str);
    }
}
