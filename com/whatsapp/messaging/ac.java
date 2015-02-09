package com.whatsapp.messaging;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import com.whatsapp.protocol.c1;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class ac implements c1 {
    private static final String[] z;
    final Messenger a;
    final Bundle b;
    final bf c;

    static {
        String[] strArr = new String[6];
        String str = "\u001fk3[6\u001f";
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
                        i3 = 108;
                        break;
                    case ay.f /*1*/:
                        i3 = 31;
                        break;
                    case ay.n /*2*/:
                        i3 = 82;
                        break;
                    case ay.p /*3*/:
                        i3 = 47;
                        break;
                    default:
                        i3 = 67;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0018v?J0\u0018~?_";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0019q3M/\t?&@c\u001fz<Kc\u0018prL\"\u0000s0N \u0007??J0\u001f~5J";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0019q3M/\t?&@c\u001fz<Kc\u0018prL\"\u0000s0N \u0007??J0\u001f~5J";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0019q3M/\t?&@c\u001fz<Kc\u0018prL\"\u0000s0N \u0007??J0\u001f~5J";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0019q3M/\t?&@c\u001fz<Kc\u0018prL\"\u0000s0N \u0007??J0\u001f~5J";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void b() {
        try {
            this.a.send(Message.obtain(null, 2, this.b));
        } catch (Throwable e) {
            Log.b(z[3], e);
        }
    }

    ac(bf bfVar, Bundle bundle, Messenger messenger) {
        this.c = bfVar;
        this.b = bundle;
        this.a = messenger;
    }

    public void a(long j, String str) {
        try {
            this.b.putString(z[0], str);
            this.b.putLong(z[2], j);
            this.a.send(Message.obtain(null, 1, this.b));
        } catch (Throwable e) {
            Log.b(z[1], e);
        }
    }

    public void a() {
        try {
            this.a.send(Message.obtain(null, 3, this.b));
        } catch (Throwable e) {
            Log.b(z[5], e);
        }
    }

    public void a(int i) {
        try {
            this.a.send(Message.obtain(null, 0, i, 0, this.b));
        } catch (Throwable e) {
            Log.b(z[4], e);
        }
    }
}
