package com.whatsapp;

import com.whatsapp.protocol.cd;
import com.whatsapp.protocol.t;
import com.whatsapp.util.Log;
import java.io.EOFException;
import java.net.SocketException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class a15 implements cd, t {
    private static final String[] z;
    ag a;

    static {
        String[] strArr = new String[6];
        String str = "\fYBRw\u001eNmCf\u0012E=Fz\u0018^x^a\u001a";
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
                        i3 = 43;
                        break;
                    case ay.n /*2*/:
                        i3 = 29;
                        break;
                    case ay.p /*3*/:
                        i3 = 55;
                        break;
                    default:
                        i3 = 15;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\fYBR}\u000fDo\u0017:M\u001b=X\u007f]BsAn\u0011By\u0017k\u000fDmGf\u0013L'\u0017";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\bExO\u007f\u0018HiRk]YxCz\u000fE=T`\u0019N'\u0017";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "]Dm\r/";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\fYBR}\u000fDo\u0017:M\u001b=Fz\u0018^x^a\u001a\u0011=";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\fYBRw\u001eNmCf\u0012E'\u0017";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(Exception exception) {
        Log.b(z[1] + this.a.toString(), (Throwable) exception);
        if (((exception instanceof SocketException) || (exception instanceof EOFException)) && this.a.b()) {
            Log.e(z[0]);
            a12.b.add(this.a);
        }
    }

    public void a(int i) {
        int i2 = App.az;
        if (i >= 500) {
            if (this.a.b()) {
                Log.e(z[5] + this.a.toString());
                a12.b.add(this.a);
                if (i2 == 0) {
                    return;
                }
            }
            Log.e(z[2] + this.a.toString());
            if (i2 == 0) {
                return;
            }
        }
        if (i >= 400) {
            a12.l();
            if (i2 == 0) {
                return;
            }
        }
        Log.e(z[3] + i + z[4] + this.a.toString());
    }

    public a15(ag agVar) {
        agVar.a(a12.k);
        this.a = agVar;
    }
}
