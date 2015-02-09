package com.whatsapp.protocol;

import java.util.Hashtable;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class aq extends w {
    private static final String[] z;
    final j a;

    static {
        String[] strArr = new String[7];
        String str = "c\u007f\u00029B";
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
                        i3 = 6;
                        break;
                    case ay.f /*1*/:
                        i3 = 13;
                        break;
                    case ay.n /*2*/:
                        i3 = 112;
                        break;
                    case ay.p /*3*/:
                        i3 = 86;
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
                    str = "pl\u001c#U";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "c\u007f\u00029B";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "v\u007f\u0019 Qet";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "eb\u00143";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "hl\u001d3";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "el\u00043Wi\u007f\t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(int i) {
    }

    aq(j jVar) {
        this.a = jVar;
    }

    public void a(bi biVar, String str) {
        boolean z = b.n;
        bi a = biVar.a(0);
        Hashtable hashtable = new Hashtable();
        bi.b(a, z[4]);
        if (a.e != null) {
            int i = 0;
            while (i < a.e.length) {
                bi biVar2 = a.e[i];
                bi.b(biVar2, z[1]);
                String b = biVar2.b(z[6]);
                Object b2 = biVar2.b(z[2]);
                if (z[0].equals(b2)) {
                    bi a2 = biVar2.a(0);
                    bi.b(a2, z[3]);
                    b2 = a2.b(z[5]);
                }
                hashtable.put(b, b2);
                i++;
                if (z) {
                    break;
                }
            }
        }
        j.a(this.a).a(hashtable);
    }
}
