package defpackage;

import com.whatsapp.vk;
import java.io.ByteArrayInputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class a {
    private static final String[] z;
    c a;
    String b;

    static {
        String[] strArr = new String[17];
        String str = "Fq";
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
                        i3 = 75;
                        break;
                    case ay.f /*1*/:
                        i3 = 123;
                        break;
                    case ay.n /*2*/:
                        i3 = 87;
                        break;
                    case ay.p /*3*/:
                        i3 = 8;
                        break;
                    default:
                        i3 = 40;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "Fq";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "Fq";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "A-\u0012Z{\u00024\u00192";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "=\u00186zLyUf";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "=\u00186zLyUf";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "=\u00186zLyUf";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    str = "yUf";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "=\u00186zLxUg";
                    obj = 8;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "=\u00186zLxUg";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "xUg";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "=\u00186zLyUf";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u001e(zI{\b2\u001e";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "=\u00186zLyUf";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "=\u00186zLxUg";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = ";\u001a%{Mk\u001d6aD.\u001fy M=\u001e9(]8\u001ew;\u0006{['iZ8\u001e%!";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "Fq";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean a(String str, n nVar) {
        return a(str, z[13], nVar);
    }

    public boolean a(String str, String str2, n nVar) {
        String c = c(str);
        if (this.a.a(new ByteArrayInputStream(c.getBytes(str2)), str2, nVar)) {
            return true;
        }
        if (this.b.equals(z[14])) {
            b(z[15]);
            return a(c, nVar);
        }
        throw new g(z[16]);
    }

    public a() {
        this.a = null;
        this.b = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String c(java.lang.String r9) {
        /*
        r8_this = this;
        r1 = 0;
        r2 = defpackage.o.a;
        r8.a(r9);
        r0 = z;
        r3 = 1;
        r0 = r0[r3];
        r3 = "\n";
        r0 = r9.replaceAll(r0, r3);
        r3 = "\n";
        r3 = r0.split(r3);
        r4 = new java.lang.StringBuilder;
        r0 = "";
        r4.<init>(r0);
        r0 = r1;
    L_0x001f:
        r5 = r3.length;
        if (r0 >= r5) goto L_0x007c;
    L_0x0022:
        r5 = r3[r0];
        r6 = ":";
        r5 = r5.indexOf(r6);
        if (r5 >= 0) goto L_0x006a;
    L_0x002c:
        r5 = r3[r0];
        r5 = r5.length();
        if (r5 != 0) goto L_0x0054;
    L_0x0034:
        r5 = r0 + 1;
        r6 = r3.length;
        if (r5 >= r6) goto L_0x0054;
    L_0x0039:
        r5 = r0 + 1;
        r5 = r3[r5];
        r6 = ":";
        r5 = r5.indexOf(r6);
        if (r5 <= 0) goto L_0x0054;
    L_0x0045:
        r5 = r3[r0];
        r5 = r4.append(r5);
        r6 = z;
        r6 = r6[r1];
        r5.append(r6);
        if (r2 == 0) goto L_0x0078;
    L_0x0054:
        r5 = " ";
        r5 = r4.append(r5);
        r6 = r3[r0];
        r5 = r5.append(r6);
        r6 = z;
        r7 = 3;
        r6 = r6[r7];
        r5.append(r6);
        if (r2 == 0) goto L_0x0078;
    L_0x006a:
        r5 = r3[r0];
        r5 = r4.append(r5);
        r6 = z;
        r7 = 2;
        r6 = r6[r7];
        r5.append(r6);
    L_0x0078:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x001f;
    L_0x007c:
        r0 = r4.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.c(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r5) {
        /*
        r4_this = this;
        r0 = defpackage.o.a;
        r1 = r4.b;
        if (r1 != 0) goto L_0x0059;
    L_0x0006:
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        r1 = r5.indexOf(r1);
        r2 = -1;
        if (r1 != r2) goto L_0x001b;
    L_0x0012:
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r4.b = r2;
        if (r0 == 0) goto L_0x0059;
    L_0x001b:
        r2 = "\n";
        r3 = r1 + 1;
        r2 = r5.indexOf(r2, r3);
        r1 = r5.substring(r1, r2);
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r2 = r1.indexOf(r2);
        if (r2 <= 0) goto L_0x003c;
    L_0x0033:
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r4.b = r2;
        if (r0 == 0) goto L_0x0059;
    L_0x003c:
        r2 = z;
        r3 = 11;
        r2 = r2[r3];
        r1 = r1.indexOf(r2);
        if (r1 <= 0) goto L_0x0052;
    L_0x0048:
        r1 = z;
        r2 = 9;
        r1 = r1[r2];
        r4.b = r1;
        if (r0 == 0) goto L_0x0059;
    L_0x0052:
        r0 = z;
        r1 = 7;
        r0 = r0[r1];
        r4.b = r0;
    L_0x0059:
        r0 = r4.b;
        r1 = z;
        r2 = 12;
        r1 = r1[r2];
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x006e;
    L_0x0067:
        r0 = new c;
        r0.<init>();
        r4.a = r0;
    L_0x006e:
        r0 = r4.b;
        r1 = z;
        r2 = 10;
        r1 = r1[r2];
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0083;
    L_0x007c:
        r0 = new d;
        r0.<init>();
        r4.a = r0;
    L_0x0083:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.a(java.lang.String):void");
    }

    private void b(String str) {
        this.b = str;
    }
}
