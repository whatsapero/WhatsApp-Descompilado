package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class m {
    private static final String[] z;
    public final String a;
    public final boolean b;
    public final String c;

    static {
        String[] strArr = new String[3];
        String str = "_\u001f<0w\u001cK+\np\u001a[s";
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
                        i3 = 115;
                        break;
                    case ay.f /*1*/:
                        i3 = 63;
                        break;
                    case ay.n /*2*/:
                        i3 = 78;
                        break;
                    case ay.p /*3*/:
                        i3 = 85;
                        break;
                    default:
                        i3 = 26;
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
                    str = "_\u001f('u\u001e`#0'";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "8Z7\u000es\u0017\u0002";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
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
        m mVar = (m) obj;
        if (this.b != mVar.b) {
            return false;
        }
        if (this.a == null) {
            if (mVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(mVar.a)) {
            return false;
        }
        return this.c == null ? mVar.c == null : this.c.equals(mVar.c);
    }

    public String toString() {
        return z[1] + this.a + z[2] + this.b + z[0] + this.c + "]";
    }

    public m(String str, boolean z, String str2) {
        this.c = str;
        this.b = z;
        this.a = str2;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.b) {
            i = 1231;
        } else {
            i = 1237;
        }
        i = ((this.a == null ? 0 : this.a.hashCode()) + ((i + 31) * 31)) * 31;
        if (this.c != null) {
            i2 = this.c.hashCode();
        }
        return i + i2;
    }
}
