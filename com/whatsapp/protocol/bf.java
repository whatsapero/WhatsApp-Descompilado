package com.whatsapp.protocol;

import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class bf extends w {
    private static final String[] z;
    final j a;
    final String[] b;

    static {
        String[] strArr = new String[3];
        String str = "^?W`";
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
                        i3 = 43;
                        break;
                    case ay.f /*1*/:
                        i3 = 76;
                        break;
                    case ay.n /*2*/:
                        i3 = 50;
                        break;
                    case ay.p /*3*/:
                        i3 = 18;
                        break;
                    default:
                        i3 = 82;
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
                    str = "]-^g7";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "A%V";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(int i) {
        j.a(this.a).c(i);
    }

    public void a(Exception exception) {
        j.a(this.a).a(exception);
    }

    public void a(bi biVar, String str) {
        boolean z = n;
        Hashtable hashtable = new Hashtable(this.b.length);
        int i = 0;
        while (i < this.b.length) {
            hashtable.put(this.b[i], new Vector());
            i++;
            if (z) {
                break;
            }
        }
        bi a = biVar.a(0);
        if (!(a == null || a.e == null || a.e.length <= 0)) {
            int i2 = 0;
            while (i2 < a.e.length) {
                bi biVar2 = a.e[i2];
                bi.b(biVar2, z[0]);
                String e = biVar2.e(z[1]);
                if (hashtable.containsKey(e)) {
                    Vector vector = (Vector) hashtable.get(e);
                    int i3 = 0;
                    while (i3 < biVar2.e.length) {
                        vector.addElement(new k(biVar2.e[i3].f, biVar2.e[i3].e(z[2])));
                        i3++;
                        if (z) {
                            break;
                        }
                    }
                }
                i = i2 + 1;
                if (z) {
                    break;
                }
                i2 = i;
            }
        }
        j.a(this.a).d(hashtable);
    }

    bf(j jVar, String[] strArr) {
        this.a = jVar;
        this.b = strArr;
    }
}
