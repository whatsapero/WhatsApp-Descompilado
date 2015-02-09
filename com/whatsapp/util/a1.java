package com.whatsapp.util;

import java.io.RandomAccessFile;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class a1 extends af {
    private static final String[] z;
    long d;
    long e;
    int f;
    long g;
    b1 h;
    long i;

    static {
        String[] strArr = new String[3];
        String str = "\u000fw\u001a0.[z\u0000,u";
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
                        i3 = 47;
                        break;
                    case ay.f /*1*/:
                        i3 = 19;
                        break;
                    case ay.n /*2*/:
                        i3 = 111;
                        break;
                    case ay.p /*3*/:
                        i3 = 66;
                        break;
                    default:
                        i3 = 79;
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
                    str = "\u00063";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\\v\fbg";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public a1(long j, String str, RandomAccessFile randomAccessFile) {
        super(j, str, randomAccessFile);
        this.h = b1.m;
        this.f = r.b(randomAccessFile);
        r.e(randomAccessFile);
        this.e = r.a(randomAccessFile);
        this.i = r.a(randomAccessFile);
        this.d = r.a(randomAccessFile);
        this.g = r.a(randomAccessFile);
        r.a(randomAccessFile);
        r.d(randomAccessFile);
        r.d(randomAccessFile);
        r.a(randomAccessFile);
        r.a(randomAccessFile);
        this.h = b1.a(randomAccessFile);
    }

    public String toString() {
        return super.toString() + "[" + r.a(this.e) + "/" + r.a(this.i) + z[0] + (this.g / this.d) + z[1] + this.g + z[2] + this.h + "]";
    }
}
