package com.whatsapp.protocol;

import java.util.Vector;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class w {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "s/y]";
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
                        i3 = 16;
                        break;
                    case ay.f /*1*/:
                        i3 = 64;
                        break;
                    case ay.n /*2*/:
                        i3 = 29;
                        break;
                    case ay.p /*3*/:
                        i3 = 56;
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
                    str = "d%eL";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "u2oW=";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(int i) {
    }

    public abstract void a(bi biVar, String str);

    public void a(Exception exception) {
    }

    public void a(bi biVar) {
        boolean z = b.n;
        Vector f = biVar.f(z[1]);
        int i = 0;
        while (i < f.size()) {
            bi biVar2 = (bi) f.elementAt(i);
            if (biVar2 != null) {
                String b = biVar2.b(z[0]);
                String b2 = biVar2.b(z[2]);
                if (b != null) {
                    a(Integer.parseInt(b), b2);
                }
            }
            int i2 = i + 1;
            if (!z) {
                i = i2;
            } else {
                return;
            }
        }
    }

    public void a(int i, String str) {
        a(i);
    }
}
