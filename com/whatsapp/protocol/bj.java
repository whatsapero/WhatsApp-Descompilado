package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class bj {
    private static final String[] z;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    static {
        String[] strArr = new String[6];
        String str = "z)>\u0018`g";
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
                        i3 = 90;
                        break;
                    case ay.f /*1*/:
                        i3 = 79;
                        break;
                    case ay.n /*2*/:
                        i3 = 76;
                        break;
                    case ay.p /*3*/:
                        i3 = 119;
                        break;
                    default:
                        i3 = 13;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "z?-\u0005y3,%\u0007l4;q";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "z;5\u0007hg";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "z&(J";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "z, \u00040";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0001\u001c8\u0016c .\u0007\u0012t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        return z[1] + (this.a == null ? "" : z[0] + this.a) + (this.c == null ? "" : z[5] + this.c) + (this.b == null ? "" : z[4] + this.b) + (this.e == null ? "" : z[3] + this.e) + (this.d == null ? "" : z[2] + this.d) + "]";
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.d == null ? 0 : this.d.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + 31) * 31)) * 31)) * 31)) * 31;
        if (this.e != null) {
            i = this.e.hashCode();
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        bj bjVar = (bj) obj;
        if (this.c == null) {
            if (bjVar.c != null) {
                return false;
            }
        } else if (!this.c.equals(bjVar.c)) {
            return false;
        }
        if (this.a == null) {
            if (bjVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(bjVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (bjVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(bjVar.b)) {
            return false;
        }
        if (this.d == null) {
            if (bjVar.d != null) {
                return false;
            }
        } else if (!this.d.equals(bjVar.d)) {
            return false;
        }
        return this.e == null ? bjVar.e == null : this.e.equals(bjVar.e);
    }
}
