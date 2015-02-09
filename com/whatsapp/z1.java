package com.whatsapp;

import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import java.util.Vector;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class z1 implements Runnable {
    private static final String[] z;
    final nn a;
    final String b;
    final b c;

    static {
        String[] strArr = new String[3];
        String str = "]\u0000D8Q\u0018\u0010E`";
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
                        i3 = 125;
                        break;
                    case ay.f /*1*/:
                        i3 = 115;
                        break;
                    case ay.n /*2*/:
                        i3 = 49;
                        break;
                    case ay.p /*3*/:
                        i3 = 90;
                        break;
                    default:
                        i3 = 59;
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
                    str = "\u001a\u0001^/KR\u0010C?Z\t\u0016\u0011;\\\u001c\u001a_v\u001b\u0017\u001aU`";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0013\u001c\u00117H\u001a";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        try {
            String str;
            Thread.sleep(300);
            StringBuilder append = new StringBuilder().append(z[2]).append(this.b).append(z[0]);
            if (this.c == null) {
                str = z[1];
            } else {
                str = this.c.f();
            }
            Log.w(append.append(str).toString());
            App.d(new mz(this.b, this.c.f(), (Vector) this.c.A, 12));
        } catch (InterruptedException e) {
            throw e;
        } catch (InterruptedException e2) {
            try {
            }
        }
    }

    z1(nn nnVar, String str, b bVar) {
        this.a = nnVar;
        this.b = str;
        this.c = bVar;
    }
}
