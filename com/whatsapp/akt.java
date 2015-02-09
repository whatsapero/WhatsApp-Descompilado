package com.whatsapp;

import android.util.Pair;
import com.whatsapp.protocol.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Vector;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class akt implements Runnable {
    private static final String z;
    final jg a;
    final Hashtable b;

    static {
        char[] toCharArray = "kI\u0006/".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 38;
                    break;
                case ay.n /*2*/:
                    i2 = 111;
                    break;
                case ay.p /*3*/:
                    i2 = 95;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        int i = App.az;
        Collection arrayList = new ArrayList(this.b.size());
        for (Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((Vector) entry.getValue()).iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                if (z.equals(kVar.b)) {
                    arrayList.add(new Pair(str, ar.fromText(kVar.a)));
                    continue;
                }
                if (i != 0) {
                    break;
                    continue;
                }
            }
            if (i != 0) {
                break;
            }
        }
        App.P.d(arrayList);
        App.t.sendEmptyMessage(0);
    }

    akt(jg jgVar, Hashtable hashtable) {
        this.a = jgVar;
        this.b = hashtable;
    }
}
