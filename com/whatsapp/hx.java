package com.whatsapp;

import com.whatsapp.protocol.cd;
import com.whatsapp.util.Log;
import java.util.HashSet;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class hx implements Runnable, cd {
    private static final HashSet c;
    private static final String[] z;
    public String a;
    private final Runnable b;

    public hx(String str) {
        this.b = new a1(this);
        this.a = str;
        Log.b(c.add(str));
        App.p.U().postDelayed(this.b, 20000);
    }

    public void run() {
        Log.i(z[1]);
        App.p.U().removeCallbacks(this.b);
        c.remove(this.a);
    }

    static {
        String[] strArr = new String[3];
        String str = "s\u000b[r\u0012v\u000bV`\u000e~\u0016Q}\u0001m\u0001Kc\tq\u0017]{\u0007q\u0000Tv\u00140\u0010Q~\u0003p\u0011L";
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
                        i3 = 31;
                        break;
                    case ay.f /*1*/:
                        i3 = 100;
                        break;
                    case ay.n /*2*/:
                        i3 = 56;
                        break;
                    case ay.p /*3*/:
                        i3 = 19;
                        break;
                    default:
                        i3 = 102;
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
                    str = "s\u000b[r\u0012v\u000bV`\u000e~\u0016Q}\u0001m\u0001Kc\tq\u0017]{\u0007q\u0000Tv\u00140\u0001Ja\tmD";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    c = new HashSet();
                default:
                    strArr2[i] = str;
                    str = "s\u000b[r\u0012v\u000bV`\u000e~\u0016Q}\u0001m\u0001Kc\tq\u0017]{\u0007q\u0000Tv\u00140\u0017Mp\u0005z\u0017K";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(int i) {
        Log.e(z[2] + i);
        App.p.U().removeCallbacks(this.b);
        c.remove(this.a);
    }

    public void a() {
        Log.e(z[0]);
        c.remove(this.a);
    }
}
