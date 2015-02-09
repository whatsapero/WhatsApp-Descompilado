package com.whatsapp;

import android.util.Pair;
import com.whatsapp.notification.t;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.c;
import com.whatsapp.protocol.c5;
import com.whatsapp.protocol.m;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class dm implements Runnable {
    private static final String[] z;
    final int a;
    final String b;
    final String c;
    final c5 d;
    final ale e;

    static {
        String[] strArr = new String[8];
        String str = "#\u0018{avwA";
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
                        i3 = 3;
                        break;
                    case ay.f /*1*/:
                        i3 = 123;
                        break;
                    case ay.n /*2*/:
                        i3 = 20;
                        break;
                    case ay.p /*3*/:
                        i3 = 20;
                        break;
                    default:
                        i3 = 24;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "r\tKemf\tm;jf\bay},\u0018xqyqT";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "t\u001ev";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "r\tKemf\tm;jf\bay},\u0018{znf\tgulj\u0014zg7";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "r\tKemf\tm;jf\bay},\u001a|qygT";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "r\tKemf\tm;jf\bay},\u001fqx}w\u001e;";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "#\u0018{avwA";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "r\tKemf\tm;jf\bay},\u0018xqyqTy{|w\u001as;";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    dm(ale com_whatsapp_ale, c5 c5Var, String str, int i, String str2) {
        this.e = com_whatsapp_ale;
        this.d = c5Var;
        this.c = str;
        this.a = i;
        this.b = str2;
    }

    public void run() {
        int i = App.az;
        List arrayList = new ArrayList();
        List<Pair> arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet(v.b());
        Iterator it = this.d.j.iterator();
        while (it.hasNext()) {
            c5 c5Var;
            boolean z;
            c cVar = (c) it.next();
            m mVar = cVar.h;
            boolean z2 = cVar.f;
            String str = cVar.b;
            long j = cVar.g;
            int i2 = cVar.a;
            boolean z3 = cVar.e;
            if (hashSet.contains(str)) {
                b B = App.aJ.B(str);
                c5 a;
                b b;
                if (App.aJ.y(str) != cVar.c) {
                    a = ale.a(str, 1);
                    b = App.aJ.b(str, ale.b(a.l, cVar.d));
                    if (b != null) {
                        arrayList2.add(Pair.create(str, b.e));
                        a.a = true;
                    }
                    Log.i(z[1] + str + z[7] + ale.b(a.l, cVar.d));
                    c5Var = a;
                } else {
                    if (B != null) {
                        if (!B.e.equals(mVar)) {
                            if (App.aJ.b(mVar) != null) {
                                c5Var = ale.a(str, 0);
                                arrayList2.add(Pair.create(str, mVar));
                                c5Var.a = true;
                                Log.i(z[4] + str);
                            } else {
                                a = ale.a(str, 3);
                                b = App.aJ.b(str, ale.b(a.l, cVar.d));
                                if (b != null) {
                                    arrayList2.add(Pair.create(str, b.e));
                                    a.a = true;
                                }
                                Log.i(z[5] + str + z[0] + ale.b(a.l, cVar.d));
                                c5Var = a;
                            }
                        }
                    } else if (mVar != null) {
                        c5Var = ale.a(str, 1);
                        Log.i(z[2] + str);
                    }
                    c5Var = null;
                }
            } else {
                c5Var = new c5();
                c5Var.b = str;
                c5Var.k = 2;
                Log.i(z[6] + str);
            }
            hashSet.remove(str);
            boolean q = App.aJ.q(str);
            long c = t.c(App.p, str);
            long j2 = (c / 1000) * 1000;
            if (!bd.b(str)) {
                z = false;
            } else if (bd.f(str)) {
                z = false;
            } else {
                z = true;
            }
            m8 b2 = v.b(str);
            int i3 = b2 != null ? b2.a : 0;
            if (c5Var == null && !(q == z2 && j2 == j && z == z3 && (b2 == null || i2 == i3))) {
                c5Var = new c5();
                c5Var.b = str;
            }
            if (c5Var != null) {
                c5Var.g = q;
                c5Var.r = c;
                c5Var.m = z;
                c5Var.e = i3;
                arrayList.add(c5Var);
                continue;
            }
            if (i != 0) {
                break;
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            c5 a2 = ale.a(str2, 0);
            a2.g = App.aJ.q(str2);
            a2.r = t.c(App.p, str2);
            z = bd.b(str2) ? !bd.f(str2) : false;
            a2.m = z;
            arrayList.add(a2);
            arrayList2.add(Pair.create(str2, (m) null));
            if (App.aJ.B(str2) != null) {
                a2.a = true;
                continue;
            }
            if (i != 0) {
                break;
            }
        }
        App.a(this.c, arrayList, this.a);
        App.a(this.c, this.b, z[3]);
        for (Pair pair : arrayList2) {
            List a3 = App.aJ.a((String) pair.first, (m) pair.second);
            if (a3 != null) {
                App.a(2, a3, false, false, null, null);
                continue;
            }
            if (i != 0) {
                return;
            }
        }
    }
}
