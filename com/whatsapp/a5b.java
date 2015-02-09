package com.whatsapp;

import com.whatsapp.protocol.cz;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aE;
import org.whispersystems.libaxolotl.ay;

final class a5b implements Runnable {
    private static final String[] z;
    private final cz a;
    private final byte[] b;
    private final int c;
    private final cz[] d;
    private final boolean e;
    final a13 f;

    static {
        String[] strArr = new String[4];
        String str = "VH^j_C\\\u0011uUYTXhW\u0017BTrBN\u0010CcSRYAr\u0010Q_C&";
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
                        i3 = 55;
                        break;
                    case ay.f /*1*/:
                        i3 = 48;
                        break;
                    case ay.n /*2*/:
                        i3 = 49;
                        break;
                    case ay.p /*3*/:
                        i3 = 6;
                        break;
                    default:
                        i3 = 48;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "VH^j_C\\\u0011hURTB&DX\u0010Bc^S\u0010CcDEI\u0011tUTUXvD\u0017V^t\u0010";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "VH^j_C\\\u0011uUYTXhW\u0017\\^eQ[\u0010AtU\u0017[T\u007fC\u0017D^&CRBGcB\u0017V^t\u0010EUVoCCBPrYX^\u0011oT\u0017";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0017GXrX\u0017BTaYDDCgD^__&YS\u0010";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        if (this.f.e.b()) {
            Log.i(z[2] + this.f.e.e);
            byte[] a = aE.a(this.c);
            if (this.e) {
                Log.i(z[3] + this.c);
                App.a(this.b, a, (byte) 5, this.d, this.a);
            }
            Log.i(z[0] + this.f.e.e + z[1] + this.c);
            App.a(this.f.e, this.f.e.I + 1, a);
        }
    }

    a5b(a13 com_whatsapp_a13, f_ f_Var) {
        this.f = com_whatsapp_a13;
        this.e = f_Var.d();
        this.c = f_Var.b();
        this.b = f_Var.a();
        this.d = f_Var.f();
        this.a = f_Var.c().a();
    }
}
