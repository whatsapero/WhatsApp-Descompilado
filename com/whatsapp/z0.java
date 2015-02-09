package com.whatsapp;

import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class z0 implements Runnable {
    private static final String[] z;
    final pn a;
    private final boolean b;

    static {
        String[] strArr = new String[7];
        String str = "C\u0015;M\b\u0007\u00157T\b\u000f\u0005";
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
                        i3 = 99;
                        break;
                    case ay.f /*1*/:
                        i3 = 124;
                        break;
                    case ay.n /*2*/:
                        i3 = 86;
                        break;
                    case ay.p /*3*/:
                        i3 = 32;
                        break;
                    default:
                        i3 = 109;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0002\u00049L\u0002\u0017\u0010vR\b\u0010\u00198D\u0004\r\u001bv";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0002\u00049L\u0002\u0017\u0010vM\f\u0011\u0017?N\nC";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0002\u00049L\u0002\u0017\u0010vU\u0003\u0002\u001e:EM\u0017\u0013vR\b\u0010\u00198DM";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "C\u001d%\u0000\u001d\u0006\u00122I\u0003\u0004\\%E\u001e\u0010\u00159NM\u0010\b7T\b";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0002\u00049L\u0002\u0017\u0010vR\b\u0010\u00198D\u0004\r\u001bv";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "X\\;E\u001e\u0010\u001d1EM\u0004\u00138E";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        int i = App.az;
        App.a(this.a.a);
        b b = App.aJ.b(this.a.d);
        if (b != null) {
            Log.i(z[2] + this.a.d);
            b.I = this.a.e;
            if (this.b) {
                Log.i(z[3] + this.a.d + z[5]);
                App.aJ.a(this.a.d);
                App.a(new String[]{this.a.d.c});
                if (i == 0) {
                    return;
                }
            }
            Log.i(z[6] + this.a.d + z[0]);
            App.j(b);
            if (i == 0) {
                return;
            }
        }
        Log.i(z[4] + this.a.d + z[1]);
    }

    z0(pn pnVar, boolean z) {
        this.a = pnVar;
        this.b = z;
    }
}
