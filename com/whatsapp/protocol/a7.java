package com.whatsapp.protocol;

import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a7 extends w {
    private static final String[] z;
    final j a;

    static {
        String[] strArr = new String[5];
        String str = "ybJw";
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
                        i3 = 9;
                        break;
                    case ay.f /*1*/:
                        i3 = 16;
                        break;
                    case ay.n /*2*/:
                        i3 = 37;
                        break;
                    case ay.p /*3*/:
                        i3 = 7;
                        break;
                    default:
                        i3 = 56;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u007fqIr]";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "ybJwK";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "gqHb";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u007fuWtQf~";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(bi biVar, String str) {
        int i = 0;
        boolean z = b.n;
        bi d = biVar.d(z[3]);
        if (d != null) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(d.b(z[1]));
            } catch (NumberFormatException e) {
                parseInt = 0;
            }
            Vector f = d.f(z[0]);
            Hashtable hashtable = new Hashtable();
            while (i < f.size()) {
                bi biVar2 = (bi) f.elementAt(i);
                hashtable.put(biVar2.b(z[4]), biVar2.b(z[2]));
                i++;
                if (z) {
                    break;
                }
            }
            j.a(this.a).a(parseInt, hashtable);
        }
    }

    a7(j jVar) {
        this.a = jVar;
    }
}
