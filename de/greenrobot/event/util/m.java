package de.greenrobot.event.util;

import de.greenrobot.event.g;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class m {
    private static final String z;
    private final Constructor a;
    private final g b;
    private final Object c;
    private final Executor d;

    static {
        char[] toCharArray = ";w-N'\u000fsdG$\u0018x0\u00021\u0011w7Qr\u0010c7Vr\u0015w2Gr\u001c6'M<\u000eb6W1\ty6\u0002%\u0014b,\u0002=\u0013sdR3\u000fw)G&\u0018ddM4]b=R7]B,P=\nw&N7".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 125;
                    break;
                case ay.f /*1*/:
                    i2 = 22;
                    break;
                case ay.n /*2*/:
                    i2 = 68;
                    break;
                case ay.p /*3*/:
                    i2 = 34;
                    break;
                default:
                    i2 = 82;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    static Object c(m mVar) {
        return mVar.c;
    }

    m(Executor executor, g gVar, Class cls, Object obj, c cVar) {
        this(executor, gVar, cls, obj);
    }

    public static m b() {
        return new a(null).a();
    }

    static Constructor b(m mVar) {
        return mVar.a;
    }

    public static a a() {
        return new a(null);
    }

    static g a(m mVar) {
        return mVar.b;
    }

    private m(Executor executor, g gVar, Class cls, Object obj) {
        this.d = executor;
        this.b = gVar;
        this.c = obj;
        try {
            this.a = cls.getConstructor(new Class[]{Throwable.class});
        } catch (Throwable e) {
            throw new RuntimeException(z, e);
        }
    }

    public void a(g gVar) {
        this.d.execute(new c(this, gVar));
    }
}
