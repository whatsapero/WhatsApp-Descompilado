package com.whatsapp.util;

import com.whatsapp.DialogToastActivity;
import java.io.RandomAccessFile;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class az extends af {
    private static final String[] z;
    long d;
    long e;
    long f;
    double g;
    int h;
    b1 i;
    double j;

    static {
        String[] strArr = new String[3];
        String str = "2\u000bAMCf\u0010AW\u0018";
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
                        i3 = 18;
                        break;
                    case ay.f /*1*/:
                        i3 = 121;
                        break;
                    case ay.n /*2*/:
                        i3 = 46;
                        break;
                    case ay.p /*3*/:
                        i3 = 57;
                        break;
                    default:
                        i3 = 34;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "g\u0017GMQ2";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "2\u001d[KCf\u0010AW\u0018";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        return super.toString() + "[" + r.a(this.f) + "/" + r.a(this.d) + z[1] + this.e + z[2] + this.i + " " + this.g + "x" + this.j + z[0] + this.i.a() + "]";
    }

    public az(long j, String str, RandomAccessFile randomAccessFile) {
        int i = am.b;
        super(j, str, randomAccessFile);
        this.i = b1.m;
        this.h = r.b(randomAccessFile);
        r.e(randomAccessFile);
        this.f = r.a(randomAccessFile);
        this.d = r.a(randomAccessFile);
        r.a(randomAccessFile);
        r.a(randomAccessFile);
        this.e = r.a(randomAccessFile);
        r.a(randomAccessFile);
        r.a(randomAccessFile);
        r.d(randomAccessFile);
        r.d(randomAccessFile);
        r.d(randomAccessFile);
        r.d(randomAccessFile);
        this.i = b1.a(randomAccessFile);
        this.g = r.f(randomAccessFile);
        this.j = r.f(randomAccessFile);
        if (DialogToastActivity.i) {
            am.b = i + 1;
        }
    }
}
