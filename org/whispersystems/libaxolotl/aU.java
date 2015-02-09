package org.whispersystems.libaxolotl;

import java.util.Collections;
import java.util.Set;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;

final class au extends aK {
    static final au b;
    private static final long serialVersionUID = 0;
    private static final String[] z;

    public Object a(bL bLVar) {
        return ae.a(bLVar.a(), z[0]);
    }

    public aK a(bY bYVar) {
        ae.a(bYVar);
        return aK.d();
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public Set a() {
        return Collections.emptySet();
    }

    public aK a(aK aKVar) {
        return (aK) ae.a(aKVar);
    }

    au() {
    }

    public boolean b() {
        return false;
    }

    public Object e() {
        return null;
    }

    public Object c() {
        throw new IllegalStateException(z[2]);
    }

    public int hashCode() {
        return 1502476572;
    }

    static {
        String[] strArr = new String[4];
        String str = "tR<$*so,h))\bym+rU<e!!N?$$!r,t5mH<veuI8pesD-q7oRyj0mM";
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
                        i3 = 1;
                        break;
                    case ay.f /*1*/:
                        i3 = 33;
                        break;
                    case ay.n /*2*/:
                        i3 = 89;
                        break;
                    case ay.p /*3*/:
                        i3 = 4;
                        break;
                    default:
                        i3 = 69;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "w@5q !H*$$cR<j1";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "tR<$*so,h))\bym+rU<e!!N?$*s\t7q)m\b";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = new au();
                default:
                    strArr2[i] = str;
                    str = "NQ-m*o@5*$cR<j1)\b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Object c(Object obj) {
        return ae.a(obj, z[3]);
    }

    public String toString() {
        return z[1];
    }

    private Object readResolve() {
        return b;
    }
}
