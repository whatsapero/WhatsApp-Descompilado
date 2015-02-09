package com.whatsapp;

import com.whatsapp.protocol.c5;
import com.whatsapp.protocol.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class amg implements Runnable {
    private static final String z;
    final String a;
    final String b;
    final ale c;
    final c5 d;
    final int e;

    static {
        char[] toCharArray = "\u0001\u0004'".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 118;
                    break;
                case ay.f /*1*/:
                    i2 = 97;
                    break;
                case ay.n /*2*/:
                    i2 = 69;
                    break;
                case ay.p /*3*/:
                    i2 = 38;
                    break;
                default:
                    i2 = 49;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        int i = App.az;
        List arrayList = new ArrayList();
        Iterator it = this.d.j.iterator();
        while (it.hasNext()) {
            long j;
            Object obj;
            c5 c5Var = (c5) it.next();
            Map b = App.aJ.b(c5Var.b, c5Var.h);
            Vector vector = new Vector(b.size());
            long j2 = 0;
            for (Entry entry : b.entrySet()) {
                Object obj2;
                String str = (String) entry.getKey();
                pj pjVar = (pj) entry.getValue();
                p pVar;
                if (pjVar.d > c5Var.l) {
                    pVar = new p(str, 4);
                    j = pjVar.d;
                    obj2 = pVar;
                } else {
                    p pVar2;
                    if (pjVar.a > c5Var.l) {
                        pVar = new p(str, 3);
                        j = pjVar.a;
                        pVar2 = pVar;
                    } else {
                        if (pjVar.b > c5Var.l) {
                            pVar = new p(str, 2);
                            j = pjVar.b;
                            pVar2 = pVar;
                        } else {
                            if (pjVar.c > c5Var.l) {
                                pVar = new p(str, 1);
                                j = pjVar.c;
                                pVar2 = pVar;
                            } else {
                                obj2 = null;
                                j = 0;
                            }
                        }
                    }
                }
                if (obj2 != null) {
                    vector.add(obj2);
                    if (j > j2) {
                        j2 = j;
                    }
                    j = j2;
                } else {
                    j = j2;
                }
                if (i != 0) {
                    break;
                }
                j2 = j;
            }
            j = j2;
            if (vector.size() > 0) {
                c5 c5Var2 = new c5();
                c5Var2.b = c5Var.b;
                c5Var2.l = j;
                c5Var2.j = vector;
                obj = c5Var2;
            } else {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
                continue;
            }
            if (i != 0) {
                break;
            }
        }
        App.a(this.b, this.a, z);
        App.a(this.b, arrayList, this.e);
    }

    amg(ale com_whatsapp_ale, c5 c5Var, String str, String str2, int i) {
        this.c = com_whatsapp_ale;
        this.d = c5Var;
        this.b = str;
        this.a = str2;
        this.e = i;
    }
}
