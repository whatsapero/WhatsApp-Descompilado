package de.greenrobot.event;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class c implements Runnable {
    private static final String z;
    private final a a;
    private final g b;

    static {
        char[] toCharArray = "k\bWz|K\u0003\u001ed~\u0005\u0017\u0018ym\u0005\u0006\u0001kpI\u0006\u0015f|".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 37;
                    break;
                case ay.f /*1*/:
                    i2 = 103;
                    break;
                case ay.n /*2*/:
                    i2 = 119;
                    break;
                case ay.p /*3*/:
                    i2 = 10;
                    break;
                default:
                    i2 = 25;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(h hVar, Object obj) {
        this.a.a(i.a(hVar, obj));
        this.b.a().execute(this);
    }

    c(g gVar) {
        this.b = gVar;
        this.a = new a();
    }

    public void run() {
        i a = this.a.a();
        if (a == null) {
            try {
                throw new IllegalStateException(z);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        this.b.a(a);
    }
}
