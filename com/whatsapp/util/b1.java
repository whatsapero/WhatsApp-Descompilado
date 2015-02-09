package com.whatsapp.util;

import com.whatsapp.DialogToastActivity;
import java.io.RandomAccessFile;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class b1 {
    public static final b1 b;
    public static final b1 h;
    public static final b1 k;
    public static final b1 m;
    private static final String[] z;
    double a;
    double d;
    double e;
    double f;
    double g;
    double i;
    double j;
    double l;
    double n;

    static {
        String[] strArr = new String[13];
        int i = 0;
        String str = "l\"\u001c\u001dj[mZK.\u008e";
        Object obj = -1;
        String[] strArr2 = strArr;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 62;
                        break;
                    case ay.f /*1*/:
                        i3 = 77;
                        break;
                    case ay.n /*2*/:
                        i3 = 104;
                        break;
                    case ay.p /*3*/:
                        i3 = 124;
                        break;
                    default:
                        i3 = 30;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr[i] = str;
                    i = 2;
                    str = "\u0012m\tA";
                    obj = 1;
                    strArr = strArr2;
                    break;
                case ay.f /*1*/:
                    strArr[i] = str;
                    i = 3;
                    str = "l\"\u001c\u001dj[mYD.\u008e";
                    obj = 2;
                    strArr = strArr2;
                    break;
                case ay.n /*2*/:
                    strArr[i] = str;
                    i = 4;
                    str = "l\"\u001c\u001dj[mQL\u00ae";
                    obj = 3;
                    strArr = strArr2;
                    break;
                case ay.p /*3*/:
                    strArr[i] = str;
                    i = 5;
                    str = "\u0012m\nA";
                    obj = 4;
                    strArr = strArr2;
                    break;
                case aj.i /*4*/:
                    strArr[i] = str;
                    i = 6;
                    str = "s,\u001c\u000ewF6\u001dA";
                    obj = 5;
                    strArr = strArr2;
                    break;
                case aV.r /*5*/:
                    strArr[i] = str;
                    i = 7;
                    str = "\u0012m\u000bA";
                    obj = 6;
                    strArr = strArr2;
                    break;
                case aV.i /*6*/:
                    strArr[i] = str;
                    i = 8;
                    str = "\u0012m\u001fA";
                    obj = 7;
                    strArr = strArr2;
                    break;
                case a8.s /*7*/:
                    strArr[i] = str;
                    i = 9;
                    str = "\u0012m\fA";
                    obj = 8;
                    strArr = strArr2;
                    break;
                case a8.n /*8*/:
                    strArr[i] = str;
                    i = 10;
                    str = "l\"\u001c\u001dj[mX\u00cc";
                    obj = 9;
                    strArr = strArr2;
                    break;
                case a6.D /*9*/:
                    strArr[i] = str;
                    i = 11;
                    str = "\u0012m\u001c\u0004#";
                    obj = 10;
                    strArr = strArr2;
                    break;
                case a6.h /*10*/:
                    strArr[i] = str;
                    i = 12;
                    str = "\u0012m\u001c\u0005#";
                    obj = 11;
                    strArr = strArr2;
                    break;
                case a6.e /*11*/:
                    strArr[i] = str;
                    z = strArr2;
                    m = new b1(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
                    k = new b1(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
                    h = new b1(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
                    b = new b1(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
                default:
                    strArr[i] = str;
                    i = 1;
                    str = "\u0012m\u001eA";
                    obj = null;
                    strArr = strArr2;
                    break;
            }
        }
    }

    public static b1 a(RandomAccessFile randomAccessFile) {
        double f = r.f(randomAccessFile);
        double f2 = r.f(randomAccessFile);
        double g = r.g(randomAccessFile);
        return new b1(f, f2, r.f(randomAccessFile), r.f(randomAccessFile), g, r.g(randomAccessFile), r.g(randomAccessFile), r.f(randomAccessFile), r.f(randomAccessFile));
    }

    public int a() {
        if (this.l == 0.0d && this.g == 1.0d && this.d == -1.0d && this.j == 0.0d) {
            return 90;
        }
        if (this.l == -1.0d && this.g == 0.0d && this.d == 0.0d && this.j == -1.0d) {
            return 180;
        }
        return (this.l == 0.0d && this.g == -1.0d && this.d == 1.0d && this.j == 0.0d) ? 270 : 0;
    }

    public boolean b() {
        return (this.n == 0.0d && this.e == 0.0d) ? false : true;
    }

    public b1(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.i = d5;
        this.f = d6;
        this.a = d7;
        this.l = d;
        this.g = d2;
        this.d = d3;
        this.j = d4;
        this.n = d8;
        this.e = d9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (Double.compare(b1Var.l, this.l) != 0) {
            return false;
        }
        if (Double.compare(b1Var.g, this.g) != 0) {
            return false;
        }
        if (Double.compare(b1Var.d, this.d) != 0) {
            return false;
        }
        if (Double.compare(b1Var.j, this.j) != 0) {
            return false;
        }
        if (Double.compare(b1Var.n, this.n) != 0) {
            return false;
        }
        if (Double.compare(b1Var.e, this.e) != 0) {
            return false;
        }
        if (Double.compare(b1Var.i, this.i) != 0) {
            return false;
        }
        if (Double.compare(b1Var.f, this.f) != 0) {
            return false;
        }
        return Double.compare(b1Var.a, this.a) == 0;
    }

    public String toString() {
        if (equals(m)) {
            return z[10];
        }
        if (equals(k)) {
            return z[4];
        }
        if (equals(h)) {
            return z[3];
        }
        return equals(b) ? z[0] : z[6] + this.i + z[1] + this.f + z[8] + this.a + z[2] + this.l + z[5] + this.g + z[7] + this.d + z[9] + this.j + z[11] + this.n + z[12] + this.e + '}';
    }

    public int hashCode() {
        int i = am.b;
        long doubleToLongBits = Double.doubleToLongBits(this.i);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        doubleToLongBits = Double.doubleToLongBits(this.f);
        i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.a);
        i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.l);
        i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.g);
        i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.d);
        i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.j);
        i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.n);
        i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.e);
        i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        if (i != 0) {
            DialogToastActivity.i = !DialogToastActivity.i;
        }
        return i2;
    }
}
