package de.greenrobot.event.util;

import android.os.Bundle;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public abstract class h {
    public static boolean a;
    private static final String[] z;
    protected final d b;

    static {
        String[] strArr = new String[10];
        String str = "6A\u001f\u001dk7A_\bv0KET|$A_\u000e{'W\u001f\u001fk KC\u001ep3H^\u001d77RT\u0014m\rPH\n|\rK_%z>KB\u001f";
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
                        i3 = 82;
                        break;
                    case ay.f /*1*/:
                        i3 = 36;
                        break;
                    case ay.n /*2*/:
                        i3 = 49;
                        break;
                    case ay.p /*3*/:
                        i3 = 122;
                        break;
                    default:
                        i3 = 25;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "6A\u001f\u001dk7A_\bv0KET|$A_\u000e{'W\u001f\u001fk KC\u001ep3H^\u001d7&ME\u0016|";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "6A\u001f\u001dk7A_\bv0KET|$A_\u000e{'W\u001f\u001fk KC\u001ep3H^\u001d7?AB\tx5A";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "6A\u001f\u001dk7A_\bv0KET|$A_\u000e{'W\u001f\u001fk KC\u001ep3H^\u001d77RT\u0014m\rPH\n|\rK_%z>KB\u001f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "6A\u001f\u001dk7A_\bv0KET|$A_\u000e{'W\u001f\u001fk KC\u001ep3H^\u001d7?AB\tx5A";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "6A\u001f\u001dk7A_\bv0KET|$A_\u000e{'W\u001f\u001fk KC\u001ep3H^\u001d74M_\u0013j:{P\u001cm7Vn\u001ep3H^\u001d";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "6A\u001f\u001dk7A_\bv0KET|$A_\u000e{'W\u001f\u001fk KC\u001ep3H^\u001d74M_\u0013j:{P\u001cm7Vn\u001ep3H^\u001d";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "6A\u001f\u001dk7A_\bv0KET|$A_\u000e{'W\u001f\u001fk KC\u001ep3H^\u001d7;G^\u0014F;@";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "6A\u001f\u001dk7A_\bv0KET|$A_\u000e{'W\u001f\u001fk KC\u001ep3H^\u001d7&ME\u0016|";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "6A\u001f\u001dk7A_\bv0KET|$A_\u000e{'W\u001f\u001fk KC\u001ep3H^\u001d7;G^\u0014F;@";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected abstract Object a(b bVar, Bundle bundle);

    protected h(d dVar) {
        this.b = dVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.Object a(de.greenrobot.event.util.b r5, boolean r6, android.os.Bundle r7) {
        /*
        r4_this = this;
        r0 = r5.a();
        if (r0 == 0) goto L_0x0008;
    L_0x0006:
        r0 = 0;
    L_0x0007:
        return r0;
    L_0x0008:
        if (r7 == 0) goto L_0x0014;
    L_0x000a:
        r0 = r7.clone();
        r0 = (android.os.Bundle) r0;
        r1 = a;
        if (r1 == 0) goto L_0x0019;
    L_0x0014:
        r0 = new android.os.Bundle;
        r0.<init>();
    L_0x0019:
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r1 = r0.containsKey(r1);
        if (r1 != 0) goto L_0x0031;
    L_0x0024:
        r1 = r4.b(r5, r0);
        r2 = z;
        r3 = 9;
        r2 = r2[r3];
        r0.putString(r2, r1);
    L_0x0031:
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r1 = r0.containsKey(r1);
        if (r1 != 0) goto L_0x0048;
    L_0x003c:
        r1 = r4.c(r5, r0);
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r0.putString(r2, r1);
    L_0x0048:
        r1 = z;
        r2 = 7;
        r1 = r1[r2];
        r1 = r0.containsKey(r1);
        if (r1 != 0) goto L_0x005b;
    L_0x0053:
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r0.putBoolean(r1, r6);
    L_0x005b:
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        r1 = r0.containsKey(r1);
        if (r1 != 0) goto L_0x0078;
    L_0x0066:
        r1 = r4.b;
        r1 = r1.h;
        if (r1 == 0) goto L_0x0078;
    L_0x006c:
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r2 = r4.b;
        r2 = r2.h;
        r0.putSerializable(r1, r2);
    L_0x0078:
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r1 = r0.containsKey(r1);
        if (r1 != 0) goto L_0x0096;
    L_0x0083:
        r1 = r4.b;
        r1 = r1.b;
        if (r1 == 0) goto L_0x0096;
    L_0x0089:
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        r2 = r4.b;
        r2 = r2.b;
        r0.putInt(r1, r2);
    L_0x0096:
        r0 = r4.a(r5, r0);
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: de.greenrobot.event.util.h.a(de.greenrobot.event.util.b, boolean, android.os.Bundle):java.lang.Object");
    }

    protected String b(b bVar, Bundle bundle) {
        return this.b.i.getString(this.b.f);
    }

    protected String c(b bVar, Bundle bundle) {
        return this.b.i.getString(this.b.a(bVar.a));
    }
}
