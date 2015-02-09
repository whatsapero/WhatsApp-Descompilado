package com.whatsapp.protocol;

import java.util.Vector;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class aj extends w {
    private static final String[] z;
    final j a;
    final Runnable b;
    final cd c;

    static {
        String[] strArr = new String[3];
        String str = "YWg\u0017`";
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
                        i3 = 53;
                        break;
                    case ay.f /*1*/:
                        i3 = 50;
                        break;
                    case ay.n /*2*/:
                        i3 = 6;
                        break;
                    case ay.p /*3*/:
                        i3 = 97;
                        break;
                    default:
                        i3 = 5;
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
                    str = "\\V";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "R@i\u0014u";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    aj(j jVar, Runnable runnable, cd cdVar) {
        this.a = jVar;
        this.b = runnable;
        this.c = cdVar;
    }

    public void a(int i) {
        if (this.c != null) {
            this.c.a(i);
        }
    }

    public void a(bi biVar, String str) {
        bi d = biVar.d(z[0]);
        if (d != null) {
            Vector vector = new Vector();
            j.a(this.a, d, vector, z[1], z[2]);
            if (vector.size() > 0) {
                j.c(this.a).b(vector);
            }
        }
        if (this.b != null) {
            this.b.run();
        }
    }
}
