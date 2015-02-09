package com.whatsapp;

import com.whatsapp.protocol.bj;
import com.whatsapp.protocol.m;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ag;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class pn implements Runnable {
    private static final String[] z;
    final bj a;
    final int b;
    final jg c;
    final m d;
    final int e;

    static {
        String[] strArr = new String[6];
        String str = "\u0003br\u0006\u001e\u0016v=\u001d\u0018\u000ev=\u001d\u0010\u000bn=\u001e\u001eBix\u0004\u0015B";
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
                        i3 = 98;
                        break;
                    case ay.f /*1*/:
                        i3 = 26;
                        break;
                    case ay.n /*2*/:
                        i3 = 29;
                        break;
                    case ay.p /*3*/:
                        i3 = 106;
                        break;
                    default:
                        i3 = 113;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "B~h\u000fQ\u0016u=\u0018\u0014\u0016hdJ\u0003\u0007yx\u0003\u0001\u0016:{\u0005\u0003B";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0003br\u0006\u001e\u0016v=\u000e\u0014\u000e\u007fi\u0003\u001f\u0005:n\u000f\u0002\u0011sr\u0004Q\u0006oxJ\u0005\r:o\u000f\u0016\u000bii\u0018\u0010\u0016sr\u0004Q\u000b~=\t\u0019\u0003tz\u000fQ\u0004uoJ";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "Bos\u001e\u0018\u000e:|J\u001f\u0007m=\u001a\u0003\u0007qx\u0013Q\n{nJ\u0013\u0007\u007fsJ\u0017\u0007n~\u0002\u0014\u0006";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0003br\u0006\u001e\u0016v=\t\u0019\u0007yv\u0003\u001f\u0005:n\u000f\u0002\u0011sr\u0004\u0002B|r\u0018Q";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0003br\u0006\u001e\u0016v=\u001d\u0018\u000ev=\u0018\u0014\u0001uo\u000eQ\u0016rxJ\u0013\u0003ixJ\u001a\u0007c=\u001f\u0002\u0007~=\u001e\u001eBix\u0004\u0015B";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    pn(jg jgVar, bj bjVar, m mVar, int i, int i2) {
        this.c = jgVar;
        this.a = bjVar;
        this.d = mVar;
        this.e = i;
        this.b = i2;
    }

    public void run() {
        long a = f_.a(this.d.c);
        Log.i(z[5] + a + z[2] + this.d);
        if (jg.a(this.c).a6.e(a)) {
            ag d = jg.a(this.c).a6.d(a);
            if (d.a().h() != this.b) {
                Log.i(z[3] + this.d);
                jg.a(this.c).a6.f(a);
                jg.a(this.c).a6.b(a);
                jg.a(this.c).U().post(new z0(this, true));
                return;
            } else if (this.e > 2 && jg.a(this.c).a6.a(a, this.d)) {
                Log.i(z[0] + this.d + z[4]);
                jg.a(this.c).U().post(new z0(this, true));
                return;
            } else if (this.e == 2) {
                Log.i(z[1] + this.d);
                jg.a(this.c).a6.a(this.d, d.a().k());
            }
        }
        jg.a(this.c).U().post(new z0(this, false));
    }
}
