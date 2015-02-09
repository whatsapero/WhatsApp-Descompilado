package com.whatsapp;

import com.whatsapp.App.Me;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class an1 implements Runnable {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "g\\7\u0002B";
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
                        i3 = 71;
                        break;
                    case ay.f /*1*/:
                        i3 = 50;
                        break;
                    case ay.n /*2*/:
                        i3 = 82;
                        break;
                    case ay.p /*3*/:
                        i3 = 117;
                        break;
                    default:
                        i3 = 127;
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
                    str = "$Z3\u001b\u0018\"\\'\u0018\u001d\"@}\u0007\u001a4B=\u001b\f\"\u001d=\u001e_&^ \u0010\u001e#Kr\u0016\u0017&\\5\u0010\u001bx";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "$Z3\u001b\u0018\"\\'\u0018\u001d\"@}\u0007\u001a4B=\u001b\f\"\u001d=\u001e_(^6H";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    an1() {
    }

    public void run() {
        Me aq = App.aq();
        if (aq != null) {
            Log.i(z[1] + aq.jabber_id + z[0] + App.an.jabber_id);
            ChangeNumber.c(VerifySms.a(aq.cc, aq.number));
            ChangeNumber.c().sendEmptyMessage(7);
            a54.m();
            App.ao();
            ChangeNumber.b(App.p);
            if (App.az == 0) {
                return;
            }
        }
        Log.w(z[2]);
        a54.m();
    }
}
