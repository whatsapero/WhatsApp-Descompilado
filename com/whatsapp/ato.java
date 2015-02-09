package com.whatsapp;

import com.whatsapp.protocol.b;
import com.whatsapp.protocol.cz;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aE;
import org.whispersystems.libaxolotl.ay;

final class ato implements Runnable {
    private static final String[] z;
    private final cz[] a;
    final a_ b;
    private final byte[] c;
    private final boolean d;
    private final cz e;
    private final int f;

    static {
        String[] strArr = new String[5];
        String str = "|uv;wia9%}nhw3qsj9'jxf|.k";
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
                        i3 = 29;
                        break;
                    case ay.f /*1*/:
                        i3 = 13;
                        break;
                    case ay.n /*2*/:
                        i3 = 25;
                        break;
                    case ay.p /*3*/:
                        i3 = 87;
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
                    str = "=kv%8";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "=\u007f|4}t{|38|y9#qph9";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "=zp#p=";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "|uv;wia9%}nhw3qsj9%}i\u007f`wjx|l2ki-";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ato(a_ a_Var, byte[] bArr, int i, cz[] czVarArr, cz czVar, boolean z) {
        this.b = a_Var;
        this.c = bArr;
        this.f = i;
        this.a = czVarArr;
        this.e = czVar;
        this.d = z;
    }

    public void run() {
        byte[] a = aE.a(this.f);
        if (this.d) {
            Log.i(z[0]);
            App.a(this.c, a, (byte) 5, this.a, this.e);
        }
        Log.i(z[1] + this.b.a + z[2] + this.b.e + z[4] + this.f + z[3] + this.b.d);
        b bVar = new b(this.b.e);
        bVar.D = this.b.d;
        App.a(bVar, this.b.a, a);
    }
}
