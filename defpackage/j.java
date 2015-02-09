package defpackage;

import com.whatsapp.DialogToastActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class j {
    public static boolean f;
    private static final String[] z;
    public List a;
    public Set b;
    public byte[] c;
    public String d;
    public String e;
    public Set g;

    static {
        String[] strArr = new String[7];
        String str = "h\u001e=0[4h,.A!a;'W0Q?bG-D(x\u0014";
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
                        i3 = 68;
                        break;
                    case ay.f /*1*/:
                        i3 = 62;
                        break;
                    case ay.n /*2*/:
                        i3 = 77;
                        break;
                    case ay.p /*3*/:
                        i3 = 66;
                        break;
                    default:
                        i3 = 52;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "4L\"2z%S(x\u0014";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "h\u001e=0[4S\u0000#D\u001bj\u0014\u0012q~\u001e";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "h\u001e=0[4h,.A!a/;@!Mm1]>[wb";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "h\u001e=0[4h,.A!\u0004m";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "h\u001e=#F%S\u0000#D~\u001e";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "h\u001e=0[4y?-A4m(6\u000ed";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.e == null || !this.e.equals(jVar.e) || !this.g.equals(jVar.g) || !this.b.equals(jVar.b)) {
            return false;
        }
        if (this.c != null && Arrays.equals(this.c, jVar.c)) {
            return true;
        }
        if (this.d.equals(jVar.d)) {
            return this.a.equals(jVar.a) || this.a.size() == 1 || jVar.a.size() == 1;
        } else {
            return false;
        }
    }

    public j() {
        this.e = "";
        this.d = "";
        this.a = new ArrayList();
        this.g = new HashSet();
        this.b = new HashSet();
    }

    public void a(String str) {
        this.g.add(str.toUpperCase());
    }

    public String toString() {
        boolean z = false;
        boolean z2 = f;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(z[2]);
        stringBuilder.append(this.e);
        stringBuilder.append(z[6]);
        stringBuilder.append(z[3]);
        stringBuilder.append(this.g.toString());
        stringBuilder.append(z[1]);
        stringBuilder.append(this.b.toString());
        if (this.a != null && this.a.size() > 1) {
            stringBuilder.append(z[0]);
            stringBuilder.append(this.a.size());
        }
        if (this.c != null) {
            stringBuilder.append(z[4]);
            stringBuilder.append(this.c.length);
        }
        stringBuilder.append(z[5]);
        stringBuilder.append(this.d);
        String toString = stringBuilder.toString();
        if (z2) {
            if (!DialogToastActivity.i) {
                z = true;
            }
            DialogToastActivity.i = z;
        }
        return toString;
    }
}
